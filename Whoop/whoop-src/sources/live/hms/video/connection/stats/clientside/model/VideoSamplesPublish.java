package live.hms.video.connection.stats.clientside.model;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003Jw\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0005HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u000e\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001c¨\u00069"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/VideoSamplesPublish;", "Llive/hms/video/connection/stats/clientside/model/PublishBaseSamples;", "total_quality_limitation", "Llive/hms/video/connection/stats/clientside/model/QualityLimitation;", "avg_fps", "", "resolution", "Llive/hms/video/connection/stats/clientside/model/Size;", "timestamp", "", "avgRoundTripTimeMs", "avgJitterMs", "", "totalPacketsLost", "avgBitrateBps", "avgAvailableOutgoingBitrateBps", "totalPacketSendDelay", "", "packetsSent", "<init>", "(Llive/hms/video/connection/stats/clientside/model/QualityLimitation;ILlive/hms/video/connection/stats/clientside/model/Size;JIFJJJDJ)V", "getTotal_quality_limitation", "()Llive/hms/video/connection/stats/clientside/model/QualityLimitation;", "getAvg_fps", "()I", "getResolution", "()Llive/hms/video/connection/stats/clientside/model/Size;", "getTimestamp", "()J", "getAvgRoundTripTimeMs", "getAvgJitterMs", "()F", "getTotalPacketsLost", "getAvgBitrateBps", "getAvgAvailableOutgoingBitrateBps", "getTotalPacketSendDelay", "()D", "getPacketsSent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class VideoSamplesPublish implements PublishBaseSamples {

    @SerializedName("avg_available_outgoing_bitrate_bps")
    private final long avgAvailableOutgoingBitrateBps;

    @SerializedName("avg_bitrate_bps")
    private final long avgBitrateBps;

    @SerializedName("avg_jitter_ms")
    private final float avgJitterMs;

    @SerializedName("avg_round_trip_time_ms")
    private final int avgRoundTripTimeMs;

    @SerializedName("avg_fps")
    private final int avg_fps;

    @SerializedName("total_packets_sent")
    private final long packetsSent;

    @SerializedName("resolution")
    private final Size resolution;

    @SerializedName("timestamp")
    private final long timestamp;

    @SerializedName("total_packet_sent_delay_sec")
    private final double totalPacketSendDelay;

    @SerializedName("total_packets_lost")
    private final long totalPacketsLost;

    @SerializedName("total_quality_limitation")
    private final QualityLimitation total_quality_limitation;

    public VideoSamplesPublish(QualityLimitation total_quality_limitation, int i13, Size resolution, long j7, int i14, float f13, long j13, long j14, long j15, double d3, long j16) {
        AbstractC22676k.m65750j(total_quality_limitation, "total_quality_limitation");
        AbstractC22676k.m65750j(resolution, "resolution");
        this.total_quality_limitation = total_quality_limitation;
        this.avg_fps = i13;
        this.resolution = resolution;
        this.timestamp = j7;
        this.avgRoundTripTimeMs = i14;
        this.avgJitterMs = f13;
        this.totalPacketsLost = j13;
        this.avgBitrateBps = j14;
        this.avgAvailableOutgoingBitrateBps = j15;
        this.totalPacketSendDelay = d3;
        this.packetsSent = j16;
    }

    public static /* synthetic */ VideoSamplesPublish copy$default(VideoSamplesPublish videoSamplesPublish, QualityLimitation qualityLimitation, int i13, Size size, long j7, int i14, float f13, long j13, long j14, long j15, double d3, long j16, int i15, Object obj) {
        long j17;
        double d14;
        QualityLimitation qualityLimitation2 = (i15 & 1) != 0 ? videoSamplesPublish.total_quality_limitation : qualityLimitation;
        int i16 = (i15 & 2) != 0 ? videoSamplesPublish.avg_fps : i13;
        Size size2 = (i15 & 4) != 0 ? videoSamplesPublish.resolution : size;
        long j18 = (i15 & 8) != 0 ? videoSamplesPublish.timestamp : j7;
        int i17 = (i15 & 16) != 0 ? videoSamplesPublish.avgRoundTripTimeMs : i14;
        float f14 = (i15 & 32) != 0 ? videoSamplesPublish.avgJitterMs : f13;
        long j19 = (i15 & 64) != 0 ? videoSamplesPublish.totalPacketsLost : j13;
        long j24 = (i15 & 128) != 0 ? videoSamplesPublish.avgBitrateBps : j14;
        long j25 = (i15 & 256) != 0 ? videoSamplesPublish.avgAvailableOutgoingBitrateBps : j15;
        QualityLimitation qualityLimitation3 = qualityLimitation2;
        int i18 = i16;
        double d15 = (i15 & 512) != 0 ? videoSamplesPublish.totalPacketSendDelay : d3;
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            d14 = d15;
            j17 = videoSamplesPublish.packetsSent;
        } else {
            j17 = j16;
            d14 = d15;
        }
        return videoSamplesPublish.copy(qualityLimitation3, i18, size2, j18, i17, f14, j19, j24, j25, d14, j17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final QualityLimitation getTotal_quality_limitation() {
        return this.total_quality_limitation;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getTotalPacketSendDelay() {
        return this.totalPacketSendDelay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getPacketsSent() {
        return this.packetsSent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvg_fps() {
        return this.avg_fps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Size getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAvgRoundTripTimeMs() {
        return this.avgRoundTripTimeMs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getAvgJitterMs() {
        return this.avgJitterMs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTotalPacketsLost() {
        return this.totalPacketsLost;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getAvgBitrateBps() {
        return this.avgBitrateBps;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getAvgAvailableOutgoingBitrateBps() {
        return this.avgAvailableOutgoingBitrateBps;
    }

    public final VideoSamplesPublish copy(QualityLimitation total_quality_limitation, int avg_fps, Size resolution, long timestamp, int avgRoundTripTimeMs, float avgJitterMs, long totalPacketsLost, long avgBitrateBps, long avgAvailableOutgoingBitrateBps, double totalPacketSendDelay, long packetsSent) {
        AbstractC22676k.m65750j(total_quality_limitation, "total_quality_limitation");
        AbstractC22676k.m65750j(resolution, "resolution");
        return new VideoSamplesPublish(total_quality_limitation, avg_fps, resolution, timestamp, avgRoundTripTimeMs, avgJitterMs, totalPacketsLost, avgBitrateBps, avgAvailableOutgoingBitrateBps, totalPacketSendDelay, packetsSent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSamplesPublish)) {
            return false;
        }
        VideoSamplesPublish videoSamplesPublish = (VideoSamplesPublish) other;
        return AbstractC22676k.m65745e(this.total_quality_limitation, videoSamplesPublish.total_quality_limitation) && this.avg_fps == videoSamplesPublish.avg_fps && AbstractC22676k.m65745e(this.resolution, videoSamplesPublish.resolution) && this.timestamp == videoSamplesPublish.timestamp && this.avgRoundTripTimeMs == videoSamplesPublish.avgRoundTripTimeMs && Float.compare(this.avgJitterMs, videoSamplesPublish.avgJitterMs) == 0 && this.totalPacketsLost == videoSamplesPublish.totalPacketsLost && this.avgBitrateBps == videoSamplesPublish.avgBitrateBps && this.avgAvailableOutgoingBitrateBps == videoSamplesPublish.avgAvailableOutgoingBitrateBps && Double.compare(this.totalPacketSendDelay, videoSamplesPublish.totalPacketSendDelay) == 0 && this.packetsSent == videoSamplesPublish.packetsSent;
    }

    @Override // live.hms.video.connection.stats.clientside.model.PublishBaseSamples
    public long getAvgAvailableOutgoingBitrateBps() {
        return this.avgAvailableOutgoingBitrateBps;
    }

    @Override // live.hms.video.connection.stats.clientside.model.PublishBaseSamples
    public long getAvgBitrateBps() {
        return this.avgBitrateBps;
    }

    @Override // live.hms.video.connection.stats.clientside.model.PublishBaseSamples
    public float getAvgJitterMs() {
        return this.avgJitterMs;
    }

    @Override // live.hms.video.connection.stats.clientside.model.PublishBaseSamples
    public int getAvgRoundTripTimeMs() {
        return this.avgRoundTripTimeMs;
    }

    public final int getAvg_fps() {
        return this.avg_fps;
    }

    public final long getPacketsSent() {
        return this.packetsSent;
    }

    public final Size getResolution() {
        return this.resolution;
    }

    @Override // live.hms.video.connection.stats.clientside.model.BaseSample
    public long getTimestamp() {
        return this.timestamp;
    }

    public final double getTotalPacketSendDelay() {
        return this.totalPacketSendDelay;
    }

    @Override // live.hms.video.connection.stats.clientside.model.PublishBaseSamples
    public long getTotalPacketsLost() {
        return this.totalPacketsLost;
    }

    public final QualityLimitation getTotal_quality_limitation() {
        return this.total_quality_limitation;
    }

    public int hashCode() {
        return Long.hashCode(this.packetsSent) + AbstractC17176i.m48499a(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30447a(this.avgJitterMs, AbstractC11266d.m30448b(this.avgRoundTripTimeMs, AbstractC11266d.m30451e((this.resolution.hashCode() + AbstractC11266d.m30448b(this.avg_fps, this.total_quality_limitation.hashCode() * 31, 31)) * 31, this.timestamp, 31), 31), 31), this.totalPacketsLost, 31), this.avgBitrateBps, 31), this.avgAvailableOutgoingBitrateBps, 31), 31, this.totalPacketSendDelay);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("VideoSamplesPublish(total_quality_limitation=");
        sb4.append(this.total_quality_limitation);
        sb4.append(", avg_fps=");
        sb4.append(this.avg_fps);
        sb4.append(", resolution=");
        sb4.append(this.resolution);
        sb4.append(", timestamp=");
        sb4.append(this.timestamp);
        sb4.append(", avgRoundTripTimeMs=");
        sb4.append(this.avgRoundTripTimeMs);
        sb4.append(", avgJitterMs=");
        sb4.append(this.avgJitterMs);
        sb4.append(", totalPacketsLost=");
        sb4.append(this.totalPacketsLost);
        sb4.append(", avgBitrateBps=");
        sb4.append(this.avgBitrateBps);
        sb4.append(", avgAvailableOutgoingBitrateBps=");
        sb4.append(this.avgAvailableOutgoingBitrateBps);
        sb4.append(", totalPacketSendDelay=");
        sb4.append(this.totalPacketSendDelay);
        sb4.append(", packetsSent=");
        return AbstractC2875y.m8302o(sb4, this.packetsSent, ')');
    }
}
