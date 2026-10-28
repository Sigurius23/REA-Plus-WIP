package p163g1;

import a00.C0071f;
import a33.C0351c;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import e00.C12480c;
import e93.AbstractC12889b;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25272z;
import mc3.C25437c;
import p077d0.InterfaceC11372l;
import p132f0.EnumC13840z0;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28617g1;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14947a0 {

    /* JADX INFO: renamed from: a */
    public final Function1 f55764a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f55765b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11372l f55766c;

    /* JADX INFO: renamed from: d */
    public final Function1 f55767d;

    /* JADX INFO: renamed from: g */
    public final C28633k1 f55770g;

    /* JADX INFO: renamed from: e */
    public final C15049j3 f55768e = new C15049j3();

    /* JADX INFO: renamed from: f */
    public final C15205z f55769f = new C15205z(this);

    /* JADX INFO: renamed from: h */
    public final C28612f0 f55771h = AbstractC28683x.m87264r(new C15145t(this, 0));

    /* JADX INFO: renamed from: i */
    public final C28612f0 f55772i = AbstractC28683x.m87264r(new C15145t(this, 1));

    /* JADX INFO: renamed from: j */
    public final C28617g1 f55773j = new C28617g1(Float.NaN);

    /* JADX INFO: renamed from: k */
    public final C28612f0 f55774k = AbstractC28683x.m87265s(new C15145t(this, 2), C28676v0.f115974F);

    /* JADX INFO: renamed from: l */
    public final C28617g1 f55775l = new C28617g1(0.0f);

    /* JADX INFO: renamed from: m */
    public final C28633k1 f55776m = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: n */
    public final C28633k1 f55777n = AbstractC28683x.m87272z(new C15059k3(C25272z.f99163w));

    /* JADX INFO: renamed from: o */
    public final C15175w f55778o = new C15175w(this);

    public C14947a0(Object obj, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC11372l interfaceC11372l, Function1 function2) {
        this.f55764a = function1;
        this.f55765b = interfaceC4339a;
        this.f55766c = interfaceC11372l;
        this.f55767d = function2;
        this.f55770g = AbstractC28683x.m87272z(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m43066a(EnumC13840z0 enumC13840z0, C15185x c15185x, InterfaceC30057d interfaceC30057d) {
        C15155u c15155u;
        if (interfaceC30057d instanceof C15155u) {
            c15155u = (C15155u) interfaceC30057d;
            int i13 = c15155u.f56852y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15155u.f56852y = i13 - Integer.MIN_VALUE;
            } else {
                c15155u = new C15155u(this, interfaceC30057d);
            }
        } else {
            c15155u = new C15155u(this, interfaceC30057d);
        }
        Object obj = c15155u.f56850w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15155u.f56852y;
        C28617g1 c28617g1 = this.f55773j;
        Function1 function1 = this.f55767d;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C15049j3 c15049j3 = this.f55768e;
                C0351c c0351c = new C0351c(this, c15185x, null, 5);
                c15155u.f56852y = 1;
                c15049j3.getClass();
                if (AbstractC3006f0.m8719m(new C12480c(enumC13840z0, c15049j3, c0351c, (InterfaceC30057d) null), c15155u) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Object objM43143a = m43070e().m43143a(c28617g1.m87022x());
            if (objM43143a != null && Math.abs(c28617g1.m87022x() - m43070e().m43146d(objM43143a)) <= 0.5f && ((Boolean) function1.invoke(objM43143a)).booleanValue()) {
                m43073h(objM43143a);
            }
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            Object objM43143a2 = m43070e().m43143a(c28617g1.m87022x());
            if (objM43143a2 != null && Math.abs(c28617g1.m87022x() - m43070e().m43146d(objM43143a2)) <= 0.5f && ((Boolean) function1.invoke(objM43143a2)).booleanValue()) {
                m43073h(objM43143a2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: b */
    public final Object m43067b(Object obj, EnumC13840z0 enumC13840z0, C15085n c15085n, InterfaceC30057d interfaceC30057d) {
        C15165v c15165v;
        if (interfaceC30057d instanceof C15165v) {
            c15165v = (C15165v) interfaceC30057d;
            int i13 = c15165v.f56890y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15165v.f56890y = i13 - Integer.MIN_VALUE;
            } else {
                c15165v = new C15165v(this, interfaceC30057d);
            }
        } else {
            c15165v = new C15165v(this, interfaceC30057d);
        }
        C15165v c15165v2 = c15165v;
        Object obj2 = c15165v2.f56888w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15165v2.f56890y;
        C28633k1 c28633k1 = this.f55776m;
        C28617g1 c28617g1 = this.f55773j;
        Function1 function1 = this.f55767d;
        InterfaceC30057d interfaceC30057d2 = null;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj2);
                if (m43070e().f56384a.containsKey(obj)) {
                    C15049j3 c15049j3 = this.f55768e;
                    C0071f c0071f = new C0071f(this, obj, c15085n, interfaceC30057d2, 2);
                    c15165v2.f56890y = 1;
                    c15049j3.getClass();
                    if (AbstractC3006f0.m8719m(new C12480c(enumC13840z0, c15049j3, c0071f, (InterfaceC30057d) null), c15165v2) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    m43073h(obj);
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj2);
            c28633k1.setValue(null);
            Object objM43143a = m43070e().m43143a(c28617g1.m87022x());
            if (objM43143a != null && Math.abs(c28617g1.m87022x() - m43070e().m43146d(objM43143a)) <= 0.5f && ((Boolean) function1.invoke(objM43143a)).booleanValue()) {
                m43073h(objM43143a);
            }
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            c28633k1.setValue(null);
            Object objM43143a2 = m43070e().m43143a(c28617g1.m87022x());
            if (objM43143a2 != null && Math.abs(c28617g1.m87022x() - m43070e().m43146d(objM43143a2)) <= 0.5f && ((Boolean) function1.invoke(objM43143a2)).booleanValue()) {
                m43073h(objM43143a2);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m43068c(float f13, float f14, Object obj) {
        C15059k3 c15059k3M43070e = m43070e();
        float fM43146d = c15059k3M43070e.m43146d(obj);
        float fFloatValue = ((Number) this.f55765b.invoke()).floatValue();
        if (fM43146d != f13 && !Float.isNaN(fM43146d)) {
            Function1 function1 = this.f55764a;
            if (fM43146d < f13) {
                if (f14 >= fFloatValue) {
                    Object objM43144b = c15059k3M43070e.m43144b(f13, true);
                    AbstractC22676k.m65747g(objM43144b);
                    return objM43144b;
                }
                Object objM43144b2 = c15059k3M43070e.m43144b(f13, true);
                AbstractC22676k.m65747g(objM43144b2);
                if (f13 >= Math.abs(Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(c15059k3M43070e.m43146d(objM43144b2) - fM43146d)))).floatValue()) + fM43146d)) {
                    return objM43144b2;
                }
            } else {
                if (f14 <= (-fFloatValue)) {
                    Object objM43144b3 = c15059k3M43070e.m43144b(f13, false);
                    AbstractC22676k.m65747g(objM43144b3);
                    return objM43144b3;
                }
                Object objM43144b4 = c15059k3M43070e.m43144b(f13, false);
                AbstractC22676k.m65747g(objM43144b4);
                float fAbs = Math.abs(fM43146d - Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(fM43146d - c15059k3M43070e.m43146d(objM43144b4))))).floatValue()));
                if (f13 >= 0.0f ? f13 <= fAbs : Math.abs(f13) >= fAbs) {
                    return objM43144b4;
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final float m43069d(float f13) {
        float fM43071f = m43071f(f13);
        C28617g1 c28617g1 = this.f55773j;
        float fM87022x = Float.isNaN(c28617g1.m87022x()) ? 0.0f : c28617g1.m87022x();
        c28617g1.m87023y(fM43071f);
        return fM43071f - fM87022x;
    }

    /* JADX INFO: renamed from: e */
    public final C15059k3 m43070e() {
        return (C15059k3) this.f55777n.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final float m43071f(float f13) {
        C28617g1 c28617g1 = this.f55773j;
        float fM87022x = (Float.isNaN(c28617g1.m87022x()) ? 0.0f : c28617g1.m87022x()) + f13;
        float fM43145c = m43070e().m43145c();
        Float fM74117U0 = AbstractC25265s.m74117U0(m43070e().f56384a.values());
        return AbstractC12889b.m36283m(fM87022x, fM43145c, fM74117U0 != null ? fM74117U0.floatValue() : Float.NaN);
    }

    /* JADX INFO: renamed from: g */
    public final float m43072g() {
        C28617g1 c28617g1 = this.f55773j;
        if (Float.isNaN(c28617g1.m87022x())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c28617g1.m87022x();
    }

    /* JADX INFO: renamed from: h */
    public final void m43073h(Object obj) {
        this.f55770g.setValue(obj);
    }

    /* JADX INFO: renamed from: i */
    public final Object m43074i(float f13, AbstractC32269c abstractC32269c) {
        Object value = this.f55770g.getValue();
        Object objM43068c = m43068c(m43072g(), f13, value);
        if (((Boolean) this.f55767d.invoke(objM43068c)).booleanValue()) {
            Object objM16787m = AbstractC5583n.m16787m(this, objM43068c, f13, abstractC32269c);
            if (objM16787m == EnumC31071a.f128113w) {
                return objM16787m;
            }
        } else {
            Object objM16787m2 = AbstractC5583n.m16787m(this, value, f13, abstractC32269c);
            if (objM16787m2 == EnumC31071a.f128113w) {
                return objM16787m2;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m43075j(Object obj) {
        C25437c c25437c = this.f55768e.f56341b;
        boolean zTryLock = c25437c.tryLock();
        if (!zTryLock) {
            return zTryLock;
        }
        try {
            C15175w c15175w = this.f55778o;
            float fM43146d = m43070e().m43146d(obj);
            if (!Float.isNaN(fM43146d)) {
                C14947a0 c14947a0 = c15175w.f56944a;
                c14947a0.f55773j.m87023y(fM43146d);
                c14947a0.f55775l.m87023y(0.0f);
                this.f55776m.setValue(null);
            }
            m43073h(obj);
            return zTryLock;
        } finally {
            c25437c.mo68214i(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m43076k(C15059k3 c15059k3, Object obj) {
        if (AbstractC22676k.m65745e(m43070e(), c15059k3)) {
            return;
        }
        this.f55777n.setValue(c15059k3);
        if (m43075j(obj)) {
            return;
        }
        this.f55776m.setValue(obj);
    }
}
