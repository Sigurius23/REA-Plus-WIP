package no0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import gz0.EnumC16313m0;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import lo0.C24611v0;
import m31.C25002h;
import mo0.AbstractC25739b;
import n72.C26439b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
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
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: no0.c1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llo0/v0;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Llo0/v0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26940c1 {
    /* JADX WARN: Code duplicated, block: B:101:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028b  */
    /* JADX WARN: Code duplicated, block: B:106:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:107:0x0304  */
    /* JADX WARN: Code duplicated, block: B:110:0x034d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0357  */
    /* JADX WARN: Code duplicated, block: B:114:0x036e  */
    /* JADX WARN: Code duplicated, block: B:115:0x037a  */
    /* JADX WARN: Code duplicated, block: B:119:0x03ba A[LOOP:0: B:117:0x03b4->B:119:0x03ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:125:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x0166  */
    /* JADX WARN: Code duplicated, block: B:76:0x0174  */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x019e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:94:0x0242  */
    /* JADX WARN: Code duplicated, block: B:97:0x026c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0270  */
    /* JADX INFO: renamed from: d */
    public static final void m80461d(Modifier modifier, C24611v0 viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        Modifier modifier5;
        C0209i c0209i4;
        float f13;
        float f14;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        int iHashCode2;
        AbstractC22403o imageUrl;
        int iHashCode3;
        boolean z14;
        C0209i c0209i5;
        Function1 function5;
        C2314t c2314t2;
        boolean z15;
        int iHashCode4;
        C38072d c38072d;
        int i17;
        int i18;
        boolean z16;
        String subtitle;
        C17750h1 endTag;
        EnumC16313m0 endIcon;
        C2314t c2314t3;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1238960220);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26439b(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier5 = modifier4;
                } else {
                    modifier5 = modifier4;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    f13 = 8;
                    f14 = 2 * f13;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1);
                    if ((i16 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = c28655q.m87157i(viewState) | z13;
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C26964o0(8, function4, viewState);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3396r, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    float f15 = 1 * f13;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9108K, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
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
                    imageUrl = viewState.getImageUrl();
                    if (imageUrl == null) {
                        c28655q.m87150e0(181731075);
                        c28655q.m87173q(false);
                        c2314t2 = c2314t;
                        c0209i5 = c0209i3;
                        function5 = function4;
                        z14 = true;
                        z15 = false;
                    } else {
                        c28655q.m87150e0(181731076);
                        Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * f13, c2314t), AbstractC33253j.f138651a);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM118994r);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        z14 = true;
                        c0209i5 = c0209i3;
                        function5 = function4;
                        c2314t2 = c2314t;
                        z15 = false;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(imageUrl, null, null, c28655q, AbstractC22403o.f87638a, 3), "", AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z14);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                    String title = viewState.getTitle();
                    c38072d = C38072d.f163053a;
                    i17 = C38072d.f163054b;
                    C2886a b6 = c38072d.m121952e(c28655q, i17).getB1();
                    long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
                    i18 = C2886a.f11498d << 18;
                    z16 = z15;
                    C28655q c28655q2 = c28655q;
                    AbstractC30795n.m94707h(title, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q2, 0, i18, 196602);
                    c28655q = c28655q2;
                    subtitle = viewState.getSubtitle();
                    if (subtitle == null) {
                        c28655q.m87150e0(-782280296);
                        c28655q.m87173q(z16);
                    } else {
                        c28655q.m87150e0(-782280295);
                        AbstractC30795n.m94707h(subtitle, null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(z16);
                    }
                    c28655q.m87173q(z14);
                    endTag = viewState.getEndTag();
                    if (endTag == null) {
                        c28655q.m87150e0(182893017);
                        c28655q.m87173q(z16);
                    } else {
                        c28655q.m87150e0(182893018);
                        AbstractC17746g1.m50872h(endTag, null, null, c28655q, C17750h1.f69012w, 6);
                        c28655q.m87173q(z16);
                    }
                    endIcon = viewState.getEndIcon();
                    if (endIcon == null) {
                        c28655q.m87150e0(182994728);
                        c28655q.m87173q(z16);
                        c2314t3 = c2314t2;
                    } else {
                        float f16 = 4;
                        c2314t3 = c2314t2;
                        C28655q c28655q3 = c28655q;
                        AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, 182994729, endIcon, c28655q, 6), "", AbstractC1102d.m3419p(f16 * f16, c2314t3), c38072d.m121949b(c28655q, i17).getWhite50(), c28655q3, 432, 0);
                        c28655q = c28655q3;
                        c28655q.m87173q(z16);
                    }
                    c28655q.m87173q(z14);
                    c28655q.m87150e0(-1399323274);
                    for (InterfaceC25312u interfaceC25312u : viewState.m71859f()) {
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t3));
                        C28655q c28655q4 = c28655q;
                        AbstractC25303l.m74291r(interfaceC25312u, AbstractC25739b.m75911y(), null, function5, c28655q4, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                        c28655q = c28655q4;
                    }
                    function2 = function5;
                    c28655q.m87173q(z16);
                    c28655q.m87173q(z14);
                    modifier3 = modifier5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                f13 = 8;
                f14 = 2 * f13;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1);
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = c28655q.m87157i(viewState) | z13;
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C26964o0(8, function4, viewState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26964o0(8, function4, viewState);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3396r2, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f17 = 1 * f13;
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f17), C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                imageUrl = viewState.getImageUrl();
                if (imageUrl == null) {
                    c28655q.m87150e0(181731075);
                    c28655q.m87173q(false);
                    c2314t2 = c2314t;
                    c0209i5 = c0209i3;
                    function5 = function4;
                    z14 = true;
                    z15 = false;
                } else {
                    c28655q.m87150e0(181731076);
                    Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * f13, c2314t), AbstractC33253j.f138651a);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM118994r2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                    z14 = true;
                    c0209i5 = c0209i3;
                    function5 = function4;
                    c2314t2 = c2314t;
                    z15 = false;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(imageUrl, null, null, c28655q, AbstractC22403o.f87638a, 3), "", AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, z14);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), c2305k, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                String title2 = viewState.getTitle();
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                C2886a b8 = c38072d.m121952e(c28655q, i17).getB1();
                long brandWhite2 = c38072d.m121949b(c28655q, i17).getBrandWhite();
                i18 = C2886a.f11498d << 18;
                z16 = z15;
                C28655q c28655q5 = c28655q;
                AbstractC30795n.m94707h(title2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q5, 0, i18, 196602);
                c28655q = c28655q5;
                subtitle = viewState.getSubtitle();
                if (subtitle == null) {
                    c28655q.m87150e0(-782280296);
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(-782280295);
                    AbstractC30795n.m94707h(subtitle, null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z14);
                endTag = viewState.getEndTag();
                if (endTag == null) {
                    c28655q.m87150e0(182893017);
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(182893018);
                    AbstractC17746g1.m50872h(endTag, null, null, c28655q, C17750h1.f69012w, 6);
                    c28655q.m87173q(z16);
                }
                endIcon = viewState.getEndIcon();
                if (endIcon == null) {
                    c28655q.m87150e0(182994728);
                    c28655q.m87173q(z16);
                    c2314t3 = c2314t2;
                } else {
                    float f18 = 4;
                    c2314t3 = c2314t2;
                    C28655q c28655q6 = c28655q;
                    AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, 182994729, endIcon, c28655q, 6), "", AbstractC1102d.m3419p(f18 * f18, c2314t3), c38072d.m121949b(c28655q, i17).getWhite50(), c28655q6, 432, 0);
                    c28655q = c28655q6;
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z14);
                c28655q.m87150e0(-1399323274);
                while (r0.hasNext()) {
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t3));
                    C28655q c28655q7 = c28655q;
                    AbstractC25303l.m74291r(interfaceC25312u, AbstractC25739b.m75911y(), null, function5, c28655q7, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                    c28655q = c28655q7;
                }
                function2 = function5;
                c28655q.m87173q(z16);
                c28655q.m87173q(z14);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(modifier3, viewState, function3, i13, i14, 18);
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
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C26439b(29);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier5 = modifier4;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                f13 = 8;
                f14 = 2 * f13;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1);
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = c28655q.m87157i(viewState) | z13;
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C26964o0(8, function4, viewState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26964o0(8, function4, viewState);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3396r3, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f19 = 1 * f13;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f19), C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3362g3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                imageUrl = viewState.getImageUrl();
                if (imageUrl == null) {
                    c28655q.m87150e0(181731075);
                    c28655q.m87173q(false);
                    c2314t2 = c2314t;
                    c0209i5 = c0209i3;
                    function5 = function4;
                    z14 = true;
                    z15 = false;
                } else {
                    c28655q.m87150e0(181731076);
                    Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * f13, c2314t), AbstractC33253j.f138651a);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM118994r3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                    z14 = true;
                    c0209i5 = c0209i3;
                    function5 = function4;
                    c2314t2 = c2314t;
                    z15 = false;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(imageUrl, null, null, c28655q, AbstractC22403o.f87638a, 3), "", AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, z14);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19), c2305k2, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                String title3 = viewState.getTitle();
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                C2886a b14 = c38072d.m121952e(c28655q, i17).getB1();
                long brandWhite3 = c38072d.m121949b(c28655q, i17).getBrandWhite();
                i18 = C2886a.f11498d << 18;
                z16 = z15;
                C28655q c28655q8 = c28655q;
                AbstractC30795n.m94707h(title3, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b14, null, c28655q8, 0, i18, 196602);
                c28655q = c28655q8;
                subtitle = viewState.getSubtitle();
                if (subtitle == null) {
                    c28655q.m87150e0(-782280296);
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(-782280295);
                    AbstractC30795n.m94707h(subtitle, null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z14);
                endTag = viewState.getEndTag();
                if (endTag == null) {
                    c28655q.m87150e0(182893017);
                    c28655q.m87173q(z16);
                } else {
                    c28655q.m87150e0(182893018);
                    AbstractC17746g1.m50872h(endTag, null, null, c28655q, C17750h1.f69012w, 6);
                    c28655q.m87173q(z16);
                }
                endIcon = viewState.getEndIcon();
                if (endIcon == null) {
                    c28655q.m87150e0(182994728);
                    c28655q.m87173q(z16);
                    c2314t3 = c2314t2;
                } else {
                    float f110 = 4;
                    c2314t3 = c2314t2;
                    C28655q c28655q9 = c28655q;
                    AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, 182994729, endIcon, c28655q, 6), "", AbstractC1102d.m3419p(f110 * f110, c2314t3), c38072d.m121949b(c28655q, i17).getWhite50(), c28655q9, 432, 0);
                    c28655q = c28655q9;
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z14);
                c28655q.m87150e0(-1399323274);
                while (r0.hasNext()) {
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t3));
                    C28655q c28655q10 = c28655q;
                    AbstractC25303l.m74291r(interfaceC25312u, AbstractC25739b.m75911y(), null, function5, c28655q10, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                    c28655q = c28655q10;
                }
                function2 = function5;
                c28655q.m87173q(z16);
                c28655q.m87173q(z14);
                modifier3 = modifier5;
            } else {
                modifier5 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
            f13 = 8;
            f14 = 2 * f13;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 1);
            if ((i16 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = c28655q.m87157i(viewState) | z13;
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C26964o0(8, function4, viewState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C26964o0(8, function4, viewState);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM3396r4, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f111 = 1 * f13;
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111), C2299e.f9108K, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3362g4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
            imageUrl = viewState.getImageUrl();
            if (imageUrl == null) {
                c28655q.m87150e0(181731075);
                c28655q.m87173q(false);
                c2314t2 = c2314t;
                c0209i5 = c0209i3;
                function5 = function4;
                z14 = true;
                z15 = false;
            } else {
                c28655q.m87150e0(181731076);
                Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(4 * f13, c2314t), AbstractC33253j.f138651a);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM118994r4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                z14 = true;
                c0209i5 = c0209i3;
                function5 = function4;
                c2314t2 = c2314t;
                z15 = false;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(imageUrl, null, null, c28655q, AbstractC22403o.f87638a, 3), "", AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, z14);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f111), c2305k2, c28655q, 6);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
            String title4 = viewState.getTitle();
            c38072d = C38072d.f163053a;
            i17 = C38072d.f163054b;
            C2886a b15 = c38072d.m121952e(c28655q, i17).getB1();
            long brandWhite4 = c38072d.m121949b(c28655q, i17).getBrandWhite();
            i18 = C2886a.f11498d << 18;
            z16 = z15;
            C28655q c28655q11 = c28655q;
            AbstractC30795n.m94707h(title4, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b15, null, c28655q11, 0, i18, 196602);
            c28655q = c28655q11;
            subtitle = viewState.getSubtitle();
            if (subtitle == null) {
                c28655q.m87150e0(-782280296);
                c28655q.m87173q(z16);
            } else {
                c28655q.m87150e0(-782280295);
                AbstractC30795n.m94707h(subtitle, null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(z16);
            }
            c28655q.m87173q(z14);
            endTag = viewState.getEndTag();
            if (endTag == null) {
                c28655q.m87150e0(182893017);
                c28655q.m87173q(z16);
            } else {
                c28655q.m87150e0(182893018);
                AbstractC17746g1.m50872h(endTag, null, null, c28655q, C17750h1.f69012w, 6);
                c28655q.m87173q(z16);
            }
            endIcon = viewState.getEndIcon();
            if (endIcon == null) {
                c28655q.m87150e0(182994728);
                c28655q.m87173q(z16);
                c2314t3 = c2314t2;
            } else {
                float f112 = 4;
                c2314t3 = c2314t2;
                C28655q c28655q12 = c28655q;
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, 182994729, endIcon, c28655q, 6), "", AbstractC1102d.m3419p(f112 * f112, c2314t3), c38072d.m121949b(c28655q, i17).getWhite50(), c28655q12, 432, 0);
                c28655q = c28655q12;
                c28655q.m87173q(z16);
            }
            c28655q.m87173q(z14);
            c28655q.m87150e0(-1399323274);
            while (r0.hasNext()) {
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t3));
                C28655q c28655q13 = c28655q;
                AbstractC25303l.m74291r(interfaceC25312u, AbstractC25739b.m75911y(), null, function5, c28655q13, (C25307p.f99300b << 3) | ((i16 << 3) & 7168), 4);
                c28655q = c28655q13;
            }
            function2 = function5;
            c28655q.m87173q(z16);
            c28655q.m87173q(z14);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(modifier3, viewState, function3, i13, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m80462e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m80463f(Function1 function1, C24611v0 c24611v0) {
        function1.invoke(c24611v0.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m80464g(Modifier modifier, C24611v0 c24611v0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80461d(modifier, c24611v0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
