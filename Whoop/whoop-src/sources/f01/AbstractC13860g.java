package f01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import b91.EnumC2888c;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.view.edit.preview.C9809a;
import com.whoop.whoopaction.domain.models.Action;
import d62.C11736b;
import dp0.C12253i;
import ev2.C13693b;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import hy0.C17748h;
import hy0.EnumC17744g;
import i91.AbstractC18247a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21166s;
import java.util.ArrayList;
import l83.C23454a0;
import m83.C25235a0;
import m83.C25271y;
import ny0.C27246d;
import ny0.C27256h;
import ny0.EnumC27243c;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p132f0.C13825t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: f01.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\t\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\t\"\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lf01/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lf01/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "r", "(Landroidx/compose/runtime/Composer;I)V", "p", "l", "n", "Lf01/j0;", "a", "Lf01/j0;", "u", "()Lf01/j0;", "footerState", "b", "Lf01/h;", "t", "()Lf01/h;", "fakeAdvancedLabsSubscriptionCardState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13860g {

    /* JADX INFO: renamed from: a */
    private static final C13870j0 f49427a;

    /* JADX INFO: renamed from: b */
    private static final C13863h f49428b;

    /* JADX INFO: renamed from: f01.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m39287a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(1769962095);
            AbstractC13860g.m39273h(C13863h.m39302b(AbstractC13860g.m39285t(), null, C25271y.f99162w, C13870j0.m39321b(AbstractC13860g.m39286u(), null, null, null, EnumC39333f.ACCENT_NEGATIVE_TREND, 7, null), 1, null), null, c28655q, 0, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m39287a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.g$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m39288a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1769612286);
            AbstractC13860g.m39273h(C13863h.m39302b(AbstractC13860g.m39285t(), null, C25271y.f99162w, null, 5, null), null, c28655q, 0, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m39288a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.g$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m39289a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-2123029299);
            AbstractC13860g.m39273h(AbstractC13860g.m39285t(), null, c28655q, 0, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m39289a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f01.g$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m39290a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-913102571);
            AbstractC13860g.m39273h(C13863h.m39302b(AbstractC13860g.m39285t(), null, null, null, 3, null), null, c28655q, 0, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m39290a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC16313m0 enumC16313m0 = null;
        AbstractC18247a abstractC18247a = null;
        EnumC39333f enumC39333f = null;
        String str = null;
        String str2 = null;
        Action action = null;
        AnalyticEventModel analyticEventModel = null;
        EnumC2888c enumC2888c = null;
        boolean z4 = false;
        boolean z13 = false;
        String str3 = null;
        boolean z14 = false;
        boolean z15 = false;
        AbstractC18247a abstractC18247a2 = null;
        Object obj = null;
        C21166s c21166s = null;
        EnumC27243c enumC27243c = null;
        GenericInteraction genericInteraction = null;
        InterfaceC21430b interfaceC21430b = null;
        AbstractC18247a abstractC18247a3 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        C13870j0 c13870j0 = new C13870j0(AbstractC8693b.m21278l("Renew your subscription now"), AbstractC8693b.m21278l("Get access to more test by renewing your subscription today"), new C27256h(AbstractC8693b.m21278l("RENEW NOW"), enumC16313m0, abstractC18247a, enumC39333f, str, str2, EnumC27272p.DEFAULT, new C9598e(AppScreen.C9320h0.f27638w, NavigationScreenModel.None.INSTANCE, null, 4, null), action, analyticEventModel, objArr2, enumC2888c, objArr, z4, z13, str3, z14, z15, abstractC18247a2, obj, c21166s, enumC27243c, genericInteraction, interfaceC21430b, abstractC18247a3, 33554220, null), EnumC39333f.BRAND_WHITE);
        f49427a = c13870j0;
        f49428b = new C13863h(new C13894r0(new C13867i0(AbstractC8693b.m21278l("Tests Remaining"), AbstractC8693b.m21278l("2")), new C13867i0(AbstractC8693b.m21278l("Test Expires On"), AbstractC8693b.m21278l("Jun 26, 2025"))), AbstractC37056f.m118959K(new C13856e1(AbstractC8693b.m21278l("Renewal Date"), AbstractC8693b.m21278l("Jun 25, 2026")), new C13856e1(AbstractC8693b.m21278l("Number of test renewing"), AbstractC8693b.m21278l("2 Tests"))), c13870j0);
    }

    /* JADX INFO: renamed from: h */
    public static final void m39273h(C13863h viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2020191489);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C13693b(15);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            AbstractC31926e.m99375j(AbstractC1092a.m3357b(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 3, 4), AbstractC15673b0.m43973A0(), null, 0.0f, 6), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), null, new C13825t(1, AbstractC15673b0.m43975B0()), null, 0.0f, AbstractC37817c.m121344e(-746847375, c28655q, new C13857f(0, viewState, function1)), c28655q, 12582912, 106);
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(viewState, i13, function2, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m39274i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m39275j(C13863h c13863h, Function1 function1, Composer composer, int i13) {
        C0209i c0209i;
        C2305k c2305k;
        boolean z4;
        boolean z13;
        float f13;
        C2305k c2305k2 = C2299e.f9110M;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f14 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 2.5d) * f14, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 0);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f15 = f14;
            float f16 = ((float) 1.5d) * f15;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), c2305k2, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            String strM21274h = AbstractC8693b.m21274h(c13863h.getHeader().getLeadingContent().getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            long jM125385c1 = c38072d.m121949b(c28655q, 6).getWhite70();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, 6).getB1();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21274h, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, 0, 196600);
            float f17 = ((float) 0.5d) * f15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f17, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c13863h.getHeader().getLeadingContent().getSubtitle(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN8(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            String strM21274h2 = AbstractC8693b.m21274h(c13863h.getHeader().getTrailingContent().getTitle(), c28655q, 0);
            long jM125385c2 = c38072d.m121949b(c28655q, 6).getWhite70();
            C2886a c2886aM8420a2 = c38072d.m121952e(c28655q, 6).getB1();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            C0209i c0209i6 = c0209i;
            AbstractC30795n.m94707h(strM21274h2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 0, 0, 196600);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f17, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c13863h.getHeader().getTrailingContent().getSubtitle(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN8(), null, c28655q, 0, 0, 196602);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            if (c13863h.m39306f().isEmpty()) {
                c2305k = c2305k2;
                z4 = false;
                c28655q2.m87150e0(-462545401);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-464116636);
                c2305k = c2305k2;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                int iHashCode5 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N5);
                float f18 = 5 * 4;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f18, c2314t));
                AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q2, 0, 255);
                c28655q2 = c28655q2;
                c28655q2.m87150e0(299057510);
                int i14 = 0;
                for (Object obj : c13863h.m39306f()) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C13856e1 c13856e1 = (C13856e1) obj;
                    Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f18, c28655q2, c2314t, 1.0f);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
                    int iHashCode6 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM91835e);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                    C0209i c0209i7 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                    String strM21274h3 = AbstractC8693b.m21274h(c13856e1.getTitle(), c28655q2, 0);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i16 = i14;
                    C28655q c28655q3 = c28655q2;
                    AbstractC30795n.m94707h(strM21274h3, null, c38072d2.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getB1(), null, c28655q3, 0, 0, 196602);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c13856e1.getLabel(), c28655q3, 0), null, c38072d2.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, 6).getN8(), null, c28655q3, 0, 0, 196602);
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(true);
                    if (i16 < c13863h.m39306f().size() - 1) {
                        AbstractC33745d.m106667z(c28655q2, 394962329, c2314t, f18, c28655q2);
                        float f19 = f15;
                        f13 = f19;
                        AbstractC17755i2.m50938j(AbstractC1092a.m3358c(c2314t, c38072d2.m121949b(c28655q2, 6).getWhite20(), new C17748h(f19, null)), EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q2, 48, 252);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    } else {
                        f13 = f15;
                        c28655q2.m87150e0(395419765);
                        c28655q2.m87173q(false);
                    }
                    f15 = f13;
                    i14 = i15;
                }
                z4 = false;
                AbstractC25012a.m73392y(c28655q2, false, true, false);
            }
            float f24 = 4;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(2 * f24, c2314t));
            C13870j0 footer = c13863h.getFooter();
            if (footer == null) {
                c28655q2.m87150e0(-462420224);
                c28655q2.m87173q(z4);
                z13 = true;
            } else {
                c28655q2.m87150e0(-462420223);
                AbstractC11266d.m30469w(3, f24, c2314t, c28655q2);
                C28655q c28655q4 = c28655q2;
                AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q4, 0, 255);
                AbstractC11266d.m30469w(5, f24, c2314t, c28655q4);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), c2305k, c28655q4, 6);
                int iHashCode7 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3409f4);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j3 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j3);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m7);
                C0209i c0209i8 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode7))) {
                    AbstractC11266d.m30471y(iHashCode7, c28655q4, iHashCode7, c0209i8);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N7);
                String strM21274h4 = AbstractC8693b.m21274h(footer.getTitle(), c28655q4, 0);
                long jMo134584toComposableColorWaAFU9c = footer.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q4, 0);
                C38072d c38072d3 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h4, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q4, 6).getB1(), null, c28655q4, 0, 0, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(footer.getSubtitle(), c28655q4, 0), null, c38072d3.m121949b(c28655q4, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q4, 6).getB2(), null, c28655q4, 0, 0, 196602);
                c28655q2 = c28655q4;
                z13 = true;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f24, c2314t));
                new C27246d().Compose(AbstractC1099a.m3388j(c2314t, EnumC22935a1.f90538x), footer.getCardButton(), function1, c28655q2, 6);
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m39276k(C13863h c13863h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m39273h(c13863h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m39277l(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1078759112);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m39278m(int i13, Composer composer, int i14) {
        m39277l(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m39279n(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1869922978);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new b()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m39280o(int i13, Composer composer, int i14) {
        m39279n(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m39281p(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-716170371);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new c()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m39282q(int i13, Composer composer, int i14) {
        m39281p(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m39283r(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(69776161);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new d()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m39284s(int i13, Composer composer, int i14) {
        m39283r(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final C13863h m39285t() {
        return f49428b;
    }

    /* JADX INFO: renamed from: u */
    public static final C13870j0 m39286u() {
        return f49427a;
    }
}
