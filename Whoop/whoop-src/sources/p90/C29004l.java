package p90;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p90.l */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Lp90/l;", "", "Lp90/k;", "cardNumberLabel", "expirationDateLabel", "ccvLabel", "zipCodeLabel", "<init>", "(Lp90/k;Lp90/k;Lp90/k;Lp90/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp90/k;", "()Lp90/k;", "b", "c", "d", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29004l {

    /* JADX INFO: renamed from: e */
    public static final int f117361e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29003k cardNumberLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C29003k expirationDateLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29003k ccvLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C29003k zipCodeLabel;

    public C29004l(C29003k cardNumberLabel, C29003k expirationDateLabel, C29003k ccvLabel, C29003k c29003k) {
        AbstractC22676k.m65750j(cardNumberLabel, "cardNumberLabel");
        AbstractC22676k.m65750j(expirationDateLabel, "expirationDateLabel");
        AbstractC22676k.m65750j(ccvLabel, "ccvLabel");
        this.cardNumberLabel = cardNumberLabel;
        this.expirationDateLabel = expirationDateLabel;
        this.ccvLabel = ccvLabel;
        this.zipCodeLabel = c29003k;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C29003k getCardNumberLabel() {
        return this.cardNumberLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C29003k getCcvLabel() {
        return this.ccvLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C29003k getExpirationDateLabel() {
        return this.expirationDateLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C29003k getZipCodeLabel() {
        return this.zipCodeLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29004l)) {
            return false;
        }
        C29004l c29004l = (C29004l) other;
        return AbstractC22676k.m65745e(this.cardNumberLabel, c29004l.cardNumberLabel) && AbstractC22676k.m65745e(this.expirationDateLabel, c29004l.expirationDateLabel) && AbstractC22676k.m65745e(this.ccvLabel, c29004l.ccvLabel) && AbstractC22676k.m65745e(this.zipCodeLabel, c29004l.zipCodeLabel);
    }

    public int hashCode() {
        int iHashCode = (this.ccvLabel.hashCode() + ((this.expirationDateLabel.hashCode() + (this.cardNumberLabel.hashCode() * 31)) * 31)) * 31;
        C29003k c29003k = this.zipCodeLabel;
        return iHashCode + (c29003k == null ? 0 : c29003k.hashCode());
    }

    public String toString() {
        return "PaymentMethodTextFields(cardNumberLabel=" + this.cardNumberLabel + ", expirationDateLabel=" + this.expirationDateLabel + ", ccvLabel=" + this.ccvLabel + ", zipCodeLabel=" + this.zipCodeLabel + ")";
    }
}
