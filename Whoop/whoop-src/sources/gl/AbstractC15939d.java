package gl;

import al.InterfaceC0955b;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import p319m4.AbstractC25012a;
import p586wk.InterfaceC37334l;
import p684zk.InterfaceC40801z;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: gl.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC15939d implements InterfaceC37334l {
    @Override // p586wk.InterfaceC37334l
    /* JADX INFO: renamed from: b */
    public final InterfaceC40801z mo41591b(Context context, InterfaceC40801z interfaceC40801z, int i13, int i14) {
        if (!AbstractC33913l.m107273h(i13, i14)) {
            throw new IllegalArgumentException(AbstractC25012a.m73372e(i13, i14, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        InterfaceC0955b interfaceC0955b = ComponentCallbacks2C4960b.m15527c(context).f20298x;
        Bitmap bitmap = (Bitmap) interfaceC40801z.get();
        if (i13 == Integer.MIN_VALUE) {
            i13 = bitmap.getWidth();
        }
        if (i14 == Integer.MIN_VALUE) {
            i14 = bitmap.getHeight();
        }
        Bitmap bitmapMo44998c = mo44998c(interfaceC0955b, bitmap, i13, i14);
        return bitmap.equals(bitmapMo44998c) ? interfaceC40801z : C15938c.m44994b(interfaceC0955b, bitmapMo44998c);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo44998c(InterfaceC0955b interfaceC0955b, Bitmap bitmap, int i13, int i14);
}
