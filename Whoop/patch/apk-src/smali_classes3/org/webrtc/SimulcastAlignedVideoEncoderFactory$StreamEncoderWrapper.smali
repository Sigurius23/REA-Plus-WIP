.class Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoEncoder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StreamEncoderWrapper"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "StreamEncoderWrapper"


# instance fields
.field private final encoder:Lorg/webrtc/VideoEncoder;

.field private final executor:Ljava/util/concurrent/ExecutorService;

.field private streamSettings:Lorg/webrtc/VideoEncoder$Settings;


# direct methods
.method public constructor <init>(Lorg/webrtc/VideoEncoder;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    iput-object p1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->encoder:Lorg/webrtc/VideoEncoder;

    return-void
.end method

.method public static synthetic a(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->lambda$initEncode$0(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    invoke-direct {p0}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->lambda$release$1()Lorg/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->lambda$getImplementationName$5()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;)Lorg/webrtc/VideoEncoder$ScalingSettings;
    .locals 0

    invoke-direct {p0}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->lambda$getScalingSettings$4()Lorg/webrtc/VideoEncoder$ScalingSettings;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->lambda$setRateAllocation$3(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->lambda$encode$2(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p0

    return-object p0
.end method

.method private synthetic lambda$encode$2(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->streamSettings:Lorg/webrtc/VideoEncoder$Settings;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v0

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v0

    iget-object v1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->streamSettings:Lorg/webrtc/VideoEncoder$Settings;

    iget v1, v1, Lorg/webrtc/VideoEncoder$Settings;->width:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->encoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v0

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v0

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v5

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v1

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->streamSettings:Lorg/webrtc/VideoEncoder$Settings;

    iget v6, v0, Lorg/webrtc/VideoEncoder$Settings;->width:I

    iget v7, v0, Lorg/webrtc/VideoEncoder$Settings;->height:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface/range {v1 .. v7}, Lorg/webrtc/VideoFrame$Buffer;->cropAndScale(IIIIII)Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v0

    new-instance v1, Lorg/webrtc/VideoFrame;

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotation()I

    move-result v2

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v3

    invoke-direct {v1, v0, v2, v3, v4}, Lorg/webrtc/VideoFrame;-><init>(Lorg/webrtc/VideoFrame$Buffer;IJ)V

    iget-object p1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->encoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {p1, v1, p2}, Lorg/webrtc/VideoEncoder;->encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->release()V

    return-object p1

    :cond_1
    sget-object p1, Lorg/webrtc/VideoCodecStatus;->ERROR:Lorg/webrtc/VideoCodecStatus;

    return-object p1
.end method

.method private synthetic lambda$getImplementationName$5()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->encoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->getImplementationName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private synthetic lambda$getScalingSettings$4()Lorg/webrtc/VideoEncoder$ScalingSettings;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->encoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->getScalingSettings()Lorg/webrtc/VideoEncoder$ScalingSettings;

    move-result-object v0

    return-object v0
.end method

.method private synthetic lambda$initEncode$0(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    const-string v3, "initEncode() thread="

    const-string v4, " ["

    invoke-static {v3, v0, v1, v2, v4}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StreamEncoderWrapper"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->encoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->getImplementationName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "  encoder="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "  streamSettings:"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p1, Lorg/webrtc/VideoEncoder$Settings;->numberOfCores:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    numberOfCores="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p1, Lorg/webrtc/VideoEncoder$Settings;->width:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    width="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p1, Lorg/webrtc/VideoEncoder$Settings;->height:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    height="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p1, Lorg/webrtc/VideoEncoder$Settings;->startBitrate:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    startBitrate="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p1, Lorg/webrtc/VideoEncoder$Settings;->maxFramerate:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    maxFramerate="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p1, Lorg/webrtc/VideoEncoder$Settings;->automaticResizeOn:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    automaticResizeOn="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p1, Lorg/webrtc/VideoEncoder$Settings;->numberOfSimulcastStreams:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    numberOfSimulcastStreams="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p1, Lorg/webrtc/VideoEncoder$Settings;->capabilities:Lorg/webrtc/VideoEncoder$Capabilities;

    iget-boolean v0, v0, Lorg/webrtc/VideoEncoder$Capabilities;->lossNotification:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "    lossNotification="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->encoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method

.method private synthetic lambda$release$1()Lorg/webrtc/VideoCodecStatus;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->encoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->release()Lorg/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0
.end method

.method private synthetic lambda$setRateAllocation$3(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->encoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->setRateAllocation(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;
    .locals 2

    new-instance v0, Lorg/webrtc/q;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p2, v1}, Lorg/webrtc/q;-><init>(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Ljava/lang/Object;Ljava/lang/Object;I)V

    :try_start_0
    iget-object p1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/webrtc/VideoCodecStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    sget-object p1, Lorg/webrtc/VideoCodecStatus;->ERROR:Lorg/webrtc/VideoCodecStatus;

    return-object p1
.end method

.method public getImplementationName()Ljava/lang/String;
    .locals 2

    new-instance v0, Lorg/webrtc/p;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lorg/webrtc/p;-><init>(Ljava/lang/Object;I)V

    :try_start_0
    iget-object v1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getScalingSettings()Lorg/webrtc/VideoEncoder$ScalingSettings;
    .locals 2

    new-instance v0, Lorg/webrtc/p;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/webrtc/p;-><init>(Ljava/lang/Object;I)V

    :try_start_0
    iget-object v1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/VideoEncoder$ScalingSettings;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;
    .locals 2

    iput-object p1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->streamSettings:Lorg/webrtc/VideoEncoder$Settings;

    new-instance v0, Lorg/webrtc/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lorg/webrtc/q;-><init>(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Ljava/lang/Object;Ljava/lang/Object;I)V

    :try_start_0
    iget-object p1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/webrtc/VideoCodecStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    sget-object p1, Lorg/webrtc/VideoCodecStatus;->ERROR:Lorg/webrtc/VideoCodecStatus;

    return-object p1
.end method

.method public release()Lorg/webrtc/VideoCodecStatus;
    .locals 2

    new-instance v0, Lorg/webrtc/p;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lorg/webrtc/p;-><init>(Ljava/lang/Object;I)V

    :try_start_0
    iget-object v1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/VideoCodecStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lorg/webrtc/VideoCodecStatus;->ERROR:Lorg/webrtc/VideoCodecStatus;

    return-object v0
.end method

.method public setRateAllocation(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;
    .locals 1

    new-instance v0, Lorg/webrtc/s;

    invoke-direct {v0, p0, p1, p2}, Lorg/webrtc/s;-><init>(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Lorg/webrtc/VideoEncoder$BitrateAllocation;I)V

    :try_start_0
    iget-object p1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->executor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/webrtc/VideoCodecStatus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    sget-object p1, Lorg/webrtc/VideoCodecStatus;->ERROR:Lorg/webrtc/VideoCodecStatus;

    return-object p1
.end method
