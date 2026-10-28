package w71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import sy0.AbstractC33085h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w71.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "question", "", "isSubQuestion", "checked", "enabled", "Lkotlin/Function1;", "Ll83/a0;", "onCheckedChanged", "b", "(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36881f {
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
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:81:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:85:0x0156  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:90:0x0171  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01df  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m118308b(TextResource question, boolean z4, boolean z13, boolean z14, Function1 onCheckedChanged, Composer composer, int i13, int i14) {
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        int i18;
        boolean z17;
        int i19;
        int i24;
        boolean z18;
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
        int i25;
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(onCheckedChanged, "onCheckedChanged");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1686911790);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(question) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                z15 = z4;
                i15 |= c28655q.m87155h(z15) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z16 = z13;
                    if (c28655q.m87155h(z16)) {
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
                        if (c28655q.m87155h(z17)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(onCheckedChanged)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i24 = i15;
                    if ((i24 & 9363) != 9362) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q.m87135U(i24 & 1, z18)) {
                        if (i26 != 0) {
                            z26 = false;
                        } else {
                            z26 = z15;
                        }
                        if (i16 != 0) {
                            z27 = false;
                        } else {
                            z27 = z16;
                        }
                        if (i18 != 0) {
                            z17 = true;
                        }
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                        if (z26) {
                            f13 = 2;
                        } else {
                            f13 = 0;
                        }
                        Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3409f, f13 * 8, 0.0f, 0.0f, 0.0f, 14);
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
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
                        AbstractC36907z.m118520c(question, null, false, null, c28655q, i24 & 14, 14);
                        c28655q.m87173q(true);
                        C38072d c38072d = C38072d.f163053a;
                        boolean z28 = z17;
                        boolean z29 = z27;
                        AbstractC33085h.m104813c(null, z29, onCheckedChanged, z28, null, AbstractC12240d.m34081r(c38072d.m121949b(c28655q, 6).getRecovery(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, ((i24 >> 3) & 112) | ((i24 >> 6) & 896) | (i24 & 7168), 465);
                        c28655q.m87173q(true);
                        z25 = z28;
                        z19 = z26;
                        z24 = z29;
                    } else {
                        c28655q.m87138X();
                        z19 = z15;
                        z24 = z16;
                        z25 = z17;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, onCheckedChanged, i13, i14, 0);
                    }
                }
                i15 |= 3072;
                z17 = z14;
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onCheckedChanged)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i24 = i15;
                if ((i24 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i24 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                    if (z26) {
                        f13 = 2;
                    } else {
                        f13 = 0;
                    }
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifierM3409f2, f13 * 8, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
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
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i7 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                    AbstractC36907z.m118520c(question, null, false, null, c28655q, i24 & 14, 14);
                    c28655q.m87173q(true);
                    C38072d c38072d2 = C38072d.f163053a;
                    boolean z210 = z17;
                    boolean z211 = z27;
                    AbstractC33085h.m104813c(null, z211, onCheckedChanged, z210, null, AbstractC12240d.m34081r(c38072d2.m121949b(c28655q, 6).getRecovery(), c38072d2.m121949b(c28655q, 6).getBrandWhite(), c38072d2.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, ((i24 >> 3) & 112) | ((i24 >> 6) & 896) | (i24 & 7168), 465);
                    c28655q.m87173q(true);
                    z25 = z210;
                    z19 = z26;
                    z24 = z211;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                    z24 = z16;
                    z25 = z17;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, onCheckedChanged, i13, i14, 0);
                }
            }
            i15 |= 384;
            z16 = z13;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z17 = z14;
                    if (c28655q.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onCheckedChanged)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i24 = i15;
                if ((i24 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i24 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                    if (z26) {
                        f13 = 2;
                    } else {
                        f13 = 0;
                    }
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(modifierM3409f3, f13 * 8, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
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
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i10 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                    AbstractC36907z.m118520c(question, null, false, null, c28655q, i24 & 14, 14);
                    c28655q.m87173q(true);
                    C38072d c38072d3 = C38072d.f163053a;
                    boolean z212 = z17;
                    boolean z213 = z27;
                    AbstractC33085h.m104813c(null, z213, onCheckedChanged, z212, null, AbstractC12240d.m34081r(c38072d3.m121949b(c28655q, 6).getRecovery(), c38072d3.m121949b(c28655q, 6).getBrandWhite(), c38072d3.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, ((i24 >> 3) & 112) | ((i24 >> 6) & 896) | (i24 & 7168), 465);
                    c28655q.m87173q(true);
                    z25 = z212;
                    z19 = z26;
                    z24 = z213;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                    z24 = z16;
                    z25 = z17;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, onCheckedChanged, i13, i14, 0);
                }
            }
            i15 |= 3072;
            z17 = z14;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onCheckedChanged)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i24 = i15;
            if ((i24 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i24 & 1, z18)) {
                if (i26 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z27 = false;
                } else {
                    z27 = z16;
                }
                if (i18 != 0) {
                    z17 = true;
                }
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                if (z26) {
                    f13 = 2;
                } else {
                    f13 = 0;
                }
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(modifierM3409f4, f13 * 8, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
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
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
                AbstractC36907z.m118520c(question, null, false, null, c28655q, i24 & 14, 14);
                c28655q.m87173q(true);
                C38072d c38072d4 = C38072d.f163053a;
                boolean z214 = z17;
                boolean z215 = z27;
                AbstractC33085h.m104813c(null, z215, onCheckedChanged, z214, null, AbstractC12240d.m34081r(c38072d4.m121949b(c28655q, 6).getRecovery(), c38072d4.m121949b(c28655q, 6).getBrandWhite(), c38072d4.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, ((i24 >> 3) & 112) | ((i24 >> 6) & 896) | (i24 & 7168), 465);
                c28655q.m87173q(true);
                z25 = z214;
                z19 = z26;
                z24 = z215;
            } else {
                c28655q.m87138X();
                z19 = z15;
                z24 = z16;
                z25 = z17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, onCheckedChanged, i13, i14, 0);
            }
        }
        i15 |= 48;
        z15 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z16 = z13;
                if (c28655q.m87155h(z16)) {
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
                    if (c28655q.m87155h(z17)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onCheckedChanged)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i24 = i15;
                if ((i24 & 9363) != 9362) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (c28655q.m87135U(i24 & 1, z18)) {
                    if (i26 != 0) {
                        z26 = false;
                    } else {
                        z26 = z15;
                    }
                    if (i16 != 0) {
                        z27 = false;
                    } else {
                        z27 = z16;
                    }
                    if (i18 != 0) {
                        z17 = true;
                    }
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                    if (z26) {
                        f13 = 2;
                    } else {
                        f13 = 0;
                    }
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(modifierM3409f5, f13 * 8, 0.0f, 0.0f, 0.0f, 14);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a5);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m9);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i16 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N9);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, layoutWeightElement5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                    AbstractC36907z.m118520c(question, null, false, null, c28655q, i24 & 14, 14);
                    c28655q.m87173q(true);
                    C38072d c38072d5 = C38072d.f163053a;
                    boolean z216 = z17;
                    boolean z217 = z27;
                    AbstractC33085h.m104813c(null, z217, onCheckedChanged, z216, null, AbstractC12240d.m34081r(c38072d5.m121949b(c28655q, 6).getRecovery(), c38072d5.m121949b(c28655q, 6).getBrandWhite(), c38072d5.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, ((i24 >> 3) & 112) | ((i24 >> 6) & 896) | (i24 & 7168), 465);
                    c28655q.m87173q(true);
                    z25 = z216;
                    z19 = z26;
                    z24 = z217;
                } else {
                    c28655q.m87138X();
                    z19 = z15;
                    z24 = z16;
                    z25 = z17;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, onCheckedChanged, i13, i14, 0);
                }
            }
            i15 |= 3072;
            z17 = z14;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onCheckedChanged)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i24 = i15;
            if ((i24 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i24 & 1, z18)) {
                if (i26 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z27 = false;
                } else {
                    z27 = z16;
                }
                if (i18 != 0) {
                    z17 = true;
                }
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                if (z26) {
                    f13 = 2;
                } else {
                    f13 = 0;
                }
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(modifierM3409f6, f13 * 8, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i17 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i17, c22994r1M66759a6);
                C0209i c0209i18 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m11);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i19 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N11);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, layoutWeightElement6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i17, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, modifierM118962N12);
                AbstractC36907z.m118520c(question, null, false, null, c28655q, i24 & 14, 14);
                c28655q.m87173q(true);
                C38072d c38072d6 = C38072d.f163053a;
                boolean z218 = z17;
                boolean z219 = z27;
                AbstractC33085h.m104813c(null, z219, onCheckedChanged, z218, null, AbstractC12240d.m34081r(c38072d6.m121949b(c28655q, 6).getRecovery(), c38072d6.m121949b(c28655q, 6).getBrandWhite(), c38072d6.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, ((i24 >> 3) & 112) | ((i24 >> 6) & 896) | (i24 & 7168), 465);
                c28655q.m87173q(true);
                z25 = z218;
                z19 = z26;
                z24 = z219;
            } else {
                c28655q.m87138X();
                z19 = z15;
                z24 = z16;
                z25 = z17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, onCheckedChanged, i13, i14, 0);
            }
        }
        i15 |= 384;
        z16 = z13;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z17 = z14;
                if (c28655q.m87155h(z17)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onCheckedChanged)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i24 = i15;
            if ((i24 & 9363) != 9362) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (c28655q.m87135U(i24 & 1, z18)) {
                if (i26 != 0) {
                    z26 = false;
                } else {
                    z26 = z15;
                }
                if (i16 != 0) {
                    z27 = false;
                } else {
                    z27 = z16;
                }
                if (i18 != 0) {
                    z17 = true;
                }
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                if (z26) {
                    f13 = 2;
                } else {
                    f13 = 0;
                }
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(modifierM3409f7, f13 * 8, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3398t7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i110, c22994r1M66759a7);
                C0209i c0209i111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m13);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N13);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, layoutWeightElement7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i110, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N14);
                AbstractC36907z.m118520c(question, null, false, null, c28655q, i24 & 14, 14);
                c28655q.m87173q(true);
                C38072d c38072d7 = C38072d.f163053a;
                boolean z2110 = z17;
                boolean z2111 = z27;
                AbstractC33085h.m104813c(null, z2111, onCheckedChanged, z2110, null, AbstractC12240d.m34081r(c38072d7.m121949b(c28655q, 6).getRecovery(), c38072d7.m121949b(c28655q, 6).getBrandWhite(), c38072d7.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, ((i24 >> 3) & 112) | ((i24 >> 6) & 896) | (i24 & 7168), 465);
                c28655q.m87173q(true);
                z25 = z2110;
                z19 = z26;
                z24 = z2111;
            } else {
                c28655q.m87138X();
                z19 = z15;
                z24 = z16;
                z25 = z17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, onCheckedChanged, i13, i14, 0);
            }
        }
        i15 |= 3072;
        z17 = z14;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(onCheckedChanged)) {
                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i25;
        }
        i24 = i15;
        if ((i24 & 9363) != 9362) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (c28655q.m87135U(i24 & 1, z18)) {
            if (i26 != 0) {
                z26 = false;
            } else {
                z26 = z15;
            }
            if (i16 != 0) {
                z27 = false;
            } else {
                z27 = z16;
            }
            if (i18 != 0) {
                z17 = true;
            }
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            if (z26) {
                f13 = 2;
            } else {
                f13 = 0;
            }
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(modifierM3409f8, f13 * 8, 0.0f, 0.0f, 0.0f, 14);
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3398t8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i113 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i113, c22994r1M66759a8);
            C0209i c0209i114 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m15);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N15);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, layoutWeightElement8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC28653p1M87165m16);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N16);
            AbstractC36907z.m118520c(question, null, false, null, c28655q, i24 & 14, 14);
            c28655q.m87173q(true);
            C38072d c38072d8 = C38072d.f163053a;
            boolean z2112 = z17;
            boolean z2113 = z27;
            AbstractC33085h.m104813c(null, z2113, onCheckedChanged, z2112, null, AbstractC12240d.m34081r(c38072d8.m121949b(c28655q, 6).getRecovery(), c38072d8.m121949b(c28655q, 6).getBrandWhite(), c38072d8.m121949b(c28655q, 6).getBrandBlack(), 0L, c28655q, 0, 24), null, 0.0f, 0.0f, c28655q, ((i24 >> 3) & 112) | ((i24 >> 6) & 896) | (i24 & 7168), 465);
            c28655q.m87173q(true);
            z25 = z2112;
            z19 = z26;
            z24 = z2113;
        } else {
            c28655q.m87138X();
            z19 = z15;
            z24 = z16;
            z25 = z17;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36879e(question, z19, z24, z25, onCheckedChanged, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m118309c(TextResource textResource, boolean z4, boolean z13, boolean z14, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m118308b(textResource, z4, z13, z14, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
