package tx0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.user.journey.model.yearinreview.StyleType;
import cp0.C10941a;
import em1.InterfaceC13346t;
import fm1.C14605i;
import fm1.EnumC14604h;
import gv1.AbstractC16233g;
import gv1.AbstractC16241o;
import gz0.AbstractC16319p0;
import hy0.AbstractC17755i2;
import i51.AbstractC18109f;
import i51.AbstractC18111h;
import i51.C18112i;
import i51.EnumC18110g;
import i51.EnumC18119p;
import ih0.AbstractC18489d0;
import jk2.AbstractC21768i;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import nq2.C27064g;
import nq2.C27066i;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p734sl0.C32627j2;
import p745y81.AbstractC39330c;
import p745y81.EnumC39333f;
import pp2.C29451o;
import pz0.AbstractC29641d;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import s51.C32209f;
import sg2.C32451b;
import sg2.C32458i;
import t71.C33572i;
import ti2.C33860g;
import tu1.C34190c;
import ui2.C35022c;
import ui2.EnumC35021b;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import xi2.AbstractC38328f;

/* JADX INFO: renamed from: tx0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, m65681d2 = {"Ltx0/g;", "viewState", "Lkotlin/Function1;", "Ltx0/e;", "Ll83/a0;", "onViewEvent", "Lgv1/m;", "onOverrideViewEvent", "Lkotlin/Function0;", "onBackClick", "o", "(Ltx0/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "title", "m", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lv41/r0;", "lottieWrapper", "A", "(Lv41/r0;Landroidx/compose/runtime/Composer;I)V", "Li51/h;", "celebrationMediaSource", "y", "(Li51/h;Landroidx/compose/runtime/Composer;I)V", "v", "debug-tools_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34241d {
    /* JADX INFO: renamed from: A */
    private static final void m108249A(InterfaceC35689r0 interfaceC35689r0, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1083607963);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(interfaceC35689r0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C27066i c27066i = new C27066i(AbstractC8693b.m21278l("122"), AbstractC8693b.m21278l("DAY STREAK"), EnumC39333f.BRAND_WHITE, StyleType.NUMBER_LARGE, null, null, null, null, interfaceC35689r0);
            C27064g c27064g = new C27064g();
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 3, 4));
            Object objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C33572i(20);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            c27064g.Compose(modifierM3394p, c27066i, (Function1) objM87133R, c28655q, (C27064g.f108188a << 9) | (C27066i.f108190j << 3) | 384);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34240c(interfaceC35689r0, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m108250B(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m108251C(InterfaceC35689r0 interfaceC35689r0, int i13, Composer composer, int i14) {
        m108249A(interfaceC35689r0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m108264m(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2038967747);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(C2314t.f9131w, 2 * f13, 1 * f13);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, modifierM3395q, c38072d.m121949b(c28655q2, i15).getWhite20(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q, (i14 & 14) | 48, C2886a.f11498d << 18, 196600);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m108265n(String str, int i13, Composer composer, int i14) {
        m108264m(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m108266o(C34244g viewState, Function1 onViewEvent, Function1 onOverrideViewEvent, InterfaceC4339a onBackClick, Composer composer, int i13) {
        int i14;
        Function1 function1;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onOverrideViewEvent, "onOverrideViewEvent");
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1839445713);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onOverrideViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onBackClick) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            AbstractC18111h abstractC18111hM108282a = viewState.getCelebrationMediaSource();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t)), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
            int i15 = i14;
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l("Lottie Tester"), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, onBackClick, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | (i14 & 7168), 53);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            int i16 = i15 & 112;
            boolean z13 = ((i15 & 14) == 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) | (i16 == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C32209f(onViewEvent, viewState, 17);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 8;
            float f14 = 2 * f13;
            float f15 = 1 * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15), f14, f15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i17).getB1();
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h("Override Lotties", null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 6, i18, 196602);
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i17).getStrain(), 0L, 0L, AbstractC37817c.m121344e(64166320, c28655q, new C29451o(12, viewState, onViewEvent)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            AbstractC17755i2.m50938j(AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, f15), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
            AbstractC30795n.m94707h("Sandbox", AbstractC1099a.m3395q(c2314t, f14, f15), c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getSh1(), null, c28655q, 54, i18, 196600);
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, f15);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("SELECT LOTTIE");
            boolean z14 = i16 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = new C32458i(onViewEvent, 17);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27292z.m82343j(modifierM3395q2, false, false, null, null, null, textResourceM21278l, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, (TextResource.$stable << 18) | 6, 0, 8126);
            c28655q = c28655q;
            if (abstractC18111hM108282a != null) {
                c28655q.m87150e0(-1809281090);
                m108264m("StreaksMediaContent", c28655q, 6);
                m108276y(abstractC18111hM108282a, c28655q, AbstractC18111h.f70326a);
                float f16 = 10 * 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                boolean z15 = abstractC18111hM108282a instanceof AbstractC18111h.d;
                if (z15) {
                    c28655q.m87150e0(-1809053736);
                    m108264m("StreakFireLottie", c28655q, 6);
                    m108273v(((AbstractC18111h.d) abstractC18111hM108282a).getWrapper(), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1808895171);
                    c28655q.m87173q(false);
                }
                m108264m("CelebrationMedia - Small", c28655q, 6);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
                int i19 = 60;
                DefaultConstructorMarker defaultConstructorMarker = null;
                TextResource textResource = null;
                TextResource textResource2 = null;
                EnumC18119p enumC18119p = null;
                boolean z16 = false;
                C18112i c18112i = new C18112i(abstractC18111hM108282a, EnumC18110g.SMALL, textResource, textResource2, enumC18119p, z16, i19, defaultConstructorMarker);
                int i24 = C18112i.f70331g | 48;
                AbstractC18109f.m51967d(c18112i, modifierM3396r, null, c28655q, i24, 4);
                m108264m("CelebrationMedia - Medium", c28655q, 6);
                AbstractC18109f.m51967d(new C18112i(abstractC18111hM108282a, EnumC18110g.MEDIUM, textResource, textResource2, enumC18119p, z16, i19, defaultConstructorMarker), AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), null, c28655q, i24, 4);
                m108264m("CelebrationMedia - Large", c28655q, 6);
                AbstractC18109f.m51967d(new C18112i(abstractC18111hM108282a, EnumC18110g.LARGE, textResource, textResource2, enumC18119p, z16, i19, defaultConstructorMarker), AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), null, c28655q, i24, 4);
                if (z15) {
                    c28655q.m87150e0(-1807720612);
                    m108264m("YearInReviewStreaksStatsCardItem", c28655q, 6);
                    z4 = false;
                    m108249A(((AbstractC18111h.d) abstractC18111hM108282a).getWrapper(), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    z4 = false;
                    c28655q.m87150e0(-1807535139);
                    c28655q.m87173q(false);
                }
                AbstractC30007c.m91851u(c2314t, f16, c28655q, z4);
            } else {
                c28655q.m87150e0(-1807467683);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (viewState.getIsSelectLottieSheetVisible()) {
                c28655q.m87150e0(564741737);
                AbstractC16241o abstractC16241oM108283b = viewState.getLottieSource();
                boolean z17 = i16 == 32;
                Object objM87133R3 = c28655q.m87133R();
                if (z17 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C32458i(onViewEvent, 18);
                    c28655q.m87172p0(objM87133R3);
                }
                function1 = onOverrideViewEvent;
                AbstractC16233g.m45977p(abstractC16241oM108283b, function1, (InterfaceC4339a) objM87133R3, c28655q, AbstractC16241o.f61698a | ((i15 >> 3) & 112));
                c28655q.m87173q(false);
            } else {
                function1 = onOverrideViewEvent;
                c28655q.m87150e0(564966611);
                c28655q.m87173q(false);
            }
        } else {
            function1 = onOverrideViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34190c(viewState, onViewEvent, function1, onBackClick, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m108267p(Function1 function1, C34244g c34244g) {
        function1.invoke(new InterfaceC34242e.a(!c34244g.getIsOverrideEnabled()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m108268q(C34244g c34244g, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM108284c = c34244g.getIsOverrideEnabled();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C32451b(function1, 17);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zM108284c, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m108269r(Function1 function1, boolean z4) {
        function1.invoke(new InterfaceC34242e.a(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m108270s(Function1 function1) {
        function1.invoke(InterfaceC34242e.b.f143625a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m108271t(Function1 function1) {
        function1.invoke(InterfaceC34242e.c.f143626a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m108272u(C34244g c34244g, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m108266o(c34244g, function1, function2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m108273v(InterfaceC35689r0 interfaceC35689r0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-693939428);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC35689r0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C14605i c14605i = new C14605i(true, "122", EnumC14604h.ACTIVE, EnumC39333f.BRAND_WHITE, interfaceC35689r0, null, false, false, new C9598e(null, null, null, 7, null), null, 640, null);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C33572i(19);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21768i.m61521n(c14605i, (Function1) objM87133R, c28655q, C14605i.f53766k | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34240c(interfaceC35689r0, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m108274w(InterfaceC13346t it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m108275x(InterfaceC35689r0 interfaceC35689r0, int i13, Composer composer, int i14) {
        m108273v(interfaceC35689r0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    private static final void m108276y(AbstractC18111h abstractC18111h, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1663768735);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC18111h) : c28655q.m87157i(abstractC18111h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC38328f.m122859E(new C35022c(AbstractC8693b.m21278l(""), null, null, new C18112i(abstractC18111h, EnumC18110g.LARGE, AbstractC8693b.m21278l("2000"), null, null, false, 56, null), null, AbstractC8693b.m21278l(""), AbstractC8693b.m21278l(""), null, EnumC39333f.BRAND_WHITE, EnumC35021b.NONE, C25271y.f99162w, null, new C9598e(AppScreen.C9318g6.f27632w, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 6, null), 2064, null), new C33860g(false, false, null, 0 == true ? 1 : 0, null, 31, 0 == true ? 1 : 0), c28655q, C35022c.f148189n | (C33860g.f141846f << 3));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(abstractC18111h, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m108277z(AbstractC18111h abstractC18111h, int i13, Composer composer, int i14) {
        m108276y(abstractC18111h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
