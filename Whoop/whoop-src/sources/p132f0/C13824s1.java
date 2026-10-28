package p132f0;

import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.InterfaceC0225m;
import p005a3.InterfaceC0229n;
import p005a3.InterfaceC0263w1;
import p007a6.C0438l0;
import p026b2.AbstractC2316v;
import p180h0.C16473w2;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16432o1;
import p180h0.InterfaceC16450s;
import p180h0.InterfaceC16478x2;
import p238j0.InterfaceC21083i;
import p636y3.EnumC39181m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f0.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C13824s1 extends AbstractC0233o implements InterfaceC0225m, InterfaceC0263w1 {

    /* JADX INFO: renamed from: Q */
    public InterfaceC16478x2 f49332Q;

    /* JADX INFO: renamed from: R */
    public EnumC16377d2 f49333R;

    /* JADX INFO: renamed from: S */
    public boolean f49334S;

    /* JADX INFO: renamed from: T */
    public InterfaceC16432o1 f49335T;

    /* JADX INFO: renamed from: U */
    public InterfaceC21083i f49336U;

    /* JADX INFO: renamed from: V */
    public InterfaceC16450s f49337V;

    /* JADX INFO: renamed from: W */
    public boolean f49338W;

    /* JADX INFO: renamed from: X */
    public C13798k f49339X;

    /* JADX INFO: renamed from: Y */
    public C16473w2 f49340Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC0229n f49341Z;

    /* JADX INFO: renamed from: a0 */
    public C13801l f49342a0;

    /* JADX INFO: renamed from: b0 */
    public C13798k f49343b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f49344c0;

    @Override // p005a3.InterfaceC0263w1
    /* JADX INFO: renamed from: C */
    public final void mo796C() {
        C13801l c13801l = (C13801l) AbstractC0201g.m506f(this, AbstractC13788g1.f49194a);
        if (AbstractC22676k.m65745e(c13801l, this.f49342a0)) {
            return;
        }
        this.f49342a0 = c13801l;
        this.f49343b0 = null;
        InterfaceC0229n interfaceC0229n = this.f49341Z;
        if (interfaceC0229n != null) {
            m666Y0(interfaceC0229n);
        }
        this.f49341Z = null;
        m39186a1();
        C16473w2 c16473w2 = this.f49340Y;
        if (c16473w2 != null) {
            InterfaceC16478x2 interfaceC16478x2 = this.f49332Q;
            EnumC16377d2 enumC16377d2 = this.f49333R;
            C13798k c13798k = this.f49338W ? this.f49343b0 : this.f49339X;
            c16473w2.m46645j1(c13798k, this.f49337V, this.f49335T, enumC16377d2, interfaceC16478x2, this.f49336U, this.f49334S, this.f49344c0);
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        this.f49344c0 = m39187b1();
        m39186a1();
        if (this.f49340Y == null) {
            InterfaceC16478x2 interfaceC16478x2 = this.f49332Q;
            C13798k c13798k = this.f49338W ? this.f49343b0 : this.f49339X;
            C16473w2 c16473w2 = new C16473w2(c13798k, this.f49337V, this.f49335T, this.f49333R, interfaceC16478x2, this.f49336U, this.f49334S, this.f49344c0);
            m665X0(c16473w2);
            this.f49340Y = c16473w2;
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        InterfaceC0229n interfaceC0229n = this.f49341Z;
        if (interfaceC0229n != null) {
            m666Y0(interfaceC0229n);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m39186a1() {
        InterfaceC0229n interfaceC0229n = this.f49341Z;
        if (interfaceC0229n != null) {
            if (((AbstractC2316v) interfaceC0229n).f9142w.f9141N) {
                return;
            }
            m665X0(interfaceC0229n);
            return;
        }
        if (this.f49338W) {
            AbstractC0201g.m512l(this, new C0438l0(this, 13));
        }
        C13798k c13798k = this.f49338W ? this.f49343b0 : this.f49339X;
        if (c13798k != null) {
            AbstractC0233o abstractC0233o = c13798k.f49241i;
            if (abstractC0233o.f9142w.f9141N) {
                return;
            }
            m665X0(abstractC0233o);
            this.f49341Z = abstractC0233o;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m39187b1() {
        EnumC39181m enumC39181m = EnumC39181m.f168423w;
        if (this.f9141N) {
            enumC39181m = AbstractC0201g.m516p(this).f777Y;
        }
        return enumC39181m != EnumC39181m.f168424x || this.f49333R == EnumC16377d2.f62971w;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m39188c1(C13798k c13798k, InterfaceC16450s interfaceC16450s, InterfaceC16432o1 interfaceC16432o1, EnumC16377d2 enumC16377d2, InterfaceC16478x2 interfaceC16478x2, InterfaceC21083i interfaceC21083i, boolean z4, boolean z13) {
        boolean z14;
        this.f49332Q = interfaceC16478x2;
        this.f49333R = enumC16377d2;
        boolean z15 = true;
        if (this.f49338W != z4) {
            this.f49338W = z4;
            z14 = true;
        } else {
            z14 = false;
        }
        if (AbstractC22676k.m65745e(this.f49339X, c13798k)) {
            z15 = false;
        } else {
            this.f49339X = c13798k;
        }
        if (z14 || (z15 && !z4)) {
            InterfaceC0229n interfaceC0229n = this.f49341Z;
            if (interfaceC0229n != null) {
                m666Y0(interfaceC0229n);
            }
            this.f49341Z = null;
            m39186a1();
        }
        this.f49334S = z13;
        this.f49335T = interfaceC16432o1;
        this.f49336U = interfaceC21083i;
        this.f49337V = interfaceC16450s;
        boolean zM39187b1 = m39187b1();
        this.f49344c0 = zM39187b1;
        C16473w2 c16473w2 = this.f49340Y;
        if (c16473w2 != null) {
            c16473w2.m46645j1(this.f49338W ? this.f49343b0 : this.f49339X, interfaceC16450s, interfaceC16432o1, enumC16377d2, interfaceC16478x2, interfaceC21083i, z13, zM39187b1);
        }
    }

    @Override // p005a3.InterfaceC0229n
    /* JADX INFO: renamed from: t */
    public final void mo569t() {
        boolean zM39187b1 = m39187b1();
        if (this.f49344c0 != zM39187b1) {
            this.f49344c0 = zM39187b1;
            InterfaceC16478x2 interfaceC16478x2 = this.f49332Q;
            EnumC16377d2 enumC16377d2 = this.f49333R;
            boolean z4 = this.f49338W;
            C13798k c13798k = z4 ? this.f49343b0 : this.f49339X;
            m39188c1(c13798k, this.f49337V, this.f49335T, enumC16377d2, interfaceC16478x2, this.f49336U, z4, this.f49334S);
        }
    }
}
