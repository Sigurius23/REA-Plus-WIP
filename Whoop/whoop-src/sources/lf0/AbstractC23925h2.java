package lf0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l01.C23045q;
import l72.C23401h;
import l83.C23454a0;
import lc0.C23825g;
import ld0.C23860s;
import md0.AbstractC25448c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.h2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lld0/s;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lld0/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23925h2 {
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:71:0x019e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dd A[LOOP:0: B:79:0x01d7->B:81:0x01dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0232  */
    /* JADX WARN: Code duplicated, block: B:86:0x023d  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m70392d(Modifier modifier, C23860s viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        C28655q c28655q2;
        int iHashCode2;
        Iterator<T> it;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(640262101);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23825g(18);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                boolean zM87157i = c28655q3.m87157i(viewState);
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i;
                objM87133R = c28655q3.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C23045q(13, viewState, function4);
                    c28655q3.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f13 = 4;
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(3, f13, C2299e.f9108K, c28655q3, 54);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M53376q);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                float f14 = 2 * f13;
                function5 = function4;
                Modifier modifier3 = modifier2;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(18 * f13, c2314t), AbstractC33253j.m105489e(f14)), null, C39102j.f168199a, 0.0f, null, c28655q3, 24624, 104);
                c28655q2 = c28655q3;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                c28655q2.m87150e0(-1767948522);
                it = viewState.m70112c().iterator();
                while (it.hasNext()) {
                    C28655q c28655q4 = c28655q2;
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC25448c.m74678B0(), null, function5, c28655q4, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                    c28655q2 = c28655q4;
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(viewState.getRightIcon().toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite(), c28655q, 432, 0);
                c28655q.m87173q(true);
                modifier2 = modifier3;
                function3 = function5;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 20, (Object) modifier2, (Object) viewState, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23825g(18);
                    c28655q3.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            boolean zM87157i2 = c28655q3.m87157i(viewState);
            if ((i16 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zM87157i2;
            objM87133R = c28655q3.m87133R();
            if (z14) {
                objM87133R = new C23045q(13, viewState, function4);
                c28655q3.m87172p0(objM87133R);
            } else {
                objM87133R = new C23045q(13, viewState, function4);
                c28655q3.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f15 = 4;
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(3, f15, C2299e.f9108K, c28655q3, 54);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3362g2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i5, c22994r1M53376q2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N3);
            float f16 = 2 * f15;
            function5 = function4;
            Modifier modifier4 = modifier2;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(18 * f15, c2314t), AbstractC33253j.m105489e(f16)), null, C39102j.f168199a, 0.0f, null, c28655q3, 24624, 104);
            c28655q2 = c28655q3;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), C2299e.f9110M, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            c28655q2.m87150e0(-1767948522);
            it = viewState.m70112c().iterator();
            while (it.hasNext()) {
                C28655q c28655q5 = c28655q2;
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC25448c.m74678B0(), null, function5, c28655q5, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                c28655q2 = c28655q5;
            }
            c28655q2.m87173q(false);
            c28655q2.m87173q(true);
            c28655q = c28655q2;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(viewState.getRightIcon().toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(f15 * f15, c2314t), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
            modifier2 = modifier4;
            function3 = function5;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 20, (Object) modifier2, (Object) viewState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m70393e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m70394f(C23860s c23860s, Function1 function1) {
        C9598e c9598eM70110a = c23860s.getDestination();
        if (c9598eM70110a != null) {
            function1.invoke(c9598eM70110a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m70395g(Modifier modifier, C23860s c23860s, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70392d(modifier, c23860s, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
