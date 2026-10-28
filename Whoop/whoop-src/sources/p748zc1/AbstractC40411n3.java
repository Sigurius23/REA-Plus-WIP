package p748zc1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.atomic.organism.horizontalscrollcontainer.HorizontalScrollBehavior;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import h31.AbstractC16812e;
import h31.AbstractC16819l;
import h31.EnumC16813f;
import h31.EnumC16821n;
import i31.AbstractC18048c;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r71.AbstractC31052b;
import r71.C31053c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.n3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "Lm91/u;", "f", "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "e", "d", "Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40411n3 {
    /* JADX INFO: renamed from: b */
    public static final void m130436b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(496469948);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            List<InterfaceC25312u> listM130440f = m130440f(c28655q, 0);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            AbstractC22399k.m64473c("Free (default) — fling settles anywhere", c28655q, 6);
            C31053c c31053c = new C31053c("recommendation-carousel-free", AbstractC8693b.m21278l("RECOMMENDED FOR YOU"), listM130440f, "Recommendation carousel with free scrolling", HorizontalScrollBehavior.FREE, false, null, 96, null);
            int i14 = C31053c.f128042h;
            AbstractC31052b.m95584k(c31053c, null, c28655q, i14, 2);
            AbstractC22399k.m64473c("Snap — fling settles on a tile", c28655q, 6);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("RECOMMENDED FOR YOU");
            HorizontalScrollBehavior horizontalScrollBehavior = HorizontalScrollBehavior.SNAP;
            AbstractC31052b.m95584k(new C31053c("recommendation-carousel-snap", textResourceM21278l, listM130440f, "Recommendation carousel with snap scrolling", horizontalScrollBehavior, false, null, 96, null), null, c28655q, i14, 2);
            AbstractC22399k.m64473c("Snap + paging indicator — dot tracks the current tile", c28655q, 6);
            AbstractC31052b.m95584k(new C31053c("recommendation-carousel-paging", AbstractC8693b.m21278l("RECOMMENDED FOR YOU"), listM130440f, "Recommendation carousel with snap scrolling and paging indicator", horizontalScrollBehavior, true, null, 64, null), null, c28655q, i14, 2);
            AbstractC22399k.m64473c("Paging indicator (many items) — dots collapse past 5", c28655q, 6);
            AbstractC31052b.m95584k(new C31053c("recommendation-carousel-paging-many", AbstractC8693b.m21278l("RECOMMENDED FOR YOU"), m130439e(c28655q, 0), "Recommendation carousel with paging indicator and many items", horizontalScrollBehavior, true, null, 64, null), null, c28655q, i14, 2);
            AbstractC22399k.m64473c("Edge cases — null title/labels, missing zones (no container title)", c28655q, 6);
            AbstractC31052b.m95584k(new C31053c("recommendation-carousel-edge-cases", null, m130438d(c28655q, 0), "Recommendation carousel exercising null titles, null labels, and missing zones", horizontalScrollBehavior, false, null, 96, null), null, c28655q, i14, 2);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40388l2(i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130437c(int i13, Composer composer, int i14) {
        m130436b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private static final List<InterfaceC25312u> m130438d(Composer composer, int i13) {
        return AbstractC37056f.m118959K(AbstractC16819l.m47388l("rec-no-bar-title", null, AbstractC18048c.m51834n(null, "NO BAR TITLE", null, null, null, null, null, null, false, false, null, 2045, null), AbstractC37056f.m118958J(AbstractC40373j9.m130136f()), null, false, 50, null), AbstractC16819l.m47388l("rec-no-zone-labels", null, AbstractC18048c.m51834n(null, "NO ZONE LABELS", null, null, null, null, null, null, false, false, null, 2045, null), AbstractC37056f.m118958J(AbstractC40373j9.m130137g()), null, false, 50, null));
    }

    /* JADX INFO: renamed from: e */
    private static final List<InterfaceC25312u> m130439e(Composer composer, int i13) {
        ArrayList arrayList = new ArrayList(8);
        int i14 = 0;
        while (i14 < 8) {
            String strM8295h = AbstractC2875y.m8295h(i14, "rec-activity-");
            i14++;
            arrayList.add(AbstractC16819l.m47388l(strM8295h, null, AbstractC18048c.m51834n(null, AbstractC2875y.m8295h(i14, "ACTIVITY "), null, null, null, null, null, null, false, false, null, 2045, null), null, null, false, 58, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    private static final List<InterfaceC25312u> m130440f(Composer composer, int i13) {
        return AbstractC37056f.m118959K(AbstractC16819l.m47388l("rec-zone-2-run", null, AbstractC18048c.m51834n(null, "ZONE 2 RUN", null, null, null, null, null, null, false, false, null, 2045, null), AbstractC37056f.m118958J(AbstractC40373j9.m130134d()), null, false, 50, null), AbstractC16819l.m47388l("rec-strength-trainer", null, AbstractC18048c.m51834n(null, "STRENGTH TRAINER", null, null, null, null, null, null, false, false, null, 2045, null), AbstractC37056f.m118958J(AbstractC40373j9.m130135e()), null, false, 50, null), AbstractC16819l.m47388l("rec-yoga-flow", EnumC16821n.COMMITTED, AbstractC18048c.m51834n(null, "YOGA FLOW", null, null, null, null, null, null, false, false, null, 2045, null), null, AbstractC16812e.m47360k(EnumC16813f.COMMITTED, "COMMITTED", EnumC16313m0.CHECKMARK, false, null, 24, null), false, 40, null));
    }
}
