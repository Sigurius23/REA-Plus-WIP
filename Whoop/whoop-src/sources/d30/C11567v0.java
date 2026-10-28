package d30;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11567v0 implements InterfaceC11575z0 {

    /* JADX INFO: renamed from: a */
    public final String f37329a;

    public C11567v0(String selectedPaymentMethodCode) {
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        this.f37329a = selectedPaymentMethodCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11567v0) && AbstractC22676k.m65745e(this.f37329a, ((C11567v0) obj).f37329a);
    }

    public final int hashCode() {
        return this.f37329a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("PaymentMethodSelected(selectedPaymentMethodCode=", this.f37329a, ")");
    }
}
