package live.hms.video.connection.degredation;

import c13.AbstractC3855a;
import java.util.Map;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/connection/degredation/StatsBundle;", "", "packetLoss", "", "allStats", "", "", "Llive/hms/video/connection/degredation/WebrtcStats;", "totalPackets", "packetLossTracks", "", "Llive/hms/video/connection/degredation/ConnectionInfo$PacketLossTracks;", "<init>", "(JLjava/util/Map;JLjava/util/Map;)V", "getPacketLoss", "()J", "getAllStats", "()Ljava/util/Map;", "getTotalPackets", "getPacketLossTracks", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class StatsBundle {
    private final Map<String, WebrtcStats> allStats;
    private final long packetLoss;
    private final Map<Long, ConnectionInfo.PacketLossTracks> packetLossTracks;
    private final long totalPackets;

    /* JADX WARN: Multi-variable type inference failed */
    public StatsBundle(long j7, Map<String, ? extends WebrtcStats> allStats, long j13, Map<Long, ConnectionInfo.PacketLossTracks> packetLossTracks) {
        AbstractC22676k.m65750j(allStats, "allStats");
        AbstractC22676k.m65750j(packetLossTracks, "packetLossTracks");
        this.packetLoss = j7;
        this.allStats = allStats;
        this.totalPackets = j13;
        this.packetLossTracks = packetLossTracks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsBundle copy$default(StatsBundle statsBundle, long j7, Map map, long j13, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = statsBundle.packetLoss;
        }
        long j14 = j7;
        if ((i13 & 2) != 0) {
            map = statsBundle.allStats;
        }
        Map map3 = map;
        if ((i13 & 4) != 0) {
            j13 = statsBundle.totalPackets;
        }
        long j15 = j13;
        if ((i13 & 8) != 0) {
            map2 = statsBundle.packetLossTracks;
        }
        return statsBundle.copy(j14, map3, j15, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPacketLoss() {
        return this.packetLoss;
    }

    public final Map<String, WebrtcStats> component2() {
        return this.allStats;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTotalPackets() {
        return this.totalPackets;
    }

    public final Map<Long, ConnectionInfo.PacketLossTracks> component4() {
        return this.packetLossTracks;
    }

    public final StatsBundle copy(long packetLoss, Map<String, ? extends WebrtcStats> allStats, long totalPackets, Map<Long, ConnectionInfo.PacketLossTracks> packetLossTracks) {
        AbstractC22676k.m65750j(allStats, "allStats");
        AbstractC22676k.m65750j(packetLossTracks, "packetLossTracks");
        return new StatsBundle(packetLoss, allStats, totalPackets, packetLossTracks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatsBundle)) {
            return false;
        }
        StatsBundle statsBundle = (StatsBundle) other;
        return this.packetLoss == statsBundle.packetLoss && AbstractC22676k.m65745e(this.allStats, statsBundle.allStats) && this.totalPackets == statsBundle.totalPackets && AbstractC22676k.m65745e(this.packetLossTracks, statsBundle.packetLossTracks);
    }

    public final Map<String, WebrtcStats> getAllStats() {
        return this.allStats;
    }

    public final long getPacketLoss() {
        return this.packetLoss;
    }

    public final Map<Long, ConnectionInfo.PacketLossTracks> getPacketLossTracks() {
        return this.packetLossTracks;
    }

    public final long getTotalPackets() {
        return this.totalPackets;
    }

    public int hashCode() {
        return this.packetLossTracks.hashCode() + AbstractC11266d.m30451e(AbstractC3855a.m11821e(this.allStats, Long.hashCode(this.packetLoss) * 31, 31), this.totalPackets, 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("StatsBundle(packetLoss=");
        sb4.append(this.packetLoss);
        sb4.append(", allStats=");
        sb4.append(this.allStats);
        sb4.append(", totalPackets=");
        sb4.append(this.totalPackets);
        sb4.append(", packetLossTracks=");
        return AbstractC30802r.m94764m(sb4, this.packetLossTracks, ')');
    }
}
