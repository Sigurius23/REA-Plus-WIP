package live.hms.video.media.capturers.camera.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m65681d2 = {"Llive/hms/video/media/capturers/camera/utils/BitMatrix;", "", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "matrix", "Landroid/graphics/Matrix;", "flipHorizontally", "flipVertically", "rotate", "degrees", "", "build", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class BitMatrix {
    private final Bitmap bitmap;
    private final Matrix matrix;

    public BitMatrix(Bitmap bitmap) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        this.bitmap = bitmap;
        this.matrix = new Matrix();
    }

    public final Bitmap build() {
        Bitmap bitmap = this.bitmap;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.bitmap.getHeight(), this.matrix, true);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public final Matrix flipHorizontally() {
        Bitmap bitmap = this.bitmap;
        Matrix matrix = this.matrix;
        matrix.postScale(-1.0f, 1.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return matrix;
    }

    public final Matrix flipVertically() {
        Bitmap bitmap = this.bitmap;
        Matrix matrix = this.matrix;
        matrix.postScale(1.0f, -1.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return matrix;
    }

    public final Matrix rotate(float degrees) {
        Matrix matrix = this.matrix;
        matrix.postRotate(degrees);
        return matrix;
    }
}
