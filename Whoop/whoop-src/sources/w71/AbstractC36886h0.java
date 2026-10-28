package w71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2569l6;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
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
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import v41.C35657b0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w71.h0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "question", "", "isSubQuestion", "checked", "enabled", "Lkotlin/Function1;", "Ll83/a0;", "isAffirmative", "d", "(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36886h0 {
    /* JADX WARN: Code duplicated, block: B:102:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:111:0x0203  */
    /* JADX WARN: Code duplicated, block: B:113:0x0240  */
    /* JADX WARN: Code duplicated, block: B:116:0x024e  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:72:0x0108  */
    /* JADX WARN: Code duplicated, block: B:75:0x011b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0129  */
    /* JADX WARN: Code duplicated, block: B:81:0x013e  */
    /* JADX WARN: Code duplicated, block: B:84:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0170  */
    /* JADX WARN: Code duplicated, block: B:88:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:93:0x018f  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ba  */
    /* JADX INFO: renamed from: d */
    public static final void m118355d(TextResource question, boolean z4, boolean z13, boolean z14, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        int i18;
        boolean z17;
        int i19;
        boolean z18;
        C28655q c28655q;
        boolean z19;
        boolean z24;
        boolean z25;
        C28677v1 c28677v1M87180u;
        boolean z26;
        boolean z27;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C0209i c0209i2;
        C0209i c0209i3;
        int iHashCode3;
        int i24;
        Function1 isAffirmative = function1;
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(isAffirmative, "isAffirmative");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-86600010);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(question) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                z15 = z4;
                i15 |= c28655q2.m87155h(z15) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z16 = z13;
                    if (c28655q2.m87155h(z16)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z17 = z14;
                        if (c28655q2.m87155h(z17)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & 24576) == 0) {
                        if (c28655q2.m87157i(isAffirmative)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i24;
                    }
                    if ((i15 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z18)) {
                        if (i25 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        }
                        if (i18 != 0) {
                            z27 = true;
                        } else {
                            z27 = z17;
                        }
                        if (z26) {
                            f13 = 2;
                        } else {
                            f13 = 0;
                        }
                        Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13 * 8, 0.0f, 0.0f, 0.0f, 14), AbstractC36871a.m118259c("Journal_Toggle_", question, c28655q2, ((i15 << 3) & 112) | 6));
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44101d);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i4 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i4, c22994r1M66759a);
                        C0209i c0209i5 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        C0209i c0209i6 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
                        int i26 = i15;
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
                        AbstractC28683x.m87239G(c28655q2, c0209i4, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            c0209i2 = c0209i;
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N2);
                        c0209i3 = c0209i2;
                        AbstractC36907z.m118520c(question, null, false, null, c28655q2, i26 & 14, 14);
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
                        AbstractC28683x.m87239G(c28655q2, c0209i4, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m3);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N3);
                        isAffirmative = function1;
                        c28655q = c28655q2;
                        AbstractC39330c.m125320b(0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, 0L, AbstractC37817c.m121344e(-728402370, c28655q2, new C2569l6(isAffirmative, z16, z27)), c28655q, 24576, 13);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        z24 = z16;
                        z19 = z26;
                        z25 = z27;
                    } else {
                        c28655q2.m87138X();
                        c28655q = c28655q2;
                        z19 = z15;
                        z24 = z16;
                        z25 = z17;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, isAffirmative, i13, i14, 1);
                    }
                }
                i15 |= 3072;
                z17 = z14;
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87157i(isAffirmative)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i24;
                }
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z18)) {
                    if (i25 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z27 = true;
                    } else {
                        z27 = z17;
                    }
                    if (z26) {
                        f13 = 2;
                    } else {
                        f13 = 0;
                    }
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13 * 8, 0.0f, 0.0f, 0.0f, 14), AbstractC36871a.m118259c("Journal_Toggle_", question, c28655q2, ((i15 << 3) & 112) | 6));
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM44101d2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i7 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i7, c22994r1M66759a2);
                    C0209i c0209i8 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
                    int i27 = i15;
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
                    AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N5);
                    c0209i3 = c0209i2;
                    AbstractC36907z.m118520c(question, null, false, null, c28655q2, i27 & 14, 14);
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
                    AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m6);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
                    isAffirmative = function1;
                    c28655q = c28655q2;
                    AbstractC39330c.m125320b(0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, 0L, AbstractC37817c.m121344e(-728402370, c28655q2, new C2569l6(isAffirmative, z16, z27)), c28655q, 24576, 13);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    z24 = z16;
                    z19 = z26;
                    z25 = z27;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    z19 = z15;
                    z24 = z16;
                    z25 = z17;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, isAffirmative, i13, i14, 1);
                }
            }
            i15 |= 384;
            z16 = z13;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z17 = z14;
                    if (c28655q2.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87157i(isAffirmative)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i24;
                }
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z18)) {
                    if (i25 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z27 = true;
                    } else {
                        z27 = z17;
                    }
                    if (z26) {
                        f13 = 2;
                    } else {
                        f13 = 0;
                    }
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13 * 8, 0.0f, 0.0f, 0.0f, 14), AbstractC36871a.m118259c("Journal_Toggle_", question, c28655q2, ((i15 << 3) & 112) | 6));
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM44101d3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i10 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i10, c22994r1M66759a3);
                    C0209i c0209i11 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N7);
                    int i28 = i15;
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
                    AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N8);
                    c0209i3 = c0209i2;
                    AbstractC36907z.m118520c(question, null, false, null, c28655q2, i28 & 14, 14);
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
                    AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m9);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N9);
                    isAffirmative = function1;
                    c28655q = c28655q2;
                    AbstractC39330c.m125320b(0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, 0L, AbstractC37817c.m121344e(-728402370, c28655q2, new C2569l6(isAffirmative, z16, z27)), c28655q, 24576, 13);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    z24 = z16;
                    z19 = z26;
                    z25 = z27;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    z19 = z15;
                    z24 = z16;
                    z25 = z17;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, isAffirmative, i13, i14, 1);
                }
            }
            i15 |= 3072;
            z17 = z14;
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(isAffirmative)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z18)) {
                if (i25 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z27 = true;
                } else {
                    z27 = z17;
                }
                if (z26) {
                    f13 = 2;
                } else {
                    f13 = 0;
                }
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13 * 8, 0.0f, 0.0f, 0.0f, 14), AbstractC36871a.m118259c("Journal_Toggle_", question, c28655q2, ((i15 << 3) & 112) | 6));
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM44101d4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i13 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i13, c22994r1M66759a4);
                C0209i c0209i14 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC28653p1M87165m10);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i15 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i15, modifierM118962N10);
                int i29 = i15;
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
                AbstractC28683x.m87239G(c28655q2, c0209i13, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC28653p1M87165m11);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i15, modifierM118962N11);
                c0209i3 = c0209i2;
                AbstractC36907z.m118520c(question, null, false, null, c28655q2, i29 & 14, 14);
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
                AbstractC28683x.m87239G(c28655q2, c0209i13, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, c0209i14, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i15, modifierM118962N12);
                isAffirmative = function1;
                c28655q = c28655q2;
                AbstractC39330c.m125320b(0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, 0L, AbstractC37817c.m121344e(-728402370, c28655q2, new C2569l6(isAffirmative, z16, z27)), c28655q, 24576, 13);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                z24 = z16;
                z19 = z26;
                z25 = z27;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                z19 = z15;
                z24 = z16;
                z25 = z17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, isAffirmative, i13, i14, 1);
            }
        }
        i15 |= 48;
        z15 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z16 = z13;
                if (c28655q2.m87155h(z16)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z17 = z14;
                    if (c28655q2.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87157i(isAffirmative)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i24;
                }
                if ((i15 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z18)) {
                    if (i25 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    }
                    if (i18 != 0) {
                        z27 = true;
                    } else {
                        z27 = z17;
                    }
                    if (z26) {
                        f13 = 2;
                    } else {
                        f13 = 0;
                    }
                    Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13 * 8, 0.0f, 0.0f, 0.0f, 14), AbstractC36871a.m118259c("Journal_Toggle_", question, c28655q2, ((i15 << 3) & 112) | 6));
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM44101d5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i16 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i16, c22994r1M66759a5);
                    C0209i c0209i17 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i17, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i18 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N13);
                    int i210 = i15;
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
                    AbstractC28683x.m87239G(c28655q2, c0209i16, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q2, c0209i17, interfaceC28653p1M87165m14);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N14);
                    c0209i3 = c0209i2;
                    AbstractC36907z.m118520c(question, null, false, null, c28655q2, i210 & 14, 14);
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
                    AbstractC28683x.m87239G(c28655q2, c0209i16, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q2, c0209i17, interfaceC28653p1M87165m15);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N15);
                    isAffirmative = function1;
                    c28655q = c28655q2;
                    AbstractC39330c.m125320b(0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, 0L, AbstractC37817c.m121344e(-728402370, c28655q2, new C2569l6(isAffirmative, z16, z27)), c28655q, 24576, 13);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    z24 = z16;
                    z19 = z26;
                    z25 = z27;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    z19 = z15;
                    z24 = z16;
                    z25 = z17;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, isAffirmative, i13, i14, 1);
                }
            }
            i15 |= 3072;
            z17 = z14;
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(isAffirmative)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z18)) {
                if (i25 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z27 = true;
                } else {
                    z27 = z17;
                }
                if (z26) {
                    f13 = 2;
                } else {
                    f13 = 0;
                }
                Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13 * 8, 0.0f, 0.0f, 0.0f, 14), AbstractC36871a.m118259c("Journal_Toggle_", question, c28655q2, ((i15 << 3) & 112) | 6));
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM44101d6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i19 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i19, c22994r1M66759a6);
                C0209i c0209i110 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i110, interfaceC28653p1M87165m16);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N16);
                int i211 = i15;
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
                AbstractC28683x.m87239G(c28655q2, c0209i19, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q2, c0209i110, interfaceC28653p1M87165m17);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N17);
                c0209i3 = c0209i2;
                AbstractC36907z.m118520c(question, null, false, null, c28655q2, i211 & 14, 14);
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
                AbstractC28683x.m87239G(c28655q2, c0209i19, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q2, c0209i110, interfaceC28653p1M87165m18);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N18);
                isAffirmative = function1;
                c28655q = c28655q2;
                AbstractC39330c.m125320b(0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, 0L, AbstractC37817c.m121344e(-728402370, c28655q2, new C2569l6(isAffirmative, z16, z27)), c28655q, 24576, 13);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                z24 = z16;
                z19 = z26;
                z25 = z27;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                z19 = z15;
                z24 = z16;
                z25 = z17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, isAffirmative, i13, i14, 1);
            }
        }
        i15 |= 384;
        z16 = z13;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z17 = z14;
                if (c28655q2.m87155h(z17)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(isAffirmative)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z18)) {
                if (i25 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z16 = false;
                }
                if (i18 != 0) {
                    z27 = true;
                } else {
                    z27 = z17;
                }
                if (z26) {
                    f13 = 2;
                } else {
                    f13 = 0;
                }
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13 * 8, 0.0f, 0.0f, 0.0f, 14), AbstractC36871a.m118259c("Journal_Toggle_", question, c28655q2, ((i15 << 3) & 112) | 6));
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM44101d7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i112 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i112, c22994r1M66759a7);
                C0209i c0209i113 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m19);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i114 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N19);
                int i212 = i15;
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
                AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM66775a13);
                AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m110);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N110);
                c0209i3 = c0209i2;
                AbstractC36907z.m118520c(question, null, false, null, c28655q2, i212 & 14, 14);
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
                AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m111);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N111);
                isAffirmative = function1;
                c28655q = c28655q2;
                AbstractC39330c.m125320b(0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, 0L, AbstractC37817c.m121344e(-728402370, c28655q2, new C2569l6(isAffirmative, z16, z27)), c28655q, 24576, 13);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                z24 = z16;
                z19 = z26;
                z25 = z27;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                z19 = z15;
                z24 = z16;
                z25 = z17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, isAffirmative, i13, i14, 1);
            }
        }
        i15 |= 3072;
        z17 = z14;
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87157i(isAffirmative)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i24;
        }
        if ((i15 & 9363) != 9362) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z18)) {
            if (i25 != 0) {
                z26 = false;
            } else {
                z26 = z15;
            }
            if (i16 != 0) {
                z16 = false;
            }
            if (i18 != 0) {
                z27 = true;
            } else {
                z27 = z17;
            }
            if (z26) {
                f13 = 2;
            } else {
                f13 = 0;
            }
            Modifier modifierM44101d8 = AbstractC15676d.m44101d(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13 * 8, 0.0f, 0.0f, 0.0f, 14), AbstractC36871a.m118259c("Journal_Toggle_", question, c28655q2, ((i15 << 3) & 112) | 6));
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM44101d8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i115 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i115, c22994r1M66759a8);
            C0209i c0209i116 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i116, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i117 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i117, modifierM118962N112);
            int i213 = i15;
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
            AbstractC28683x.m87239G(c28655q2, c0209i115, c23010xM66775a15);
            AbstractC28683x.m87239G(c28655q2, c0209i116, interfaceC28653p1M87165m113);
            if (c28655q2.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i117, modifierM118962N113);
            c0209i3 = c0209i2;
            AbstractC36907z.m118520c(question, null, false, null, c28655q2, i213 & 14, 14);
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
            AbstractC28683x.m87239G(c28655q2, c0209i115, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q2, c0209i116, interfaceC28653p1M87165m114);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i117, modifierM118962N114);
            isAffirmative = function1;
            c28655q = c28655q2;
            AbstractC39330c.m125320b(0L, C38072d.f163053a.m121949b(c28655q2, 6).getRecovery(), 0L, 0L, AbstractC37817c.m121344e(-728402370, c28655q2, new C2569l6(isAffirmative, z16, z27)), c28655q, 24576, 13);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            z24 = z16;
            z19 = z26;
            z25 = z27;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
            z19 = z15;
            z24 = z16;
            z25 = z17;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, isAffirmative, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118356e(boolean z4, boolean z13, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C35657b0(function1, 27);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, z4, z13, 0L, null, null, (Function1) objM87133R, c28655q, 0, 57);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m118357f(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m118358g(TextResource textResource, boolean z4, boolean z13, boolean z14, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m118355d(textResource, z4, z13, z14, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
