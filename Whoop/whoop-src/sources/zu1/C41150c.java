package zu1;

import com.whoop.limitedtimeoffer.domain.models.LimitedTimeOfferModels;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zu1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJZ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b$\u0010'R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b \u0010'¨\u0006("}, m65681d2 = {"Lzu1/c;", "", "", "source", "offerId", "Lzu1/a;", "currentDialogType", "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;", "response", "selectedCardId", "", "manualRefresh", "displayRefreshingSpinner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzu1/a;Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Ljava/lang/String;ZZ)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lzu1/a;Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Ljava/lang/String;ZZ)Lzu1/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "f", "c", "Lzu1/a;", "()Lzu1/a;", "d", "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;", "g", "()Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "()Z", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41150c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String offerId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41148a currentDialogType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LimitedTimeOfferModels response;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String selectedCardId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    public C41150c(String source, String offerId, InterfaceC41148a interfaceC41148a, LimitedTimeOfferModels limitedTimeOfferModels, String selectedCardId, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(offerId, "offerId");
        AbstractC22676k.m65750j(selectedCardId, "selectedCardId");
        this.source = source;
        this.offerId = offerId;
        this.currentDialogType = interfaceC41148a;
        this.response = limitedTimeOfferModels;
        this.selectedCardId = selectedCardId;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C41150c m133662b(C41150c c41150c, String str, String str2, InterfaceC41148a interfaceC41148a, LimitedTimeOfferModels limitedTimeOfferModels, String str3, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c41150c.source;
        }
        if ((i13 & 2) != 0) {
            str2 = c41150c.offerId;
        }
        if ((i13 & 4) != 0) {
            interfaceC41148a = c41150c.currentDialogType;
        }
        if ((i13 & 8) != 0) {
            limitedTimeOfferModels = c41150c.response;
        }
        if ((i13 & 16) != 0) {
            str3 = c41150c.selectedCardId;
        }
        if ((i13 & 32) != 0) {
            z4 = c41150c.manualRefresh;
        }
        if ((i13 & 64) != 0) {
            z13 = c41150c.displayRefreshingSpinner;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        String str4 = str3;
        InterfaceC41148a interfaceC41148a2 = interfaceC41148a;
        return c41150c.m133663a(str, str2, interfaceC41148a2, limitedTimeOfferModels, str4, z14, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C41150c m133663a(String source, String offerId, InterfaceC41148a currentDialogType, LimitedTimeOfferModels response, String selectedCardId, boolean manualRefresh, boolean displayRefreshingSpinner) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(offerId, "offerId");
        AbstractC22676k.m65750j(selectedCardId, "selectedCardId");
        return new C41150c(source, offerId, currentDialogType, response, selectedCardId, manualRefresh, displayRefreshingSpinner);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC41148a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41150c)) {
            return false;
        }
        C41150c c41150c = (C41150c) other;
        return AbstractC22676k.m65745e(this.source, c41150c.source) && AbstractC22676k.m65745e(this.offerId, c41150c.offerId) && AbstractC22676k.m65745e(this.currentDialogType, c41150c.currentDialogType) && AbstractC22676k.m65745e(this.response, c41150c.response) && AbstractC22676k.m65745e(this.selectedCardId, c41150c.selectedCardId) && this.manualRefresh == c41150c.manualRefresh && this.displayRefreshingSpinner == c41150c.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LimitedTimeOfferModels getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSelectedCardId() {
        return this.selectedCardId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.source.hashCode() * 31, 31, this.offerId);
        InterfaceC41148a interfaceC41148a = this.currentDialogType;
        int iHashCode = (iM30450d + (interfaceC41148a == null ? 0 : interfaceC41148a.hashCode())) * 31;
        LimitedTimeOfferModels limitedTimeOfferModels = this.response;
        return Boolean.hashCode(this.displayRefreshingSpinner) + AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode + (limitedTimeOfferModels != null ? limitedTimeOfferModels.hashCode() : 0)) * 31, 31, this.selectedCardId), 31, this.manualRefresh);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public String toString() {
        String str = this.source;
        String str2 = this.offerId;
        InterfaceC41148a interfaceC41148a = this.currentDialogType;
        LimitedTimeOfferModels limitedTimeOfferModels = this.response;
        String str3 = this.selectedCardId;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LimitedTimeOfferDomainState(source=", str, ", offerId=", str2, ", currentDialogType=");
        sbM32001t.append(interfaceC41148a);
        sbM32001t.append(", response=");
        sbM32001t.append(limitedTimeOfferModels);
        sbM32001t.append(", selectedCardId=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", manualRefresh=", z4, ", displayRefreshingSpinner=");
        return AbstractC18489d0.m53372m(sbM32001t, z13, ")");
    }

    public /* synthetic */ C41150c(String str, String str2, InterfaceC41148a interfaceC41148a, LimitedTimeOfferModels limitedTimeOfferModels, String str3, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : interfaceC41148a, (i13 & 8) != 0 ? null : limitedTimeOfferModels, (i13 & 16) != 0 ? "" : str3, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? false : z13);
    }
}
