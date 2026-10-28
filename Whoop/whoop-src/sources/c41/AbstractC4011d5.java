package c41;

import a11.C0129g;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import bz0.C3711a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import f01.C13891q0;
import f01.C13902u;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33191j1;
import p736sz0.C33194k1;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.d5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lc41/e5;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lc41/e5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Lc41/e5;", "splitContainerCardHeaderTitleLongTextSample", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4011d5 {

    /* JADX INFO: renamed from: a */
    private static final C4018e5 f16306a;

    static {
        EnumC16313m0 enumC16313m0 = EnumC16313m0.MEMBERS_LIKE_YOU;
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
        C13891q0 c13891q0 = new C13891q0(enumC16313m0, null, "Membership & Billing Settings", enumC16313m1);
        C33194k1 c33194k1M105176i = AbstractC33191j1.m105176i();
        TextResource textResourceM21278l = AbstractC8693b.m21278l("My Account");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Save on your extension");
        EnumC2888c enumC2888c = EnumC2888c.B1;
        EnumC2888c enumC2888c2 = EnumC2888c.B4;
        f16306a = new C4018e5(new C13902u("my_account_long_title", "", null, c13891q0, C33194k1.m105178b(c33194k1M105176i, null, textResourceM21278l, textResourceM21278l2, null, null, enumC2888c, enumC2888c2, 0, 0, 0, null, 1945, null), "MY_ACCOUNT", new C9598e(null, null, null, 7, null), null, 128, null), new C13902u("invite_friends_long_title", "", null, new C13891q0(enumC16313m0, null, "Refer Friends & Family", enumC16313m1), C33194k1.m105178b(AbstractC33191j1.m105176i(), null, AbstractC8693b.m21278l("Get a free month"), AbstractC8693b.m21278l("Invite a friend, earn rewards"), null, EnumC39333f.COACH_BLUE, enumC2888c, enumC2888c2, 0, 0, 0, null, 1929, null), "INVITE_FRIENDS", new C9598e(null, null, null, 7, null), null, 128, null), false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x0170  */
    /* JADX WARN: Code duplicated, block: B:71:0x019e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01af  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:92:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m12159e(C4018e5 itemState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        Function1 function3;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        float f13;
        int iHashCode2;
        int iHashCode3;
        Object objM87133R;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1252519294);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
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
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C0129g(19);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * 8), C2299e.f9107J, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                    C2307m c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    int i18 = (i15 << 6) & 7168;
                    AbstractC25303l.m74291r(itemState.getStartItem(), null, new C4004c5(0), function3, c28655q, i18, 2);
                    Function1 function4 = function3;
                    c28655q.m87173q(true);
                    if (itemState.getShowDivider()) {
                        c28655q.m87150e0(-1725130371);
                        AbstractC15751g.m44449b(AbstractC1102d.m3424u(1, AbstractC1102d.m3406c(1.0f, c2314t)), C38072d.f163053a.m121949b(c28655q, i16).getWhite10(), 0.0f, 0.0f, c28655q, 6, 12);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1724935288);
                        c28655q.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    AbstractC25303l.m74291r(itemState.getEndItem(), null, new C4004c5(1), function4, c28655q, i18, 2);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function2 = function4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f13, true);
                C2307m c2307m2 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                int i19 = (i15 << 6) & 7168;
                AbstractC25303l.m74291r(itemState.getStartItem(), null, new C4004c5(0), function3, c28655q, i19, 2);
                Function1 function5 = function3;
                c28655q.m87173q(true);
                if (itemState.getShowDivider()) {
                    c28655q.m87150e0(-1725130371);
                    AbstractC15751g.m44449b(AbstractC1102d.m3424u(1, AbstractC1102d.m3406c(1.0f, c2314t)), C38072d.f163053a.m121949b(c28655q, i16).getWhite10(), 0.0f, 0.0f, c28655q, 6, 12);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1724935288);
                    c28655q.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                AbstractC25303l.m74291r(itemState.getEndItem(), null, new C4004c5(1), function5, c28655q, i19, 2);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function2 = function5;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3711a(itemState, i13, function2, i14, 1);
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
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C0129g(19);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function2;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3388j2 = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * 8), C2299e.f9107J, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3388j2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i16 = 6;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(f13, true);
                C2307m c2307m3 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d5);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                int i110 = (i15 << 6) & 7168;
                AbstractC25303l.m74291r(itemState.getStartItem(), null, new C4004c5(0), function3, c28655q, i110, 2);
                Function1 function6 = function3;
                c28655q.m87173q(true);
                if (itemState.getShowDivider()) {
                    c28655q.m87150e0(-1725130371);
                    AbstractC15751g.m44449b(AbstractC1102d.m3424u(1, AbstractC1102d.m3406c(1.0f, c2314t)), C38072d.f163053a.m121949b(c28655q, i16).getWhite10(), 0.0f, 0.0f, c28655q, 6, 12);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1724935288);
                    c28655q.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                AbstractC25303l.m74291r(itemState.getEndItem(), null, new C4004c5(1), function6, c28655q, i110, 2);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function2 = function6;
            } else {
                i16 = 6;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(f13, true);
            C2307m c2307m4 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m4, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, layoutWeightElement7);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d7);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
            int i111 = (i15 << 6) & 7168;
            AbstractC25303l.m74291r(itemState.getStartItem(), null, new C4004c5(0), function3, c28655q, i111, 2);
            Function1 function7 = function3;
            c28655q.m87173q(true);
            if (itemState.getShowDivider()) {
                c28655q.m87150e0(-1725130371);
                AbstractC15751g.m44449b(AbstractC1102d.m3424u(1, AbstractC1102d.m3406c(1.0f, c2314t)), C38072d.f163053a.m121949b(c28655q, i16).getWhite10(), 0.0f, 0.0f, c28655q, 6, 12);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1724935288);
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m4, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
            AbstractC25303l.m74291r(itemState.getEndItem(), null, new C4004c5(1), function7, c28655q, i111, 2);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function2 = function7;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3711a(itemState, i13, function2, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m12160f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m12161g(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(247870788);
        Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3406c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Modifier m12162h(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1691860013);
        Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3406c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12163i(C4018e5 c4018e5, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12159e(c4018e5, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
