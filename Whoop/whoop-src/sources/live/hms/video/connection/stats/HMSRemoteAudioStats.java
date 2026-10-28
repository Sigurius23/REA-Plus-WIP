package live.hms.video.connection.stats;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006%"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSRemoteAudioStats;", "Llive/hms/video/connection/stats/HMSStats$HMSRemoteStats;", "jitter", "", "bytesReceived", "", "bitrate", "packetsReceived", "packetsLost", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;)V", "getJitter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBytesReceived", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBitrate", "getPacketsReceived", "getPacketsLost", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;)Llive/hms/video/connection/stats/HMSRemoteAudioStats;", "equals", "", "other", "", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRemoteAudioStats extends HMSStats.HMSRemoteStats {
    private final Double bitrate;
    private final Long bytesReceived;
    private final Double jitter;
    private final Integer packetsLost;
    private final Long packetsReceived;

    public HMSRemoteAudioStats(Double d3, Long l7, Double d14, Long l12, Integer num) {
        super(null);
        this.jitter = d3;
        this.bytesReceived = l7;
        this.bitrate = d14;
        this.packetsReceived = l12;
        this.packetsLost = num;
    }

    public static /* synthetic */ HMSRemoteAudioStats copy$default(HMSRemoteAudioStats hMSRemoteAudioStats, Double d3, Long l7, Double d14, Long l12, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = hMSRemoteAudioStats.jitter;
        }
        if ((i13 & 2) != 0) {
            l7 = hMSRemoteAudioStats.bytesReceived;
        }
        if ((i13 & 4) != 0) {
            d14 = hMSRemoteAudioStats.bitrate;
        }
        if ((i13 & 8) != 0) {
            l12 = hMSRemoteAudioStats.packetsReceived;
        }
        if ((i13 & 16) != 0) {
            num = hMSRemoteAudioStats.packetsLost;
        }
        Integer num2 = num;
        Double d15 = d14;
        return hMSRemoteAudioStats.copy(d3, l7, d15, l12, num2);
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

    public final HMSRemoteAudioStats copy(Double jitter, Long bytesReceived, Double bitrate, Long packetsReceived, Integer packetsLost) {
        return new HMSRemoteAudioStats(jitter, bytesReceived, bitrate, packetsReceived, packetsLost);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRemoteAudioStats)) {
            return false;
        }
        HMSRemoteAudioStats hMSRemoteAudioStats = (HMSRemoteAudioStats) other;
        return AbstractC22676k.m65745e(this.jitter, hMSRemoteAudioStats.jitter) && AbstractC22676k.m65745e(this.bytesReceived, hMSRemoteAudioStats.bytesReceived) && AbstractC22676k.m65745e(this.bitrate, hMSRemoteAudioStats.bitrate) && AbstractC22676k.m65745e(this.packetsReceived, hMSRemoteAudioStats.packetsReceived) && AbstractC22676k.m65745e(this.packetsLost, hMSRemoteAudioStats.packetsLost);
    }

    public final Double getBitrate() {
        return this.bitrate;
    }

    public final Long getBytesReceived() {
        return this.bytesReceived;
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
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "HMSRemoteAudioStats(jitter=" + this.jitter + ", bytesReceived=" + this.bytesReceived + ", bitrate=" + this.bitrate + ", packetsReceived=" + this.packetsReceived + ", packetsLost=" + this.packetsLost + ')';
    }
}
