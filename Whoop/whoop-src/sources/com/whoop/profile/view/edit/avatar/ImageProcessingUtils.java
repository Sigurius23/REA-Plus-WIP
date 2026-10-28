package com.whoop.profile.view.edit.avatar;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b¨\u0006\r"}, m65681d2 = {"Lcom/whoop/profile/view/edit/avatar/ImageProcessingUtils;", "", "<init>", "()V", "resizeBitmap", "Landroid/graphics/Bitmap;", "bitmap", "maxWidth", "", "maxHeight", "bitmapToByteArray", "", "quality", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ImageProcessingUtils {
    public static final int $stable = 0;
    public static final ImageProcessingUtils INSTANCE = new ImageProcessingUtils();

    private ImageProcessingUtils() {
    }

    public final byte[] bitmapToByteArray(Bitmap bitmap, int quality) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC22676k.m65749i(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final Bitmap resizeBitmap(Bitmap bitmap, int maxWidth, int maxHeight) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        float width = bitmap.getWidth() / bitmap.getHeight();
        if (width > 1.0f) {
            maxHeight = (int) (maxWidth / width);
        } else {
            maxWidth = (int) (maxHeight * width);
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, maxWidth, maxHeight, true);
        AbstractC22676k.m65749i(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap;
    }
}
