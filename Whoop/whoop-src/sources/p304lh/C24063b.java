package p304lh;

import android.graphics.Bitmap;
import androidx.room.AbstractC1772c1;
import c93.InterfaceC4339a;
import l83.EnumC23463i;
import ne3.C26617h0;
import ne3.C26621j0;
import p425qh.AbstractC30358d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import q83.AbstractC30060g;
import ud3.C34807d0;
import ud3.C34817h;
import ud3.C34818h0;
import ud3.C34850x0;
import yb3.AbstractC39414r;
import yb3.C39412p;

/* JADX INFO: renamed from: lh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C24063b {

    /* JADX INFO: renamed from: a */
    public final Object f95087a;

    /* JADX INFO: renamed from: b */
    public final Object f95088b;

    /* JADX INFO: renamed from: c */
    public final long f95089c;

    /* JADX INFO: renamed from: d */
    public final long f95090d;

    /* JADX INFO: renamed from: e */
    public final boolean f95091e;

    /* JADX INFO: renamed from: f */
    public final C34807d0 f95092f;

    public C24063b(C26621j0 c26621j0) {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i13 = 0;
        this.f95087a = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: lh.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C24063b f95086x;

            {
                this.f95086x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = i13;
                C24063b c24063b = this.f95086x;
                switch (i14) {
                    case 0:
                        C34817h c34817h = C34817h.f146574n;
                        return AbstractC30060g.m92093O(c24063b.f95092f);
                    default:
                        String strM109863a = c24063b.f95092f.m109863a("Content-Type");
                        if (strM109863a == null) {
                            return null;
                        }
                        C39412p c39412p = C34818h0.f146589e;
                        return AbstractC1772c1.m5373J(strM109863a);
                }
            }
        });
        final char c3 = 1 == true ? 1 : 0;
        this.f95088b = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: lh.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C24063b f95086x;

            {
                this.f95086x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = c3;
                C24063b c24063b = this.f95086x;
                switch (i14) {
                    case 0:
                        C34817h c34817h = C34817h.f146574n;
                        return AbstractC30060g.m92093O(c24063b.f95092f);
                    default:
                        String strM109863a = c24063b.f95092f.m109863a("Content-Type");
                        if (strM109863a == null) {
                            return null;
                        }
                        C39412p c39412p = C34818h0.f146589e;
                        return AbstractC1772c1.m5373J(strM109863a);
                }
            }
        });
        this.f95089c = Long.parseLong(c26621j0.mo79187M(Long.MAX_VALUE));
        this.f95090d = Long.parseLong(c26621j0.mo79187M(Long.MAX_VALUE));
        this.f95091e = Integer.parseInt(c26621j0.mo79187M(Long.MAX_VALUE)) > 0;
        int i14 = Integer.parseInt(c26621j0.mo79187M(Long.MAX_VALUE));
        C22677k0 c22677k0 = new C22677k0(2, false);
        for (int i15 = 0; i15 < i14; i15++) {
            String strMo79187M = c26621j0.mo79187M(Long.MAX_VALUE);
            Bitmap.Config[] configArr = AbstractC30358d.f124548a;
            int iM125887f0 = AbstractC39414r.m125887f0(strMo79187M, ':', 0, false, 6);
            if (iM125887f0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strMo79187M).toString());
            }
            String strSubstring = strMo79187M.substring(0, iM125887f0);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            String string = AbstractC39414r.m125869O0(strSubstring).toString();
            String strSubstring2 = strMo79187M.substring(iM125887f0 + 1);
            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
            c22677k0.m65765f(string, strSubstring2);
        }
        this.f95092f = c22677k0.m65766g();
    }

    /* JADX INFO: renamed from: a */
    public final void m70977a(C26617h0 c26617h0) {
        c26617h0.mo79209h0(this.f95089c);
        c26617h0.writeByte(10);
        c26617h0.mo79209h0(this.f95090d);
        c26617h0.writeByte(10);
        c26617h0.mo79209h0(this.f95091e ? 1L : 0L);
        c26617h0.writeByte(10);
        C34807d0 c34807d0 = this.f95092f;
        c26617h0.mo79209h0(c34807d0.size());
        c26617h0.writeByte(10);
        int size = c34807d0.size();
        for (int i13 = 0; i13 < size; i13++) {
            c26617h0.mo79193S(c34807d0.m109864c(i13));
            c26617h0.mo79193S(": ");
            c26617h0.mo79193S(c34807d0.m109867g(i13));
            c26617h0.writeByte(10);
        }
    }

    public C24063b(C34850x0 c34850x0) {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i13 = 0;
        this.f95087a = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: lh.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C24063b f95086x;

            {
                this.f95086x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = i13;
                C24063b c24063b = this.f95086x;
                switch (i14) {
                    case 0:
                        C34817h c34817h = C34817h.f146574n;
                        return AbstractC30060g.m92093O(c24063b.f95092f);
                    default:
                        String strM109863a = c24063b.f95092f.m109863a("Content-Type");
                        if (strM109863a == null) {
                            return null;
                        }
                        C39412p c39412p = C34818h0.f146589e;
                        return AbstractC1772c1.m5373J(strM109863a);
                }
            }
        });
        final int i14 = 1;
        this.f95088b = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: lh.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C24063b f95086x;

            {
                this.f95086x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i15 = i14;
                C24063b c24063b = this.f95086x;
                switch (i15) {
                    case 0:
                        C34817h c34817h = C34817h.f146574n;
                        return AbstractC30060g.m92093O(c24063b.f95092f);
                    default:
                        String strM109863a = c24063b.f95092f.m109863a("Content-Type");
                        if (strM109863a == null) {
                            return null;
                        }
                        C39412p c39412p = C34818h0.f146589e;
                        return AbstractC1772c1.m5373J(strM109863a);
                }
            }
        });
        this.f95089c = c34850x0.f146783L;
        this.f95090d = c34850x0.f146784M;
        this.f95091e = c34850x0.f146776E != null;
        this.f95092f = c34850x0.f146777F;
    }
}
