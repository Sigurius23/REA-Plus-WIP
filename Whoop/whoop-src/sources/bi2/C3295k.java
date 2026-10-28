package bi2;

import m83.AbstractC25265s;
import n83.C26460c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: bi2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010 \u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lbi2/k;", "", "", "intraBurstGapCount", "crossBurstGapCount", "", "estimatedMissingPackets", "backwardPacketCount", "<init>", "(IIJI)V", "", "toString", "()Ljava/lang/String;", "a", "(IIJI)Lbi2/k;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "f", "b", "c", "J", "d", "()J", "g", "totalGapCount", "e", "()Z", "hasGaps", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3295k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int intraBurstGapCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int crossBurstGapCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long estimatedMissingPackets;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int backwardPacketCount;

    public C3295k(int i13, int i14, long j7, int i15) {
        this.intraBurstGapCount = i13;
        this.crossBurstGapCount = i14;
        this.estimatedMissingPackets = j7;
        this.backwardPacketCount = i15;
    }

    /* JADX INFO: renamed from: a */
    public final C3295k m9588a(int intraBurstGapCount, int crossBurstGapCount, long estimatedMissingPackets, int backwardPacketCount) {
        return new C3295k(intraBurstGapCount, crossBurstGapCount, estimatedMissingPackets, backwardPacketCount);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBackwardPacketCount() {
        return this.backwardPacketCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCrossBurstGapCount() {
        return this.crossBurstGapCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getEstimatedMissingPackets() {
        return this.estimatedMissingPackets;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9592e() {
        return m9594g() > 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3295k)) {
            return false;
        }
        C3295k c3295k = (C3295k) other;
        return this.intraBurstGapCount == c3295k.intraBurstGapCount && this.crossBurstGapCount == c3295k.crossBurstGapCount && this.estimatedMissingPackets == c3295k.estimatedMissingPackets && this.backwardPacketCount == c3295k.backwardPacketCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getIntraBurstGapCount() {
        return this.intraBurstGapCount;
    }

    /* JADX INFO: renamed from: g */
    public final int m9594g() {
        return this.intraBurstGapCount + this.crossBurstGapCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.backwardPacketCount) + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.crossBurstGapCount, Integer.hashCode(this.intraBurstGapCount) * 31, 31), this.estimatedMissingPackets, 31);
    }

    public String toString() {
        if (!m9592e() && this.backwardPacketCount == 0) {
            return "none";
        }
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        int i13 = this.intraBurstGapCount;
        if (i13 > 0) {
            c26460cM119000x.add("intraBurst=" + i13);
        }
        int i14 = this.crossBurstGapCount;
        if (i14 > 0) {
            c26460cM119000x.add("crossBurst=" + i14);
        }
        long j7 = this.estimatedMissingPackets;
        if (j7 > 0) {
            c26460cM119000x.add("missing=" + j7);
        }
        int i15 = this.backwardPacketCount;
        if (i15 > 0) {
            c26460cM119000x.add("backward=" + i15);
        }
        return AbstractC25265s.m74110N0(AbstractC37056f.m118988k(c26460cM119000x), ", ", "{", "}", null, 56);
    }

    public /* synthetic */ C3295k(int i13, int i14, long j7, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0L : j7, (i16 & 8) != 0 ? 0 : i15);
    }
}
