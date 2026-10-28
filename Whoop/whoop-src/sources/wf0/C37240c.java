package wf0;

import com.whoop.advancedlabsjoin.feature.purchaseaddons.domain.models.PurchaseAddOnsModels;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wf0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJP\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b!\u0010%¨\u0006&"}, m65681d2 = {"Lwf0/c;", "", "Lwf0/a;", "currentDialogType", "Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;", "response", "", "selectedSegmentId", "source", "", "manualRefresh", "displayRefreshingSpinner", "<init>", "(Lwf0/a;Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;Ljava/lang/String;Ljava/lang/String;ZZ)V", "a", "(Lwf0/a;Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;Ljava/lang/String;Ljava/lang/String;ZZ)Lwf0/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lwf0/a;", "c", "()Lwf0/a;", "b", "Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;", "f", "()Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;", "Ljava/lang/String;", "g", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "Z", "()Z", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37240c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC37238a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PurchaseAddOnsModels response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String selectedSegmentId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    public C37240c(InterfaceC37238a interfaceC37238a, PurchaseAddOnsModels purchaseAddOnsModels, String selectedSegmentId, String source, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
        AbstractC22676k.m65750j(source, "source");
        this.currentDialogType = interfaceC37238a;
        this.response = purchaseAddOnsModels;
        this.selectedSegmentId = selectedSegmentId;
        this.source = source;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C37240c m119340b(C37240c c37240c, InterfaceC37238a interfaceC37238a, PurchaseAddOnsModels purchaseAddOnsModels, String str, String str2, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC37238a = c37240c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            purchaseAddOnsModels = c37240c.response;
        }
        if ((i13 & 4) != 0) {
            str = c37240c.selectedSegmentId;
        }
        if ((i13 & 8) != 0) {
            str2 = c37240c.source;
        }
        if ((i13 & 16) != 0) {
            z4 = c37240c.manualRefresh;
        }
        if ((i13 & 32) != 0) {
            z13 = c37240c.displayRefreshingSpinner;
        }
        boolean z14 = z4;
        boolean z15 = z13;
        return c37240c.m119341a(interfaceC37238a, purchaseAddOnsModels, str, str2, z14, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C37240c m119341a(InterfaceC37238a currentDialogType, PurchaseAddOnsModels response, String selectedSegmentId, String source, boolean manualRefresh, boolean displayRefreshingSpinner) {
        AbstractC22676k.m65750j(selectedSegmentId, "selectedSegmentId");
        AbstractC22676k.m65750j(source, "source");
        return new C37240c(currentDialogType, response, selectedSegmentId, source, manualRefresh, displayRefreshingSpinner);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC37238a getCurrentDialogType() {
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
        if (!(other instanceof C37240c)) {
            return false;
        }
        C37240c c37240c = (C37240c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c37240c.currentDialogType) && AbstractC22676k.m65745e(this.response, c37240c.response) && AbstractC22676k.m65745e(this.selectedSegmentId, c37240c.selectedSegmentId) && AbstractC22676k.m65745e(this.source, c37240c.source) && this.manualRefresh == c37240c.manualRefresh && this.displayRefreshingSpinner == c37240c.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final PurchaseAddOnsModels getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSelectedSegmentId() {
        return this.selectedSegmentId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        InterfaceC37238a interfaceC37238a = this.currentDialogType;
        int iHashCode = (interfaceC37238a == null ? 0 : interfaceC37238a.hashCode()) * 31;
        PurchaseAddOnsModels purchaseAddOnsModels = this.response;
        return Boolean.hashCode(this.displayRefreshingSpinner) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (purchaseAddOnsModels != null ? purchaseAddOnsModels.hashCode() : 0)) * 31, 31, this.selectedSegmentId), 31, this.source), 31, this.manualRefresh);
    }

    public String toString() {
        InterfaceC37238a interfaceC37238a = this.currentDialogType;
        PurchaseAddOnsModels purchaseAddOnsModels = this.response;
        String str = this.selectedSegmentId;
        String str2 = this.source;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        StringBuilder sb4 = new StringBuilder("PurchaseAddOnsDomainState(currentDialogType=");
        sb4.append(interfaceC37238a);
        sb4.append(", response=");
        sb4.append(purchaseAddOnsModels);
        sb4.append(", selectedSegmentId=");
        AbstractC11266d.m30444B(sb4, str, ", source=", str2, ", manualRefresh=");
        return AbstractC36095b.m114682j(sb4, z4, ", displayRefreshingSpinner=", z13, ")");
    }

    public /* synthetic */ C37240c(InterfaceC37238a interfaceC37238a, PurchaseAddOnsModels purchaseAddOnsModels, String str, String str2, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC37238a, (i13 & 2) != 0 ? null : purchaseAddOnsModels, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? false : z13);
    }
}
