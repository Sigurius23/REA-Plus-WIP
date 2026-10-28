package zh2;

import c13.AbstractC3855a;
import java.util.Map;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zh2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0011\u0010\"\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!¨\u0006#"}, m65681d2 = {"Lzh2/b;", "", "", "gapCount", "", "estimatedMissingPackets", "backwardPacketCount", "", "", "firstSequenceByRevision", "lastSequenceByRevision", "<init>", "(IJILjava/util/Map;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "J", "()J", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "e", "f", "()Z", "hasGaps", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40645b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int gapCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long estimatedMissingPackets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int backwardPacketCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<Short, Long> firstSequenceByRevision;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Map<Short, Long> lastSequenceByRevision;

    public C40645b(int i13, long j7, int i14, Map<Short, Long> firstSequenceByRevision, Map<Short, Long> lastSequenceByRevision) {
        AbstractC22676k.m65750j(firstSequenceByRevision, "firstSequenceByRevision");
        AbstractC22676k.m65750j(lastSequenceByRevision, "lastSequenceByRevision");
        this.gapCount = i13;
        this.estimatedMissingPackets = j7;
        this.backwardPacketCount = i14;
        this.firstSequenceByRevision = firstSequenceByRevision;
        this.lastSequenceByRevision = lastSequenceByRevision;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBackwardPacketCount() {
        return this.backwardPacketCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEstimatedMissingPackets() {
        return this.estimatedMissingPackets;
    }

    /* JADX INFO: renamed from: c */
    public final Map<Short, Long> m131895c() {
        return this.firstSequenceByRevision;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getGapCount() {
        return this.gapCount;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m131897e() {
        return this.gapCount > 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40645b)) {
            return false;
        }
        C40645b c40645b = (C40645b) other;
        return this.gapCount == c40645b.gapCount && this.estimatedMissingPackets == c40645b.estimatedMissingPackets && this.backwardPacketCount == c40645b.backwardPacketCount && AbstractC22676k.m65745e(this.firstSequenceByRevision, c40645b.firstSequenceByRevision) && AbstractC22676k.m65745e(this.lastSequenceByRevision, c40645b.lastSequenceByRevision);
    }

    /* JADX INFO: renamed from: f */
    public final Map<Short, Long> m131898f() {
        return this.lastSequenceByRevision;
    }

    public int hashCode() {
        return this.lastSequenceByRevision.hashCode() + AbstractC3855a.m11821e(this.firstSequenceByRevision, AbstractC11266d.m30448b(this.backwardPacketCount, AbstractC11266d.m30451e(Integer.hashCode(this.gapCount) * 31, this.estimatedMissingPackets, 31), 31), 31);
    }

    public String toString() {
        return "BurstSequenceInfo(gapCount=" + this.gapCount + ", estimatedMissingPackets=" + this.estimatedMissingPackets + ", backwardPacketCount=" + this.backwardPacketCount + ", firstSequenceByRevision=" + this.firstSequenceByRevision + ", lastSequenceByRevision=" + this.lastSequenceByRevision + ")";
    }
}
