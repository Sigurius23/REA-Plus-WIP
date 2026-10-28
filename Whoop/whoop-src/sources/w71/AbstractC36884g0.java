package w71;

import a31.C0341c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b01.C2193n;
import com.whoop.design.util.TextResource;
import g21.AbstractC15280b;
import gb1.AbstractC15676d;
import gf1.C15787f;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p01.AbstractC28586f;
import p01.C28582b;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
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
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w71.g0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "question", "", "isSubQuestion", "", "selectedIndex", "enabled", "Lp01/b;", "indicatorItemState", "Lkotlin/Function1;", "Ll83/a0;", "onAnswer", "d", "(Lcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ZLp01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36884g0 {
    /* JADX WARN: Code duplicated, block: B:103:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:119:0x021e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0227  */
    /* JADX WARN: Code duplicated, block: B:125:0x0248  */
    /* JADX WARN: Code duplicated, block: B:126:0x024c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0259  */
    /* JADX WARN: Code duplicated, block: B:131:0x0267  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00da  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0137  */
    /* JADX WARN: Code duplicated, block: B:90:0x013b  */
    /* JADX WARN: Code duplicated, block: B:93:0x014e  */
    /* JADX WARN: Code duplicated, block: B:95:0x015c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x0171  */
    /* JADX INFO: renamed from: d */
    public static final void m118348d(TextResource question, boolean z4, Integer num, boolean z13, C28582b c28582b, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        Integer num2;
        int i17;
        int i18;
        boolean z14;
        int i19;
        int i24;
        boolean zM87157i;
        int i25;
        boolean z15;
        boolean z16;
        C28582b c28582b2;
        C28655q c28655q;
        Integer num3;
        boolean z17;
        C28677v1 c28677v1M87180u;
        boolean z18;
        Integer num4;
        boolean z19;
        C28582b c28582b3;
        C36875c c36875c;
        float fM118269a;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int iHashCode3;
        int i26;
        Function1 onAnswer = function1;
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(onAnswer, "onAnswer");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1059928212);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(question) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                i15 |= c28655q2.m87155h(z4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    num2 = num;
                    if (c28655q2.m87153g(num2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z14 = z13;
                        if (c28655q2.m87155h(z14)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        i15 |= 24576;
                    } else if ((i13 & 24576) == 0) {
                        if ((32768 & i13) == 0) {
                            zM87157i = c28655q2.m87153g(c28582b);
                        } else {
                            zM87157i = c28655q2.m87157i(c28582b);
                        }
                        if (zM87157i) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((196608 & i13) == 0) {
                        if (c28655q2.m87157i(onAnswer)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i26;
                    }
                    if ((74899 & i15) != 74898) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z15)) {
                        if (i27 != 0) {
                            z18 = false;
                        } else {
                            z18 = z4;
                        }
                        if (i16 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        if (i24 != 0) {
                            c28582b3 = null;
                        } else {
                            c28582b3 = c28582b;
                        }
                        c36875c = C36875c.f157714a;
                        if (z18) {
                            fM118269a = c36875c.m118270b();
                        } else {
                            fM118269a = c36875c.m118269a();
                        }
                        float f13 = fM118269a;
                        String strM118259c = AbstractC36871a.m118259c("Journal_YesNo_", question, c28655q2, ((i15 << 3) & 112) | 6);
                        c2314t = C2314t.f9131w;
                        Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 0.0f, 0.0f, 14), strM118259c);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44101d);
                        InterfaceC0221l.f734a.getClass();
                        int i28 = i15;
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i2 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                        C0209i c0209i3 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                        if (c28582b3 == null) {
                            c28655q2.m87150e0(-432218533);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-432218532);
                            AbstractC28586f.m86944i(AbstractC1099a.m3398t(c2314t, 2, 0.0f, 3 * 4, 0.0f, 10), c28582b3, c28655q2, 6, 0);
                            c28655q2.m87173q(false);
                        }
                        if (2.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                        C2305k c2305k = C2299e.f9110M;
                        C22957g c22957g = AbstractC22977m.f90652c;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 48);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                        C28582b c28582b4 = c28582b3;
                        AbstractC36907z.m118520c(question, null, false, null, c28655q2, i28 & 14, 14);
                        c28655q2.m87173q(true);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q2, 48);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                        onAnswer = function1;
                        c28655q = c28655q2;
                        c28582b2 = c28582b4;
                        AbstractC39330c.m125320b(0L, 0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, AbstractC37817c.m121344e(-293540340, c28655q2, new C0341c(num4, z19, onAnswer, 16)), c28655q, 24576, 11);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        num3 = num4;
                        z16 = z18;
                        z17 = z19;
                    } else {
                        c28655q2.m87138X();
                        z16 = z4;
                        c28582b2 = c28582b;
                        c28655q = c28655q2;
                        num3 = num2;
                        z17 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2193n(question, z16, num3, z17, c28582b2, onAnswer, i13, i14);
                    }
                }
                i15 |= 3072;
                z14 = z13;
                i24 = i14 & 16;
                if (i24 != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q2.m87153g(c28582b);
                    } else {
                        zM87157i = c28655q2.m87157i(c28582b);
                    }
                    if (zM87157i) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q2.m87157i(onAnswer)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((74899 & i15) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z15)) {
                    if (i27 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i24 != 0) {
                        c28582b3 = null;
                    } else {
                        c28582b3 = c28582b;
                    }
                    c36875c = C36875c.f157714a;
                    if (z18) {
                        fM118269a = c36875c.m118270b();
                    } else {
                        fM118269a = c36875c.m118269a();
                    }
                    float f14 = fM118269a;
                    String strM118259c2 = AbstractC36871a.m118259c("Journal_YesNo_", question, c28655q2, ((i15 << 3) & 112) | 6);
                    c2314t = C2314t.f9131w;
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0.0f, 0.0f, 0.0f, 14), strM118259c2);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM44101d2);
                    InterfaceC0221l.f734a.getClass();
                    int i29 = i15;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i5 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
                    C0209i c0209i6 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
                    if (c28582b3 == null) {
                        c28655q2.m87150e0(-432218533);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-432218532);
                        AbstractC28586f.m86944i(AbstractC1099a.m3398t(c2314t, 2, 0.0f, 3 * 4, 0.0f, 10), c28582b3, c28655q2, 6, 0);
                        c28655q2.m87173q(false);
                    }
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C2305k c2305k2 = C2299e.f9110M;
                    C22957g c22957g2 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N5);
                    C28582b c28582b5 = c28582b3;
                    AbstractC36907z.m118520c(question, null, false, null, c28655q2, i29 & 14, 14);
                    c28655q2.m87173q(true);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9112O, c28655q2, 48);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
                    onAnswer = function1;
                    c28655q = c28655q2;
                    c28582b2 = c28582b5;
                    AbstractC39330c.m125320b(0L, 0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, AbstractC37817c.m121344e(-293540340, c28655q2, new C0341c(num4, z19, onAnswer, 16)), c28655q, 24576, 11);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    num3 = num4;
                    z16 = z18;
                    z17 = z19;
                } else {
                    c28655q2.m87138X();
                    z16 = z4;
                    c28582b2 = c28582b;
                    c28655q = c28655q2;
                    num3 = num2;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2193n(question, z16, num3, z17, c28582b2, onAnswer, i13, i14);
                }
            }
            i15 |= 384;
            num2 = num;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z13;
                    if (c28655q2.m87155h(z14)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q2.m87153g(c28582b);
                    } else {
                        zM87157i = c28655q2.m87157i(c28582b);
                    }
                    if (zM87157i) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q2.m87157i(onAnswer)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((74899 & i15) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z15)) {
                    if (i27 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i24 != 0) {
                        c28582b3 = null;
                    } else {
                        c28582b3 = c28582b;
                    }
                    c36875c = C36875c.f157714a;
                    if (z18) {
                        fM118269a = c36875c.m118270b();
                    } else {
                        fM118269a = c36875c.m118269a();
                    }
                    float f15 = fM118269a;
                    String strM118259c3 = AbstractC36871a.m118259c("Journal_YesNo_", question, c28655q2, ((i15 << 3) & 112) | 6);
                    c2314t = C2314t.f9131w;
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 0.0f, 0.0f, 14), strM118259c3);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM44101d3);
                    InterfaceC0221l.f734a.getClass();
                    int i210 = i15;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i8 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i8, c22994r1M66759a3);
                    C0209i c0209i9 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N7);
                    if (c28582b3 == null) {
                        c28655q2.m87150e0(-432218533);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-432218532);
                        AbstractC28586f.m86944i(AbstractC1099a.m3398t(c2314t, 2, 0.0f, 3 * 4, 0.0f, 10), c28582b3, c28655q2, 6, 0);
                        c28655q2.m87173q(false);
                    }
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C2305k c2305k3 = C2299e.f9110M;
                    C22957g c22957g3 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement5);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m8);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N8);
                    C28582b c28582b6 = c28582b3;
                    AbstractC36907z.m118520c(question, null, false, null, c28655q2, i210 & 14, 14);
                    c28655q2.m87173q(true);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, C2299e.f9112O, c28655q2, 48);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement6);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m9);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N9);
                    onAnswer = function1;
                    c28655q = c28655q2;
                    c28582b2 = c28582b6;
                    AbstractC39330c.m125320b(0L, 0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, AbstractC37817c.m121344e(-293540340, c28655q2, new C0341c(num4, z19, onAnswer, 16)), c28655q, 24576, 11);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    num3 = num4;
                    z16 = z18;
                    z17 = z19;
                } else {
                    c28655q2.m87138X();
                    z16 = z4;
                    c28582b2 = c28582b;
                    c28655q = c28655q2;
                    num3 = num2;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2193n(question, z16, num3, z17, c28582b2, onAnswer, i13, i14);
                }
            }
            i15 |= 3072;
            z14 = z13;
            i24 = i14 & 16;
            if (i24 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q2.m87153g(c28582b);
                } else {
                    zM87157i = c28655q2.m87157i(c28582b);
                }
                if (zM87157i) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((196608 & i13) == 0) {
                if (c28655q2.m87157i(onAnswer)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            if ((74899 & i15) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                if (i27 != 0) {
                    z18 = false;
                } else {
                    z18 = z4;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i18 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i24 != 0) {
                    c28582b3 = null;
                } else {
                    c28582b3 = c28582b;
                }
                c36875c = C36875c.f157714a;
                if (z18) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f16 = fM118269a;
                String strM118259c4 = AbstractC36871a.m118259c("Journal_YesNo_", question, c28655q2, ((i15 << 3) & 112) | 6);
                c2314t = C2314t.f9131w;
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 0.0f, 0.0f, 14), strM118259c4);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM44101d4);
                InterfaceC0221l.f734a.getClass();
                int i211 = i15;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i11, c22994r1M66759a4);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N10);
                if (c28582b3 == null) {
                    c28655q2.m87150e0(-432218533);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-432218532);
                    AbstractC28586f.m86944i(AbstractC1099a.m3398t(c2314t, 2, 0.0f, 3 * 4, 0.0f, 10), c28582b3, c28655q2, 6, 0);
                    c28655q2.m87173q(false);
                }
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C2305k c2305k4 = C2299e.f9110M;
                C22957g c22957g4 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N11);
                C28582b c28582b7 = c28582b3;
                AbstractC36907z.m118520c(question, null, false, null, c28655q2, i211 & 14, 14);
                c28655q2.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, C2299e.f9112O, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement8);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N12);
                onAnswer = function1;
                c28655q = c28655q2;
                c28582b2 = c28582b7;
                AbstractC39330c.m125320b(0L, 0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, AbstractC37817c.m121344e(-293540340, c28655q2, new C0341c(num4, z19, onAnswer, 16)), c28655q, 24576, 11);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                num3 = num4;
                z16 = z18;
                z17 = z19;
            } else {
                c28655q2.m87138X();
                z16 = z4;
                c28582b2 = c28582b;
                c28655q = c28655q2;
                num3 = num2;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2193n(question, z16, num3, z17, c28582b2, onAnswer, i13, i14);
            }
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                num2 = num;
                if (c28655q2.m87153g(num2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z14 = z13;
                    if (c28655q2.m87155h(z14)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    i15 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    if ((32768 & i13) == 0) {
                        zM87157i = c28655q2.m87153g(c28582b);
                    } else {
                        zM87157i = c28655q2.m87157i(c28582b);
                    }
                    if (zM87157i) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((196608 & i13) == 0) {
                    if (c28655q2.m87157i(onAnswer)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i26;
                }
                if ((74899 & i15) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z15)) {
                    if (i27 != 0) {
                        z18 = false;
                    } else {
                        z18 = z4;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i24 != 0) {
                        c28582b3 = null;
                    } else {
                        c28582b3 = c28582b;
                    }
                    c36875c = C36875c.f157714a;
                    if (z18) {
                        fM118269a = c36875c.m118270b();
                    } else {
                        fM118269a = c36875c.m118269a();
                    }
                    float f17 = fM118269a;
                    String strM118259c5 = AbstractC36871a.m118259c("Journal_YesNo_", question, c28655q2, ((i15 << 3) & 112) | 6);
                    c2314t = C2314t.f9131w;
                    Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 0.0f, 0.0f, 14), strM118259c5);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM44101d5);
                    InterfaceC0221l.f734a.getClass();
                    int i212 = i15;
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i14, c22994r1M66759a5);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N13);
                    if (c28582b3 == null) {
                        c28655q2.m87150e0(-432218533);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-432218532);
                        AbstractC28586f.m86944i(AbstractC1099a.m3398t(c2314t, 2, 0.0f, 3 * 4, 0.0f, 10), c28582b3, c28655q2, 6, 0);
                        c28655q2.m87173q(false);
                    }
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C2305k c2305k5 = C2299e.f9110M;
                    C22957g c22957g5 = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement9);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m14);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N14);
                    C28582b c28582b8 = c28582b3;
                    AbstractC36907z.m118520c(question, null, false, null, c28655q2, i212 & 14, 14);
                    c28655q2.m87173q(true);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g5, C2299e.f9112O, c28655q2, 48);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement10);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m15);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N15);
                    onAnswer = function1;
                    c28655q = c28655q2;
                    c28582b2 = c28582b8;
                    AbstractC39330c.m125320b(0L, 0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, AbstractC37817c.m121344e(-293540340, c28655q2, new C0341c(num4, z19, onAnswer, 16)), c28655q, 24576, 11);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    num3 = num4;
                    z16 = z18;
                    z17 = z19;
                } else {
                    c28655q2.m87138X();
                    z16 = z4;
                    c28582b2 = c28582b;
                    c28655q = c28655q2;
                    num3 = num2;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2193n(question, z16, num3, z17, c28582b2, onAnswer, i13, i14);
                }
            }
            i15 |= 3072;
            z14 = z13;
            i24 = i14 & 16;
            if (i24 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q2.m87153g(c28582b);
                } else {
                    zM87157i = c28655q2.m87157i(c28582b);
                }
                if (zM87157i) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((196608 & i13) == 0) {
                if (c28655q2.m87157i(onAnswer)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            if ((74899 & i15) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                if (i27 != 0) {
                    z18 = false;
                } else {
                    z18 = z4;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i18 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i24 != 0) {
                    c28582b3 = null;
                } else {
                    c28582b3 = c28582b;
                }
                c36875c = C36875c.f157714a;
                if (z18) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f18 = fM118269a;
                String strM118259c6 = AbstractC36871a.m118259c("Journal_YesNo_", question, c28655q2, ((i15 << 3) & 112) | 6);
                c2314t = C2314t.f9131w;
                Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f18, 0.0f, 0.0f, 0.0f, 14), strM118259c6);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM44101d6);
                InterfaceC0221l.f734a.getClass();
                int i213 = i15;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i17 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i17, c22994r1M66759a6);
                C0209i c0209i18 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i19, modifierM118962N16);
                if (c28582b3 == null) {
                    c28655q2.m87150e0(-432218533);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-432218532);
                    AbstractC28586f.m86944i(AbstractC1099a.m3398t(c2314t, 2, 0.0f, 3 * 4, 0.0f, 10), c28582b3, c28655q2, 6, 0);
                    c28655q2.m87173q(false);
                }
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C2305k c2305k6 = C2299e.f9110M;
                C22957g c22957g6 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement11);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i17, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC28653p1M87165m17);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i19, modifierM118962N17);
                C28582b c28582b9 = c28582b3;
                AbstractC36907z.m118520c(question, null, false, null, c28655q2, i213 & 14, 14);
                c28655q2.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g6, C2299e.f9112O, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement12);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i17, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q2, c0209i18, interfaceC28653p1M87165m18);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i19, modifierM118962N18);
                onAnswer = function1;
                c28655q = c28655q2;
                c28582b2 = c28582b9;
                AbstractC39330c.m125320b(0L, 0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, AbstractC37817c.m121344e(-293540340, c28655q2, new C0341c(num4, z19, onAnswer, 16)), c28655q, 24576, 11);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                num3 = num4;
                z16 = z18;
                z17 = z19;
            } else {
                c28655q2.m87138X();
                z16 = z4;
                c28582b2 = c28582b;
                c28655q = c28655q2;
                num3 = num2;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2193n(question, z16, num3, z17, c28582b2, onAnswer, i13, i14);
            }
        }
        i15 |= 384;
        num2 = num;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                if (c28655q2.m87155h(z14)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                i15 |= 24576;
            } else if ((i13 & 24576) == 0) {
                if ((32768 & i13) == 0) {
                    zM87157i = c28655q2.m87153g(c28582b);
                } else {
                    zM87157i = c28655q2.m87157i(c28582b);
                }
                if (zM87157i) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((196608 & i13) == 0) {
                if (c28655q2.m87157i(onAnswer)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i26;
            }
            if ((74899 & i15) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                if (i27 != 0) {
                    z18 = false;
                } else {
                    z18 = z4;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i18 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i24 != 0) {
                    c28582b3 = null;
                } else {
                    c28582b3 = c28582b;
                }
                c36875c = C36875c.f157714a;
                if (z18) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f19 = fM118269a;
                String strM118259c7 = AbstractC36871a.m118259c("Journal_YesNo_", question, c28655q2, ((i15 << 3) & 112) | 6);
                c2314t = C2314t.f9131w;
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f19, 0.0f, 0.0f, 0.0f, 14), strM118259c7);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM44101d7);
                InterfaceC0221l.f734a.getClass();
                int i214 = i15;
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i110, c22994r1M66759a7);
                C0209i c0209i111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC28653p1M87165m19);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i112, modifierM118962N19);
                if (c28582b3 == null) {
                    c28655q2.m87150e0(-432218533);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-432218532);
                    AbstractC28586f.m86944i(AbstractC1099a.m3398t(c2314t, 2, 0.0f, 3 * 4, 0.0f, 10), c28582b3, c28655q2, 6, 0);
                    c28655q2.m87173q(false);
                }
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C2305k c2305k7 = C2299e.f9110M;
                C22957g c22957g7 = AbstractC22977m.f90652c;
                C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement13);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i110, c23010xM66775a13);
                AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC28653p1M87165m110);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i112, modifierM118962N110);
                C28582b c28582b10 = c28582b3;
                AbstractC36907z.m118520c(question, null, false, null, c28655q2, i214 & 14, 14);
                c28655q2.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g7, C2299e.f9112O, c28655q2, 48);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement14);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i110, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q2, c0209i111, interfaceC28653p1M87165m111);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i112, modifierM118962N111);
                onAnswer = function1;
                c28655q = c28655q2;
                c28582b2 = c28582b10;
                AbstractC39330c.m125320b(0L, 0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, AbstractC37817c.m121344e(-293540340, c28655q2, new C0341c(num4, z19, onAnswer, 16)), c28655q, 24576, 11);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                num3 = num4;
                z16 = z18;
                z17 = z19;
            } else {
                c28655q2.m87138X();
                z16 = z4;
                c28582b2 = c28582b;
                c28655q = c28655q2;
                num3 = num2;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2193n(question, z16, num3, z17, c28582b2, onAnswer, i13, i14);
            }
        }
        i15 |= 3072;
        z14 = z13;
        i24 = i14 & 16;
        if (i24 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            if ((32768 & i13) == 0) {
                zM87157i = c28655q2.m87153g(c28582b);
            } else {
                zM87157i = c28655q2.m87157i(c28582b);
            }
            if (zM87157i) {
                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i25;
        }
        if ((196608 & i13) == 0) {
            if (c28655q2.m87157i(onAnswer)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i26;
        }
        if ((74899 & i15) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z15)) {
            if (i27 != 0) {
                z18 = false;
            } else {
                z18 = z4;
            }
            if (i16 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (i18 != 0) {
                z19 = true;
            } else {
                z19 = z14;
            }
            if (i24 != 0) {
                c28582b3 = null;
            } else {
                c28582b3 = c28582b;
            }
            c36875c = C36875c.f157714a;
            if (z18) {
                fM118269a = c36875c.m118270b();
            } else {
                fM118269a = c36875c.m118269a();
            }
            float f110 = fM118269a;
            String strM118259c8 = AbstractC36871a.m118259c("Journal_YesNo_", question, c28655q2, ((i15 << 3) & 112) | 6);
            c2314t = C2314t.f9131w;
            Modifier modifierM44101d8 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 0.0f, 0.0f, 14), strM118259c8);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM44101d8);
            InterfaceC0221l.f734a.getClass();
            int i215 = i15;
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i113 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i113, c22994r1M66759a8);
            C0209i c0209i114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N112);
            if (c28582b3 == null) {
                c28655q2.m87150e0(-432218533);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-432218532);
                AbstractC28586f.m86944i(AbstractC1099a.m3398t(c2314t, 2, 0.0f, 3 * 4, 0.0f, 10), c28582b3, c28655q2, 6, 0);
                c28655q2.m87173q(false);
            }
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement15 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
            C2305k c2305k8 = C2299e.f9110M;
            C22957g c22957g8 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement15);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i113, c23010xM66775a15);
            AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC28653p1M87165m113);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N113);
            C28582b c28582b11 = c28582b3;
            AbstractC36907z.m118520c(question, null, false, null, c28655q2, i215 & 14, 14);
            c28655q2.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement16 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g8, C2299e.f9112O, c28655q2, 48);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement16);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i113, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q2, c0209i114, interfaceC28653p1M87165m114);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N114);
            onAnswer = function1;
            c28655q = c28655q2;
            c28582b2 = c28582b11;
            AbstractC39330c.m125320b(0L, 0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, AbstractC37817c.m121344e(-293540340, c28655q2, new C0341c(num4, z19, onAnswer, 16)), c28655q, 24576, 11);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            num3 = num4;
            z16 = z18;
            z17 = z19;
        } else {
            c28655q2.m87138X();
            z16 = z4;
            c28582b2 = c28582b;
            c28655q = c28655q2;
            num3 = num2;
            z17 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2193n(question, z16, num3, z17, c28582b2, onAnswer, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118349e(Integer num, boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            List listM118959K = AbstractC37056f.m118959K(Integer.valueOf(c38072d.m121951d().getTinyIcons().getCross()), Integer.valueOf(c38072d.m121951d().getTinyIcons().getCheckmark()));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(2 * 4);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(num);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C15787f(function1, num, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15280b.m43374d(listM118959K, num, z4, c22971kM66746i, (Function1) objM87133R, c28655q, 3072, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m118350f(Function1 function1, Integer num, int i13) {
        Boolean boolValueOf;
        if (num != null && i13 == num.intValue()) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(i13 != 0);
        }
        function1.invoke(boolValueOf);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m118351g(TextResource textResource, boolean z4, Integer num, boolean z13, C28582b c28582b, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m118348d(textResource, z4, num, z13, c28582b, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
