package p370oj;

import com.amplitude.android.engagement.types.DebugStatus;

/* JADX INFO: renamed from: oj.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC27970q {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f112800a;

    static {
        int[] iArr = new int[DebugStatus.values().length];
        try {
            iArr[DebugStatus.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DebugStatus.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f112800a = iArr;
    }
}
