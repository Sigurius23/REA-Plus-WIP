package bs0;

import b72.C2783a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.communitymomentscontainer.domain.model.CommunityMomentsContainerResponse;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.C23596b1;
import p720m91.C25306o;
import wr0.C37520c;
import yr0.C39726b;

/* JADX INFO: renamed from: bs0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lbs0/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lyr0/b;", "domainState", "Lwr0/c;", "c", "(Lyr0/b;)Lwr0/c;", "a", "Ljb1/a;", "community-moments-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3577a {

    /* JADX INFO: renamed from: b */
    public static final int f14452b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C3577a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m10731b(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final C37520c m10732c(C39726b domainState) {
        List<C25306o> listM60543j;
        AbstractC22676k.m65750j(domainState, "domainState");
        CommunityMomentsContainerResponse communityMomentsContainerResponseM127100c = domainState.getData();
        boolean zM127105h = domainState.getIsLoading();
        boolean zM127104g = domainState.getIsError();
        AnalyticEventModel analyticEvent = communityMomentsContainerResponseM127100c != null ? communityMomentsContainerResponseM127100c.getAnalyticEvent() : null;
        if (communityMomentsContainerResponseM127100c == null || (listM60543j = this.designItemReducer.m60543j(communityMomentsContainerResponseM127100c.getItems(), C25272z.f99163w)) == null) {
            listM60543j = C25271y.f99162w;
        }
        return new C37520c(zM127105h, zM127104g, analyticEvent, listM60543j);
    }

    public /* synthetic */ C3577a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60554d(new C2783a(29)) : c21535a);
    }
}
