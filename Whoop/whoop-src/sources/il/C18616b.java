package il;

import al.C0960g;
import al.InterfaceC0955b;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.google.crypto.tink.internal.C5101l0;
import p283kl.C22553b;
import p283kl.C22555d;
import p283kl.C22558g;
import p684zk.InterfaceC40797v;
import p684zk.InterfaceC40801z;
import pf.AbstractC29125c;
import uk.C35046e;

/* JADX INFO: renamed from: il.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C18616b implements InterfaceC40801z, InterfaceC40797v {

    /* JADX INFO: renamed from: w */
    public final Drawable f72795w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f72796x;

    public C18616b(int i13, Drawable drawable) {
        this.f72796x = i13;
        AbstractC29125c.m88539p(drawable, "Argument must not be null");
        this.f72795w = drawable;
    }

    /* JADX INFO: renamed from: b */
    public static C18616b m53886b(Drawable drawable) {
        if (drawable != null) {
            return new C18616b(0, drawable);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final void m53887d() {
    }

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: a */
    public final void mo44996a() {
        switch (this.f72796x) {
            case 0:
                break;
            default:
                C22553b c22553b = (C22553b) this.f72795w;
                c22553b.stop();
                c22553b.f88729z = true;
                C22558g c22558g = (C22558g) c22553b.f88726w.f7566b;
                ComponentCallbacks2C4966h componentCallbacks2C4966h = c22558g.f88740d;
                c22558g.f88739c.clear();
                Bitmap bitmap = c22558g.f88748l;
                if (bitmap != null) {
                    c22558g.f88741e.mo2433h(bitmap);
                    c22558g.f88748l = null;
                }
                c22558g.f88742f = false;
                C22555d c22555d = c22558g.f88745i;
                if (c22555d != null) {
                    componentCallbacks2C4966h.m15547k(c22555d);
                    c22558g.f88745i = null;
                }
                C22555d c22555d2 = c22558g.f88747k;
                if (c22555d2 != null) {
                    componentCallbacks2C4966h.m15547k(c22555d2);
                    c22558g.f88747k = null;
                }
                C22555d c22555d3 = c22558g.f88749m;
                if (c22555d3 != null) {
                    componentCallbacks2C4966h.m15547k(c22555d3);
                    c22558g.f88749m = null;
                }
                C35046e c35046e = c22558g.f88737a;
                C5101l0 c5101l0 = c35046e.f148519c;
                c35046e.f148528l = null;
                byte[] bArr = c35046e.f148525i;
                if (bArr != null) {
                    ((C0960g) c5101l0.f21444y).m2448g(bArr);
                }
                int[] iArr = c35046e.f148526j;
                if (iArr != null) {
                    ((C0960g) c5101l0.f21444y).m2448g(iArr);
                }
                Bitmap bitmap2 = c35046e.f148529m;
                if (bitmap2 != null) {
                    ((InterfaceC0955b) c5101l0.f21443x).mo2433h(bitmap2);
                }
                c35046e.f148529m = null;
                c35046e.f148520d = null;
                c35046e.f148535s = null;
                byte[] bArr2 = c35046e.f148521e;
                if (bArr2 != null) {
                    ((C0960g) c5101l0.f21444y).m2448g(bArr2);
                }
                c22558g.f88746j = true;
                break;
        }
    }

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: c */
    public final Class mo44997c() {
        switch (this.f72796x) {
            case 0:
                return this.f72795w.getClass();
            default:
                return C22553b.class;
        }
    }

    @Override // p684zk.InterfaceC40801z
    public final Object get() {
        Drawable drawable = this.f72795w;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // p684zk.InterfaceC40801z
    public final int getSize() {
        switch (this.f72796x) {
            case 0:
                Drawable drawable = this.f72795w;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                C22558g c22558g = (C22558g) ((C22553b) this.f72795w).f88726w.f7566b;
                C35046e c35046e = c22558g.f88737a;
                return (c35046e.f148526j.length * 4) + c35046e.f148520d.limit() + c35046e.f148525i.length + c22558g.f88750n;
        }
    }

    @Override // p684zk.InterfaceC40797v
    public void initialize() {
        switch (this.f72796x) {
            case 1:
                ((C22558g) ((C22553b) this.f72795w).f88726w.f7566b).m65287c().prepareToDraw();
                break;
            default:
                Drawable drawable = this.f72795w;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C22553b) {
                    ((C22558g) ((C22553b) drawable).f88726w.f7566b).m65287c().prepareToDraw();
                }
                break;
        }
    }
}
