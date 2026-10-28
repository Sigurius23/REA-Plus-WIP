package c10;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: c10.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C3824g extends AbstractC37926s0 {

    /* JADX INFO: renamed from: b */
    public final String f15662b;

    public C3824g(String paymentMethodType) {
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        this.f15662b = paymentMethodType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3824g) && AbstractC22676k.m65745e(this.f15662b, ((C3824g) obj).f15662b);
    }

    public final int hashCode() {
        return this.f15662b.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("StartedInteractionWithPaymentMethodForm(paymentMethodType=", this.f15662b, ")");
    }
}
