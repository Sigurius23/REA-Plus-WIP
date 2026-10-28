package sn2;

import com.whoop.navigation.C9598e;
import com.whoop.universalcheckout.features.buynow.domain.models.BuyNowSection;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sn2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001a\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b!\u0010\u000f¨\u0006$"}, m65681d2 = {"Lsn2/i;", "", "", "title", "", "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;", "sections", "checkoutFooter", "analyticsSubtotalValue", "Lcom/whoop/navigation/e;", "checkoutDestination", "paymentMethodId", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;", "()Lcom/whoop/universalcheckout/features/buynow/domain/models/BuyNowSection;", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32783i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<BuyNowSection> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final BuyNowSection checkoutFooter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String analyticsSubtotalValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e checkoutDestination;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String paymentMethodId;

    public C32783i(String title, List<BuyNowSection> sections, BuyNowSection checkoutFooter, String analyticsSubtotalValue, C9598e checkoutDestination, String paymentMethodId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(checkoutFooter, "checkoutFooter");
        AbstractC22676k.m65750j(analyticsSubtotalValue, "analyticsSubtotalValue");
        AbstractC22676k.m65750j(checkoutDestination, "checkoutDestination");
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        this.title = title;
        this.sections = sections;
        this.checkoutFooter = checkoutFooter;
        this.analyticsSubtotalValue = analyticsSubtotalValue;
        this.checkoutDestination = checkoutDestination;
        this.paymentMethodId = paymentMethodId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsSubtotalValue() {
        return this.analyticsSubtotalValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getCheckoutDestination() {
        return this.checkoutDestination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BuyNowSection getCheckoutFooter() {
        return this.checkoutFooter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX INFO: renamed from: e */
    public final List<BuyNowSection> m102841e() {
        return this.sections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32783i)) {
            return false;
        }
        C32783i c32783i = (C32783i) other;
        return AbstractC22676k.m65745e(this.title, c32783i.title) && AbstractC22676k.m65745e(this.sections, c32783i.sections) && AbstractC22676k.m65745e(this.checkoutFooter, c32783i.checkoutFooter) && AbstractC22676k.m65745e(this.analyticsSubtotalValue, c32783i.analyticsSubtotalValue) && AbstractC22676k.m65745e(this.checkoutDestination, c32783i.checkoutDestination) && AbstractC22676k.m65745e(this.paymentMethodId, c32783i.paymentMethodId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.paymentMethodId.hashCode() + AbstractC36095b.m114673a(this.checkoutDestination, AbstractC11266d.m30450d((this.checkoutFooter.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.sections)) * 31, 31, this.analyticsSubtotalValue), 31);
    }

    public String toString() {
        String str = this.title;
        List<BuyNowSection> list = this.sections;
        BuyNowSection buyNowSection = this.checkoutFooter;
        String str2 = this.analyticsSubtotalValue;
        C9598e c9598e = this.checkoutDestination;
        String str3 = this.paymentMethodId;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("BuyNowSheetContent(title=", str, ", sections=", ", checkoutFooter=", list);
        sbM94766o.append(buyNowSection);
        sbM94766o.append(", analyticsSubtotalValue=");
        sbM94766o.append(str2);
        sbM94766o.append(", checkoutDestination=");
        sbM94766o.append(c9598e);
        sbM94766o.append(", paymentMethodId=");
        sbM94766o.append(str3);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }
}
