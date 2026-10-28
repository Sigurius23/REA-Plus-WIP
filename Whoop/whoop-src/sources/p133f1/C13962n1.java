package p133f1;

import j93.AbstractC21478l0;
import p181h2.C16617b;
import p268k0.AbstractC22086a;
import p294l3.C23283u0;
import p390p1.C28633k1;
import p411q2.InterfaceC29805a;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p510u0.EnumC34315f0;
import p510u0.EnumC34318g0;
import p510u0.InterfaceC34310d1;
import p635y2.InterfaceC39147y;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f1.n1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13962n1 implements InterfaceC34310d1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49771a;

    /* JADX INFO: renamed from: b */
    public boolean f49772b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49773c;

    public C13962n1(C13977s1 c13977s1) {
        this.f49771a = 1;
        this.f49773c = c13977s1;
        this.f49772b = true;
    }

    /* JADX INFO: renamed from: e */
    private final void m39738e() {
    }

    /* JADX INFO: renamed from: f */
    private final void m39739f() {
    }

    /* JADX INFO: renamed from: h */
    private final void m39740h(long j7) {
    }

    /* JADX INFO: renamed from: i */
    private final void m39741i() {
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: a */
    public final void mo35182a() {
        C34346p1 c34346p1M108662d;
        C13981u c13981uM39802g;
        InterfaceC39147y interfaceC39147yM39736d;
        switch (this.f49771a) {
            case 0:
                C13977s1 c13977s1 = (C13977s1) this.f49773c;
                boolean z4 = this.f49772b;
                c13977s1.f49862r.setValue(z4 ? EnumC34315f0.f144081x : EnumC34315f0.f144082y);
                long jM39745a = AbstractC13967p0.m39745a(c13977s1.m39781k(z4));
                C34354s0 c34354s0 = c13977s1.f49848d;
                if (c34354s0 != null && (c34346p1M108662d = c34354s0.m108662d()) != null) {
                    long jM108652e = c34346p1M108662d.m108652e(jM39745a);
                    c13977s1.f49859o = jM108652e;
                    c13977s1.f49863s.setValue(new C16617b(jM108652e));
                    c13977s1.f49861q = 0L;
                    c13977s1.f49864t = -1;
                    C34354s0 c34354s1 = c13977s1.f49848d;
                    if (c34354s1 != null) {
                        c34354s1.f144323q.setValue(Boolean.TRUE);
                    }
                    c13977s1.m39789s(false);
                    break;
                }
                break;
            case 1:
                break;
            default:
                C13988w0 c13988w0 = (C13988w0) this.f49773c;
                boolean z13 = this.f49772b;
                if ((z13 ? (C16617b) c13988w0.f49915p.getValue() : (C16617b) c13988w0.f49916q.getValue()) != null && (c13981uM39802g = c13988w0.m39802g()) != null) {
                    C13954l c13954lM39799d = c13988w0.m39799d(z13 ? c13981uM39802g.f49879a : c13981uM39802g.f49880b);
                    if (c13954lM39799d != null && (interfaceC39147yM39736d = c13954lM39799d.m39736d()) != null) {
                        long jM39733a = c13954lM39799d.m39733a(c13981uM39802g, z13);
                        if ((9223372034707292159L & jM39733a) != 9205357640488583168L) {
                            c13988w0.f49918s.setValue(new C16617b(c13988w0.m39806k().mo3537k(interfaceC39147yM39736d, AbstractC13967p0.m39745a(jM39733a))));
                            c13988w0.f49917r.setValue(z13 ? EnumC34315f0.f144081x : EnumC34315f0.f144082y);
                            c13988w0.f49923x = false;
                            c13988w0.m39811p();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: b */
    public final void mo35183b(long j7) {
        C13977s1 c13977s1;
        long j13;
        C34346p1 c34346p1M108662d;
        C34346p1 c34346p1M108662d2;
        switch (this.f49771a) {
            case 0:
                return;
            case 1:
                C13977s1 c13977s2 = (C13977s1) this.f49773c;
                C28633k1 c28633k1 = c13977s2.f49862r;
                if (c13977s2.m39780j() && ((EnumC34315f0) c28633k1.getValue()) == null) {
                    c28633k1.setValue(EnumC34315f0.f144082y);
                    c13977s2.f49864t = -1;
                    this.f49772b = true;
                    c13977s2.m39784n();
                    C34354s0 c34354s0 = c13977s2.f49848d;
                    if (c34354s0 == null || (c34346p1M108662d2 = c34354s0.m108662d()) == null || !c34346p1M108662d2.m108650c(j7)) {
                        c13977s1 = c13977s2;
                        j13 = j7;
                        C34354s0 c34354s1 = c13977s1.f49848d;
                        if (c34354s1 != null && (c34346p1M108662d = c34354s1.m108662d()) != null) {
                            int iMo15743n = c13977s1.f49846b.mo15743n(c34346p1M108662d.m108649b(j13, true));
                            C29891y c29891yM39774e = C13977s1.m39774e(c13977s1.m39783m().f122125a, AbstractC21478l0.m60431f(iMo15743n, iMo15743n));
                            c13977s1.m39778h(false);
                            InterfaceC29805a interfaceC29805a = c13977s1.f49855k;
                            if (interfaceC29805a != null) {
                                interfaceC29805a.mo7428a(9);
                            }
                            c13977s1.f49847c.invoke(c29891yM39774e);
                            c13977s1.f49867w = new C23283u0(c29891yM39774e.f122126b);
                        }
                        this.f49772b = false;
                    } else {
                        if (c13977s2.m39783m().f122125a.f92135x.length() == 0) {
                            return;
                        }
                        c13977s2.m39778h(false);
                        long jM39773c = C13977s1.m39773c(c13977s2, C29891y.m91511b(c13977s2.m39783m(), null, C23283u0.f92251b, 5), j7, true, false, C13987w.f49896e, true);
                        c13977s1 = c13977s2;
                        j13 = j7;
                        c13977s1.f49860p = new C23283u0(jM39773c);
                    }
                    c13977s1.m39786p(EnumC34318g0.f144086w);
                    c13977s1.f49859o = j13;
                    c13977s1.f49863s.setValue(new C16617b(j13));
                    c13977s1.f49861q = 0L;
                    return;
                }
                return;
            default:
                boolean z4 = this.f49772b;
                C13988w0 c13988w0 = (C13988w0) this.f49773c;
                if (c13988w0.m39801f() == null) {
                    return;
                }
                C13981u c13981uM39802g = c13988w0.m39802g();
                AbstractC22676k.m65747g(c13981uM39802g);
                Object objM81e = c13988w0.f49900a.f49648c.m81e((z4 ? c13981uM39802g.f49879a : c13981uM39802g.f49880b).f49873c);
                if (objM81e == null) {
                    AbstractC22086a.m63161d("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new KotlinNothingValueException();
                }
                C13954l c13954l = (C13954l) objM81e;
                InterfaceC39147y interfaceC39147yM39736d = c13954l.m39736d();
                if (interfaceC39147yM39736d == null) {
                    AbstractC22086a.m63161d("Current selectable should have layout coordinates.");
                    throw new KotlinNothingValueException();
                }
                long jM39733a = c13954l.m39733a(c13981uM39802g, z4);
                if ((9223372034707292159L & jM39733a) == 9205357640488583168L) {
                    return;
                }
                c13988w0.f49913n.setValue(new C16617b(c13988w0.m39806k().mo3537k(interfaceC39147yM39736d, AbstractC13967p0.m39745a(jM39733a))));
                c13988w0.f49914o.setValue(new C16617b(0L));
                return;
        }
    }

    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: c */
    public final void mo35184c() {
        switch (this.f49771a) {
            case 0:
                C13977s1 c13977s1 = (C13977s1) this.f49773c;
                c13977s1.f49862r.setValue(null);
                c13977s1.f49863s.setValue(null);
                c13977s1.m39789s(true);
                break;
            case 1:
                break;
            default:
                C13988w0 c13988w0 = (C13988w0) this.f49773c;
                c13988w0.f49923x = true;
                c13988w0.m39811p();
                c13988w0.f49917r.setValue(null);
                c13988w0.f49918s.setValue(null);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:31:0x0101  */
    @Override // p510u0.InterfaceC34310d1
    /* JADX INFO: renamed from: d */
    public final void mo35185d(long j7) {
        C34346p1 c34346p1M108662d;
        C23283u0 c23283u0;
        int iM108649b;
        long jM39773c;
        switch (this.f49771a) {
            case 0:
                C13977s1 c13977s1 = (C13977s1) this.f49773c;
                long jM47192h = C16617b.m47192h(c13977s1.f49861q, j7);
                c13977s1.f49861q = jM47192h;
                c13977s1.f49863s.setValue(new C16617b(C16617b.m47192h(c13977s1.f49859o, jM47192h)));
                C29891y c29891yM39783m = c13977s1.m39783m();
                C16617b c16617bM39779i = c13977s1.m39779i();
                AbstractC22676k.m65747g(c16617bM39779i);
                C13977s1.m39773c(c13977s1, c29891yM39783m, c16617bM39779i.f63937a, false, this.f49772b, C13987w.f49898g, true);
                c13977s1.m39789s(false);
                break;
            case 1:
                C13984v c13984v = C13987w.f49896e;
                C13977s1 c13977s2 = (C13977s1) this.f49773c;
                if (c13977s2.m39780j() && c13977s2.m39783m().f122125a.f92135x.length() != 0) {
                    c13977s2.f49861q = C16617b.m47192h(c13977s2.f49861q, j7);
                    C34354s0 c34354s0 = c13977s2.f49848d;
                    if (c34354s0 != null && (c34346p1M108662d = c34354s0.m108662d()) != null) {
                        c13977s2.f49863s.setValue(new C16617b(C16617b.m47192h(c13977s2.f49859o, c13977s2.f49861q)));
                        if (c13977s2.f49860p == null) {
                            C16617b c16617bM39779i2 = c13977s2.m39779i();
                            AbstractC22676k.m65747g(c16617bM39779i2);
                            if (c34346p1M108662d.m108650c(c16617bM39779i2.f63937a)) {
                                c23283u0 = c13977s2.f49860p;
                                if (c23283u0 != null) {
                                    iM108649b = (int) (c23283u0.f92253a >> 32);
                                } else {
                                    iM108649b = c34346p1M108662d.m108649b(c13977s2.f49859o, false);
                                }
                                C16617b c16617bM39779i3 = c13977s2.m39779i();
                                AbstractC22676k.m65747g(c16617bM39779i3);
                                int iM108649b2 = c34346p1M108662d.m108649b(c16617bM39779i3.f63937a, false);
                                if (c13977s2.f49860p == null || iM108649b != iM108649b2) {
                                    C29891y c29891yM39783m2 = c13977s2.m39783m();
                                    C16617b c16617bM39779i4 = c13977s2.m39779i();
                                    AbstractC22676k.m65747g(c16617bM39779i4);
                                    jM39773c = C13977s1.m39773c(c13977s2, c29891yM39783m2, c16617bM39779i4.f63937a, false, false, c13984v, true);
                                }
                            } else {
                                int iMo15743n = c13977s2.f49846b.mo15743n(c34346p1M108662d.m108649b(c13977s2.f49859o, true));
                                InterfaceC29884r interfaceC29884r = c13977s2.f49846b;
                                C16617b c16617bM39779i5 = c13977s2.m39779i();
                                AbstractC22676k.m65747g(c16617bM39779i5);
                                if (iMo15743n == interfaceC29884r.mo15743n(c34346p1M108662d.m108649b(c16617bM39779i5.f63937a, true))) {
                                    c13984v = C13987w.f49895d;
                                }
                                C29891y c29891yM39783m3 = c13977s2.m39783m();
                                C16617b c16617bM39779i6 = c13977s2.m39779i();
                                AbstractC22676k.m65747g(c16617bM39779i6);
                                jM39773c = C13977s1.m39773c(c13977s2, c29891yM39783m3, c16617bM39779i6.f63937a, false, false, c13984v, true);
                            }
                        } else {
                            c23283u0 = c13977s2.f49860p;
                            if (c23283u0 != null) {
                                iM108649b = (int) (c23283u0.f92253a >> 32);
                            } else {
                                iM108649b = c34346p1M108662d.m108649b(c13977s2.f49859o, false);
                            }
                            C16617b c16617bM39779i7 = c13977s2.m39779i();
                            AbstractC22676k.m65747g(c16617bM39779i7);
                            int iM108649b3 = c34346p1M108662d.m108649b(c16617bM39779i7.f63937a, false);
                            if (c13977s2.f49860p == null) {
                            }
                            C29891y c29891yM39783m4 = c13977s2.m39783m();
                            C16617b c16617bM39779i8 = c13977s2.m39779i();
                            AbstractC22676k.m65747g(c16617bM39779i8);
                            jM39773c = C13977s1.m39773c(c13977s2, c29891yM39783m4, c16617bM39779i8.f63937a, false, false, c13984v, true);
                        }
                        if (!C23283u0.m67355a(jM39773c, c13977s2.f49860p)) {
                            this.f49772b = false;
                        }
                    }
                    c13977s2.m39789s(false);
                    break;
                }
                break;
            default:
                C13988w0 c13988w0 = (C13988w0) this.f49773c;
                C28633k1 c28633k1 = c13988w0.f49913n;
                C28633k1 c28633k2 = c13988w0.f49914o;
                if (c13988w0.m39801f() != null) {
                    c28633k2.setValue(new C16617b(C16617b.m47192h(((C16617b) c28633k2.getValue()).f63937a, j7)));
                    long jM47192h2 = C16617b.m47192h(((C16617b) c28633k1.getValue()).f63937a, ((C16617b) c28633k2.getValue()).f63937a);
                    if (c13988w0.m39810o(jM47192h2, ((C16617b) c28633k1.getValue()).f63937a, this.f49772b, C13987w.f49898g)) {
                        c28633k1.setValue(new C16617b(jM47192h2));
                        c28633k2.setValue(new C16617b(0L));
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m39742g() {
        C13977s1 c13977s1 = (C13977s1) this.f49773c;
        c13977s1.f49862r.setValue(null);
        c13977s1.f49863s.setValue(null);
        c13977s1.m39789s(true);
        boolean zM67357c = C23283u0.m67357c(c13977s1.m39783m().f122126b);
        c13977s1.m39786p(zM67357c ? EnumC34318g0.f144088y : EnumC34318g0.f144087x);
        C34354s0 c34354s0 = c13977s1.f49848d;
        if (c34354s0 != null) {
            c34354s0.f144319m.setValue(Boolean.valueOf(!zM67357c && AbstractC13994y0.m39835x(c13977s1, true)));
        }
        C34354s0 c34354s1 = c13977s1.f49848d;
        if (c34354s1 != null) {
            c34354s1.f144320n.setValue(Boolean.valueOf(!zM67357c && AbstractC13994y0.m39835x(c13977s1, false)));
        }
        C34354s0 c34354s2 = c13977s1.f49848d;
        if (c34354s2 != null) {
            c34354s2.f144321o.setValue(Boolean.valueOf(zM67357c && AbstractC13994y0.m39835x(c13977s1, true)));
        }
        if (this.f49772b) {
            C13977s1.m39771a(c13977s1, c13977s1.f49860p);
        }
        c13977s1.f49860p = null;
    }

    @Override // p510u0.InterfaceC34310d1
    public final void onCancel() {
        switch (this.f49771a) {
            case 0:
                break;
            case 1:
                m39742g();
                break;
            default:
                C13988w0 c13988w0 = (C13988w0) this.f49773c;
                c13988w0.f49923x = true;
                c13988w0.m39811p();
                c13988w0.f49917r.setValue(null);
                c13988w0.f49918s.setValue(null);
                break;
        }
    }

    @Override // p510u0.InterfaceC34310d1
    public final void onStop() {
        switch (this.f49771a) {
            case 0:
                C13977s1 c13977s1 = (C13977s1) this.f49773c;
                c13977s1.f49862r.setValue(null);
                c13977s1.f49863s.setValue(null);
                c13977s1.m39789s(true);
                break;
            case 1:
                m39742g();
                break;
            default:
                C13988w0 c13988w0 = (C13988w0) this.f49773c;
                c13988w0.f49923x = true;
                c13988w0.m39811p();
                c13988w0.f49917r.setValue(null);
                c13988w0.f49918s.setValue(null);
                break;
        }
    }

    public C13962n1(C13977s1 c13977s1, boolean z4) {
        this.f49771a = 0;
        this.f49773c = c13977s1;
        this.f49772b = z4;
    }

    public C13962n1(boolean z4, C13988w0 c13988w0) {
        this.f49771a = 2;
        this.f49772b = z4;
        this.f49773c = c13988w0;
    }
}
