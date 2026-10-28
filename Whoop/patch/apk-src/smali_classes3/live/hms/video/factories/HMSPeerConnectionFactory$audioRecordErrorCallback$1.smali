.class public final Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;


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
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "live/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1",
        "Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;",
        "",
        "errorMessage",
        "Ll83/a0;",
        "onWebRtcAudioRecordInitError",
        "(Ljava/lang/String;)V",
        "Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStartErrorCode;",
        "errorCode",
        "onWebRtcAudioRecordStartError",
        "(Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStartErrorCode;Ljava/lang/String;)V",
        "onWebRtcAudioRecordError",
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

    iput-object p1, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onWebRtcAudioRecordError(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "audioRecordErrorCallback:: onWebRtcAudioRecordError:: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSPeerConnectionFactory"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {v0, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$sendMicCaptureFailedEvent(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/lang/String;)V

    return-void
.end method

.method public onWebRtcAudioRecordInitError(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "audioRecordErrorCallback:: onWebRtcAudioRecordError:: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSPeerConnectionFactory"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {v0, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$sendMicCaptureFailedEvent(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/lang/String;)V

    return-void
.end method

.method public onWebRtcAudioRecordStartError(Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStartErrorCode;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "audioRecordErrorCallback:: onWebRtcAudioRecordStartError:: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " ==> "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "HMSPeerConnectionFactory"

    invoke-static {p2, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Llive/hms/video/factories/HMSPeerConnectionFactory$audioRecordErrorCallback$1;->this$0:Llive/hms/video/factories/HMSPeerConnectionFactory;

    invoke-static {p2, p1}, Llive/hms/video/factories/HMSPeerConnectionFactory;->access$sendMicCaptureFailedEvent(Llive/hms/video/factories/HMSPeerConnectionFactory;Ljava/lang/String;)V

    return-void
.end method
