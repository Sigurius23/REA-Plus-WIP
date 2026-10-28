.class public interface abstract Llive/hms/video/connection/stats/clientside/model/SubscribeBaseSample;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/stats/clientside/model/BaseSample;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u0006\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0012\u0010\u0008\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0005R\u0012\u0010\u000c\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Llive/hms/video/connection/stats/clientside/model/SubscribeBaseSample;",
        "Llive/hms/video/connection/stats/clientside/model/BaseSample;",
        "audio_level_high_seconds",
        "",
        "getAudio_level_high_seconds",
        "()J",
        "audio_concealed_samples",
        "getAudio_concealed_samples",
        "audio_total_samples_received",
        "getAudio_total_samples_received",
        "audio_concealment_events",
        "getAudio_concealment_events",
        "fec_packets_discarded",
        "getFec_packets_discarded",
        "fec_packets_received",
        "getFec_packets_received",
        "total_samples_duration",
        "",
        "getTotal_samples_duration",
        "()F",
        "total_packets_received",
        "getTotal_packets_received",
        "total_packets_lost",
        "getTotal_packets_lost",
        "jitter_buffer_delay",
        "",
        "getJitter_buffer_delay",
        "()D",
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
.method public abstract getAudio_concealed_samples()J
.end method

.method public abstract getAudio_concealment_events()J
.end method

.method public abstract getAudio_level_high_seconds()J
.end method

.method public abstract getAudio_total_samples_received()J
.end method

.method public abstract getFec_packets_discarded()J
.end method

.method public abstract getFec_packets_received()J
.end method

.method public abstract getJitter_buffer_delay()D
.end method

.method public abstract getTotal_packets_lost()J
.end method

.method public abstract getTotal_packets_received()J
.end method

.method public abstract getTotal_samples_duration()F
.end method
