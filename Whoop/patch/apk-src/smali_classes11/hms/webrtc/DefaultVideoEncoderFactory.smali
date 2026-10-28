.class public Lhms/webrtc/DefaultVideoEncoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoEncoderFactory;


# instance fields
.field private final hardwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

.field private final softwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;


# direct methods
.method public constructor <init>(Lhms/webrtc/EglBase$Context;ZZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lhms/webrtc/SoftwareVideoEncoderFactory;

    invoke-direct {v0}, Lhms/webrtc/SoftwareVideoEncoderFactory;-><init>()V

    iput-object v0, p0, Lhms/webrtc/DefaultVideoEncoderFactory;->softwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    .line 3
    new-instance v0, Lhms/webrtc/HardwareVideoEncoderFactory;

    invoke-direct {v0, p1, p2, p3}, Lhms/webrtc/HardwareVideoEncoderFactory;-><init>(Lhms/webrtc/EglBase$Context;ZZ)V

    iput-object v0, p0, Lhms/webrtc/DefaultVideoEncoderFactory;->hardwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    return-void
.end method

.method public constructor <init>(Lhms/webrtc/VideoEncoderFactory;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lhms/webrtc/SoftwareVideoEncoderFactory;

    invoke-direct {v0}, Lhms/webrtc/SoftwareVideoEncoderFactory;-><init>()V

    iput-object v0, p0, Lhms/webrtc/DefaultVideoEncoderFactory;->softwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    .line 6
    iput-object p1, p0, Lhms/webrtc/DefaultVideoEncoderFactory;->hardwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    return-void
.end method


# virtual methods
.method public createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;
    .locals 2

    iget-object v0, p0, Lhms/webrtc/DefaultVideoEncoderFactory;->softwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v0, p1}, Lhms/webrtc/VideoEncoderFactory;->createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/DefaultVideoEncoderFactory;->hardwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v1, p1}, Lhms/webrtc/VideoEncoderFactory;->createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;

    move-result-object p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    new-instance v1, Lhms/webrtc/VideoEncoderFallback;

    invoke-direct {v1, v0, p1}, Lhms/webrtc/VideoEncoderFallback;-><init>(Lhms/webrtc/VideoEncoder;Lhms/webrtc/VideoEncoder;)V

    return-object v1

    :cond_0
    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v1, p0, Lhms/webrtc/DefaultVideoEncoderFactory;->softwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v1}, Lhms/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lhms/webrtc/DefaultVideoEncoderFactory;->hardwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v1}, Lhms/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    new-array v1, v1, [Lhms/webrtc/VideoCodecInfo;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/VideoCodecInfo;

    return-object v0
.end method
