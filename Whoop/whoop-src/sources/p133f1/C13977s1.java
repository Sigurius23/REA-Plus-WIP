package p133f1;

import android.content.ClipData;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import j93.AbstractC21478l0;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p003a1.C0112k;
import p026b2.C2319y;
import p027b3.C2386i;
import p027b3.C2428q1;
import p027b3.InterfaceC2433r1;
import p132f0.C13774c;
import p164g2.C15247s;
import p181h2.C16617b;
import p294l3.C23254g;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p411q2.InterfaceC29805a;
import p412q3.C29871f0;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p412q3.InterfaceC29884r;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34361u1;
import p510u0.C34307c1;
import p510u0.C34346p1;
import p510u0.C34350r;
import p510u0.C34354s0;
import p510u0.C34358t1;
import p510u0.EnumC34318g0;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ro.C31624i;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f1.s1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13977s1 {

    /* JADX INFO: renamed from: A */
    public final C13968p1 f49843A;

    /* JADX INFO: renamed from: B */
    public boolean f49844B;

    /* JADX INFO: renamed from: a */
    public final C34358t1 f49845a;

    /* JADX INFO: renamed from: d */
    public C34354s0 f49848d;

    /* JADX INFO: renamed from: g */
    public InterfaceC4339a f49851g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2433r1 f49852h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2994c0 f49853i;

    /* JADX INFO: renamed from: j */
    public C13966p f49854j;

    /* JADX INFO: renamed from: k */
    public InterfaceC29805a f49855k;

    /* JADX INFO: renamed from: l */
    public C15247s f49856l;

    /* JADX INFO: renamed from: m */
    public final C28633k1 f49857m;

    /* JADX INFO: renamed from: n */
    public final C28633k1 f49858n;

    /* JADX INFO: renamed from: o */
    public long f49859o;

    /* JADX INFO: renamed from: p */
    public C23283u0 f49860p;

    /* JADX INFO: renamed from: q */
    public long f49861q;

    /* JADX INFO: renamed from: r */
    public final C28633k1 f49862r;

    /* JADX INFO: renamed from: s */
    public final C28633k1 f49863s;

    /* JADX INFO: renamed from: t */
    public int f49864t;

    /* JADX INFO: renamed from: u */
    public C29891y f49865u;

    /* JADX INFO: renamed from: v */
    public C13935e1 f49866v;

    /* JADX INFO: renamed from: w */
    public C23283u0 f49867w;

    /* JADX INFO: renamed from: x */
    public final C28633k1 f49868x;

    /* JADX INFO: renamed from: y */
    public final C31624i f49869y;

    /* JADX INFO: renamed from: z */
    public final C13962n1 f49870z;

    /* JADX INFO: renamed from: b */
    public InterfaceC29884r f49846b = AbstractC34361u1.f144370a;

    /* JADX INFO: renamed from: c */
    public Function1 f49847c = new C34350r(1);

    /* JADX INFO: renamed from: e */
    public final C28633k1 f49849e = AbstractC28683x.m87272z(new C29891y(7, (String) null, 0));

    /* JADX INFO: renamed from: f */
    public InterfaceC29873g0 f49850f = C29871f0.f122092w;

    public C13977s1(C34358t1 c34358t1) {
        this.f49845a = c34358t1;
        Boolean bool = Boolean.TRUE;
        this.f49857m = AbstractC28683x.m87272z(bool);
        this.f49858n = AbstractC28683x.m87272z(bool);
        this.f49859o = 0L;
        this.f49861q = 0L;
        this.f49862r = AbstractC28683x.m87272z(null);
        this.f49863s = AbstractC28683x.m87272z(null);
        this.f49864t = -1;
        this.f49865u = new C29891y(7, (String) null, 0L);
        this.f49868x = AbstractC28683x.m87272z(null);
        this.f49869y = new C31624i(1);
        this.f49870z = new C13962n1(this);
        this.f49843A = new C13968p1(this);
    }

    /* JADX INFO: renamed from: a */
    public static final void m39771a(C13977s1 c13977s1, C23283u0 c23283u0) {
        C23254g c23254gM39782l;
        String str;
        InterfaceC2994c0 interfaceC2994c0;
        if (c23283u0 == null) {
            return;
        }
        long j7 = c23283u0.f92253a;
        C13966p c13966p = c13977s1.f49854j;
        if (c13966p == null || (c23254gM39782l = c13977s1.m39782l()) == null || (str = c23254gM39782l.f92135x) == null) {
            return;
        }
        InterfaceC29884r interfaceC29884r = c13977s1.f49846b;
        long jM60431f = AbstractC21478l0.m60431f(interfaceC29884r.mo15749x((int) (j7 >> 32)), interfaceC29884r.mo15749x((int) (j7 & 4294967295L)));
        if (str.length() <= 0 || C23283u0.m67357c(jM60431f) || (interfaceC2994c0 = c13977s1.f49853i) == null) {
            return;
        }
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C13965o1(c13966p, str, jM60431f, c23283u0, c13977s1, interfaceC29884r, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m39772b(C13977s1 c13977s1, AbstractC32269c abstractC32269c) {
        C13971q1 c13971q1;
        String str;
        C23283u0 c23283u0;
        if (abstractC32269c instanceof C13971q1) {
            c13971q1 = (C13971q1) abstractC32269c;
            int i13 = c13971q1.f49814y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13971q1.f49814y = i13 - Integer.MIN_VALUE;
            } else {
                c13971q1 = new C13971q1(c13977s1, abstractC32269c);
            }
        } else {
            c13971q1 = new C13971q1(c13977s1, abstractC32269c);
        }
        Object obj = c13971q1.f49812w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13971q1.f49814y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C23254g c23254gM39782l = c13977s1.m39782l();
            if (c23254gM39782l != null && (str = c23254gM39782l.f92135x) != null && (c23283u0 = c13977s1.f49867w) != null) {
                long j7 = c23283u0.f92253a;
                C13966p c13966p = c13977s1.f49854j;
                if (c13966p != null) {
                    long jM60431f = AbstractC21478l0.m60431f(c13977s1.f49846b.mo15749x((int) (j7 >> 32)), c13977s1.f49846b.mo15749x((int) (j7 & 4294967295L)));
                    c13971q1.f49814y = 1;
                    if (((str.length() == 0 || C23283u0.m67357c(jM60431f)) ? c23454a0 : AbstractC3006f0.m8705K(c13966p.f49795a, new C2319y(c13966p, new C13774c(c13966p, str, jM60431f, (InterfaceC30057d) null, 2), (InterfaceC30057d) null), c13971q1)) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: c */
    public static final long m39773c(C13977s1 c13977s1, C29891y c29891y, long j7, boolean z4, boolean z13, C13984v c13984v, boolean z14) {
        C34346p1 c34346p1M108662d;
        long j13;
        C13981u c13981u;
        boolean z15;
        boolean z16;
        InterfaceC29805a interfaceC29805a;
        int i13;
        C34354s0 c34354s0 = c13977s1.f49848d;
        if (c34354s0 == null || (c34346p1M108662d = c34354s0.m108662d()) == null) {
            return C23283u0.f92251b;
        }
        InterfaceC29884r interfaceC29884r = c13977s1.f49846b;
        long j14 = c29891y.f122126b;
        C23254g c23254g = c29891y.f122125a;
        int i14 = C23283u0.f92252c;
        long jM60431f = AbstractC21478l0.m60431f(interfaceC29884r.mo15749x((int) (j14 >> 32)), c13977s1.f49846b.mo15749x((int) (j14 & 4294967295L)));
        int iM108649b = c34346p1M108662d.m108649b(j7, false);
        int i15 = (z13 || z4) ? iM108649b : (int) (jM60431f >> 32);
        int i16 = (!z13 || z4) ? iM108649b : (int) (jM60431f & 4294967295L);
        C13935e1 c13935e1 = c13977s1.f49866v;
        int i17 = (z4 || c13935e1 == null || (i13 = c13977s1.f49864t) == -1) ? -1 : i13;
        C23277r0 c23277r0 = c34346p1M108662d.f144282a;
        if (z4) {
            j13 = 4294967295L;
            c13981u = null;
        } else {
            j13 = 4294967295L;
            int i18 = (int) (jM60431f >> 32);
            C13978t c13978t = new C13978t(AbstractC13994y0.m39833v(c23277r0, i18), i18, 1L);
            int i19 = (int) (jM60431f & 4294967295L);
            c13981u = new C13981u(c13978t, new C13978t(AbstractC13994y0.m39833v(c23277r0, i19), i19, 1L), C23283u0.m67361g(jM60431f));
        }
        C13935e1 c13935e2 = new C13935e1(z13, 1, 1, c13981u, new C13972r(1L, 1, i15, i16, i17, c23277r0));
        if (!c13935e2.mo39703f(c13935e1)) {
            return j14;
        }
        c13977s1.f49866v = c13935e2;
        c13977s1.f49864t = iM108649b;
        C13981u c13981uM39795a = c13984v.m39795a(c13935e2);
        long jM60431f2 = AbstractC21478l0.m60431f(c13977s1.f49846b.mo15743n(c13981uM39795a.f49879a.f49872b), c13977s1.f49846b.mo15743n(c13981uM39795a.f49880b.f49872b));
        if (C23283u0.m67356b(jM60431f2, j14)) {
            return j14;
        }
        boolean z17 = C23283u0.m67361g(jM60431f2) != C23283u0.m67361g(j14) && C23283u0.m67356b(AbstractC21478l0.m60431f((int) (jM60431f2 & j13), (int) (jM60431f2 >> 32)), j14);
        boolean z18 = C23283u0.m67357c(jM60431f2) && C23283u0.m67357c(j14);
        if (z14 && c23254g.f92135x.length() > 0 && !z17 && !z18 && (interfaceC29805a = c13977s1.f49855k) != null) {
            interfaceC29805a.mo7428a(9);
        }
        c13977s1.f49847c.invoke(m39774e(c23254g, jM60431f2));
        c13977s1.f49867w = new C23283u0(jM60431f2);
        if (!z14) {
            c13977s1.m39789s(!C23283u0.m67357c(jM60431f2));
        }
        C34354s0 c34354s1 = c13977s1.f49848d;
        if (c34354s1 != null) {
            c34354s1.f144323q.setValue(Boolean.valueOf(z14));
        }
        C34354s0 c34354s2 = c13977s1.f49848d;
        if (c34354s2 != null) {
            c34354s2.f144319m.setValue(Boolean.valueOf(!C23283u0.m67357c(jM60431f2) && AbstractC13994y0.m39835x(c13977s1, true)));
        }
        C34354s0 c34354s3 = c13977s1.f49848d;
        if (c34354s3 != null) {
            if (C23283u0.m67357c(jM60431f2)) {
                z15 = false;
            } else {
                z15 = false;
                if (AbstractC13994y0.m39835x(c13977s1, false)) {
                    z16 = true;
                }
                c34354s3.f144320n.setValue(Boolean.valueOf(z16));
            }
            z16 = z15;
            c34354s3.f144320n.setValue(Boolean.valueOf(z16));
        } else {
            z15 = false;
        }
        C34354s0 c34354s4 = c13977s1.f49848d;
        if (c34354s4 != null) {
            c34354s4.f144321o.setValue(Boolean.valueOf((C23283u0.m67357c(jM60431f2) && AbstractC13994y0.m39835x(c13977s1, true)) ? true : z15));
        }
        return jM60431f2;
    }

    /* JADX INFO: renamed from: e */
    public static C29891y m39774e(C23254g c23254g, long j7) {
        return new C29891y(c23254g, j7, (C23283u0) null);
    }

    /* JADX INFO: renamed from: d */
    public final C2996c2 m39775d(boolean z4) {
        InterfaceC2994c0 interfaceC2994c0 = this.f49853i;
        if (interfaceC2994c0 != null) {
            return AbstractC3006f0.m8732z(interfaceC2994c0, null, EnumC2998d0.f12007z, new C13953k1(this, z4, (InterfaceC30057d) null), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m39776f() {
        InterfaceC2994c0 interfaceC2994c0 = this.f49853i;
        if (interfaceC2994c0 != null) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, EnumC2998d0.f12007z, new C13959m1(this, null, 0), 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m39777g(C16617b c16617b) {
        if (!C23283u0.m67357c(m39783m().f122126b)) {
            C34354s0 c34354s0 = this.f49848d;
            C34346p1 c34346p1M108662d = c34354s0 != null ? c34354s0.m108662d() : null;
            int iM67359e = (c16617b == null || c34346p1M108662d == null) ? C23283u0.m67359e(m39783m().f122126b) : this.f49846b.mo15743n(c34346p1M108662d.m108649b(c16617b.f63937a, true));
            C29891y c29891yM91511b = C29891y.m91511b(m39783m(), null, AbstractC21478l0.m60431f(iM67359e, iM67359e), 5);
            this.f49847c.invoke(c29891yM91511b);
            this.f49867w = new C23283u0(c29891yM91511b.f122126b);
        }
        m39786p((c16617b == null || m39783m().f122125a.f92135x.length() <= 0) ? EnumC34318g0.f144086w : EnumC34318g0.f144088y);
        m39789s(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m39778h(boolean z4) {
        C15247s c15247s;
        C34354s0 c34354s0 = this.f49848d;
        if (c34354s0 != null && !c34354s0.m108660b() && (c15247s = this.f49856l) != null) {
            C15247s.m43350c(c15247s);
        }
        this.f49865u = m39783m();
        m39789s(z4);
        m39786p(EnumC34318g0.f144087x);
    }

    /* JADX INFO: renamed from: i */
    public final C16617b m39779i() {
        return (C16617b) this.f49863s.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m39780j() {
        return ((Boolean) this.f49858n.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final long m39781k(boolean z4) {
        C34346p1 c34346p1M108662d;
        long j7;
        C34354s0 c34354s0 = this.f49848d;
        if (c34354s0 == null || (c34346p1M108662d = c34354s0.m108662d()) == null) {
            return 9205357640488583168L;
        }
        C23277r0 c23277r0 = c34346p1M108662d.f144282a;
        C23254g c23254gM39782l = m39782l();
        if (c23254gM39782l == null) {
            return 9205357640488583168L;
        }
        if (!AbstractC22676k.m65745e(c23254gM39782l.f92135x, c23277r0.f92227a.f92216a.f92135x)) {
            return 9205357640488583168L;
        }
        C29891y c29891yM39783m = m39783m();
        if (z4) {
            long j13 = c29891yM39783m.f122126b;
            int i13 = C23283u0.f92252c;
            j7 = j13 >> 32;
        } else {
            long j14 = c29891yM39783m.f122126b;
            int i14 = C23283u0.f92252c;
            j7 = j14 & 4294967295L;
        }
        return AbstractC13994y0.m39832u(c23277r0, this.f49846b.mo15749x((int) j7), z4, C23283u0.m67361g(m39783m().f122126b));
    }

    /* JADX INFO: renamed from: l */
    public final C23254g m39782l() {
        C34307c1 c34307c1;
        C34354s0 c34354s0 = this.f49848d;
        if (c34354s0 == null || (c34307c1 = c34354s0.f144307a) == null) {
            return null;
        }
        return c34307c1.f144060a;
    }

    /* JADX INFO: renamed from: m */
    public final C29891y m39783m() {
        return (C29891y) this.f49849e.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m39784n() {
        C2996c2 c2996c2;
        C0112k c0112k = (C0112k) this.f49869y.f130665x;
        if (c0112k == null || (c2996c2 = c0112k.f350U) == null) {
            return;
        }
        c2996c2.cancel((CancellationException) null);
        c0112k.f350U = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m39785o() {
        InterfaceC2994c0 interfaceC2994c0 = this.f49853i;
        if (interfaceC2994c0 != null) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, EnumC2998d0.f12007z, new C13959m1(this, null, 1), 1);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m39786p(EnumC34318g0 enumC34318g0) {
        C34354s0 c34354s0 = this.f49848d;
        if (c34354s0 != null) {
            if (c34354s0.m108659a() == enumC34318g0) {
                c34354s0 = null;
            }
            if (c34354s0 != null) {
                c34354s0.f144317k.setValue(enumC34318g0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m39787q() {
        C34354s0 c34354s0;
        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
        try {
            if (!m39780j() || ((c34354s0 = this.f49848d) != null && !((Boolean) c34354s0.f144323q.getValue()).booleanValue())) {
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            } else {
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                this.f49869y.m97701D();
            }
        } catch (Throwable th3) {
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m39788r(AbstractC32269c abstractC32269c) {
        C13974r1 c13974r1;
        C2428q1 c2428q1;
        C13977s1 c13977s1;
        if (abstractC32269c instanceof C13974r1) {
            c13974r1 = (C13974r1) abstractC32269c;
            int i13 = c13974r1.f49835z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13974r1.f49835z = i13 - Integer.MIN_VALUE;
            } else {
                c13974r1 = new C13974r1(this, abstractC32269c);
            }
        } else {
            c13974r1 = new C13974r1(this, abstractC32269c);
        }
        Object c2428q2 = c13974r1.f49833x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13974r1.f49835z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(c2428q2);
            InterfaceC2433r1 interfaceC2433r1 = this.f49852h;
            c2428q1 = null;
            if (interfaceC2433r1 != null) {
                c13974r1.f49832w = this;
                c13974r1.f49835z = 1;
                ClipData primaryClip = ((C2386i) interfaceC2433r1).f9436a.f9446a.getPrimaryClip();
                c2428q2 = primaryClip != null ? new C2428q1(primaryClip) : null;
                if (c2428q2 == enumC31071a) {
                    return enumC31071a;
                }
                c13977s1 = this;
            } else {
                c13977s1 = this;
            }
            c13977s1.f49868x.setValue(c2428q1);
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c13977s1 = c13974r1.f49832w;
        AbstractC34132o.m107864I(c2428q2);
        c2428q1 = (C2428q1) c2428q2;
        c13977s1.f49868x.setValue(c2428q1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public final void m39789s(boolean z4) {
        C34354s0 c34354s0 = this.f49848d;
        if (c34354s0 != null) {
            c34354s0.f144318l.setValue(Boolean.valueOf(z4));
        }
        if (z4) {
            m39787q();
        } else {
            m39784n();
        }
    }
}
