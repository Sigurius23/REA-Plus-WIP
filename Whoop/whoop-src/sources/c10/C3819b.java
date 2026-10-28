package c10;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: c10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3819b extends AbstractC37926s0 {

    /* JADX INFO: renamed from: b */
    public final String f15658b;

    public C3819b(String paymentMethodType) {
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        this.f15658b = paymentMethodType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3819b) && AbstractC22676k.m65745e(this.f15658b, ((C3819b) obj).f15658b);
    }

    public final int hashCode() {
        return this.f15658b.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("DisplayedPaymentMethodForm(paymentMethodType=", this.f15658b, ")");
    }
}
