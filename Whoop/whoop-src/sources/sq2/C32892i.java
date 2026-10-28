package sq2;

import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sq2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lsq2/i;", "", "", "startAngle", "endAngle", "Li2/x;", "color", "", "isPrimary", "<init>", "(DDJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "D", "c", "()D", "b", "J", "()J", "d", "Z", "()Z", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C32892i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double startAngle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double endAngle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isPrimary;

    public /* synthetic */ C32892i(double d3, double d14, long j7, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, d14, j7, z4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getEndAngle() {
        return this.endAngle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getStartAngle() {
        return this.startAngle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32892i)) {
            return false;
        }
        C32892i c32892i = (C32892i) other;
        return Double.compare(this.startAngle, c32892i.startAngle) == 0 && Double.compare(this.endAngle, c32892i.endAngle) == 0 && C17919x.m51542d(this.color, c32892i.color) && this.isPrimary == c32892i.isPrimary;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(Double.hashCode(this.startAngle) * 31, 31, this.endAngle);
        long j7 = this.color;
        int i13 = C17919x.f69638o;
        return Boolean.hashCode(this.isPrimary) + AbstractC11266d.m30451e(iM48499a, j7, 31);
    }

    public String toString() {
        double d3 = this.startAngle;
        double d14 = this.endAngle;
        String strM51548j = C17919x.m51548j(this.color);
        boolean z4 = this.isPrimary;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("SliceData(startAngle=", d3, ", endAngle=");
        sbM8306s.append(d14);
        sbM8306s.append(", color=");
        sbM8306s.append(strM51548j);
        sbM8306s.append(", isPrimary=");
        sbM8306s.append(z4);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }

    private C32892i(double d3, double d14, long j7, boolean z4) {
        this.startAngle = d3;
        this.endAngle = d14;
        this.color = j7;
        this.isPrimary = z4;
    }
}
