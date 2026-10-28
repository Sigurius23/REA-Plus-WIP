package gi;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import bc3.C3033m;
import ge3.AbstractC15751g;
import p461rh.C31430s;
import r83.EnumC31071a;

/* JADX INFO: renamed from: gi.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C15875f implements InterfaceC15879j {

    /* JADX INFO: renamed from: b */
    public final ImageView f59983b;

    public C15875f(ImageView imageView) {
        this.f59983b = imageView;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC15872c m44781b(int i13, int i14, int i15) {
        if (i13 == -2) {
            return C15871b.f59979a;
        }
        int i16 = i13 - i15;
        if (i16 > 0) {
            if (i16 > 0) {
                return new C15870a(i16);
            }
            throw new IllegalArgumentException("px must be > 0.");
        }
        int i17 = i14 - i15;
        if (i17 <= 0) {
            return null;
        }
        if (i17 > 0) {
            return new C15870a(i17);
        }
        throw new IllegalArgumentException("px must be > 0.");
    }

    @Override // gi.InterfaceC15879j
    /* JADX INFO: renamed from: a */
    public final Object mo44780a(C31430s c31430s) {
        C15878i c15878iM44782c = m44782c();
        if (c15878iM44782c != null) {
            return c15878iM44782c;
        }
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c31430s));
        c3033m.m8774s();
        ViewTreeObserver viewTreeObserver = this.f59983b.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC15881l viewTreeObserverOnPreDrawListenerC15881l = new ViewTreeObserverOnPreDrawListenerC15881l(this, viewTreeObserver, c3033m);
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC15881l);
        c3033m.m8776u(new C15880k(this, viewTreeObserver, viewTreeObserverOnPreDrawListenerC15881l));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: c */
    public final C15878i m44782c() {
        ImageView imageView = this.f59983b;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        InterfaceC15872c interfaceC15872cM44781b = m44781b(layoutParams != null ? layoutParams.width : -1, imageView.getWidth(), imageView.getPaddingRight() + imageView.getPaddingLeft());
        if (interfaceC15872cM44781b == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        InterfaceC15872c interfaceC15872cM44781b2 = m44781b(layoutParams2 != null ? layoutParams2.height : -1, imageView.getHeight(), imageView.getPaddingBottom() + imageView.getPaddingTop());
        if (interfaceC15872cM44781b2 == null) {
            return null;
        }
        return new C15878i(interfaceC15872cM44781b, interfaceC15872cM44781b2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15875f) && this.f59983b.equals(((C15875f) obj).f59983b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f59983b.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.f59983b + ", subtractPadding=true)";
    }
}
