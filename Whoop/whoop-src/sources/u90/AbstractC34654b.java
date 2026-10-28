package u90;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import g80.AbstractC15561b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import t01.C33259e;
import te0.AbstractC33745d;
import u71.C34569c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: u90.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lu90/c;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Lu90/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34654b {
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m109505c(C34655c viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        float f13;
        int i18;
        int i19;
        boolean z13;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-49761087);
        int i24 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i24 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i24 |= i16;
                }
                if ((i24 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i24 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i25 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i15 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C34569c(5);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    float f14 = 8;
                    float f15 = 2 * f14;
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, modifier2), f15, 0.0f, f15, 13 * f14, 2), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
                    float f16 = 4;
                    i17 = i24;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f16, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                    c28655q = c28655q;
                    f13 = f16 * f14;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                    c28655q.m87150e0(548964573);
                    i18 = 0;
                    for (Object obj : viewState.m109509b()) {
                        i19 = i18 + 1;
                        if (i18 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C28655q c28655q2 = c28655q;
                        AbstractC25303l.m74291r((InterfaceC25312u) obj, AbstractC15561b.m43816c(), null, function4, c28655q2, (C25307p.f99300b << 3) | ((i17 << 3) & 7168), 4);
                        c28655q = c28655q2;
                        if (i18 != AbstractC37056f.m118951C(viewState.m109509b())) {
                            AbstractC33745d.m106667z(c28655q, -1089323980, c2314t, f13, c28655q);
                            z13 = false;
                        } else {
                            z13 = false;
                            c28655q.m87150e0(590740157);
                        }
                        c28655q.m87173q(z13);
                        i18 = i19;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    Modifier modifier4 = modifier2;
                    function3 = function4;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33259e(i13, i14, 15, modifier3, function3, (InterfaceC25312u) viewState);
                }
            }
            i24 |= 384;
            function2 = function1;
            if ((i24 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i15 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C34569c(5);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                float f17 = 8;
                float f18 = 2 * f17;
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, modifier2), f18, 0.0f, f18, 13 * f17, 2), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
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
                float f19 = 4;
                i17 = i24;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f19, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                f13 = f19 * f17;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                c28655q.m87150e0(548964573);
                i18 = 0;
                while (r14.hasNext()) {
                    i19 = i18 + 1;
                    if (i18 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C28655q c28655q3 = c28655q;
                    AbstractC25303l.m74291r((InterfaceC25312u) obj, AbstractC15561b.m43816c(), null, function4, c28655q3, (C25307p.f99300b << 3) | ((i17 << 3) & 7168), 4);
                    c28655q = c28655q3;
                    if (i18 != AbstractC37056f.m118951C(viewState.m109509b())) {
                        AbstractC33745d.m106667z(c28655q, -1089323980, c2314t, f13, c28655q);
                        z13 = false;
                    } else {
                        z13 = false;
                        c28655q.m87150e0(590740157);
                    }
                    c28655q.m87173q(z13);
                    i18 = i19;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                Modifier modifier5 = modifier2;
                function3 = function4;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(i13, i14, 15, modifier3, function3, (InterfaceC25312u) viewState);
            }
        }
        i24 |= 48;
        modifier2 = modifier;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i24 |= i16;
            }
            if ((i24 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i24 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier2 = c2314t;
                }
                if (i15 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C34569c(5);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                float f110 = 8;
                float f111 = 2 * f110;
                Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, modifier2), f111, 0.0f, f111, 13 * f110, 2), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                float f112 = 4;
                i17 = i24;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f112, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                f13 = f112 * f110;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                c28655q.m87150e0(548964573);
                i18 = 0;
                while (r14.hasNext()) {
                    i19 = i18 + 1;
                    if (i18 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C28655q c28655q4 = c28655q;
                    AbstractC25303l.m74291r((InterfaceC25312u) obj, AbstractC15561b.m43816c(), null, function4, c28655q4, (C25307p.f99300b << 3) | ((i17 << 3) & 7168), 4);
                    c28655q = c28655q4;
                    if (i18 != AbstractC37056f.m118951C(viewState.m109509b())) {
                        AbstractC33745d.m106667z(c28655q, -1089323980, c2314t, f13, c28655q);
                        z13 = false;
                    } else {
                        z13 = false;
                        c28655q.m87150e0(590740157);
                    }
                    c28655q.m87173q(z13);
                    i18 = i19;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                Modifier modifier6 = modifier2;
                function3 = function4;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(i13, i14, 15, modifier3, function3, (InterfaceC25312u) viewState);
            }
        }
        i24 |= 384;
        function2 = function1;
        if ((i24 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i24 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier2 = c2314t;
            }
            if (i15 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C34569c(5);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            float f113 = 8;
            float f114 = 2 * f113;
            Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, modifier2), f114, 0.0f, f114, 13 * f113, 2), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM92116f3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            float f115 = 4;
            i17 = i24;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f115, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            c28655q = c28655q;
            f13 = f115 * f113;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            c28655q.m87150e0(548964573);
            i18 = 0;
            while (r14.hasNext()) {
                i19 = i18 + 1;
                if (i18 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C28655q c28655q5 = c28655q;
                AbstractC25303l.m74291r((InterfaceC25312u) obj, AbstractC15561b.m43816c(), null, function4, c28655q5, (C25307p.f99300b << 3) | ((i17 << 3) & 7168), 4);
                c28655q = c28655q5;
                if (i18 != AbstractC37056f.m118951C(viewState.m109509b())) {
                    AbstractC33745d.m106667z(c28655q, -1089323980, c2314t, f13, c28655q);
                    z13 = false;
                } else {
                    z13 = false;
                    c28655q.m87150e0(590740157);
                }
                c28655q.m87173q(z13);
                i18 = i19;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            Modifier modifier7 = modifier2;
            function3 = function4;
            modifier3 = modifier7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(i13, i14, 15, modifier3, function3, (InterfaceC25312u) viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m109506d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m109507e(C34655c c34655c, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m109505c(c34655c, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
