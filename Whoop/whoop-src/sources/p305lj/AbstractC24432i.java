package p305lj;

import com.amplitude.android.engagement.types.DebugStatus;

/* JADX INFO: renamed from: lj.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC24432i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f95321a;

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
            iArr[DebugStatus.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DebugStatus.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f95321a = iArr;
    }
}
