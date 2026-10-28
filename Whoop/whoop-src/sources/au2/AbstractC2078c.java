package au2;

import a41.C0373i;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import kotlin.C1991b1;
import l83.C23454a0;
import lz0.AbstractC24821f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p01.AbstractC28586f;
import p01.C28582b;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wt2.C37626g;
import x81.C38072d;

/* JADX INFO: renamed from: au2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\u0004\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lau2/d;", "newSummaryItemState", "Ll83/a0;", "g", "(Lau2/d;Landroidx/compose/runtime/Composer;I)V", "Lwt2/g;", "progressBar", "o", "(Lwt2/g;Landroidx/compose/runtime/Composer;I)V", "j", "Lau2/e;", "itemState", "m", "(Lau2/e;Landroidx/compose/runtime/Composer;I)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2078c {
    /* JADX INFO: renamed from: g */
    public static final void m6570g(C2079d newSummaryItemState, Composer composer, int i13) {
        int i14;
        C28677v1 c28677v1M87180u;
        C2077b c2077b;
        AbstractC22676k.m65750j(newSummaryItemState, "newSummaryItemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1788570648);
        int i15 = c28655q.f115903S ? -c28655q.f115893I.f115802v : c28655q.f115891G.f115746i;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(newSummaryItemState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-145696418);
            C37626g progressBar = newSummaryItemState.getProgressBar();
            if (progressBar == null) {
                c28655q.m87150e0(-145671031);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-145671030);
                m6578o(progressBar, c28655q, 0);
                AbstractC25012a.m73388u(3, 8, c2314t, c28655q, false);
            }
            if (newSummaryItemState.m6580a().isEmpty() && newSummaryItemState.m6582c().isEmpty()) {
                c28655q.m87183x(i15);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c2077b = new C2077b(newSummaryItemState, i13, 0);
                }
            } else {
                m6573j(newSummaryItemState, c28655q, i14 & 14);
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            }
            c28677v1M87180u.f115982d = c2077b;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c2077b = new C2077b(newSummaryItemState, i13, 1);
            c28677v1M87180u.f115982d = c2077b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m6571h(C2079d c2079d, int i13, Composer composer, int i14) {
        m6570g(c2079d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m6572i(C2079d c2079d, int i13, Composer composer, int i14) {
        m6570g(c2079d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: j */
    private static final void m6573j(C2079d c2079d, Composer composer, int i13) {
        int i14;
        ?? r15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1244363174);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c2079d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C1991b1(10);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3478a = AbstractC1125a.m3478a(modifierM3427x, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3478a);
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
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f14, 3 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(43320084);
            Iterator<T> it = c2079d.m6580a().iterator();
            while (it.hasNext()) {
                m6576m((C2080e) it.next(), c28655q, 0);
            }
            c28655q.m87173q(false);
            if (c2079d.m6580a().isEmpty() || c2079d.m6582c().isEmpty()) {
                r15 = 0;
                c28655q.m87150e0(1343291320);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1343117379);
                r15 = 0;
                AbstractC17755i2.m50938j(AbstractC1102d.m3411h(1, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(43333652);
            Iterator<T> it3 = c2079d.m6582c().iterator();
            while (it3.hasNext()) {
                m6576m((C2080e) it3.next(), c28655q, r15);
            }
            AbstractC25012a.m73392y(c28655q, r15, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2077b(c2079d, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m6574k(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        AbstractC2076a.m6563c(drawBehind);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m6575l(C2079d c2079d, int i13, Composer composer, int i14) {
        m6573j(c2079d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m6576m(C2080e c2080e, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-306458917);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c2080e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c2080e.getTitle(), c28655q, TextResource.$stable), new LayoutWeightElement(1.0f, true), c2080e.getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            AbstractC28586f.m86944i(null, c2080e.getCircularProgressIndicator(), c28655q, C28582b.f115652u << 3, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c2080e, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m6577n(C2080e c2080e, int i13, Composer composer, int i14) {
        m6576m(c2080e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m6578o(C37626g c37626g, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(27288645);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(c37626g) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t, null, 3));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM21275i = AbstractC8693b.m21275i(c37626g.getTitle(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8405C = c38072d.m121952e(c28655q2, i15).getN6();
            long jM125430y = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21275i, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C, null, c28655q, 0, i16, 196602);
            float f13 = 1;
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC16277f.f62235F1, c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getN8(), null, c28655q, 48, i16, 196600);
            float f14 = 4 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
            AbstractC30795n.m94707h(c37626g.getSubTitle(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH5(), null, c28655q, 48, i16, 196600);
            AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
            AbstractC24821f.m72736b(null, c37626g.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i15).getAccentPositiveTrend()), new C17919x(c38072d.m121949b(c28655q, i15).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, i15).getWhite10(), false, f14, c28655q, 1769856, 1);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c37626g, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m6579p(C37626g c37626g, int i13, Composer composer, int i14) {
        m6578o(c37626g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
