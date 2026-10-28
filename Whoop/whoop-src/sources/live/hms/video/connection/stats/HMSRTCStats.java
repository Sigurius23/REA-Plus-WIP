package live.hms.video.connection.stats;

import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006%"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSRTCStats;", "", "bytesSent", "", "bytesReceived", "packetsReceived", "packetsLost", "bitrateSent", "", "bitrateReceived", "roundTripTime", "<init>", "(JJJJDDD)V", "getBytesSent", "()J", "getBytesReceived", "getPacketsReceived", "getPacketsLost", "getBitrateSent", "()D", "getBitrateReceived", "getRoundTripTime", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRTCStats {
    private final double bitrateReceived;
    private final double bitrateSent;
    private final long bytesReceived;
    private final long bytesSent;
    private final long packetsLost;
    private final long packetsReceived;
    private final double roundTripTime;

    public HMSRTCStats(long j7, long j13, long j14, long j15, double d3, double d14, double d15) {
        this.bytesSent = j7;
        this.bytesReceived = j13;
        this.packetsReceived = j14;
        this.packetsLost = j15;
        this.bitrateSent = d3;
        this.bitrateReceived = d14;
        this.roundTripTime = d15;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBytesSent() {
        return this.bytesSent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBytesReceived() {
        return this.bytesReceived;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPacketsReceived() {
        return this.packetsReceived;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPacketsLost() {
        return this.packetsLost;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getBitrateSent() {
        return this.bitrateSent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getBitrateReceived() {
        return this.bitrateReceived;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getRoundTripTime() {
        return this.roundTripTime;
    }

    public final HMSRTCStats copy(long bytesSent, long bytesReceived, long packetsReceived, long packetsLost, double bitrateSent, double bitrateReceived, double roundTripTime) {
        return new HMSRTCStats(bytesSent, bytesReceived, packetsReceived, packetsLost, bitrateSent, bitrateReceived, roundTripTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRTCStats)) {
            return false;
        }
        HMSRTCStats hMSRTCStats = (HMSRTCStats) other;
        return this.bytesSent == hMSRTCStats.bytesSent && this.bytesReceived == hMSRTCStats.bytesReceived && this.packetsReceived == hMSRTCStats.packetsReceived && this.packetsLost == hMSRTCStats.packetsLost && Double.compare(this.bitrateSent, hMSRTCStats.bitrateSent) == 0 && Double.compare(this.bitrateReceived, hMSRTCStats.bitrateReceived) == 0 && Double.compare(this.roundTripTime, hMSRTCStats.roundTripTime) == 0;
    }

    public final double getBitrateReceived() {
        return this.bitrateReceived;
    }

    public final double getBitrateSent() {
        return this.bitrateSent;
    }

    public final long getBytesReceived() {
        return this.bytesReceived;
    }

    public final long getBytesSent() {
        return this.bytesSent;
    }

    public final long getPacketsLost() {
        return this.packetsLost;
    }

    public final long getPacketsReceived() {
        return this.packetsReceived;
    }

    public final double getRoundTripTime() {
        return this.roundTripTime;
    }

    public int hashCode() {
        return Double.hashCode(this.roundTripTime) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.bytesSent) * 31, this.bytesReceived, 31), this.packetsReceived, 31), this.packetsLost, 31), 31, this.bitrateSent), 31, this.bitrateReceived);
    }

    public String toString() {
        return "HMSRTCStats(bytesSent=" + this.bytesSent + ", bytesReceived=" + this.bytesReceived + ", packetsReceived=" + this.packetsReceived + ", packetsLost=" + this.packetsLost + ", bitrateSent=" + this.bitrateSent + ", bitrateReceived=" + this.bitrateReceived + ", roundTripTime=" + this.roundTripTime + ')';
    }
}
