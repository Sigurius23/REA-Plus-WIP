.class Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapperFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoEncoderFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StreamEncoderWrapperFactory"
.end annotation


# instance fields
.field private final factory:Lorg/webrtc/VideoEncoderFactory;


# direct methods
.method public constructor <init>(Lorg/webrtc/VideoEncoderFactory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapperFactory;->factory:Lorg/webrtc/VideoEncoderFactory;

    return-void
.end method


# virtual methods
.method public createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapperFactory;->factory:Lorg/webrtc/VideoEncoderFactory;

    invoke-interface {v0, p1}, Lorg/webrtc/VideoEncoderFactory;->createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

    invoke-direct {v0, p1}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;-><init>(Lorg/webrtc/VideoEncoder;)V

    return-object v0
.end method

.method public getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapperFactory;->factory:Lorg/webrtc/VideoEncoderFactory;

    invoke-interface {v0}, Lorg/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v0

    return-object v0
.end method
