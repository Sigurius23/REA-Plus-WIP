package pj2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lj2.AbstractC24479e;
import nj2.C26761h;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import o72.C27640a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.C26057j;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p62.C28947h;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: pj2.r */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lnj2/h;", "viewState", "", "selectedSpeed", "selectedCycle", "Lkotlin/Function1;", "Llj2/e;", "Ll83/a0;", "onEvent", "d", "(Lnj2/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "stress_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29319r {
    /* JADX WARN: Code duplicated, block: B:100:0x0308  */
    /* JADX WARN: Code duplicated, block: B:103:0x0315  */
    /* JADX WARN: Code duplicated, block: B:107:0x0327  */
    /* JADX WARN: Code duplicated, block: B:110:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:112:0x0400  */
    /* JADX WARN: Code duplicated, block: B:115:0x0410  */
    /* JADX WARN: Code duplicated, block: B:117:0x041e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0451  */
    /* JADX WARN: Code duplicated, block: B:123:0x0453  */
    /* JADX WARN: Code duplicated, block: B:126:0x045b  */
    /* JADX WARN: Code duplicated, block: B:127:0x045d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0468  */
    /* JADX WARN: Code duplicated, block: B:131:0x046a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0473  */
    /* JADX WARN: Code duplicated, block: B:138:0x047f  */
    /* JADX WARN: Code duplicated, block: B:140:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Code duplicated, block: B:72:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:90:0x020b  */
    /* JADX WARN: Code duplicated, block: B:91:0x020f  */
    /* JADX WARN: Code duplicated, block: B:94:0x021c  */
    /* JADX WARN: Code duplicated, block: B:96:0x022a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0304  */
    /* JADX INFO: renamed from: d */
    public static final void m89186d(C26761h viewState, String str, String str2, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        String str3;
        int i16;
        String str4;
        int i17;
        boolean z4;
        String str5;
        String str6;
        C28677v1 c28677v1M87180u;
        String str7;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        boolean z13;
        Object objM87133R;
        String str8;
        int i19;
        int iHashCode2;
        C0209i c0209i2;
        boolean z14;
        int iHashCode3;
        int iHashCode4;
        C0209i c0209i3;
        int iHashCode5;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        int i24;
        Function1 onEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1600697962);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                str3 = str;
                i15 |= c28655q.m87153g(str3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    str4 = str2;
                    if (c28655q.m87153g(str4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(onEvent)) {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i24;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i25 != 0) {
                        str3 = "";
                    }
                    if (i16 != 0) {
                        str4 = "";
                    }
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    str7 = str4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i4 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                    C0209i c0209i5 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                    TextResource textResourceM79674e = viewState.getNavigationTitle();
                    C38072d c38072d = C38072d.f163053a;
                    AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM79674e, null, AbstractC38963t7.m124375e(c38072d), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                    i18 = i15 & 7168;
                    if (i18 == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C28947h(onEvent, 10);
                        c28655q.m87172p0(objM87133R);
                    }
                    str8 = str3;
                    i19 = i15;
                    AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                    float f13 = 8;
                    float f14 = 2 * f13;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f14, 0.0f, 2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S && AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        c0209i2 = c0209i;
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                    if (1.0f > 0.0d) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                    c28655q.m87173q(true);
                    TextResource textResourceM79675f = viewState.getTitle();
                    int i26 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResourceM79675f, c28655q, i26);
                    int i27 = C38072d.f163054b;
                    long jM125430y = c38072d.m121949b(c28655q, i27).getBrandWhite();
                    C2886a c2886aM8418P = c38072d.m121952e(c28655q, i27).getT3();
                    int i28 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i28, 196602);
                    float f15 = 4;
                    AbstractC18489d0.m53380u(f15, f15, c2314t, c28655q);
                    float f16 = ((float) 2.5d) * f15;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16), C2299e.f9108K, c28655q, 54);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                    c0209i3 = c0209i2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getAlert(), c28655q, i26), null, c38072d.m121949b(c28655q, i27).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getH5(), null, c28655q, 0, i28, 196602);
                    AbstractC17176i.m48516r(c28655q, true, c2314t, f16, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i26), null, c38072d.m121949b(c28655q, i27).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getB2(), null, c28655q, 0, i28, 196602);
                    AbstractC18489d0.m53380u(6, f15, c2314t, c28655q);
                    float f17 = ((float) 4.5d) * f13;
                    Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f17, f14, f17, f15 * f13);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N5);
                    Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "disclaimerPrimaryButton");
                    EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                    String strM21274h2 = AbstractC8693b.m21274h(viewState.getButton(), c28655q, i26);
                    long jM125371X = c38072d.m121949b(c28655q, i27).getRecovery();
                    if (i18 == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i19 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z19 = z16 | z15;
                    if ((i19 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z19 | z17;
                    objM87133R2 = c28655q.m87133R();
                    if (!z18 || objM87133R2 == c28676v0) {
                        onEvent = function1;
                        str5 = str8;
                        str6 = str7;
                        objM87133R2 = new C26057j(onEvent, str5, str6, 18);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        onEvent = function1;
                        str5 = str8;
                        str6 = str7;
                    }
                    AbstractC27282u.m82292h(modifierM3599a, enumC27284v, strM21274h2, false, jM125371X, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
                    c28655q = c28655q;
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                } else {
                    c28655q.m87138X();
                    str5 = str3;
                    str6 = str4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27640a((Object) viewState, str5, str6, (InterfaceC23459e) onEvent, i13, i14, 8);
                }
            }
            i15 |= 384;
            str4 = str2;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onEvent)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i24;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i25 != 0) {
                    str3 = "";
                }
                if (i16 != 0) {
                    str4 = "";
                }
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t2));
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                str7 = str4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM66724m2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a3);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                TextResource textResourceM79674e2 = viewState.getNavigationTitle();
                C38072d c38072d2 = C38072d.f163053a;
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM79674e2, null, AbstractC38963t7.m124375e(c38072d2), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i18 = i15 & 7168;
                if (i18 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (z13) {
                    objM87133R = new C28947h(onEvent, 10);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C28947h(onEvent, 10);
                    c28655q.m87172p0(objM87133R);
                }
                str8 = str3;
                i19 = i15;
                AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                float f18 = 8;
                float f19 = 2 * f18;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t2), f19, 0.0f, 2);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N7);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N8);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t2), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q.m87173q(true);
                TextResource textResourceM79675f2 = viewState.getTitle();
                int i29 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM79675f2, c28655q, i29);
                int i210 = C38072d.f163054b;
                long jM125430y2 = c38072d2.m121949b(c28655q, i210).getBrandWhite();
                C2886a c2886aM8418P2 = c38072d2.m121952e(c28655q, i210).getT3();
                int i211 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h3, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q, 0, i211, 196602);
                float f110 = 4;
                AbstractC18489d0.m53380u(f110, f110, c2314t2, c28655q);
                float f111 = ((float) 2.5d) * f110;
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f111), C2299e.f9108K, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
                c0209i3 = c0209i2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getAlert(), c28655q, i29), null, c38072d2.m121949b(c28655q, i210).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i210).getH5(), null, c28655q, 0, i211, 196602);
                AbstractC17176i.m48516r(c28655q, true, c2314t2, f111, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i29), null, c38072d2.m121949b(c28655q, i210).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i210).getB2(), null, c28655q, 0, i211, 196602);
                AbstractC18489d0.m53380u(6, f110, c2314t2, c28655q);
                float f112 = ((float) 4.5d) * f18;
                Modifier modifierM3397s2 = AbstractC1099a.m3397s(c2314t2, f112, f19, f112, f110 * f18);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t2), "disclaimerPrimaryButton");
                EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                String strM21274h4 = AbstractC8693b.m21274h(viewState.getButton(), c28655q, i29);
                long jM125371X2 = c38072d2.m121949b(c28655q, i210).getRecovery();
                if (i18 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i19 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z110 = z16 | z15;
                if ((i19 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z110 | z17;
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    onEvent = function1;
                    str5 = str8;
                    str6 = str7;
                    objM87133R2 = new C26057j(onEvent, str5, str6, 18);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    onEvent = function1;
                    str5 = str8;
                    str6 = str7;
                    objM87133R2 = new C26057j(onEvent, str5, str6, 18);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27282u.m82292h(modifierM3599a2, enumC27284v2, strM21274h4, false, jM125371X2, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, true, true, true);
            } else {
                c28655q.m87138X();
                str5 = str3;
                str6 = str4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) viewState, str5, str6, (InterfaceC23459e) onEvent, i13, i14, 8);
            }
        }
        i15 |= 48;
        str3 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                str4 = str2;
                if (c28655q.m87153g(str4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onEvent)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i24;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i25 != 0) {
                    str3 = "";
                }
                if (i16 != 0) {
                    str4 = "";
                }
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM66724m3 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t3));
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                str7 = str4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM66724m3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a5);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i12 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N11);
                TextResource textResourceM79674e3 = viewState.getNavigationTitle();
                C38072d c38072d3 = C38072d.f163053a;
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(textResourceM79674e3, null, AbstractC38963t7.m124375e(c38072d3), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i18 = i15 & 7168;
                if (i18 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v2 = C28635l.f115821a;
                if (z13) {
                    objM87133R = new C28947h(onEvent, 10);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C28947h(onEvent, 10);
                    c28655q.m87172p0(objM87133R);
                }
                str8 = str3;
                i19 = i15;
                AbstractC6719b.m20143d(null, aVar3, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                float f113 = 8;
                float f114 = 2 * f113;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t3), f114, 0.0f, 2);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N12);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m13);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N13);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t3), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q.m87173q(true);
                TextResource textResourceM79675f3 = viewState.getTitle();
                int i212 = TextResource.$stable;
                String strM21274h5 = AbstractC8693b.m21274h(textResourceM79675f3, c28655q, i212);
                int i213 = C38072d.f163054b;
                long jM125430y3 = c38072d3.m121949b(c28655q, i213).getBrandWhite();
                C2886a c2886aM8418P3 = c38072d3.m121952e(c28655q, i213).getT3();
                int i214 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h5, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P3, null, c28655q, 0, i214, 196602);
                float f115 = 4;
                AbstractC18489d0.m53380u(f115, f115, c2314t3, c28655q);
                float f116 = ((float) 2.5d) * f115;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f116), C2299e.f9108K, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N14);
                c0209i3 = c0209i2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getAlert(), c28655q, i212), null, c38072d3.m121949b(c28655q, i213).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i213).getH5(), null, c28655q, 0, i214, 196602);
                AbstractC17176i.m48516r(c28655q, true, c2314t3, f116, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i212), null, c38072d3.m121949b(c28655q, i213).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i213).getB2(), null, c28655q, 0, i214, 196602);
                AbstractC18489d0.m53380u(6, f115, c2314t3, c28655q);
                float f117 = ((float) 4.5d) * f113;
                Modifier modifierM3397s3 = AbstractC1099a.m3397s(c2314t3, f117, f114, f117, f115 * f113);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3397s3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N15);
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t3), "disclaimerPrimaryButton");
                EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                String strM21274h6 = AbstractC8693b.m21274h(viewState.getButton(), c28655q, i212);
                long jM125371X3 = c38072d3.m121949b(c28655q, i213).getRecovery();
                if (i18 == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i19 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z111 = z16 | z15;
                if ((i19 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z111 | z17;
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    onEvent = function1;
                    str5 = str8;
                    str6 = str7;
                    objM87133R2 = new C26057j(onEvent, str5, str6, 18);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    onEvent = function1;
                    str5 = str8;
                    str6 = str7;
                    objM87133R2 = new C26057j(onEvent, str5, str6, 18);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27282u.m82292h(modifierM3599a3, enumC27284v3, strM21274h6, false, jM125371X3, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
                c28655q = c28655q;
                AbstractC25012a.m73392y(c28655q, true, true, true);
            } else {
                c28655q.m87138X();
                str5 = str3;
                str6 = str4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) viewState, str5, str6, (InterfaceC23459e) onEvent, i13, i14, 8);
            }
        }
        i15 |= 384;
        str4 = str2;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onEvent)) {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i24;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i25 != 0) {
                str3 = "";
            }
            if (i16 != 0) {
                str4 = "";
            }
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM66724m4 = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t4));
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            str7 = str4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM66724m4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i13 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i13, c23010xM66775a7);
            C0209i c0209i14 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i15 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N16);
            TextResource textResourceM79674e4 = viewState.getNavigationTitle();
            C38072d c38072d4 = C38072d.f163053a;
            AbstractC6721d.a aVar4 = new AbstractC6721d.a(textResourceM79674e4, null, AbstractC38963t7.m124375e(c38072d4), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            i18 = i15 & 7168;
            if (i18 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (z13) {
                objM87133R = new C28947h(onEvent, 10);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C28947h(onEvent, 10);
                c28655q.m87172p0(objM87133R);
            }
            str8 = str3;
            i19 = i15;
            AbstractC6719b.m20143d(null, aVar4, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            float f118 = 8;
            float f119 = 2 * f118;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t4), f119, 0.0f, 2);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m17);
            if (c28655q.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N17);
            if (1.0f > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC39127r0M66763d7);
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m18);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N18);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t4), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            c28655q.m87173q(true);
            TextResource textResourceM79675f4 = viewState.getTitle();
            int i215 = TextResource.$stable;
            String strM21274h7 = AbstractC8693b.m21274h(textResourceM79675f4, c28655q, i215);
            int i216 = C38072d.f163054b;
            long jM125430y4 = c38072d4.m121949b(c28655q, i216).getBrandWhite();
            C2886a c2886aM8418P4 = c38072d4.m121952e(c28655q, i216).getT3();
            int i217 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h7, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P4, null, c28655q, 0, i217, 196602);
            float f1110 = 4;
            AbstractC18489d0.m53380u(f1110, f1110, c2314t4, c28655q);
            float f1111 = ((float) 2.5d) * f1110;
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f1111), C2299e.f9108K, c28655q, 54);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, c2314t4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m19);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N19);
            c0209i3 = c0209i2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getAlert(), c28655q, i215), null, c38072d4.m121949b(c28655q, i216).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i216).getH5(), null, c28655q, 0, i217, 196602);
            AbstractC17176i.m48516r(c28655q, true, c2314t4, f1111, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q, i215), null, c38072d4.m121949b(c28655q, i216).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i216).getB2(), null, c28655q, 0, i217, 196602);
            AbstractC18489d0.m53380u(6, f1110, c2314t4, c28655q);
            float f1112 = ((float) 4.5d) * f118;
            Modifier modifierM3397s4 = AbstractC1099a.m3397s(c2314t4, f1112, f119, f1112, f1110 * f118);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
            Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3397s4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC28653p1M87165m110);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N110);
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t4), "disclaimerPrimaryButton");
            EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
            String strM21274h8 = AbstractC8693b.m21274h(viewState.getButton(), c28655q, i215);
            long jM125371X4 = c38072d4.m121949b(c28655q, i216).getRecovery();
            if (i18 == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((i19 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z112 = z16 | z15;
            if ((i19 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z112 | z17;
            objM87133R2 = c28655q.m87133R();
            if (z18) {
                onEvent = function1;
                str5 = str8;
                str6 = str7;
                objM87133R2 = new C26057j(onEvent, str5, str6, 18);
                c28655q.m87172p0(objM87133R2);
            } else {
                onEvent = function1;
                str5 = str8;
                str6 = str7;
                objM87133R2 = new C26057j(onEvent, str5, str6, 18);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27282u.m82292h(modifierM3599a4, enumC27284v4, strM21274h8, false, jM125371X4, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 104);
            c28655q = c28655q;
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
            str5 = str3;
            str6 = str4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a((Object) viewState, str5, str6, (InterfaceC23459e) onEvent, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m89187e(Function1 function1) {
        function1.invoke(AbstractC24479e.a.f95495a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m89188f(Function1 function1, String str, String str2) {
        function1.invoke(new AbstractC24479e.b(str, str2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m89189g(C26761h c26761h, String str, String str2, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m89186d(c26761h, str, str2, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
