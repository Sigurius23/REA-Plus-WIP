package p330n1;

import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p077d0.C11344e;
import p390p1.C28617g1;
import p479s4.AbstractC32128i;
import p492t2.C33319g;
import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n1.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C26114n extends AbstractC0233o implements InterfaceC33313a {

    /* JADX INFO: renamed from: Q */
    public boolean f103457Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC4339a f103458R;

    /* JADX INFO: renamed from: S */
    public boolean f103459S;

    /* JADX INFO: renamed from: T */
    public C26115o f103460T;

    /* JADX INFO: renamed from: U */
    public float f103461U;

    /* JADX INFO: renamed from: V */
    public final C33319g f103462V = new C33319g(this, null);

    /* JADX INFO: renamed from: W */
    public final C28617g1 f103463W = new C28617g1(0.0f);

    /* JADX INFO: renamed from: X */
    public final C28617g1 f103464X = new C28617g1(0.0f);

    public C26114n(boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, C26115o c26115o, float f13) {
        this.f103457Q = z4;
        this.f103458R = interfaceC4339a;
        this.f103459S = z13;
        this.f103460T = c26115o;
        this.f103461U = f13;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: a1 */
    public static final Object m77672a1(C26114n c26114n, AbstractC32269c abstractC32269c) {
        C26110j c26110j;
        c26114n.getClass();
        if (abstractC32269c instanceof C26110j) {
            c26110j = (C26110j) abstractC32269c;
            int i13 = c26110j.f103446y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26110j.f103446y = i13 - Integer.MIN_VALUE;
            } else {
                c26110j = new C26110j(c26114n, abstractC32269c);
            }
        } else {
            c26110j = new C26110j(c26114n, abstractC32269c);
        }
        C26110j c26110j2 = c26110j;
        Object obj = c26110j2.f103444w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26110j2.f103446y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C26115o c26115o = c26114n.f103460T;
                c26110j2.f103446y = 1;
                Object objM30547d = C11344e.m30547d(c26115o.f103466a, new Float(1.0f), null, null, c26110j2, 14);
                if (objM30547d != enumC31071a) {
                    objM30547d = c23454a0;
                }
                if (objM30547d == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (c26114n.f9141N) {
                c26114n.m77677f1(c26114n.m77675d1());
                c26114n.m77678g1(c26114n.m77675d1());
            }
            return c23454a0;
        } catch (Throwable th3) {
            if (!c26114n.f9141N) {
                throw th3;
            }
            c26114n.m77677f1(c26114n.m77675d1());
            c26114n.m77678g1(c26114n.m77675d1());
            throw th3;
        }
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public final long mo9761J(long j7, long j13, int i13) {
        if (this.f103460T.f103466a.m30550f() || !this.f103459S || i13 != 1) {
            return 0L;
        }
        long jM77674c1 = m77674c1(j13);
        AbstractC3006f0.m8732z(m7158L0(), null, null, new C26111k(this, null, 1), 3);
        return jM77674c1;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        m665X0(this.f103462V);
        AbstractC3006f0.m8732z(m7158L0(), null, null, new C26111k(this, null, 0), 3);
        m77678g1(this.f103457Q ? m77675d1() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b1 */
    public final Object m77673b1(AbstractC32269c abstractC32269c) {
        C26109i c26109i;
        if (abstractC32269c instanceof C26109i) {
            c26109i = (C26109i) abstractC32269c;
            int i13 = c26109i.f103443y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26109i.f103443y = i13 - Integer.MIN_VALUE;
            } else {
                c26109i = new C26109i(this, abstractC32269c);
            }
        } else {
            c26109i = new C26109i(this, abstractC32269c);
        }
        C26109i c26109i2 = c26109i;
        Object obj = c26109i2.f103441w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26109i2.f103443y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C26115o c26115o = this.f103460T;
                c26109i2.f103443y = 1;
                Object objM30547d = C11344e.m30547d(c26115o.f103466a, new Float(0.0f), null, null, c26109i2, 14);
                if (objM30547d != enumC31071a) {
                    objM30547d = c23454a0;
                }
                if (objM30547d == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            m77677f1(0.0f);
            m77678g1(0.0f);
            return c23454a0;
        } catch (Throwable th3) {
            m77677f1(0.0f);
            m77678g1(0.0f);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final long m77674c1(long j7) {
        float fM87022x;
        float fM77675d1;
        if (this.f103457Q) {
            fM87022x = 0.0f;
        } else {
            C28617g1 c28617g1 = this.f103464X;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 & 4294967295L)) + c28617g1.m87022x();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fM87022x = fIntBitsToFloat - c28617g1.m87022x();
            m77677f1(fIntBitsToFloat);
            if (c28617g1.m87022x() * 0.5f <= m77675d1()) {
                fM77675d1 = c28617g1.m87022x() * 0.5f;
            } else {
                float fM36283m = AbstractC12889b.m36283m(Math.abs((c28617g1.m87022x() * 0.5f) / m77675d1()) - 1.0f, 0.0f, 2.0f);
                fM77675d1 = m77675d1() + (m77675d1() * (fM36283m - (((float) Math.pow(fM36283m, 2)) / 4)));
            }
            m77678g1(fM77675d1);
        }
        return (((long) Float.floatToRawIntBits(fM87022x)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX INFO: renamed from: d1 */
    public final int m77675d1() {
        return AbstractC0201g.m516p(this).f776X.mo724F(this.f103461U);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e1 */
    public final Object m77676e1(float f13, AbstractC32269c abstractC32269c) {
        C26113m c26113m;
        if (abstractC32269c instanceof C26113m) {
            c26113m = (C26113m) abstractC32269c;
            int i13 = c26113m.f103456z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26113m.f103456z = i13 - Integer.MIN_VALUE;
            } else {
                c26113m = new C26113m(this, abstractC32269c);
            }
        } else {
            c26113m = new C26113m(this, abstractC32269c);
        }
        Object obj = c26113m.f103454x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c26113m.f103456z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (this.f103457Q) {
                return new Float(0.0f);
            }
            C28617g1 c28617g1 = this.f103464X;
            if (c28617g1.m87022x() * 0.5f > m77675d1()) {
                this.f103458R.invoke();
            }
            if (c28617g1.m87022x() == 0.0f || f13 < 0.0f) {
                f13 = 0.0f;
            }
            c26113m.f103453w = f13;
            c26113m.f103456z = 1;
            if (m77673b1(c26113m) == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f13 = c26113m.f103453w;
            AbstractC34132o.m107864I(obj);
        }
        m77677f1(0.0f);
        return new Float(f13);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m77677f1(float f13) {
        this.f103464X.m87023y(f13);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m77678g1(float f13) {
        this.f103463W.m87023y(f13);
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: l0 */
    public final long mo29341l0(long j7, int i13) {
        if (!this.f103460T.f103466a.m30550f() && this.f103459S && i13 == 1 && Float.intBitsToFloat((int) (4294967295L & j7)) < 0.0f) {
            return m77674c1(j7);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: p0 */
    public final Object mo29342p0(long j7, InterfaceC30057d interfaceC30057d) {
        C26112l c26112l;
        if (interfaceC30057d instanceof C26112l) {
            c26112l = (C26112l) interfaceC30057d;
            int i13 = c26112l.f103452y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26112l.f103452y = i13 - Integer.MIN_VALUE;
            } else {
                c26112l = new C26112l(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c26112l = new C26112l(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM77676e1 = c26112l.f103450w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c26112l.f103452y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM77676e1);
            float fM124814e = C39185q.m124814e(j7);
            c26112l.f103452y = 1;
            objM77676e1 = m77676e1(fM124814e, c26112l);
            if (objM77676e1 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM77676e1);
        }
        return new C39185q(AbstractC32128i.m100047a(0.0f, ((Number) objM77676e1).floatValue()));
    }
}
