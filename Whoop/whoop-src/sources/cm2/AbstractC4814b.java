package cm2;

import bm2.C3462n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vl2.C36111d;
import vl2.C36114g;
import vl2.C36117j;
import vl2.InterfaceC36116i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cm2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lvl2/g;", "sections", "Lcm2/t;", "trendMenuSheetReducer", "Lcm2/o;", "a", "(Lvl2/g;Lcm2/t;)Lcm2/o;", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4814b {
    /* JADX INFO: renamed from: a */
    public static final C4827o m15199a(C36114g sections, C4832t trendMenuSheetReducer) {
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(trendMenuSheetReducer, "trendMenuSheetReducer");
        String nextToken = sections.getNextToken();
        List<C36117j> listM114776b = sections.m114776b();
        ArrayList arrayList = new ArrayList();
        for (C36117j c36117j : listM114776b) {
            List listM118958J = AbstractC37056f.m118958J(new C4828p(c36117j.getTitle(), AbstractC8693b.m21278l(c36117j.getTitle())));
            List<C36111d> listM114780a = c36117j.m114780a();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM114780a, 10));
            for (C36111d c36111d : listM114780a) {
                String id4 = c36111d.getContent().getId();
                EnumC16313m0 icon = c36111d.getContent().getIcon();
                String iconUrl = c36111d.getContent().getIconUrl();
                TextResource textResourceM21278l = AbstractC8693b.m21278l(String.valueOf(c36111d.getContent().getMeasurementValue()));
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c36111d.getContent().getUnit());
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c36111d.getContent().getSubtitle());
                InterfaceC36116i menuSheet = c36111d.getContent().getMenuSheet();
                C3462n c3462n = new C3462n(id4, icon, iconUrl, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, menuSheet != null ? trendMenuSheetReducer.m15268f(menuSheet, c36111d.getContent().getId()) : null);
                arrayList2.add(new C4828p(c3462n.getId(), c3462n));
            }
            AbstractC25265s.m74141p0(arrayList, AbstractC25265s.m74129g1(listM118958J, arrayList2));
        }
        return new C4827o(nextToken, arrayList);
    }
}
