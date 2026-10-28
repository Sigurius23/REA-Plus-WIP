package js1;

import a11.C0134l;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import ge3.AbstractC15751g;
import gz0.AbstractC16319p0;
import h11.C16606a;
import h11.C16613h;
import h11.EnumC16612g;
import ih0.AbstractC18489d0;
import ji0.C21714b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: js1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\f\u001a\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0014\u0010\f\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lh11/h;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "", "useCompactLayout", "useRightFadingLayout", "s", "(Lh11/h;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V", "k", "(Lh11/h;Landroidx/compose/runtime/Composer;I)V", "m", "q", "", "text", "isSelected", "o", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "i", "Ly3/f;", "a", "F", "FADING_DAY_PILL_PADDING", "journal-home-tile-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21914e {

    /* JADX INFO: renamed from: a */
    private static final float f84649a = 22;

    /* JADX INFO: renamed from: js1.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84650a;

        static {
            int[] iArr = new int[EnumC16612g.values().length];
            try {
                iArr[EnumC16612g.COMPLETED_JOURNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16612g.INCOMPLETE_JOURNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16612g.INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC16612g.NO_APPOINTMENTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC16612g.HAS_APPOINTMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f84650a = iArr;
        }
    }

    /* JADX INFO: renamed from: i */
    private static final void m62344i(C16613h c16613h, Composer composer, int i13) {
        int i14;
        long accentAction;
        long jM53363d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-567055803);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c16613h) : c28655q.m87157i(c16613h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = (c16613h.getMultiDayCycleDateDisplay() != null ? 17 : 5) * 4;
            int i15 = a.f84650a[c16613h.getStyle().ordinal()];
            if (i15 == 1) {
                c28655q.m87150e0(520228753);
                accentAction = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                c28655q.m87173q(false);
            } else if (i15 == 2) {
                c28655q.m87150e0(520230647);
                if (c16613h.getIsSelected()) {
                    c28655q.m87150e0(520231852);
                    accentAction = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30();
                } else {
                    c28655q.m87150e0(520232848);
                    accentAction = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            } else if (i15 == 3 || i15 == 4) {
                c28655q.m87150e0(520235351);
                if (c16613h.getIsSelected()) {
                    c28655q.m87150e0(520236556);
                    accentAction = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30();
                } else {
                    c28655q.m87150e0(520237552);
                    accentAction = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            } else {
                if (i15 != 5) {
                    throw AbstractC11895b.m32003v(520226560, c28655q, false);
                }
                c28655q.m87150e0(520239822);
                accentAction = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getCoachBlue();
                c28655q.m87173q(false);
            }
            EnumC16612g style = c16613h.getStyle();
            EnumC16612g enumC16612g = EnumC16612g.COMPLETED_JOURNAL;
            if (style == enumC16612g) {
                c28655q.m87150e0(520243728);
                jM53363d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                c28655q.m87173q(false);
            } else if (c16613h.getIsSelected()) {
                c28655q.m87150e0(520245583);
                jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(520247020);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            float f14 = 4;
            C2314t c2314t = C2314t.f9131w;
            float f15 = 10;
            Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC31061c.m95629e(AbstractC1102d.m3421r(c2314t, f13, 5 * f14), 3, f14, accentAction), 1, jM53363d, AbstractC33253j.m105489e(f14 * f15));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44455h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (c16613h.getStyle() == enumC16612g) {
                c28655q.m87150e0(963186630);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 6), null, AbstractC1102d.m3419p(f15, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandBlack(), c28655q, 432, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(963439683);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21911b(c16613h, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m62345j(C16613h c16613h, int i13, Composer composer, int i14) {
        m62344i(c16613h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m62346k(C16613h c16613h, Composer composer, int i13) {
        int i14;
        String strM21275i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2035059370);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c16613h) : c28655q.m87157i(c16613h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 1;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11);
            C16606a multiDayCycleDateDisplay = c16613h.getMultiDayCycleDateDisplay();
            if (multiDayCycleDateDisplay == null) {
                c28655q.m87150e0(-1304482585);
                c28655q.m87173q(false);
                strM21275i = null;
            } else {
                c28655q.m87150e0(-1304482584);
                strM21275i = AbstractC8693b.m21275i(multiDayCycleDateDisplay.getDay(), c28655q, 0);
                c28655q.m87173q(false);
            }
            if (strM21275i == null) {
                strM21275i = c16613h.getDateDisplay().getDay();
            }
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21275i, modifierM3398t, c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH6(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            AbstractC11266d.m30469w(f13, 8, c2314t, c28655q);
            float f14 = 4;
            float f15 = 5 * f14;
            Modifier modifierM3428y = AbstractC1102d.m3428y(AbstractC1102d.m3415l(f15, c2314t), null, true, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3428y);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (c16613h.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                c28655q.m87150e0(-1286040842);
                long accentAction = c38072d.m121949b(c28655q, i15).getAccentAction();
                Modifier modifierM3421r = AbstractC1102d.m3421r(AbstractC1099a.m3392n(c2314t, -f84649a, 0.0f, 2), 16 * f14, f15);
                C17909s c17909s = AbstractC17911t.f69612b;
                long j7 = C17919x.f69636m;
                Modifier modifierM3357b = AbstractC1092a.m3357b(modifierM3421r, C17909s.m51483a(c17909s, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(j7), new C17919x(C17919x.m51541c(0.1f, accentAction)), new C17919x(C17919x.m51541c(0.4f, accentAction)), new C17919x(C17919x.m51541c(0.8f, accentAction)), new C17919x(accentAction)), 0.0f, 0.0f, 14), AbstractC33253j.m105489e(3 * f14), 0.0f, 4);
                float f16 = 10;
                Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM3357b, f13, c38072d.m121949b(c28655q, i15).getTransparent(), AbstractC33253j.m105489e(f16 * f14));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9103F, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44455h);
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
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 6), null, AbstractC1099a.m3392n(AbstractC1102d.m3419p(f16, c2314t), -5, 0.0f, 2), c38072d.m121949b(c28655q, i15).getBrandBlack(), c28655q, 432, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1284551757);
                long white20 = c38072d.m121949b(c28655q, i15).getWhite20();
                AbstractC22989q.m66760a(AbstractC15751g.m44456i(f13, AbstractC31061c.m95629e(AbstractC1102d.m3421r(AbstractC1099a.m3392n(c2314t, -f84649a, 0.0f, 2), 16 * f14, f15), 3, f14, c38072d.m121949b(c28655q, i15).getTransparent()), C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C17919x.m51541c(0.03f, white20)), new C17919x(C17919x.m51541c(0.1f, white20)), new C17919x(white20)), 0.0f, 0.0f, 14), AbstractC33253j.m105489e(10 * f14)), c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21912c(c16613h, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m62347l(C16613h c16613h, int i13, Composer composer, int i14) {
        m62346k(c16613h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m62348m(C16613h c16613h, Composer composer, int i13) {
        int i14;
        long jM53358D;
        long white20;
        long transparent;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-917660955);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c16613h) : c28655q.m87157i(c16613h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            if (c16613h.getIsSelected()) {
                c28655q.m87150e0(-1403878068);
                jM53358D = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite90();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1403877076);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            float f13 = 1;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14);
            String day = c16613h.getDateDisplay().getDay();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(day, modifierM3398t, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH6(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            AbstractC11266d.m30469w(f13, 8, c2314t, c28655q);
            float f14 = 5;
            float f15 = 4;
            float f16 = f14 * f15;
            Modifier modifierM3428y = AbstractC1102d.m3428y(AbstractC1102d.m3415l(f16, c2314t), null, true, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3428y);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (c16613h.getStyle() == EnumC16612g.COMPLETED_JOURNAL) {
                c28655q.m87150e0(3229777);
                long accentAction = c38072d.m121949b(c28655q, i15).getAccentAction();
                Modifier modifierM3421r = AbstractC1102d.m3421r(AbstractC1099a.m3392n(c2314t, f84649a, 0.0f, 2), 16 * f15, f16);
                C17909s c17909s = AbstractC17911t.f69612b;
                C17919x c17919x = new C17919x(accentAction);
                C17919x c17919x2 = new C17919x(C17919x.m51541c(0.8f, accentAction));
                C17919x c17919x3 = new C17919x(C17919x.m51541c(0.4f, accentAction));
                C17919x c17919x4 = new C17919x(C17919x.m51541c(0.1f, accentAction));
                long j7 = C17919x.f69636m;
                Modifier modifierM3357b = AbstractC1092a.m3357b(modifierM3421r, C17909s.m51483a(c17909s, AbstractC37056f.m118959K(c17919x, c17919x2, c17919x3, c17919x4, new C17919x(j7), new C17919x(j7)), 0.0f, 0.0f, 14), AbstractC33253j.m105489e(3 * f15), 0.0f, 4);
                float f17 = 10;
                Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM3357b, f13, c38072d.m121949b(c28655q, i15).getTransparent(), AbstractC33253j.m105489e(f17 * f15));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9117z, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44455h);
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
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getCheckmark(), c28655q, 6), null, AbstractC1099a.m3392n(AbstractC1102d.m3419p(f17, c2314t), f14, 0.0f, 2), c38072d.m121949b(c28655q, i15).getBrandBlack(), c28655q, 432, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(4735292);
                if (c16613h.getIsSelected()) {
                    white20 = AbstractC25012a.m73366B(c28655q, -1385319819, c38072d, c28655q, i15);
                } else {
                    c28655q.m87150e0(-1385318734);
                    white20 = c38072d.m121949b(c28655q, i15).getWhite20();
                }
                c28655q.m87173q(false);
                if (c16613h.getIsSelected()) {
                    c28655q.m87150e0(-1385316110);
                    transparent = c38072d.m121949b(c28655q, i15).getWhite30();
                } else {
                    c28655q.m87150e0(-1385315114);
                    transparent = c38072d.m121949b(c28655q, i15).getTransparent();
                }
                c28655q.m87173q(false);
                Modifier modifierM3421r2 = AbstractC1102d.m3421r(AbstractC1099a.m3392n(c2314t, f84649a, 0.0f, 2), 16 * f15, f16);
                C17909s c17909s2 = AbstractC17911t.f69612b;
                C17919x c17919x5 = new C17919x(transparent);
                C17919x c17919x6 = new C17919x(C17919x.m51541c(0.2f, transparent));
                C17919x c17919x7 = new C17919x(C17919x.m51541c(0.1f, transparent));
                long j13 = C17919x.f69636m;
                AbstractC22989q.m66760a(AbstractC15751g.m44456i(f13, AbstractC1092a.m3357b(modifierM3421r2, C17909s.m51483a(c17909s2, AbstractC37056f.m118959K(c17919x5, c17919x6, c17919x7, new C17919x(j13), new C17919x(j13)), 0.0f, 0.0f, 14), AbstractC33253j.m105489e(3 * f15), 0.0f, 4), C17909s.m51483a(c17909s2, AbstractC37056f.m118959K(new C17919x(white20), new C17919x(C17919x.m51541c(0.3f, white20)), new C17919x(j13), new C17919x(j13), new C17919x(j13)), 0.0f, 0.0f, 14), AbstractC33253j.m105489e(10 * f15)), c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21912c(c16613h, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m62349n(C16613h c16613h, int i13, Composer composer, int i14) {
        m62348m(c16613h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m62350o(final String str, final boolean z4, Composer composer, final int i13) {
        int i14;
        C28655q c28655q;
        long jM53358D;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1980791814);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            if (z4) {
                c28655q2.m87150e0(-870417791);
                jM53358D = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite90();
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-870416799);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, null, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getH6(), null, c28655q, i14 & 14, C2886a.f11498d << 18, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.d
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC21914e.m62351p(str, z4, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m62351p(String str, boolean z4, int i13, Composer composer, int i14) {
        m62350o(str, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m62352q(C16613h c16613h, Composer composer, int i13) {
        int i14;
        C23454a0 c23454a0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2124623935);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c16613h) : c28655q.m87157i(c16613h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C16606a multiDayCycleDateDisplay = c16613h.getMultiDayCycleDateDisplay();
            if (multiDayCycleDateDisplay == null) {
                c28655q.m87150e0(-261300287);
                c28655q.m87173q(false);
                c23454a0 = null;
            } else {
                c28655q.m87150e0(-261300286);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(10), C2299e.f9108K, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                m62350o(c16613h.getDateDisplay().getDay(), c16613h.getIsSelected(), c28655q, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(1 * 4, c2314t));
                m62350o(AbstractC8693b.m21275i(multiDayCycleDateDisplay.getDay(), c28655q, 0), c16613h.getIsSelected(), c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                c28655q.m87150e0(1654155066);
                m62350o(c16613h.getDateDisplay().getDay(), c16613h.getIsSelected(), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1654138047);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21911b(c16613h, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m62353r(C16613h c16613h, int i13, Composer composer, int i14) {
        m62352q(c16613h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0192  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:83:0x011a  */
    /* JADX WARN: Code duplicated, block: B:86:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x013b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:92:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0157  */
    /* JADX WARN: Code duplicated, block: B:94:0x0167  */
    /* JADX WARN: Code duplicated, block: B:97:0x0187  */
    /* JADX INFO: renamed from: s */
    public static final void m62354s(final C16613h state, Function1 function1, boolean z4, boolean z13, Composer composer, final int i13, final int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z14;
        int i17;
        int i18;
        boolean z15;
        int i19;
        boolean z16;
        final Function1 function3;
        final boolean z17;
        final boolean z18;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int i24;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1929048411);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z14 = z4;
                    if (c28655q.m87155h(z14)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z15 = z13;
                        if (c28655q.m87155h(z15)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c28676v0 = C28635l.f115821a;
                        if (i25 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C21714b(8);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function4 = (Function1) objM87133R2;
                        } else {
                            function4 = function2;
                        }
                        if (i16 != 0) {
                            z14 = false;
                        }
                        if (i18 != 0) {
                            z15 = false;
                        }
                        i24 = i15 & 14;
                        if (i24 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(state))) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z24 | z19;
                        objM87133R = c28655q.m87133R();
                        if (z25 || objM87133R == c28676v0) {
                            objM87133R = new C0134l(state, function4, 26);
                            c28655q.m87172p0(objM87133R);
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
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
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        if (z14) {
                            c28655q.m87150e0(-2036027885);
                            m62346k(state, c28655q, C16613h.f63914o | i24);
                            c28655q.m87173q(false);
                        } else if (z15) {
                            c28655q.m87150e0(-2035934606);
                            m62348m(state, c28655q, C16613h.f63914o | i24);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-2035864112);
                            int i26 = C16613h.f63914o | i24;
                            m62352q(state, c28655q, i26);
                            AbstractC11266d.m30469w(1, 8, c2314t, c28655q);
                            m62344i(state, c28655q, i26);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        function3 = function4;
                    } else {
                        c28655q.m87138X();
                        function3 = function2;
                    }
                    z17 = z14;
                    z18 = z15;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.a
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC21914e.m62357v(state, function3, z17, z18, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 3072;
                z15 = z13;
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C21714b(8);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    i24 = i15 & 14;
                    if (i24 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z24 | z19;
                    objM87133R = c28655q.m87133R();
                    if (z25) {
                        objM87133R = new C0134l(state, function4, 26);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C0134l(state, function4, 26);
                        c28655q.m87172p0(objM87133R);
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    if (z14) {
                        c28655q.m87150e0(-2036027885);
                        m62346k(state, c28655q, C16613h.f63914o | i24);
                        c28655q.m87173q(false);
                    } else if (z15) {
                        c28655q.m87150e0(-2035934606);
                        m62348m(state, c28655q, C16613h.f63914o | i24);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2035864112);
                        int i27 = C16613h.f63914o | i24;
                        m62352q(state, c28655q, i27);
                        AbstractC11266d.m30469w(1, 8, c2314t, c28655q);
                        m62344i(state, c28655q, i27);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                z17 = z14;
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC21914e.m62357v(state, function3, z17, z18, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 384;
            z14 = z4;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C21714b(8);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    i24 = i15 & 14;
                    if (i24 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z24 | z19;
                    objM87133R = c28655q.m87133R();
                    if (z25) {
                        objM87133R = new C0134l(state, function4, 26);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C0134l(state, function4, 26);
                        c28655q.m87172p0(objM87133R);
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3362g3 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3362g3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    if (z14) {
                        c28655q.m87150e0(-2036027885);
                        m62346k(state, c28655q, C16613h.f63914o | i24);
                        c28655q.m87173q(false);
                    } else if (z15) {
                        c28655q.m87150e0(-2035934606);
                        m62348m(state, c28655q, C16613h.f63914o | i24);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2035864112);
                        int i28 = C16613h.f63914o | i24;
                        m62352q(state, c28655q, i28);
                        AbstractC11266d.m30469w(1, 8, c2314t, c28655q);
                        m62344i(state, c28655q, i28);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                z17 = z14;
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC21914e.m62357v(state, function3, z17, z18, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 3072;
            z15 = z13;
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21714b(8);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                i24 = i15 & 14;
                if (i24 != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if ((i15 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z24 | z19;
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C0134l(state, function4, 26);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0134l(state, function4, 26);
                    c28655q.m87172p0(objM87133R);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3362g4 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3362g4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                if (z14) {
                    c28655q.m87150e0(-2036027885);
                    m62346k(state, c28655q, C16613h.f63914o | i24);
                    c28655q.m87173q(false);
                } else if (z15) {
                    c28655q.m87150e0(-2035934606);
                    m62348m(state, c28655q, C16613h.f63914o | i24);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2035864112);
                    int i29 = C16613h.f63914o | i24;
                    m62352q(state, c28655q, i29);
                    AbstractC11266d.m30469w(1, 8, c2314t, c28655q);
                    m62344i(state, c28655q, i29);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            z17 = z14;
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC21914e.m62357v(state, function3, z17, z18, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                if (c28655q.m87155h(z14)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C21714b(8);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        z14 = false;
                    }
                    if (i18 != 0) {
                        z15 = false;
                    }
                    i24 = i15 & 14;
                    if (i24 != 4) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z24 | z19;
                    objM87133R = c28655q.m87133R();
                    if (z25) {
                        objM87133R = new C0134l(state, function4, 26);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C0134l(state, function4, 26);
                        c28655q.m87172p0(objM87133R);
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3362g5 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3362g5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    if (z14) {
                        c28655q.m87150e0(-2036027885);
                        m62346k(state, c28655q, C16613h.f63914o | i24);
                        c28655q.m87173q(false);
                    } else if (z15) {
                        c28655q.m87150e0(-2035934606);
                        m62348m(state, c28655q, C16613h.f63914o | i24);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2035864112);
                        int i210 = C16613h.f63914o | i24;
                        m62352q(state, c28655q, i210);
                        AbstractC11266d.m30469w(1, 8, c2314t, c28655q);
                        m62344i(state, c28655q, i210);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                z17 = z14;
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.a
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC21914e.m62357v(state, function3, z17, z18, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 3072;
            z15 = z13;
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21714b(8);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                i24 = i15 & 14;
                if (i24 != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if ((i15 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z24 | z19;
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C0134l(state, function4, 26);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0134l(state, function4, 26);
                    c28655q.m87172p0(objM87133R);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3362g6 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3362g6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                if (z14) {
                    c28655q.m87150e0(-2036027885);
                    m62346k(state, c28655q, C16613h.f63914o | i24);
                    c28655q.m87173q(false);
                } else if (z15) {
                    c28655q.m87150e0(-2035934606);
                    m62348m(state, c28655q, C16613h.f63914o | i24);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2035864112);
                    int i211 = C16613h.f63914o | i24;
                    m62352q(state, c28655q, i211);
                    AbstractC11266d.m30469w(1, 8, c2314t, c28655q);
                    m62344i(state, c28655q, i211);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            z17 = z14;
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC21914e.m62357v(state, function3, z17, z18, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        z14 = z4;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21714b(8);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    z14 = false;
                }
                if (i18 != 0) {
                    z15 = false;
                }
                i24 = i15 & 14;
                if (i24 != 4) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if ((i15 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z24 | z19;
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C0134l(state, function4, 26);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0134l(state, function4, 26);
                    c28655q.m87172p0(objM87133R);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3362g7 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3362g7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                if (z14) {
                    c28655q.m87150e0(-2036027885);
                    m62346k(state, c28655q, C16613h.f63914o | i24);
                    c28655q.m87173q(false);
                } else if (z15) {
                    c28655q.m87150e0(-2035934606);
                    m62348m(state, c28655q, C16613h.f63914o | i24);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2035864112);
                    int i212 = C16613h.f63914o | i24;
                    m62352q(state, c28655q, i212);
                    AbstractC11266d.m30469w(1, 8, c2314t, c28655q);
                    m62344i(state, c28655q, i212);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            z17 = z14;
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.a
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC21914e.m62357v(state, function3, z17, z18, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        z15 = z13;
        if ((i15 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21714b(8);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                z14 = false;
            }
            if (i18 != 0) {
                z15 = false;
            }
            i24 = i15 & 14;
            if (i24 != 4) {
                z19 = true;
            } else {
                z19 = true;
            }
            if ((i15 & 112) == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = z24 | z19;
            objM87133R = c28655q.m87133R();
            if (z25) {
                objM87133R = new C0134l(state, function4, 26);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C0134l(state, function4, 26);
                c28655q.m87172p0(objM87133R);
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3362g8 = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3362g8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            if (z14) {
                c28655q.m87150e0(-2036027885);
                m62346k(state, c28655q, C16613h.f63914o | i24);
                c28655q.m87173q(false);
            } else if (z15) {
                c28655q.m87150e0(-2035934606);
                m62348m(state, c28655q, C16613h.f63914o | i24);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2035864112);
                int i213 = C16613h.f63914o | i24;
                m62352q(state, c28655q, i213);
                AbstractC11266d.m30469w(1, 8, c2314t, c28655q);
                m62344i(state, c28655q, i213);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        z17 = z14;
        z18 = z15;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC21914e.m62357v(state, function3, z17, z18, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m62355t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m62356u(C16613h c16613h, Function1 function1) {
        C9598e destination = c16613h.getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m62357v(C16613h c16613h, Function1 function1, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        m62354s(c16613h, function1, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
