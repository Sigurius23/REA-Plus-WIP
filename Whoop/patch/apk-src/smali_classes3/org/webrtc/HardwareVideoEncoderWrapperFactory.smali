.class Lorg/webrtc/HardwareVideoEncoderWrapperFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoEncoderFactory;


# static fields
.field private static final TAG:Ljava/lang/String; = "HardwareVideoEncoderWrapperFactory"


# instance fields
.field private final factory:Lorg/webrtc/HardwareVideoEncoderFactory;

.field private final resolutionPixelAlignment:I


# direct methods
.method public constructor <init>(Lorg/webrtc/HardwareVideoEncoderFactory;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/HardwareVideoEncoderWrapperFactory;->factory:Lorg/webrtc/HardwareVideoEncoderFactory;

    iput p2, p0, Lorg/webrtc/HardwareVideoEncoderWrapperFactory;->resolutionPixelAlignment:I

    if-eqz p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "resolutionPixelAlignment should not be 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lorg/webrtc/HardwareVideoEncoderWrapperFactory;->factory:Lorg/webrtc/HardwareVideoEncoderFactory;

    invoke-virtual {v1, p1}, Lorg/webrtc/HardwareVideoEncoderFactory;->createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lorg/webrtc/HardwareVideoEncoderWrapper;

    iget v2, p0, Lorg/webrtc/HardwareVideoEncoderWrapperFactory;->resolutionPixelAlignment:I

    invoke-direct {v1, p1, v2}, Lorg/webrtc/HardwareVideoEncoderWrapper;-><init>(Lorg/webrtc/VideoEncoder;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    const-string v1, "HardwareVideoEncoderWrapperFactory"

    const-string v2, "createEncoder failed"

    invoke-static {v1, v2, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapperFactory;->factory:Lorg/webrtc/HardwareVideoEncoderFactory;

    invoke-virtual {v0}, Lorg/webrtc/HardwareVideoEncoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v0

    return-object v0
.end method
