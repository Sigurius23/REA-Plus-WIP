package w01;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: w01.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b\n\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b \u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b0\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b*\u00104R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b$\u00107R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b(\u0010:¨\u0006;"}, m65681d2 = {"Lw01/c;", "", "", "isLoading", "isError", "isLoadingMore", "", "loadMoreError", "Lcom/whoop/whoopaction/domain/models/Action;", "retryLoadMoreAction", "isPerformActionLoading", "actionError", "retryItemAction", "", "totalRequest", "title", "Lcom/whoop/analytics/AnalyticEventModel;", "sectionViewAnalyticEvent", "", "Lm91/o;", "items", "Lcom/whoop/navigation/models/GenericInteraction;", "pendingHostInteraction", "<init>", "(ZZZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "i", "()Z", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "j", "d", "Ljava/lang/String;", "e", "Lcom/whoop/whoopaction/domain/models/Action;", "getRetryLoadMoreAction", "()Lcom/whoop/whoopaction/domain/models/Action;", "f", "g", "getRetryItemAction", "I", "k", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "l", "Ljava/util/List;", "()Ljava/util/List;", "m", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36678c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isLoadingMore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String loadMoreError;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Action retryLoadMoreAction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isPerformActionLoading;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String actionError;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Action retryItemAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int totalRequest;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final AnalyticEventModel sectionViewAnalyticEvent;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<C25306o> items;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final GenericInteraction pendingHostInteraction;

    public C36678c(boolean z4, boolean z13, boolean z14, String str, Action action, boolean z15, String str2, Action action2, int i13, String str3, AnalyticEventModel analyticEventModel, List<C25306o> items, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(items, "items");
        this.isLoading = z4;
        this.isError = z13;
        this.isLoadingMore = z14;
        this.loadMoreError = str;
        this.retryLoadMoreAction = action;
        this.isPerformActionLoading = z15;
        this.actionError = str2;
        this.retryItemAction = action2;
        this.totalRequest = i13;
        this.title = str3;
        this.sectionViewAnalyticEvent = analyticEventModel;
        this.items = items;
        this.pendingHostInteraction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActionError() {
        return this.actionError;
    }

    /* JADX INFO: renamed from: b */
    public final List<C25306o> m117701b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLoadMoreError() {
        return this.loadMoreError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final GenericInteraction getPendingHostInteraction() {
        return this.pendingHostInteraction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AnalyticEventModel getSectionViewAnalyticEvent() {
        return this.sectionViewAnalyticEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36678c)) {
            return false;
        }
        C36678c c36678c = (C36678c) other;
        return this.isLoading == c36678c.isLoading && this.isError == c36678c.isError && this.isLoadingMore == c36678c.isLoadingMore && AbstractC22676k.m65745e(this.loadMoreError, c36678c.loadMoreError) && AbstractC22676k.m65745e(this.retryLoadMoreAction, c36678c.retryLoadMoreAction) && this.isPerformActionLoading == c36678c.isPerformActionLoading && AbstractC22676k.m65745e(this.actionError, c36678c.actionError) && AbstractC22676k.m65745e(this.retryItemAction, c36678c.retryItemAction) && this.totalRequest == c36678c.totalRequest && AbstractC22676k.m65745e(this.title, c36678c.title) && AbstractC22676k.m65745e(this.sectionViewAnalyticEvent, c36678c.sectionViewAnalyticEvent) && AbstractC22676k.m65745e(this.items, c36678c.items) && AbstractC22676k.m65745e(this.pendingHostInteraction, c36678c.pendingHostInteraction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getTotalRequest() {
        return this.totalRequest;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31, this.isLoadingMore);
        String str = this.loadMoreError;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.retryLoadMoreAction;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode + (action == null ? 0 : action.hashCode())) * 31, 31, this.isPerformActionLoading);
        String str2 = this.actionError;
        int iHashCode2 = (iM8289b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action2 = this.retryItemAction;
        int iM30448b = AbstractC11266d.m30448b(this.totalRequest, (iHashCode2 + (action2 == null ? 0 : action2.hashCode())) * 31, 31);
        String str3 = this.title;
        int iHashCode3 = (iM30448b + (str3 == null ? 0 : str3.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.sectionViewAnalyticEvent;
        int iM31983b = AbstractC11895b.m31983b((iHashCode3 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31, 31, this.items);
        GenericInteraction genericInteraction = this.pendingHostInteraction;
        return iM31983b + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        boolean z14 = this.isLoadingMore;
        String str = this.loadMoreError;
        Action action = this.retryLoadMoreAction;
        boolean z15 = this.isPerformActionLoading;
        String str2 = this.actionError;
        Action action2 = this.retryItemAction;
        int i13 = this.totalRequest;
        String str3 = this.title;
        AnalyticEventModel analyticEventModel = this.sectionViewAnalyticEvent;
        List<C25306o> list = this.items;
        GenericInteraction genericInteraction = this.pendingHostInteraction;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CommunityFollowerLookupViewState(isLoading=", ", isError=", ", isLoadingMore=", z4, z13);
        AbstractC38963t7.m124391u(sbM32002u, z14, ", loadMoreError=", str, ", retryLoadMoreAction=");
        sbM32002u.append(action);
        sbM32002u.append(", isPerformActionLoading=");
        sbM32002u.append(z15);
        sbM32002u.append(", actionError=");
        sbM32002u.append(str2);
        sbM32002u.append(", retryItemAction=");
        sbM32002u.append(action2);
        sbM32002u.append(", totalRequest=");
        AbstractC11895b.m31979B(i13, ", title=", str3, ", sectionViewAnalyticEvent=", sbM32002u);
        sbM32002u.append(analyticEventModel);
        sbM32002u.append(", items=");
        sbM32002u.append(list);
        sbM32002u.append(", pendingHostInteraction=");
        return AbstractC26725a.m79506j(sbM32002u, genericInteraction, ")");
    }

    public /* synthetic */ C36678c(boolean z4, boolean z13, boolean z14, String str, Action action, boolean z15, String str2, Action action2, int i13, String str3, AnalyticEventModel analyticEventModel, List list, GenericInteraction genericInteraction, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? true : z4, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : action, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? null : str2, (i14 & 128) != 0 ? null : action2, (i14 & 256) == 0 ? i13 : 0, (i14 & 512) != 0 ? null : str3, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : analyticEventModel, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C25271y.f99162w : list, (i14 & 4096) != 0 ? null : genericInteraction);
    }
}
