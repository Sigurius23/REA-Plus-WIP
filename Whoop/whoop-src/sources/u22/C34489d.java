package u22;

import androidx.core.app.NotificationCompat;
import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementModels;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import x22.InterfaceC37862a;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: u22.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b \u0010#¨\u0006("}, m65681d2 = {"Lu22/d;", "", "Lu22/b;", "currentDialogType", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;", "response", "", "manualRefresh", "displayRefreshingSpinner", "Lx22/a;", NotificationCompat.CATEGORY_EVENT, "autoPopPaymentSheet", "<init>", "(Lu22/b;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;ZZLx22/a;Z)V", "a", "(Lu22/b;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;ZZLx22/a;Z)Lu22/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lu22/b;", "d", "()Lu22/b;", "b", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;", "c", "Z", "g", "()Z", "e", "Lx22/a;", "f", "()Lx22/a;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34489d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34487b currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final PaymentMethodManagementModels response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC37862a event;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean autoPopPaymentSheet;

    public C34489d(InterfaceC34487b interfaceC34487b, PaymentMethodManagementModels paymentMethodManagementModels, boolean z4, boolean z13, InterfaceC37862a interfaceC37862a, boolean z14) {
        this.currentDialogType = interfaceC34487b;
        this.response = paymentMethodManagementModels;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.event = interfaceC37862a;
        this.autoPopPaymentSheet = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C34489d m108998b(C34489d c34489d, InterfaceC34487b interfaceC34487b, PaymentMethodManagementModels paymentMethodManagementModels, boolean z4, boolean z13, InterfaceC37862a interfaceC37862a, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC34487b = c34489d.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            paymentMethodManagementModels = c34489d.response;
        }
        if ((i13 & 4) != 0) {
            z4 = c34489d.manualRefresh;
        }
        if ((i13 & 8) != 0) {
            z13 = c34489d.displayRefreshingSpinner;
        }
        if ((i13 & 16) != 0) {
            interfaceC37862a = c34489d.event;
        }
        if ((i13 & 32) != 0) {
            z14 = c34489d.autoPopPaymentSheet;
        }
        InterfaceC37862a interfaceC37862a2 = interfaceC37862a;
        boolean z15 = z14;
        return c34489d.m108999a(interfaceC34487b, paymentMethodManagementModels, z4, z13, interfaceC37862a2, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C34489d m108999a(InterfaceC34487b currentDialogType, PaymentMethodManagementModels response, boolean manualRefresh, boolean displayRefreshingSpinner, InterfaceC37862a event, boolean autoPopPaymentSheet) {
        return new C34489d(currentDialogType, response, manualRefresh, displayRefreshingSpinner, event, autoPopPaymentSheet);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAutoPopPaymentSheet() {
        return this.autoPopPaymentSheet;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC34487b getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34489d)) {
            return false;
        }
        C34489d c34489d = (C34489d) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c34489d.currentDialogType) && AbstractC22676k.m65745e(this.response, c34489d.response) && this.manualRefresh == c34489d.manualRefresh && this.displayRefreshingSpinner == c34489d.displayRefreshingSpinner && AbstractC22676k.m65745e(this.event, c34489d.event) && this.autoPopPaymentSheet == c34489d.autoPopPaymentSheet;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC37862a getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final PaymentMethodManagementModels getResponse() {
        return this.response;
    }

    public int hashCode() {
        InterfaceC34487b interfaceC34487b = this.currentDialogType;
        int iHashCode = (interfaceC34487b == null ? 0 : interfaceC34487b.hashCode()) * 31;
        PaymentMethodManagementModels paymentMethodManagementModels = this.response;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (paymentMethodManagementModels == null ? 0 : paymentMethodManagementModels.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
        InterfaceC37862a interfaceC37862a = this.event;
        return Boolean.hashCode(this.autoPopPaymentSheet) + ((iM8289b + (interfaceC37862a != null ? interfaceC37862a.hashCode() : 0)) * 31);
    }

    public String toString() {
        InterfaceC34487b interfaceC34487b = this.currentDialogType;
        PaymentMethodManagementModels paymentMethodManagementModels = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        InterfaceC37862a interfaceC37862a = this.event;
        boolean z14 = this.autoPopPaymentSheet;
        StringBuilder sb4 = new StringBuilder("PaymentMethodManagementDomainState(currentDialogType=");
        sb4.append(interfaceC34487b);
        sb4.append(", response=");
        sb4.append(paymentMethodManagementModels);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", event=");
        sb4.append(interfaceC37862a);
        sb4.append(", autoPopPaymentSheet=");
        sb4.append(z14);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C34489d(InterfaceC34487b interfaceC34487b, PaymentMethodManagementModels paymentMethodManagementModels, boolean z4, boolean z13, InterfaceC37862a interfaceC37862a, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC34487b, (i13 & 2) != 0 ? null : paymentMethodManagementModels, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? null : interfaceC37862a, (i13 & 32) != 0 ? false : z14);
    }
}
