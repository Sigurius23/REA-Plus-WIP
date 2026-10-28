package com.mapbox.maps;

/* JADX INFO: loaded from: classes.dex */
public enum ConstrainMode {
    NONE,
    HEIGHT_ONLY,
    WIDTH_AND_HEIGHT;

    private int getValue() {
        return ordinal();
    }
}
