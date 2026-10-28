package b01;

import a01.C0089i;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import gz0.EnumC16313m0;
import kotlin.C1991b1;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C17820i;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: b01.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lb01/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onAction", "d", "(Lb01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2181b {
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x017c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m6868d(C2182c viewState, Function1 function1, Composer composer, int i13, int i14) {
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
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        EnumC16313m0 trailingIcon;
        Integer numValueOf;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1310037860);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
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
                        objM87133R2 = new C1991b1(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                boolean zM87157i = c28655q.m87157i(viewState);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | zM87157i;
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C17820i(12, viewState, function4);
                    c28655q.m87172p0(objM87133R);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15)));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
                String text = viewState.getText();
                c38072d = C38072d.f163053a;
                C2886a b6 = c38072d.m121952e(c28655q, 6).getB1();
                long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Function1 function5 = function4;
                AbstractC30795n.m94707h(text, new LayoutWeightElement(1.0f, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                trailingIcon = viewState.getTrailingIcon();
                if (trailingIcon != null) {
                    numValueOf = Integer.valueOf(trailingIcon.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    c28655q.m87150e0(1990889083);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1990889084);
                    float f13 = 4;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(numValueOf.intValue(), c28655q, 0), null, AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(viewState, i13, function3, i14, 10);
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
                    objM87133R2 = new C1991b1(29);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            boolean zM87157i2 = c28655q.m87157i(viewState);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | zM87157i2;
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C17820i(12, viewState, function4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C17820i(12, viewState, function4);
                c28655q.m87172p0(objM87133R);
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15)));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
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
            String text2 = viewState.getText();
            c38072d = C38072d.f163053a;
            C2886a b8 = c38072d.m121952e(c28655q, 6).getB1();
            long brandWhite2 = c38072d.m121949b(c28655q, 6).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Function1 function6 = function4;
            AbstractC30795n.m94707h(text2, new LayoutWeightElement(1.0f, true), brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q, 0, 0, 196600);
            c28655q = c28655q;
            trailingIcon = viewState.getTrailingIcon();
            if (trailingIcon != null) {
                numValueOf = Integer.valueOf(trailingIcon.toWhoopIcon());
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                c28655q.m87150e0(1990889083);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1990889084);
                float f14 = 4;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(numValueOf.intValue(), c28655q, 0), null, AbstractC1102d.m3419p(f14 * f14, c2314t), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(viewState, i13, function3, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m6869e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m6870f(C2182c c2182c, Function1 function1) {
        Object modal = c2182c.getModal();
        if (modal != null) {
            function1.invoke(modal);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m6871g(C2182c c2182c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m6868d(c2182c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
