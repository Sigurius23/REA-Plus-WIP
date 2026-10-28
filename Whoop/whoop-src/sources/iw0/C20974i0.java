package iw0;

import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: iw0.i0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, m65681d2 = {"Liw0/i0;", "", "", "endPercentage", "startPercentage", "", "startTimeInMillis", "endTimeInMillis", "<init>", "(DDJJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getEndPercentage", "()D", "b", "getStartPercentage", "c", "J", "getStartTimeInMillis", "()J", "d", "getEndTimeInMillis", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20974i0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double endPercentage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double startPercentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long startTimeInMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long endTimeInMillis;

    public C20974i0(double d3, double d14, long j7, long j13) {
        this.endPercentage = d3;
        this.startPercentage = d14;
        this.startTimeInMillis = j7;
        this.endTimeInMillis = j13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20974i0)) {
            return false;
        }
        C20974i0 c20974i0 = (C20974i0) other;
        return Double.compare(this.endPercentage, c20974i0.endPercentage) == 0 && Double.compare(this.startPercentage, c20974i0.startPercentage) == 0 && this.startTimeInMillis == c20974i0.startTimeInMillis && this.endTimeInMillis == c20974i0.endTimeInMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.endTimeInMillis) + AbstractC11266d.m30451e(AbstractC17176i.m48499a(Double.hashCode(this.endPercentage) * 31, 31, this.startPercentage), this.startTimeInMillis, 31);
    }

    public String toString() {
        double d3 = this.endPercentage;
        double d14 = this.startPercentage;
        long j7 = this.startTimeInMillis;
        long j13 = this.endTimeInMillis;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("HeartRateTimeline(endPercentage=", d3, ", startPercentage=");
        sbM8306s.append(d14);
        AbstractC2875y.m8285A(sbM8306s, ", startTimeInMillis=", j7, ", endTimeInMillis=");
        return AbstractC11266d.m30457k(j13, ")", sbM8306s);
    }
}
