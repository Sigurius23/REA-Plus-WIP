package live.hms.video.connection.stats.clientside.model;

import com.google.gson.annotations.SerializedName;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u0095\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\tHÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\f\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\r\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u000e\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\u0012\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018¨\u0006<"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/VideoSamplesSubscribe;", "Llive/hms/video/connection/stats/clientside/model/VideoSubscribeBaseSample;", "timestamp", "", "avg_frames_received_per_sec", "", "avg_frames_dropped_per_sec", "avg_frames_decoded_per_sec", "total_pli_count", "", "total_nack_count", "avg_av_sync_ms", "frame_width", "frame_height", "pause_count", "pause_duration_seconds", "freeze_count", "freeze_duration_seconds", "avg_jitter_buffer_delay", "<init>", "(JFFFIIIIIIFIFF)V", "getTimestamp", "()J", "getAvg_frames_received_per_sec", "()F", "getAvg_frames_dropped_per_sec", "getAvg_frames_decoded_per_sec", "getTotal_pli_count", "()I", "getTotal_nack_count", "getAvg_av_sync_ms", "getFrame_width", "getFrame_height", "getPause_count", "getPause_duration_seconds", "getFreeze_count", "getFreeze_duration_seconds", "getAvg_jitter_buffer_delay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class VideoSamplesSubscribe implements VideoSubscribeBaseSample {

    @SerializedName("avg_av_sync_ms")
    private final int avg_av_sync_ms;

    @SerializedName("avg_frames_decoded_per_sec")
    private final float avg_frames_decoded_per_sec;

    @SerializedName("avg_frames_dropped_per_sec")
    private final float avg_frames_dropped_per_sec;

    @SerializedName("avg_frames_received_per_sec")
    private final float avg_frames_received_per_sec;

    @SerializedName("avg_jitter_buffer_delay")
    private final float avg_jitter_buffer_delay;

    @SerializedName("frame_height")
    private final int frame_height;

    @SerializedName("frame_width")
    private final int frame_width;

    @SerializedName("freeze_count")
    private final int freeze_count;

    @SerializedName("freeze_duration_seconds")
    private final float freeze_duration_seconds;

    @SerializedName("pause_count")
    private final int pause_count;

    @SerializedName("pause_duration_seconds")
    private final float pause_duration_seconds;

    @SerializedName("timestamp")
    private final long timestamp;

    @SerializedName("total_nack_count")
    private final int total_nack_count;

    @SerializedName("total_pli_count")
    private final int total_pli_count;

    public VideoSamplesSubscribe(long j7, float f13, float f14, float f15, int i13, int i14, int i15, int i16, int i17, int i18, float f16, int i19, float f17, float f18) {
        this.timestamp = j7;
        this.avg_frames_received_per_sec = f13;
        this.avg_frames_dropped_per_sec = f14;
        this.avg_frames_decoded_per_sec = f15;
        this.total_pli_count = i13;
        this.total_nack_count = i14;
        this.avg_av_sync_ms = i15;
        this.frame_width = i16;
        this.frame_height = i17;
        this.pause_count = i18;
        this.pause_duration_seconds = f16;
        this.freeze_count = i19;
        this.freeze_duration_seconds = f17;
        this.avg_jitter_buffer_delay = f18;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPause_count() {
        return this.pause_count;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getPause_duration_seconds() {
        return this.pause_duration_seconds;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getFreeze_count() {
        return this.freeze_count;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final float getFreeze_duration_seconds() {
        return this.freeze_duration_seconds;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final float getAvg_jitter_buffer_delay() {
        return this.avg_jitter_buffer_delay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAvg_frames_received_per_sec() {
        return this.avg_frames_received_per_sec;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getAvg_frames_dropped_per_sec() {
        return this.avg_frames_dropped_per_sec;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getAvg_frames_decoded_per_sec() {
        return this.avg_frames_decoded_per_sec;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotal_pli_count() {
        return this.total_pli_count;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotal_nack_count() {
        return this.total_nack_count;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAvg_av_sync_ms() {
        return this.avg_av_sync_ms;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFrame_width() {
        return this.frame_width;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFrame_height() {
        return this.frame_height;
    }

    public final VideoSamplesSubscribe copy(long timestamp, float avg_frames_received_per_sec, float avg_frames_dropped_per_sec, float avg_frames_decoded_per_sec, int total_pli_count, int total_nack_count, int avg_av_sync_ms, int frame_width, int frame_height, int pause_count, float pause_duration_seconds, int freeze_count, float freeze_duration_seconds, float avg_jitter_buffer_delay) {
        return new VideoSamplesSubscribe(timestamp, avg_frames_received_per_sec, avg_frames_dropped_per_sec, avg_frames_decoded_per_sec, total_pli_count, total_nack_count, avg_av_sync_ms, frame_width, frame_height, pause_count, pause_duration_seconds, freeze_count, freeze_duration_seconds, avg_jitter_buffer_delay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSamplesSubscribe)) {
            return false;
        }
        VideoSamplesSubscribe videoSamplesSubscribe = (VideoSamplesSubscribe) other;
        return this.timestamp == videoSamplesSubscribe.timestamp && Float.compare(this.avg_frames_received_per_sec, videoSamplesSubscribe.avg_frames_received_per_sec) == 0 && Float.compare(this.avg_frames_dropped_per_sec, videoSamplesSubscribe.avg_frames_dropped_per_sec) == 0 && Float.compare(this.avg_frames_decoded_per_sec, videoSamplesSubscribe.avg_frames_decoded_per_sec) == 0 && this.total_pli_count == videoSamplesSubscribe.total_pli_count && this.total_nack_count == videoSamplesSubscribe.total_nack_count && this.avg_av_sync_ms == videoSamplesSubscribe.avg_av_sync_ms && this.frame_width == videoSamplesSubscribe.frame_width && this.frame_height == videoSamplesSubscribe.frame_height && this.pause_count == videoSamplesSubscribe.pause_count && Float.compare(this.pause_duration_seconds, videoSamplesSubscribe.pause_duration_seconds) == 0 && this.freeze_count == videoSamplesSubscribe.freeze_count && Float.compare(this.freeze_duration_seconds, videoSamplesSubscribe.freeze_duration_seconds) == 0 && Float.compare(this.avg_jitter_buffer_delay, videoSamplesSubscribe.avg_jitter_buffer_delay) == 0;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public int getAvg_av_sync_ms() {
        return this.avg_av_sync_ms;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public float getAvg_frames_decoded_per_sec() {
        return this.avg_frames_decoded_per_sec;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public float getAvg_frames_dropped_per_sec() {
        return this.avg_frames_dropped_per_sec;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public float getAvg_frames_received_per_sec() {
        return this.avg_frames_received_per_sec;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public float getAvg_jitter_buffer_delay() {
        return this.avg_jitter_buffer_delay;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public int getFrame_height() {
        return this.frame_height;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public int getFrame_width() {
        return this.frame_width;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public int getFreeze_count() {
        return this.freeze_count;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public float getFreeze_duration_seconds() {
        return this.freeze_duration_seconds;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public int getPause_count() {
        return this.pause_count;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public float getPause_duration_seconds() {
        return this.pause_duration_seconds;
    }

    @Override // live.hms.video.connection.stats.clientside.model.BaseSample
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public int getTotal_nack_count() {
        return this.total_nack_count;
    }

    @Override // live.hms.video.connection.stats.clientside.model.VideoSubscribeBaseSample
    public int getTotal_pli_count() {
        return this.total_pli_count;
    }

    public int hashCode() {
        return Float.hashCode(this.avg_jitter_buffer_delay) + AbstractC11266d.m30447a(this.freeze_duration_seconds, AbstractC11266d.m30448b(this.freeze_count, AbstractC11266d.m30447a(this.pause_duration_seconds, AbstractC11266d.m30448b(this.pause_count, AbstractC11266d.m30448b(this.frame_height, AbstractC11266d.m30448b(this.frame_width, AbstractC11266d.m30448b(this.avg_av_sync_ms, AbstractC11266d.m30448b(this.total_nack_count, AbstractC11266d.m30448b(this.total_pli_count, AbstractC11266d.m30447a(this.avg_frames_decoded_per_sec, AbstractC11266d.m30447a(this.avg_frames_dropped_per_sec, AbstractC11266d.m30447a(this.avg_frames_received_per_sec, Long.hashCode(this.timestamp) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("VideoSamplesSubscribe(timestamp=");
        sb4.append(this.timestamp);
        sb4.append(", avg_frames_received_per_sec=");
        sb4.append(this.avg_frames_received_per_sec);
        sb4.append(", avg_frames_dropped_per_sec=");
        sb4.append(this.avg_frames_dropped_per_sec);
        sb4.append(", avg_frames_decoded_per_sec=");
        sb4.append(this.avg_frames_decoded_per_sec);
        sb4.append(", total_pli_count=");
        sb4.append(this.total_pli_count);
        sb4.append(", total_nack_count=");
        sb4.append(this.total_nack_count);
        sb4.append(", avg_av_sync_ms=");
        sb4.append(this.avg_av_sync_ms);
        sb4.append(", frame_width=");
        sb4.append(this.frame_width);
        sb4.append(", frame_height=");
        sb4.append(this.frame_height);
        sb4.append(", pause_count=");
        sb4.append(this.pause_count);
        sb4.append(", pause_duration_seconds=");
        sb4.append(this.pause_duration_seconds);
        sb4.append(", freeze_count=");
        sb4.append(this.freeze_count);
        sb4.append(", freeze_duration_seconds=");
        sb4.append(this.freeze_duration_seconds);
        sb4.append(", avg_jitter_buffer_delay=");
        return AbstractC30802r.m94763l(sb4, this.avg_jitter_buffer_delay, ')');
    }
}
