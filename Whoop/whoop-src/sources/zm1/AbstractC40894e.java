package zm1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b30.C2626t2;
import b91.C2886a;
import bm0.C3412o;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserSessionDto;
import d13.AbstractC11478a;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39083d;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.C40349h7;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import yf1.C39516e;
import yo1.C39689b;
import zi1.C40670c0;

/* JADX INFO: renamed from: zm1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lzm1/f;", "cardState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "o", "(Lzm1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "i", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "", "Lzm1/b;", "progressList", "m", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "a", "Lzm1/f;", "getPreviewState", "()Lzm1/f;", "previewState", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40894e {

    /* JADX INFO: renamed from: a */
    private static final C40895f f176218a;

    static {
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TUTORIALS;
        Locale locale = Locale.ROOT;
        f176218a = new C40895f(enumC16313m0, AbstractC11478a.m30853e(locale, "First Week with whoop", "toUpperCase(...)"), AbstractC8693b.m21278l("Congrats on reaching your Sleep Score milestone! See what’s next up on your week one journey."), new C40890a(AbstractC11478a.m30853e(locale, "Sleeps logged 3/7", "toUpperCase(...)"), 1, 7), new C9598e(null, null, null, 7, null), AbstractC37056f.m118959K(new C40891b(AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), true), new C40891b(AbstractC8693b.m21278l("2"), true), new C40891b(AbstractC8693b.m21278l("3"), true), new C40891b(AbstractC8693b.m21278l("4"), false), new C40891b(AbstractC8693b.m21278l("5"), false), new C40891b(AbstractC8693b.m21278l("6"), false), new C40891b(AbstractC8693b.m21278l("7"), false)));
    }

    /* JADX INFO: renamed from: i */
    private static final void m132532i(EnumC16313m0 enumC16313m0, TextResource textResource, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        char c3;
        C2314t c2314t;
        boolean z4;
        boolean z13;
        C2886a c2886aM8437r;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1346194658);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            boolean z14 = featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(AbstractC39083d.f168140a);
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e = withAlignmentLineElement.mo3471e(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (enumC16313m0 == null) {
                c28655q.m87150e0(1686308876);
                c28655q.m87173q(false);
                z4 = false;
                c2314t = c2314t2;
                c3 = 4;
                z13 = true;
            } else {
                C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q, 1686308877, enumC16313m0, c28655q, 6);
                c3 = 4;
                float f13 = 4;
                Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3419p(6 * f13, c2314t2), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40349h7(28);
                    c28655q.m87172p0(objM87133R);
                }
                c2314t = c2314t2;
                z4 = false;
                z13 = true;
                AbstractC15005f3.m43108b(c27430eM53378s, null, AbstractC1125a.m3479b(modifierM3488c, (Function1) objM87133R), 0L, c28655q, 48, 8);
                AbstractC31061c.m95650z(2, f13, c2314t, c28655q, false);
            }
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable | ((i15 >> 3) & 14));
            if (z14) {
                c28655q.m87150e0(608611689);
                c2886aM8437r = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getSh4();
            } else {
                c28655q.m87150e0(608612680);
                c2886aM8437r = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4();
            }
            c28655q.m87173q(z4);
            C2886a c2886a = c2886aM8437r;
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            boolean z15 = z13;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(z15);
            if (z14) {
                c28655q.m87150e0(-1527746033);
                if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_IA_CARET)) {
                    c28655q.m87150e0(-1527647360);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6);
                    float f14 = 4;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(f14 * f14, c2314t), c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1527339840);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1528089265);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, c2314t), c38072d.m121949b(c28655q, i16).getBrandWhite(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(enumC16313m0, textResource, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C14018g m132533j(C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C40349h7(29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m132534k(InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, AbstractC15673b0.m43983F0(), 0L, 0L, 0.0f, null, 9, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m132535l(EnumC16313m0 enumC16313m0, TextResource textResource, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m132532i(enumC16313m0, textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m132536m(List<C40891b> list, Composer composer, int i13) {
        int i14;
        long jM53363d;
        long jM125368V0;
        long jM125374Y0;
        List<C40891b> list2 = list;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1552589250);
        int i15 = 4;
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(list2) ? 4 : 2);
        } else {
            i14 = i13;
        }
        boolean z4 = true;
        boolean z13 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f13 = (float) 1.5d;
            float f14 = 8;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f14), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            c28655q.m87150e0(1412301656);
            int size = list2.size();
            int i16 = 0;
            while (i16 < size) {
                C40891b c40891b = list2.get(i16);
                Modifier modifierM3419p = AbstractC1102d.m3419p(i15 * f14, c2314t);
                if (c40891b.getFilled()) {
                    c28655q.m87150e0(-1982978512);
                    jM53363d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentOnboardingAction();
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-1982877793);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, z13);
                }
                C33252i c33252i = AbstractC33253j.f138651a;
                Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM3419p, f13, jM53363d, c33252i);
                if (c40891b.getFilled()) {
                    c28655q.m87150e0(-1982640612);
                    jM125368V0 = C17919x.m51541c(0.15f, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentOnboardingAction());
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-1982520549);
                    jM125368V0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent();
                    c28655q.m87173q(z13);
                }
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM44455h, jM125368V0, c33252i);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, z13);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(c40891b.getItemText(), c28655q, TextResource.$stable);
                if (c40891b.getFilled()) {
                    c28655q.m87150e0(-873125930);
                    jM125374Y0 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, z13);
                } else {
                    c28655q.m87150e0(-873124845);
                    jM125374Y0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30();
                    c28655q.m87173q(z13);
                }
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h, null, jM125374Y0, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN8(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                i16++;
                z4 = true;
                z13 = z13;
                f14 = f14;
                c2314t = c2314t;
                f13 = f13;
                size = size;
                i15 = 4;
                list2 = list;
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m132537n(List list, int i13, Composer composer, int i14) {
        m132536m(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static final void m132538o(C40895f cardState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        FeatureFlagChecker featureFlagChecker;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        long jM125379a1;
        Object objM87133R2;
        AbstractC22676k.m65750j(cardState, "cardState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(811263992);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(cardState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
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
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C40893d(0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                zM87157i = c28655q.m87157i(cardState) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C39689b(21, function4, cardState);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                if (z13) {
                    c28655q.m87150e0(-2059333569);
                    jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(-2059332578);
                    jM125379a1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5();
                    c28655q.m87173q(false);
                }
                AbstractC12889b.m36263b(modifierM3362g, c33252iM105489e, jM125379a1, null, 0 * f13, AbstractC37817c.m121344e(715546651, c28655q, new C2626t2(cardState, z13, 13)), c28655q, 1769472, 24);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40670c0(cardState, i13, function3, i14, 5);
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
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C40893d(0);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                z13 = true;
            } else {
                z13 = true;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            zM87157i = c28655q.m87157i(cardState) | ((i15 & 112) == 32);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C39689b(21, function4, cardState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C39689b(21, function4, cardState);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f14 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f14);
            if (z13) {
                c28655q.m87150e0(-2059333569);
                jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-2059332578);
                jM125379a1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5();
                c28655q.m87173q(false);
            }
            AbstractC12889b.m36263b(modifierM3362g2, c33252iM105489e2, jM125379a1, null, 0 * f14, AbstractC37817c.m121344e(715546651, c28655q, new C2626t2(cardState, z13, 13)), c28655q, 1769472, 24);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(cardState, i13, function3, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m132539p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m132540q(Function1 function1, C40895f c40895f) {
        function1.invoke(c40895f.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m132541r(C40895f c40895f, boolean z4, Composer composer, int i13) throws XmlPullParserException, IOException {
        C38072d c38072d;
        int i14;
        boolean z13;
        C2886a c2886aM8438s;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            EnumC16313m0 enumC16313m0M132545c = c40895f.getIcon();
            TextResource textResourceM132548g = c40895f.getTitle();
            int i15 = TextResource.$stable;
            m132532i(enumC16313m0M132545c, textResourceM132548g, c28655q, i15 << 3);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            String strM21274h = AbstractC8693b.m21274h(c40895f.getBody(), c28655q, i15);
            C38072d c38072d2 = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8421b = c38072d2.m121952e(c28655q, i16).getB2();
            long jM125385c1 = c38072d2.m121949b(c28655q, i16).getWhite70();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierM3409f, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 48, i17, 196600);
            float f15 = ((float) 0.5d) * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f15, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f15, 0.0f, 11);
            String strM21274h2 = AbstractC8693b.m21274h(c40895f.getDailyProgress().getTitle(), c28655q, i15);
            if (z4) {
                c28655q.m87150e0(1514483575);
                c38072d = c38072d2;
                i14 = i16;
                c2886aM8438s = c38072d.m121952e(c28655q, i14).getB3();
                z13 = false;
            } else {
                c38072d = c38072d2;
                i14 = i16;
                z13 = false;
                c28655q.m87150e0(1514484535);
                c2886aM8438s = c38072d.m121952e(c28655q, i14).getH5();
            }
            c28655q.m87173q(z13);
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t2, c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q, 48, i17, 196600);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(1, c2314t)), c38072d.m121949b(c28655q, i14).getWhite10(), AbstractC17918w0.f69621a), c28655q, 0);
            c28655q.m87173q(true);
            m132536m(c40895f.m132547f(), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m132542s(C40895f c40895f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m132538o(c40895f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
