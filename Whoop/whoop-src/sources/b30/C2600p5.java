package b30;

import h20.AbstractC16736t0;
import java.util.List;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: b30.p5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2600p5 {

    /* JADX INFO: renamed from: a */
    public final List f10119a;

    /* JADX INFO: renamed from: b */
    public final AbstractC16736t0 f10120b;

    /* JADX INFO: renamed from: c */
    public final boolean f10121c;

    /* JADX INFO: renamed from: d */
    public final boolean f10122d;

    /* JADX INFO: renamed from: e */
    public final boolean f10123e;

    /* JADX INFO: renamed from: f */
    public final boolean f10124f;

    public C2600p5(List list, AbstractC16736t0 abstractC16736t0, boolean z4, boolean z13, boolean z14, boolean z15) {
        this.f10119a = list;
        this.f10120b = abstractC16736t0;
        this.f10121c = z4;
        this.f10122d = z13;
        this.f10123e = z14;
        this.f10124f = z15;
    }

    /* JADX INFO: renamed from: a */
    public static C2600p5 m7512a(C2600p5 c2600p5, List list, AbstractC16736t0 abstractC16736t0, boolean z4, boolean z13, boolean z14, boolean z15, int i13) {
        if ((i13 & 1) != 0) {
            list = c2600p5.f10119a;
        }
        List paymentOptionsItems = list;
        if ((i13 & 2) != 0) {
            abstractC16736t0 = c2600p5.f10120b;
        }
        AbstractC16736t0 abstractC16736t1 = abstractC16736t0;
        if ((i13 & 4) != 0) {
            z4 = c2600p5.f10121c;
        }
        boolean z16 = z4;
        if ((i13 & 8) != 0) {
            z13 = c2600p5.f10122d;
        }
        boolean z17 = z13;
        if ((i13 & 16) != 0) {
            z14 = c2600p5.f10123e;
        }
        boolean z18 = z14;
        if ((i13 & 32) != 0) {
            z15 = c2600p5.f10124f;
        }
        c2600p5.getClass();
        AbstractC22676k.m65750j(paymentOptionsItems, "paymentOptionsItems");
        return new C2600p5(paymentOptionsItems, abstractC16736t1, z16, z17, z18, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2600p5)) {
            return false;
        }
        C2600p5 c2600p5 = (C2600p5) obj;
        return AbstractC22676k.m65745e(this.f10119a, c2600p5.f10119a) && AbstractC22676k.m65745e(this.f10120b, c2600p5.f10120b) && this.f10121c == c2600p5.f10121c && this.f10122d == c2600p5.f10122d && this.f10123e == c2600p5.f10123e && this.f10124f == c2600p5.f10124f;
    }

    public final int hashCode() {
        int iHashCode = this.f10119a.hashCode() * 31;
        AbstractC16736t0 abstractC16736t0 = this.f10120b;
        return Boolean.hashCode(this.f10124f) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (abstractC16736t0 == null ? 0 : abstractC16736t0.hashCode())) * 31, 31, this.f10121c), 31, this.f10122d), 31, this.f10123e);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("State(paymentOptionsItems=");
        sb4.append(this.f10119a);
        sb4.append(", selectedPaymentOptionsItem=");
        sb4.append(this.f10120b);
        sb4.append(", isEditing=");
        AbstractC38963t7.m124392v(sb4, this.f10121c, ", isProcessing=", this.f10122d, ", canEdit=");
        return AbstractC36095b.m114682j(sb4, this.f10123e, ", canRemove=", this.f10124f, ")");
    }
}
