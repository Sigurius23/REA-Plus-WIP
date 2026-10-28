package io.sentry.android.core.internal.gestures;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20088d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f75462a;

    static {
        int[] iArr = new int[EnumC20089e.values().length];
        f75462a = iArr;
        try {
            iArr[EnumC20089e.Click.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f75462a[EnumC20089e.Scroll.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f75462a[EnumC20089e.Swipe.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f75462a[EnumC20089e.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
