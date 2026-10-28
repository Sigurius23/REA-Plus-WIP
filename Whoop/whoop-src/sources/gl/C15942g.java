package gl;

import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import p586wk.InterfaceC37327e;

/* JADX INFO: renamed from: gl.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C15942g extends AbstractC15939d {

    /* JADX INFO: renamed from: b */
    public static final byte[] f60350b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC37327e.f159589a);

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        messageDigest.update(f60350b);
    }

    @Override // gl.AbstractC15939d
    /* JADX INFO: renamed from: c */
    public final Bitmap mo44998c(InterfaceC0955b interfaceC0955b, Bitmap bitmap, int i13, int i14) {
        Paint paint = AbstractC15958w.f60389a;
        if (bitmap.getWidth() > i13 || bitmap.getHeight() > i14) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC15958w.m45024b(interfaceC0955b, bitmap, i13, i14);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        return obj instanceof C15942g;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        return -670243078;
    }
}
