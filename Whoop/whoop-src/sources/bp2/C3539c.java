package bp2;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.universalcheckout.features.receipt.domain.models.ReceiptOrderResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: bp2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Jf\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b*\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b'\u0010,¨\u0006-"}, m65681d2 = {"Lbp2/c;", "", "Lbp2/a;", "currentDialogType", "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;", "response", "", "manualRefresh", "displayRefreshingSpinner", "", "cartId", "orderDetailsIsExpanded", "source", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Lbp2/a;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;ZZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/models/modal/AnyModal;)V", "a", "(Lbp2/a;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;ZZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/models/modal/AnyModal;)Lbp2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lbp2/a;", "d", "()Lbp2/a;", "b", "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;", "g", "()Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;", "c", "Z", "getManualRefresh", "()Z", "getDisplayRefreshingSpinner", "e", "Ljava/lang/String;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/design/models/modal/AnyModal;", "()Lcom/whoop/design/models/modal/AnyModal;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3539c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC3537a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ReceiptOrderResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean orderDetailsIsExpanded;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AnyModal modal;

    public C3539c(InterfaceC3537a interfaceC3537a, ReceiptOrderResponse receiptOrderResponse, boolean z4, boolean z13, String cartId, boolean z14, String source, AnyModal anyModal) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(source, "source");
        this.currentDialogType = interfaceC3537a;
        this.response = receiptOrderResponse;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.cartId = cartId;
        this.orderDetailsIsExpanded = z14;
        this.source = source;
        this.modal = anyModal;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C3539c m10553b(C3539c c3539c, InterfaceC3537a interfaceC3537a, ReceiptOrderResponse receiptOrderResponse, boolean z4, boolean z13, String str, boolean z14, String str2, AnyModal anyModal, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC3537a = c3539c.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            receiptOrderResponse = c3539c.response;
        }
        if ((i13 & 4) != 0) {
            z4 = c3539c.manualRefresh;
        }
        if ((i13 & 8) != 0) {
            z13 = c3539c.displayRefreshingSpinner;
        }
        if ((i13 & 16) != 0) {
            str = c3539c.cartId;
        }
        if ((i13 & 32) != 0) {
            z14 = c3539c.orderDetailsIsExpanded;
        }
        if ((i13 & 64) != 0) {
            str2 = c3539c.source;
        }
        if ((i13 & 128) != 0) {
            anyModal = c3539c.modal;
        }
        String str3 = str2;
        AnyModal anyModal2 = anyModal;
        String str4 = str;
        boolean z15 = z14;
        return c3539c.m10554a(interfaceC3537a, receiptOrderResponse, z4, z13, str4, z15, str3, anyModal2);
    }

    /* JADX INFO: renamed from: a */
    public final C3539c m10554a(InterfaceC3537a currentDialogType, ReceiptOrderResponse response, boolean manualRefresh, boolean displayRefreshingSpinner, String cartId, boolean orderDetailsIsExpanded, String source, AnyModal modal) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(source, "source");
        return new C3539c(currentDialogType, response, manualRefresh, displayRefreshingSpinner, cartId, orderDetailsIsExpanded, source, modal);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC3537a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3539c)) {
            return false;
        }
        C3539c c3539c = (C3539c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c3539c.currentDialogType) && AbstractC22676k.m65745e(this.response, c3539c.response) && this.manualRefresh == c3539c.manualRefresh && this.displayRefreshingSpinner == c3539c.displayRefreshingSpinner && AbstractC22676k.m65745e(this.cartId, c3539c.cartId) && this.orderDetailsIsExpanded == c3539c.orderDetailsIsExpanded && AbstractC22676k.m65745e(this.source, c3539c.source) && AbstractC22676k.m65745e(this.modal, c3539c.modal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getOrderDetailsIsExpanded() {
        return this.orderDetailsIsExpanded;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ReceiptOrderResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        InterfaceC3537a interfaceC3537a = this.currentDialogType;
        int iHashCode = (interfaceC3537a == null ? 0 : interfaceC3537a.hashCode()) * 31;
        ReceiptOrderResponse receiptOrderResponse = this.response;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (receiptOrderResponse == null ? 0 : receiptOrderResponse.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner), 31, this.cartId), 31, this.orderDetailsIsExpanded), 31, this.source);
        AnyModal anyModal = this.modal;
        return iM30450d + (anyModal != null ? anyModal.hashCode() : 0);
    }

    public String toString() {
        InterfaceC3537a interfaceC3537a = this.currentDialogType;
        ReceiptOrderResponse receiptOrderResponse = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        String str = this.cartId;
        boolean z14 = this.orderDetailsIsExpanded;
        String str2 = this.source;
        AnyModal anyModal = this.modal;
        StringBuilder sb4 = new StringBuilder("ReceiptDomainState(currentDialogType=");
        sb4.append(interfaceC3537a);
        sb4.append(", response=");
        sb4.append(receiptOrderResponse);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", cartId=");
        AbstractC38963t7.m124390t(sb4, str, ", orderDetailsIsExpanded=", z14, ", source=");
        sb4.append(str2);
        sb4.append(", modal=");
        sb4.append(anyModal);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C3539c(InterfaceC3537a interfaceC3537a, ReceiptOrderResponse receiptOrderResponse, boolean z4, boolean z13, String str, boolean z14, String str2, AnyModal anyModal, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC3537a, (i13 & 2) != 0 ? null : receiptOrderResponse, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? false : z14, (i13 & 64) != 0 ? "" : str2, (i13 & 128) != 0 ? null : anyModal);
    }
}
