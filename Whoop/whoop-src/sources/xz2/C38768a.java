package xz2;

import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import gl.AbstractC15939d;
import gl.C15938c;
import java.security.MessageDigest;

/* JADX INFO: renamed from: xz2.a */
/* JADX INFO: loaded from: classes11.dex */
public class C38768a extends AbstractC15939d {
    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public void mo33605a(MessageDigest messageDigest) {
    }

    @Override // gl.AbstractC15939d
    /* JADX INFO: renamed from: c */
    public Bitmap mo44998c(InterfaceC0955b interfaceC0955b, Bitmap bitmap, int i13, int i14) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapMo2434o = interfaceC0955b.mo2434o(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapMo2434o);
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f, width / 2, height / 2);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return (Bitmap) C15938c.m44994b(interfaceC0955b, bitmapMo2434o).f60345x;
    }
}
