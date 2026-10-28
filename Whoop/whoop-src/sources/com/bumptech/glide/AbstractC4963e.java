package com.bumptech.glide;

import android.widget.ImageView;

/* JADX INFO: renamed from: com.bumptech.glide.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC4963e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f20314a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f20315b;

    static {
        int[] iArr = new int[EnumC4962d.values().length];
        f20315b = iArr;
        try {
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20315b[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20315b[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20315b[0] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        f20314a = iArr2;
        try {
            iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20314a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f20314a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f20314a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f20314a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f20314a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f20314a[ImageView.ScaleType.CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f20314a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
