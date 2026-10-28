package b32;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b32.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lb32/a;", "", "", "paymentMethodId", "postalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2675a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String paymentMethodId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String postalCode;

    public C2675a(String paymentMethodId, String str) {
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        this.paymentMethodId = paymentMethodId;
        this.postalCode = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2675a)) {
            return false;
        }
        C2675a c2675a = (C2675a) other;
        return AbstractC22676k.m65745e(this.paymentMethodId, c2675a.paymentMethodId) && AbstractC22676k.m65745e(this.postalCode, c2675a.postalCode);
    }

    public int hashCode() {
        int iHashCode = this.paymentMethodId.hashCode() * 31;
        String str = this.postalCode;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC2875y.m8300m("PaymentMethodInfo(paymentMethodId=", this.paymentMethodId, ", postalCode=", this.postalCode, ")");
    }
}
