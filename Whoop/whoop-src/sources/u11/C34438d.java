package u11;

import com.whoop.whoopaction.domain.models.Action;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: u11.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b\u000b\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b \u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b5\u0010#R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b6\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b/\u0010\u001aR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b.\u0010\u001c¨\u0006:"}, m65681d2 = {"Lu11/d;", "", "", "isLoading", "isError", "isFilterLoading", "Lm91/o;", "filters", "", "filterTagWrappers", "items", "isPerformActionLoading", "", "actionError", "Lcom/whoop/whoopaction/domain/models/Action;", "retryItemAction", "hasMore", "isPaginationLoading", "isPaginationError", "paginationErrorMessage", "paginationRetryActionText", "", "loadMoreEpoch", "<init>", "(ZZZLm91/o;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZZZLjava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "k", "()Z", "b", "i", "c", "j", "d", "Lm91/o;", "()Lm91/o;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/String;", "Lcom/whoop/whoopaction/domain/models/Action;", "getRetryItemAction", "()Lcom/whoop/whoopaction/domain/models/Action;", "m", "l", "n", "o", "I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34438d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isFilterLoading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C25306o filters;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C25306o> filterTagWrappers;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C25306o> items;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isPerformActionLoading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String actionError;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Action retryItemAction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean hasMore;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isPaginationLoading;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isPaginationError;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String paginationErrorMessage;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String paginationRetryActionText;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int loadMoreEpoch;

    public C34438d(boolean z4, boolean z13, boolean z14, C25306o c25306o, List<C25306o> filterTagWrappers, List<C25306o> items, boolean z15, String str, Action action, boolean z16, boolean z17, boolean z18, String str2, String str3, int i13) {
        AbstractC22676k.m65750j(filterTagWrappers, "filterTagWrappers");
        AbstractC22676k.m65750j(items, "items");
        this.isLoading = z4;
        this.isError = z13;
        this.isFilterLoading = z14;
        this.filters = c25306o;
        this.filterTagWrappers = filterTagWrappers;
        this.items = items;
        this.isPerformActionLoading = z15;
        this.actionError = str;
        this.retryItemAction = action;
        this.hasMore = z16;
        this.isPaginationLoading = z17;
        this.isPaginationError = z18;
        this.paginationErrorMessage = str2;
        this.paginationRetryActionText = str3;
        this.loadMoreEpoch = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActionError() {
        return this.actionError;
    }

    /* JADX INFO: renamed from: b */
    public final List<C25306o> m108801b() {
        return this.filterTagWrappers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C25306o getFilters() {
        return this.filters;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX INFO: renamed from: e */
    public final List<C25306o> m108804e() {
        return this.items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34438d)) {
            return false;
        }
        C34438d c34438d = (C34438d) other;
        return this.isLoading == c34438d.isLoading && this.isError == c34438d.isError && this.isFilterLoading == c34438d.isFilterLoading && AbstractC22676k.m65745e(this.filters, c34438d.filters) && AbstractC22676k.m65745e(this.filterTagWrappers, c34438d.filterTagWrappers) && AbstractC22676k.m65745e(this.items, c34438d.items) && this.isPerformActionLoading == c34438d.isPerformActionLoading && AbstractC22676k.m65745e(this.actionError, c34438d.actionError) && AbstractC22676k.m65745e(this.retryItemAction, c34438d.retryItemAction) && this.hasMore == c34438d.hasMore && this.isPaginationLoading == c34438d.isPaginationLoading && this.isPaginationError == c34438d.isPaginationError && AbstractC22676k.m65745e(this.paginationErrorMessage, c34438d.paginationErrorMessage) && AbstractC22676k.m65745e(this.paginationRetryActionText, c34438d.paginationRetryActionText) && this.loadMoreEpoch == c34438d.loadMoreEpoch;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLoadMoreEpoch() {
        return this.loadMoreEpoch;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPaginationErrorMessage() {
        return this.paginationErrorMessage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPaginationRetryActionText() {
        return this.paginationRetryActionText;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31, this.isFilterLoading);
        C25306o c25306o = this.filters;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM8289b + (c25306o == null ? 0 : c25306o.hashCode())) * 31, 31, this.filterTagWrappers), 31, this.items), 31, this.isPerformActionLoading);
        String str = this.actionError;
        int iHashCode = (iM8289b2 + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.retryItemAction;
        int iM8289b3 = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (action == null ? 0 : action.hashCode())) * 31, 31, this.hasMore), 31, this.isPaginationLoading), 31, this.isPaginationError);
        String str2 = this.paginationErrorMessage;
        int iHashCode2 = (iM8289b3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paginationRetryActionText;
        return Integer.hashCode(this.loadMoreEpoch) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsFilterLoading() {
        return this.isFilterLoading;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsPaginationError() {
        return this.isPaginationError;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsPaginationLoading() {
        return this.isPaginationLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        boolean z14 = this.isFilterLoading;
        C25306o c25306o = this.filters;
        List<C25306o> list = this.filterTagWrappers;
        List<C25306o> list2 = this.items;
        boolean z15 = this.isPerformActionLoading;
        String str = this.actionError;
        Action action = this.retryItemAction;
        boolean z16 = this.hasMore;
        boolean z17 = this.isPaginationLoading;
        boolean z18 = this.isPaginationError;
        String str2 = this.paginationErrorMessage;
        String str3 = this.paginationRetryActionText;
        int i13 = this.loadMoreEpoch;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("FilteredListViewState(isLoading=", ", isError=", ", isFilterLoading=", z4, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", filters=");
        sbM32002u.append(c25306o);
        sbM32002u.append(", filterTagWrappers=");
        AbstractC21702c.m61148s(sbM32002u, list, ", items=", list2, ", isPerformActionLoading=");
        AbstractC38963t7.m124391u(sbM32002u, z15, ", actionError=", str, ", retryItemAction=");
        sbM32002u.append(action);
        sbM32002u.append(", hasMore=");
        sbM32002u.append(z16);
        sbM32002u.append(", isPaginationLoading=");
        AbstractC38963t7.m124392v(sbM32002u, z17, ", isPaginationError=", z18, ", paginationErrorMessage=");
        AbstractC11266d.m30444B(sbM32002u, str2, ", paginationRetryActionText=", str3, ", loadMoreEpoch=");
        return AbstractC18489d0.m53371l(sbM32002u, i13, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C34438d(boolean z4, boolean z13, boolean z14, C25306o c25306o, List list, List list2, boolean z15, String str, Action action, boolean z16, boolean z17, boolean z18, String str2, String str3, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z19 = (i14 & 1) != 0 ? true : z4;
        boolean z24 = (i14 & 2) != 0 ? false : z13;
        boolean z25 = (i14 & 4) != 0 ? false : z14;
        C25306o c25306o2 = (i14 & 8) != 0 ? null : c25306o;
        int i15 = i14 & 16;
        List list3 = C25271y.f99162w;
        this(z19, z24, z25, c25306o2, i15 != 0 ? list3 : list, (i14 & 32) == 0 ? list2 : list3, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? null : str, (i14 & 256) != 0 ? null : action, (i14 & 512) != 0 ? false : z16, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z17, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z18, (i14 & 4096) != 0 ? null : str2, (i14 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? str3 : null, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 0 : i13);
    }
}
