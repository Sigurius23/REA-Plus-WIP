package p401pj;

import com.amplitude.android.engagement.types.PinPointerType;

/* JADX INFO: renamed from: pj.z */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC29292z {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f118542a;

    static {
        int[] iArr = new int[PinPointerType.values().length];
        try {
            iArr[PinPointerType.ARROW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinPointerType.BEACON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f118542a = iArr;
    }
}
