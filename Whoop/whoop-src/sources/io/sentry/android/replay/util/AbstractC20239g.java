package io.sentry.android.replay.util;

/* JADX INFO: renamed from: io.sentry.android.replay.util.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20239g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f76026a;

    static {
        int[] iArr = new int[EnumC20238f.values().length];
        try {
            iArr[EnumC20238f.SOC_MODEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC20238f.SOC_MANUFACTURER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f76026a = iArr;
    }
}
