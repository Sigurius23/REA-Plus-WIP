package td0;

import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pd0.AbstractC29102b;
import rd0.C31241c;
import sd0.C32409a;

/* JADX INFO: renamed from: td0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ltd0/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lpd0/b;", "domainResult", "Lrd0/c;", "a", "(Lpd0/b;)Lrd0/c;", "Ljb1/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33702a {

    /* JADX INFO: renamed from: b */
    public static final int f140890b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C33702a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: a */
    public final C31241c m106479a(AbstractC29102b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC29102b.b) {
            return new C31241c(true, false, null, 6, null);
        }
        if (domainResult instanceof AbstractC29102b.a) {
            return new C31241c(false, true, null, 5, null);
        }
        if (!(domainResult instanceof AbstractC29102b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC29102b.c cVar = (AbstractC29102b.c) domainResult;
        String analyticsName = cVar.getData().getAnalyticsName();
        String analyticsActionName = cVar.getData().getAnalyticsActionName();
        String analyticsCategory = cVar.getData().getAnalyticsCategory();
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(cVar.getData().getImageUrl());
        String title = cVar.getData().getTitle();
        String subtitle = cVar.getData().getSubtitle();
        List<DesignSystemModel> items = cVar.getData().getItems();
        return new C31241c(false, false, new C32409a(analyticsName, analyticsActionName, analyticsCategory, abstractC22403oM64503l, title, subtitle, items != null ? this.designItemReducer.m60540g(items) : null, cVar.getData().getCtaText(), cVar.getData().getDestination()));
    }

    public /* synthetic */ C33702a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60555e(null, 1, null) : c21535a);
    }
}
