package com.form.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import java.util.Stack;

%%

%class _FormLexer
%implements FlexLexer
%{
    private final Stack<Integer> states = new Stack<>();

    private void pushState(int state) {
        states.push(yystate());
        yybegin(state);
    }

    private void popState() {
        Integer state = states.pop();
        yybegin(state);
    }
%}

%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%state STRING
%state DIRECTIVE
%state MACRO_REFERENCE

DIGIT=[0-9]

LINE_COMMENT="*"[^\n]*
WHITE_SPACE_CHAR=[\ \n\t\f]

LETTER = [:letter:]|_
IDENTIFIER_PART=[:digit:]|{LETTER}

PLAIN_IDENTIFIER={LETTER} {IDENTIFIER_PART}*
ESCAPED_IDENTIFIER=\[[^\[\n]+\]
IDENTIFIER={PLAIN_IDENTIFIER}|{ESCAPED_IDENTIFIER}

INTEGER_LITERAL={DECIMAL_INTEGER_LITERAL}
DECIMAL_INTEGER_LITERAL=(0|([1-9]({DIGIT})*))

REGULAR_STRING_PART=[^\"`\n]+

DIRECTIVE_CONTENT=([^\n])*

%%

<DIRECTIVE> {DIRECTIVE_CONTENT} {return FormTokens.DIRECTIVE_CONTENT; }
<DIRECTIVE> ({WHITE_SPACE_CHAR})+ { popState(); return FormTokens.WHITE_SPACE; }

<STRING, YYINITIAL, MACRO_REFERENCE> "`" { pushState(MACRO_REFERENCE); return FormTokens.BACKQUOTE; }
<MACRO_REFERENCE> "'"   { popState(); return FormTokens.QUOTE; }
<YYINITIAL> "'" { return FormTokens.QUOTE; }

<STRING> {REGULAR_STRING_PART}  { return FormTokens.REGULAR_STRING_PART; }
<STRING> \"  { popState(); return FormTokens.CLOSING_QUOTE; }
<YYINITIAL> \" { pushState(STRING); return FormTokens.OPENING_QUOTE; }

({WHITE_SPACE_CHAR})+ { return FormTokens.WHITE_SPACE; }
^{LINE_COMMENT} { return FormTokens.LINE_COMMENT; }

"Symbols" { return FormTokens.SYMBOLS_KEYWORD; }
"Vectors" { return FormTokens.VECTORS_KEYWORD; }
"Indices" { return FormTokens.INDICES_KEYWORD; }
"Functions" { return FormTokens.FUNCTIONS_KEYWORD; }
"CFunctions" { return FormTokens.CFUNCTIONS_KEYWORD; }
"Tensors" { return FormTokens.TENSORS_KEYWORD; }
"CTensors" { return FormTokens.CTENSORS_KEYWORD; }
"NTensors" { return FormTokens.NTENSORS_KEYWORD; }
"Set" { return FormTokens.SET_KEYWORD; }

"if" { return FormTokens.IF_KEYWORD; }
"elseif" { return FormTokens.ELSEIF_KEYWORD; }
"else" { return FormTokens.ELSE_KEYWORD; }
"endif" { return FormTokens.ENDIF_KEYWORD; }

"#add" { return FormTokens.ADD_DIRECTIVE; }
"#addseparator" { return FormTokens.ADDSEPARATOR_DIRECTIVE; }
"#append" { return FormTokens.APPEND_DIRECTIVE; }
"#break" { return FormTokens.BREAK_DIRECTIVE; }
"#breakdo" { return FormTokens.BREAKDO_DIRECTIVE; }
"#call" { return FormTokens.CALL_DIRECTIVE; }
"#case" { return FormTokens.CASE_DIRECTIVE; }
"#clearoptimize" { return FormTokens.CLEAROPTIMIZE_DIRECTIVE; }
"#close" { return FormTokens.CLOSE_DIRECTIVE; }
"#closedictionary" { return FormTokens.CLOSEDICTIONARY_DIRECTIVE; }
"#commentchar" { return FormTokens.COMMENTCHAR_DIRECTIVE; }
"#create" { return FormTokens.CREATE_DIRECTIVE; }
"#default" { return FormTokens.DEFAULT_DIRECTIVE; }
"#define" { pushState(DIRECTIVE); return FormTokens.DEFINE_DIRECTIVE; }
"#do" { return FormTokens.DO_DIRECTIVE; }
"#else" { pushState(DIRECTIVE); return FormTokens.ELSE_DIRECTIVE; }
"#elseif" { return FormTokens.ELSEIF_DIRECTIVE; }
"#enddo" { return FormTokens.ENDDO_DIRECTIVE; }
"#endif" { pushState(DIRECTIVE); return FormTokens.ENDIF_DIRECTIVE; }
"#endinside" { return FormTokens.ENDINSIDE_DIRECTIVE; }
"#endprocedure" { return FormTokens.ENDPROCEDURE_DIRECTIVE; }
"#endswitch" { return FormTokens.ENDSWITCH_DIRECTIVE; }
"#exchange" { return FormTokens.EXCHANGE_DIRECTIVE; }
"#external" { return FormTokens.EXTERNAL_DIRECTIVE; }
"#factdollar" { return FormTokens.FACTDOLLAR_DIRECTIVE; }
"#fromexternal" { return FormTokens.FROMEXTERNAL_DIRECTIVE; }
"#if" { return FormTokens.IF_DIRECTIVE; }
"#ifdef" { pushState(DIRECTIVE); return FormTokens.IFDEF_DIRECTIVE; }
"#ifndef" { pushState(DIRECTIVE); return FormTokens.IFNDEF_DIRECTIVE; }
"#include" { return FormTokens.INCLUDE_DIRECTIVE; }
"#inside" { return FormTokens.INSIDE_DIRECTIVE; }
"#message" { return FormTokens.MESSAGE_DIRECTIVE; }
"#opendictionary" { return FormTokens.OPENDICTIONARY_DIRECTIVE; }
"#optimize" { return FormTokens.OPTIMIZE_DIRECTIVE; }
"#pipe" { return FormTokens.PIPE_DIRECTIVE; }
"#preout" { return FormTokens.PREOUT_DIRECTIVE; }
"#printtimes" { return FormTokens.PRINTTIMES_DIRECTIVE; }
"#procedure" { return FormTokens.PROCEDURE_DIRECTIVE; }
"#procedureextension" { return FormTokens.PROCEDUREEXTENSION_DIRECTIVE; }
"#prompt" { return FormTokens.PROMPT_DIRECTIVE; }
"#redefine" { pushState(DIRECTIVE); return FormTokens.REDEFINE_DIRECTIVE; }
"#remove" { return FormTokens.REMOVE_DIRECTIVE; }
"#reset" { return FormTokens.RESET_DIRECTIVE; }
"#reverseinclude" { return FormTokens.REVERSEINCLUDE_DIRECTIVE; }
"#rmexternal" { return FormTokens.RMEXTERNAL_DIRECTIVE; }
"#rmseparator" { return FormTokens.RMSEPARATOR_DIRECTIVE; }
"#setexternal" { return FormTokens.SETEXTERNAL_DIRECTIVE; }
"#setexternalattr" { return FormTokens.SETEXTERNALATTR_DIRECTIVE; }
"#setrandom" { return FormTokens.SETRANDOM_DIRECTIVE; }
"#show" { return FormTokens.SHOW_DIRECTIVE; }
"#skipextrasymbols" { return FormTokens.SKIPEXTRASYMBOLS_DIRECTIVE; }
"#switch" { return FormTokens.SWITCH_DIRECTIVE; }
"#system" { return FormTokens.SYSTEM_DIRECTIVE; }
"#terminate" { return FormTokens.TERMINATE_DIRECTIVE; }
"#toexternal" { return FormTokens.TOEXTERNAL_DIRECTIVE; }
"#undefine" { pushState(DIRECTIVE); return FormTokens.UNDEFINE_DIRECTIVE; }
"#usedictionary" { return FormTokens.USEDICTIONARY_DIRECTIVE; }
"#write" { return FormTokens.WRITE_DIRECTIVE; }

"Print" { return FormTokens.PRINT_KEYWORD; }
"Local" { return FormTokens.LOCAL_KEYWORD; }
"id" { return FormTokens.ID_KEYWORD; }


".clear"    { return FormTokens.CLEAR_KEYWORD; }
".store"    { return FormTokens.STORE_KEYWORD; }
".global"   { return FormTokens.GLOBAL_KEYWORD; }
".sort"     { return FormTokens.SORT_KEYWORD; }
".end"      { return FormTokens.END_KEYWORD; }

{INTEGER_LITERAL} { return FormTokens.INTEGER_LITERAL; }
{IDENTIFIER} { return FormTokens.IDENTIFIER; }

"("          { return FormTokens.LPAR      ; }
")"          { return FormTokens.RPAR      ; }
"["          { return FormTokens.LBRACKET  ; }
"]"          { return FormTokens.RBRACKET  ; }
"*"          { return FormTokens.MUL       ; }
"+"          { return FormTokens.PLUS      ; }
"-"          { return FormTokens.MINUS     ; }
"/"          { return FormTokens.DIV       ; }
"^"          { return FormTokens.POWER     ; }
"="          { return FormTokens.EQ        ; }
"=="         { return FormTokens.EQEQ      ; }
","          { return FormTokens.COMMA     ; }
";"          { return FormTokens.SEMICOLON ; }
"?"          { return FormTokens.QUEST     ; }
"~"          { return FormTokens.TYLDA     ; }

<YYINITIAL, DIRECTIVE, STRING, MACRO_REFERENCE> . { return TokenType.BAD_CHARACTER; }