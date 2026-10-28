package gl;

import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import p586wk.InterfaceC37327e;

/* JADX INFO: renamed from: gl.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C15941f extends AbstractC15939d {

    /* JADX INFO: renamed from: b */
    public static final byte[] f60349b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC37327e.f159589a);

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        messageDigest.update(f60349b);
    }

    @Override // gl.AbstractC15939d
    /* JADX INFO: renamed from: c */
    public final Bitmap mo44998c(InterfaceC0955b interfaceC0955b, Bitmap bitmap, int i13, int i14) {
        float width;
        float height;
        Paint paint = AbstractC15958w.f60389a;
        if (bitmap.getWidth() == i13 && bitmap.getHeight() == i14) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i14 > bitmap.getHeight() * i13) {
            width = i14 / bitmap.getHeight();
            width2 = (i13 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i13 / bitmap.getWidth();
            height = (i14 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo2434o = interfaceC0955b.mo2434o(i13, i14, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo2434o.setHasAlpha(bitmap.hasAlpha());
        AbstractC15958w.m45023a(bitmap, bitmapMo2434o, matrix);
        return bitmapMo2434o;
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        return obj instanceof C15941f;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        return -599754482;
    }
}
