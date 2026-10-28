package dv0;

import p000.AbstractC11266d;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: dv0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Ldv0/e;", "", "", "currentSequence", "", "currentSubSequence", "", "currentTimeInSeconds", "<init>", "(JID)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "I", "c", "D", "()D", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C12387e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long currentSequence;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int currentSubSequence;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double currentTimeInSeconds;

    public C12387e(long j7, int i13, double d3) {
        this.currentSequence = j7;
        this.currentSubSequence = i13;
        this.currentTimeInSeconds = d3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCurrentSequence() {
        return this.currentSequence;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentSubSequence() {
        return this.currentSubSequence;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getCurrentTimeInSeconds() {
        return this.currentTimeInSeconds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12387e)) {
            return false;
        }
        C12387e c12387e = (C12387e) other;
        return this.currentSequence == c12387e.currentSequence && this.currentSubSequence == c12387e.currentSubSequence && Double.compare(this.currentTimeInSeconds, c12387e.currentTimeInSeconds) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.currentTimeInSeconds) + AbstractC11266d.m30448b(this.currentSubSequence, Long.hashCode(this.currentSequence) * 31, 31);
    }

    public String toString() {
        return "ReducedRealtimePacketEmitAction(currentSequence=" + this.currentSequence + ", currentSubSequence=" + this.currentSubSequence + ", currentTimeInSeconds=" + this.currentTimeInSeconds + ")";
    }
}
