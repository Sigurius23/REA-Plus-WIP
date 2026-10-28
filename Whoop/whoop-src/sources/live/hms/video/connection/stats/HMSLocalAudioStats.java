package live.hms.video.connection.stats;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011JV\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011¨\u0006&"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSLocalAudioStats;", "Llive/hms/video/connection/stats/HMSStats$HMSLocalStats;", "jitter", "", "roundTripTime", "bytesSent", "", "bitrate", "packetLoss", "packetsSent", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;)V", "getJitter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRoundTripTime", "getBytesSent", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBitrate", "getPacketLoss", "getPacketsSent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;)Llive/hms/video/connection/stats/HMSLocalAudioStats;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSLocalAudioStats extends HMSStats.HMSLocalStats {
    private final Double bitrate;
    private final Long bytesSent;
    private final Double jitter;
    private final Long packetLoss;
    private final Long packetsSent;
    private final Double roundTripTime;

    public HMSLocalAudioStats(Double d3, Double d14, Long l7, Double d15, Long l12, Long l13) {
        super(null);
        this.jitter = d3;
        this.roundTripTime = d14;
        this.bytesSent = l7;
        this.bitrate = d15;
        this.packetLoss = l12;
        this.packetsSent = l13;
    }

    public static /* synthetic */ HMSLocalAudioStats copy$default(HMSLocalAudioStats hMSLocalAudioStats, Double d3, Double d14, Long l7, Double d15, Long l12, Long l13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = hMSLocalAudioStats.jitter;
        }
        if ((i13 & 2) != 0) {
            d14 = hMSLocalAudioStats.roundTripTime;
        }
        if ((i13 & 4) != 0) {
            l7 = hMSLocalAudioStats.bytesSent;
        }
        if ((i13 & 8) != 0) {
            d15 = hMSLocalAudioStats.bitrate;
        }
        if ((i13 & 16) != 0) {
            l12 = hMSLocalAudioStats.packetLoss;
        }
        if ((i13 & 32) != 0) {
            l13 = hMSLocalAudioStats.packetsSent;
        }
        Long l14 = l12;
        Long l15 = l13;
        return hMSLocalAudioStats.copy(d3, d14, l7, d15, l14, l15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getJitter() {
        return this.jitter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getRoundTripTime() {
        return this.roundTripTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getBytesSent() {
        return this.bytesSent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getPacketLoss() {
        return this.packetLoss;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getPacketsSent() {
        return this.packetsSent;
    }

    public final HMSLocalAudioStats copy(Double jitter, Double roundTripTime, Long bytesSent, Double bitrate, Long packetLoss, Long packetsSent) {
        return new HMSLocalAudioStats(jitter, roundTripTime, bytesSent, bitrate, packetLoss, packetsSent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSLocalAudioStats)) {
            return false;
        }
        HMSLocalAudioStats hMSLocalAudioStats = (HMSLocalAudioStats) other;
        return AbstractC22676k.m65745e(this.jitter, hMSLocalAudioStats.jitter) && AbstractC22676k.m65745e(this.roundTripTime, hMSLocalAudioStats.roundTripTime) && AbstractC22676k.m65745e(this.bytesSent, hMSLocalAudioStats.bytesSent) && AbstractC22676k.m65745e(this.bitrate, hMSLocalAudioStats.bitrate) && AbstractC22676k.m65745e(this.packetLoss, hMSLocalAudioStats.packetLoss) && AbstractC22676k.m65745e(this.packetsSent, hMSLocalAudioStats.packetsSent);
    }

    public final Double getBitrate() {
        return this.bitrate;
    }

    public final Long getBytesSent() {
        return this.bytesSent;
    }

    public final Double getJitter() {
        return this.jitter;
    }

    public final Long getPacketLoss() {
        return this.packetLoss;
    }

    public final Long getPacketsSent() {
        return this.packetsSent;
    }

    public final Double getRoundTripTime() {
        return this.roundTripTime;
    }

    public int hashCode() {
        Double d3 = this.jitter;
        int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
        Double d14 = this.roundTripTime;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l7 = this.bytesSent;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Double d15 = this.bitrate;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Long l12 = this.packetLoss;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.packetsSent;
        return iHashCode5 + (l13 != null ? l13.hashCode() : 0);
    }

    public String toString() {
        return "HMSLocalAudioStats(jitter=" + this.jitter + ", roundTripTime=" + this.roundTripTime + ", bytesSent=" + this.bytesSent + ", bitrate=" + this.bitrate + ", packetLoss=" + this.packetLoss + ", packetsSent=" + this.packetsSent + ')';
    }
}
