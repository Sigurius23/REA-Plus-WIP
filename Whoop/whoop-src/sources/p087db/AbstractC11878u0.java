package p087db;

import android.text.Layout;

/* JADX INFO: renamed from: db.u0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC11878u0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f38763a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        f38763a = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f38763a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f38763a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
