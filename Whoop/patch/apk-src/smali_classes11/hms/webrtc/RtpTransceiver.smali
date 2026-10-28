.class public Lhms/webrtc/RtpTransceiver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;,
        Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;
    }
.end annotation


# instance fields
.field private cachedReceiver:Lhms/webrtc/RtpReceiver;

.field private cachedSender:Lhms/webrtc/RtpSender;

.field private nativeRtpTransceiver:J


# direct methods
.method public constructor <init>(J)V
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {p1, p2}, Lhms/webrtc/RtpTransceiver;->nativeGetSender(J)Lhms/webrtc/RtpSender;

    move-result-object v0

    iput-object v0, p0, Lhms/webrtc/RtpTransceiver;->cachedSender:Lhms/webrtc/RtpSender;

    invoke-static {p1, p2}, Lhms/webrtc/RtpTransceiver;->nativeGetReceiver(J)Lhms/webrtc/RtpReceiver;

    move-result-object p1

    iput-object p1, p0, Lhms/webrtc/RtpTransceiver;->cachedReceiver:Lhms/webrtc/RtpReceiver;

    return-void
.end method

.method private checkRtpTransceiverExists()V
    .locals 4

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RtpTransceiver has been disposed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static native nativeCurrentDirection(J)Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;
.end method

.method private static native nativeDirection(J)Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;
.end method

.method private static native nativeGetMediaType(J)Lhms/webrtc/MediaStreamTrack$MediaType;
.end method

.method private static native nativeGetMid(J)Ljava/lang/String;
.end method

.method private static native nativeGetReceiver(J)Lhms/webrtc/RtpReceiver;
.end method

.method private static native nativeGetSender(J)Lhms/webrtc/RtpSender;
.end method

.method private static native nativeSetDirection(JLhms/webrtc/RtpTransceiver$RtpTransceiverDirection;)Z
.end method

.method private static native nativeStopInternal(J)V
.end method

.method private static native nativeStopStandard(J)V
.end method

.method private static native nativeStopped(J)Z
.end method


# virtual methods
.method public dispose()V
    .locals 2
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-object v0, p0, Lhms/webrtc/RtpTransceiver;->cachedSender:Lhms/webrtc/RtpSender;

    invoke-virtual {v0}, Lhms/webrtc/RtpSender;->dispose()V

    iget-object v0, p0, Lhms/webrtc/RtpTransceiver;->cachedReceiver:Lhms/webrtc/RtpReceiver;

    invoke-virtual {v0}, Lhms/webrtc/RtpReceiver;->dispose()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lhms/webrtc/JniCommon;->nativeReleaseRef(J)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    return-void
.end method

.method public getCurrentDirection()Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpTransceiver;->nativeCurrentDirection(J)Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;

    move-result-object v0

    return-object v0
.end method

.method public getDirection()Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpTransceiver;->nativeDirection(J)Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;

    move-result-object v0

    return-object v0
.end method

.method public getMediaType()Lhms/webrtc/MediaStreamTrack$MediaType;
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpTransceiver;->nativeGetMediaType(J)Lhms/webrtc/MediaStreamTrack$MediaType;

    move-result-object v0

    return-object v0
.end method

.method public getMid()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpTransceiver;->nativeGetMid(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getReceiver()Lhms/webrtc/RtpReceiver;
    .locals 1

    iget-object v0, p0, Lhms/webrtc/RtpTransceiver;->cachedReceiver:Lhms/webrtc/RtpReceiver;

    return-object v0
.end method

.method public getSender()Lhms/webrtc/RtpSender;
    .locals 1

    iget-object v0, p0, Lhms/webrtc/RtpTransceiver;->cachedSender:Lhms/webrtc/RtpSender;

    return-object v0
.end method

.method public isStopped()Z
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpTransceiver;->nativeStopped(J)Z

    move-result v0

    return v0
.end method

.method public setDirection(Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;)Z
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1, p1}, Lhms/webrtc/RtpTransceiver;->nativeSetDirection(JLhms/webrtc/RtpTransceiver$RtpTransceiverDirection;)Z

    move-result p1

    return p1
.end method

.method public stop()V
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpTransceiver;->nativeStopInternal(J)V

    return-void
.end method

.method public stopInternal()V
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpTransceiver;->nativeStopInternal(J)V

    return-void
.end method

.method public stopStandard()V
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpTransceiver;->checkRtpTransceiverExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpTransceiver;->nativeRtpTransceiver:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpTransceiver;->nativeStopStandard(J)V

    return-void
.end method
