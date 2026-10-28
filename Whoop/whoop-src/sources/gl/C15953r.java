package gl;

import al.InterfaceC0955b;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import p586wk.InterfaceC37327e;

/* JADX INFO: renamed from: gl.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C15953r extends AbstractC15939d {

    /* JADX INFO: renamed from: b */
    public static final byte[] f60376b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC37327e.f159589a);

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        messageDigest.update(f60376b);
    }

    @Override // gl.AbstractC15939d
    /* JADX INFO: renamed from: c */
    public final Bitmap mo44998c(InterfaceC0955b interfaceC0955b, Bitmap bitmap, int i13, int i14) {
        return AbstractC15958w.m45024b(interfaceC0955b, bitmap, i13, i14);
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        return obj instanceof C15953r;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        return 1572326941;
    }
}
