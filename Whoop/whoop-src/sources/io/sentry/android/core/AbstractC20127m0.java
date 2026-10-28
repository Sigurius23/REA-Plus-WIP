package io.sentry.android.core;

import io.sentry.EnumC20431n0;

/* JADX INFO: renamed from: io.sentry.android.core.m0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20127m0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f75611a;

    static {
        int[] iArr = new int[EnumC20431n0.values().length];
        f75611a = iArr;
        try {
            iArr[EnumC20431n0.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f75611a[EnumC20431n0.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
