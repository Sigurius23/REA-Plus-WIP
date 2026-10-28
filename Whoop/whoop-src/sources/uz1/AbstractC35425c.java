package uz1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserSessionDto;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import l83.C23454a0;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22994r1;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r51.C30938f;
import r51.C30939g;
import t01.C33259e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uz1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\r\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lr51/f;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "b", "(Lr51/f;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "a", "Lr51/f;", "getCountrySelectorTileSample", "()Lr51/f;", "countrySelectorTileSample", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35425c {

    /* JADX INFO: renamed from: a */
    private static final C30938f f150900a;

    static {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Shopping in United States");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Set Your Country");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Search for Country");
        f150900a = new C30938f(new C27256h(AbstractC8693b.m21278l("CONFIRM"), null, null, null, null, null, null, new C9598e(null, null, null, 7, null), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554044, null), new C27256h(AbstractC8693b.m21278l("CANCEL"), null, null, null, null, null, null, new C9598e(null, null, null, 7, null), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554044, null), new C30939g("US", "USA", "US", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, "🇺🇸", AbstractC8693b.m21278l("United States")), textResourceM21278l, textResourceM21278l2, textResourceM21278l3, AbstractC37056f.m118959K(new C30939g("CA", "CAN", "CA", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, "🇨🇦", AbstractC8693b.m21278l("Canada")), new C30939g("MX", "MEX", "MX", "52", "🇲🇽", AbstractC8693b.m21278l("Mexico")), new C30939g("US", "USA", "US", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, "🇺🇸", AbstractC8693b.m21278l("United States"))));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167  */
    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m112408b(C30938f viewState, InterfaceC4339a onClick, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource title;
        C38072d c38072d;
        int i16;
        boolean z13;
        int i17;
        C30939g selectedCountry;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1567632454);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 8;
                float f14 = 2 * f13;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3362g(AbstractC1102d.m3409f(1.0f, AbstractC15676d.m44101d(modifier4, "Shop Home Shopping In Button")), false, null, null, onClick, 15), f14, f13 * 1.5f);
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f14, C2299e.f9110M), C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                title = viewState.getTitle();
                if (title == null) {
                    title = AbstractC8693b.m21267a();
                }
                String strM21274h = AbstractC8693b.m21274h(title, c28655q, TextResource.$stable);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                C2886a b6 = c38072d.m121952e(c28655q, i16).getB1();
                long brandWhite = c38072d.m121949b(c28655q, i16).getBrandWhite();
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                i17 = C2886a.f11498d << 18;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(strM21274h, layoutWeightElement, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, i17, 196600);
                c28655q = c28655q;
                selectedCountry = viewState.getSelectedCountry();
                if (selectedCountry == null) {
                    c28655q.m87150e0(1869860889);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1869860890);
                    AbstractC30795n.m94707h(selectedCountry.getCountryFlag(), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH1(), null, c28655q, 0, i17, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                AbstractC23164r1.m67132a(AbstractC29125c.m88500I(EnumC16313m0.CARET_DOWN.toWhoopIcon(), c28655q, 0), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62363p0), AbstractC1102d.m3419p(4 * 2.5f, c2314t), c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 384);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(i13, i14, 24, modifier3, onClick, viewState);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f15 = 8;
            float f16 = 2 * f15;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1092a.m3362g(AbstractC1102d.m3409f(1.0f, AbstractC15676d.m44101d(modifier4, "Shop Home Shopping In Button")), false, null, null, onClick, 15), f16, f15 * 1.5f);
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f16, C2299e.f9110M), C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
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
            title = viewState.getTitle();
            if (title == null) {
                title = AbstractC8693b.m21267a();
            }
            String strM21274h2 = AbstractC8693b.m21274h(title, c28655q, TextResource.$stable);
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            C2886a b8 = c38072d.m121952e(c28655q, i16).getB1();
            long brandWhite2 = c38072d.m121949b(c28655q, i16).getBrandWhite();
            if (1.0f > 0.0d) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            i17 = C2886a.f11498d << 18;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94707h(strM21274h2, layoutWeightElement2, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q, 0, i17, 196600);
            c28655q = c28655q;
            selectedCountry = viewState.getSelectedCountry();
            if (selectedCountry == null) {
                c28655q.m87150e0(1869860889);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1869860890);
                AbstractC30795n.m94707h(selectedCountry.getCountryFlag(), null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH1(), null, c28655q, 0, i17, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC23164r1.m67132a(AbstractC29125c.m88500I(EnumC16313m0.CARET_DOWN.toWhoopIcon(), c28655q, 0), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62363p0), AbstractC1102d.m3419p(4 * 2.5f, c2314t), c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 384);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(i13, i14, 24, modifier3, onClick, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m112409c(C30938f c30938f, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m112408b(c30938f, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
