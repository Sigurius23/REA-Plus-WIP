package q11;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import bm0.C3407j;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import gy0.AbstractC16277f;
import i91.AbstractC18249c;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3760m1;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p725ot1.C28329e;
import p727py0.C29618c;
import ph1.C29244h;
import pt2.C29529k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: q11.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0016²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, m65681d2 = {"Lq11/i;", "viewState", "", "index", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Lq11/i;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "descriptionDisplay", "Lkotlin/Function0;", "onClick", "s", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "isExpanded", "", "rotationAngle", "Li2/x;", "backgroundColor", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29798h {
    /* JADX WARN: Code duplicated, block: B:100:0x0308  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x026e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0278  */
    /* JADX WARN: Code duplicated, block: B:97:0x02fe  */
    /* JADX INFO: renamed from: i */
    public static final void m91274i(C29799i c29799i, final int i13, Function1 function1, Composer composer, int i14, int i15) {
        int i16;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        float f13;
        long jM95628d;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        float f14;
        boolean z13;
        boolean z14;
        boolean zM87157i;
        Object c29796f;
        C0209i c0209i3;
        boolean z15;
        final InterfaceC28601c1 interfaceC28601c2;
        int iHashCode2;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        final C29799i viewState = c29799i;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-690492824);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87157i(viewState) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        int i17 = i15 & 4;
        if (i17 == 0) {
            if ((i14 & 384) == 0) {
                function2 = function1;
                i16 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C29529k(20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    if (i13 == 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R = AbstractC31061c.m95647w(z17, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m91276k(interfaceC28601c1)) {
                    f13 = -180.0f;
                } else {
                    f13 = 0.0f;
                }
                InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
                if (m91276k(interfaceC28601c1)) {
                    c28655q.m87150e0(-2138624978);
                    jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2138623953);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                InterfaceC28670t2 interfaceC28670t2M11569a = AbstractC3760m1.m11569a(jM95628d, null, null, c28655q, 0, 14);
                c2314t = C2314t.f9131w;
                Modifier modifierM52565c = AbstractC18249c.m52565c(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC18249c.m52577o(m91279n(interfaceC28670t2M11569a)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM52565c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                C0209i c0209i4 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                f14 = 8;
                Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3409f, 2 * f14, ((float) 2.5d) * f14);
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | z13 | c28655q.m87157i(viewState);
                Object objM87133R3 = c28655q.m87133R();
                if (!zM87157i || objM87133R3 == c28676v0) {
                    c0209i3 = c0209i;
                    z15 = false;
                    Function1 function5 = function4;
                    c29796f = new C29796f(function5, i13, viewState, interfaceC28601c1, 0);
                    function4 = function5;
                    viewState = viewState;
                    interfaceC28601c2 = interfaceC28601c1;
                    c28655q.m87172p0(c29796f);
                } else {
                    c29796f = objM87133R3;
                    c0209i3 = c0209i;
                    interfaceC28601c2 = interfaceC28601c1;
                    z15 = false;
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3395q, false, null, null, (InterfaceC4339a) c29796f, 15);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                String strM91292e = viewState.getTitleDisplay();
                C38072d c38072d = C38072d.f163053a;
                z16 = z15;
                AbstractC30795n.m94707h(strM91292e, layoutWeightElement, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
                if (viewState.getRightItem() == null) {
                    c28655q.m87150e0(-698798313);
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(-698798312);
                    AbstractC25303l.m74291r(viewState.getRightItem(), null, null, null, c28655q, 0, 14);
                    AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(((float) 0.5d) * f14, c2314t));
                    c28655q.m87173q(z16);
                }
                float f15 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m91278m(interfaceC28670t2M30588b), AbstractC1102d.m3419p(f15 * f15, c2314t)), c38072d.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
                c28655q.m87173q(true);
                AbstractC1090b.m3350e(C23016z.f90757a, m91276k(interfaceC28601c2), null, null, null, null, AbstractC37817c.m121344e(-254881098, c28655q, new Function3() { // from class: q11.g
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC29798h.m91281p(viewState, function4, i13, interfaceC28601c2, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 1572870, 30);
                c28655q = c28655q;
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C29244h(viewState, i13, function3, i14, i15, 1);
            }
        }
        i16 |= 384;
        function2 = function1;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C29529k(20);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                if (i13 == 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = AbstractC31061c.m95647w(z17, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (m91276k(interfaceC28601c1)) {
                f13 = -180.0f;
            } else {
                f13 = 0.0f;
            }
            InterfaceC28670t2 interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28);
            if (m91276k(interfaceC28601c1)) {
                c28655q.m87150e0(-2138624978);
                jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2138623953);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            InterfaceC28670t2 interfaceC28670t2M11569a2 = AbstractC3760m1.m11569a(jM95628d, null, null, c28655q, 0, 14);
            c2314t = C2314t.f9131w;
            Modifier modifierM52565c2 = AbstractC18249c.m52565c(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC18249c.m52577o(m91279n(interfaceC28670t2M11569a2)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM52565c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            f14 = 8;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM3409f2, 2 * f14, ((float) 2.5d) * f14);
            if ((i16 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i16 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i = z14 | z13 | c28655q.m87157i(viewState);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                c0209i3 = c0209i;
                z15 = false;
                Function1 function6 = function4;
                c29796f = new C29796f(function6, i13, viewState, interfaceC28601c1, 0);
                function4 = function6;
                viewState = viewState;
                interfaceC28601c2 = interfaceC28601c1;
                c28655q.m87172p0(c29796f);
            } else {
                c0209i3 = c0209i;
                z15 = false;
                Function1 function7 = function4;
                c29796f = new C29796f(function7, i13, viewState, interfaceC28601c1, 0);
                function4 = function7;
                viewState = viewState;
                interfaceC28601c2 = interfaceC28601c1;
                c28655q.m87172p0(c29796f);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3395q2, false, null, null, (InterfaceC4339a) c29796f, 15);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            String strM91292e2 = viewState.getTitleDisplay();
            C38072d c38072d2 = C38072d.f163053a;
            z16 = z15;
            AbstractC30795n.m94707h(strM91292e2, layoutWeightElement2, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB1(), null, c28655q, 0, 0, 196600);
            if (viewState.getRightItem() == null) {
                c28655q.m87150e0(-698798313);
                c28655q.m87173q(z16);
            } else {
                c28655q.m87150e0(-698798312);
                AbstractC25303l.m74291r(viewState.getRightItem(), null, null, null, c28655q, 0, 14);
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(((float) 0.5d) * f14, c2314t));
                c28655q.m87173q(z16);
            }
            float f16 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), AbstractC1772c1.m5375L(m91278m(interfaceC28670t2M30588b2), AbstractC1102d.m3419p(f16 * f16, c2314t)), c38072d2.m121949b(c28655q, 6).getWhite50(), c28655q, 0, 0);
            c28655q.m87173q(true);
            AbstractC1090b.m3350e(C23016z.f90757a, m91276k(interfaceC28601c2), null, null, null, null, AbstractC37817c.m121344e(-254881098, c28655q, new Function3() { // from class: q11.g
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC29798h.m91281p(viewState, function4, i13, interfaceC28601c2, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 1572870, 30);
            c28655q = c28655q;
            c28655q.m87173q(true);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29244h(viewState, i13, function3, i14, i15, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m91275j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m91276k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m91277l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: m */
    private static final float m91278m(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: n */
    private static final long m91279n(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m91280o(Function1 function1, int i13, C29799i c29799i, InterfaceC28601c1 interfaceC28601c1) {
        m91277l(interfaceC28601c1, !m91276k(interfaceC28601c1));
        function1.invoke(new AbstractC29791a.b(i13, m91276k(interfaceC28601c1), c29799i.getId()));
        AnalyticEventModel analyticEventModelM91288a = c29799i.getAnalyticEvent();
        if (analyticEventModelM91288a != null) {
            AbstractC13673n.m38578y(null, analyticEventModelM91288a, function1);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m91281p(C29799i c29799i, Function1 function1, int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i14) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        String strM91289b = c29799i.getDescriptionDisplay();
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87149e(i13) | c28655q.m87157i(c29799i);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C29796f c29796f = new C29796f(function1, i13, c29799i, interfaceC28601c1, 1);
            c28655q.m87172p0(c29796f);
            objM87133R = c29796f;
        }
        m91284s(strM91289b, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m91282q(Function1 function1, int i13, C29799i c29799i, InterfaceC28601c1 interfaceC28601c1) {
        m91277l(interfaceC28601c1, !m91276k(interfaceC28601c1));
        function1.invoke(new AbstractC29791a.b(i13, m91276k(interfaceC28601c1), c29799i.getId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m91283r(C29799i c29799i, int i13, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m91274i(c29799i, i13, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x015d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0168  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public static final void m91284s(String descriptionDisplay, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1811122173);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87153g(descriptionDisplay) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C29618c(25);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2 * f13, 0.0f, 2), 0.0f, 0.0f, 0.0f, ((float) 2.5d) * f13, 7);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C28329e(interfaceC4339a4, 17);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3398t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
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
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(descriptionDisplay, null, c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB2(), null, c28655q2, i15 & 14, 0, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3407j(i13, i14, 2, interfaceC4339a3, descriptionDisplay);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C29618c(25);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            float f14 = 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2 * f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, ((float) 2.5d) * f14, 7);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C28329e(interfaceC4339a4, 17);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C28329e(interfaceC4339a4, 17);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3398t2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3362g2);
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
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC30795n.m94707h(descriptionDisplay, null, c38072d2.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getB2(), null, c28655q2, i15 & 14, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3407j(i13, i14, 2, interfaceC4339a3, descriptionDisplay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m91285t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m91286u(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m91287v(String str, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m91284s(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
