package com.mapbox.common;

/* JADX INFO: loaded from: classes.dex */
public enum NetworkRestriction {
    NONE(0),
    DISALLOW_EXPENSIVE(1),
    DISALLOW_ALL(255);

    public final int value;

    NetworkRestriction(int i13) {
        this.value = i13;
    }

    private int getValue() {
        return this.value;
    }
}
