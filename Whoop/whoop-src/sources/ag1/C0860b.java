package ag1;

import com.whoop.filteredlist.domain.model.FilteredListResponse;
import com.whoop.navigation.models.ApiRequest;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ag1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0088\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b5\u0010\u0019R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b#\u00106\u001a\u0004\b+\u0010\u001b¨\u00067"}, m65681d2 = {"Lag1/b;", "", "", "isLoading", "isError", "isFilterLoading", "Lcom/whoop/filteredlist/domain/model/FilteredListResponse;", "data", "", "currentPath", "Lag1/d;", "itemActionState", "Lcom/whoop/navigation/models/ApiRequest;", "nextPageRequest", "Lag1/e;", "paginationState", "paginationErrorMessage", "paginationRetryActionText", "", "loadMoreEpoch", "<init>", "(ZZZLcom/whoop/filteredlist/domain/model/FilteredListResponse;Ljava/lang/String;Lag1/d;Lcom/whoop/navigation/models/ApiRequest;Lag1/e;Ljava/lang/String;Ljava/lang/String;I)V", "a", "(ZZZLcom/whoop/filteredlist/domain/model/FilteredListResponse;Ljava/lang/String;Lag1/d;Lcom/whoop/navigation/models/ApiRequest;Lag1/e;Ljava/lang/String;Ljava/lang/String;I)Lag1/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "m", "()Z", "b", "k", "c", "l", "d", "Lcom/whoop/filteredlist/domain/model/FilteredListResponse;", "()Lcom/whoop/filteredlist/domain/model/FilteredListResponse;", "e", "Ljava/lang/String;", "f", "Lag1/d;", "()Lag1/d;", "g", "Lcom/whoop/navigation/models/ApiRequest;", "()Lcom/whoop/navigation/models/ApiRequest;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lag1/e;", "j", "()Lag1/e;", "i", "I", "filtered-list-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0860b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isFilterLoading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FilteredListResponse data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String currentPath;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC0862d itemActionState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ApiRequest nextPageRequest;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC0863e paginationState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String paginationErrorMessage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String paginationRetryActionText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int loadMoreEpoch;

    public C0860b(boolean z4, boolean z13, boolean z14, FilteredListResponse filteredListResponse, String str, AbstractC0862d itemActionState, ApiRequest apiRequest, AbstractC0863e paginationState, String str2, String str3, int i13) {
        AbstractC22676k.m65750j(itemActionState, "itemActionState");
        AbstractC22676k.m65750j(paginationState, "paginationState");
        this.isLoading = z4;
        this.isError = z13;
        this.isFilterLoading = z14;
        this.data = filteredListResponse;
        this.currentPath = str;
        this.itemActionState = itemActionState;
        this.nextPageRequest = apiRequest;
        this.paginationState = paginationState;
        this.paginationErrorMessage = str2;
        this.paginationRetryActionText = str3;
        this.loadMoreEpoch = i13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0860b m2077b(C0860b c0860b, boolean z4, boolean z13, boolean z14, FilteredListResponse filteredListResponse, String str, AbstractC0862d abstractC0862d, ApiRequest apiRequest, AbstractC0863e abstractC0863e, String str2, String str3, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z4 = c0860b.isLoading;
        }
        if ((i14 & 2) != 0) {
            z13 = c0860b.isError;
        }
        if ((i14 & 4) != 0) {
            z14 = c0860b.isFilterLoading;
        }
        if ((i14 & 8) != 0) {
            filteredListResponse = c0860b.data;
        }
        if ((i14 & 16) != 0) {
            str = c0860b.currentPath;
        }
        if ((i14 & 32) != 0) {
            abstractC0862d = c0860b.itemActionState;
        }
        if ((i14 & 64) != 0) {
            apiRequest = c0860b.nextPageRequest;
        }
        if ((i14 & 128) != 0) {
            abstractC0863e = c0860b.paginationState;
        }
        if ((i14 & 256) != 0) {
            str2 = c0860b.paginationErrorMessage;
        }
        if ((i14 & 512) != 0) {
            str3 = c0860b.paginationRetryActionText;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            i13 = c0860b.loadMoreEpoch;
        }
        String str4 = str3;
        int i15 = i13;
        AbstractC0863e abstractC0863e2 = abstractC0863e;
        String str5 = str2;
        AbstractC0862d abstractC0862d2 = abstractC0862d;
        ApiRequest apiRequest2 = apiRequest;
        String str6 = str;
        boolean z15 = z14;
        return c0860b.m2078a(z4, z13, z15, filteredListResponse, str6, abstractC0862d2, apiRequest2, abstractC0863e2, str5, str4, i15);
    }

    /* JADX INFO: renamed from: a */
    public final C0860b m2078a(boolean isLoading, boolean isError, boolean isFilterLoading, FilteredListResponse data, String currentPath, AbstractC0862d itemActionState, ApiRequest nextPageRequest, AbstractC0863e paginationState, String paginationErrorMessage, String paginationRetryActionText, int loadMoreEpoch) {
        AbstractC22676k.m65750j(itemActionState, "itemActionState");
        AbstractC22676k.m65750j(paginationState, "paginationState");
        return new C0860b(isLoading, isError, isFilterLoading, data, currentPath, itemActionState, nextPageRequest, paginationState, paginationErrorMessage, paginationRetryActionText, loadMoreEpoch);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrentPath() {
        return this.currentPath;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FilteredListResponse getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC0862d getItemActionState() {
        return this.itemActionState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0860b)) {
            return false;
        }
        C0860b c0860b = (C0860b) other;
        return this.isLoading == c0860b.isLoading && this.isError == c0860b.isError && this.isFilterLoading == c0860b.isFilterLoading && AbstractC22676k.m65745e(this.data, c0860b.data) && AbstractC22676k.m65745e(this.currentPath, c0860b.currentPath) && AbstractC22676k.m65745e(this.itemActionState, c0860b.itemActionState) && AbstractC22676k.m65745e(this.nextPageRequest, c0860b.nextPageRequest) && AbstractC22676k.m65745e(this.paginationState, c0860b.paginationState) && AbstractC22676k.m65745e(this.paginationErrorMessage, c0860b.paginationErrorMessage) && AbstractC22676k.m65745e(this.paginationRetryActionText, c0860b.paginationRetryActionText) && this.loadMoreEpoch == c0860b.loadMoreEpoch;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLoadMoreEpoch() {
        return this.loadMoreEpoch;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ApiRequest getNextPageRequest() {
        return this.nextPageRequest;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPaginationErrorMessage() {
        return this.paginationErrorMessage;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31, this.isFilterLoading);
        FilteredListResponse filteredListResponse = this.data;
        int iHashCode = (iM8289b + (filteredListResponse == null ? 0 : filteredListResponse.hashCode())) * 31;
        String str = this.currentPath;
        int iHashCode2 = (this.itemActionState.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        ApiRequest apiRequest = this.nextPageRequest;
        int iHashCode3 = (this.paginationState.hashCode() + ((iHashCode2 + (apiRequest == null ? 0 : apiRequest.hashCode())) * 31)) * 31;
        String str2 = this.paginationErrorMessage;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paginationRetryActionText;
        return Integer.hashCode(this.loadMoreEpoch) + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPaginationRetryActionText() {
        return this.paginationRetryActionText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC0863e getPaginationState() {
        return this.paginationState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsFilterLoading() {
        return this.isFilterLoading;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        boolean z14 = this.isFilterLoading;
        FilteredListResponse filteredListResponse = this.data;
        String str = this.currentPath;
        AbstractC0862d abstractC0862d = this.itemActionState;
        ApiRequest apiRequest = this.nextPageRequest;
        AbstractC0863e abstractC0863e = this.paginationState;
        String str2 = this.paginationErrorMessage;
        String str3 = this.paginationRetryActionText;
        int i13 = this.loadMoreEpoch;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("FilteredListDomainState(isLoading=", ", isError=", ", isFilterLoading=", z4, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", data=");
        sbM32002u.append(filteredListResponse);
        sbM32002u.append(", currentPath=");
        sbM32002u.append(str);
        sbM32002u.append(", itemActionState=");
        sbM32002u.append(abstractC0862d);
        sbM32002u.append(", nextPageRequest=");
        sbM32002u.append(apiRequest);
        sbM32002u.append(", paginationState=");
        sbM32002u.append(abstractC0863e);
        sbM32002u.append(", paginationErrorMessage=");
        AbstractC11266d.m30444B(sbM32002u, str2, ", paginationRetryActionText=", str3, ", loadMoreEpoch=");
        return AbstractC18489d0.m53371l(sbM32002u, i13, ")");
    }

    public /* synthetic */ C0860b(boolean z4, boolean z13, boolean z14, FilteredListResponse filteredListResponse, String str, AbstractC0862d abstractC0862d, ApiRequest apiRequest, AbstractC0863e abstractC0863e, String str2, String str3, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? true : z4, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : filteredListResponse, (i14 & 16) != 0 ? null : str, (i14 & 32) != 0 ? AbstractC0862d.c.f3151a : abstractC0862d, (i14 & 64) != 0 ? null : apiRequest, (i14 & 128) != 0 ? AbstractC0863e.b.f3153a : abstractC0863e, (i14 & 256) != 0 ? null : str2, (i14 & 512) != 0 ? null : str3, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i13);
    }
}
