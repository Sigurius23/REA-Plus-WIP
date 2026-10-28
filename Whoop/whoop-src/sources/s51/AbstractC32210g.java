package s51;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r12.C30856a;
import s32.C32112d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s51.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a7\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "m", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "modifier", "Ls51/h;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Ls51/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32210g {
    /* JADX WARN: Code duplicated, block: B:104:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01df  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:112:0x0208  */
    /* JADX WARN: Code duplicated, block: B:114:0x0243  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:120:0x0262  */
    /* JADX WARN: Code duplicated, block: B:124:0x02df  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:131:0x0303  */
    /* JADX WARN: Code duplicated, block: B:134:0x0329  */
    /* JADX WARN: Code duplicated, block: B:135:0x032d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0348  */
    /* JADX WARN: Code duplicated, block: B:144:0x0371  */
    /* JADX WARN: Code duplicated, block: B:147:0x037b  */
    /* JADX WARN: Code duplicated, block: B:149:0x037f  */
    /* JADX WARN: Code duplicated, block: B:152:0x03df  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:157:0x0401  */
    /* JADX WARN: Code duplicated, block: B:159:0x0405  */
    /* JADX WARN: Code duplicated, block: B:160:0x0410  */
    /* JADX WARN: Code duplicated, block: B:162:0x042f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0431  */
    /* JADX WARN: Code duplicated, block: B:168:0x0441  */
    /* JADX WARN: Code duplicated, block: B:173:0x0477  */
    /* JADX WARN: Code duplicated, block: B:175:0x0482  */
    /* JADX WARN: Code duplicated, block: B:178:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:180:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:185:0x0518  */
    /* JADX WARN: Code duplicated, block: B:190:0x0531  */
    /* JADX WARN: Code duplicated, block: B:191:0x053e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0576  */
    /* JADX WARN: Code duplicated, block: B:196:0x0582  */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0130  */
    /* JADX WARN: Code duplicated, block: B:83:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0140  */
    /* JADX WARN: Code duplicated, block: B:88:0x0167  */
    /* JADX WARN: Code duplicated, block: B:90:0x016d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0189  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b8  */
    /* JADX INFO: renamed from: g */
    public static final void m100194g(Modifier modifier, C32211h state, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C32211h c32211h;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        Object objM87133R;
        C2306l c2306l;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        float f13;
        int iHashCode2;
        float f14;
        int iHashCode3;
        EnumC16313m0 enumC16313m0M100203b;
        Integer numValueOf;
        int iHashCode4;
        float f15;
        C0209i c0209i5;
        C0209i c0209i6;
        C2314t c2314t2;
        C2306l c2306l2;
        int iHashCode5;
        int iHashCode6;
        C38072d c38072d;
        float f16;
        Function1 function5;
        C32208e c32208eM100204c;
        EnumC16313m0 enumC16313m0M100187b;
        Integer numValueOf2;
        boolean z16;
        boolean zM87153g;
        Object objM87133R2;
        boolean z17;
        String strM100205e;
        int iHashCode7;
        EnumC39181m enumC39181m;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1331613257);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
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
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32112d(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(state))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i16 = i15 & 896;
                if (i16 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C32209f(0, state, function4);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM5391i = AbstractC1772c1.m5391i(modifierM3409f, false, null, (InterfaceC4339a) objM87133R, 3);
                C22961h c22961h = AbstractC22977m.f90656g;
                c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM5391i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(f13, true));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                f14 = 8;
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.5d, f14, c2306l, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifier5 = modifier4;
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                enumC16313m0M100203b = state.getIcon();
                if (enumC16313m0M100203b != null) {
                    numValueOf = Integer.valueOf(enumC16313m0M100203b.toWhoopIcon());
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    c28655q.m87150e0(-72842939);
                    c28655q.m87173q(false);
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i;
                    c2314t2 = c2314t;
                    c2306l2 = c2306l;
                    f15 = f14;
                } else {
                    c28655q.m87150e0(-72842938);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q, 6);
                    float f17 = 4;
                    float f18 = 9 * f17;
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f18, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3419p);
                    c28655q.m87158i0();
                    f15 = f14;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i;
                    c2314t2 = c2314t;
                    c2306l2 = c2306l;
                    AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC16272a.f62036Y4, c28655q, 0), null, AbstractC1102d.m3419p(f18, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                    c28655q = c28655q;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, m100200m(AbstractC1102d.m3419p(((float) 4.5d) * f17, c2314t2)), C17919x.f69629f, c28655q, 3120, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.25d) * f15), C2299e.f9110M, c28655q, 6);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i7 = c0209i6;
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a);
                C0209i c0209i8 = c0209i5;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                float f19 = f15;
                C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 0.5d, f19, c2306l2, c28655q, 54);
                iHashCode6 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M53376q2);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                    AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                String strM100206f = state.getTitle();
                c38072d = C38072d.f163053a;
                C2886a b6 = c38072d.m121952e(c28655q, 6).getB1();
                long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f16 = Float.MAX_VALUE;
                } else {
                    f16 = 1.0f;
                }
                C28655q c28655q2 = c28655q;
                function5 = function4;
                AbstractC30795n.m94707h(strM100206f, new LayoutWeightElement(f16, false), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, b6, null, c28655q2, 0, 3072, 188408);
                c28655q = c28655q2;
                c32208eM100204c = state.getInfo();
                if (c32208eM100204c == null) {
                    c28655q.m87150e0(-437219469);
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-437219468);
                    enumC16313m0M100187b = c32208eM100204c.getInfoIcon();
                    if (enumC16313m0M100187b != null) {
                        numValueOf2 = Integer.valueOf(enumC16313m0M100187b.toWhoopIcon());
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 == null) {
                        c28655q.m87150e0(-312302354);
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-312302353);
                        C27430e c27430eM107874S2 = AbstractC34132o.m107874S(numValueOf2.intValue(), c28655q, 6);
                        String strM100186a = c32208eM100204c.getInfoDescription();
                        float f24 = 4;
                        Modifier modifierM3419p2 = AbstractC1102d.m3419p(f24 * f24, c2314t2);
                        if (i16 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87153g = c28655q.m87153g(c32208eM100204c) | z16;
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g || objM87133R2 == c28676v0) {
                            objM87133R2 = new C32209f(function5, c32208eM100204c, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC15005f3.m43108b(c27430eM107874S2, strM100186a, AbstractC1092a.m3362g(modifierM3419p2, false, null, null, (InterfaceC4339a) objM87133R2, 15), c38072d.m121949b(c28655q, 6).getWhite70(), c28655q, 0, 0);
                        z17 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z17);
                }
                c28655q.m87173q(true);
                strM100205e = state.getSubtitle();
                if (strM100205e == null) {
                    c28655q.m87150e0(1957989711);
                    c28655q.m87173q(z17);
                } else {
                    c28655q.m87150e0(1957989712);
                    AbstractC30795n.m94707h(strM100205e, null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, true);
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3396r(c2314t2, 1 * f19, 0.0f, 2));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                iHashCode7 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m7);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                if (AbstractC22676k.m65745e(state.getUnit(), "%")) {
                    c28655q.m87150e0(-1769722144);
                    c28655q.m87173q(false);
                    enumC39181m = EnumC39181m.f168423w;
                } else {
                    c28655q.m87150e0(-1769665321);
                    enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
                    c28655q.m87173q(false);
                }
                c32211h = state;
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(enumC39181m), AbstractC37817c.m121344e(1521481839, c28655q, new C30856a(c32211h, 18)), c28655q, 56);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier5;
            } else {
                c32211h = state;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b(modifier3, c32211h, function3, i13, i14, 1);
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
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C32112d(9);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
            if ((i15 & 112) != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            i16 = i15 & 896;
            if (i16 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C32209f(0, state, function4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C32209f(0, state, function4);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM5391i2 = AbstractC1772c1.m5391i(modifierM3409f3, false, null, (InterfaceC4339a) objM87133R, 3);
            C22961h c22961h2 = AbstractC22977m.f90656g;
            c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h2, c2306l, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM5391i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, new LayoutWeightElement(f13, true));
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9117z, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
            f14 = 8;
            C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q((float) 1.5d, f14, c2306l, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifier6 = modifier4;
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
            enumC16313m0M100203b = state.getIcon();
            if (enumC16313m0M100203b != null) {
                numValueOf = Integer.valueOf(enumC16313m0M100203b.toWhoopIcon());
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                c28655q.m87150e0(-72842939);
                c28655q.m87173q(false);
                c0209i5 = c0209i2;
                c0209i6 = c0209i;
                c2314t2 = c2314t;
                c2306l2 = c2306l;
                f15 = f14;
            } else {
                c28655q.m87150e0(-72842938);
                C27430e c27430eM107874S3 = AbstractC34132o.m107874S(numValueOf.intValue(), c28655q, 6);
                float f110 = 4;
                float f111 = 9 * f110;
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(f111, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3419p3);
                c28655q.m87158i0();
                f15 = f14;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                c0209i5 = c0209i2;
                c0209i6 = c0209i;
                c2314t2 = c2314t;
                c2306l2 = c2306l;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC16272a.f62036Y4, c28655q, 0), null, AbstractC1102d.m3419p(f111, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                c28655q = c28655q;
                AbstractC15005f3.m43108b(c27430eM107874S3, null, m100200m(AbstractC1102d.m3419p(((float) 4.5d) * f110, c2314t2)), C17919x.f69629f, c28655q, 3120, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.25d) * f15), C2299e.f9110M, c28655q, 6);
            iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i9 = c0209i6;
            AbstractC28683x.m87239G(c28655q, c0209i9, c23010xM66775a3);
            C0209i c0209i10 = c0209i5;
            AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
            float f112 = f15;
            C22994r1 c22994r1M53376q4 = AbstractC18489d0.m53376q((float) 0.5d, f112, c2306l2, c28655q, 54);
            iHashCode6 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, c22994r1M53376q4);
            AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m13);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
            String strM100206f2 = state.getTitle();
            c38072d = C38072d.f163053a;
            C2886a b8 = c38072d.m121952e(c28655q, 6).getB1();
            long brandWhite2 = c38072d.m121949b(c28655q, 6).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f16 = Float.MAX_VALUE;
            } else {
                f16 = 1.0f;
            }
            C28655q c28655q3 = c28655q;
            function5 = function4;
            AbstractC30795n.m94707h(strM100206f2, new LayoutWeightElement(f16, false), brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, b8, null, c28655q3, 0, 3072, 188408);
            c28655q = c28655q3;
            c32208eM100204c = state.getInfo();
            if (c32208eM100204c == null) {
                c28655q.m87150e0(-437219469);
                z17 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-437219468);
                enumC16313m0M100187b = c32208eM100204c.getInfoIcon();
                if (enumC16313m0M100187b != null) {
                    numValueOf2 = Integer.valueOf(enumC16313m0M100187b.toWhoopIcon());
                } else {
                    numValueOf2 = null;
                }
                if (numValueOf2 == null) {
                    c28655q.m87150e0(-312302354);
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-312302353);
                    C27430e c27430eM107874S4 = AbstractC34132o.m107874S(numValueOf2.intValue(), c28655q, 6);
                    String strM100186a2 = c32208eM100204c.getInfoDescription();
                    float f25 = 4;
                    Modifier modifierM3419p4 = AbstractC1102d.m3419p(f25 * f25, c2314t2);
                    if (i16 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87153g = c28655q.m87153g(c32208eM100204c) | z16;
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R2 = new C32209f(function5, c32208eM100204c, 1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C32209f(function5, c32208eM100204c, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S4, strM100186a2, AbstractC1092a.m3362g(modifierM3419p4, false, null, null, (InterfaceC4339a) objM87133R2, 15), c38072d.m121949b(c28655q, 6).getWhite70(), c28655q, 0, 0);
                    z17 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z17);
            }
            c28655q.m87173q(true);
            strM100205e = state.getSubtitle();
            if (strM100205e == null) {
                c28655q.m87150e0(1957989711);
                c28655q.m87173q(z17);
            } else {
                c28655q.m87150e0(1957989712);
                AbstractC30795n.m94707h(strM100205e, null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73392y(c28655q, true, true, true);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3396r(c2314t2, 1 * f112, 0.0f, 2));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
            iHashCode7 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m14);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
            if (AbstractC22676k.m65745e(state.getUnit(), "%")) {
                c28655q.m87150e0(-1769722144);
                c28655q.m87173q(false);
                enumC39181m = EnumC39181m.f168423w;
            } else {
                c28655q.m87150e0(-1769665321);
                enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
                c28655q.m87173q(false);
            }
            c32211h = state;
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(enumC39181m), AbstractC37817c.m121344e(1521481839, c28655q, new C30856a(c32211h, 18)), c28655q, 56);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier6;
        } else {
            c32211h = state;
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(modifier3, c32211h, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m100195h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m100196i(C32211h c32211h, Function1 function1) {
        C9598e c9598eM100202a = c32211h.getDestination();
        if (c9598eM100202a != null) {
            function1.invoke(c9598eM100202a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m100197j(Function1 function1, C32208e c32208e) {
        function1.invoke(c32208e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m100198k(C32211h c32211h, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9109L, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM100208h = c32211h.getValue();
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM100208h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, c38072d.m121952e(c28655q, 6).getN55(), null, c28655q, 0, 3072, 188410);
            AbstractC30795n.m94707h(c32211h.getUnit(), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m100199l(Modifier modifier, C32211h c32211h, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m100194g(modifier, c32211h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final Modifier m100200m(Modifier modifier) {
        return AbstractC1125a.m3480c(AbstractC1127a.m3488c(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751), new C32112d(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m100201n(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, AbstractC15673b0.m44011T0(), 0L, 0L, 0.0f, null, 9, 62);
        return C23454a0.f92919a;
    }
}
