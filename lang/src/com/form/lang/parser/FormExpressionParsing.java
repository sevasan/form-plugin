package com.form.lang.parser;

import com.form.lang.psi.FormElementType;
import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

import static com.form.lang.lexer.FormTokens.*;
import static com.form.lang.psi.FormElementTypes.*;

public class FormExpressionParsing extends AbstractFormParsing {
    static final TokenSet EXPRESSION_FIRST = TokenSet.create(
            LPAR, // parenthesized

            // literal constant
            INTEGER_LITERAL,

            IDENTIFIER // SimpleName
    );

    public enum Precedence {

        EXPONENTIATION(POWER){
            @Override
            public void parseHigherPrecedence(FormExpressionParsing parser) {
                parser.parseAtomicExpression();
            }
        },
        MULTIPLICATIVE(MUL, DIV) ,
        ADDITIVE(PLUS, MINUS),
        ASSIGNMENT(EQ);

        static {
            Precedence[] values = Precedence.values();
            for (Precedence precedence : values) {
                int ordinal = precedence.ordinal();
                precedence.higher = ordinal > 0 ? values[ordinal - 1] : null;
            }
        }

        private Precedence higher;
        private final TokenSet operations;

        Precedence(IElementType... operations) {
            this.operations = TokenSet.create(operations);
        }

        public void parseHigherPrecedence(FormExpressionParsing parser) {
            assert higher != null;
            parser.parseBinaryExpression(higher);
        }

        /**
         * @param operation the operation sign (e.g. PLUS or IS)
         * @param parser    the parser object
         * @return node type of the result
         */
        public FormElementType parseRightHandSide(IElementType operation, FormExpressionParsing parser) {
            parseHigherPrecedence(parser);
            return BINARY_EXPRESSION;
        }

        @NotNull
        public final TokenSet getOperations() {
            return operations;
        }
    }

    public FormExpressionParsing(PsiBuilder builder) {
        super(builder);
    }

    public void parseExpression() {
        if (!atSet(EXPRESSION_FIRST)) {
            error("Expecting an expression");
            return;
        }
        parseBinaryExpression(Precedence.ASSIGNMENT);
    }

    private void parseAtomicExpression() {
        if (at(LPAR)) {
            parseParenthesizedExpression();
        } else if (at(IDENTIFIER)) {
            parseSimpleNameExpression();
        } else if (!parseLiteralConstant()) {
            error("Expecting an element");
        }
    }

    private void parseParenthesizedExpression() {
        assert _at(LPAR);

        PsiBuilder.Marker mark = mark();

        advance(); // LPAR
        if (at(RPAR)) {
            error("Expecting an expression");
        }
        else {
            parseExpression();
        }

        expect(RPAR, "Expecting ')'");

        mark.done(PARENTHESIZED);
    }

    public void parseSimpleNameExpression() {
        PsiBuilder.Marker simpleName = mark();
        expect(IDENTIFIER, "Expecting an identifier");
        simpleName.done(REFERENCE_EXPRESSION);
    }

    private void parseOperationReference() {
        PsiBuilder.Marker operationReference = mark();
        advance(); // operation
        operationReference.done(OPERATION_REFERENCE);
    }

    public void parseBinaryExpression(Precedence precedence) {
        PsiBuilder.Marker expression = mark();

        precedence.parseHigherPrecedence(this);

        while (!at(SEMICOLON) && atSet(precedence.getOperations())) {
            IElementType operation = tt();

            parseOperationReference();

            FormElementType resultType = precedence.parseRightHandSide(operation, this);
            expression.done(resultType);
            expression = expression.precede();
        }

        expression.drop();
    }

    private boolean parseLiteralConstant() {
        if (at(INTEGER_LITERAL)) {
            parseOneTokenExpression(INTEGER_CONSTANT);
        } else {
            return false;
        }
        return true;
    }

    private void parseOneTokenExpression(FormElementType type) {
        PsiBuilder.Marker mark = mark();
        advance();
        mark.done(type);
    }

}
