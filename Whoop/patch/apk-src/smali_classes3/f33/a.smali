.class public final Lf33/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoDecoderFactory;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lorg/webrtc/SoftwareVideoDecoderFactory;

.field public final c:Lorg/webrtc/WrappedVideoDecoderFactory;


# direct methods
.method public constructor <init>(Lorg/webrtc/EglBase$Context;)V
    .locals 3

    const-string v0, "VP9"

    const-string v1, "AV1"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lorg/webrtc/SoftwareVideoDecoderFactory;

    invoke-direct {v1}, Lorg/webrtc/SoftwareVideoDecoderFactory;-><init>()V

    new-instance v2, Lorg/webrtc/WrappedVideoDecoderFactory;

    invoke-direct {v2, p1}, Lorg/webrtc/WrappedVideoDecoderFactory;-><init>(Lorg/webrtc/EglBase$Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf33/a;->a:Ljava/util/List;

    iput-object v1, p0, Lf33/a;->b:Lorg/webrtc/SoftwareVideoDecoderFactory;

    iput-object v2, p0, Lf33/a;->c:Lorg/webrtc/WrappedVideoDecoderFactory;

    return-void
.end method


# virtual methods
.method public final createDecoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;
    .locals 2

    const-string v0, "videoCodecInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf33/a;->a:Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p1, Lorg/webrtc/VideoCodecInfo;->name:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf33/a;->b:Lorg/webrtc/SoftwareVideoDecoderFactory;

    invoke-virtual {v0, p1}, Lorg/webrtc/SoftwareVideoDecoderFactory;->createDecoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lf33/a;->c:Lorg/webrtc/WrappedVideoDecoderFactory;

    invoke-virtual {v0, p1}, Lorg/webrtc/WrappedVideoDecoderFactory;->createDecoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;

    move-result-object p1

    return-object p1
.end method

.method public final getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
    .locals 1

    iget-object v0, p0, Lf33/a;->c:Lorg/webrtc/WrappedVideoDecoderFactory;

    invoke-virtual {v0}, Lorg/webrtc/WrappedVideoDecoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method
