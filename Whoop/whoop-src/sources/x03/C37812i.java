package x03;

import bm.C3388l;
import e93.AbstractC12889b;
import p077d0.AbstractC11348f;
import p077d0.C11368k;
import p077d0.C11376m;
import p077d0.C11413x;
import p077d0.InterfaceC11372l;
import p164g2.C15254z;
import p180h0.InterfaceC16413k2;
import p180h0.InterfaceC16432o1;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x03.i */
/* JADX INFO: loaded from: classes11.dex */
public final class C37812i implements InterfaceC16432o1 {

    /* JADX INFO: renamed from: a */
    public final C37805b f161946a;

    /* JADX INFO: renamed from: b */
    public final C11413x f161947b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11372l f161948c;

    /* JADX INFO: renamed from: d */
    public final C3388l f161949d;

    /* JADX INFO: renamed from: e */
    public final Function1 f161950e;

    /* JADX INFO: renamed from: f */
    public final C28633k1 f161951f;

    public C37812i(C37805b c37805b, C11413x decayAnimationSpec, InterfaceC11372l springAnimationSpec) {
        AbstractC22676k.m65750j(decayAnimationSpec, "decayAnimationSpec");
        AbstractC22676k.m65750j(springAnimationSpec, "springAnimationSpec");
        C37813j c37813j = AbstractC37814k.f161954b;
        this.f161946a = c37805b;
        this.f161947b = decayAnimationSpec;
        this.f161948c = springAnimationSpec;
        this.f161949d = C3388l.f13236w;
        this.f161950e = c37813j;
        this.f161951f = AbstractC28683x.m87272z(null);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m121324b(C37812i c37812i, C11368k c11368k, C37806c c37806c, int i13, Function1 function1) {
        int iM121320c;
        float fFloatValue = ((Number) c11368k.m30600b()).floatValue();
        C37805b c37805b = c37812i.f161946a;
        if (fFloatValue <= 0.0f || c37806c.m121323a() < i13) {
            iM121320c = (fFloatValue >= 0.0f || c37806c.m121323a() > i13 - 1) ? 0 : c37805b.m121320c(c37806c.m121323a() + 1);
        } else {
            iM121320c = c37805b.m121320c(c37806c.m121323a());
        }
        if (iM121320c == 0) {
            return false;
        }
        function1.invoke(Float.valueOf(iM121320c));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    @Override // p180h0.InterfaceC16432o1
    /* JADX INFO: renamed from: a */
    public final Object mo46565a(InterfaceC16413k2 interfaceC16413k2, float f13, InterfaceC30057d interfaceC30057d) {
        float f14;
        int iM36284n;
        C37805b c37805b = this.f161946a;
        boolean zM121319b = c37805b.m121319b();
        C26068u c26068u = c37805b.f161917a;
        if (!zM121319b || !c37805b.m121318a()) {
            return new Float(f13);
        }
        float fFloatValue = ((Number) this.f161950e.invoke(c37805b)).floatValue();
        if (fFloatValue <= 0.0f) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0");
        }
        C37806c c37806cM121322e = c37805b.m121322e();
        if (c37806cM121322e == null) {
            return new Float(f13);
        }
        C11413x decayAnimationSpec = this.f161947b;
        AbstractC22676k.m65750j(decayAnimationSpec, "decayAnimationSpec");
        C37806c c37806cM121322e2 = c37805b.m121322e();
        if (c37806cM121322e2 == null) {
            iM36284n = -1;
        } else {
            float fM121321d = c37805b.m121321d();
            if (fM121321d <= 0.0f) {
                iM36284n = c37806cM121322e2.m121323a();
            } else {
                int iM121320c = c37805b.m121320c(c37806cM121322e2.m121323a());
                int iM121320c2 = c37805b.m121320c(c37806cM121322e2.m121323a() + 1);
                if (Math.abs(f13) < 0.5f) {
                    iM36284n = AbstractC12889b.m36284n(Math.abs(iM121320c) < Math.abs(iM121320c2) ? c37806cM121322e2.m121323a() : c37806cM121322e2.m121323a() + 1, 0, c26068u.m77565h().f103180n - 1);
                } else {
                    float fM36283m = AbstractC12889b.m36283m(AbstractC11348f.m30563k(decayAnimationSpec, 0.0f, f13), -fFloatValue, fFloatValue);
                    if (f13 < 0.0f) {
                        f14 = fM36283m + iM121320c2;
                        if (f14 > 0.0f) {
                            f14 = 0.0f;
                        }
                    } else {
                        f14 = fM36283m + iM121320c;
                        if (f14 < 0.0f) {
                            f14 = 0.0f;
                        }
                    }
                    double d3 = fM121321d;
                    iM36284n = AbstractC12889b.m36284n(c37806cM121322e2.m121323a() + AbstractC12889b.m36257W((((double) f14) / d3) - (((double) iM121320c) / d3)), 0, c26068u.m77565h().f103180n - 1);
                }
            }
        }
        int iIntValue = ((Number) this.f161949d.invoke(c37805b, new Integer(f13 < 0.0f ? c37806cM121322e.m121323a() + 1 : c37806cM121322e.m121323a()), new Integer(iM36284n))).intValue();
        if (iIntValue < 0 || iIntValue >= c26068u.m77565h().f103180n) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return m121326d(interfaceC16413k2, iIntValue, f13, (AbstractC32269c) interfaceC30057d);
    }

    /* JADX INFO: renamed from: c */
    public final float m121325c(float f13) {
        C37805b c37805b = this.f161946a;
        if ((f13 >= 0.0f || c37805b.m121319b()) && (f13 <= 0.0f || c37805b.m121318a())) {
            return 0.0f;
        }
        return f13;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m121326d(InterfaceC16413k2 interfaceC16413k2, int i13, float f13, AbstractC32269c abstractC32269c) throws Throwable {
        C37808e c37808e;
        C37808e c37808e2;
        C37812i c37812i;
        InterfaceC16413k2 interfaceC16413k3;
        int i14;
        float f14;
        InterfaceC16413k2 interfaceC16413k4;
        int i15;
        float fFloatValue;
        C37806c c37806cM121322e;
        C37812i c37812i2;
        if (abstractC32269c instanceof C37808e) {
            c37808e = (C37808e) abstractC32269c;
            int i16 = c37808e.f161925G;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c37808e.f161925G = i16 - Integer.MIN_VALUE;
            } else {
                c37808e = new C37808e(this, abstractC32269c);
            }
        } else {
            c37808e = new C37808e(this, abstractC32269c);
        }
        C37808e c37808e3 = c37808e;
        Object objM121327e = c37808e3.f161923E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = c37808e3.f161925G;
        if (i17 != 0) {
            if (i17 == 1) {
                f14 = c37808e3.f161929z;
                i14 = c37808e3.f161928y;
                interfaceC16413k3 = c37808e3.f161927x;
                c37812i = c37808e3.f161926w;
                AbstractC34132o.m107864I(objM121327e);
                c37808e2 = c37808e3;
            } else {
                if (i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c37812i2 = c37808e3.f161926w;
                AbstractC34132o.m107864I(objM121327e);
            }
            fFloatValue = ((Number) objM121327e).floatValue();
            c37812i = c37812i2;
            return new Float(c37812i.m121325c(fFloatValue));
        }
        AbstractC34132o.m107864I(objM121327e);
        C37805b c37805b = this.f161946a;
        C37806c c37806cM121322e2 = c37805b.m121322e();
        if (c37806cM121322e2 == null) {
            return new Float(f13);
        }
        if (c37806cM121322e2.m121323a() == i13 && c37805b.m121320c(c37806cM121322e2.m121323a()) == 0) {
            return new Float(m121325c(f13));
        }
        if (Math.abs(f13) >= 0.5f) {
            float fM30563k = AbstractC11348f.m30563k(this.f161947b, 0.0f, f13);
            if (f13 >= 0.0f ? fM30563k >= c37805b.m121320c(c37806cM121322e2.m121323a() + 1) : fM30563k <= c37805b.m121320c(c37806cM121322e2.m121323a())) {
                c37808e3.f161926w = this;
                c37808e3.f161927x = interfaceC16413k2;
                c37808e3.f161928y = i13;
                c37808e3.f161929z = f13;
                c37808e3.f161925G = 1;
                c37808e2 = c37808e3;
                objM121327e = m121327e(interfaceC16413k2, c37806cM121322e2, i13, f13, true, c37808e2);
                if (objM121327e != enumC31071a) {
                    c37812i = this;
                    interfaceC16413k3 = interfaceC16413k2;
                    i14 = i13;
                    f14 = f13;
                }
            }
            return enumC31071a;
        }
        interfaceC16413k4 = interfaceC16413k2;
        i15 = i13;
        fFloatValue = f13;
        c37808e2 = c37808e3;
        c37812i = this;
        f14 = fFloatValue;
        c37806cM121322e = c37812i.f161946a.m121322e();
        if (c37806cM121322e == null) {
            return new Float(f14);
        }
        if (c37806cM121322e.m121323a() == i15 || c37812i.f161946a.m121320c(i15) != 0) {
            c37808e2.f161926w = c37812i;
            c37808e2.f161927x = null;
            c37808e2.f161925G = 2;
            objM121327e = c37812i.m121328f(interfaceC16413k4, c37806cM121322e, i15, fFloatValue, c37808e2);
            if (objM121327e != enumC31071a) {
                c37812i2 = c37812i;
                fFloatValue = ((Number) objM121327e).floatValue();
                c37812i = c37812i2;
            }
            return enumC31071a;
        }
        return new Float(c37812i.m121325c(fFloatValue));
        interfaceC16413k4 = interfaceC16413k3;
        i15 = i14;
        fFloatValue = ((Number) objM121327e).floatValue();
        c37806cM121322e = c37812i.f161946a.m121322e();
        if (c37806cM121322e == null) {
            return new Float(f14);
        }
        if (c37806cM121322e.m121323a() == i15) {
        }
        c37808e2.f161926w = c37812i;
        c37808e2.f161927x = null;
        c37808e2.f161925G = 2;
        objM121327e = c37812i.m121328f(interfaceC16413k4, c37806cM121322e, i15, fFloatValue, c37808e2);
        if (objM121327e != enumC31071a) {
            c37812i2 = c37812i;
            fFloatValue = ((Number) objM121327e).floatValue();
            c37812i = c37812i2;
            return new Float(c37812i.m121325c(fFloatValue));
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: e */
    public final Object m121327e(InterfaceC16413k2 interfaceC16413k2, C37806c c37806c, int i13, float f13, boolean z4, AbstractC32269c abstractC32269c) throws Throwable {
        C37809f c37809f;
        Throwable th3;
        C37812i c37812i;
        C22663d0 c22663d0;
        if (abstractC32269c instanceof C37809f) {
            c37809f = (C37809f) abstractC32269c;
            int i14 = c37809f.f161930E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c37809f.f161930E = i14 - Integer.MIN_VALUE;
            } else {
                c37809f = new C37809f(this, abstractC32269c);
            }
        } else {
            c37809f = new C37809f(this, abstractC32269c);
        }
        C37809f c37809f2 = c37809f;
        Object obj = c37809f2.f161933y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c37809f2.f161930E;
        if (i15 != 0) {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22663d0 = c37809f2.f161932x;
            c37812i = c37809f2.f161931w;
            try {
                AbstractC34132o.m107864I(obj);
                c37812i.m121329g(null);
                return new Float(c22663d0.f89331w);
            } catch (Throwable th4) {
                th3 = th4;
                c37812i.m121329g(null);
                throw th3;
            }
        }
        AbstractC34132o.m107864I(obj);
        if (c37806c.m121323a() == i13 && this.f161946a.m121320c(c37806c.m121323a()) == 0) {
            return new Float(m121325c(f13));
        }
        C22663d0 c22663d1 = new C22663d0();
        c22663d1.f89331w = f13;
        C22663d0 c22663d2 = new C22663d0();
        boolean z13 = z4 && Math.abs(i13 - c37806c.m121323a()) >= 2;
        try {
            m121329g(new Integer(i13));
            C11376m c11376mM30554b = AbstractC11348f.m30554b(0.0f, f13, 28);
            C11413x c11413x = this.f161947b;
            C37810g c37810g = new C37810g(c22663d2, interfaceC16413k2, c22663d1, this, z13, i13);
            c37809f2.f161931w = this;
            c37809f2.f161932x = c22663d1;
            c37809f2.f161930E = 1;
            if (AbstractC11348f.m30558f(c11376mM30554b, c11413x, false, c37810g, c37809f2) == enumC31071a) {
                return enumC31071a;
            }
            c37812i = this;
            c22663d0 = c22663d1;
            c37812i.m121329g(null);
            return new Float(c22663d0.f89331w);
        } catch (Throwable th5) {
            th3 = th5;
            c37812i = this;
            c37812i.m121329g(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: f */
    public final Object m121328f(InterfaceC16413k2 interfaceC16413k2, C37806c c37806c, int i13, float f13, AbstractC32269c abstractC32269c) throws Throwable {
        C37811h c37811h;
        Throwable th3;
        C37812i c37812i;
        C22663d0 c22663d0;
        if (abstractC32269c instanceof C37811h) {
            c37811h = (C37811h) abstractC32269c;
            int i14 = c37811h.f161941E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c37811h.f161941E = i14 - Integer.MIN_VALUE;
            } else {
                c37811h = new C37811h(this, abstractC32269c);
            }
        } else {
            c37811h = new C37811h(this, abstractC32269c);
        }
        C37811h c37811h2 = c37811h;
        Object obj = c37811h2.f161944y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c37811h2.f161941E;
        if (i15 != 0) {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22663d0 = c37811h2.f161943x;
            c37812i = c37811h2.f161942w;
            try {
                AbstractC34132o.m107864I(obj);
                c37812i.m121329g(null);
                return new Float(c22663d0.f89331w);
            } catch (Throwable th4) {
                th3 = th4;
                c37812i.m121329g(null);
                throw th3;
            }
        }
        AbstractC34132o.m107864I(obj);
        C22663d0 c22663d1 = new C22663d0();
        float f14 = 0.0f;
        if ((i13 > c37806c.m121323a() && f13 > 0.0f) || (i13 <= c37806c.m121323a() && f13 < 0.0f)) {
            f14 = f13;
        }
        c22663d1.f89331w = f14;
        C22663d0 c22663d2 = new C22663d0();
        try {
            m121329g(new Integer(i13));
            C11376m c11376mM30554b = AbstractC11348f.m30554b(c22663d2.f89331w, c22663d1.f89331w, 28);
            Float f15 = new Float(this.f161946a.m121320c(i13));
            InterfaceC11372l interfaceC11372l = this.f161948c;
            C15254z c15254z = new C15254z(c22663d2, interfaceC16413k2, c22663d1, this, i13);
            c22663d0 = c22663d1;
            c37811h2.f161942w = this;
            c37811h2.f161943x = c22663d0;
            c37811h2.f161941E = 1;
            if (AbstractC11348f.m30561i(c11376mM30554b, f15, interfaceC11372l, false, c15254z, c37811h2, 4) == enumC31071a) {
                return enumC31071a;
            }
            c37812i = this;
            c37812i.m121329g(null);
            return new Float(c22663d0.f89331w);
        } catch (Throwable th5) {
            th3 = th5;
            c37812i = this;
            c37812i.m121329g(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m121329g(Integer num) {
        this.f161951f.setValue(num);
    }
}
