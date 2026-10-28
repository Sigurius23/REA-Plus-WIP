package v01;

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
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: v01.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b'\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b!\u0010/R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b#\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b\u001d\u00103R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u001e\u001a\u0004\b-\u0010 ¨\u00065"}, m65681d2 = {"Lv01/g;", "", "", "isLoading", "isError", "isLoadingMore", "", "loadMoreError", "Lcom/whoop/whoopaction/domain/models/Action;", "retryLoadMoreAction", "Lcom/whoop/analytics/AnalyticEventModel;", "sectionViewAnalyticEvent", "Lm91/o;", "header", "", "items", "Lv01/a;", "filterBottomSheet", "isFilterSheetVisible", "<init>", "(ZZZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lm91/o;Ljava/util/List;Lv01/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "b", "f", "c", "i", "d", "Ljava/lang/String;", "e", "Lcom/whoop/whoopaction/domain/models/Action;", "getRetryLoadMoreAction", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "g", "Lm91/o;", "()Lm91/o;", "Ljava/util/List;", "()Ljava/util/List;", "Lv01/a;", "()Lv01/a;", "j", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35505g {

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
    private final C25306o header;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C25306o> items;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C35499a filterBottomSheet;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isFilterSheetVisible;

    public C35505g(boolean z4, boolean z13, boolean z14, String str, Action action, AnalyticEventModel analyticEventModel, C25306o c25306o, List<C25306o> items, C35499a c35499a, boolean z15) {
        AbstractC22676k.m65750j(items, "items");
        this.isLoading = z4;
        this.isError = z13;
        this.isLoadingMore = z14;
        this.loadMoreError = str;
        this.retryLoadMoreAction = action;
        this.sectionViewAnalyticEvent = analyticEventModel;
        this.header = c25306o;
        this.items = items;
        this.filterBottomSheet = c35499a;
        this.isFilterSheetVisible = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C35499a getFilterBottomSheet() {
        return this.filterBottomSheet;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C25306o getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c */
    public final List<C25306o> m112614c() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLoadMoreError() {
        return this.loadMoreError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AnalyticEventModel getSectionViewAnalyticEvent() {
        return this.sectionViewAnalyticEvent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35505g)) {
            return false;
        }
        C35505g c35505g = (C35505g) other;
        return this.isLoading == c35505g.isLoading && this.isError == c35505g.isError && this.isLoadingMore == c35505g.isLoadingMore && AbstractC22676k.m65745e(this.loadMoreError, c35505g.loadMoreError) && AbstractC22676k.m65745e(this.retryLoadMoreAction, c35505g.retryLoadMoreAction) && AbstractC22676k.m65745e(this.sectionViewAnalyticEvent, c35505g.sectionViewAnalyticEvent) && AbstractC22676k.m65745e(this.header, c35505g.header) && AbstractC22676k.m65745e(this.items, c35505g.items) && AbstractC22676k.m65745e(this.filterBottomSheet, c35505g.filterBottomSheet) && this.isFilterSheetVisible == c35505g.isFilterSheetVisible;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsFilterSheetVisible() {
        return this.isFilterSheetVisible;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31, this.isLoadingMore);
        String str = this.loadMoreError;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.retryLoadMoreAction;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.sectionViewAnalyticEvent;
        int iHashCode3 = (iHashCode2 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        C25306o c25306o = this.header;
        int iM31983b = AbstractC11895b.m31983b((iHashCode3 + (c25306o == null ? 0 : c25306o.hashCode())) * 31, 31, this.items);
        C35499a c35499a = this.filterBottomSheet;
        return Boolean.hashCode(this.isFilterSheetVisible) + ((iM31983b + (c35499a != null ? c35499a.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        boolean z14 = this.isLoadingMore;
        String str = this.loadMoreError;
        Action action = this.retryLoadMoreAction;
        AnalyticEventModel analyticEventModel = this.sectionViewAnalyticEvent;
        C25306o c25306o = this.header;
        List<C25306o> list = this.items;
        C35499a c35499a = this.filterBottomSheet;
        boolean z15 = this.isFilterSheetVisible;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CommunityFollowerContainerViewState(isLoading=", ", isError=", ", isLoadingMore=", z4, z13);
        AbstractC38963t7.m124391u(sbM32002u, z14, ", loadMoreError=", str, ", retryLoadMoreAction=");
        sbM32002u.append(action);
        sbM32002u.append(", sectionViewAnalyticEvent=");
        sbM32002u.append(analyticEventModel);
        sbM32002u.append(", header=");
        sbM32002u.append(c25306o);
        sbM32002u.append(", items=");
        sbM32002u.append(list);
        sbM32002u.append(", filterBottomSheet=");
        sbM32002u.append(c35499a);
        sbM32002u.append(", isFilterSheetVisible=");
        sbM32002u.append(z15);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C35505g(boolean z4, boolean z13, boolean z14, String str, Action action, AnalyticEventModel analyticEventModel, C25306o c25306o, List list, C35499a c35499a, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : action, (i13 & 32) != 0 ? null : analyticEventModel, (i13 & 64) != 0 ? null : c25306o, (i13 & 128) != 0 ? C25271y.f99162w : list, (i13 & 256) != 0 ? null : c35499a, (i13 & 512) != 0 ? false : z15);
    }
}
