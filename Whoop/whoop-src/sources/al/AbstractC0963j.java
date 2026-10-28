package al;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: al.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC0963j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3562a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f3562a = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3562a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3562a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3562a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
