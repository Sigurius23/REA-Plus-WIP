package com.mapbox.common;

/* JADX INFO: loaded from: classes.dex */
public enum SchedulerType {
    PARALLEL,
    SEQUENTIAL;

    private int getValue() {
        return ordinal();
    }
}
