package io.sentry.util.network;

import io.sentry.vendor.gson.stream.EnumC20612b;

/* JADX INFO: renamed from: io.sentry.util.network.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20594b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f77100a;

    static {
        int[] iArr = new int[EnumC20612b.values().length];
        f77100a = iArr;
        try {
            iArr[EnumC20612b.BEGIN_OBJECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f77100a[EnumC20612b.BEGIN_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f77100a[EnumC20612b.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f77100a[EnumC20612b.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f77100a[EnumC20612b.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f77100a[EnumC20612b.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
