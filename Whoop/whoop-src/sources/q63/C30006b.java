package q63;

import ih0.AbstractC18489d0;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q63.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C30006b implements Comparable {

    /* JADX INFO: renamed from: E */
    public final int f122507E;

    /* JADX INFO: renamed from: F */
    public final int f122508F;

    /* JADX INFO: renamed from: G */
    public final int f122509G;

    /* JADX INFO: renamed from: H */
    public final int f122510H;

    /* JADX INFO: renamed from: I */
    public final long f122511I;

    /* JADX INFO: renamed from: w */
    public final int f122512w;

    /* JADX INFO: renamed from: x */
    public final int f122513x;

    /* JADX INFO: renamed from: y */
    public final int f122514y;

    /* JADX INFO: renamed from: z */
    public final int f122515z;

    static {
        AbstractC30005a.m91825a(0L);
    }

    public C30006b(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, long j7) {
        AbstractC18489d0.m53382w(i16, "dayOfWeek");
        AbstractC18489d0.m53382w(i19, "month");
        this.f122512w = i13;
        this.f122513x = i14;
        this.f122514y = i15;
        this.f122515z = i16;
        this.f122507E = i17;
        this.f122508F = i18;
        this.f122509G = i19;
        this.f122510H = i24;
        this.f122511I = j7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C30006b other = (C30006b) obj;
        AbstractC22676k.m65750j(other, "other");
        return AbstractC22676k.m65752l(this.f122511I, other.f122511I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30006b)) {
            return false;
        }
        C30006b c30006b = (C30006b) obj;
        return this.f122512w == c30006b.f122512w && this.f122513x == c30006b.f122513x && this.f122514y == c30006b.f122514y && this.f122515z == c30006b.f122515z && this.f122507E == c30006b.f122507E && this.f122508F == c30006b.f122508F && this.f122509G == c30006b.f122509G && this.f122510H == c30006b.f122510H && this.f122511I == c30006b.f122511I;
    }

    public final int hashCode() {
        return Long.hashCode(this.f122511I) + AbstractC11266d.m30448b(this.f122510H, (AbstractC12682p.m35485e(this.f122509G) + AbstractC11266d.m30448b(this.f122508F, AbstractC11266d.m30448b(this.f122507E, (AbstractC12682p.m35485e(this.f122515z) + AbstractC11266d.m30448b(this.f122514y, AbstractC11266d.m30448b(this.f122513x, Integer.hashCode(this.f122512w) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GMTDate(seconds=");
        sb4.append(this.f122512w);
        sb4.append(", minutes=");
        sb4.append(this.f122513x);
        sb4.append(", hours=");
        sb4.append(this.f122514y);
        sb4.append(", dayOfWeek=");
        sb4.append(AbstractC30007c.m91829D(this.f122515z));
        sb4.append(", dayOfMonth=");
        sb4.append(this.f122507E);
        sb4.append(", dayOfYear=");
        sb4.append(this.f122508F);
        sb4.append(", month=");
        sb4.append(AbstractC26725a.m79496A(this.f122509G));
        sb4.append(", year=");
        sb4.append(this.f122510H);
        sb4.append(", timestamp=");
        return AbstractC2875y.m8302o(sb4, this.f122511I, ')');
    }
}
