package g51;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ep1.C13421p;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: g51.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "currentMonthTitle", "", "previousArrowEnabled", "nextArrowEnabled", "Lkotlin/Function0;", "Ll83/a0;", "previousArrowClick", "nextArrowClick", "b", "(Lcom/whoop/design/util/TextResource;ZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15491a {
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m43688b(TextResource currentMonthTitle, boolean z4, boolean z13, InterfaceC4339a previousArrowClick, InterfaceC4339a nextArrowClick, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        int i18;
        boolean z16;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        boolean z19;
        boolean z24;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i19;
        int i24;
        AbstractC22676k.m65750j(currentMonthTitle, "currentMonthTitle");
        AbstractC22676k.m65750j(previousArrowClick, "previousArrowClick");
        AbstractC22676k.m65750j(nextArrowClick, "nextArrowClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1004114624);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(currentMonthTitle) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                z14 = z4;
                i15 |= c28655q.m87155h(z14) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(previousArrowClick)) {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i24;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(nextArrowClick)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i18 = i15;
                if ((i18 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i18 & 1, z16)) {
                    if (i25 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        z24 = true;
                    } else {
                        z24 = z15;
                    }
                    C2314t c2314t = C2314t.f9131w;
                    float f13 = 8;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 3.5d) * f13, 0.0f, 2), 0.0f, 2 * f13, 0.0f, 0.0f, 13);
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
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC27274q.a aVar = AbstractC27274q.a.f109136f;
                    C38072d c38072d = C38072d.f163053a;
                    AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC18489d0.m53357C(c38072d), null, null, null, z19, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62310c), AbstractC15676d.m44101d(c2314t, "LeftArrowIconButton"), null, previousArrowClick, c28655q, (i18 << 3) & 57344, 8);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(currentMonthTitle, c28655q, i18 & 14), AbstractC15676d.m44101d(c2314t, "CalendarToolbar_MonthTitle"), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196600);
                    boolean z25 = z24;
                    AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC11895b.m31981D(c38072d), null, null, null, z25, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62306b), AbstractC15676d.m44101d(c2314t, "RightArrowIconButton"), null, nextArrowClick, c28655q, i18 & 57344, 8);
                    c28655q.m87173q(true);
                    z18 = z25;
                    z17 = z19;
                } else {
                    c28655q.m87138X();
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(currentMonthTitle, z17, z18, previousArrowClick, nextArrowClick, i13, i14, 5);
                }
            }
            i15 |= 384;
            z15 = z13;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(previousArrowClick)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i24;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(nextArrowClick)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i18 & 1, z16)) {
                if (i25 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = true;
                } else {
                    z24 = z15;
                }
                C2314t c2314t2 = C2314t.f9131w;
                float f14 = 8;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), ((float) 3.5d) * f14, 0.0f, 2), 0.0f, 2 * f14, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC27274q.a aVar2 = AbstractC27274q.a.f109136f;
                C38072d c38072d2 = C38072d.f163053a;
                AbstractC27242b1.m82092d(new C27270o(aVar2, AbstractC18489d0.m53357C(c38072d2), null, null, null, z19, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62310c), AbstractC15676d.m44101d(c2314t2, "LeftArrowIconButton"), null, previousArrowClick, c28655q, (i18 << 3) & 57344, 8);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(currentMonthTitle, c28655q, i18 & 14), AbstractC15676d.m44101d(c2314t2, "CalendarToolbar_MonthTitle"), c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196600);
                boolean z26 = z24;
                AbstractC27242b1.m82092d(new C27270o(aVar2, AbstractC11895b.m31981D(c38072d2), null, null, null, z26, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62306b), AbstractC15676d.m44101d(c2314t2, "RightArrowIconButton"), null, nextArrowClick, c28655q, i18 & 57344, 8);
                c28655q.m87173q(true);
                z18 = z26;
                z17 = z19;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(currentMonthTitle, z17, z18, previousArrowClick, nextArrowClick, i13, i14, 5);
            }
        }
        i15 |= 48;
        z14 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(previousArrowClick)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i24;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(nextArrowClick)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i18 = i15;
            if ((i18 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i18 & 1, z16)) {
                if (i25 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    z24 = true;
                } else {
                    z24 = z15;
                }
                C2314t c2314t3 = C2314t.f9131w;
                float f15 = 8;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), ((float) 3.5d) * f15, 0.0f, 2), 0.0f, 2 * f15, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC27274q.a aVar3 = AbstractC27274q.a.f109136f;
                C38072d c38072d3 = C38072d.f163053a;
                AbstractC27242b1.m82092d(new C27270o(aVar3, AbstractC18489d0.m53357C(c38072d3), null, null, null, z19, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62310c), AbstractC15676d.m44101d(c2314t3, "LeftArrowIconButton"), null, previousArrowClick, c28655q, (i18 << 3) & 57344, 8);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(currentMonthTitle, c28655q, i18 & 14), AbstractC15676d.m44101d(c2314t3, "CalendarToolbar_MonthTitle"), c38072d3.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196600);
                boolean z27 = z24;
                AbstractC27242b1.m82092d(new C27270o(aVar3, AbstractC11895b.m31981D(c38072d3), null, null, null, z27, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62306b), AbstractC15676d.m44101d(c2314t3, "RightArrowIconButton"), null, nextArrowClick, c28655q, i18 & 57344, 8);
                c28655q.m87173q(true);
                z18 = z27;
                z17 = z19;
            } else {
                c28655q.m87138X();
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(currentMonthTitle, z17, z18, previousArrowClick, nextArrowClick, i13, i14, 5);
            }
        }
        i15 |= 384;
        z15 = z13;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(previousArrowClick)) {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i24;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(nextArrowClick)) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i19;
        }
        i18 = i15;
        if ((i18 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i18 & 1, z16)) {
            if (i25 != 0) {
                z19 = true;
            } else {
                z19 = z14;
            }
            if (i16 != 0) {
                z24 = true;
            } else {
                z24 = z15;
            }
            C2314t c2314t4 = C2314t.f9131w;
            float f16 = 8;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t4), ((float) 3.5d) * f16, 0.0f, 2), 0.0f, 2 * f16, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            AbstractC27274q.a aVar4 = AbstractC27274q.a.f109136f;
            C38072d c38072d4 = C38072d.f163053a;
            AbstractC27242b1.m82092d(new C27270o(aVar4, AbstractC18489d0.m53357C(c38072d4), null, null, null, z19, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62310c), AbstractC15676d.m44101d(c2314t4, "LeftArrowIconButton"), null, previousArrowClick, c28655q, (i18 << 3) & 57344, 8);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(currentMonthTitle, c28655q, i18 & 14), AbstractC15676d.m44101d(c2314t4, "CalendarToolbar_MonthTitle"), c38072d4.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196600);
            boolean z28 = z24;
            AbstractC27242b1.m82092d(new C27270o(aVar4, AbstractC11895b.m31981D(c38072d4), null, null, null, z28, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62306b), AbstractC15676d.m44101d(c2314t4, "RightArrowIconButton"), null, nextArrowClick, c28655q, i18 & 57344, 8);
            c28655q.m87173q(true);
            z18 = z28;
            z17 = z19;
        } else {
            c28655q.m87138X();
            z17 = z14;
            z18 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(currentMonthTitle, z17, z18, previousArrowClick, nextArrowClick, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m43689c(TextResource textResource, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m43688b(textResource, z4, z13, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
