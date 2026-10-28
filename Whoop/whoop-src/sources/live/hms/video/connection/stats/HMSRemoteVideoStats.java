package live.hms.video.connection.stats;

import live.hms.video.media.settings.HMSVideoResolution;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010Jb\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001c\u0010\u0010¨\u0006-"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSRemoteVideoStats;", "Llive/hms/video/connection/stats/HMSStats$HMSRemoteStats;", "jitter", "", "bytesReceived", "", "bitrate", "packetsReceived", "packetsLost", "", "resolution", "Llive/hms/video/media/settings/HMSVideoResolution;", "frameRate", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;)V", "getJitter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBytesReceived", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBitrate", "getPacketsReceived", "getPacketsLost", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResolution", "()Llive/hms/video/media/settings/HMSVideoResolution;", "getFrameRate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Llive/hms/video/media/settings/HMSVideoResolution;Ljava/lang/Double;)Llive/hms/video/connection/stats/HMSRemoteVideoStats;", "equals", "", "other", "", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRemoteVideoStats extends HMSStats.HMSRemoteStats {
    private final Double bitrate;
    private final Long bytesReceived;
    private final Double frameRate;
    private final Double jitter;
    private final Integer packetsLost;
    private final Long packetsReceived;
    private final HMSVideoResolution resolution;

    public HMSRemoteVideoStats(Double d3, Long l7, Double d14, Long l12, Integer num, HMSVideoResolution hMSVideoResolution, Double d15) {
        super(null);
        this.jitter = d3;
        this.bytesReceived = l7;
        this.bitrate = d14;
        this.packetsReceived = l12;
        this.packetsLost = num;
        this.resolution = hMSVideoResolution;
        this.frameRate = d15;
    }

    public static /* synthetic */ HMSRemoteVideoStats copy$default(HMSRemoteVideoStats hMSRemoteVideoStats, Double d3, Long l7, Double d14, Long l12, Integer num, HMSVideoResolution hMSVideoResolution, Double d15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = hMSRemoteVideoStats.jitter;
        }
        if ((i13 & 2) != 0) {
            l7 = hMSRemoteVideoStats.bytesReceived;
        }
        if ((i13 & 4) != 0) {
            d14 = hMSRemoteVideoStats.bitrate;
        }
        if ((i13 & 8) != 0) {
            l12 = hMSRemoteVideoStats.packetsReceived;
        }
        if ((i13 & 16) != 0) {
            num = hMSRemoteVideoStats.packetsLost;
        }
        if ((i13 & 32) != 0) {
            hMSVideoResolution = hMSRemoteVideoStats.resolution;
        }
        if ((i13 & 64) != 0) {
            d15 = hMSRemoteVideoStats.frameRate;
        }
        HMSVideoResolution hMSVideoResolution2 = hMSVideoResolution;
        Double d16 = d15;
        Integer num2 = num;
        Double d17 = d14;
        return hMSRemoteVideoStats.copy(d3, l7, d17, l12, num2, hMSVideoResolution2, d16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getJitter() {
        return this.jitter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBytesReceived() {
        return this.bytesReceived;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getPacketsReceived() {
        return this.packetsReceived;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPacketsLost() {
        return this.packetsLost;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HMSVideoResolution getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getFrameRate() {
        return this.frameRate;
    }

    public final HMSRemoteVideoStats copy(Double jitter, Long bytesReceived, Double bitrate, Long packetsReceived, Integer packetsLost, HMSVideoResolution resolution, Double frameRate) {
        return new HMSRemoteVideoStats(jitter, bytesReceived, bitrate, packetsReceived, packetsLost, resolution, frameRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRemoteVideoStats)) {
            return false;
        }
        HMSRemoteVideoStats hMSRemoteVideoStats = (HMSRemoteVideoStats) other;
        return AbstractC22676k.m65745e(this.jitter, hMSRemoteVideoStats.jitter) && AbstractC22676k.m65745e(this.bytesReceived, hMSRemoteVideoStats.bytesReceived) && AbstractC22676k.m65745e(this.bitrate, hMSRemoteVideoStats.bitrate) && AbstractC22676k.m65745e(this.packetsReceived, hMSRemoteVideoStats.packetsReceived) && AbstractC22676k.m65745e(this.packetsLost, hMSRemoteVideoStats.packetsLost) && AbstractC22676k.m65745e(this.resolution, hMSRemoteVideoStats.resolution) && AbstractC22676k.m65745e(this.frameRate, hMSRemoteVideoStats.frameRate);
    }

    public final Double getBitrate() {
        return this.bitrate;
    }

    public final Long getBytesReceived() {
        return this.bytesReceived;
    }

    public final Double getFrameRate() {
        return this.frameRate;
    }

    public final Double getJitter() {
        return this.jitter;
    }

    public final Integer getPacketsLost() {
        return this.packetsLost;
    }

    public final Long getPacketsReceived() {
        return this.packetsReceived;
    }

    public final HMSVideoResolution getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        Double d3 = this.jitter;
        int iHashCode = (d3 == null ? 0 : d3.hashCode()) * 31;
        Long l7 = this.bytesReceived;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        Double d14 = this.bitrate;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l12 = this.packetsReceived;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.packetsLost;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        HMSVideoResolution hMSVideoResolution = this.resolution;
        int iHashCode6 = (iHashCode5 + (hMSVideoResolution == null ? 0 : hMSVideoResolution.hashCode())) * 31;
        Double d15 = this.frameRate;
        return iHashCode6 + (d15 != null ? d15.hashCode() : 0);
    }

    public String toString() {
        return "HMSRemoteVideoStats(jitter=" + this.jitter + ", bytesReceived=" + this.bytesReceived + ", bitrate=" + this.bitrate + ", packetsReceived=" + this.packetsReceived + ", packetsLost=" + this.packetsLost + ", resolution=" + this.resolution + ", frameRate=" + this.frameRate + ')';
    }
}
