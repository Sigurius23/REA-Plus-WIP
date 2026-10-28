.class final Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoEncoder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StreamEncoderWrapper"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0008\u0010\u0014\u001a\u00020\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00102\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0008\u0010\u001f\u001a\u00020 H\u0016J\u0008\u0010!\u001a\u00020\"H\u0016J\u0008\u0010#\u001a\u00020$H\u0016J\u0008\u0010%\u001a\u00020&H\u0016J\u0012\u0010\'\u001a\u00020\u00102\u0008\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0013\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+H\u0016\u00a2\u0006\u0002\u0010-J\u0008\u0010.\u001a\u00020/H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u00060"
    }
    d2 = {
        "Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;",
        "Lhms/webrtc/VideoEncoder;",
        "encoder",
        "<init>",
        "(Lhms/webrtc/VideoEncoder;)V",
        "executor",
        "Ljava/util/concurrent/ExecutorService;",
        "getExecutor",
        "()Ljava/util/concurrent/ExecutorService;",
        "streamSettings",
        "Lhms/webrtc/VideoEncoder$Settings;",
        "getStreamSettings",
        "()Lhms/webrtc/VideoEncoder$Settings;",
        "setStreamSettings",
        "(Lhms/webrtc/VideoEncoder$Settings;)V",
        "initEncode",
        "Lhms/webrtc/VideoCodecStatus;",
        "settings",
        "callback",
        "Lhms/webrtc/VideoEncoder$Callback;",
        "release",
        "encode",
        "frame",
        "Lhms/webrtc/VideoFrame;",
        "encodeInfo",
        "Lhms/webrtc/VideoEncoder$EncodeInfo;",
        "setRateAllocation",
        "allocation",
        "Lhms/webrtc/VideoEncoder$BitrateAllocation;",
        "frameRate",
        "",
        "getScalingSettings",
        "Lhms/webrtc/VideoEncoder$ScalingSettings;",
        "getImplementationName",
        "",
        "createNativeVideoEncoder",
        "",
        "isHardwareEncoder",
        "",
        "setRates",
        "rcParameters",
        "Lhms/webrtc/VideoEncoder$RateControlParameters;",
        "getResolutionBitrateLimits",
        "",
        "Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;",
        "()[Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;",
        "getEncoderInfo",
        "Lhms/webrtc/VideoEncoder$EncoderInfo;",
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
.field private final encoder:Lhms/webrtc/VideoEncoder;

.field private final executor:Ljava/util/concurrent/ExecutorService;

.field private streamSettings:Lhms/webrtc/VideoEncoder$Settings;


# direct methods
.method public constructor <init>(Lhms/webrtc/VideoEncoder;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    const-string v0, "newSingleThreadExecutor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic a(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$RateControlParameters;)Lhms/webrtc/VideoCodecStatus;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->setRates$lambda$8(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$RateControlParameters;)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoCodecStatus;
    .locals 0

    invoke-static {p0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->release$lambda$1(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoEncoder$EncoderInfo;
    .locals 0

    invoke-static {p0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->getEncoderInfo$lambda$10(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoEncoder$EncoderInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final createNativeVideoEncoder$lambda$6(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/Long;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0}, Lhms/webrtc/VideoEncoder;->createNativeVideoEncoder()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->getImplementationName$lambda$5(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->createNativeVideoEncoder$lambda$6(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method private static final encode$lambda$2(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoEncoder$EncodeInfo;)Lhms/webrtc/VideoCodecStatus;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->streamSettings:Lhms/webrtc/VideoEncoder$Settings;

    if-nez v0, :cond_0

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0, p1, p2}, Lhms/webrtc/VideoEncoder;->encode(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoEncoder$EncodeInfo;)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v0

    invoke-interface {v0}, Lhms/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v0

    iget-object v1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->streamSettings:Lhms/webrtc/VideoEncoder$Settings;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, v1, Lhms/webrtc/VideoEncoder$Settings;->width:I

    if-ne v0, v1, :cond_1

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0, p1, p2}, Lhms/webrtc/VideoEncoder;->encode(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoEncoder$EncodeInfo;)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v0

    invoke-interface {v0}, Lhms/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v3

    invoke-interface {v0}, Lhms/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v4

    iget-object v1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->streamSettings:Lhms/webrtc/VideoEncoder$Settings;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v5, v1, Lhms/webrtc/VideoEncoder$Settings;->width:I

    iget-object v1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->streamSettings:Lhms/webrtc/VideoEncoder$Settings;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v6, v1, Lhms/webrtc/VideoEncoder$Settings;->height:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v6}, Lhms/webrtc/VideoFrame$Buffer;->cropAndScale(IIIIII)Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v0

    new-instance v1, Lhms/webrtc/VideoFrame;

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getRotation()I

    move-result v2

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v3

    invoke-direct {v1, v0, v2, v3, v4}, Lhms/webrtc/VideoFrame;-><init>(Lhms/webrtc/VideoFrame$Buffer;IJ)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0, v1, p2}, Lhms/webrtc/VideoEncoder;->encode(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoEncoder$EncodeInfo;)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    invoke-interface {v0}, Lhms/webrtc/VideoFrame$Buffer;->release()V

    return-object p0
.end method

.method public static synthetic f(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoEncoder$ScalingSettings;
    .locals 0

    invoke-static {p0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->getScalingSettings$lambda$4(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoEncoder$ScalingSettings;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->isHardwareEncoder$lambda$7(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final getEncoderInfo$lambda$10(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoEncoder$EncoderInfo;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0}, Lhms/webrtc/VideoEncoder;->getEncoderInfo()Lhms/webrtc/VideoEncoder$EncoderInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final getImplementationName$lambda$5(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/String;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0}, Lhms/webrtc/VideoEncoder;->getImplementationName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final getResolutionBitrateLimits$lambda$9(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)[Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0}, Lhms/webrtc/VideoEncoder;->getResolutionBitrateLimits()[Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;

    move-result-object p0

    return-object p0
.end method

.method private static final getScalingSettings$lambda$4(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoEncoder$ScalingSettings;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0}, Lhms/webrtc/VideoEncoder;->getScalingSettings()Lhms/webrtc/VideoEncoder$ScalingSettings;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$BitrateAllocation;I)Lhms/webrtc/VideoCodecStatus;
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->setRateAllocation$lambda$3(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$BitrateAllocation;I)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)[Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;
    .locals 0

    invoke-static {p0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->getResolutionBitrateLimits$lambda$9(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)[Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;

    move-result-object p0

    return-object p0
.end method

.method private static final initEncode$lambda$0(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$Settings;Lhms/webrtc/VideoEncoder$Callback;)Lhms/webrtc/VideoCodecStatus;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "initEncode() thread="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "]\n                |  encoder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {v1}, Lhms/webrtc/VideoEncoder;->getImplementationName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n                |  streamSettings:\n                |    numberOfCores="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lhms/webrtc/VideoEncoder$Settings;->numberOfCores:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n                |    width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lhms/webrtc/VideoEncoder$Settings;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n                |    height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lhms/webrtc/VideoEncoder$Settings;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n                |    startBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lhms/webrtc/VideoEncoder$Settings;->startBitrate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n                |    maxFramerate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lhms/webrtc/VideoEncoder$Settings;->maxFramerate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n                |    automaticResizeOn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p1, Lhms/webrtc/VideoEncoder$Settings;->automaticResizeOn:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n                |    numberOfSimulcastStreams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Lhms/webrtc/VideoEncoder$Settings;->numberOfSimulcastStreams:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n                |    lossNotification="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lhms/webrtc/VideoEncoder$Settings;->capabilities:Lhms/webrtc/VideoEncoder$Capabilities;

    iget-boolean v1, v1, Lhms/webrtc/VideoEncoder$Capabilities;->lossNotification:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\n            "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/s;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SimulcastVideoEncoderFactoryWrapper"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0, p1, p2}, Lhms/webrtc/VideoEncoder;->initEncode(Lhms/webrtc/VideoEncoder$Settings;Lhms/webrtc/VideoEncoder$Callback;)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method private static final isHardwareEncoder$lambda$7(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0}, Lhms/webrtc/VideoEncoder;->isHardwareEncoder()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoEncoder$EncodeInfo;)Lhms/webrtc/VideoCodecStatus;
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encode$lambda$2(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoEncoder$EncodeInfo;)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$Settings;Lhms/webrtc/VideoEncoder$Callback;)Lhms/webrtc/VideoCodecStatus;
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->initEncode$lambda$0(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$Settings;Lhms/webrtc/VideoEncoder$Callback;)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method private static final release$lambda$1(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoCodecStatus;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0}, Lhms/webrtc/VideoEncoder;->release()Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method private static final setRateAllocation$lambda$3(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$BitrateAllocation;I)Lhms/webrtc/VideoCodecStatus;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0, p1, p2}, Lhms/webrtc/VideoEncoder;->setRateAllocation(Lhms/webrtc/VideoEncoder$BitrateAllocation;I)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method private static final setRates$lambda$8(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$RateControlParameters;)Lhms/webrtc/VideoCodecStatus;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->encoder:Lhms/webrtc/VideoEncoder;

    invoke-interface {p0, p1}, Lhms/webrtc/VideoEncoder;->setRates(Lhms/webrtc/VideoEncoder$RateControlParameters;)Lhms/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public createNativeVideoEncoder()J
    .locals 3

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/a;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Llive/hms/video/encoder/video/a;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public encode(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoEncoder$EncodeInfo;)Lhms/webrtc/VideoCodecStatus;
    .locals 3

    const-string v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, p2, v2}, Llive/hms/video/encoder/video/c;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "get(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhms/webrtc/VideoCodecStatus;

    return-object p1
.end method

.method public getEncoderInfo()Lhms/webrtc/VideoEncoder$EncoderInfo;
    .locals 3

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Llive/hms/video/encoder/video/a;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhms/webrtc/VideoEncoder$EncoderInfo;

    return-object v0
.end method

.method public final getExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public getImplementationName()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/a;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Llive/hms/video/encoder/video/a;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getResolutionBitrateLimits()[Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;
    .locals 3

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/a;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Llive/hms/video/encoder/video/a;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;

    return-object v0
.end method

.method public getScalingSettings()Lhms/webrtc/VideoEncoder$ScalingSettings;
    .locals 3

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Llive/hms/video/encoder/video/a;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhms/webrtc/VideoEncoder$ScalingSettings;

    return-object v0
.end method

.method public final getStreamSettings()Lhms/webrtc/VideoEncoder$Settings;
    .locals 1

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->streamSettings:Lhms/webrtc/VideoEncoder$Settings;

    return-object v0
.end method

.method public initEncode(Lhms/webrtc/VideoEncoder$Settings;Lhms/webrtc/VideoEncoder$Callback;)Lhms/webrtc/VideoCodecStatus;
    .locals 3

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->streamSettings:Lhms/webrtc/VideoEncoder$Settings;

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Llive/hms/video/encoder/video/c;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "get(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhms/webrtc/VideoCodecStatus;

    return-object p1
.end method

.method public isHardwareEncoder()Z
    .locals 3

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/a;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Llive/hms/video/encoder/video/a;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public release()Lhms/webrtc/VideoCodecStatus;
    .locals 3

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Llive/hms/video/encoder/video/a;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhms/webrtc/VideoCodecStatus;

    return-object v0
.end method

.method public setRateAllocation(Lhms/webrtc/VideoEncoder$BitrateAllocation;I)Lhms/webrtc/VideoCodecStatus;
    .locals 2

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/b;

    invoke-direct {v1, p0, p1, p2}, Llive/hms/video/encoder/video/b;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$BitrateAllocation;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "get(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhms/webrtc/VideoCodecStatus;

    return-object p1
.end method

.method public setRates(Lhms/webrtc/VideoEncoder$RateControlParameters;)Lhms/webrtc/VideoCodecStatus;
    .locals 2

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Llive/hms/video/encoder/video/d;

    invoke-direct {v1, p0, p1}, Llive/hms/video/encoder/video/d;-><init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$RateControlParameters;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhms/webrtc/VideoCodecStatus;

    return-object p1
.end method

.method public final setStreamSettings(Lhms/webrtc/VideoEncoder$Settings;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->streamSettings:Lhms/webrtc/VideoEncoder$Settings;

    return-void
.end method
