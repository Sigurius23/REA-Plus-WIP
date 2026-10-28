package p730qt2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm0.C3412o;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.List;
import l83.C23454a0;
import ot2.C28348q;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qt2.t */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"", "Lot2/q;", "metricLegend", "Ll83/a0;", "b", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30614t {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m93977b(List<C28348q> metricLegend, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(metricLegend, "metricLegend");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(142956999);
        int i14 = 4;
        int i15 = 2;
        int i16 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(metricLegend) ? 4 : 2) : i13;
        int i17 = 0;
        int i18 = 1;
        if (c28655q2.m87135U(i16 & 1, (i16 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
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
            c28655q2.m87150e0(-395590806);
            for (C28348q c28348q : metricLegend) {
                float f13 = i14;
                AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(i18 * f13, AbstractC1102d.m3424u(3 * f13, c2314t)), AbstractC33253j.m105489e((float) 1.2d)), AbstractC18249c.m52577o(c28348q.getLegendColor().mo134584toComposableColorWaAFU9c(c28655q2, i17))), c28655q2, i17);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(i15 * f13, c2314t));
                String strM21274h = AbstractC8693b.m21274h(c28348q.getLegendTitle(), c28655q2, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                C2314t c2314t2 = c2314t;
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getB3(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                AbstractC18489d0.m53380u((float) 2.5d, f13, c2314t2, c28655q3);
                i18 = 1;
                c2314t = c2314t2;
                i17 = i17;
                c28655q2 = c28655q3;
                i14 = i14;
                i15 = i15;
            }
            C28655q c28655q4 = c28655q2;
            c28655q4.m87173q(i17);
            c28655q4.m87173q(true);
            c28655q = c28655q4;
        } else {
            C28655q c28655q5 = c28655q2;
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(metricLegend, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m93978c(List list, int i13, Composer composer, int i14) {
        m93977b(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
