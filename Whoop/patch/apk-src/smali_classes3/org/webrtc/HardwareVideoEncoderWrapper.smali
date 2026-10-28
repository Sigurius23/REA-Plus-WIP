.class Lorg/webrtc/HardwareVideoEncoderWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoEncoder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "HardwareVideoEncoderWrapper"


# instance fields
.field private final alignment:I

.field private calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

.field private final internalEncoder:Lorg/webrtc/VideoEncoder;


# direct methods
.method public constructor <init>(Lorg/webrtc/VideoEncoder;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;-><init>(III)V

    iput-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    iput-object p1, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    iput p2, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->alignment:I

    return-void
.end method

.method public static synthetic a(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/webrtc/HardwareVideoEncoderWrapper;->lambda$encode$2(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)V

    return-void
.end method

.method public static synthetic b(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/webrtc/HardwareVideoEncoderWrapper;->lambda$encode$3(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)V

    return-void
.end method

.method public static synthetic c(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/webrtc/HardwareVideoEncoderWrapper;->lambda$initEncode$0(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)V

    return-void
.end method

.method public static synthetic d(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/webrtc/HardwareVideoEncoderWrapper;->lambda$initEncode$1(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)V

    return-void
.end method

.method private synthetic lambda$encode$2(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;

    return-void
.end method

.method private synthetic lambda$encode$3(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;

    return-void
.end method

.method private synthetic lambda$initEncode$0(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;

    return-void
.end method

.method private synthetic lambda$initEncode$1(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;

    return-void
.end method

.method private retryWithoutCropping(IILjava/lang/Runnable;)Lorg/webrtc/VideoCodecStatus;
    .locals 2

    const-string v0, "HardwareVideoEncoderWrapper"

    const-string v1, "retrying without resolution adjustment"

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p2}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;-><init>(III)V

    iput-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    sget-object p1, Lorg/webrtc/VideoCodecStatus;->OK:Lorg/webrtc/VideoCodecStatus;

    return-object p1
.end method


# virtual methods
.method public createNative(J)J
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->createNative(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;
    .locals 9

    const-string v1, "HardwareVideoEncoderWrapper"

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v2

    invoke-interface {v2}, Lorg/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v3

    invoke-interface {v3}, Lorg/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->hasFrameSizeChanged(II)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    iget v2, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->alignment:I

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v3

    invoke-interface {v3}, Lorg/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v4

    invoke-interface {v4}, Lorg/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v4

    invoke-direct {v0, v2, v3, v4}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;-><init>(III)V

    iput-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    :cond_0
    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-virtual {v0}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->isCropRequired()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-virtual {v0}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->getCroppedWidth()I

    move-result v5

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-virtual {v0}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->getCroppedHeight()I

    move-result v6

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v2

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-static {v0}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->a(Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;)I

    move-result v0

    div-int/lit8 v3, v0, 0x2

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-static {v0}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->b(Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;)I

    move-result v0

    div-int/lit8 v4, v0, 0x2

    move v7, v5

    move v8, v6

    invoke-interface/range {v2 .. v8}, Lorg/webrtc/VideoFrame$Buffer;->cropAndScale(IIIIII)Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v2

    new-instance v0, Lorg/webrtc/VideoFrame;

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotation()I

    move-result v3

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lorg/webrtc/VideoFrame;-><init>(Lorg/webrtc/VideoFrame$Buffer;IJ)V

    :try_start_0
    iget-object v3, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v3, v0, p2}, Lorg/webrtc/VideoEncoder;->encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;

    move-result-object v0

    sget-object v3, Lorg/webrtc/VideoCodecStatus;->FALLBACK_SOFTWARE:Lorg/webrtc/VideoCodecStatus;

    if-ne v0, v3, :cond_2

    const-string v0, "internalEncoder.encode() returned FALLBACK_SOFTWARE"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v0

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v3

    invoke-interface {v3}, Lorg/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v3

    new-instance v4, Lorg/webrtc/i;

    const/4 v5, 0x0

    invoke-direct {v4, p0, p1, p2, v5}, Lorg/webrtc/i;-><init>(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;I)V

    invoke-direct {p0, v0, v3, v4}, Lorg/webrtc/HardwareVideoEncoderWrapper;->retryWithoutCropping(IILjava/lang/Runnable;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2}, Lorg/webrtc/VideoFrame$Buffer;->release()V

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Lorg/webrtc/VideoFrame$Buffer;->release()V

    return-object v0

    :goto_0
    :try_start_1
    const-string v3, "internalEncoder.encode() failed"

    invoke-static {v1, v3, v0}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v0

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v1

    invoke-interface {v1}, Lorg/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v1

    new-instance v3, Lorg/webrtc/i;

    const/4 v4, 0x1

    invoke-direct {v3, p0, p1, p2, v4}, Lorg/webrtc/i;-><init>(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;I)V

    invoke-direct {p0, v0, v1, v3}, Lorg/webrtc/HardwareVideoEncoderWrapper;->retryWithoutCropping(IILjava/lang/Runnable;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v2}, Lorg/webrtc/VideoFrame$Buffer;->release()V

    return-object p1

    :goto_1
    invoke-interface {v2}, Lorg/webrtc/VideoFrame$Buffer;->release()V

    throw p1
.end method

.method public getEncoderInfo()Lorg/webrtc/VideoEncoder$EncoderInfo;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->getEncoderInfo()Lorg/webrtc/VideoEncoder$EncoderInfo;

    move-result-object v0

    return-object v0
.end method

.method public getImplementationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->getImplementationName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResolutionBitrateLimits()[Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->getResolutionBitrateLimits()[Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;

    move-result-object v0

    return-object v0
.end method

.method public getScalingSettings()Lorg/webrtc/VideoEncoder$ScalingSettings;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->getScalingSettings()Lorg/webrtc/VideoEncoder$ScalingSettings;

    move-result-object v0

    return-object v0
.end method

.method public initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;
    .locals 11

    const-string v1, "HardwareVideoEncoderWrapper"

    const-string v0, "internalEncoder.initEncode() returned FALLBACK_SOFTWARE: croppedSettings "

    new-instance v2, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    iget v3, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->alignment:I

    iget v4, p1, Lorg/webrtc/VideoEncoder$Settings;->width:I

    iget v5, p1, Lorg/webrtc/VideoEncoder$Settings;->height:I

    invoke-direct {v2, v3, v4, v5}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;-><init>(III)V

    iput-object v2, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-virtual {v2}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->isCropRequired()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v2, Lorg/webrtc/VideoEncoder$Settings;

    iget v3, p1, Lorg/webrtc/VideoEncoder$Settings;->numberOfCores:I

    iget-object v4, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-virtual {v4}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->getCroppedWidth()I

    move-result v4

    iget-object v5, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->calculator:Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;

    invoke-virtual {v5}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->getCroppedHeight()I

    move-result v5

    iget v6, p1, Lorg/webrtc/VideoEncoder$Settings;->startBitrate:I

    iget v7, p1, Lorg/webrtc/VideoEncoder$Settings;->maxFramerate:I

    iget v8, p1, Lorg/webrtc/VideoEncoder$Settings;->numberOfSimulcastStreams:I

    iget-boolean v9, p1, Lorg/webrtc/VideoEncoder$Settings;->automaticResizeOn:Z

    iget-object v10, p1, Lorg/webrtc/VideoEncoder$Settings;->capabilities:Lorg/webrtc/VideoEncoder$Capabilities;

    invoke-direct/range {v2 .. v10}, Lorg/webrtc/VideoEncoder$Settings;-><init>(IIIIIIZLorg/webrtc/VideoEncoder$Capabilities;)V

    :try_start_0
    iget-object v3, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v3, v2, p2}, Lorg/webrtc/VideoEncoder;->initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;

    move-result-object v3

    sget-object v4, Lorg/webrtc/VideoCodecStatus;->FALLBACK_SOFTWARE:Lorg/webrtc/VideoCodecStatus;

    if-ne v3, v4, :cond_1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p1, Lorg/webrtc/VideoEncoder$Settings;->width:I

    iget v2, p1, Lorg/webrtc/VideoEncoder$Settings;->height:I

    new-instance v3, Lorg/webrtc/j;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, p2, v4}, Lorg/webrtc/j;-><init>(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;I)V

    invoke-direct {p0, v0, v2, v3}, Lorg/webrtc/HardwareVideoEncoderWrapper;->retryWithoutCropping(IILjava/lang/Runnable;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    return-object v3

    :goto_0
    const-string v2, "internalEncoder.initEncode() failed"

    invoke-static {v1, v2, v0}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget v0, p1, Lorg/webrtc/VideoEncoder$Settings;->width:I

    iget v1, p1, Lorg/webrtc/VideoEncoder$Settings;->height:I

    new-instance v2, Lorg/webrtc/j;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p1, p2, v3}, Lorg/webrtc/j;-><init>(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;I)V

    invoke-direct {p0, v0, v1, v2}, Lorg/webrtc/HardwareVideoEncoderWrapper;->retryWithoutCropping(IILjava/lang/Runnable;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method

.method public isHardwareEncoder()Z
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->isHardwareEncoder()Z

    move-result v0

    return v0
.end method

.method public release()Lorg/webrtc/VideoCodecStatus;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoder;->release()Lorg/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0
.end method

.method public setRateAllocation(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1, p2}, Lorg/webrtc/VideoEncoder;->setRateAllocation(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method

.method public setRates(Lorg/webrtc/VideoEncoder$RateControlParameters;)Lorg/webrtc/VideoCodecStatus;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper;->internalEncoder:Lorg/webrtc/VideoEncoder;

    invoke-interface {v0, p1}, Lorg/webrtc/VideoEncoder;->setRates(Lorg/webrtc/VideoEncoder$RateControlParameters;)Lorg/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method
