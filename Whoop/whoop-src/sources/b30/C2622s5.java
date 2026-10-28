package b30;

import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import se.AbstractC32411b;

/* JADX INFO: renamed from: b30.s5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2622s5 extends AbstractC32411b {

    /* JADX INFO: renamed from: b */
    public final AbstractC29840y f10211b;

    public C2622s5(AbstractC29840y abstractC29840y) {
        this.f10211b = abstractC29840y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2622s5) && AbstractC22676k.m65745e(this.f10211b, ((C2622s5) obj).f10211b);
    }

    public final int hashCode() {
        AbstractC29840y abstractC29840y = this.f10211b;
        if (abstractC29840y == null) {
            return 0;
        }
        return abstractC29840y.hashCode();
    }

    public final String toString() {
        return "SelectPaymentMethod(selection=" + this.f10211b + ")";
    }
}
