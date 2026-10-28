package com.mapbox.maps;

/* JADX INFO: loaded from: classes.dex */
public enum RequestLoadingMethodType {
    NETWORK("Network"),
    CACHE("Cache");

    private String str;

    RequestLoadingMethodType(String str) {
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
