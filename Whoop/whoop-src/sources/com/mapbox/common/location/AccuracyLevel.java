package com.mapbox.common.location;

/* JADX INFO: loaded from: classes.dex */
public enum AccuracyLevel {
    PASSIVE,
    LOW,
    MEDIUM,
    HIGH,
    HIGHEST;

    private int getValue() {
        return ordinal();
    }
}
