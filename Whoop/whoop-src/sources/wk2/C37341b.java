package wk2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lwk2/b;", "", "", "sum", "", "sampleCount", "<init>", "(JI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "I", "", "()Ljava/lang/Double;", "averageBpm", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37341b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long sum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int sampleCount;

    public C37341b(long j7, int i13) {
        this.sum = j7;
        this.sampleCount = i13;
    }

    /* JADX INFO: renamed from: a */
    public final Double m119579a() {
        int i13 = this.sampleCount;
        if (i13 > 0) {
            return Double.valueOf(this.sum / ((double) i13));
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSampleCount() {
        return this.sampleCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getSum() {
        return this.sum;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37341b)) {
            return false;
        }
        C37341b c37341b = (C37341b) other;
        return this.sum == c37341b.sum && this.sampleCount == c37341b.sampleCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.sampleCount) + (Long.hashCode(this.sum) * 31);
    }

    public String toString() {
        return "AverageHeartRateProgress(sum=" + this.sum + ", sampleCount=" + this.sampleCount + ")";
    }

    public /* synthetic */ C37341b(long j7, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j7, (i14 & 2) != 0 ? 0 : i13);
    }
}
