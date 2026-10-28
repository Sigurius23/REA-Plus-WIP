package com.google.gson.internal;

/* JADX INFO: renamed from: com.google.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    @Deprecated
    public static <T> T checkNotNull(T t14) {
        t14.getClass();
        return t14;
    }
}
