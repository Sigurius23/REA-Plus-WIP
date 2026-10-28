package jo;

import android.text.Layout;

/* JADX INFO: renamed from: jo.b0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC21812b0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f84071a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        f84071a = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f84071a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f84071a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
