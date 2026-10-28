package sr0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.communityhighlightscontainer.domain.model.CommunityHighlightsContainerResponse;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import m83.C25271y;
import m83.C25272z;
import nr0.C27070c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import pr0.AbstractC29489d;
import pr0.C29487b;

/* JADX INFO: renamed from: sr0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lsr0/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lpr0/b;", "domainState", "Lnr0/c;", "a", "(Lpr0/b;)Lnr0/c;", "Ljb1/a;", "community-highlights-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32908a {

    /* JADX INFO: renamed from: b */
    public static final int f137129b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C32908a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: a */
    public final C27070c m103300a(C29487b domainState) {
        List<C25306o> listM60543j;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC29489d paginationState = domainState.getPaginationState();
        AbstractC29489d.a aVar = paginationState instanceof AbstractC29489d.a ? (AbstractC29489d.a) paginationState : null;
        CommunityHighlightsContainerResponse data = domainState.getData();
        boolean isLoading = domainState.getIsLoading();
        boolean isError = domainState.getIsError();
        AnalyticEventModel analyticEvent = data != null ? data.getAnalyticEvent() : null;
        String title = data != null ? data.getTitle() : null;
        if (data == null || (listM60543j = this.designItemReducer.m60543j(data.getItems(), C25272z.f99163w)) == null) {
            listM60543j = C25271y.f99162w;
        }
        return new C27070c(isLoading, isError, domainState.getPaginationState() instanceof AbstractC29489d.b, aVar != null ? aVar.getMessage() : null, aVar != null ? aVar.getAction() : null, analyticEvent, title, listM60543j);
    }

    public /* synthetic */ C32908a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60555e(null, 1, null) : c21535a);
    }
}
