package live.hms.video.connection.stats;

import live.hms.video.connection.degredation.QualityLimitationReasons;
import live.hms.video.media.settings.HMSLayer;
import live.hms.video.media.settings.HMSVideoResolution;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010*\u001a\u00020\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0084\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\"\u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b#\u0010\u0018¨\u00068"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSLocalVideoStats;", "Llive/hms/video/connection/stats/HMSStats$HMSLocalStats;", "jitter", "", "roundTripTime", "bytesSent", "", "bitrate", "resolution", "Llive/hms/video/media/settings/HMSVideoResolution;", "frameRate", "qualityLimitationReason", "Llive/hms/video/connection/degredation/QualityLimitationReasons;", "hmsLayer", "Llive/hms/video/media/settings/HMSLayer;", "packetLoss", "packetsSent", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)V", "getJitter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRoundTripTime", "getBytesSent", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBitrate", "getResolution", "()Llive/hms/video/media/settings/HMSVideoResolution;", "getFrameRate", "getQualityLimitationReason", "()Llive/hms/video/connection/degredation/QualityLimitationReasons;", "getHmsLayer", "()Llive/hms/video/media/settings/HMSLayer;", "getPacketLoss", "getPacketsSent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;Llive/hms/video/connection/degredation/QualityLimitationReasons;Llive/hms/video/media/settings/HMSLayer;Ljava/lang/Long;Ljava/lang/Long;)Llive/hms/video/connection/stats/HMSLocalVideoStats;", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSLocalVideoStats extends HMSStats.HMSLocalStats {
    private final Double bitrate;
    private final Long bytesSent;
    private final Double frameRate;
    private final HMSLayer hmsLayer;
    private final Double jitter;
    private final Long packetLoss;
    private final Long packetsSent;
    private final QualityLimitationReasons qualityLimitationReason;
    private final HMSVideoResolution resolution;
    private final Double roundTripTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSLocalVideoStats(Double d3, Double d14, Long l7, Double d15, HMSVideoResolution hMSVideoResolution, Double d16, QualityLimitationReasons qualityLimitationReason, HMSLayer hMSLayer, Long l12, Long l13) {
        super(null);
        AbstractC22676k.m65750j(qualityLimitationReason, "qualityLimitationReason");
        this.jitter = d3;
        this.roundTripTime = d14;
        this.bytesSent = l7;
        this.bitrate = d15;
        this.resolution = hMSVideoResolution;
        this.frameRate = d16;
        this.qualityLimitationReason = qualityLimitationReason;
        this.hmsLayer = hMSLayer;
        this.packetLoss = l12;
        this.packetsSent = l13;
    }

    public static /* synthetic */ HMSLocalVideoStats copy$default(HMSLocalVideoStats hMSLocalVideoStats, Double d3, Double d14, Long l7, Double d15, HMSVideoResolution hMSVideoResolution, Double d16, QualityLimitationReasons qualityLimitationReasons, HMSLayer hMSLayer, Long l12, Long l13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = hMSLocalVideoStats.jitter;
        }
        if ((i13 & 2) != 0) {
            d14 = hMSLocalVideoStats.roundTripTime;
        }
        if ((i13 & 4) != 0) {
            l7 = hMSLocalVideoStats.bytesSent;
        }
        if ((i13 & 8) != 0) {
            d15 = hMSLocalVideoStats.bitrate;
        }
        if ((i13 & 16) != 0) {
            hMSVideoResolution = hMSLocalVideoStats.resolution;
        }
        if ((i13 & 32) != 0) {
            d16 = hMSLocalVideoStats.frameRate;
        }
        if ((i13 & 64) != 0) {
            qualityLimitationReasons = hMSLocalVideoStats.qualityLimitationReason;
        }
        if ((i13 & 128) != 0) {
            hMSLayer = hMSLocalVideoStats.hmsLayer;
        }
        if ((i13 & 256) != 0) {
            l12 = hMSLocalVideoStats.packetLoss;
        }
        if ((i13 & 512) != 0) {
            l13 = hMSLocalVideoStats.packetsSent;
        }
        Long l14 = l12;
        Long l15 = l13;
        QualityLimitationReasons qualityLimitationReasons2 = qualityLimitationReasons;
        HMSLayer hMSLayer2 = hMSLayer;
        HMSVideoResolution hMSVideoResolution2 = hMSVideoResolution;
        Double d17 = d16;
        return hMSLocalVideoStats.copy(d3, d14, l7, d15, hMSVideoResolution2, d17, qualityLimitationReasons2, hMSLayer2, l14, l15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getJitter() {
        return this.jitter;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getPacketsSent() {
        return this.packetsSent;
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
    public final HMSVideoResolution getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final QualityLimitationReasons getQualityLimitationReason() {
        return this.qualityLimitationReason;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HMSLayer getHmsLayer() {
        return this.hmsLayer;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getPacketLoss() {
        return this.packetLoss;
    }

    public final HMSLocalVideoStats copy(Double jitter, Double roundTripTime, Long bytesSent, Double bitrate, HMSVideoResolution resolution, Double frameRate, QualityLimitationReasons qualityLimitationReason, HMSLayer hmsLayer, Long packetLoss, Long packetsSent) {
        AbstractC22676k.m65750j(qualityLimitationReason, "qualityLimitationReason");
        return new HMSLocalVideoStats(jitter, roundTripTime, bytesSent, bitrate, resolution, frameRate, qualityLimitationReason, hmsLayer, packetLoss, packetsSent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSLocalVideoStats)) {
            return false;
        }
        HMSLocalVideoStats hMSLocalVideoStats = (HMSLocalVideoStats) other;
        return AbstractC22676k.m65745e(this.jitter, hMSLocalVideoStats.jitter) && AbstractC22676k.m65745e(this.roundTripTime, hMSLocalVideoStats.roundTripTime) && AbstractC22676k.m65745e(this.bytesSent, hMSLocalVideoStats.bytesSent) && AbstractC22676k.m65745e(this.bitrate, hMSLocalVideoStats.bitrate) && AbstractC22676k.m65745e(this.resolution, hMSLocalVideoStats.resolution) && AbstractC22676k.m65745e(this.frameRate, hMSLocalVideoStats.frameRate) && AbstractC22676k.m65745e(this.qualityLimitationReason, hMSLocalVideoStats.qualityLimitationReason) && this.hmsLayer == hMSLocalVideoStats.hmsLayer && AbstractC22676k.m65745e(this.packetLoss, hMSLocalVideoStats.packetLoss) && AbstractC22676k.m65745e(this.packetsSent, hMSLocalVideoStats.packetsSent);
    }

    public final Double getBitrate() {
        return this.bitrate;
    }

    public final Long getBytesSent() {
        return this.bytesSent;
    }

    public final Double getFrameRate() {
        return this.frameRate;
    }

    public final HMSLayer getHmsLayer() {
        return this.hmsLayer;
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

    public final QualityLimitationReasons getQualityLimitationReason() {
        return this.qualityLimitationReason;
    }

    public final HMSVideoResolution getResolution() {
        return this.resolution;
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
        HMSVideoResolution hMSVideoResolution = this.resolution;
        int iHashCode5 = (iHashCode4 + (hMSVideoResolution == null ? 0 : hMSVideoResolution.hashCode())) * 31;
        Double d16 = this.frameRate;
        int iHashCode6 = (this.qualityLimitationReason.hashCode() + ((iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31)) * 31;
        HMSLayer hMSLayer = this.hmsLayer;
        int iHashCode7 = (iHashCode6 + (hMSLayer == null ? 0 : hMSLayer.hashCode())) * 31;
        Long l12 = this.packetLoss;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.packetsSent;
        return iHashCode8 + (l13 != null ? l13.hashCode() : 0);
    }

    public String toString() {
        return "HMSLocalVideoStats(jitter=" + this.jitter + ", roundTripTime=" + this.roundTripTime + ", bytesSent=" + this.bytesSent + ", bitrate=" + this.bitrate + ", resolution=" + this.resolution + ", frameRate=" + this.frameRate + ", qualityLimitationReason=" + this.qualityLimitationReason + ", hmsLayer=" + this.hmsLayer + ", packetLoss=" + this.packetLoss + ", packetsSent=" + this.packetsSent + ')';
    }
}
