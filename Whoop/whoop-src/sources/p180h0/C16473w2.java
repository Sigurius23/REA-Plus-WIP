package p180h0;

import android.view.KeyEvent;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.AbstractC1097b;
import bc3.AbstractC3006f0;
import c41.C4065l3;
import d30.C11530f0;
import g20.C15270p;
import gm1.C15992b;
import j93.InterfaceC21493z;
import java.util.Collection;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0216j2;
import p005a3.InterfaceC0225m;
import p007a6.C0428i;
import p007a6.C0438l0;
import p037bu.C3632c;
import p077d0.C11413x;
import p095dp.AbstractC12240d;
import p120ek.C13270d;
import p132f0.C13787g0;
import p132f0.C13796j0;
import p132f0.C13798k;
import p132f0.EnumC13840z0;
import p164g2.C15252x;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p445r0.C30838f;
import p477s2.AbstractC32069a;
import p477s2.AbstractC32070b;
import p477s2.AbstractC32072d;
import p477s2.AbstractC32073e;
import p477s2.InterfaceC32074f;
import p492t2.C33316d;
import p492t2.C33319g;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.EnumC34466l;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: h0.w2 */
/* JADX INFO: loaded from: classes.dex */
public final class C16473w2 extends AbstractC16387f1 implements InterfaceC32074f, InterfaceC0216j2, InterfaceC0225m {

    /* JADX INFO: renamed from: Z */
    public C13798k f63293Z;

    /* JADX INFO: renamed from: a0 */
    public InterfaceC16432o1 f63294a0;

    /* JADX INFO: renamed from: b0 */
    public final C33316d f63295b0;

    /* JADX INFO: renamed from: c0 */
    public final C16418l2 f63296c0;

    /* JADX INFO: renamed from: d0 */
    public final C16363b0 f63297d0;

    /* JADX INFO: renamed from: e0 */
    public final C16372c3 f63298e0;

    /* JADX INFO: renamed from: f0 */
    public final C16448r2 f63299f0;

    /* JADX INFO: renamed from: g0 */
    public final C16470w f63300g0;

    /* JADX INFO: renamed from: h0 */
    public C4065l3 f63301h0;

    /* JADX INFO: renamed from: i0 */
    public C16468v2 f63302i0;

    /* JADX INFO: renamed from: j0 */
    public C11530f0 f63303j0;

    public C16473w2(C13798k c13798k, InterfaceC16450s interfaceC16450s, InterfaceC16432o1 interfaceC16432o1, EnumC16377d2 enumC16377d2, InterfaceC16478x2 interfaceC16478x2, InterfaceC21083i interfaceC21083i, boolean z4, boolean z13) {
        super(AbstractC1097b.f4538a, z4, interfaceC21083i, enumC16377d2);
        this.f63293Z = c13798k;
        this.f63294a0 = interfaceC16432o1;
        C33316d c33316d = new C33316d();
        this.f63295b0 = c33316d;
        C16418l2 c16418l2 = new C16418l2();
        c16418l2.f63091O = z4;
        m665X0(c16418l2);
        this.f63296c0 = c16418l2;
        C16363b0 c16363b0 = new C16363b0(new C11413x(new C3632c((InterfaceC39171c) AbstractC1097b.f4541d)));
        this.f63297d0 = c16363b0;
        C13798k c13798k2 = this.f63293Z;
        InterfaceC16432o1 interfaceC16432o2 = this.f63294a0;
        C16372c3 c16372c3 = new C16372c3(interfaceC16478x2, c13798k2, interfaceC16432o2 == null ? c16363b0 : interfaceC16432o2, enumC16377d2, z13, c33316d, this, new C0438l0(this, 16));
        this.f63298e0 = c16372c3;
        C16448r2 c16448r2 = new C16448r2(c16372c3, z4);
        this.f63299f0 = c16448r2;
        C16470w c16470w = new C16470w(enumC16377d2, c16372c3, z13, interfaceC16450s);
        m665X0(c16470w);
        this.f63300g0 = c16470w;
        m665X0(new C33319g(c16448r2, c33316d));
        m665X0(new C15252x(null, 2, 4));
        C30838f c30838f = new C30838f();
        c30838f.f127145O = c16470w;
        m665X0(c30838f);
        C0428i c0428i = new C0428i(this, 16);
        C13796j0 c13796j0 = new C13796j0();
        c13796j0.f49228O = c0428i;
        m665X0(c13796j0);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        if (this.f9141N) {
            InterfaceC39171c interfaceC39171c = AbstractC0201g.m516p(this).f776X;
            C16363b0 c16363b0 = this.f63297d0;
            c16363b0.getClass();
            c16363b0.f62903a = new C11413x(new C3632c(interfaceC39171c));
        }
        C11530f0 c11530f0 = this.f63303j0;
        if (c11530f0 != null) {
            c11530f0.m30989m(AbstractC0201g.m516p(this).f776X);
        }
    }

