package k21;

import a80.C0545i;
import am2.C1029l0;
import am2.C1031m0;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import jp1.C21852d;
import jp2.C21875f;
import kd1.AbstractC22404p;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.AbstractC27271o0;
import ny0.AbstractC27292z;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: k21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lk21/d;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Lk21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22159c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m63425g(Modifier modifier, C22160d c22160d, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1521047831);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c22160d) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21875f(18);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                float f13 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(modifier3, ((float) 0.5d) * f13, 1 * f13);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                AbstractC31926e.m99375j(null, null, c38072d.m121949b(c28655q, 6).getTransparent(), null, AbstractC17269i.m48880a((float) 1.5d, c38072d.m121949b(c28655q, 6).getWhite10()), null, 0.0f, AbstractC37817c.m121344e(-1336087953, c28655q, new C1029l0(c22160d, function4, 1)), c28655q, 12582912, 107);
                c28655q.m87173q(true);
                function3 = function4;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(modifier2, c22160d, function3, i13, i14, 6);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21875f(18);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            float f14 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifier3, ((float) 0.5d) * f14, 1 * f14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC31926e.m99375j(null, null, c38072d2.m121949b(c28655q, 6).getTransparent(), null, AbstractC17269i.m48880a((float) 1.5d, c38072d2.m121949b(c28655q, 6).getWhite10()), null, 0.0f, AbstractC37817c.m121344e(-1336087953, c28655q, new C1029l0(c22160d, function4, 1)), c28655q, 12582912, 107);
            c28655q.m87173q(true);
            function3 = function4;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(modifier2, c22160d, function3, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m63426h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m63427i(C22160d c22160d, Function1 function1, Composer composer, int i13) {
        C28676v0 c28676v0;
        boolean z4;
        int i14 = 1;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            float f15 = 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, f15 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c22160d.getImage(), null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(25 * f15, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
            String strM63438g = c22160d.getTitle();
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM63438g, modifierM3398t, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getT4(), null, c28655q, 48, 0, 196088);
            float f16 = 1 * f13;
            AbstractC30795n.m94707h(c22160d.getSubtitle(), AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, f16, 5), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 48, 0, 196088);
            C28655q c28655q2 = c28655q;
            C22157a c22157aM63435c = c22160d.getPrimaryButtonState();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (c22157aM63435c == null) {
                c28655q2.m87150e0(1468767352);
                c28655q2.m87173q(false);
                z4 = false;
                c28676v0 = c28676v1;
            } else {
                c28655q2.m87150e0(1468767353);
                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1102d.m3409f(1.0f, c2314t));
                TextResource title = c22157aM63435c.getTitle();
                boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87157i(c22157aM63435c);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == c28676v1) {
                    objM87133R = new C1031m0(function1, c22157aM63435c, i14);
                    c28655q2.m87172p0(objM87133R);
                }
                c28676v0 = c28676v1;
                AbstractC27292z.m82343j(modifierM3394p, false, false, null, null, null, title, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q2, 6, 0, 8126);
                c28655q2 = c28655q2;
                z4 = false;
                c28655q2.m87173q(false);
            }
            C22157a c22157aM63436e = c22160d.getSecondaryButtonState();
            if (c22157aM63436e == null) {
                c28655q2.m87150e0(1469206715);
                c28655q2.m87173q(z4);
            } else {
                c28655q2.m87150e0(1469206716);
                TextResource title2 = c22157aM63436e.getTitle();
                int iM53359E = AbstractC18489d0.m53359E(c38072d);
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C28655q c28655q3 = c28655q2;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q2, 6).getTransparent(), c38072d.m121949b(c28655q2, 6).getRecovery(), 0L, 0L, c28655q3, 0, 12);
                Integer numValueOf = Integer.valueOf(iM53359E);
                boolean zM87153g2 = c28655q3.m87153g(function1) | c28655q3.m87157i(c22157aM63436e);
                Object objM87133R2 = c28655q3.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C1031m0(function1, c22157aM63436e, 2);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC27271o0.m82253b(c2314t, false, title2, null, c15077m1M43196a, null, numValueOf, null, false, null, (InterfaceC4339a) objM87133R2, c28655q3, 100859910, 0, 650);
                c28655q2 = c28655q3;
                z4 = false;
                c28655q2.m87173q(false);
            }
            C27256h c27256hM63433a = c22160d.getCardButtonState();
            if (c27256hM63433a == null) {
                c28655q2.m87150e0(1469931960);
                c28655q2.m87173q(z4);
            } else {
                c28655q2.m87150e0(1469931961);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                boolean zM87153g3 = c28655q2.m87153g(function1) | c28655q2.m87157i(c27256hM63433a);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C0545i(function1, c27256hM63433a, 5);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC27249e.m82121d(modifierM3409f, c27256hM63433a, null, (InterfaceC4339a) objM87133R3, c28655q2, 6, 4);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m63428j(Function1 function1, C22157a c22157a) {
        function1.invoke(c22157a.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m63429k(Function1 function1, C22157a c22157a) {
        function1.invoke(c22157a.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m63430l(Function1 function1, C27256h c27256h) {
        function1.invoke(c27256h);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m63431m(Modifier modifier, C22160d c22160d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m63425g(modifier, c22160d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
