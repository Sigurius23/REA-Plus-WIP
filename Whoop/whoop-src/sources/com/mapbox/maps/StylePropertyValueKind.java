package com.mapbox.maps;

/* JADX INFO: loaded from: classes.dex */
public enum StylePropertyValueKind {
    UNDEFINED,
    CONSTANT,
    EXPRESSION,
    TRANSITION;

    private int getValue() {
        return ordinal();
    }
}
