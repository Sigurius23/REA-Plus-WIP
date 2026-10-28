package c10;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: c10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3818a extends AbstractC37926s0 {

    /* JADX INFO: renamed from: b */
    public final String f15657b;

    public C3818a(String str) {
        this.f15657b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3818a) && AbstractC22676k.m65745e(this.f15657b, ((C3818a) obj).f15657b);
    }

    public final int hashCode() {
        return this.f15657b.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("CompletedPaymentMethodForm(paymentMethodType=", this.f15657b, ")");
    }
}
