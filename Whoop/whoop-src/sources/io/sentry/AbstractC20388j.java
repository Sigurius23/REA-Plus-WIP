package io.sentry;

/* JADX INFO: renamed from: io.sentry.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC20388j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f76441a;

    static {
        int[] iArr = new int[EnumC20341g4.values().length];
        f76441a = iArr;
        try {
            iArr[EnumC20341g4.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f76441a[EnumC20341g4.ISOLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f76441a[EnumC20341g4.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f76441a[EnumC20341g4.COMBINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
