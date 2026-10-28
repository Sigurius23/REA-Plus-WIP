package n31;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: n31.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b-\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b#\u0010/R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b)\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b$\u00102\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u0011\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b4\u0010\u0018R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b%\u00107¨\u00068"}, m65681d2 = {"Ln31/e;", "", "", "isLoading", "isError", "Lcom/whoop/design/util/TextResource;", "searchPlaceHolderText", "", "searchDebounceMs", "loadingHintText", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "", "Lm91/o;", "items", "", "actionError", "isPerformActionLoading", "inFlightFollowerRequestId", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(ZZLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "i", "()Z", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "d", "J", "f", "()J", "e", "Lcom/whoop/analytics/AnalyticEventModel;", "()Lcom/whoop/analytics/AnalyticEventModel;", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "j", "getInFlightFollowerRequestId", "k", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26220e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource searchPlaceHolderText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long searchDebounceMs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource loadingHintText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AnalyticEventModel analyticEvent;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C25306o> items;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String actionError;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isPerformActionLoading;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String inFlightFollowerRequestId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    public C26220e(boolean z4, boolean z13, TextResource searchPlaceHolderText, long j7, TextResource textResource, AnalyticEventModel analyticEventModel, List<C25306o> items, String str, boolean z14, String str2, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(searchPlaceHolderText, "searchPlaceHolderText");
        AbstractC22676k.m65750j(items, "items");
        this.isLoading = z4;
        this.isError = z13;
        this.searchPlaceHolderText = searchPlaceHolderText;
        this.searchDebounceMs = j7;
        this.loadingHintText = textResource;
        this.analyticEvent = analyticEventModel;
        this.items = items;
        this.actionError = str;
        this.isPerformActionLoading = z14;
        this.inFlightFollowerRequestId = str2;
        this.interaction = genericInteraction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActionError() {
        return this.actionError;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: d */
    public final List<C25306o> m77865d() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getLoadingHintText() {
        return this.loadingHintText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26220e)) {
            return false;
        }
        C26220e c26220e = (C26220e) other;
        return this.isLoading == c26220e.isLoading && this.isError == c26220e.isError && AbstractC22676k.m65745e(this.searchPlaceHolderText, c26220e.searchPlaceHolderText) && this.searchDebounceMs == c26220e.searchDebounceMs && AbstractC22676k.m65745e(this.loadingHintText, c26220e.loadingHintText) && AbstractC22676k.m65745e(this.analyticEvent, c26220e.analyticEvent) && AbstractC22676k.m65745e(this.items, c26220e.items) && AbstractC22676k.m65745e(this.actionError, c26220e.actionError) && this.isPerformActionLoading == c26220e.isPerformActionLoading && AbstractC22676k.m65745e(this.inFlightFollowerRequestId, c26220e.inFlightFollowerRequestId) && AbstractC22676k.m65745e(this.interaction, c26220e.interaction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getSearchDebounceMs() {
        return this.searchDebounceMs;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getSearchPlaceHolderText() {
        return this.searchPlaceHolderText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(AbstractC31061c.m95625a(AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), this.searchPlaceHolderText, 31), this.searchDebounceMs, 31);
        TextResource textResource = this.loadingHintText;
        int iHashCode = (iM30451e + (textResource == null ? 0 : textResource.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31, 31, this.items);
        String str = this.actionError;
        int iM8289b = AbstractC2875y.m8289b((iM31983b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isPerformActionLoading);
        String str2 = this.inFlightFollowerRequestId;
        int iHashCode2 = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode2 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        TextResource textResource = this.searchPlaceHolderText;
        long j7 = this.searchDebounceMs;
        TextResource textResource2 = this.loadingHintText;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        List<C25306o> list = this.items;
        String str = this.actionError;
        boolean z14 = this.isPerformActionLoading;
        String str2 = this.inFlightFollowerRequestId;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("SearchArchMiniViewState(isLoading=", ", isError=", ", searchPlaceHolderText=", z4, z13);
        sbM32002u.append(textResource);
        sbM32002u.append(", searchDebounceMs=");
        sbM32002u.append(j7);
        sbM32002u.append(", loadingHintText=");
        sbM32002u.append(textResource2);
        sbM32002u.append(", analyticEvent=");
        sbM32002u.append(analyticEventModel);
        sbM32002u.append(", items=");
        sbM32002u.append(list);
        sbM32002u.append(", actionError=");
        sbM32002u.append(str);
        sbM32002u.append(", isPerformActionLoading=");
        sbM32002u.append(z14);
        sbM32002u.append(", inFlightFollowerRequestId=");
        sbM32002u.append(str2);
        sbM32002u.append(", interaction=");
        sbM32002u.append(genericInteraction);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C26220e(boolean z4, boolean z13, TextResource textResource, long j7, TextResource textResource2, AnalyticEventModel analyticEventModel, List list, String str, boolean z14, String str2, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? 300L : j7, (i13 & 16) != 0 ? null : textResource2, (i13 & 32) != 0 ? null : analyticEventModel, (i13 & 64) != 0 ? C25271y.f99162w : list, (i13 & 128) != 0 ? null : str, (i13 & 256) == 0 ? z14 : false, (i13 & 512) != 0 ? null : str2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : genericInteraction);
    }
}
