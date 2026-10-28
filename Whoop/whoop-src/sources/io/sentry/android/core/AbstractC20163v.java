package io.sentry.android.core;

import io.sentry.EnumC20431n0;

/* JADX INFO: renamed from: io.sentry.android.core.v */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC20163v {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f75759a;

    static {
        int[] iArr = new int[EnumC20431n0.values().length];
        f75759a = iArr;
        try {
            iArr[EnumC20431n0.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f75759a[EnumC20431n0.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f75759a[EnumC20431n0.NO_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
