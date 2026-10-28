package io.sentry.android.replay;

/* JADX INFO: renamed from: io.sentry.android.replay.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20216o {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f75939a;

    static {
        int[] iArr = new int[EnumC20218q.values().length];
        try {
            iArr[EnumC20218q.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC20218q.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC20218q.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC20218q.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC20218q.STOPPED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC20218q.CLOSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f75939a = iArr;
    }
}
