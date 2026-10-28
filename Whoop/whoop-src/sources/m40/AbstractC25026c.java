package m40;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: m40.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC25026c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f98040a;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        try {
            iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f98040a = iArr;
    }
}