    @Override // p477s2.InterfaceC32074f
    /* JADX INFO: renamed from: Q */
    public final boolean mo39148Q(KeyEvent keyEvent) {
        return false;
    }

    @Override // p477s2.InterfaceC32074f
    /* JADX INFO: renamed from: Z */
    public final boolean mo39149Z(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f63008S) {
            return false;
        }
        long jM99714D = AbstractC32073e.m99714D(keyEvent);
        int i13 = AbstractC32070b.f133018r;
        if ((!AbstractC32070b.m99689a(jM99714D, AbstractC32069a.m99683u()) && !AbstractC32070b.m99689a(AbstractC32073e.m99714D(keyEvent), AbstractC32069a.m99684v())) || !AbstractC32072d.m99701j(AbstractC32073e.m99720L(keyEvent), 2) || AbstractC32073e.m99722N(keyEvent)) {
            return false;
        }
        EnumC16377d2 enumC16377d2 = this.f63298e0.f62939d;
        EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
        C16470w c16470w = this.f63300g0;
        if (enumC16377d2 == enumC16377d3) {
            int i14 = (int) (c16470w.f63285W & 4294967295L);
            float f13 = AbstractC32070b.m99689a(AbstractC32073e.m99714D(keyEvent), AbstractC32069a.m99684v()) ? i14 : -i14;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f13);
        } else {
            int i15 = (int) (c16470w.f63285W >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(AbstractC32070b.m99689a(AbstractC32073e.m99714D(keyEvent), AbstractC32069a.m99684v()) ? i15 : -i15);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        AbstractC3006f0.m8732z(m7158L0(), null, null, new C16453s2(this, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L), null, 1), 3);
        return true;
    }

    @Override // p005a3.InterfaceC0229n, p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: c */
    public final void mo466c() {
        mo465b0();
        if (this.f9141N) {
            InterfaceC39171c interfaceC39171c = AbstractC0201g.m516p(this).f776X;
            C16363b0 c16363b0 = this.f63297d0;
            c16363b0.getClass();
            c16363b0.f62903a = new C11413x(new C3632c(interfaceC39171c));
        }
        C11530f0 c11530f0 = this.f63303j0;
        if (c11530f0 != null) {
            c11530f0.m30989m(AbstractC0201g.m516p(this).f776X);
        }
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: e1 */
    public final Object mo46581e1(C16382e1 c16382e1, C16382e1 c16382e2) {
        EnumC13840z0 enumC13840z0 = EnumC13840z0.f49375x;
        C16372c3 c16372c3 = this.f63298e0;
        Object objM46573f = c16372c3.m46573f(enumC13840z0, new C15270p(c16382e1, c16372c3, (InterfaceC30057d) null, 9), c16382e2);
        return objM46573f == EnumC31071a.f128113w ? objM46573f : C23454a0.f92919a;
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: f1 */
    public final void mo46582f1(long j7) {
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: g1 */
    public final void mo46583g1(long j7) {
        AbstractC3006f0.m8732z(this.f63295b0.m105692c(), null, null, new C16453s2(this, j7, null, 0), 3);
    }

    @Override // p180h0.AbstractC16387f1
    /* JADX INFO: renamed from: h1 */
    public final boolean mo46584h1() {
        C16372c3 c16372c3 = this.f63298e0;
        if (c16372c3.f62936a.mo9765b()) {
            return true;
        }
        C13798k c13798k = c16372c3.f62937b;
        if (c13798k == null) {
            return false;
        }
        C13787g0 c13787g0 = c13798k.f49235c;
        EdgeEffect edgeEffect = c13787g0.f49186d;
        if (edgeEffect != null && AbstractC12240d.m34041G(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = c13787g0.f49187e;
        if (edgeEffect2 != null && AbstractC12240d.m34041G(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = c13787g0.f49188f;
        if (edgeEffect3 != null && AbstractC12240d.m34041G(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = c13787g0.f49189g;
        return (edgeEffect4 == null || AbstractC12240d.m34041G(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m46645j1(C13798k c13798k, InterfaceC16450s interfaceC16450s, InterfaceC16432o1 interfaceC16432o1, EnumC16377d2 enumC16377d2, InterfaceC16478x2 interfaceC16478x2, InterfaceC21083i interfaceC21083i, boolean z4, boolean z13) {
        boolean z14;
        boolean z15 = true;
        boolean z16 = false;
        if (this.f63008S != z4) {
            this.f63299f0.f63203x = z4;
            this.f63296c0.f63091O = z4;
            z14 = true;
        } else {
            z14 = false;
        }
        InterfaceC16432o1 interfaceC16432o2 = interfaceC16432o1 == null ? this.f63297d0 : interfaceC16432o1;
        C16372c3 c16372c3 = this.f63298e0;
        if (!AbstractC22676k.m65745e(c16372c3.f62936a, interfaceC16478x2)) {
            c16372c3.f62936a = interfaceC16478x2;
            z16 = true;
        }
        c16372c3.f62937b = c13798k;
        if (c16372c3.f62939d != enumC16377d2) {
            c16372c3.f62939d = enumC16377d2;
            z16 = true;
        }
        if (c16372c3.f62940e != z13) {
            c16372c3.f62940e = z13;
        } else {
            z15 = z16;
        }
        c16372c3.f62938c = interfaceC16432o2;
        c16372c3.f62941f = this.f63295b0;
        C16470w c16470w = this.f63300g0;
        c16470w.f63277O = enumC16377d2;
        c16470w.f63279Q = z13;
        c16470w.f63280R = interfaceC16450s;
        this.f63293Z = c13798k;
        this.f63294a0 = interfaceC16432o1;
        C15992b c15992b = AbstractC1097b.f4538a;
        EnumC16377d2 enumC16377d3 = c16372c3.f62939d;
        EnumC16377d2 enumC16377d4 = EnumC16377d2.f62971w;
        if (enumC16377d3 != enumC16377d4) {
            enumC16377d4 = EnumC16377d2.f62972x;
        }
        m46585i1(c15992b, z4, interfaceC21083i, enumC16377d4, z15);
        if (z14) {
            this.f63301h0 = null;
            this.f63302i0 = null;
            AbstractC0201g.m510j(this);
        }
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        if (this.f63008S && (this.f63301h0 == null || this.f63302i0 == null)) {
            this.f63301h0 = new C4065l3(this, 3);
            this.f63302i0 = new C16468v2(this, null);
        }
        C4065l3 c4065l3 = this.f63301h0;
        if (c4065l3 != null) {
            InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
            ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69957d, new C18017a(null, c4065l3));
        }
        C16468v2 c16468v2 = this.f63302i0;
        if (c16468v2 != null) {
            InterfaceC21493z[] interfaceC21493zArr2 = AbstractC18041w.f70062a;
            ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69958e, c16468v2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p180h0.AbstractC16387f1, p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: r0 */
    public final void mo473r0(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        ?? r10 = c34465k.f144800a;
        int size = ((Collection) r10).size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((Boolean) this.f63007R.invoke((C34472r) r10.get(i13))).booleanValue()) {
                super.mo473r0(c34465k, enumC34466l, j7);
                break;
            }
        }
        if (this.f63008S) {
            if (enumC34466l == EnumC34466l.f144806w && c34465k.f144805f == 6) {
                if (this.f63303j0 == null) {
                    this.f63303j0 = new C11530f0(this.f63298e0, AbstractC16444q3.m46632n(this), new C13270d(this), AbstractC0201g.m516p(this).f776X);
                }
                C11530f0 c11530f0 = this.f63303j0;
                if (c11530f0 != null) {
                    c11530f0.m30987j(m7158L0());
                }
            }
            C11530f0 c11530f1 = this.f63303j0;
            if (c11530f1 != null) {
                c11530f1.m30983f(c34465k, enumC34466l, j7);
            }
        }
    }
}
