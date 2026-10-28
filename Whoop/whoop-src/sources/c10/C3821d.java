package c10;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: c10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C3821d extends AbstractC37926s0 {

    /* JADX INFO: renamed from: b */
    public final String f15659b;

    public C3821d(String paymentMethodType) {
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        this.f15659b = paymentMethodType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3821d) && AbstractC22676k.m65745e(this.f15659b, ((C3821d) obj).f15659b);
    }

    public final int hashCode() {
        return this.f15659b.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("RemovedSavedPaymentMethod(paymentMethodType=", this.f15659b, ")");
    }
}
