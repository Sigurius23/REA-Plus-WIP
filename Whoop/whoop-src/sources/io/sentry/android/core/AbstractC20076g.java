package io.sentry.android.core;

import io.sentry.EnumC20518r3;

/* JADX INFO: renamed from: io.sentry.android.core.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20076g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f75400a;

    static {
        int[] iArr = new int[EnumC20518r3.values().length];
        f75400a = iArr;
        try {
            iArr[EnumC20518r3.TRACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f75400a[EnumC20518r3.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
