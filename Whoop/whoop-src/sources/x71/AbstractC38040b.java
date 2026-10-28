package x71;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import az0.C2158a;
import gb1.AbstractC15676d;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.C28761b0;
import p505ts.AbstractC34132o;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import vb1.C35868a;
import wb3.AbstractC37056f;
import wr0.C37550r;

/* JADX INFO: renamed from: x71.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lx71/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lx71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38040b {
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x0100  */
    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    /* JADX WARN: Code duplicated, block: B:79:0x0125  */
    /* JADX WARN: Code duplicated, block: B:82:0x013b  */
    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0165  */
    /* JADX WARN: Code duplicated, block: B:86:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m121791e(Modifier modifier, C38042d viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifierM3411h;
        Function1 function5;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1922307852);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
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
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35868a(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                if (viewState.getDestination() != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(viewState))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R = c28655q.m87133R();
                if (z16 || objM87133R == c28676v0) {
                    objM87133R = new C28761b0(18, viewState, function4);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3409f, z13, (Function1) objM87133R);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44099b);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                modifierM3411h = AbstractC1102d.m3411h(3 * 4, c2314t);
                if (viewState.getIcon() != null) {
                    c28655q.m87150e0(-136192394);
                    AbstractC29125c.m88524d(AbstractC34132o.m107874S(viewState.getIcon().toWhoopIcon(), c28655q, 6), null, modifierM3411h, null, c28655q, 25008, 104);
                    c28655q.m87173q(false);
                    function5 = function4;
                } else if (viewState.getTypeImage() != null) {
                    c28655q.m87150e0(-135866584);
                    function5 = function4;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getTypeImage(), null, null, c28655q, 0, 3), null, modifierM3411h, null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                    c28655q.m87173q(false);
                } else {
                    function5 = function4;
                    c28655q.m87150e0(-135617902);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier2;
                function3 = function5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2158a(modifier3, viewState, function3, i13, i14, 11);
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
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35868a(15);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            if (viewState.getDestination() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i15 & 112) != 32) {
                z14 = true;
            } else {
                z14 = true;
            }
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objM87133R = c28655q.m87133R();
            if (z16) {
                objM87133R = new C28761b0(18, viewState, function4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C28761b0(18, viewState, function4);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM3409f2, z13, (Function1) objM87133R);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44099b2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            modifierM3411h = AbstractC1102d.m3411h(3 * 4, c2314t);
            if (viewState.getIcon() != null) {
                c28655q.m87150e0(-136192394);
                AbstractC29125c.m88524d(AbstractC34132o.m107874S(viewState.getIcon().toWhoopIcon(), c28655q, 6), null, modifierM3411h, null, c28655q, 25008, 104);
                c28655q.m87173q(false);
                function5 = function4;
            } else if (viewState.getTypeImage() != null) {
                c28655q.m87150e0(-135866584);
                function5 = function4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getTypeImage(), null, null, c28655q, 0, 3), null, modifierM3411h, null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q.m87173q(false);
            } else {
                function5 = function4;
                c28655q.m87150e0(-135617902);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier2;
            function3 = function5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(modifier3, viewState, function3, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m121792f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m121793g(C38042d c38042d, Function1 function1, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1772c1.m5391i(applyIf, false, null, new C37550r(9, c38042d, function1), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m121794h(C38042d c38042d, Function1 function1) {
        if (c38042d.getDestination() != null) {
            function1.invoke(c38042d.getDestination());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m121795i(Modifier modifier, C38042d c38042d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m121791e(modifier, c38042d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
