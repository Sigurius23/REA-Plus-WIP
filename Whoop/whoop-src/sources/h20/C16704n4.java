package h20;

import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38949s2;

/* JADX INFO: renamed from: h20.n4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16704n4 implements InterfaceC16728r4 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38949s2 f64231a;

    public C16704n4(InterfaceC38949s2 paymentDetails) {
        AbstractC22676k.m65750j(paymentDetails, "paymentDetails");
        this.f64231a = paymentDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16704n4) && AbstractC22676k.m65745e(this.f64231a, ((C16704n4) obj).f64231a);
    }

    public final int hashCode() {
        return this.f64231a.hashCode();
    }

    public final String toString() {
        return "Link(paymentDetails=" + this.f64231a + ")";
    }
}
