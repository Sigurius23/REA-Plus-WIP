package d30;

import h20.C16687l;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11515a0 extends AbstractC12313p {

    /* JADX INFO: renamed from: b */
    public final C16687l f37089b;

    public C11515a0(C16687l paymentMethod) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f37089b = paymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11515a0) && AbstractC22676k.m65745e(this.f37089b, ((C11515a0) obj).f37089b);
    }

    public final int hashCode() {
        return this.f37089b.hashCode();
    }

    public final String toString() {
        return "UpdatePaymentMethod(paymentMethod=" + this.f37089b + ")";
    }
}
