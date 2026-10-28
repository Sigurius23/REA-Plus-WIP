package p291l0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bp0.C3527o;
import p000.AbstractC11266d;
import p002a0.C0057v0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.InterfaceC2302h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22989q {

    /* JADX INFO: renamed from: a */
    public static final C0057v0 f90691a = m66762c(true);

    /* JADX INFO: renamed from: b */
    public static final C0057v0 f90692b = m66762c(false);

    /* JADX INFO: renamed from: c */
    public static final C22998t f90693c = new C22998t(C2299e.f9114w, false);

    /* JADX INFO: renamed from: d */
    public static final C22986p f90694d = C22986p.f90677b;

    /* JADX INFO: renamed from: a */
    public static final void m66760a(Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-211209833);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            int iHashCode = Long.hashCode(c28655q.f115904T);
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, f90694d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(modifier, i13, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m66761b(AbstractC39101i1 abstractC39101i1, AbstractC39104j1 abstractC39104j1, InterfaceC39124q0 interfaceC39124q0, EnumC39181m enumC39181m, int i13, int i14, InterfaceC2302h interfaceC2302h) {
        InterfaceC2302h interfaceC2302h2;
        Object objMo454p = interfaceC39124q0.mo454p();
        C22983o c22983o = objMo454p instanceof C22983o ? (C22983o) objMo454p : null;
        AbstractC39101i1.m124623k(abstractC39101i1, abstractC39104j1, ((c22983o == null || (interfaceC2302h2 = c22983o.f90672O) == null) ? interfaceC2302h : interfaceC2302h2).mo7156a((((long) abstractC39104j1.f168211w) << 32) | (((long) abstractC39104j1.f168212x) & 4294967295L), (((long) i13) << 32) | (((long) i14) & 4294967295L), enumC39181m));
    }

    /* JADX INFO: renamed from: c */
    public static final C0057v0 m66762c(boolean z4) {
        C0057v0 c0057v0 = new C0057v0(9);
        C2307m c2307m = C2299e.f9114w;
        c0057v0.m135m(c2307m, new C22998t(c2307m, z4));
        C2307m c2307m2 = C2299e.f9115x;
        c0057v0.m135m(c2307m2, new C22998t(c2307m2, z4));
        C2307m c2307m3 = C2299e.f9116y;
        c0057v0.m135m(c2307m3, new C22998t(c2307m3, z4));
        C2307m c2307m4 = C2299e.f9117z;
        c0057v0.m135m(c2307m4, new C22998t(c2307m4, z4));
        C2307m c2307m5 = C2299e.f9102E;
        c0057v0.m135m(c2307m5, new C22998t(c2307m5, z4));
        C2307m c2307m6 = C2299e.f9103F;
        c0057v0.m135m(c2307m6, new C22998t(c2307m6, z4));
        C2307m c2307m7 = C2299e.f9104G;
        c0057v0.m135m(c2307m7, new C22998t(c2307m7, z4));
        C2307m c2307m8 = C2299e.f9105H;
        c0057v0.m135m(c2307m8, new C22998t(c2307m8, z4));
        C2307m c2307m9 = C2299e.f9106I;
        c0057v0.m135m(c2307m9, new C22998t(c2307m9, z4));
        return c0057v0;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC39127r0 m66763d(InterfaceC2302h interfaceC2302h, boolean z4) {
        InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) (z4 ? f90691a : f90692b).m129g(interfaceC2302h);
        return interfaceC39127r0 == null ? new C22998t(interfaceC2302h, z4) : interfaceC39127r0;
    }

    /* JADX INFO: renamed from: e */
    public static final C22998t m66764e(InterfaceC2302h interfaceC2302h, boolean z4, Composer composer, int i13) {
        if (AbstractC22676k.m65745e(interfaceC2302h, C2299e.f9114w) && !z4) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(244367063);
            c28655q.m87173q(false);
            return f90693c;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(244414741);
        boolean z13 = true;
        boolean z14 = (((i13 & 14) ^ 6) > 4 && c28655q2.m87153g(interfaceC2302h)) || (i13 & 6) == 4;
        if ((((i13 & 112) ^ 48) <= 32 || !c28655q2.m87155h(z4)) && (i13 & 48) != 32) {
            z13 = false;
        }
        boolean z15 = z14 | z13;
        Object objM87133R = c28655q2.m87133R();
        if (z15 || objM87133R == C28635l.f115821a) {
            objM87133R = new C22998t(interfaceC2302h, z4);
            c28655q2.m87172p0(objM87133R);
        }
        C22998t c22998t = (C22998t) objM87133R;
        c28655q2.m87173q(false);
        return c22998t;
    }
}
