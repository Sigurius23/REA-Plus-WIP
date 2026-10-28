package nr0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nr0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b \u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\"\u0010\u0013R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001a\u0010+¨\u0006,"}, m65681d2 = {"Lnr0/c;", "", "", "isLoading", "isError", "isLoadingMore", "", "loadMoreError", "Lcom/whoop/whoopaction/domain/models/Action;", "retryLoadMoreAction", "Lcom/whoop/analytics/AnalyticEventModel;", "sectionViewAnalyticEvent", "title", "", "Lm91/o;", "items", "<init>", "(ZZZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "f", "()Z", "b", "e", "c", "g", "d", "Ljava/lang/String;", "Lcom/whoop/whoopaction/domain/models/Action;", "getRetryLoadMoreAction", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "community-highlights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27070c {

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
    private final AnalyticEventModel sectionViewAnalyticEvent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C25306o> items;

    public C27070c(boolean z4, boolean z13, boolean z14, String str, Action action, AnalyticEventModel analyticEventModel, String str2, List<C25306o> items) {
        AbstractC22676k.m65750j(items, "items");
        this.isLoading = z4;
        this.isError = z13;
        this.isLoadingMore = z14;
        this.loadMoreError = str;
        this.retryLoadMoreAction = action;
        this.sectionViewAnalyticEvent = analyticEventModel;
        this.title = str2;
        this.items = items;
    }

    /* JADX INFO: renamed from: a */
    public final List<C25306o> m81366a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLoadMoreError() {
        return this.loadMoreError;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AnalyticEventModel getSectionViewAnalyticEvent() {
        return this.sectionViewAnalyticEvent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27070c)) {
            return false;
        }
        C27070c c27070c = (C27070c) other;
        return this.isLoading == c27070c.isLoading && this.isError == c27070c.isError && this.isLoadingMore == c27070c.isLoadingMore && AbstractC22676k.m65745e(this.loadMoreError, c27070c.loadMoreError) && AbstractC22676k.m65745e(this.retryLoadMoreAction, c27070c.retryLoadMoreAction) && AbstractC22676k.m65745e(this.sectionViewAnalyticEvent, c27070c.sectionViewAnalyticEvent) && AbstractC22676k.m65745e(this.title, c27070c.title) && AbstractC22676k.m65745e(this.items, c27070c.items);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31, this.isLoadingMore);
        String str = this.loadMoreError;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.retryLoadMoreAction;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.sectionViewAnalyticEvent;
        int iHashCode3 = (iHashCode2 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        String str2 = this.title;
        return this.items.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        boolean z14 = this.isLoadingMore;
        String str = this.loadMoreError;
        Action action = this.retryLoadMoreAction;
        AnalyticEventModel analyticEventModel = this.sectionViewAnalyticEvent;
        String str2 = this.title;
        List<C25306o> list = this.items;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CommunityHighlightsContainerViewState(isLoading=", ", isError=", ", isLoadingMore=", z4, z13);
        AbstractC38963t7.m124391u(sbM32002u, z14, ", loadMoreError=", str, ", retryLoadMoreAction=");
        sbM32002u.append(action);
        sbM32002u.append(", sectionViewAnalyticEvent=");
        sbM32002u.append(analyticEventModel);
        sbM32002u.append(", title=");
        return AbstractC30007c.m91840j(str2, ", items=", ")", sbM32002u, list);
    }

    public /* synthetic */ C27070c(boolean z4, boolean z13, boolean z14, String str, Action action, AnalyticEventModel analyticEventModel, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : action, (i13 & 32) != 0 ? null : analyticEventModel, (i13 & 64) != 0 ? null : str2, (i13 & 128) != 0 ? C25271y.f99162w : list);
    }
}
