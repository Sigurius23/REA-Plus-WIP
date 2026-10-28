package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    UNKNOWN(false);


    /* JADX INFO: renamed from: w */
    public final boolean f20339w;

    ImageHeaderParser$ImageType(boolean z4) {
        this.f20339w = z4;
    }

    public boolean hasAlpha() {
        return this.f20339w;
    }
}
