package w61;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import gb1.AbstractC15676d;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17903p;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p714k80.C22275d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import v61.C35736a;
import v61.C35737b;
import vb1.C35868a;
import wb3.AbstractC37056f;
import y61.C39260a;

/* JADX INFO: renamed from: w61.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ly61/a;", "group", "Lkotlin/Function1;", "Lv61/a;", "Ll83/a0;", "onCtaClicked", "d", "(Ly61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36862b {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0158  */
    /* JADX WARN: Code duplicated, block: B:59:0x0162  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m118224d(C39260a group, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        AbstractC22676k.m65750j(group, "group");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-587803806);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(group) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35868a(11);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (group.getTopIcon() == null) {
                    c28655q.m87150e0(-681357243);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-681357242);
                    String strM74110N0 = AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{"GraphOverlayIcon", group.getCta()}), "_", null, null, null, 62);
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, strM74110N0);
                    boolean zM87157i = c28655q.m87157i(group);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | zM87157i;
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == c28676v0) {
                        objM87133R = new C22275d(12, group, function4);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM44101d, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(group.getTopIcon(), null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(5 * 4, c2314t), null, null, 0.0f, new C17903p(group.getTopIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 5), c28655q, 432, 56);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35737b(group, function3, i13, i14, 1);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35868a(11);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (group.getTopIcon() == null) {
                c28655q.m87150e0(-681357243);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-681357242);
                String strM74110N1 = AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{"GraphOverlayIcon", group.getCta()}), "_", null, null, null, 62);
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t2, strM74110N1);
                boolean zM87157i2 = c28655q.m87157i(group);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i2;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C22275d(12, group, function4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C22275d(12, group, function4);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM44101d2, false, null, null, (InterfaceC4339a) objM87133R, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(group.getTopIcon(), null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(5 * 4, c2314t2), null, null, 0.0f, new C17903p(group.getTopIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 5), c28655q, 432, 56);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35737b(group, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118225e(C35736a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m118226f(C39260a c39260a, Function1 function1) {
        String cta = c39260a.getCta();
        if (cta != null) {
            function1.invoke(new C35736a(cta, c39260a.getActivityId(), c39260a.m125042g()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m118227g(C39260a c39260a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m118224d(c39260a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
