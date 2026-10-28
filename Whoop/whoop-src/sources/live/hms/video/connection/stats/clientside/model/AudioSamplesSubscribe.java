package live.hms.video.connection.stats.clientside.model;

import com.google.gson.annotations.SerializedName;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u000f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/AudioSamplesSubscribe;", "Llive/hms/video/connection/stats/clientside/model/SubscribeBaseSample;", "timestamp", "", "audio_level_high_seconds", "audio_concealed_samples", "audio_total_samples_received", "audio_concealment_events", "fec_packets_discarded", "fec_packets_received", "total_samples_duration", "", "total_packets_received", "total_packets_lost", "jitter_buffer_delay", "", "<init>", "(JJJJJJJFJJD)V", "getTimestamp", "()J", "getAudio_level_high_seconds", "getAudio_concealed_samples", "getAudio_total_samples_received", "getAudio_concealment_events", "getFec_packets_discarded", "getFec_packets_received", "getTotal_samples_duration", "()F", "getTotal_packets_received", "getTotal_packets_lost", "getJitter_buffer_delay", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AudioSamplesSubscribe implements SubscribeBaseSample {

    @SerializedName("audio_concealed_samples")
    private final long audio_concealed_samples;

    @SerializedName("audio_concealment_events")
    private final long audio_concealment_events;

    @SerializedName("audio_level_high_seconds")
    private final long audio_level_high_seconds;

    @SerializedName("audio_total_samples_received")
    private final long audio_total_samples_received;

    @SerializedName("fec_packets_discarded")
    private final long fec_packets_discarded;

    @SerializedName("fec_packets_received")
    private final long fec_packets_received;

    @SerializedName("jitter_buffer_delay")
    private final double jitter_buffer_delay;

    @SerializedName("timestamp")
    private final long timestamp;

    @SerializedName("total_packets_lost")
    private final long total_packets_lost;

    @SerializedName("total_packets_received")
    private final long total_packets_received;

    @SerializedName("total_samples_duration")
    private final float total_samples_duration;

    public AudioSamplesSubscribe(long j7, long j13, long j14, long j15, long j16, long j17, long j18, float f13, long j19, long j24, double d3) {
        this.timestamp = j7;
        this.audio_level_high_seconds = j13;
        this.audio_concealed_samples = j14;
        this.audio_total_samples_received = j15;
        this.audio_concealment_events = j16;
        this.fec_packets_discarded = j17;
        this.fec_packets_received = j18;
        this.total_samples_duration = f13;
        this.total_packets_received = j19;
        this.total_packets_lost = j24;
        this.jitter_buffer_delay = d3;
    }

    public static /* synthetic */ AudioSamplesSubscribe copy$default(AudioSamplesSubscribe audioSamplesSubscribe, long j7, long j13, long j14, long j15, long j16, long j17, long j18, float f13, long j19, long j24, double d3, int i13, Object obj) {
        double d14;
        long j25;
        long j26 = (i13 & 1) != 0 ? audioSamplesSubscribe.timestamp : j7;
        long j27 = (i13 & 2) != 0 ? audioSamplesSubscribe.audio_level_high_seconds : j13;
        long j28 = (i13 & 4) != 0 ? audioSamplesSubscribe.audio_concealed_samples : j14;
        long j29 = (i13 & 8) != 0 ? audioSamplesSubscribe.audio_total_samples_received : j15;
        long j34 = (i13 & 16) != 0 ? audioSamplesSubscribe.audio_concealment_events : j16;
        long j35 = (i13 & 32) != 0 ? audioSamplesSubscribe.fec_packets_discarded : j17;
        long j36 = (i13 & 64) != 0 ? audioSamplesSubscribe.fec_packets_received : j18;
        long j37 = j26;
        float f14 = (i13 & 128) != 0 ? audioSamplesSubscribe.total_samples_duration : f13;
        long j38 = (i13 & 256) != 0 ? audioSamplesSubscribe.total_packets_received : j19;
        long j39 = (i13 & 512) != 0 ? audioSamplesSubscribe.total_packets_lost : j24;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            j25 = j39;
            d14 = audioSamplesSubscribe.jitter_buffer_delay;
        } else {
            d14 = d3;
            j25 = j39;
        }
        return audioSamplesSubscribe.copy(j37, j27, j28, j29, j34, j35, j36, f14, j38, j25, d14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getTotal_packets_lost() {
        return this.total_packets_lost;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getJitter_buffer_delay() {
        return this.jitter_buffer_delay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAudio_level_high_seconds() {
        return this.audio_level_high_seconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAudio_concealed_samples() {
        return this.audio_concealed_samples;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAudio_total_samples_received() {
        return this.audio_total_samples_received;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getAudio_concealment_events() {
        return this.audio_concealment_events;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getFec_packets_discarded() {
        return this.fec_packets_discarded;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getFec_packets_received() {
        return this.fec_packets_received;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getTotal_samples_duration() {
        return this.total_samples_duration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getTotal_packets_received() {
        return this.total_packets_received;
    }

    public final AudioSamplesSubscribe copy(long timestamp, long audio_level_high_seconds, long audio_concealed_samples, long audio_total_samples_received, long audio_concealment_events, long fec_packets_discarded, long fec_packets_received, float total_samples_duration, long total_packets_received, long total_packets_lost, double jitter_buffer_delay) {
        return new AudioSamplesSubscribe(timestamp, audio_level_high_seconds, audio_concealed_samples, audio_total_samples_received, audio_concealment_events, fec_packets_discarded, fec_packets_received, total_samples_duration, total_packets_received, total_packets_lost, jitter_buffer_delay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioSamplesSubscribe)) {
            return false;
        }
        AudioSamplesSubscribe audioSamplesSubscribe = (AudioSamplesSubscribe) other;
        return this.timestamp == audioSamplesSubscribe.timestamp && this.audio_level_high_seconds == audioSamplesSubscribe.audio_level_high_seconds && this.audio_concealed_samples == audioSamplesSubscribe.audio_concealed_samples && this.audio_total_samples_received == audioSamplesSubscribe.audio_total_samples_received && this.audio_concealment_events == audioSamplesSubscribe.audio_concealment_events && this.fec_packets_discarded == audioSamplesSubscribe.fec_packets_discarded && this.fec_packets_received == audioSamplesSubscribe.fec_packets_received && Float.compare(this.total_samples_duration, audioSamplesSubscribe.total_samples_duration) == 0 && this.total_packets_received == audioSamplesSubscribe.total_packets_received && this.total_packets_lost == audioSamplesSubscribe.total_packets_lost && Double.compare(this.jitter_buffer_delay, audioSamplesSubscribe.jitter_buffer_delay) == 0;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public long getAudio_concealed_samples() {
        return this.audio_concealed_samples;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public long getAudio_concealment_events() {
        return this.audio_concealment_events;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public long getAudio_level_high_seconds() {
        return this.audio_level_high_seconds;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public long getAudio_total_samples_received() {
        return this.audio_total_samples_received;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public long getFec_packets_discarded() {
        return this.fec_packets_discarded;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public long getFec_packets_received() {
        return this.fec_packets_received;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public double getJitter_buffer_delay() {
        return this.jitter_buffer_delay;
    }

    @Override // live.hms.video.connection.stats.clientside.model.BaseSample
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public long getTotal_packets_lost() {
        return this.total_packets_lost;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public long getTotal_packets_received() {
        return this.total_packets_received;
    }

    @Override // live.hms.video.connection.stats.clientside.model.SubscribeBaseSample
    public float getTotal_samples_duration() {
        return this.total_samples_duration;
    }

    public int hashCode() {
        return Double.hashCode(this.jitter_buffer_delay) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30447a(this.total_samples_duration, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.timestamp) * 31, this.audio_level_high_seconds, 31), this.audio_concealed_samples, 31), this.audio_total_samples_received, 31), this.audio_concealment_events, 31), this.fec_packets_discarded, 31), this.fec_packets_received, 31), 31), this.total_packets_received, 31), this.total_packets_lost, 31);
    }

    public String toString() {
        return "AudioSamplesSubscribe(timestamp=" + this.timestamp + ", audio_level_high_seconds=" + this.audio_level_high_seconds + ", audio_concealed_samples=" + this.audio_concealed_samples + ", audio_total_samples_received=" + this.audio_total_samples_received + ", audio_concealment_events=" + this.audio_concealment_events + ", fec_packets_discarded=" + this.fec_packets_discarded + ", fec_packets_received=" + this.fec_packets_received + ", total_samples_duration=" + this.total_samples_duration + ", total_packets_received=" + this.total_packets_received + ", total_packets_lost=" + this.total_packets_lost + ", jitter_buffer_delay=" + this.jitter_buffer_delay + ')';
    }
}
