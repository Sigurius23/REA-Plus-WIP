package io.sentry;

/* JADX INFO: renamed from: io.sentry.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20345h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f76368a;

    static {
        int[] iArr = new int[EnumC20341g4.values().length];
        f76368a = iArr;
        try {
            iArr[EnumC20341g4.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f76368a[EnumC20341g4.ISOLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f76368a[EnumC20341g4.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
