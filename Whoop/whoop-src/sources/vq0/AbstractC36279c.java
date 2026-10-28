package vq0;

import android.graphics.Bitmap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vq0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroid/graphics/Bitmap;", "image", "a", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "", "b", "(Landroid/graphics/Bitmap;)I", "community_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36279c {
    /* JADX INFO: renamed from: a */
    public static final Bitmap m115966a(Bitmap image) {
        AbstractC22676k.m65750j(image, "image");
        int width = image.getWidth();
        int height = image.getHeight();
        if (image.getByteCount() <= 1048576) {
            return image;
        }
        int iM115967b = m115967b(image);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(image, width / iM115967b, height / iM115967b, false);
        AbstractC22676k.m65749i(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }

    /* JADX INFO: renamed from: b */
    private static final int m115967b(Bitmap bitmap) {
        int byteCount = bitmap.getByteCount();
        return (1048577 > byteCount || byteCount >= 5242881) ? 10 : 5;
    }
}
