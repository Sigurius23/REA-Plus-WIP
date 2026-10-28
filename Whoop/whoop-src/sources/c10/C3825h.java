package c10;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: c10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C3825h extends AbstractC37926s0 {

    /* JADX INFO: renamed from: b */
    public final String f15663b;

    public C3825h(String paymentMethodType) {
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        this.f15663b = paymentMethodType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3825h) && AbstractC22676k.m65745e(this.f15663b, ((C3825h) obj).f15663b);
    }

    public final int hashCode() {
        return this.f15663b.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("TappedConfirmButton(paymentMethodType=", this.f15663b, ")");
    }
}
