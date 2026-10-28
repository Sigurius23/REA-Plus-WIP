package i82;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.searcharchmini.domain.model.SearchArchMiniResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: i82.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0094\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b$\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b*\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b/\u00101R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b \u00102\u001a\u0004\b,\u00103¨\u00064"}, m65681d2 = {"Li82/g;", "", "", "isLoading", "isError", "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "data", "", "initialPath", "currentQuery", "actionError", "itemActionInProgress", "inFlightFollowerRequestId", "followerItemActionProgressVisibleInUi", "Lcom/whoop/navigation/models/GenericInteraction;", "pendingInteraction", "", "Li82/b;", "followerRequestItemUiStages", "<init>", "(ZZLcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V", "a", "(ZZLcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)Li82/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "k", "()Z", "b", "j", "c", "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "d", "()Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "Ljava/lang/String;", "getInitialPath", "e", "getCurrentQuery", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Ljava/util/Map;", "()Ljava/util/Map;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18223g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SearchArchMiniResponse data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String initialPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String currentQuery;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String actionError;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean itemActionInProgress;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String inFlightFollowerRequestId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean followerItemActionProgressVisibleInUi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final GenericInteraction pendingInteraction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Map<String, C18218b> followerRequestItemUiStages;

    public C18223g(boolean z4, boolean z13, SearchArchMiniResponse searchArchMiniResponse, String str, String currentQuery, String str2, boolean z14, String str3, boolean z15, GenericInteraction genericInteraction, Map<String, C18218b> followerRequestItemUiStages) {
        AbstractC22676k.m65750j(currentQuery, "currentQuery");
        AbstractC22676k.m65750j(followerRequestItemUiStages, "followerRequestItemUiStages");
        this.isLoading = z4;
        this.isError = z13;
        this.data = searchArchMiniResponse;
        this.initialPath = str;
        this.currentQuery = currentQuery;
        this.actionError = str2;
        this.itemActionInProgress = z14;
        this.inFlightFollowerRequestId = str3;
        this.followerItemActionProgressVisibleInUi = z15;
        this.pendingInteraction = genericInteraction;
        this.followerRequestItemUiStages = followerRequestItemUiStages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C18223g m52436b(C18223g c18223g, boolean z4, boolean z13, SearchArchMiniResponse searchArchMiniResponse, String str, String str2, String str3, boolean z14, String str4, boolean z15, GenericInteraction genericInteraction, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c18223g.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c18223g.isError;
        }
        if ((i13 & 4) != 0) {
            searchArchMiniResponse = c18223g.data;
        }
        if ((i13 & 8) != 0) {
            str = c18223g.initialPath;
        }
        if ((i13 & 16) != 0) {
            str2 = c18223g.currentQuery;
        }
        if ((i13 & 32) != 0) {
            str3 = c18223g.actionError;
        }
        if ((i13 & 64) != 0) {
            z14 = c18223g.itemActionInProgress;
        }
        if ((i13 & 128) != 0) {
            str4 = c18223g.inFlightFollowerRequestId;
        }
        if ((i13 & 256) != 0) {
            z15 = c18223g.followerItemActionProgressVisibleInUi;
        }
        if ((i13 & 512) != 0) {
            genericInteraction = c18223g.pendingInteraction;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = c18223g.followerRequestItemUiStages;
        }
        GenericInteraction genericInteraction2 = genericInteraction;
        Map map2 = map;
        String str5 = str4;
        boolean z16 = z15;
        String str6 = str3;
        boolean z17 = z14;
        String str7 = str2;
        SearchArchMiniResponse searchArchMiniResponse2 = searchArchMiniResponse;
        return c18223g.m52437a(z4, z13, searchArchMiniResponse2, str, str7, str6, z17, str5, z16, genericInteraction2, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C18223g m52437a(boolean isLoading, boolean isError, SearchArchMiniResponse data, String initialPath, String currentQuery, String actionError, boolean itemActionInProgress, String inFlightFollowerRequestId, boolean followerItemActionProgressVisibleInUi, GenericInteraction pendingInteraction, Map<String, C18218b> followerRequestItemUiStages) {
        AbstractC22676k.m65750j(currentQuery, "currentQuery");
        AbstractC22676k.m65750j(followerRequestItemUiStages, "followerRequestItemUiStages");
        return new C18223g(isLoading, isError, data, initialPath, currentQuery, actionError, itemActionInProgress, inFlightFollowerRequestId, followerItemActionProgressVisibleInUi, pendingInteraction, followerRequestItemUiStages);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActionError() {
        return this.actionError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SearchArchMiniResponse getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getFollowerItemActionProgressVisibleInUi() {
        return this.followerItemActionProgressVisibleInUi;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18223g)) {
            return false;
        }
        C18223g c18223g = (C18223g) other;
        return this.isLoading == c18223g.isLoading && this.isError == c18223g.isError && AbstractC22676k.m65745e(this.data, c18223g.data) && AbstractC22676k.m65745e(this.initialPath, c18223g.initialPath) && AbstractC22676k.m65745e(this.currentQuery, c18223g.currentQuery) && AbstractC22676k.m65745e(this.actionError, c18223g.actionError) && this.itemActionInProgress == c18223g.itemActionInProgress && AbstractC22676k.m65745e(this.inFlightFollowerRequestId, c18223g.inFlightFollowerRequestId) && this.followerItemActionProgressVisibleInUi == c18223g.followerItemActionProgressVisibleInUi && AbstractC22676k.m65745e(this.pendingInteraction, c18223g.pendingInteraction) && AbstractC22676k.m65745e(this.followerRequestItemUiStages, c18223g.followerRequestItemUiStages);
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, C18218b> m52441f() {
        return this.followerRequestItemUiStages;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getInFlightFollowerRequestId() {
        return this.inFlightFollowerRequestId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getItemActionInProgress() {
        return this.itemActionInProgress;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        SearchArchMiniResponse searchArchMiniResponse = this.data;
        int iHashCode = (iM8289b + (searchArchMiniResponse == null ? 0 : searchArchMiniResponse.hashCode())) * 31;
        String str = this.initialPath;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.currentQuery);
        String str2 = this.actionError;
        int iM8289b2 = AbstractC2875y.m8289b((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.itemActionInProgress);
        String str3 = this.inFlightFollowerRequestId;
        int iM8289b3 = AbstractC2875y.m8289b((iM8289b2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.followerItemActionProgressVisibleInUi);
        GenericInteraction genericInteraction = this.pendingInteraction;
        return this.followerRequestItemUiStages.hashCode() + ((iM8289b3 + (genericInteraction != null ? genericInteraction.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final GenericInteraction getPendingInteraction() {
        return this.pendingInteraction;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        SearchArchMiniResponse searchArchMiniResponse = this.data;
        String str = this.initialPath;
        String str2 = this.currentQuery;
        String str3 = this.actionError;
        boolean z14 = this.itemActionInProgress;
        String str4 = this.inFlightFollowerRequestId;
        boolean z15 = this.followerItemActionProgressVisibleInUi;
        GenericInteraction genericInteraction = this.pendingInteraction;
        Map<String, C18218b> map = this.followerRequestItemUiStages;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("SearchArchMiniDomainState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(searchArchMiniResponse);
        sbM32002u.append(", initialPath=");
        sbM32002u.append(str);
        sbM32002u.append(", currentQuery=");
        AbstractC11266d.m30444B(sbM32002u, str2, ", actionError=", str3, ", itemActionInProgress=");
        AbstractC38963t7.m124391u(sbM32002u, z14, ", inFlightFollowerRequestId=", str4, ", followerItemActionProgressVisibleInUi=");
        sbM32002u.append(z15);
        sbM32002u.append(", pendingInteraction=");
        sbM32002u.append(genericInteraction);
        sbM32002u.append(", followerRequestItemUiStages=");
        return AbstractC13673n.m38565l(sbM32002u, map, ")");
    }

    public /* synthetic */ C18223g(boolean z4, boolean z13, SearchArchMiniResponse searchArchMiniResponse, String str, String str2, String str3, boolean z14, String str4, boolean z15, GenericInteraction genericInteraction, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : searchArchMiniResponse, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? "" : str2, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? false : z15, (i13 & 512) != 0 ? null : genericInteraction, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25272z.f99163w : map);
    }
}
