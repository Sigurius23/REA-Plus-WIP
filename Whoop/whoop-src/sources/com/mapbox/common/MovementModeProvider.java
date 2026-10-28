package com.mapbox.common;

/* JADX INFO: loaded from: classes.dex */
public enum MovementModeProvider {
    SYSTEM("System"),
    SDK("SDK"),
    UNKNOWN("Unknown");

    private String str;

    MovementModeProvider(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
