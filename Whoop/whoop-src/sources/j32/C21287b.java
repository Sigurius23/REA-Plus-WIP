package j32;

import b32.C2675a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j32.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, m65681d2 = {"Lj32/b;", "", "Lb32/a;", "paymentMethodInfo", "", "screenName", "<init>", "(Lb32/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb32/a;", "getPaymentMethodInfo", "()Lb32/a;", "b", "Ljava/lang/String;", "getScreenName", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21287b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C2675a paymentMethodInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String screenName;

    public C21287b(C2675a c2675a, String screenName) {
        AbstractC22676k.m65750j(screenName, "screenName");
        this.paymentMethodInfo = c2675a;
        this.screenName = screenName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21287b)) {
            return false;
        }
        C21287b c21287b = (C21287b) other;
        return AbstractC22676k.m65745e(this.paymentMethodInfo, c21287b.paymentMethodInfo) && AbstractC22676k.m65745e(this.screenName, c21287b.screenName);
    }

    public int hashCode() {
        C2675a c2675a = this.paymentMethodInfo;
        return this.screenName.hashCode() + ((c2675a == null ? 0 : c2675a.hashCode()) * 31);
    }

    public String toString() {
        return "PaymentCompleted(paymentMethodInfo=" + this.paymentMethodInfo + ", screenName=" + this.screenName + ")";
    }
}
