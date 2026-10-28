package p078d1;

import b30.C2476a1;
import j93.AbstractC21478l0;
import j93.InterfaceC21493z;
import l83.C23454a0;
import p005a3.AbstractC0233o;
import p005a3.InterfaceC0216j2;
import p042c2.C3861f;
import p042c2.C3864i;
import p133f1.C13977s1;
import p164g2.C15247s;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p294l3.C23254g;
import p294l3.C23283u0;
import p412q3.C29860a;
import p412q3.C29867d0;
import p412q3.C29868e;
import p412q3.C29869e0;
import p412q3.C29877k;
import p412q3.C29878l;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p510u0.C34354s0;
import p510u0.C34362v;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: d1.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C11452e extends AbstractC0233o implements InterfaceC0216j2 {

    /* JADX INFO: renamed from: Q */
    public C29869e0 f36734Q;

    /* JADX INFO: renamed from: R */
    public C29891y f36735R;

    /* JADX INFO: renamed from: S */
    public C34354s0 f36736S;

    /* JADX INFO: renamed from: T */
    public boolean f36737T;

    /* JADX INFO: renamed from: U */
    public boolean f36738U;

    /* JADX INFO: renamed from: V */
    public boolean f36739V;

    /* JADX INFO: renamed from: W */
    public InterfaceC29884r f36740W;

    /* JADX INFO: renamed from: X */
    public C13977s1 f36741X;

    /* JADX INFO: renamed from: Y */
    public C29878l f36742Y;

    /* JADX INFO: renamed from: Z */
    public C15247s f36743Z;

    /* JADX INFO: renamed from: a1 */
    public static void m30729a1(C34354s0 c34354s0, String str, boolean z4, boolean z13) {
        if (z4 || !z13) {
            return;
        }
        C29867d0 c29867d0 = c34354s0.f144311e;
        C34362v c34362v = c34354s0.f144328v;
        if (c29867d0 == null) {
            int length = str.length();
            c34362v.invoke(new C29891y(4, str, AbstractC21478l0.m60431f(length, length)));
        } else {
            C29891y c29891yM91496b = c34354s0.f144310d.m91496b(AbstractC37056f.m118959K(new C29868e(), new C29860a(str, 1)));
            c29867d0.m91495a(null, c29891yM91496b);
            c34362v.invoke(c29891yM91496b);
        }
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: H0 */
    public final boolean mo542H0() {
        return true;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        boolean z4 = this.f36739V;
        C23254g c23254g = this.f36735R.f122125a;
        InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
        C18043y c18043y = AbstractC18039u.f70022D;
        InterfaceC21493z[] interfaceC21493zArr2 = AbstractC18041w.f70062a;
        InterfaceC21493z interfaceC21493z = interfaceC21493zArr2[17];
        c18043y.m51817a(interfaceC18044z, c23254g);
        C23254g c23254g2 = this.f36734Q.f122088a;
        C18043y c18043y2 = AbstractC18039u.f70023E;
        InterfaceC21493z interfaceC21493z2 = interfaceC21493zArr2[18];
        c18043y2.m51817a(interfaceC18044z, c23254g2);
        long j7 = this.f36735R.f122126b;
        C18043y c18043y3 = AbstractC18039u.f70024F;
        InterfaceC21493z interfaceC21493z3 = interfaceC21493zArr2[19];
        c18043y3.m51817a(interfaceC18044z, new C23283u0(j7));
        C3861f c3861f = C3864i.f15798a;
        C18043y c18043y4 = AbstractC18039u.f70051r;
        int i13 = 9;
        InterfaceC21493z interfaceC21493z4 = interfaceC21493zArr2[9];
        c18043y4.m51817a(interfaceC18044z, c3861f);
        boolean z13 = false;
        z13 = false;
        C11451d c11451d = new C11451d(this, z13 ? 1 : 0);
        C18043y c18043y5 = AbstractC18029k.f69960g;
        C18017a c18017a = new C18017a(null, c11451d);
        C18030l c18030l = (C18030l) interfaceC18044z;
        c18030l.m51772e(c18043y5, c18017a);
        if (!this.f36738U) {
            AbstractC18041w.m51802a(interfaceC18044z);
        }
        if (z4) {
            c18030l.m51772e(AbstractC18039u.f70028J, C23454a0.f92919a);
        }
        int i14 = 1;
        if (this.f36738U && !this.f36737T) {
            z13 = true;
        }
        C18043y c18043y6 = AbstractC18039u.f70031M;
        InterfaceC21493z interfaceC21493z5 = interfaceC21493zArr2[25];
        c18043y6.m51817a(interfaceC18044z, Boolean.valueOf(z13));
        AbstractC18041w.m51803b(interfaceC18044z, new C11451d(this, i14));
        int i15 = 2;
        if (z13) {
            c18030l.m51772e(AbstractC18029k.f69963j, new C18017a(null, new C11451d(this, i15)));
            c18030l.m51772e(AbstractC18029k.f69967n, new C18017a(null, new C11451d(this, interfaceC18044z)));
        }
        c18030l.m51772e(AbstractC18029k.f69962i, new C18017a(null, new C2476a1(this, i13)));
        int i16 = this.f36742Y.f122103e;
        C11450c c11450c = new C11450c(this, 6);
        c18030l.m51772e(AbstractC18039u.f70025G, new C29877k(i16));
        c18030l.m51772e(AbstractC18029k.f69968o, new C18017a(null, c11450c));
        AbstractC18041w.m51804c(interfaceC18044z, new C11450c(this, 7));
        c18030l.m51772e(AbstractC18029k.f69956c, new C18017a(null, new C11450c(this, 1)));
        if (!C23283u0.m67357c(this.f36735R.f122126b) && !z4) {
            c18030l.m51772e(AbstractC18029k.f69969p, new C18017a(null, new C11450c(this, 2)));
            if (this.f36738U && !this.f36737T) {
                c18030l.m51772e(AbstractC18029k.f69970q, new C18017a(null, new C11450c(this, 3)));
            }
        }
        if (!this.f36738U || this.f36737T) {
            return;
        }
        c18030l.m51772e(AbstractC18029k.f69971r, new C18017a(null, new C11450c(this, 5)));
    }
}
