package jp2;

import am2.C1012d;
import am2.C1040r;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import java.util.Locale;
import jp1.C21852d;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15050j4;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p164g2.C15240l;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p251jg.C21650c;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: jp2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ljp2/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Ljp2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "hasFocus", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21873d {
    /* JADX WARN: Code duplicated, block: B:102:0x02de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:106:0x0313  */
    /* JADX WARN: Code duplicated, block: B:107:0x0319  */
    /* JADX WARN: Code duplicated, block: B:110:0x0326  */
    /* JADX WARN: Code duplicated, block: B:112:0x0334  */
    /* JADX WARN: Code duplicated, block: B:115:0x0359  */
    /* JADX WARN: Code duplicated, block: B:116:0x035c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0366  */
    /* JADX WARN: Code duplicated, block: B:121:0x0379  */
    /* JADX WARN: Code duplicated, block: B:124:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:127:0x042d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0490  */
    /* JADX WARN: Code duplicated, block: B:131:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:134:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Code duplicated, block: B:77:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x0211  */
    /* JADX WARN: Code duplicated, block: B:82:0x0236  */
    /* JADX WARN: Code duplicated, block: B:83:0x0251  */
    /* JADX WARN: Code duplicated, block: B:86:0x0269  */
    /* JADX WARN: Code duplicated, block: B:87:0x026b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0287  */
    /* JADX WARN: Code duplicated, block: B:93:0x028e  */
    /* JADX WARN: Code duplicated, block: B:94:0x029f  */
    /* JADX WARN: Code duplicated, block: B:98:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x02d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX INFO: renamed from: g */
    public static final void m62017g(Modifier modifier, C21874e viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC15237i interfaceC15237i;
        int i16;
        String strM21274h;
        TextResource textResourceM62034j;
        String strM21274h2;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z13;
        C33252i c33252iM105489e;
        int iHashCode;
        String str;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        InterfaceC15237i interfaceC15237i2;
        InterfaceC28601c1 interfaceC28601c2;
        int i17;
        C0213j c0213j2;
        C0209i c0209i4;
        C2314t c2314t2;
        boolean z14;
        int i18;
        C28655q c28655q2;
        Modifier modifierM44455h;
        int i19;
        ?? r14;
        ?? r10;
        Object objM87133R2;
        C28676v0 c28676v1;
        C33252i c33252i;
        C28676v0 c28676v2;
        String str2;
        String str3;
        Function1 function5;
        Object c1040r;
        InterfaceC15237i interfaceC15237i3;
        boolean z15;
        boolean zM87153g2;
        Object objM87133R3;
        int iHashCode2;
        C38072d c38072d;
        int i24;
        boolean z16;
        long black30;
        C2314t c2314t3;
        C28655q c28655q3;
        C28676v0 c28676v3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-755387139);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87157i(viewState) ? 32 : 16;
        }
        int i26 = i14 & 4;
        if (i26 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q4.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i25 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C21650c(28);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                interfaceC15237i = (InterfaceC15237i) c28655q4.m87161k(AbstractC2453v1.f9570i);
                TextResource textResourceM62028c = viewState.getDisplayLabel();
                i16 = TextResource.$stable;
                strM21274h = AbstractC8693b.m21274h(textResourceM62028c, c28655q4, i16);
                textResourceM62034j = viewState.getSelectedDisplayText();
                if (textResourceM62034j == null) {
                    c28655q4.m87150e0(1890703180);
                    c28655q4.m87173q(false);
                    strM21274h2 = null;
                } else {
                    c28655q4.m87150e0(1890703181);
                    strM21274h2 = AbstractC8693b.m21274h(textResourceM62034j, c28655q4, i16);
                    c28655q4.m87173q(false);
                }
                if (strM21274h2 == null) {
                    strM21274h2 = "";
                }
                zM87153g = c28655q4.m87153g(viewState.getFieldId());
                objM87133R = c28655q4.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (AbstractC39414r.m125890i0(strM21274h2) && viewState.getErrorMessage() == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                float f13 = 4;
                c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                Modifier modifier5 = modifier4;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                str = strM21274h2;
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i5, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S) {
                    c0209i3 = c0209i;
                } else {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q4, c0209i6, modifierM118962N);
                    if (AbstractC39414r.m125890i0(strM21274h)) {
                        interfaceC15237i2 = interfaceC15237i;
                        interfaceC28601c2 = interfaceC28601c1;
                        i17 = i16;
                        c0213j2 = c0213j;
                        c0209i4 = c0209i2;
                        c2314t2 = c2314t;
                        z14 = false;
                        i18 = 1;
                        c28655q2 = c28655q4;
                        c28655q2.m87150e0(-1509227845);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q4.m87150e0(-1509482820);
                        String upperCase = strM21274h.toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        C38072d c38072d2 = C38072d.f163053a;
                        int i27 = C38072d.f163054b;
                        z14 = false;
                        interfaceC15237i2 = interfaceC15237i;
                        i18 = 1;
                        c0213j2 = c0213j;
                        i17 = i16;
                        c0209i4 = c0209i2;
                        c2314t2 = c2314t;
                        interfaceC28601c2 = interfaceC28601c1;
                        AbstractC30795n.m94707h(upperCase, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * 8, 7), c38072d2.m121949b(c28655q4, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q4, i27).getFormLabel(), null, c28655q4, 48, C2886a.f11498d << 18, 196600);
                        c28655q2 = c28655q4;
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    if (z13) {
                        c28655q2.m87150e0(-1509056818);
                        modifierM44455h = AbstractC15751g.m44455h(c2314t2, i18, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite30(), c33252iM105489e);
                        c28655q2.m87173q(z14);
                    } else {
                        c28655q2.m87150e0(-1508821373);
                        c28655q2.m87173q(z14);
                        modifierM44455h = c2314t2;
                    }
                    Modifier modifierMo3471e = modifierM3409f2.mo3471e(modifierM44455h);
                    boolean zM87153g3 = c28655q2.m87153g(interfaceC28601c2);
                    i19 = i15 & 896;
                    if (i19 == 256) {
                        r14 = i18;
                    } else {
                        r14 = z14;
                    }
                    r10 = ((((zM87153g3 ? 1 : 0) | r14) | (c28655q2.m87157i(viewState) ? 1 : 0)) == true ? 1 : 0) | (c28655q2.m87153g(str) ? 1 : 0) | (c28655q2.m87153g(strM21274h) ? 1 : 0);
                    objM87133R2 = c28655q2.m87133R();
                    if (r10 == 0) {
                        c28676v1 = c28676v0;
                        if (objM87133R2 == c28676v1) {
                            c33252i = c33252iM105489e;
                            c28676v2 = c28676v1;
                            str3 = str;
                            str2 = strM21274h;
                            c1040r = objM87133R2;
                            function5 = function4;
                        }
                        Modifier modifierM3484c = AbstractC1126a.m3484c(modifierMo3471e, (Function1) c1040r);
                        interfaceC15237i3 = interfaceC15237i2;
                        boolean zM87157i = c28655q2.m87157i(interfaceC15237i3) | c28655q2.m87157i(viewState);
                        if (i19 == 256) {
                            z15 = true;
                        } else {
                            z15 = z14;
                        }
                        zM87153g2 = zM87157i | z15 | c28655q2.m87153g(str2);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87153g2 || objM87133R3 == c28676v2) {
                            objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3484c, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N2);
                        Modifier modifierM3411h = AbstractC1102d.m3411h(12 * f13, AbstractC1102d.m3409f(1.0f, c2314t2));
                        c38072d = C38072d.f163053a;
                        i24 = C38072d.f163054b;
                        C23285v0 c23285v0M106661t = AbstractC33745d.m106661t(c38072d, c28655q2, i24);
                        if (viewState.getErrorMessage() != null) {
                            z16 = true;
                        } else {
                            z16 = z14;
                        }
                        C15043i8 c15043i8 = C15043i8.f56313a;
                        if (viewState.getErrorMessage() != null) {
                            c28655q2.m87150e0(735849110);
                            black30 = c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend15();
                        } else {
                            c28655q2.m87150e0(735850536);
                            black30 = c38072d.m121949b(c28655q2, i24).getBlack30();
                        }
                        c28655q2.m87173q(z14);
                        c2314t3 = c2314t2;
                        c28655q3 = c28655q2;
                        c28676v3 = c28676v2;
                        C15197y1 c15197y1M43129g = C15043i8.m43129g(c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getBrandWhite(), black30, c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getWhite50(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend(), c28655q3, 2096656);
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v3) {
                            objM87133R4 = new C21650c(29);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        AbstractC15050j4.m43135a(str3, (Function1) objM87133R4, modifierM3411h, false, true, c23285v0M106661t, null, AbstractC37817c.m121344e(578317544, c28655q3, new C17098f(viewState, 21)), C21870a.f84455a.m61999b(), z16, null, null, null, true, 0, 0, c33252i, c15197y1M43129g, c28655q3, 817917360, 24576, 244032);
                        c28655q = c28655q3;
                        c28655q.m87173q(true);
                        if (viewState.getErrorMessage() != null) {
                            c28655q.m87150e0(-1505254513);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getErrorMessage(), c28655q, i17), AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i24).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1504987045);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function3 = function5;
                        modifier3 = modifier5;
                    } else {
                        c28676v1 = c28676v0;
                    }
                    c28676v2 = c28676v1;
                    str3 = str;
                    c33252i = c33252iM105489e;
                    function5 = function4;
                    InterfaceC28601c1 interfaceC28601c3 = interfaceC28601c2;
                    str2 = strM21274h;
                    c1040r = new C1040r(function5, viewState, str3, str2, interfaceC28601c3);
                    c28655q2.m87172p0(c1040r);
                    Modifier modifierM3484c2 = AbstractC1126a.m3484c(modifierMo3471e, (Function1) c1040r);
                    interfaceC15237i3 = interfaceC15237i2;
                    boolean zM87157i2 = c28655q2.m87157i(interfaceC15237i3) | c28655q2.m87157i(viewState);
                    if (i19 == 256) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    zM87153g2 = zM87157i2 | z15 | c28655q2.m87153g(str2);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3484c2, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3362g2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N3);
                    Modifier modifierM3411h2 = AbstractC1102d.m3411h(12 * f13, AbstractC1102d.m3409f(1.0f, c2314t2));
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    C23285v0 c23285v0M106661t2 = AbstractC33745d.m106661t(c38072d, c28655q2, i24);
                    if (viewState.getErrorMessage() != null) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    C15043i8 c15043i9 = C15043i8.f56313a;
                    if (viewState.getErrorMessage() != null) {
                        c28655q2.m87150e0(735849110);
                        black30 = c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend15();
                    } else {
                        c28655q2.m87150e0(735850536);
                        black30 = c38072d.m121949b(c28655q2, i24).getBlack30();
                    }
                    c28655q2.m87173q(z14);
                    c2314t3 = c2314t2;
                    c28655q3 = c28655q2;
                    c28676v3 = c28676v2;
                    C15197y1 c15197y1M43129g2 = C15043i8.m43129g(c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getBrandWhite(), black30, c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getWhite50(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend(), c28655q3, 2096656);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v3) {
                        objM87133R4 = new C21650c(29);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    AbstractC15050j4.m43135a(str3, (Function1) objM87133R4, modifierM3411h2, false, true, c23285v0M106661t2, null, AbstractC37817c.m121344e(578317544, c28655q3, new C17098f(viewState, 21)), C21870a.f84455a.m61999b(), z16, null, null, null, true, 0, 0, c33252i, c15197y1M43129g2, c28655q3, 817917360, 24576, 244032);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    if (viewState.getErrorMessage() != null) {
                        c28655q.m87150e0(-1505254513);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getErrorMessage(), c28655q, i17), AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i24).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1504987045);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier5;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N);
                if (AbstractC39414r.m125890i0(strM21274h)) {
                    c28655q4.m87150e0(-1509482820);
                    String upperCase2 = strM21274h.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                    C38072d c38072d3 = C38072d.f163053a;
                    int i28 = C38072d.f163054b;
                    z14 = false;
                    interfaceC15237i2 = interfaceC15237i;
                    i18 = 1;
                    c0213j2 = c0213j;
                    i17 = i16;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    interfaceC28601c2 = interfaceC28601c1;
                    AbstractC30795n.m94707h(upperCase2, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * 8, 7), c38072d3.m121949b(c28655q4, i28).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q4, i28).getFormLabel(), null, c28655q4, 48, C2886a.f11498d << 18, 196600);
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                } else {
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c2 = interfaceC28601c1;
                    i17 = i16;
                    c0213j2 = c0213j;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    z14 = false;
                    i18 = 1;
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(-1509227845);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                if (z13) {
                    c28655q2.m87150e0(-1509056818);
                    modifierM44455h = AbstractC15751g.m44455h(c2314t2, i18, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite30(), c33252iM105489e);
                    c28655q2.m87173q(z14);
                } else {
                    c28655q2.m87150e0(-1508821373);
                    c28655q2.m87173q(z14);
                    modifierM44455h = c2314t2;
                }
                Modifier modifierMo3471e2 = modifierM3409f3.mo3471e(modifierM44455h);
                boolean zM87153g4 = c28655q2.m87153g(interfaceC28601c2);
                i19 = i15 & 896;
                if (i19 == 256) {
                    r14 = i18;
                } else {
                    r14 = z14;
                }
                r10 = ((((zM87153g4 ? 1 : 0) | r14) | (c28655q2.m87157i(viewState) ? 1 : 0)) == true ? 1 : 0) | (c28655q2.m87153g(str) ? 1 : 0) | (c28655q2.m87153g(strM21274h) ? 1 : 0);
                objM87133R2 = c28655q2.m87133R();
                if (r10 == 0) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        c33252i = c33252iM105489e;
                        c28676v2 = c28676v1;
                        str3 = str;
                        str2 = strM21274h;
                        c1040r = objM87133R2;
                        function5 = function4;
                    }
                    Modifier modifierM3484c3 = AbstractC1126a.m3484c(modifierMo3471e2, (Function1) c1040r);
                    interfaceC15237i3 = interfaceC15237i2;
                    boolean zM87157i3 = c28655q2.m87157i(interfaceC15237i3) | c28655q2.m87157i(viewState);
                    if (i19 == 256) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    zM87153g2 = zM87157i3 | z15 | c28655q2.m87153g(str2);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3484c3, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3362g3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
                    Modifier modifierM3411h3 = AbstractC1102d.m3411h(12 * f13, AbstractC1102d.m3409f(1.0f, c2314t2));
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    C23285v0 c23285v0M106661t3 = AbstractC33745d.m106661t(c38072d, c28655q2, i24);
                    if (viewState.getErrorMessage() != null) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    C15043i8 c15043i10 = C15043i8.f56313a;
                    if (viewState.getErrorMessage() != null) {
                        c28655q2.m87150e0(735849110);
                        black30 = c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend15();
                    } else {
                        c28655q2.m87150e0(735850536);
                        black30 = c38072d.m121949b(c28655q2, i24).getBlack30();
                    }
                    c28655q2.m87173q(z14);
                    c2314t3 = c2314t2;
                    c28655q3 = c28655q2;
                    c28676v3 = c28676v2;
                    C15197y1 c15197y1M43129g3 = C15043i8.m43129g(c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getBrandWhite(), black30, c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getWhite50(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend(), c28655q3, 2096656);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v3) {
                        objM87133R4 = new C21650c(29);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    AbstractC15050j4.m43135a(str3, (Function1) objM87133R4, modifierM3411h3, false, true, c23285v0M106661t3, null, AbstractC37817c.m121344e(578317544, c28655q3, new C17098f(viewState, 21)), C21870a.f84455a.m61999b(), z16, null, null, null, true, 0, 0, c33252i, c15197y1M43129g3, c28655q3, 817917360, 24576, 244032);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    if (viewState.getErrorMessage() != null) {
                        c28655q.m87150e0(-1505254513);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getErrorMessage(), c28655q, i17), AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i24).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1504987045);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier5;
                } else {
                    c28676v1 = c28676v0;
                }
                c28676v2 = c28676v1;
                str3 = str;
                c33252i = c33252iM105489e;
                function5 = function4;
                InterfaceC28601c1 interfaceC28601c4 = interfaceC28601c2;
                str2 = strM21274h;
                c1040r = new C1040r(function5, viewState, str3, str2, interfaceC28601c4);
                c28655q2.m87172p0(c1040r);
                Modifier modifierM3484c4 = AbstractC1126a.m3484c(modifierMo3471e2, (Function1) c1040r);
                interfaceC15237i3 = interfaceC15237i2;
                boolean zM87157i4 = c28655q2.m87157i(interfaceC15237i3) | c28655q2.m87157i(viewState);
                if (i19 == 256) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                zM87153g2 = zM87157i4 | z15 | c28655q2.m87153g(str2);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM3484c4, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3362g4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N5);
                Modifier modifierM3411h4 = AbstractC1102d.m3411h(12 * f13, AbstractC1102d.m3409f(1.0f, c2314t2));
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                C23285v0 c23285v0M106661t4 = AbstractC33745d.m106661t(c38072d, c28655q2, i24);
                if (viewState.getErrorMessage() != null) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                C15043i8 c15043i11 = C15043i8.f56313a;
                if (viewState.getErrorMessage() != null) {
                    c28655q2.m87150e0(735849110);
                    black30 = c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend15();
                } else {
                    c28655q2.m87150e0(735850536);
                    black30 = c38072d.m121949b(c28655q2, i24).getBlack30();
                }
                c28655q2.m87173q(z14);
                c2314t3 = c2314t2;
                c28655q3 = c28655q2;
                c28676v3 = c28676v2;
                C15197y1 c15197y1M43129g4 = C15043i8.m43129g(c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getBrandWhite(), black30, c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getWhite50(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend(), c28655q3, 2096656);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v3) {
                    objM87133R4 = new C21650c(29);
                    c28655q3.m87172p0(objM87133R4);
                }
                AbstractC15050j4.m43135a(str3, (Function1) objM87133R4, modifierM3411h4, false, true, c23285v0M106661t4, null, AbstractC37817c.m121344e(578317544, c28655q3, new C17098f(viewState, 21)), C21870a.f84455a.m61999b(), z16, null, null, null, true, 0, 0, c33252i, c15197y1M43129g4, c28655q3, 817917360, 24576, 244032);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                if (viewState.getErrorMessage() != null) {
                    c28655q.m87150e0(-1505254513);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getErrorMessage(), c28655q, i17), AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i24).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1504987045);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier5;
            } else {
                c28655q = c28655q4;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(modifier3, viewState, function3, i13, i14, 2);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i25 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C21650c(28);
                    c28655q4.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            interfaceC15237i = (InterfaceC15237i) c28655q4.m87161k(AbstractC2453v1.f9570i);
            TextResource textResourceM62028c2 = viewState.getDisplayLabel();
            i16 = TextResource.$stable;
            strM21274h = AbstractC8693b.m21274h(textResourceM62028c2, c28655q4, i16);
            textResourceM62034j = viewState.getSelectedDisplayText();
            if (textResourceM62034j == null) {
                c28655q4.m87150e0(1890703180);
                c28655q4.m87173q(false);
                strM21274h2 = null;
            } else {
                c28655q4.m87150e0(1890703181);
                strM21274h2 = AbstractC8693b.m21274h(textResourceM62034j, c28655q4, i16);
                c28655q4.m87173q(false);
            }
            if (strM21274h2 == null) {
                strM21274h2 = "";
            }
            zM87153g = c28655q4.m87153g(viewState.getFieldId());
            objM87133R = c28655q4.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (AbstractC39414r.m125890i0(strM21274h2)) {
                z13 = false;
            } else {
                z13 = false;
            }
            float f14 = 4;
            c33252iM105489e = AbstractC33253j.m105489e(3 * f14);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier4);
            Modifier modifier6 = modifier4;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            str = strM21274h2;
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a2);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i8, interfaceC28653p1M87165m6);
            c0209i2 = C0217k.f732j;
            if (c28655q4.f115903S) {
                c0209i3 = c0209i;
                if (!AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i9, modifierM118962N6);
                if (AbstractC39414r.m125890i0(strM21274h)) {
                    c28655q4.m87150e0(-1509482820);
                    String upperCase3 = strM21274h.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                    C38072d c38072d4 = C38072d.f163053a;
                    int i29 = C38072d.f163054b;
                    z14 = false;
                    interfaceC15237i2 = interfaceC15237i;
                    i18 = 1;
                    c0213j2 = c0213j;
                    i17 = i16;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    interfaceC28601c2 = interfaceC28601c1;
                    AbstractC30795n.m94707h(upperCase3, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * 8, 7), c38072d4.m121949b(c28655q4, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q4, i29).getFormLabel(), null, c28655q4, 48, C2886a.f11498d << 18, 196600);
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                } else {
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c2 = interfaceC28601c1;
                    i17 = i16;
                    c0213j2 = c0213j;
                    c0209i4 = c0209i2;
                    c2314t2 = c2314t;
                    z14 = false;
                    i18 = 1;
                    c28655q2 = c28655q4;
                    c28655q2.m87150e0(-1509227845);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t2);
                if (z13) {
                    c28655q2.m87150e0(-1509056818);
                    modifierM44455h = AbstractC15751g.m44455h(c2314t2, i18, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite30(), c33252iM105489e);
                    c28655q2.m87173q(z14);
                } else {
                    c28655q2.m87150e0(-1508821373);
                    c28655q2.m87173q(z14);
                    modifierM44455h = c2314t2;
                }
                Modifier modifierMo3471e3 = modifierM3409f5.mo3471e(modifierM44455h);
                boolean zM87153g5 = c28655q2.m87153g(interfaceC28601c2);
                i19 = i15 & 896;
                if (i19 == 256) {
                    r14 = i18;
                } else {
                    r14 = z14;
                }
                r10 = ((((zM87153g5 ? 1 : 0) | r14) | (c28655q2.m87157i(viewState) ? 1 : 0)) == true ? 1 : 0) | (c28655q2.m87153g(str) ? 1 : 0) | (c28655q2.m87153g(strM21274h) ? 1 : 0);
                objM87133R2 = c28655q2.m87133R();
                if (r10 == 0) {
                    c28676v1 = c28676v0;
                    if (objM87133R2 == c28676v1) {
                        c33252i = c33252iM105489e;
                        c28676v2 = c28676v1;
                        str3 = str;
                        str2 = strM21274h;
                        c1040r = objM87133R2;
                        function5 = function4;
                    }
                    Modifier modifierM3484c5 = AbstractC1126a.m3484c(modifierMo3471e3, (Function1) c1040r);
                    interfaceC15237i3 = interfaceC15237i2;
                    boolean zM87157i5 = c28655q2.m87157i(interfaceC15237i3) | c28655q2.m87157i(viewState);
                    if (i19 == 256) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    zM87153g2 = zM87157i5 | z15 | c28655q2.m87153g(str2);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3362g5 = AbstractC1092a.m3362g(modifierM3484c5, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3362g5);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m7);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N7);
                    Modifier modifierM3411h5 = AbstractC1102d.m3411h(12 * f14, AbstractC1102d.m3409f(1.0f, c2314t2));
                    c38072d = C38072d.f163053a;
                    i24 = C38072d.f163054b;
                    C23285v0 c23285v0M106661t5 = AbstractC33745d.m106661t(c38072d, c28655q2, i24);
                    if (viewState.getErrorMessage() != null) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    C15043i8 c15043i12 = C15043i8.f56313a;
                    if (viewState.getErrorMessage() != null) {
                        c28655q2.m87150e0(735849110);
                        black30 = c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend15();
                    } else {
                        c28655q2.m87150e0(735850536);
                        black30 = c38072d.m121949b(c28655q2, i24).getBlack30();
                    }
                    c28655q2.m87173q(z14);
                    c2314t3 = c2314t2;
                    c28655q3 = c28655q2;
                    c28676v3 = c28676v2;
                    C15197y1 c15197y1M43129g5 = C15043i8.m43129g(c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getBrandWhite(), black30, c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getWhite50(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend(), c28655q3, 2096656);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v3) {
                        objM87133R4 = new C21650c(29);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    AbstractC15050j4.m43135a(str3, (Function1) objM87133R4, modifierM3411h5, false, true, c23285v0M106661t5, null, AbstractC37817c.m121344e(578317544, c28655q3, new C17098f(viewState, 21)), C21870a.f84455a.m61999b(), z16, null, null, null, true, 0, 0, c33252i, c15197y1M43129g5, c28655q3, 817917360, 24576, 244032);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    if (viewState.getErrorMessage() != null) {
                        c28655q.m87150e0(-1505254513);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getErrorMessage(), c28655q, i17), AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i24).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1504987045);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier6;
                } else {
                    c28676v1 = c28676v0;
                }
                c28676v2 = c28676v1;
                str3 = str;
                c33252i = c33252iM105489e;
                function5 = function4;
                InterfaceC28601c1 interfaceC28601c5 = interfaceC28601c2;
                str2 = strM21274h;
                c1040r = new C1040r(function5, viewState, str3, str2, interfaceC28601c5);
                c28655q2.m87172p0(c1040r);
                Modifier modifierM3484c6 = AbstractC1126a.m3484c(modifierMo3471e3, (Function1) c1040r);
                interfaceC15237i3 = interfaceC15237i2;
                boolean zM87157i6 = c28655q2.m87157i(interfaceC15237i3) | c28655q2.m87157i(viewState);
                if (i19 == 256) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                zM87153g2 = zM87157i6 | z15 | c28655q2.m87153g(str2);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM3362g6 = AbstractC1092a.m3362g(modifierM3484c6, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3362g6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m8);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N8);
                Modifier modifierM3411h6 = AbstractC1102d.m3411h(12 * f14, AbstractC1102d.m3409f(1.0f, c2314t2));
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                C23285v0 c23285v0M106661t6 = AbstractC33745d.m106661t(c38072d, c28655q2, i24);
                if (viewState.getErrorMessage() != null) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                C15043i8 c15043i13 = C15043i8.f56313a;
                if (viewState.getErrorMessage() != null) {
                    c28655q2.m87150e0(735849110);
                    black30 = c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend15();
                } else {
                    c28655q2.m87150e0(735850536);
                    black30 = c38072d.m121949b(c28655q2, i24).getBlack30();
                }
                c28655q2.m87173q(z14);
                c2314t3 = c2314t2;
                c28655q3 = c28655q2;
                c28676v3 = c28676v2;
                C15197y1 c15197y1M43129g6 = C15043i8.m43129g(c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getBrandWhite(), black30, c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getWhite50(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend(), c28655q3, 2096656);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v3) {
                    objM87133R4 = new C21650c(29);
                    c28655q3.m87172p0(objM87133R4);
                }
                AbstractC15050j4.m43135a(str3, (Function1) objM87133R4, modifierM3411h6, false, true, c23285v0M106661t6, null, AbstractC37817c.m121344e(578317544, c28655q3, new C17098f(viewState, 21)), C21870a.f84455a.m61999b(), z16, null, null, null, true, 0, 0, c33252i, c15197y1M43129g6, c28655q3, 817917360, 24576, 244032);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                if (viewState.getErrorMessage() != null) {
                    c28655q.m87150e0(-1505254513);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getErrorMessage(), c28655q, i17), AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i24).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1504987045);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier6;
            } else {
                c0209i3 = c0209i;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i10, modifierM118962N6);
            if (AbstractC39414r.m125890i0(strM21274h)) {
                c28655q4.m87150e0(-1509482820);
                String upperCase4 = strM21274h.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
                C38072d c38072d5 = C38072d.f163053a;
                int i210 = C38072d.f163054b;
                z14 = false;
                interfaceC15237i2 = interfaceC15237i;
                i18 = 1;
                c0213j2 = c0213j;
                i17 = i16;
                c0209i4 = c0209i2;
                c2314t2 = c2314t;
                interfaceC28601c2 = interfaceC28601c1;
                AbstractC30795n.m94707h(upperCase4, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * 8, 7), c38072d5.m121949b(c28655q4, i210).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q4, i210).getFormLabel(), null, c28655q4, 48, C2886a.f11498d << 18, 196600);
                c28655q2 = c28655q4;
                c28655q2.m87173q(false);
            } else {
                interfaceC15237i2 = interfaceC15237i;
                interfaceC28601c2 = interfaceC28601c1;
                i17 = i16;
                c0213j2 = c0213j;
                c0209i4 = c0209i2;
                c2314t2 = c2314t;
                z14 = false;
                i18 = 1;
                c28655q2 = c28655q4;
                c28655q2.m87150e0(-1509227845);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
            if (z13) {
                c28655q2.m87150e0(-1509056818);
                modifierM44455h = AbstractC15751g.m44455h(c2314t2, i18, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite30(), c33252iM105489e);
                c28655q2.m87173q(z14);
            } else {
                c28655q2.m87150e0(-1508821373);
                c28655q2.m87173q(z14);
                modifierM44455h = c2314t2;
            }
            Modifier modifierMo3471e4 = modifierM3409f6.mo3471e(modifierM44455h);
            boolean zM87153g6 = c28655q2.m87153g(interfaceC28601c2);
            i19 = i15 & 896;
            if (i19 == 256) {
                r14 = i18;
            } else {
                r14 = z14;
            }
            r10 = ((((zM87153g6 ? 1 : 0) | r14) | (c28655q2.m87157i(viewState) ? 1 : 0)) == true ? 1 : 0) | (c28655q2.m87153g(str) ? 1 : 0) | (c28655q2.m87153g(strM21274h) ? 1 : 0);
            objM87133R2 = c28655q2.m87133R();
            if (r10 == 0) {
                c28676v1 = c28676v0;
                if (objM87133R2 == c28676v1) {
                    c33252i = c33252iM105489e;
                    c28676v2 = c28676v1;
                    str3 = str;
                    str2 = strM21274h;
                    c1040r = objM87133R2;
                    function5 = function4;
                }
                Modifier modifierM3484c7 = AbstractC1126a.m3484c(modifierMo3471e4, (Function1) c1040r);
                interfaceC15237i3 = interfaceC15237i2;
                boolean zM87157i7 = c28655q2.m87157i(interfaceC15237i3) | c28655q2.m87157i(viewState);
                if (i19 == 256) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                zM87153g2 = zM87157i7 | z15 | c28655q2.m87153g(str2);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM3362g7 = AbstractC1092a.m3362g(modifierM3484c7, false, null, null, (InterfaceC4339a) objM87133R3, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3362g7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N9);
                Modifier modifierM3411h7 = AbstractC1102d.m3411h(12 * f14, AbstractC1102d.m3409f(1.0f, c2314t2));
                c38072d = C38072d.f163053a;
                i24 = C38072d.f163054b;
                C23285v0 c23285v0M106661t7 = AbstractC33745d.m106661t(c38072d, c28655q2, i24);
                if (viewState.getErrorMessage() != null) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                C15043i8 c15043i14 = C15043i8.f56313a;
                if (viewState.getErrorMessage() != null) {
                    c28655q2.m87150e0(735849110);
                    black30 = c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend15();
                } else {
                    c28655q2.m87150e0(735850536);
                    black30 = c38072d.m121949b(c28655q2, i24).getBlack30();
                }
                c28655q2.m87173q(z14);
                c2314t3 = c2314t2;
                c28655q3 = c28655q2;
                c28676v3 = c28676v2;
                C15197y1 c15197y1M43129g7 = C15043i8.m43129g(c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getBrandWhite(), black30, c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getWhite50(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend(), c28655q3, 2096656);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v3) {
                    objM87133R4 = new C21650c(29);
                    c28655q3.m87172p0(objM87133R4);
                }
                AbstractC15050j4.m43135a(str3, (Function1) objM87133R4, modifierM3411h7, false, true, c23285v0M106661t7, null, AbstractC37817c.m121344e(578317544, c28655q3, new C17098f(viewState, 21)), C21870a.f84455a.m61999b(), z16, null, null, null, true, 0, 0, c33252i, c15197y1M43129g7, c28655q3, 817917360, 24576, 244032);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                if (viewState.getErrorMessage() != null) {
                    c28655q.m87150e0(-1505254513);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getErrorMessage(), c28655q, i17), AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i24).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1504987045);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier6;
            } else {
                c28676v1 = c28676v0;
            }
            c28676v2 = c28676v1;
            str3 = str;
            c33252i = c33252iM105489e;
            function5 = function4;
            InterfaceC28601c1 interfaceC28601c6 = interfaceC28601c2;
            str2 = strM21274h;
            c1040r = new C1040r(function5, viewState, str3, str2, interfaceC28601c6);
            c28655q2.m87172p0(c1040r);
            Modifier modifierM3484c8 = AbstractC1126a.m3484c(modifierMo3471e4, (Function1) c1040r);
            interfaceC15237i3 = interfaceC15237i2;
            boolean zM87157i8 = c28655q2.m87157i(interfaceC15237i3) | c28655q2.m87157i(viewState);
            if (i19 == 256) {
                z15 = true;
            } else {
                z15 = z14;
            }
            zM87153g2 = zM87157i8 | z15 | c28655q2.m87153g(str2);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C1012d(interfaceC15237i3, viewState, function5, str2);
                c28655q2.m87172p0(objM87133R3);
            }
            Modifier modifierM3362g8 = AbstractC1092a.m3362g(modifierM3484c8, false, null, null, (InterfaceC4339a) objM87133R3, 15);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3362g8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m10);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N10);
            Modifier modifierM3411h8 = AbstractC1102d.m3411h(12 * f14, AbstractC1102d.m3409f(1.0f, c2314t2));
            c38072d = C38072d.f163053a;
            i24 = C38072d.f163054b;
            C23285v0 c23285v0M106661t8 = AbstractC33745d.m106661t(c38072d, c28655q2, i24);
            if (viewState.getErrorMessage() != null) {
                z16 = true;
            } else {
                z16 = z14;
            }
            C15043i8 c15043i15 = C15043i8.f56313a;
            if (viewState.getErrorMessage() != null) {
                c28655q2.m87150e0(735849110);
                black30 = c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend15();
            } else {
                c28655q2.m87150e0(735850536);
                black30 = c38072d.m121949b(c28655q2, i24).getBlack30();
            }
            c28655q2.m87173q(z14);
            c2314t3 = c2314t2;
            c28655q3 = c28655q2;
            c28676v3 = c28676v2;
            C15197y1 c15197y1M43129g8 = C15043i8.m43129g(c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getBrandWhite(), black30, c38072d.m121949b(c28655q2, i24).getBrandWhite(), c38072d.m121949b(c28655q2, i24).getWhite50(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getWhite10(), c38072d.m121949b(c28655q2, i24).getAccentNegativeTrend(), c28655q3, 2096656);
            objM87133R4 = c28655q3.m87133R();
            if (objM87133R4 == c28676v3) {
                objM87133R4 = new C21650c(29);
                c28655q3.m87172p0(objM87133R4);
            }
            AbstractC15050j4.m43135a(str3, (Function1) objM87133R4, modifierM3411h8, false, true, c23285v0M106661t8, null, AbstractC37817c.m121344e(578317544, c28655q3, new C17098f(viewState, 21)), C21870a.f84455a.m61999b(), z16, null, null, null, true, 0, 0, c33252i, c15197y1M43129g8, c28655q3, 817917360, 24576, 244032);
            c28655q = c28655q3;
            c28655q.m87173q(true);
            if (viewState.getErrorMessage() != null) {
                c28655q.m87150e0(-1505254513);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getErrorMessage(), c28655q, i17), AbstractC1099a.m3398t(c2314t3, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i24).getAccentNegativeTrend(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getFormLabel(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1504987045);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier6;
        } else {
            c28655q = c28655q4;
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(modifier3, viewState, function3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m62018h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final boolean m62019i(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    private static final void m62020j(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m62021k(Function1 function1, C21874e c21874e, String str, String str2, InterfaceC28601c1 interfaceC28601c1, InterfaceC15250v focusState) {
        AbstractC22676k.m65750j(focusState, "focusState");
        boolean zM62019i = m62019i(interfaceC28601c1);
        EnumC15251w enumC15251w = (EnumC15251w) focusState;
        m62020j(interfaceC28601c1, enumC15251w.m43354b());
        if (zM62019i && !enumC15251w.m43354b()) {
            String strM62030f = c21874e.getFieldId();
            if (AbstractC39414r.m125890i0(str)) {
                str = null;
            }
            function1.invoke(new AbstractC21872c.a(strM62030f, str, c21874e.getPattern(), str2, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m62022l(InterfaceC15237i interfaceC15237i, C21874e c21874e, Function1 function1, String str) {
        ((C15240l) interfaceC15237i).m43339b(false);
        if (!c21874e.m62031g().isEmpty()) {
            function1.invoke(new AbstractC21872c.b(c21874e.getFieldId(), str, c21874e.m62031g()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m62023m(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m62024n(C21874e c21874e, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            TextResource textResourceM62033i = c21874e.getPlaceholder();
            if (textResourceM62033i == null) {
                c28655q.m87150e0(1544182648);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1544182649);
                String strM21274h = AbstractC8693b.m21274h(textResourceM62033i, c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m62025o(Modifier modifier, C21874e c21874e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m62017g(modifier, c21874e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
