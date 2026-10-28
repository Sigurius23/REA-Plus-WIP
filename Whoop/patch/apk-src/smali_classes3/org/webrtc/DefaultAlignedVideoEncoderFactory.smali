.class public Lorg/webrtc/DefaultAlignedVideoEncoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoEncoderFactory;


# instance fields
.field private final hardwareVideoEncoderFactory:Lorg/webrtc/VideoEncoderFactory;

.field private final softwareVideoEncoderFactory:Lorg/webrtc/VideoEncoderFactory;


# direct methods
.method public constructor <init>(Lorg/webrtc/EglBase$Context;ZZLorg/webrtc/ResolutionAdjustment;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lorg/webrtc/HardwareVideoEncoderFactory;

    invoke-direct {v0, p1, p2, p3}, Lorg/webrtc/HardwareVideoEncoderFactory;-><init>(Lorg/webrtc/EglBase$Context;ZZ)V

    sget-object p1, Lorg/webrtc/ResolutionAdjustment;->NONE:Lorg/webrtc/ResolutionAdjustment;

    if-ne p4, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/webrtc/HardwareVideoEncoderWrapperFactory;

    invoke-virtual {p4}, Lorg/webrtc/ResolutionAdjustment;->getValue()I

    move-result p2

    invoke-direct {p1, v0, p2}, Lorg/webrtc/HardwareVideoEncoderWrapperFactory;-><init>(Lorg/webrtc/HardwareVideoEncoderFactory;I)V

    move-object v0, p1

    :goto_0
    iput-object v0, p0, Lorg/webrtc/DefaultAlignedVideoEncoderFactory;->hardwareVideoEncoderFactory:Lorg/webrtc/VideoEncoderFactory;

    new-instance p1, Lorg/webrtc/SoftwareVideoEncoderFactory;

    invoke-direct {p1}, Lorg/webrtc/SoftwareVideoEncoderFactory;-><init>()V

    iput-object p1, p0, Lorg/webrtc/DefaultAlignedVideoEncoderFactory;->softwareVideoEncoderFactory:Lorg/webrtc/VideoEncoderFactory;

    return-void
.end method


# virtual methods
.method public createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;
    .locals 2

    iget-object v0, p0, Lorg/webrtc/DefaultAlignedVideoEncoderFactory;->softwareVideoEncoderFactory:Lorg/webrtc/VideoEncoderFactory;

    invoke-interface {v0, p1}, Lorg/webrtc/VideoEncoderFactory;->createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;

    move-result-object v0

    iget-object v1, p0, Lorg/webrtc/DefaultAlignedVideoEncoderFactory;->hardwareVideoEncoderFactory:Lorg/webrtc/VideoEncoderFactory;

    invoke-interface {v1, p1}, Lorg/webrtc/VideoEncoderFactory;->createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;

    move-result-object p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    new-instance v1, Lorg/webrtc/VideoEncoderFallback;

    invoke-direct {v1, v0, p1}, Lorg/webrtc/VideoEncoderFallback;-><init>(Lorg/webrtc/VideoEncoder;Lorg/webrtc/VideoEncoder;)V

    return-object v1

    :cond_0
    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v1, p0, Lorg/webrtc/DefaultAlignedVideoEncoderFactory;->softwareVideoEncoderFactory:Lorg/webrtc/VideoEncoderFactory;

    invoke-interface {v1}, Lorg/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lorg/webrtc/DefaultAlignedVideoEncoderFactory;->hardwareVideoEncoderFactory:Lorg/webrtc/VideoEncoderFactory;

    invoke-interface {v1}, Lorg/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    const/4 v1, 0x0

    new-array v1, v1, [Lorg/webrtc/VideoCodecInfo;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/VideoCodecInfo;

    return-object v0
.end method
