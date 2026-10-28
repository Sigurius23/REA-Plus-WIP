package xk2;

import p715kotlin.Metadata;
import q63.AbstractC30007c;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: xk2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lxk2/j;", "", "", "timestampMillis", "", "heartRate", "<init>", "(JD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "D", "()D", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38444j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long timestampMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double heartRate;

    public C38444j(long j7, double d3) {
        this.timestampMillis = j7;
        this.heartRate = d3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38444j)) {
            return false;
        }
        C38444j c38444j = (C38444j) other;
        return this.timestampMillis == c38444j.timestampMillis && Double.compare(this.heartRate, c38444j.heartRate) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.heartRate) + (Long.hashCode(this.timestampMillis) * 31);
    }

    public String toString() {
        return AbstractC30007c.m91836f(this.heartRate, ")", AbstractC39383f.m125596b(this.timestampMillis, "TimestampedHeartRate(timestampMillis=", ", heartRate="));
    }
}
