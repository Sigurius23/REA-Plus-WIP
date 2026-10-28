package b30;

import h20.C16687l;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;

/* JADX INFO: renamed from: b30.r5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2615r5 extends AbstractC32411b {

    /* JADX INFO: renamed from: b */
    public final C16687l f10191b;

    public C2615r5(C16687l paymentMethod) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f10191b = paymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2615r5) && AbstractC22676k.m65745e(this.f10191b, ((C2615r5) obj).f10191b);
    }

    public final int hashCode() {
        return this.f10191b.hashCode();
    }

    public final String toString() {
        return "EditPaymentMethod(paymentMethod=" + this.f10191b + ")";
    }
}
