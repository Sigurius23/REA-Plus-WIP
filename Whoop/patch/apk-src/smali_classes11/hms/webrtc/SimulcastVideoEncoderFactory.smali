.class public Lhms/webrtc/SimulcastVideoEncoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoEncoderFactory;


# instance fields
.field fallback:Lhms/webrtc/VideoEncoderFactory;

.field primary:Lhms/webrtc/VideoEncoderFactory;


# direct methods
.method public constructor <init>(Lhms/webrtc/VideoEncoderFactory;Lhms/webrtc/VideoEncoderFactory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhms/webrtc/SimulcastVideoEncoderFactory;->primary:Lhms/webrtc/VideoEncoderFactory;

    iput-object p2, p0, Lhms/webrtc/SimulcastVideoEncoderFactory;->fallback:Lhms/webrtc/VideoEncoderFactory;

    return-void
.end method


# virtual methods
.method public createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;
    .locals 3

    new-instance v0, Lhms/webrtc/SimulcastVideoEncoder;

    iget-object v1, p0, Lhms/webrtc/SimulcastVideoEncoderFactory;->primary:Lhms/webrtc/VideoEncoderFactory;

    iget-object v2, p0, Lhms/webrtc/SimulcastVideoEncoderFactory;->fallback:Lhms/webrtc/VideoEncoderFactory;

    invoke-direct {v0, v1, v2, p1}, Lhms/webrtc/SimulcastVideoEncoder;-><init>(Lhms/webrtc/VideoEncoderFactory;Lhms/webrtc/VideoEncoderFactory;Lhms/webrtc/VideoCodecInfo;)V

    return-object v0
.end method

.method public getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lhms/webrtc/SimulcastVideoEncoderFactory;->primary:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v1}, Lhms/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lhms/webrtc/SimulcastVideoEncoderFactory;->fallback:Lhms/webrtc/VideoEncoderFactory;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lhms/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Lhms/webrtc/VideoCodecInfo;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/VideoCodecInfo;

    return-object v0
.end method
