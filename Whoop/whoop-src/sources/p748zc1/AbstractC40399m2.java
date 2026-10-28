package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.items.FlowRowHorizontalSpacing;
import com.whoop.design.models.items.FlowRowModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.navigation.C9598e;
import hy0.EnumC17727b2;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23721u2;
import p736sz0.AbstractC33195l;
import p736sz0.C33198m;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.m2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"(\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;", "horizontalSpacing", "Lsz0/m;", "d", "(Lcom/whoop/design/models/items/FlowRowHorizontalSpacing;)Lsz0/m;", "Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "", "Ll83/k;", "", "a", "Ljava/util/List;", "horizontalSpacingCases", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40399m2 {

    /* JADX INFO: renamed from: a */
    private static final List<C23465k> f174352a;

    static {
        List listM118958J = AbstractC37056f.m118958J(new C23465k("Omitted (8dp)", null));
        InterfaceC33616a<FlowRowHorizontalSpacing> entries = FlowRowHorizontalSpacing.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(entries, 10));
        for (FlowRowHorizontalSpacing flowRowHorizontalSpacing : entries) {
            arrayList.add(new C23465k(flowRowHorizontalSpacing.name(), flowRowHorizontalSpacing));
        }
        f174352a = AbstractC25265s.m74129g1(listM118958J, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static final void m130287b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-991839108);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC33195l.m105198i(c28655q, 0);
            float f13 = 2;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(1537906596);
            for (C23465k c23465k : f174352a) {
                String str = (String) c23465k.f92937w;
                FlowRowHorizontalSpacing flowRowHorizontalSpacing = (FlowRowHorizontalSpacing) c23465k.f92938x;
                AbstractC22399k.m64473c("horizontal_spacing: " + str, c28655q, 0);
                AbstractC33195l.m105194e(null, m130289d(flowRowHorizontalSpacing), null, c28655q, C33198m.f138411d << 3, 5);
                AbstractC18489d0.m53380u(f13, (float) 4, c2314t, c28655q);
            }
            c28655q.m87173q(false);
            AbstractC22399k.m64473c("Narrow width, wraps", c28655q, 6);
            c28655q.m87150e0(1537917378);
            Iterator<T> it = f174352a.iterator();
            while (it.hasNext()) {
                float f14 = 4;
                AbstractC33195l.m105194e(AbstractC1102d.m3424u(25 * f14, c2314t), m130289d((FlowRowHorizontalSpacing) ((C23465k) it.next()).f92938x), null, c28655q, (C33198m.f138411d << 3) | 6, 4);
                AbstractC18489d0.m53380u(f13, f14, c2314t, c28655q);
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40388l2(i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130288c(int i13, Composer composer, int i14) {
        m130287b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private static final C33198m m130289d(FlowRowHorizontalSpacing flowRowHorizontalSpacing) {
        return AbstractC23721u2.m69520x(new FlowRowModel(AbstractC37056f.m118959K(new MarkdownTextModel("7:40", "N4_5", "BRAND_WHITE", "LEADING", null, null, null, false, null, 352, null), new MarkdownTextModel("hrs", "N5_5", "BRAND_WHITE", "LEADING", 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, null, 352, null), new ImpactModel("", false, EnumC17727b2.POSITIVE_YELLOW, "TINY_TRAINGLE_UP", (C9598e) (0 == true ? 1 : 0), 16, (DefaultConstructorMarker) null)), "CENTER", flowRowHorizontalSpacing));
    }
}
