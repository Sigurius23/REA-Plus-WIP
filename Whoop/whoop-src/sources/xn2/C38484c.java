package xn2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: xn2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006 "}, m65681d2 = {"Lxn2/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "totalLabel", "totalAmount", "ctaText", "Lcom/whoop/navigation/e;", "ctaDestination", "disclaimerText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38484c implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f164881f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource totalLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource totalAmount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e ctaDestination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource disclaimerText;

    static {
        int i13 = TextResource.$stable;
        f164881f = i13 | C9598e.f28134d | i13 | i13 | i13;
    }

    public C38484c(TextResource totalLabel, TextResource totalAmount, TextResource ctaText, C9598e c9598e, TextResource disclaimerText) {
        AbstractC22676k.m65750j(totalLabel, "totalLabel");
        AbstractC22676k.m65750j(totalAmount, "totalAmount");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(disclaimerText, "disclaimerText");
        this.totalLabel = totalLabel;
        this.totalAmount = totalAmount;
        this.ctaText = ctaText;
        this.ctaDestination = c9598e;
        this.disclaimerText = disclaimerText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDisclaimerText() {
        return this.disclaimerText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTotalAmount() {
        return this.totalAmount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38484c)) {
            return false;
        }
        C38484c c38484c = (C38484c) other;
        return AbstractC22676k.m65745e(this.totalLabel, c38484c.totalLabel) && AbstractC22676k.m65745e(this.totalAmount, c38484c.totalAmount) && AbstractC22676k.m65745e(this.ctaText, c38484c.ctaText) && AbstractC22676k.m65745e(this.ctaDestination, c38484c.ctaDestination) && AbstractC22676k.m65745e(this.disclaimerText, c38484c.disclaimerText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTotalLabel() {
        return this.totalLabel;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.totalLabel.hashCode() * 31, this.totalAmount, 31), this.ctaText, 31);
        C9598e c9598e = this.ctaDestination;
        return this.disclaimerText.hashCode() + ((iM95625a + (c9598e == null ? 0 : c9598e.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.totalLabel;
        TextResource textResource2 = this.totalAmount;
        TextResource textResource3 = this.ctaText;
        C9598e c9598e = this.ctaDestination;
        TextResource textResource4 = this.disclaimerText;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BuyNowCheckoutInfoViewState(totalLabel=", textResource, ", totalAmount=", textResource2, ", ctaText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", ctaDestination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", disclaimerText=");
        return AbstractC30007c.m91841k(sbM106658q, textResource4, ")");
    }
}
