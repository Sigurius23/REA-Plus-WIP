package c23;

import android.widget.ImageView;

/* JADX INFO: renamed from: c23.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3907m {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f15964a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        try {
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ImageView.ScaleType.CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f15964a = iArr;
    }
}
