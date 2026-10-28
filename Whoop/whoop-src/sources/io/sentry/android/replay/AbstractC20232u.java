package io.sentry.android.replay;

import io.sentry.EnumC20393j4;

/* JADX INFO: renamed from: io.sentry.android.replay.u */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20232u {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f76010a;

    static {
        int[] iArr = new int[EnumC20393j4.values().length];
        try {
            iArr[EnumC20393j4.CANVAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC20393j4.PIXEL_COPY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f76010a = iArr;
    }
}
