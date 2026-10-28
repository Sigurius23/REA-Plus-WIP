package p401pj;

import com.amplitude.android.engagement.types.TooltipPointerType;
import com.amplitude.android.engagement.types.TooltipPosition;

/* JADX INFO: renamed from: pj.h0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC29272h0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f118461a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f118462b;

    static {
        int[] iArr = new int[TooltipPosition.values().length];
        try {
            iArr[TooltipPosition.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TooltipPosition.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f118461a = iArr;
        int[] iArr2 = new int[TooltipPointerType.values().length];
        try {
            iArr2[TooltipPointerType.ARROW.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f118462b = iArr2;
    }
}
