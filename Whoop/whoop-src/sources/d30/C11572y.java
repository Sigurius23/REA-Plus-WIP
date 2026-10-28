package d30;

import h20.C16687l;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C11572y extends AbstractC12313p {

    /* JADX INFO: renamed from: b */
    public final C16687l f37349b;

    public C11572y(C16687l paymentMethod) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f37349b = paymentMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11572y) && AbstractC22676k.m65745e(this.f37349b, ((C11572y) obj).f37349b);
    }

    public final int hashCode() {
        return this.f37349b.hashCode();
    }

    public final String toString() {
        return "SelectPaymentMethod(paymentMethod=" + this.f37349b + ")";
    }
}
