package p370oj;

import com.amplitude.android.engagement.types.DebugStatus;

/* JADX INFO: renamed from: oj.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC27967n {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f112790a;

    static {
        int[] iArr = new int[DebugStatus.values().length];
        try {
            iArr[DebugStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DebugStatus.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DebugStatus.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DebugStatus.INFO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f112790a = iArr;
    }
}
