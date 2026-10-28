package us2;

import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import jb1.C21535a;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qs2.AbstractC30576a;
import ss2.AbstractC32952c;
import ss2.C32950a;
import ss2.C32953d;

/* JADX INFO: renamed from: us2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lus2/g;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lss2/c$c;", "domainResult", "Lus2/f$c;", "a", "(Lss2/c$c;)Lus2/f$c;", "Lss2/d;", "header", "Lus2/b;", "b", "(Lss2/d;)Lus2/b;", "Lss2/c;", "Lus2/f;", "c", "(Lss2/c;)Lus2/f;", "Ljb1/a;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35226g {

    /* JADX INFO: renamed from: b */
    public static final int f149821b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C35226g(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC35225f.c m111607a(AbstractC32952c.c domainResult) {
        C32950a result = domainResult.getResult();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getNavigationTitle());
        AbstractC22403o.c cVar = new AbstractC22403o.c(result.getHeroImageUrl(), 0, 0, 0, 14, null);
        AbstractC22403o.c cVar2 = new AbstractC22403o.c(result.getJanuaryJumpstartImageUrl(), 0, 0, 0, 14, null);
        C35221b c35221bM111608b = m111608b(result.getHeaderSection());
        DesignSystemModel customPlanCard = result.getCustomPlanCard();
        InterfaceC25312u interfaceC25312uM60541h = customPlanCard != null ? this.designItemReducer.m60541h(customPlanCard) : null;
        List<InterfaceC25312u> listM60540g = this.designItemReducer.m60540g(result.m104053d());
        AiContextMetadata aiContextMetadata = domainResult.getAiContextMetadata();
        return new AbstractC35225f.c(textResourceM21278l, cVar, cVar2, c35221bM111608b, interfaceC25312uM60541h, listM60540g, aiContextMetadata != null ? AbstractC6219a.m18523a(aiContextMetadata) : null);
    }

    /* JADX INFO: renamed from: b */
    private final C35221b m111608b(C32953d header) {
        return new C35221b(AbstractC8693b.m21278l(header.getSubtitleDisplay()), this.designItemReducer.m60541h(header.getLearnMoreButton()));
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC35225f m111609c(AbstractC32952c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC32952c.b) {
            return AbstractC35225f.b.f149813a;
        }
        if (domainResult instanceof AbstractC32952c.a) {
            return AbstractC35225f.a.f149812a;
        }
        if (domainResult instanceof AbstractC32952c.c) {
            return m111607a((AbstractC32952c.c) domainResult);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C35226g(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC30576a.m93801o() : c21535a);
    }
}
