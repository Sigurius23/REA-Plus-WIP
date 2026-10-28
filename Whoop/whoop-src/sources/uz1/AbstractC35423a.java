package uz1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import ck1.C4789l;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33229w0;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uz1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"", "count", "Lcom/whoop/navigation/e;", "destination", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "Luz1/b;", "theme", "c", "(ILcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Luz1/b;Landroidx/compose/runtime/Composer;II)V", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35423a {
    /* JADX WARN: Code duplicated, block: B:100:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:105:0x0214  */
    /* JADX WARN: Code duplicated, block: B:107:0x0276  */
    /* JADX WARN: Code duplicated, block: B:109:0x0289  */
    /* JADX WARN: Code duplicated, block: B:112:0x0295  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:89:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x0148  */
    /* JADX WARN: Code duplicated, block: B:97:0x018a  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f5  */
    /* JADX INFO: renamed from: c */
    public static final void m112398c(int i13, C9598e c9598e, Function1 onViewEvent, Modifier modifier, EnumC35424b enumC35424b, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        int i17;
        int iOrdinal;
        int i18;
        boolean z4;
        EnumC35424b enumC35424b2;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        EnumC35424b enumC35424b3;
        float f13;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z17;
        int iHashCode2;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1973176942);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? c28655q.m87153g(c9598e) : c28655q.m87157i(c9598e) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i19 = i15 & 8;
        if (i19 == 0) {
            if ((i14 & 3072) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                i16 |= 24576;
            } else if ((i14 & 24576) == 0) {
                if (enumC35424b == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC35424b.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i18;
            }
            if ((i16 & 9363) != 9362) {
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
                if (i17 != 0) {
                    enumC35424b3 = EnumC35424b.DARK;
                } else {
                    enumC35424b3 = enumC35424b;
                }
                f13 = 4;
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3419p(12 * f13, modifier4), "CartIconWithBadge");
                if (c9598e != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i16 & 112) != 32 || ((i16 & 64) != 0 && c28655q.m87157i(c9598e))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R = c28655q.m87133R();
                if (z16 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C4789l(c9598e, onViewEvent, 10);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3599a, z13, null, null, (InterfaceC4339a) objM87133R, 14);
                c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifier5 = modifier4;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.SHOPPING_CART.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(6 * f13, c2314t), enumC35424b3.getShoppingCartIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 432, 0);
                if (i13 > 0) {
                    c28655q.m87150e0(-1522420223);
                    float f14 = 1;
                    float f15 = f13 * f13;
                    Modifier modifierM3404a = AbstractC1102d.m3404a(AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y), (-1.5f) * f13, f14 * f13), f15, f15);
                    C33252i c33252i = AbstractC33253j.f138651a;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifierM3404a, c33252i), enumC35424b3.getBadgeBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a);
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC15751g.m44455h(modifierM3358c, f14, c38072d.m121949b(c28655q, i24).getBrandBlack(), c33252i), 8 * 0.5f, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    z17 = true;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(String.valueOf(i13)), c28655q, TextResource.$stable), null, enumC35424b3.getBadgeTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB3(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    z17 = true;
                    c28655q.m87150e0(-1521550518);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z17);
                modifier3 = modifier5;
                enumC35424b2 = enumC35424b3;
            } else {
                c28655q.m87138X();
                enumC35424b2 = enumC35424b;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33229w0(i13, c9598e, onViewEvent, modifier3, enumC35424b2, i14, i15);
            }
        }
        i16 |= 3072;
        modifier2 = modifier;
        i17 = i15 & 16;
        if (i17 != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            if (enumC35424b == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC35424b.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i18;
        }
        if ((i16 & 9363) != 9362) {
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
            if (i17 != 0) {
                enumC35424b3 = EnumC35424b.DARK;
            } else {
                enumC35424b3 = enumC35424b;
            }
            f13 = 4;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(12 * f13, modifier4), "CartIconWithBadge");
            if (c9598e != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i16 & 112) != 32) {
                z14 = true;
            } else {
                z14 = true;
            }
            if ((i16 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objM87133R = c28655q.m87133R();
            if (z16) {
                objM87133R = new C4789l(c9598e, onViewEvent, 10);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C4789l(c9598e, onViewEvent, 10);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3599a2, z13, null, null, (InterfaceC4339a) objM87133R, 14);
            c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            Modifier modifier6 = modifier4;
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.SHOPPING_CART.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(6 * f13, c2314t), enumC35424b3.getShoppingCartIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 432, 0);
            if (i13 > 0) {
                c28655q.m87150e0(-1522420223);
                float f16 = 1;
                float f17 = f13 * f13;
                Modifier modifierM3404a2 = AbstractC1102d.m3404a(AbstractC1099a.m3391m(C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y), (-1.5f) * f13, f16 * f13), f17, f17);
                C33252i c33252i2 = AbstractC33253j.f138651a;
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifierM3404a2, c33252i2), enumC35424b3.getBadgeBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a);
                C38072d c38072d2 = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC15751g.m44455h(modifierM3358c2, f16, c38072d2.m121949b(c28655q, i25).getBrandBlack(), c33252i2), 8 * 0.5f, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                z17 = true;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(String.valueOf(i13)), c28655q, TextResource.$stable), null, enumC35424b3.getBadgeTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i25).getB3(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                z17 = true;
                c28655q.m87150e0(-1521550518);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z17);
            modifier3 = modifier6;
            enumC35424b2 = enumC35424b3;
        } else {
            c28655q.m87138X();
            enumC35424b2 = enumC35424b;
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33229w0(i13, c9598e, onViewEvent, modifier3, enumC35424b2, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m112399d(C9598e c9598e, Function1 function1) {
        if (c9598e != null) {
            function1.invoke(c9598e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m112400e(int i13, C9598e c9598e, Function1 function1, Modifier modifier, EnumC35424b enumC35424b, int i14, int i15, Composer composer, int i16) {
        m112398c(i13, c9598e, function1, modifier, enumC35424b, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
