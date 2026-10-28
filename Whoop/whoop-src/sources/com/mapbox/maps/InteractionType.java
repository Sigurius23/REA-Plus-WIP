package com.mapbox.maps;

/* JADX INFO: loaded from: classes.dex */
public enum InteractionType {
    CLICK,
    LONG_CLICK,
    DRAG;

    private int getValue() {
        return ordinal();
    }
}
