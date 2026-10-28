.class public Lhms/webrtc/RtpSender;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cachedTrack:Lhms/webrtc/MediaStreamTrack;

.field private final dtmfSender:Lhms/webrtc/DtmfSender;

.field private nativeRtpSender:J

.field private ownsTrack:Z


# direct methods
.method public constructor <init>(J)V
    .locals 4
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhms/webrtc/RtpSender;->ownsTrack:Z

    iput-wide p1, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {p1, p2}, Lhms/webrtc/RtpSender;->nativeGetTrack(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lhms/webrtc/MediaStreamTrack;->createMediaStreamTrack(J)Lhms/webrtc/MediaStreamTrack;

    move-result-object v0

    iput-object v0, p0, Lhms/webrtc/RtpSender;->cachedTrack:Lhms/webrtc/MediaStreamTrack;

    invoke-static {p1, p2}, Lhms/webrtc/RtpSender;->nativeGetMediaType(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lhms/webrtc/RtpSender;->nativeGetDtmfSender(J)J

    move-result-wide p1

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-eqz v0, :cond_0

    new-instance v1, Lhms/webrtc/DtmfSender;

    invoke-direct {v1, p1, p2}, Lhms/webrtc/DtmfSender;-><init>(J)V

    :cond_0
    iput-object v1, p0, Lhms/webrtc/RtpSender;->dtmfSender:Lhms/webrtc/DtmfSender;

    return-void

    :cond_1
    iput-object v1, p0, Lhms/webrtc/RtpSender;->dtmfSender:Lhms/webrtc/DtmfSender;

    return-void
.end method

.method private checkRtpSenderExists()V
    .locals 4

    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RtpSender has been disposed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static native nativeGetDtmfSender(J)J
.end method

.method private static native nativeGetId(J)Ljava/lang/String;
.end method

.method private static native nativeGetMediaType(J)Ljava/lang/String;
.end method

.method private static native nativeGetParameters(J)Lhms/webrtc/RtpParameters;
.end method

.method private static native nativeGetStreams(J)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method private static native nativeGetTrack(J)J
.end method

.method private static native nativeSetFrameEncryptor(JJ)V
.end method

.method private static native nativeSetParameters(JLhms/webrtc/RtpParameters;)Z
.end method

.method private static native nativeSetStreams(JLjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method private static native nativeSetTrack(JJ)Z
.end method


# virtual methods
.method public dispose()V
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpSender;->checkRtpSenderExists()V

    iget-object v0, p0, Lhms/webrtc/RtpSender;->dtmfSender:Lhms/webrtc/DtmfSender;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhms/webrtc/DtmfSender;->dispose()V

    :cond_0
    iget-object v0, p0, Lhms/webrtc/RtpSender;->cachedTrack:Lhms/webrtc/MediaStreamTrack;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lhms/webrtc/RtpSender;->ownsTrack:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lhms/webrtc/MediaStreamTrack;->dispose()V

    :cond_1
    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1}, Lhms/webrtc/JniCommon;->nativeReleaseRef(J)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    return-void
.end method

.method public dtmf()Lhms/webrtc/DtmfSender;
    .locals 1

    iget-object v0, p0, Lhms/webrtc/RtpSender;->dtmfSender:Lhms/webrtc/DtmfSender;

    return-object v0
.end method

.method public getNativeRtpSender()J
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpSender;->checkRtpSenderExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    return-wide v0
.end method

.method public getParameters()Lhms/webrtc/RtpParameters;
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpSender;->checkRtpSenderExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpSender;->nativeGetParameters(J)Lhms/webrtc/RtpParameters;

    move-result-object v0

    return-object v0
.end method

.method public getStreams()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lhms/webrtc/RtpSender;->checkRtpSenderExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpSender;->nativeGetStreams(J)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public id()Ljava/lang/String;
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpSender;->checkRtpSenderExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1}, Lhms/webrtc/RtpSender;->nativeGetId(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setFrameEncryptor(Lhms/webrtc/FrameEncryptor;)V
    .locals 4

    invoke-direct {p0}, Lhms/webrtc/RtpSender;->checkRtpSenderExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    invoke-interface {p1}, Lhms/webrtc/FrameEncryptor;->getNativeFrameEncryptor()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lhms/webrtc/RtpSender;->nativeSetFrameEncryptor(JJ)V

    return-void
.end method

.method public setParameters(Lhms/webrtc/RtpParameters;)Z
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/RtpSender;->checkRtpSenderExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1, p1}, Lhms/webrtc/RtpSender;->nativeSetParameters(JLhms/webrtc/RtpParameters;)Z

    move-result p1

    return p1
.end method

.method public setStreams(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lhms/webrtc/RtpSender;->checkRtpSenderExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    invoke-static {v0, v1, p1}, Lhms/webrtc/RtpSender;->nativeSetStreams(JLjava/util/List;)V

    return-void
.end method

.method public setTrack(Lhms/webrtc/MediaStreamTrack;Z)Z
    .locals 4

    invoke-direct {p0}, Lhms/webrtc/RtpSender;->checkRtpSenderExists()V

    iget-wide v0, p0, Lhms/webrtc/RtpSender;->nativeRtpSender:J

    if-nez p1, :cond_0

    const-wide/16 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lhms/webrtc/MediaStreamTrack;->getNativeMediaStreamTrack()J

    move-result-wide v2

    :goto_0
    invoke-static {v0, v1, v2, v3}, Lhms/webrtc/RtpSender;->nativeSetTrack(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Lhms/webrtc/RtpSender;->cachedTrack:Lhms/webrtc/MediaStreamTrack;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lhms/webrtc/RtpSender;->ownsTrack:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lhms/webrtc/MediaStreamTrack;->dispose()V

    :cond_2
    iput-object p1, p0, Lhms/webrtc/RtpSender;->cachedTrack:Lhms/webrtc/MediaStreamTrack;

    iput-boolean p2, p0, Lhms/webrtc/RtpSender;->ownsTrack:Z

    const/4 p1, 0x1

    return p1
.end method

.method public track()Lhms/webrtc/MediaStreamTrack;
    .locals 1

    iget-object v0, p0, Lhms/webrtc/RtpSender;->cachedTrack:Lhms/webrtc/MediaStreamTrack;

    return-object v0
.end method
