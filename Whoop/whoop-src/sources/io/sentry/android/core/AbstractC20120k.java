package io.sentry.android.core;

import io.sentry.EnumC20436n5;

/* JADX INFO: renamed from: io.sentry.android.core.k */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20120k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f75589a;

    static {
        int[] iArr = new int[EnumC20436n5.values().length];
        f75589a = iArr;
        try {
            iArr[EnumC20436n5.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f75589a[EnumC20436n5.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f75589a[EnumC20436n5.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f75589a[EnumC20436n5.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f75589a[EnumC20436n5.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
