package cm2;

import am2.C1013d0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jb1.C21535a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import vl2.C36113f;
import vl2.InterfaceC36116i;
import y71.C39282o;

/* JADX INFO: renamed from: cm2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lcm2/a;", "", "<init>", "()V", "Lvl2/f;", "Lam2/d0;", "metaData", "Ljb1/a;", "designItemReducer", "Lcm2/t;", "trendMenuSheetReducer", "Lcm2/r;", "b", "(Lvl2/f;Lam2/d0;Ljb1/a;Lcm2/t;)Lcm2/r;", "domainResult", "a", "(Lvl2/f;Ljb1/a;Lcm2/t;Lam2/d0;)Lcm2/r;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4812a {
    /* JADX INFO: renamed from: b */
    private final AbstractC4830r m15190b(C36113f c36113f, C1013d0 c1013d0, C21535a c21535a, C4832t c4832t) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(c36113f.getNavigationBarTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(c36113f.getTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(c36113f.getSubtitle());
        InterfaceC25312u interfaceC25312uM60541h = c21535a.m60541h(c36113f.getAddManualMeasurement().getTrendMenuItem());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemState");
        C39282o c39282o = (C39282o) interfaceC25312uM60541h;
        C4827o c4827oM15199a = AbstractC4814b.m15199a(c36113f.getSections(), c4832t);
        InterfaceC36116i menuSheetDomainState = c36113f.getAddManualMeasurement().getMenuSheetDomainState();
        return new AbstractC4830r.e(new C4829q(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, c39282o, c4827oM15199a, c1013d0, menuSheetDomainState != null ? C4832t.m15264g(c4832t, menuSheetDomainState, null, 2, null) : null));
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC4830r m15191a(C36113f domainResult, C21535a designItemReducer, C4832t trendMenuSheetReducer, C1013d0 metaData) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        AbstractC22676k.m65750j(trendMenuSheetReducer, "trendMenuSheetReducer");
        AbstractC22676k.m65750j(metaData, "metaData");
        return m15190b(domainResult, metaData, designItemReducer, trendMenuSheetReducer);
    }
}
