package com.form.lang.preprocessor;

import gnu.trove.THashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Stack;

public class FormInclusionContext {
    @NotNull
    private final Map<String, Stack<FormMacroSymbol>> mySubstitutions = new THashMap<>();

    protected FormInclusionContext() {
    }

    @NotNull
    public static FormInclusionContext empty() {
        return new FormInclusionContext();
    }

    public void define(FormMacroSymbol def) {
        final String name = def.getName();
        if (!mySubstitutions.containsKey(name)) {
            mySubstitutions.put(name, new Stack<>());
        }
        mySubstitutions.get(name).push(def);
    }

    public void redefine(@NotNull FormMacroSymbol def) {
        String name = def.getName();
        if (!mySubstitutions.containsKey(name)) mySubstitutions.put(name, new Stack<>());
        if (!mySubstitutions.get(name).isEmpty()) mySubstitutions.get(name).pop();
        mySubstitutions.get(name).push(def);
    }

    public void undef(@Nullable String name) {
        if (isUndefined(name)) return;
        mySubstitutions.get(name).pop();
    }

    @Nullable
    public FormMacroSymbol getDefinition(@Nullable String name) {
        if (isUndefined(name)) return null;
        return mySubstitutions.get(name).peek();
    }

    public boolean isUndefined(@Nullable String name) {
        return !isDefined(name);
    }

    public boolean isDefined(@Nullable String name) {
        return name != null && mySubstitutions.containsKey(name) && !mySubstitutions.get(name).isEmpty();
    }

}
