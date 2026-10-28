package p710im1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp0.C10999t0;
import gb1.AbstractC15673b0;
import hy0.C17794v;
import ig0.C18464d;
import ih0.C18510t;
import ih1.C18518b;
import ik2.C18613a;
import java.util.WeakHashMap;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: im1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lik2/a;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onDayOneTransitionOverlayShowing", "Lkotlin/Function0;", "onButtonClick", "f", "(Lik2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "k", "(Lik2/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18672h {
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:75:0x016c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0178  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m54207f(C18613a viewState, Function1 function1, InterfaceC4339a onButtonClick, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        int i16;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onButtonClick, "onButtonClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-181510140);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(onButtonClick)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C18510t(16);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (((Boolean) interfaceC28601c1.getValue()).booleanValue() || !viewState.getDisplay()) {
                    c28655q.m87150e0(-3930722);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-4431403);
                    function3.invoke(Boolean.TRUE);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    Object objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC11266d.m30453g(c28655q);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R3;
                    Object objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C18518b(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3407d, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R4, 28);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q, 6);
                    int iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
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
                    boolean z13 = (i15 & 896) == 256;
                    Object objM87133R5 = c28655q.m87133R();
                    if (z13 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C10999t0(onButtonClick, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i18 = AbstractC22403o.f87638a;
                    int i19 = TextResource.$stable;
                    m54212k(viewState, (InterfaceC4339a) objM87133R5, c28655q, (i15 & 14) | i18 | i19 | i19 | i19 | i19);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                function2 = function3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 16, (Object) viewState, (Object) onButtonClick, function2);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(onButtonClick)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18510t(16);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (((Boolean) interfaceC28601c1.getValue()).booleanValue()) {
                c28655q.m87150e0(-3930722);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-3930722);
                c28655q.m87173q(false);
            }
            function2 = function3;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 16, (Object) viewState, (Object) onButtonClick, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m54208g(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m54209h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m54210i(InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a interfaceC4339a) {
        interfaceC28601c1.setValue(Boolean.FALSE);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m54211j(C18613a c18613a, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m54207f(c18613a, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m54212k(C18613a c18613a, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        int i15;
        float f13;
        C2314t c2314t;
        InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-243551579);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c18613a) : c28655q.m87157i(c18613a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifierM3357b = AbstractC1092a.m3357b(modifierM3407d, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i17).getTransparent()), new C17919x(C17919x.m51541c(0.95f, c38072d.m121949b(c28655q, i17).getBrandBlack()))), 0.0f, 900.0f, 8), null, 0.0f, 6);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3357b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9105H);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            float f14 = 8;
            float f15 = 2 * f14;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15, AbstractC22953f.m66727p(modifierMo3400a, C22949e.m66712e(c28655q).f90558e));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (c18613a.getImageUrl() == null) {
                c28655q.m87150e0(1706642982);
                c28655q.m87173q(false);
                c2314t = c2314t2;
                f13 = 1.0f;
            } else {
                c28655q.m87150e0(1706642983);
                f13 = 1.0f;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c18613a.getImageUrl(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, c2314t2, null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                c2314t = c2314t2;
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            TextResource textResourceM53875e = c18613a.getHeaderTitle();
            int i18 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM53875e, c28655q, i18);
            C2886a c2886aM8416N = r17.m121952e(c28655q, r14).getT1();
            long jM125430y = r17.m121949b(c28655q, r14).getBrandWhite();
            int i19 = C2886a.f11498d << 18;
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q2, 0, i19, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c18613a.getBodyText(), c28655q, i18), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 5, 0, null, r17.m121952e(c28655q, r14).getB1(), null, c28655q2, 0, i19 | 3120, 186362);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3396r(c2314t, 0.0f, ((float) 0.5d) * f14, 1));
            interfaceC4339a2 = interfaceC4339a;
            i15 = 4;
            AbstractC27282u.m82292h(AbstractC1102d.m3409f(f13, AbstractC27282u.m82299o(c2314t, AbstractC15673b0.m43983F0())), EnumC27284v.TextLarge, AbstractC8693b.m21274h(c18613a.getButtonText(), c28655q, i18), false, 0L, null, false, interfaceC4339a2, c28655q2, (29360128 & (i16 << 18)) | 48, 120);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            i15 = 4;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(c18613a, interfaceC4339a2, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m54213l(C18613a c18613a, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m54212k(c18613a, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
