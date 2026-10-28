package v70;

import com.whoop.activation.feature.orderconfirmation.domain.models.OrderConfirmationResponse;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v70.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, m65681d2 = {"Lv70/d;", "", "Lv70/b;", "currentDialogType", "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;", "response", "", "manualRefresh", "displayRefreshingSpinner", "<init>", "(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZ)V", "a", "(Lv70/b;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;ZZ)Lv70/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lv70/b;", "c", "()Lv70/b;", "b", "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;", "e", "()Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;", "Z", "getManualRefresh", "()Z", "d", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35756d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC35754b currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final OrderConfirmationResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    public C35756d(InterfaceC35754b interfaceC35754b, OrderConfirmationResponse orderConfirmationResponse, boolean z4, boolean z13) {
        this.currentDialogType = interfaceC35754b;
        this.response = orderConfirmationResponse;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35756d m113285b(C35756d c35756d, InterfaceC35754b interfaceC35754b, OrderConfirmationResponse orderConfirmationResponse, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC35754b = c35756d.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            orderConfirmationResponse = c35756d.response;
        }
        if ((i13 & 4) != 0) {
            z4 = c35756d.manualRefresh;
        }
        if ((i13 & 8) != 0) {
            z13 = c35756d.displayRefreshingSpinner;
        }
        return c35756d.m113286a(interfaceC35754b, orderConfirmationResponse, z4, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C35756d m113286a(InterfaceC35754b currentDialogType, OrderConfirmationResponse response, boolean manualRefresh, boolean displayRefreshingSpinner) {
        return new C35756d(currentDialogType, response, manualRefresh, displayRefreshingSpinner);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC35754b getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OrderConfirmationResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35756d)) {
            return false;
        }
        C35756d c35756d = (C35756d) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c35756d.currentDialogType) && AbstractC22676k.m65745e(this.response, c35756d.response) && this.manualRefresh == c35756d.manualRefresh && this.displayRefreshingSpinner == c35756d.displayRefreshingSpinner;
    }

    public int hashCode() {
        InterfaceC35754b interfaceC35754b = this.currentDialogType;
        int iHashCode = (interfaceC35754b == null ? 0 : interfaceC35754b.hashCode()) * 31;
        OrderConfirmationResponse orderConfirmationResponse = this.response;
        return Boolean.hashCode(this.displayRefreshingSpinner) + AbstractC2875y.m8289b((iHashCode + (orderConfirmationResponse != null ? orderConfirmationResponse.hashCode() : 0)) * 31, 31, this.manualRefresh);
    }

    public String toString() {
        InterfaceC35754b interfaceC35754b = this.currentDialogType;
        OrderConfirmationResponse orderConfirmationResponse = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        StringBuilder sb4 = new StringBuilder("OrderConfirmationDomainState(currentDialogType=");
        sb4.append(interfaceC35754b);
        sb4.append(", response=");
        sb4.append(orderConfirmationResponse);
        sb4.append(", manualRefresh=");
        return AbstractC36095b.m114682j(sb4, z4, ", displayRefreshingSpinner=", z13, ")");
    }

    public /* synthetic */ C35756d(InterfaceC35754b interfaceC35754b, OrderConfirmationResponse orderConfirmationResponse, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC35754b, (i13 & 2) != 0 ? null : orderConfirmationResponse, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13);
    }
}
