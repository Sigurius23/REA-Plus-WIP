package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes6.dex */
public final class RecordUtils {
    private RecordUtils() {
    }

    public static String fieldToString(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj instanceof byte[] ? new String((byte[]) obj) : obj.toString();
    }
}
