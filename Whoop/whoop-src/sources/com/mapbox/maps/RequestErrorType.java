package com.mapbox.maps;

import y82.EnumC39339b;

/* JADX INFO: loaded from: classes.dex */
public enum RequestErrorType {
    SUCCESS(EnumC39339b.RESULT_SUCCESS),
    NOT_FOUND("NotFound"),
    SERVER("Server"),
    CONNECTION("Connection"),
    RATE_LIMIT("RateLimit"),
    IN_OFFLINE_MODE("InOfflineMode"),
    OTHER("Other");

    private String str;

    RequestErrorType(String str) {
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
