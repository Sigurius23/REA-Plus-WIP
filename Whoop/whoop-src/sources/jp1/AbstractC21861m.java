package jp1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2609r;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9810f;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import hc3.AbstractC17176i;
import hp1.AbstractC17546f;
import hp1.C17550j;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import if0.C18451b;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import java.io.IOException;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p251jg.C21650c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: jp1.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lhp1/j;", "viewState", "Lkotlin/Function1;", "Lyn1/a;", "Ll83/a0;", "onAnalyticEvent", "Lhp1/f;", "onViewEvent", "j", "(Lhp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21861m {
    /* JADX WARN: Code duplicated, block: B:102:0x0348  */
    /* JADX WARN: Code duplicated, block: B:105:0x034d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0350  */
    /* JADX WARN: Code duplicated, block: B:110:0x037d  */
    /* JADX WARN: Code duplicated, block: B:111:0x037f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0386 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0388  */
    /* JADX WARN: Code duplicated, block: B:117:0x039b  */
    /* JADX WARN: Code duplicated, block: B:120:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0127  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x017e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0335  */
    /* JADX WARN: Code duplicated, block: B:95:0x0337  */
    /* JADX WARN: Code duplicated, block: B:98:0x033e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0340  */
    /* JADX INFO: renamed from: j */
    public static final void m61918j(C17550j viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        boolean z13;
        Object objM87133R2;
        Function1 function8;
        boolean z14;
        int iHashCode2;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R3;
        C28676v0 c28676v1;
        Function1 function9;
        Function1 function10;
        boolean z18;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(3780421);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C21650c(22);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function6 = (Function1) objM87133R6;
                    } else {
                        function6 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C21650c(23);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Function1 function11 = function6;
                    TextResource textResourceM49924b = viewState.getNavigationTitle();
                    TextResource textResourceM49923a = viewState.getNavigationSubtitle();
                    i18 = i15 & 896;
                    if (i18 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C18451b(function7, 29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i24 = TextResource.$stable;
                    function8 = function7;
                    AbstractC21865q.m61949e(textResourceM49924b, textResourceM49923a, 0, null, null, (InterfaceC4339a) objM87133R2, c28655q, i24 | (i24 << 3), 28);
                    if (1.0f > 0.0d) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    float f13 = 3;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, c2314t);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i24);
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    long jM125430y = c38072d.m121949b(c28655q, i25).getBrandWhite();
                    C2886a c2886aM8416N = c38072d.m121952e(c28655q, i25).getT1();
                    int i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 0, i26, 196602);
                    float f14 = 4;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f14, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i24), null, c38072d.m121949b(c28655q, i25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getB1(), null, c28655q, 0, i26, 196602);
                    float f15 = 5 * f14;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
                    AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q, 48, 253);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
                    AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105489e(f13 * f14), c38072d.m121949b(c28655q, i25).getWhite5(), null, 0 * f14, AbstractC37817c.m121344e(-1284494828, c28655q, new C21859k(viewState, interfaceC28601c1, function11, 0)), c28655q, 1769478, 24);
                    AbstractC18489d0.m53380u(17, f14, c2314t, c28655q);
                    EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                    String strM21274h2 = AbstractC8693b.m21274h(viewState.getSaveButtonTitle(), c28655q, i24);
                    long jM125399i0 = c38072d.m121949b(c28655q, i25).getSleepLightSleep();
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (i18 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i15 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | z15;
                    objM87133R3 = c28655q.m87133R();
                    if (z17) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R3 == c28676v1) {
                            function9 = function8;
                        }
                        function10 = function9;
                        AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, jM125399i0, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        if (i18 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objM87133R4 = c28655q.m87133R();
                        if (z18 || objM87133R4 == c28676v1) {
                            objM87133R4 = new C21860l(function10, 0);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
                        function3 = function11;
                        function5 = function10;
                    }
                    function9 = function8;
                    objM87133R3 = new C18656a0(function9, interfaceC28601c1, function11, 13);
                    c28655q.m87172p0(objM87133R3);
                    function10 = function9;
                    AbstractC27282u.m82292h(modifierM3409f, enumC27284v, strM21274h2, false, jM125399i0, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z18) {
                        objM87133R4 = new C21860l(function10, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C21860l(function10, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
                    function3 = function11;
                    function5 = function10;
                } else {
                    c28655q.m87138X();
                    function5 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21852d(i13, i14, 1, viewState, function5, function3);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C21650c(22);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C21650c(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM66725n2 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)));
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66725n2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                Function1 function12 = function6;
                TextResource textResourceM49924b2 = viewState.getNavigationTitle();
                TextResource textResourceM49923a2 = viewState.getNavigationSubtitle();
                i18 = i15 & 896;
                if (i18 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C18451b(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C18451b(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                }
                int i27 = TextResource.$stable;
                function8 = function7;
                AbstractC21865q.m61949e(textResourceM49924b2, textResourceM49923a2, 0, null, null, (InterfaceC4339a) objM87133R2, c28655q, i27 | (i27 << 3), 28);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                float f16 = 3;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(8 * f16, c2314t2);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                String strM21274h3 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i27);
                C38072d c38072d2 = C38072d.f163053a;
                int i28 = C38072d.f163054b;
                long jM125430y2 = c38072d2.m121949b(c28655q, i28).getBrandWhite();
                C2886a c2886aM8416N2 = c38072d2.m121952e(c28655q, i28).getT1();
                int i29 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h3, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N2, null, c28655q, 0, i29, 196602);
                float f17 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f17, c2314t2));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i27), null, c38072d2.m121949b(c28655q, i28).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i28).getB1(), null, c28655q, 0, i29, 196602);
                float f18 = 5 * f17;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q, 48, 253);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t2));
                AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t2), AbstractC33253j.m105489e(f16 * f17), c38072d2.m121949b(c28655q, i28).getWhite5(), null, 0 * f17, AbstractC37817c.m121344e(-1284494828, c28655q, new C21859k(viewState, interfaceC28601c2, function12, 0)), c28655q, 1769478, 24);
                AbstractC18489d0.m53380u(17, f17, c2314t2, c28655q);
                EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                String strM21274h4 = AbstractC8693b.m21274h(viewState.getSaveButtonTitle(), c28655q, i27);
                long jM125399i1 = c38072d2.m121949b(c28655q, i28).getSleepLightSleep();
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i15 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | z15;
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                        function9 = function8;
                    }
                    function10 = function9;
                    AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h4, false, jM125399i1, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z18) {
                        objM87133R4 = new C21860l(function10, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C21860l(function10, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
                    function3 = function12;
                    function5 = function10;
                } else {
                    c28676v1 = c28676v0;
                }
                function9 = function8;
                objM87133R3 = new C18656a0(function9, interfaceC28601c2, function12, 13);
                c28655q.m87172p0(objM87133R3);
                function10 = function9;
                AbstractC27282u.m82292h(modifierM3409f2, enumC27284v2, strM21274h4, false, jM125399i1, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z18) {
                    objM87133R4 = new C21860l(function10, 0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C21860l(function10, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
                function3 = function12;
                function5 = function10;
            } else {
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(i13, i14, 1, viewState, function5, function3);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C21650c(22);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function6 = (Function1) objM87133R6;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C21650c(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM66725n3 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t3)));
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM66725n3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a5);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                Function1 function13 = function6;
                TextResource textResourceM49924b3 = viewState.getNavigationTitle();
                TextResource textResourceM49923a3 = viewState.getNavigationSubtitle();
                i18 = i15 & 896;
                if (i18 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C18451b(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C18451b(function7, 29);
                    c28655q.m87172p0(objM87133R2);
                }
                int i210 = TextResource.$stable;
                function8 = function7;
                AbstractC21865q.m61949e(textResourceM49924b3, textResourceM49923a3, 0, null, null, (InterfaceC4339a) objM87133R2, c28655q, i210 | (i210 << 3), 28);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                float f19 = 3;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(8 * f19, c2314t3);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                String strM21274h5 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i210);
                C38072d c38072d3 = C38072d.f163053a;
                int i211 = C38072d.f163054b;
                long jM125430y3 = c38072d3.m121949b(c28655q, i211).getBrandWhite();
                C2886a c2886aM8416N3 = c38072d3.m121952e(c28655q, i211).getT1();
                int i212 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h5, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N3, null, c28655q, 0, i212, 196602);
                float f110 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f110, c2314t3));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i210), null, c38072d3.m121949b(c28655q, i211).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i211).getB1(), null, c28655q, 0, i212, 196602);
                float f111 = 5 * f110;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f111, c2314t3));
                AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q, 48, 253);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f111, c2314t3));
                AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t3), AbstractC33253j.m105489e(f19 * f110), c38072d3.m121949b(c28655q, i211).getWhite5(), null, 0 * f110, AbstractC37817c.m121344e(-1284494828, c28655q, new C21859k(viewState, interfaceC28601c3, function13, 0)), c28655q, 1769478, 24);
                AbstractC18489d0.m53380u(17, f110, c2314t3, c28655q);
                EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                String strM21274h6 = AbstractC8693b.m21274h(viewState.getSaveButtonTitle(), c28655q, i210);
                long jM125399i2 = c38072d3.m121949b(c28655q, i211).getSleepLightSleep();
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                if (i18 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i15 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | z15;
                objM87133R3 = c28655q.m87133R();
                if (z17) {
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                        function9 = function8;
                    }
                    function10 = function9;
                    AbstractC27282u.m82292h(modifierM3409f3, enumC27284v3, strM21274h6, false, jM125399i2, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (i18 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z18) {
                        objM87133R4 = new C21860l(function10, 0);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C21860l(function10, 0);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
                    function3 = function13;
                    function5 = function10;
                } else {
                    c28676v1 = c28676v0;
                }
                function9 = function8;
                objM87133R3 = new C18656a0(function9, interfaceC28601c3, function13, 13);
                c28655q.m87172p0(objM87133R3);
                function10 = function9;
                AbstractC27282u.m82292h(modifierM3409f3, enumC27284v3, strM21274h6, false, jM125399i2, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z18) {
                    objM87133R4 = new C21860l(function10, 0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C21860l(function10, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
                function3 = function13;
                function5 = function10;
            } else {
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(i13, i14, 1, viewState, function5, function3);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C21650c(22);
                    c28655q.m87172p0(objM87133R6);
                }
                function6 = (Function1) objM87133R6;
            } else {
                function6 = function3;
            }
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C21650c(23);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function4;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R;
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM66725n4 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t4)));
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66725n4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a7);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            Function1 function14 = function6;
            TextResource textResourceM49924b4 = viewState.getNavigationTitle();
            TextResource textResourceM49923a4 = viewState.getNavigationSubtitle();
            i18 = i15 & 896;
            if (i18 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C18451b(function7, 29);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C18451b(function7, 29);
                c28655q.m87172p0(objM87133R2);
            }
            int i213 = TextResource.$stable;
            function8 = function7;
            AbstractC21865q.m61949e(textResourceM49924b4, textResourceM49923a4, 0, null, null, (InterfaceC4339a) objM87133R2, c28655q, i213 | (i213 << 3), 28);
            if (1.0f > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            float f112 = 3;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(8 * f112, c2314t4);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            String strM21274h7 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i213);
            C38072d c38072d4 = C38072d.f163053a;
            int i214 = C38072d.f163054b;
            long jM125430y4 = c38072d4.m121949b(c28655q, i214).getBrandWhite();
            C2886a c2886aM8416N4 = c38072d4.m121952e(c28655q, i214).getT1();
            int i215 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h7, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N4, null, c28655q, 0, i215, 196602);
            float f113 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f113, c2314t4));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i213), null, c38072d4.m121949b(c28655q, i214).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i214).getB1(), null, c28655q, 0, i215, 196602);
            float f114 = 5 * f113;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f114, c2314t4));
            AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q, 48, 253);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f114, c2314t4));
            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, c2314t4), AbstractC33253j.m105489e(f112 * f113), c38072d4.m121949b(c28655q, i214).getWhite5(), null, 0 * f113, AbstractC37817c.m121344e(-1284494828, c28655q, new C21859k(viewState, interfaceC28601c4, function14, 0)), c28655q, 1769478, 24);
            AbstractC18489d0.m53380u(17, f113, c2314t4, c28655q);
            EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
            String strM21274h8 = AbstractC8693b.m21274h(viewState.getSaveButtonTitle(), c28655q, i213);
            long jM125399i3 = c38072d4.m121949b(c28655q, i214).getSleepLightSleep();
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
            if (i18 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i15 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | z15;
            objM87133R3 = c28655q.m87133R();
            if (z17) {
                c28676v1 = c28676v0;
                if (objM87133R3 == c28676v1) {
                    function9 = function8;
                }
                function10 = function9;
                AbstractC27282u.m82292h(modifierM3409f4, enumC27284v4, strM21274h8, false, jM125399i3, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i18 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z18) {
                    objM87133R4 = new C21860l(function10, 0);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C21860l(function10, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
                function3 = function14;
                function5 = function10;
            } else {
                c28676v1 = c28676v0;
            }
            function9 = function8;
            objM87133R3 = new C18656a0(function9, interfaceC28601c4, function14, 13);
            c28655q.m87172p0(objM87133R3);
            function10 = function9;
            AbstractC27282u.m82292h(modifierM3409f4, enumC27284v4, strM21274h8, false, jM125399i3, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 104);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (i18 == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R4 = c28655q.m87133R();
            if (z18) {
                objM87133R4 = new C21860l(function10, 0);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C21860l(function10, 0);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
            function3 = function14;
            function5 = function10;
        } else {
            c28655q.m87138X();
            function5 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(i13, i14, 1, viewState, function5, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m61919k(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m61920l(AbstractC17546f it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m61921m(Function1 function1) {
        function1.invoke(AbstractC17546f.a.f67870a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m61922n(C17550j c17550j, InterfaceC28601c1 interfaceC28601c1, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(3 * 8, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c17550j.getStealthModeInput().getIcon().toWhoopIcon(), c28655q, 6);
            float f13 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, i14).getWhite50(), c28655q, 432, 0);
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            TextResource textResourceM49930b = c17550j.getStealthModeInput().getLabel();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM49930b, c28655q, i15);
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i14).getB1();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i16, 196602);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i14).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-1120483179, c28655q, new C9810f(interfaceC28601c1, function1, 2)), c28655q, 24576, 13);
            AbstractC17176i.m48516r(c28655q, true, c2314t, f14, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c17550j.getStealthModeInput().getSublabel(), c28655q, i15), null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB3(), null, c28655q, 0, i16, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m61923o(InterfaceC28601c1 interfaceC28601c1, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2609r(interfaceC28601c1, function1, 17);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zBooleanValue, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m61924p(InterfaceC28601c1 interfaceC28601c1, Function1 function1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        function1.invoke(new AbstractC39672a.f(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m61925q(Function1 function1, InterfaceC28601c1 interfaceC28601c1, Function1 function2) {
        function1.invoke(new AbstractC17546f.e(((Boolean) interfaceC28601c1.getValue()).booleanValue()));
        function2.invoke(AbstractC39672a.p.f170764a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m61926r(Function1 function1) {
        function1.invoke(AbstractC17546f.a.f67870a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m61927s(C17550j c17550j, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m61918j(c17550j, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
