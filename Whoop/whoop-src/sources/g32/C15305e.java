package g32;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g32.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Lg32/e;", "", "", "merchantDisplayName", "Lg32/c;", "customer", "Lg32/b;", "defaultBillingDetails", "Lg32/d;", "googlePay", "ctaText", "<init>", "(Ljava/lang/String;Lg32/c;Lg32/b;Lg32/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lg32/c;", "()Lg32/c;", "c", "Lg32/b;", "()Lg32/b;", "d", "Lg32/d;", "()Lg32/d;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15305e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String merchantDisplayName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C15303c customer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C15302b defaultBillingDetails;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String ctaText;

    public C15305e(String merchantDisplayName, C15303c c15303c, C15302b c15302b, AbstractC15304d abstractC15304d, String ctaText) {
        AbstractC22676k.m65750j(merchantDisplayName, "merchantDisplayName");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        this.merchantDisplayName = merchantDisplayName;
        this.customer = c15303c;
        this.defaultBillingDetails = c15302b;
        this.ctaText = ctaText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C15303c getCustomer() {
        return this.customer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C15302b getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC15304d m43444d() {
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMerchantDisplayName() {
        return this.merchantDisplayName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15305e)) {
            return false;
        }
        C15305e c15305e = (C15305e) other;
        return AbstractC22676k.m65745e(this.merchantDisplayName, c15305e.merchantDisplayName) && AbstractC22676k.m65745e(this.customer, c15305e.customer) && AbstractC22676k.m65745e(this.defaultBillingDetails, c15305e.defaultBillingDetails) && AbstractC22676k.m65745e(this.ctaText, c15305e.ctaText);
    }

    public int hashCode() {
        int iHashCode = this.merchantDisplayName.hashCode() * 31;
        C15303c c15303c = this.customer;
        int iHashCode2 = (iHashCode + (c15303c == null ? 0 : c15303c.hashCode())) * 31;
        C15302b c15302b = this.defaultBillingDetails;
        return this.ctaText.hashCode() + ((iHashCode2 + (c15302b != null ? c15302b.hashCode() : 0)) * 961);
    }

    public String toString() {
        return "PaymentSheetConfiguration(merchantDisplayName=" + this.merchantDisplayName + ", customer=" + this.customer + ", defaultBillingDetails=" + this.defaultBillingDetails + ", googlePay=null, ctaText=" + this.ctaText + ")";
    }
}
