package gl;

import al.InterfaceC0955b;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p684zk.InterfaceC40797v;
import p684zk.InterfaceC40801z;
import pf.AbstractC29125c;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: gl.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C15938c implements InterfaceC40801z, InterfaceC40797v {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60344w = 0;

    /* JADX INFO: renamed from: x */
    public final Object f60345x;

    /* JADX INFO: renamed from: y */
    public final Object f60346y;

    public C15938c(InterfaceC0955b interfaceC0955b, Bitmap bitmap) {
        AbstractC29125c.m88539p(bitmap, "Bitmap must not be null");
        this.f60345x = bitmap;
        AbstractC29125c.m88539p(interfaceC0955b, "BitmapPool must not be null");
        this.f60346y = interfaceC0955b;
    }

    /* JADX INFO: renamed from: b */
    public static C15938c m44994b(InterfaceC0955b interfaceC0955b, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C15938c(interfaceC0955b, bitmap);
    }

    /* JADX INFO: renamed from: d */
    public static C15938c m44995d(Resources resources, InterfaceC40801z interfaceC40801z) {
        if (interfaceC40801z == null) {
            return null;
        }
        return new C15938c(resources, interfaceC40801z);
    }

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: a */
    public final void mo44996a() {
        switch (this.f60344w) {
            case 0:
                ((InterfaceC0955b) this.f60346y).mo2433h((Bitmap) this.f60345x);
                break;
            default:
                ((InterfaceC40801z) this.f60346y).mo44996a();
                break;
        }
    }

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: c */
    public final Class mo44997c() {
        switch (this.f60344w) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // p684zk.InterfaceC40801z
    public final Object get() {
        switch (this.f60344w) {
            case 0:
                return (Bitmap) this.f60345x;
            default:
                return new BitmapDrawable((Resources) this.f60345x, (Bitmap) ((InterfaceC40801z) this.f60346y).get());
        }
    }

    @Override // p684zk.InterfaceC40801z
    public final int getSize() {
        switch (this.f60344w) {
            case 0:
                return AbstractC33913l.m107268c((Bitmap) this.f60345x);
            default:
                return ((InterfaceC40801z) this.f60346y).getSize();
        }
    }

    @Override // p684zk.InterfaceC40797v
    public final void initialize() {
        switch (this.f60344w) {
            case 0:
                ((Bitmap) this.f60345x).prepareToDraw();
                break;
            default:
                InterfaceC40801z interfaceC40801z = (InterfaceC40801z) this.f60346y;
                if (interfaceC40801z instanceof InterfaceC40797v) {
                    ((InterfaceC40797v) interfaceC40801z).initialize();
                }
                break;
        }
    }

    public C15938c(Resources resources, InterfaceC40801z interfaceC40801z) {
        AbstractC29125c.m88539p(resources, "Argument must not be null");
        this.f60345x = resources;
        AbstractC29125c.m88539p(interfaceC40801z, "Argument must not be null");
        this.f60346y = interfaceC40801z;
    }
}
