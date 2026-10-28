.class public interface abstract Llive/hms/video/factories/noisecancellation/NoiseCancellation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/factories/noisecancellation/NoiseCancellation$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "",
        "",
        "enabled",
        "Lhms/webrtc/AudioProcessingFactory;",
        "getAudioProcessingFactory",
        "(Z)Lhms/webrtc/AudioProcessingFactory;",
        "Ll83/a0;",
        "setNoiseCancellationEnabled",
        "(Z)V",
        "getNoiseCancellationEnabled",
        "()Z",
        "",
        "getNcLogTag",
        "()Ljava/lang/String;",
        "ncLogTag",
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
.method public abstract getAudioProcessingFactory(Z)Lhms/webrtc/AudioProcessingFactory;
.end method

.method public abstract getNcLogTag()Ljava/lang/String;
.end method

.method public abstract getNoiseCancellationEnabled()Z
.end method

.method public abstract setNoiseCancellationEnabled(Z)V
.end method
