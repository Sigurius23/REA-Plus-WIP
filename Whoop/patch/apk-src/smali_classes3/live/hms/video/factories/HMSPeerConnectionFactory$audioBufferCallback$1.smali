.class public final Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/audio/WebRtcAudioRecord$AudioBufferCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/factories/HMSPeerConnectionFactory;-><init>(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "live/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1",
        "Lhms/webrtc/audio/WebRtcAudioRecord$AudioBufferCallback;",
        "Ljava/nio/ByteBuffer;",
        "micByteBuffer",
        "",
        "micBytesRead",
        "Ll83/a0;",
        "onBuffer",
        "(Ljava/nio/ByteBuffer;I)V",
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


# instance fields
.field final synthetic this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;


# direct methods
.method public constructor <init>(Llive/hms/video/factories/HMSPeerConnectionFactory;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBuffer(Ljava/nio/ByteBuffer;I)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$get_audioMixingMode$p(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/sdk/models/enums/AudioMixingMode;

    move-result-object p2

    sget-object v2, Llive/hms/video/sdk/models/enums/AudioMixingMode;->TALK_AND_MUSIC:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    const-string v3, "AudioMixing"

    if-eq p2, v2, :cond_1

    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$get_audioMixingMode$p(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/sdk/models/enums/AudioMixingMode;

    move-result-object p2

    sget-object v2, Llive/hms/video/sdk/models/enums/AudioMixingMode;->MUSIC_ONLY:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Not Mixing system audio and mic data :: TALK_MODE"

    invoke-static {v3, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    :goto_0
    const-string p2, "Mixing system audio and mic data"

    invoke-static {v3, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$getWavCapturer(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/media/capturers/HMSWavCapturer;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$getWavCapturer(Llive/hms/video/factories/HMSPeerConnectionFactory;)Llive/hms/video/media/capturers/HMSWavCapturer;

    move-result-object p2

    iget-object v2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {v2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$getSystemAudioByteBuffer$p(Llive/hms/video/factories/HMSPeerConnectionFactory;)Ljava/nio/ByteBuffer;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p2, v2}, Llive/hms/video/media/capturers/HMSWavCapturer;->readNext10ms(Ljava/nio/ByteBuffer;)Z

    goto :goto_1

    :cond_2
    const-string p1, "systemAudioByteBuffer"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_3
    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$getWebrtcAudioRecord(Llive/hms/video/factories/HMSPeerConnectionFactory;)Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object p2

    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Lhms/webrtc/audio/WebRtcAudioRecord;->isMixingNeeded(Z)V

    :goto_1
    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$isSystemAudioCaptureEnabled$p(Llive/hms/video/factories/HMSPeerConnectionFactory;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_4

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt p2, v2, :cond_4

    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$getWebrtcAudioRecord(Llive/hms/video/factories/HMSPeerConnectionFactory;)Lhms/webrtc/audio/WebRtcAudioRecord;

    move-result-object p2

    const/4 v2, 0x1

    invoke-virtual {p2, v2}, Lhms/webrtc/audio/WebRtcAudioRecord;->isMixingNeeded(Z)V

    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$captureSystemAudio(Llive/hms/video/factories/HMSPeerConnectionFactory;)V

    :cond_4
    if-eqz p1, :cond_5

    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioBufferCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$mixAudioBytes(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/nio/ByteBuffer;)V

    :cond_5
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long/2addr p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " Callback took "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " ms to finish"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "HMSPeerConnectionFactory"

    invoke-static {p2, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
