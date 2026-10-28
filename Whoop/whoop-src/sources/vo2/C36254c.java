package vo2;

import com.whoop.universalcheckout.features.externalwebcheckout.domain.models.ExternalWebCheckoutResponse;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: vo2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, m65681d2 = {"Lvo2/c;", "", "Lvo2/a;", "currentDialogType", "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;", "response", "", "manualRefresh", "displayRefreshingSpinner", "", "cartId", "<init>", "(Lvo2/a;Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lvo2/a;", "b", "()Lvo2/a;", "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;", "c", "()Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;", "Z", "getManualRefresh", "()Z", "d", "getDisplayRefreshingSpinner", "e", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36254c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC36252a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ExternalWebCheckoutResponse response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String cartId;

    public C36254c(InterfaceC36252a interfaceC36252a, ExternalWebCheckoutResponse externalWebCheckoutResponse, boolean z4, boolean z13, String cartId) {
        AbstractC22676k.m65750j(cartId, "cartId");
        this.currentDialogType = interfaceC36252a;
        this.response = externalWebCheckoutResponse;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.cartId = cartId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC36252a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ExternalWebCheckoutResponse getResponse() {
        return this.response;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36254c)) {
            return false;
        }
        C36254c c36254c = (C36254c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c36254c.currentDialogType) && AbstractC22676k.m65745e(this.response, c36254c.response) && this.manualRefresh == c36254c.manualRefresh && this.displayRefreshingSpinner == c36254c.displayRefreshingSpinner && AbstractC22676k.m65745e(this.cartId, c36254c.cartId);
    }

    public int hashCode() {
        InterfaceC36252a interfaceC36252a = this.currentDialogType;
        int iHashCode = (interfaceC36252a == null ? 0 : interfaceC36252a.hashCode()) * 31;
        ExternalWebCheckoutResponse externalWebCheckoutResponse = this.response;
        return this.cartId.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (externalWebCheckoutResponse != null ? externalWebCheckoutResponse.hashCode() : 0)) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
    }

    public String toString() {
        InterfaceC36252a interfaceC36252a = this.currentDialogType;
        ExternalWebCheckoutResponse externalWebCheckoutResponse = this.response;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        String str = this.cartId;
        StringBuilder sb4 = new StringBuilder("ExternalWebCheckoutDomainState(currentDialogType=");
        sb4.append(interfaceC36252a);
        sb4.append(", response=");
        sb4.append(externalWebCheckoutResponse);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", cartId=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ C36254c(InterfaceC36252a interfaceC36252a, ExternalWebCheckoutResponse externalWebCheckoutResponse, boolean z4, boolean z13, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC36252a, (i13 & 2) != 0 ? null : externalWebCheckoutResponse, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? "" : str);
    }
}
