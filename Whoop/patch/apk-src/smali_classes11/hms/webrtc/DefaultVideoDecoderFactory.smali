.class public Lhms/webrtc/DefaultVideoDecoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoDecoderFactory;


# instance fields
.field private final hardwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

.field private final platformSoftwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

.field private final softwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;


# direct methods
.method public constructor <init>(Lhms/webrtc/EglBase$Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lhms/webrtc/SoftwareVideoDecoderFactory;

    invoke-direct {v0}, Lhms/webrtc/SoftwareVideoDecoderFactory;-><init>()V

    iput-object v0, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->softwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    .line 3
    new-instance v0, Lhms/webrtc/HardwareVideoDecoderFactory;

    invoke-direct {v0, p1}, Lhms/webrtc/HardwareVideoDecoderFactory;-><init>(Lhms/webrtc/EglBase$Context;)V

    iput-object v0, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->hardwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    .line 4
    new-instance v0, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;

    invoke-direct {v0, p1}, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;-><init>(Lhms/webrtc/EglBase$Context;)V

    iput-object v0, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->platformSoftwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    return-void
.end method

.method public constructor <init>(Lhms/webrtc/VideoDecoderFactory;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lhms/webrtc/SoftwareVideoDecoderFactory;

    invoke-direct {v0}, Lhms/webrtc/SoftwareVideoDecoderFactory;-><init>()V

    iput-object v0, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->softwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    .line 7
    iput-object p1, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->hardwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->platformSoftwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    return-void
.end method


# virtual methods
.method public createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;
    .locals 3

    iget-object v0, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->softwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    invoke-interface {v0, p1}, Lhms/webrtc/VideoDecoderFactory;->createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->hardwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    invoke-interface {v1, p1}, Lhms/webrtc/VideoDecoderFactory;->createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;

    move-result-object v1

    if-nez v0, :cond_0

    iget-object v2, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->platformSoftwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    if-eqz v2, :cond_0

    invoke-interface {v2, p1}, Lhms/webrtc/VideoDecoderFactory;->createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;

    move-result-object v0

    :cond_0
    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    new-instance p1, Lhms/webrtc/VideoDecoderFallback;

    invoke-direct {p1, v0, v1}, Lhms/webrtc/VideoDecoderFallback;-><init>(Lhms/webrtc/VideoDecoder;Lhms/webrtc/VideoDecoder;)V

    return-object p1

    :cond_1
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    return-object v0
.end method

.method public getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v1, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->softwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    invoke-interface {v1}, Lhms/webrtc/VideoDecoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->hardwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    invoke-interface {v1}, Lhms/webrtc/VideoDecoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lhms/webrtc/DefaultVideoDecoderFactory;->platformSoftwareVideoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lhms/webrtc/VideoDecoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    new-array v1, v1, [Lhms/webrtc/VideoCodecInfo;

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/VideoCodecInfo;

    return-object v0
.end method
