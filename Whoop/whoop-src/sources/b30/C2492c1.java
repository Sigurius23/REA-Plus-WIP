package b30;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2492c1 {

    /* JADX INFO: renamed from: a */
    public final C2540i1 f9708a;

    /* JADX INFO: renamed from: b */
    public final int f9709b;

    /* JADX INFO: renamed from: c */
    public final C2484b1 f9710c;

    /* JADX INFO: renamed from: d */
    public final C2570m f9711d;

    public C2492c1(C2540i1 c2540i1, int i13, C2484b1 c2484b1, C2570m c2570m) {
        this.f9708a = c2540i1;
        this.f9709b = i13;
        this.f9710c = c2484b1;
        this.f9711d = c2570m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2492c1)) {
            return false;
        }
        C2492c1 c2492c1 = (C2492c1) obj;
        return AbstractC22676k.m65745e(this.f9708a, c2492c1.f9708a) && this.f9709b == c2492c1.f9709b && AbstractC22676k.m65745e(this.f9710c, c2492c1.f9710c) && AbstractC22676k.m65745e(this.f9711d, c2492c1.f9711d);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f9709b, this.f9708a.hashCode() * 31, 31);
        C2484b1 c2484b1 = this.f9710c;
        int iHashCode = (iM30448b + (c2484b1 == null ? 0 : c2484b1.hashCode())) * 31;
        C2570m c2570m = this.f9711d;
        return iHashCode + (c2570m != null ? c2570m.hashCode() : 0);
    }

    public final String toString() {
        return "State(payload=" + this.f9708a + ", paymentMethodIcon=" + this.f9709b + ", cardDetailsState=" + this.f9710c + ", billingDetailsForm=" + this.f9711d + ")";
    }
}
