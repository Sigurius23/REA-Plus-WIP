package sb0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsResponse;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sb0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b \u0010#¨\u0006$"}, m65681d2 = {"Lsb0/c;", "", "", "selectedSegmentId", "Lsb0/a;", "currentDialogType", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;", "response", "", "manualRefresh", "displayRefreshingSpinner", "<init>", "(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZ)V", "a", "(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZ)Lsb0/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Lsb0/a;", "c", "()Lsb0/a;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;", "e", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;", "d", "Z", "getManualRefresh", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32342c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String selectedSegmentId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC32340a currentDialogType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AdvancedLabsResponse response;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    public C32342c(String str, InterfaceC32340a interfaceC32340a, AdvancedLabsResponse advancedLabsResponse, boolean z4, boolean z13) {
        this.selectedSegmentId = str;
        this.currentDialogType = interfaceC32340a;
        this.response = advancedLabsResponse;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32342c m100643b(C32342c c32342c, String str, InterfaceC32340a interfaceC32340a, AdvancedLabsResponse advancedLabsResponse, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c32342c.selectedSegmentId;
        }
        if ((i13 & 2) != 0) {
            interfaceC32340a = c32342c.currentDialogType;
        }
        if ((i13 & 4) != 0) {
            advancedLabsResponse = c32342c.response;
        }
        if ((i13 & 8) != 0) {
            z4 = c32342c.manualRefresh;
        }
        if ((i13 & 16) != 0) {
            z13 = c32342c.displayRefreshingSpinner;
        }
        boolean z14 = z13;
        AdvancedLabsResponse advancedLabsResponse2 = advancedLabsResponse;
        return c32342c.m100644a(str, interfaceC32340a, advancedLabsResponse2, z4, z14);
    }

    /* JADX INFO: renamed from: a */
    public final C32342c m100644a(String selectedSegmentId, InterfaceC32340a currentDialogType, AdvancedLabsResponse response, boolean manualRefresh, boolean displayRefreshingSpinner) {
        return new C32342c(selectedSegmentId, currentDialogType, response, manualRefresh, displayRefreshingSpinner);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC32340a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AdvancedLabsResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32342c)) {
            return false;
        }
        C32342c c32342c = (C32342c) other;
        return AbstractC22676k.m65745e(this.selectedSegmentId, c32342c.selectedSegmentId) && AbstractC22676k.m65745e(this.currentDialogType, c32342c.currentDialogType) && AbstractC22676k.m65745e(this.response, c32342c.response) && this.manualRefresh == c32342c.manualRefresh && this.displayRefreshingSpinner == c32342c.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectedSegmentId() {
        return this.selectedSegmentId;
    }

    public int hashCode() {
        String str = this.selectedSegmentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InterfaceC32340a interfaceC32340a = this.currentDialogType;
        int iHashCode2 = (iHashCode + (interfaceC32340a == null ? 0 : interfaceC32340a.hashCode())) * 31;
        AdvancedLabsResponse advancedLabsResponse = this.response;
        return Boolean.hashCode(this.displayRefreshingSpinner) + AbstractC2875y.m8289b((iHashCode2 + (advancedLabsResponse != null ? advancedLabsResponse.hashCode() : 0)) * 31, 31, this.manualRefresh);
    }

    public String toString() {
        String str = this.selectedSegmentId;
        InterfaceC32340a interfaceC32340a = this.currentDialogType;
        AdvancedLabsResponse advancedLabsResponse = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        StringBuilder sb4 = new StringBuilder("AdvancedLabsDomainState(selectedSegmentId=");
        sb4.append(str);
        sb4.append(", currentDialogType=");
        sb4.append(interfaceC32340a);
        sb4.append(", response=");
        sb4.append(advancedLabsResponse);
        sb4.append(", manualRefresh=");
        sb4.append(z4);
        sb4.append(", displayRefreshingSpinner=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ C32342c(String str, InterfaceC32340a interfaceC32340a, AdvancedLabsResponse advancedLabsResponse, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : interfaceC32340a, (i13 & 4) != 0 ? null : advancedLabsResponse, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? false : z13);
    }
}
