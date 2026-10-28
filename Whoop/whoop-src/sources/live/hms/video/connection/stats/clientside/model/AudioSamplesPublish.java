package live.hms.video.connection.stats.clientside.model;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\n\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/AudioSamplesPublish;", "Llive/hms/video/connection/stats/clientside/model/PublishBaseSamples;", "timestamp", "", "avgRoundTripTimeMs", "", "avgJitterMs", "", "totalPacketsLost", "avgBitrateBps", "avgAvailableOutgoingBitrateBps", "<init>", "(JIFJJJ)V", "getTimestamp", "()J", "getAvgRoundTripTimeMs", "()I", "getAvgJitterMs", "()F", "getTotalPacketsLost", "getAvgBitrateBps", "getAvgAvailableOutgoingBitrateBps", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AudioSamplesPublish implements PublishBaseSamples {

    @SerializedName("avg_available_outgoing_bitrate_bps")
    private final long avgAvailableOutgoingBitrateBps;

    @SerializedName("avg_bitrate_bps")
    private final long avgBitrateBps;

    @SerializedName("avg_jitter_ms")
    private final float avgJitterMs;

    @SerializedName("avg_round_trip_time_ms")
    private final int avgRoundTripTimeMs;

    @SerializedName("timestamp")
    private final long timestamp;

    @SerializedName("total_packets_lost")
    private final long totalPacketsLost;

    public AudioSamplesPublish(long j7, int i13, float f13, long j13, long j14, long j15) {
        this.timestamp = j7;
        this.avgRoundTripTimeMs = i13;
        this.avgJitterMs = f13;
        this.totalPacketsLost = j13;
        this.avgBitrateBps = j14;
        this.avgAvailableOutgoingBitrateBps = j15;
    }

    public static /* synthetic */ AudioSamplesPublish copy$default(AudioSamplesPublish audioSamplesPublish, long j7, int i13, float f13, long j13, long j14, long j15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j7 = audioSamplesPublish.timestamp;
        }
        long j16 = j7;
        if ((i14 & 2) != 0) {
            i13 = audioSamplesPublish.avgRoundTripTimeMs;
        }
        int i15 = i13;
        if ((i14 & 4) != 0) {
            f13 = audioSamplesPublish.avgJitterMs;
        }
        return audioSamplesPublish.copy(j16, i15, f13, (i14 & 8) != 0 ? audioSamplesPublish.totalPacketsLost : j13, (i14 & 16) != 0 ? audioSamplesPublish.avgBitrateBps : j14, (i14 & 32) != 0 ? audioSamplesPublish.avgAvailableOutgoingBitrateBps : j15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvgRoundTripTimeMs() {
        return this.avgRoundTripTimeMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAvgJitterMs() {
        return this.avgJitterMs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalPacketsLost() {
        return this.totalPacketsLost;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getAvgBitrateBps() {
        return this.avgBitrateBps;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAvgAvailableOutgoingBitrateBps() {
        return this.avgAvailableOutgoingBitrateBps;
    }

    public final AudioSamplesPublish copy(long timestamp, int avgRoundTripTimeMs, float avgJitterMs, long totalPacketsLost, long avgBitrateBps, long avgAvailableOutgoingBitrateBps) {
        return new AudioSamplesPublish(timestamp, avgRoundTripTimeMs, avgJitterMs, totalPacketsLost, avgBitrateBps, avgAvailableOutgoingBitrateBps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioSamplesPublish)) {
            return false;
        }
        AudioSamplesPublish audioSamplesPublish = (AudioSamplesPublish) other;
        return this.timestamp == audioSamplesPublish.timestamp && this.avgRoundTripTimeMs == audioSamplesPublish.avgRoundTripTimeMs && Float.compare(this.avgJitterMs, audioSamplesPublish.avgJitterMs) == 0 && this.totalPacketsLost == audioSamplesPublish.totalPacketsLost && this.avgBitrateBps == audioSamplesPublish.avgBitrateBps && this.avgAvailableOutgoingBitrateBps == audioSamplesPublish.avgAvailableOutgoingBitrateBps;
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

    @Override // live.hms.video.connection.stats.clientside.model.BaseSample
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // live.hms.video.connection.stats.clientside.model.PublishBaseSamples
    public long getTotalPacketsLost() {
        return this.totalPacketsLost;
    }

    public int hashCode() {
        return Long.hashCode(this.avgAvailableOutgoingBitrateBps) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30447a(this.avgJitterMs, AbstractC11266d.m30448b(this.avgRoundTripTimeMs, Long.hashCode(this.timestamp) * 31, 31), 31), this.totalPacketsLost, 31), this.avgBitrateBps, 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("AudioSamplesPublish(timestamp=");
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
        return AbstractC2875y.m8302o(sb4, this.avgAvailableOutgoingBitrateBps, ')');
    }
}
