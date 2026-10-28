package c41;

import a01.C0085e;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import az1.C2161b;
import bs1.C3603v;
import c31.C3929m;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.InterfaceC14948a1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import sy0.AbstractC33085h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c41.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/r;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4117t {
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:63:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    /* JADX WARN: Code duplicated, block: B:78:0x016c  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m12688e(Modifier modifier, C4103r state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z15;
        boolean zM87153g;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(143916516);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3929m(6);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                boolean zM87157i = c28655q2.m87157i(state);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i | z13;
                objM87133R = c28655q2.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C3603v(state, function4, 6);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R;
                float fMax = Math.max(((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getFontScale(), 1.0f);
                float f13 = 4;
                float f14 = 7 * f13 * fMax;
                float f15 = f13 * f13 * fMax;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 8), C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC4124u.m12707c(state, interfaceC4339a, new LayoutWeightElement(1.0f, true), c28655q2, (i15 >> 3) & 14, 0);
                if (AbstractC4110s.m12668a(state) || !state.getIsSelected()) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                boolean zM12668a = AbstractC4110s.m12668a(state);
                InterfaceC14948a1 interfaceC14948a1M12710f = AbstractC4124u.m12710f(c28655q2, 0);
                zM87153g = c28655q2.m87153g(interfaceC4339a);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2161b(interfaceC4339a, 5);
                    c28655q2.m87172p0(objM87133R2);
                }
                modifier3 = modifier4;
                c28655q = c28655q2;
                AbstractC33085h.m104813c(null, z15, (Function1) objM87133R2, zM12668a, null, interfaceC14948a1M12710f, null, f14, f15, c28655q, 0, 81);
                c28655q2.m87173q(true);
                function3 = function4;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(modifier3, state, function3, i13, i14, 27);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3929m(6);
                    c28655q2.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            boolean zM87157i2 = c28655q2.m87157i(state);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i2 | z13;
            objM87133R = c28655q2.m87133R();
            if (z14) {
                objM87133R = new C3603v(state, function4, 6);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C3603v(state, function4, 6);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC4339a = (InterfaceC4339a) objM87133R;
            float fMax2 = Math.max(((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).getFontScale(), 1.0f);
            float f16 = 4;
            float f17 = 7 * f16 * fMax2;
            float f18 = f16 * f16 * fMax2;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 8), C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC4124u.m12707c(state, interfaceC4339a, new LayoutWeightElement(1.0f, true), c28655q2, (i15 >> 3) & 14, 0);
            if (AbstractC4110s.m12668a(state)) {
                z15 = false;
            } else {
                z15 = false;
            }
            boolean zM12668a2 = AbstractC4110s.m12668a(state);
            InterfaceC14948a1 interfaceC14948a1M12710f2 = AbstractC4124u.m12710f(c28655q2, 0);
            zM87153g = c28655q2.m87153g(interfaceC4339a);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R2 = new C2161b(interfaceC4339a, 5);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2161b(interfaceC4339a, 5);
                c28655q2.m87172p0(objM87133R2);
            }
            modifier3 = modifier4;
            c28655q = c28655q2;
            AbstractC33085h.m104813c(null, z15, (Function1) objM87133R2, zM12668a2, null, interfaceC14948a1M12710f2, null, f17, f18, c28655q, 0, 81);
            c28655q2.m87173q(true);
            function3 = function4;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(modifier3, state, function3, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m12689f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m12690g(C4103r c4103r, Function1 function1) {
        if (AbstractC4110s.m12668a(c4103r)) {
            function1.invoke(new C4131v(c4103r.getActivityV2Id(), !c4103r.getIsSelected()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m12691h(InterfaceC4339a interfaceC4339a, boolean z4) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12692i(Modifier modifier, C4103r c4103r, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12688e(modifier, c4103r, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
