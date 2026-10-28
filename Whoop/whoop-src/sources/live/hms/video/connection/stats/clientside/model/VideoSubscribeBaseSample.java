package live.hms.video.connection.stats.clientside.model;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0012\u0010\u0012\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0012\u0010\u0014\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0012\u0010\u0016\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0012\u0010\u0018\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0012\u0010\u001c\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0012\u0010\u001e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005¨\u0006 "}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/VideoSubscribeBaseSample;", "Llive/hms/video/connection/stats/clientside/model/BaseSample;", "avg_frames_received_per_sec", "", "getAvg_frames_received_per_sec", "()F", "avg_frames_dropped_per_sec", "getAvg_frames_dropped_per_sec", "avg_frames_decoded_per_sec", "getAvg_frames_decoded_per_sec", "total_pli_count", "", "getTotal_pli_count", "()I", "total_nack_count", "getTotal_nack_count", "avg_av_sync_ms", "getAvg_av_sync_ms", "frame_width", "getFrame_width", "frame_height", "getFrame_height", "pause_count", "getPause_count", "pause_duration_seconds", "getPause_duration_seconds", "freeze_count", "getFreeze_count", "freeze_duration_seconds", "getFreeze_duration_seconds", "avg_jitter_buffer_delay", "getAvg_jitter_buffer_delay", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface VideoSubscribeBaseSample extends BaseSample {
    int getAvg_av_sync_ms();

    float getAvg_frames_decoded_per_sec();

    float getAvg_frames_dropped_per_sec();

    float getAvg_frames_received_per_sec();

    float getAvg_jitter_buffer_delay();

    int getFrame_height();

    int getFrame_width();

    int getFreeze_count();

    float getFreeze_duration_seconds();

    int getPause_count();

    float getPause_duration_seconds();

    int getTotal_nack_count();

    int getTotal_pli_count();
}
