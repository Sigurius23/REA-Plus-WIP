package w71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b01.C2193n;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27283u0;
import ny0.AbstractC27285v0;
import ny0.EnumC27251e1;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p023ay.C2124a0;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import p745y81.AbstractC39330c;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import x81.C38070b;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: w71.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "question", "context", "", "number", "", "isSubQuestion", "enabled", "Lkotlin/Function0;", "Ll83/a0;", "tapAction", "d", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Double;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36895n {
    /* JADX WARN: Code duplicated, block: B:102:0x0178  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:118:0x0207  */
    /* JADX WARN: Code duplicated, block: B:121:0x022c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0230  */
    /* JADX WARN: Code duplicated, block: B:125:0x023d  */
    /* JADX WARN: Code duplicated, block: B:127:0x024b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0263  */
    /* JADX WARN: Code duplicated, block: B:131:0x0265  */
    /* JADX WARN: Code duplicated, block: B:135:0x0284  */
    /* JADX WARN: Code duplicated, block: B:138:0x028d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0291  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:152:0x0307  */
    /* JADX WARN: Code duplicated, block: B:155:0x0313  */
    /* JADX WARN: Code duplicated, block: B:157:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0121  */
    /* JADX WARN: Code duplicated, block: B:87:0x012c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132 A[LOOP:0: B:85:0x0125->B:89:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0144  */
    /* JADX WARN: Code duplicated, block: B:97:0x014c A[LOOP:1: B:93:0x0141->B:97:0x014c, LOOP_END] */
    /* JADX INFO: renamed from: d */
    public static final void m118456d(TextResource question, TextResource context, Double d3, boolean z4, boolean z13, InterfaceC4339a tapAction, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        boolean z16;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        boolean z19;
        C36875c c36875c;
        float fM118269a;
        double dDoubleValue;
        long jM125318d;
        String strM92103Y;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        int iHashCode2;
        boolean z24;
        float f13;
        int iHashCode3;
        String strValueOf;
        int iM125884c0;
        String strM53368i;
        int iM125884c1;
        int i19;
        Double d14 = d3;
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(tapAction, "tapAction");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1851593367);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(question) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(context) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(d14) ? 256 : 128;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                z14 = z4;
                i15 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q.m87157i(tapAction)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((74899 & i15) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    if (i24 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z15;
                    }
                    c36875c = C36875c.f157714a;
                    if (z17) {
                        fM118269a = c36875c.m118270b();
                    } else {
                        fM118269a = c36875c.m118269a();
                    }
                    float f14 = fM118269a;
                    if (d14 != null) {
                        dDoubleValue = d14.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (dDoubleValue > 0.0d) {
                        c28655q.m87150e0(1264779743);
                        jM125318d = C38072d.f163053a.m121949b(c28655q, 6).getRecovery();
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1264781247);
                        jM125318d = C38070b.f163049a.m121943a(c28655q, 6).getNegative();
                        c28655q.m87173q(false);
                    }
                    long j7 = jM125318d;
                    if (d14 != null) {
                        c28655q.m87150e0(553577041);
                        strValueOf = String.valueOf(d14.doubleValue());
                        if (AbstractC39414r.m125875T(strValueOf, '.', false)) {
                            iM125884c0 = AbstractC39414r.m125884c0(strValueOf);
                            while (true) {
                                if (-1 < iM125884c0) {
                                    strM53368i = "";
                                    break;
                                } else {
                                    if (strValueOf.charAt(iM125884c0) == '0') {
                                        strM53368i = AbstractC18489d0.m53368i(iM125884c0, strValueOf, 1, 0, "substring(...)");
                                        break;
                                    }
                                    iM125884c0--;
                                }
                            }
                            iM125884c1 = AbstractC39414r.m125884c0(strM53368i);
                            while (true) {
                                if (-1 < iM125884c1) {
                                    strValueOf = "";
                                    break;
                                } else {
                                    if (strM53368i.charAt(iM125884c1) == '.') {
                                        strValueOf = AbstractC18489d0.m53368i(iM125884c1, strM53368i, 1, 0, "substring(...)");
                                        break;
                                    }
                                    iM125884c1--;
                                }
                            }
                        }
                        strM92103Y = strValueOf + " " + AbstractC8693b.m21274h(context, c28655q, (i15 >> 3) & 14);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(553794289);
                        strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62384u1);
                        c28655q.m87173q(false);
                    }
                    String str = strM92103Y;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f14, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    i18 = i15;
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C2305k c2305k = C2299e.f9110M;
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    TextResource textResourceM21267a = AbstractC8693b.m21267a();
                    if (AbstractC8693b.m21274h(context, c28655q, (i18 >> 3) & 14).length() > 0) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    AbstractC36907z.m118520c(question, textResourceM21267a, z24, null, c28655q, i18 & 14, 8);
                    c28655q.m87173q(true);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f13, true);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q, 48);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    d14 = d3;
                    z15 = z19;
                    AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1753492961, c28655q, new C2124a0(d14, str, z19, tapAction)), c28655q, 24576, 13);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                    z17 = z14;
                }
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2193n(question, context, d14, z17, z18, tapAction, i13, i14, 6);
                }
            }
            i15 |= 24576;
            z15 = z13;
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(tapAction)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i24 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                c36875c = C36875c.f157714a;
                if (z17) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f15 = fM118269a;
                if (d14 != null) {
                    dDoubleValue = d14.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                if (dDoubleValue > 0.0d) {
                    c28655q.m87150e0(1264779743);
                    jM125318d = C38072d.f163053a.m121949b(c28655q, 6).getRecovery();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1264781247);
                    jM125318d = C38070b.f163049a.m121943a(c28655q, 6).getNegative();
                    c28655q.m87173q(false);
                }
                long j13 = jM125318d;
                if (d14 != null) {
                    c28655q.m87150e0(553577041);
                    strValueOf = String.valueOf(d14.doubleValue());
                    if (AbstractC39414r.m125875T(strValueOf, '.', false)) {
                        iM125884c0 = AbstractC39414r.m125884c0(strValueOf);
                        while (true) {
                            if (-1 < iM125884c0) {
                                strM53368i = "";
                                break;
                            } else {
                                if (strValueOf.charAt(iM125884c0) == '0') {
                                    strM53368i = AbstractC18489d0.m53368i(iM125884c0, strValueOf, 1, 0, "substring(...)");
                                    break;
                                }
                                iM125884c0--;
                            }
                        }
                        iM125884c1 = AbstractC39414r.m125884c0(strM53368i);
                        while (true) {
                            if (-1 < iM125884c1) {
                                strValueOf = "";
                                break;
                            } else {
                                if (strM53368i.charAt(iM125884c1) == '.') {
                                    strValueOf = AbstractC18489d0.m53368i(iM125884c1, strM53368i, 1, 0, "substring(...)");
                                    break;
                                }
                                iM125884c1--;
                            }
                        }
                    }
                    strM92103Y = strValueOf + " " + AbstractC8693b.m21274h(context, c28655q, (i15 >> 3) & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(553794289);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62384u1);
                    c28655q.m87173q(false);
                }
                String str2 = strM92103Y;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f15, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                i18 = i15;
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C2305k c2305k2 = C2299e.f9110M;
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                if (AbstractC8693b.m21274h(context, c28655q, (i18 >> 3) & 14).length() > 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                AbstractC36907z.m118520c(question, textResourceM21267a2, z24, null, c28655q, i18 & 14, 8);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f13, true);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9112O, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                d14 = d3;
                z15 = z19;
                AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1753492961, c28655q, new C2124a0(d14, str2, z19, tapAction)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                z17 = z14;
            }
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2193n(question, context, d14, z17, z18, tapAction, i13, i14, 6);
            }
        }
        i15 |= 3072;
        z14 = z4;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((196608 & i13) == 0) {
                if (c28655q.m87157i(tapAction)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((74899 & i15) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i24 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z15;
                }
                c36875c = C36875c.f157714a;
                if (z17) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f16 = fM118269a;
                if (d14 != null) {
                    dDoubleValue = d14.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                if (dDoubleValue > 0.0d) {
                    c28655q.m87150e0(1264779743);
                    jM125318d = C38072d.f163053a.m121949b(c28655q, 6).getRecovery();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1264781247);
                    jM125318d = C38070b.f163049a.m121943a(c28655q, 6).getNegative();
                    c28655q.m87173q(false);
                }
                long j14 = jM125318d;
                if (d14 != null) {
                    c28655q.m87150e0(553577041);
                    strValueOf = String.valueOf(d14.doubleValue());
                    if (AbstractC39414r.m125875T(strValueOf, '.', false)) {
                        iM125884c0 = AbstractC39414r.m125884c0(strValueOf);
                        while (true) {
                            if (-1 < iM125884c0) {
                                strM53368i = "";
                                break;
                            } else {
                                if (strValueOf.charAt(iM125884c0) == '0') {
                                    strM53368i = AbstractC18489d0.m53368i(iM125884c0, strValueOf, 1, 0, "substring(...)");
                                    break;
                                }
                                iM125884c0--;
                            }
                        }
                        iM125884c1 = AbstractC39414r.m125884c0(strM53368i);
                        while (true) {
                            if (-1 < iM125884c1) {
                                strValueOf = "";
                                break;
                            } else {
                                if (strM53368i.charAt(iM125884c1) == '.') {
                                    strValueOf = AbstractC18489d0.m53368i(iM125884c1, strM53368i, 1, 0, "substring(...)");
                                    break;
                                }
                                iM125884c1--;
                            }
                        }
                    }
                    strM92103Y = strValueOf + " " + AbstractC8693b.m21274h(context, c28655q, (i15 >> 3) & 14);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(553794289);
                    strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62384u1);
                    c28655q.m87173q(false);
                }
                String str3 = strM92103Y;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f16, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N7);
                i18 = i15;
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C2305k c2305k3 = C2299e.f9110M;
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
                TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                if (AbstractC8693b.m21274h(context, c28655q, (i18 >> 3) & 14).length() > 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                AbstractC36907z.m118520c(question, textResourceM21267a3, z24, null, c28655q, i18 & 14, 8);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(f13, true);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, C2299e.f9112O, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
                d14 = d3;
                z15 = z19;
                AbstractC39330c.m125320b(0L, j14, 0L, 0L, AbstractC37817c.m121344e(-1753492961, c28655q, new C2124a0(d14, str3, z19, tapAction)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                z17 = z14;
            }
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2193n(question, context, d14, z17, z18, tapAction, i13, i14, 6);
            }
        }
        i15 |= 24576;
        z15 = z13;
        if ((196608 & i13) == 0) {
            if (c28655q.m87157i(tapAction)) {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i19;
        }
        if ((74899 & i15) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            if (i24 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            if (i16 != 0) {
                z19 = true;
            } else {
                z19 = z15;
            }
            c36875c = C36875c.f157714a;
            if (z17) {
                fM118269a = c36875c.m118270b();
            } else {
                fM118269a = c36875c.m118269a();
            }
            float f17 = fM118269a;
            if (d14 != null) {
                dDoubleValue = d14.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            if (dDoubleValue > 0.0d) {
                c28655q.m87150e0(1264779743);
                jM125318d = C38072d.f163053a.m121949b(c28655q, 6).getRecovery();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1264781247);
                jM125318d = C38070b.f163049a.m121943a(c28655q, 6).getNegative();
                c28655q.m87173q(false);
            }
            long j15 = jM125318d;
            if (d14 != null) {
                c28655q.m87150e0(553577041);
                strValueOf = String.valueOf(d14.doubleValue());
                if (AbstractC39414r.m125875T(strValueOf, '.', false)) {
                    iM125884c0 = AbstractC39414r.m125884c0(strValueOf);
                    while (true) {
                        if (-1 < iM125884c0) {
                            strM53368i = "";
                            break;
                        } else {
                            if (strValueOf.charAt(iM125884c0) == '0') {
                                strM53368i = AbstractC18489d0.m53368i(iM125884c0, strValueOf, 1, 0, "substring(...)");
                                break;
                            }
                            iM125884c0--;
                        }
                    }
                    iM125884c1 = AbstractC39414r.m125884c0(strM53368i);
                    while (true) {
                        if (-1 < iM125884c1) {
                            strValueOf = "";
                            break;
                        } else {
                            if (strM53368i.charAt(iM125884c1) == '.') {
                                strValueOf = AbstractC18489d0.m53368i(iM125884c1, strM53368i, 1, 0, "substring(...)");
                                break;
                            }
                            iM125884c1--;
                        }
                    }
                }
                strM92103Y = strValueOf + " " + AbstractC8693b.m21274h(context, c28655q, (i15 >> 3) & 14);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(553794289);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62384u1);
                c28655q.m87173q(false);
            }
            String str4 = strM92103Y;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f17, 0.0f, 0.0f, 0.0f, 14);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M66759a4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N10);
            i18 = i15;
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
            C2305k c2305k4 = C2299e.f9110M;
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, layoutWeightElement7);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m11);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
            TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
            if (AbstractC8693b.m21274h(context, c28655q, (i18 >> 3) & 14).length() > 0) {
                z24 = true;
            } else {
                z24 = false;
            }
            AbstractC36907z.m118520c(question, textResourceM21267a4, z24, null, c28655q, i18 & 14, 8);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(f13, true);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, C2299e.f9112O, c28655q, 48);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N12);
            d14 = d3;
            z15 = z19;
            AbstractC39330c.m125320b(0L, j15, 0L, 0L, AbstractC37817c.m121344e(-1753492961, c28655q, new C2124a0(d14, str4, z19, tapAction)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            z17 = z14;
        }
        z18 = z15;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2193n(question, context, d14, z17, z18, tapAction, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118457e(Double d3, String str, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3429z = AbstractC1102d.m3429z(C2314t.f9131w, null, 3);
            AbstractC27285v0.c cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
            boolean z13 = d3 != null && d3.doubleValue() > 0.0d;
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C31918g(interfaceC4339a, 21);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27283u0.m82318q(modifierM3429z, str, null, null, cVar, z13, z4, 0.0f, null, (InterfaceC4339a) objM87133R, c28655q, 6, 396);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m118458f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m118459g(TextResource textResource, TextResource textResource2, Double d3, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m118456d(textResource, textResource2, d3, z4, z13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
