package jr0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.communityfollowerlookup.domain.model.CommunityFollowerLookupResponse;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.whoopaction.domain.models.Action;
import gr0.AbstractC16092g;
import gr0.AbstractC16093h;
import gr0.C16087b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import w01.C36678c;

/* JADX INFO: renamed from: jr0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ljr0/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lgr0/b;", "domainState", "Lw01/c;", "a", "(Lgr0/b;)Lw01/c;", "Ljb1/a;", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21891a {

    /* JADX INFO: renamed from: b */
    public static final int f84590b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C21891a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX INFO: renamed from: a */
    public final C36678c m62151a(C16087b domainState) {
        List<C25306o> listM60543j;
        String message;
        Action action;
        String message2;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC16092g itemActionState = domainState.getItemActionState();
        AbstractC16092g.a aVar = itemActionState instanceof AbstractC16092g.a ? (AbstractC16092g.a) itemActionState : null;
        AbstractC16093h paginationState = domainState.getPaginationState();
        AbstractC16093h.a aVar2 = paginationState instanceof AbstractC16093h.a ? (AbstractC16093h.a) paginationState : null;
        AbstractC16092g itemActionState2 = domainState.getItemActionState();
        AbstractC16092g.b bVar = itemActionState2 instanceof AbstractC16092g.b ? (AbstractC16092g.b) itemActionState2 : null;
        String inFlightFollowerRequestId = bVar != null ? bVar.getInFlightFollowerRequestId() : null;
        boolean isLoading = domainState.getIsLoading();
        boolean isError = domainState.getIsError();
        CommunityFollowerLookupResponse data = domainState.getData();
        int totalRequest = data != null ? data.getTotalRequest() : 0;
        CommunityFollowerLookupResponse data2 = domainState.getData();
        String title = data2 != null ? data2.getTitle() : null;
        CommunityFollowerLookupResponse data3 = domainState.getData();
        AnalyticEventModel analyticEvent = data3 != null ? data3.getAnalyticEvent() : null;
        CommunityFollowerLookupResponse data4 = domainState.getData();
        if (data4 != null) {
            List<DesignSystemModel> items = data4.getItems();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC21892b.m62155d((DesignSystemModel) it.next(), domainState.m45456d()));
            }
            listM60543j = this.designItemReducer.m60543j(arrayList, C25272z.f99163w);
            if (inFlightFollowerRequestId != null) {
                listM60543j = AbstractC21892b.m62154c(listM60543j, inFlightFollowerRequestId);
            }
            if (listM60543j == null) {
            }
            List<C25306o> list = listM60543j;
            boolean z4 = domainState.getPaginationState() instanceof AbstractC16093h.b;
            if (aVar2 != null) {
                message = aVar2.getMessage();
            } else {
                message = null;
            }
            if (aVar2 != null) {
                action = aVar2.getAction();
            } else {
                action = null;
            }
            boolean z13 = bVar != null;
            if (aVar != null) {
                message2 = aVar.getMessage();
            } else {
                message2 = null;
            }
            return new C36678c(isLoading, isError, z4, message, action, z13, message2, aVar != null ? aVar.getAction() : null, totalRequest, title, analyticEvent, list, domainState.getPendingHostInteraction());
        }
        listM60543j = C25271y.f99162w;
        List<C25306o> list2 = listM60543j;
        boolean z14 = domainState.getPaginationState() instanceof AbstractC16093h.b;
        if (aVar2 != null) {
            message = aVar2.getMessage();
        } else {
            message = null;
        }
        if (aVar2 != null) {
            action = aVar2.getAction();
        } else {
            action = null;
        }
        boolean z15 = bVar != null;
        if (aVar != null) {
            message2 = aVar.getMessage();
        } else {
            message2 = null;
        }
        return new C36678c(isLoading, isError, z14, message, action, z15, message2, aVar != null ? aVar.getAction() : null, totalRequest, title, analyticEvent, list2, domainState.getPendingHostInteraction());
    }

    public /* synthetic */ C21891a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60555e(null, 1, null) : c21535a);
    }
}
