.class public interface abstract Llive/hms/video/connection/stats/clientside/model/VideoSubscribeBaseSample;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/stats/clientside/model/BaseSample;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0008f\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0012\u0010\u0008\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\rR\u0012\u0010\u0012\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\rR\u0012\u0010\u0014\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\rR\u0012\u0010\u0016\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\rR\u0012\u0010\u0018\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\rR\u0012\u0010\u001c\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0005R\u0012\u0010\u001e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0005\u00a8\u0006 "
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/model/VideoSubscribeBaseSample;",
        "Llive/hms/video/connection/stats/clientside/model/BaseSample;",
        "avg_frames_received_per_sec",
        "",
        "getAvg_frames_received_per_sec",
        "()F",
        "avg_frames_dropped_per_sec",
        "getAvg_frames_dropped_per_sec",
        "avg_frames_decoded_per_sec",
        "getAvg_frames_decoded_per_sec",
        "total_pli_count",
        "",
        "getTotal_pli_count",
        "()I",
        "total_nack_count",
        "getTotal_nack_count",
        "avg_av_sync_ms",
        "getAvg_av_sync_ms",
        "frame_width",
        "getFrame_width",
        "frame_height",
        "getFrame_height",
        "pause_count",
        "getPause_count",
        "pause_duration_seconds",
        "getPause_duration_seconds",
        "freeze_count",
        "getFreeze_count",
        "freeze_duration_seconds",
        "getFreeze_duration_seconds",
        "avg_jitter_buffer_delay",
        "getAvg_jitter_buffer_delay",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getAvg_av_sync_ms()I
.end method

.method public abstract getAvg_frames_decoded_per_sec()F
.end method

.method public abstract getAvg_frames_dropped_per_sec()F
.end method

.method public abstract getAvg_frames_received_per_sec()F
.end method

.method public abstract getAvg_jitter_buffer_delay()F
.end method

.method public abstract getFrame_height()I
.end method

.method public abstract getFrame_width()I
.end method

.method public abstract getFreeze_count()I
.end method

.method public abstract getFreeze_duration_seconds()F
.end method

.method public abstract getPause_count()I
.end method

.method public abstract getPause_duration_seconds()F
.end method

.method public abstract getTotal_nack_count()I
.end method

.method public abstract getTotal_pli_count()I
.end method
