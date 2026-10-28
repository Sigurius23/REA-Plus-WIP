package m70;

import d70.C11752f;
import d70.C11753g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m70.k */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u000e¨\u0006!"}, m65681d2 = {"Lm70/k;", "", "Ld70/g;", "cardNumber", "Ld70/f;", "cardExpirationMonth", "cardExpirationYear", "cardCvv", "cardZip", "", "userCountryCode", "<init>", "(Ld70/g;Ld70/f;Ld70/f;Ld70/g;Ld70/g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/g;", "d", "()Ld70/g;", "b", "Ld70/f;", "()Ld70/f;", "c", "e", "f", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C25197k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C11753g cardNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11752f cardExpirationMonth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11752f cardExpirationYear;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C11753g cardCvv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C11753g cardZip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String userCountryCode;

    public C25197k(C11753g cardNumber, C11752f cardExpirationMonth, C11752f cardExpirationYear, C11753g cardCvv, C11753g cardZip, String str) {
        AbstractC22676k.m65750j(cardNumber, "cardNumber");
        AbstractC22676k.m65750j(cardExpirationMonth, "cardExpirationMonth");
        AbstractC22676k.m65750j(cardExpirationYear, "cardExpirationYear");
        AbstractC22676k.m65750j(cardCvv, "cardCvv");
        AbstractC22676k.m65750j(cardZip, "cardZip");
        this.cardNumber = cardNumber;
        this.cardExpirationMonth = cardExpirationMonth;
        this.cardExpirationYear = cardExpirationYear;
        this.cardCvv = cardCvv;
        this.cardZip = cardZip;
        this.userCountryCode = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C11753g getCardCvv() {
        return this.cardCvv;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C11752f getCardExpirationMonth() {
        return this.cardExpirationMonth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C11752f getCardExpirationYear() {
        return this.cardExpirationYear;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C11753g getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C11753g getCardZip() {
        return this.cardZip;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25197k)) {
            return false;
        }
        C25197k c25197k = (C25197k) other;
        return AbstractC22676k.m65745e(this.cardNumber, c25197k.cardNumber) && AbstractC22676k.m65745e(this.cardExpirationMonth, c25197k.cardExpirationMonth) && AbstractC22676k.m65745e(this.cardExpirationYear, c25197k.cardExpirationYear) && AbstractC22676k.m65745e(this.cardCvv, c25197k.cardCvv) && AbstractC22676k.m65745e(this.cardZip, c25197k.cardZip) && AbstractC22676k.m65745e(this.userCountryCode, c25197k.userCountryCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUserCountryCode() {
        return this.userCountryCode;
    }

    public int hashCode() {
        int iHashCode = (this.cardZip.hashCode() + ((this.cardCvv.hashCode() + ((this.cardExpirationYear.hashCode() + ((this.cardExpirationMonth.hashCode() + (this.cardNumber.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.userCountryCode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "UpcyclePaymentMethod(cardNumber=" + this.cardNumber + ", cardExpirationMonth=" + this.cardExpirationMonth + ", cardExpirationYear=" + this.cardExpirationYear + ", cardCvv=" + this.cardCvv + ", cardZip=" + this.cardZip + ", userCountryCode=" + this.userCountryCode + ")";
    }
}
