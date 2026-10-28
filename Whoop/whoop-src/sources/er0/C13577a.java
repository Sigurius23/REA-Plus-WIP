package er0;

import br0.AbstractC3557d;
import br0.C3555b;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.communityfollowercontainer.domain.model.CommunityFilterBottomSheetModel;
import com.whoop.communityfollowercontainer.domain.model.CommunityFollowerContainerResponse;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.whoopaction.domain.models.Action;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import v01.C35499a;
import v01.C35505g;

/* JADX INFO: renamed from: er0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ler0/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lbr0/b;", "domainState", "Lv01/g;", "a", "(Lbr0/b;)Lv01/g;", "Ljb1/a;", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13577a {

    /* JADX INFO: renamed from: b */
    public static final int f47933b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C13577a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: a */
    public final C35505g m38319a(C3555b domainState) {
        List<C25306o> listM60543j;
        CommunityFilterBottomSheetModel filterBottomSheet;
        DesignSystemModel header;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC3557d paginationState = domainState.getPaginationState();
        C35499a c35499aM38322c = null;
        AbstractC3557d.a aVar = paginationState instanceof AbstractC3557d.a ? (AbstractC3557d.a) paginationState : null;
        CommunityFollowerContainerResponse data = domainState.getData();
        boolean isLoading = domainState.getIsLoading();
        boolean isError = domainState.getIsError();
        C25306o c25306oM60542i = (data == null || (header = data.getHeader()) == null) ? null : this.designItemReducer.m60542i(header);
        AnalyticEventModel analyticEvent = data != null ? data.getAnalyticEvent() : null;
        if (data == null || (listM60543j = this.designItemReducer.m60543j(data.getItems(), C25272z.f99163w)) == null) {
            listM60543j = C25271y.f99162w;
        }
        List<C25306o> list = listM60543j;
        boolean z4 = domainState.getPaginationState() instanceof AbstractC3557d.b;
        String message = aVar != null ? aVar.getMessage() : null;
        Action action = aVar != null ? aVar.getAction() : null;
        if (data != null && (filterBottomSheet = data.getFilterBottomSheet()) != null) {
            c35499aM38322c = AbstractC13578b.m38322c(filterBottomSheet, this.designItemReducer);
        }
        return new C35505g(isLoading, isError, z4, message, action, analyticEvent, c25306oM60542i, list, c35499aM38322c, domainState.getIsFilterSheetVisible());
    }

    public /* synthetic */ C13577a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60555e(null, 1, null) : c21535a);
    }
}
