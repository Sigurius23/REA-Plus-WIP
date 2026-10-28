package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5128c {

    /* JADX INFO: renamed from: a */
    public static final Class f21484a;

    /* JADX INFO: renamed from: b */
    public static final boolean f21485b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f21484a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f21485b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16150a() {
        return (f21484a == null || f21485b) ? false : true;
    }
}
