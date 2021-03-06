package com.form.lang.psi;

import com.form.idea.FormLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class FormTokenType extends IElementType {
    public FormTokenType(@NotNull @NonNls String debugName) {
        super(debugName, FormLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "FormTokenType." + super.toString();
    }
}
