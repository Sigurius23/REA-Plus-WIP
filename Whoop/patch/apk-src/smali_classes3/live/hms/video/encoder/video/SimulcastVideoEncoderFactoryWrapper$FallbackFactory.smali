.class final Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoEncoderFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FallbackFactory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000bH\u0016\u00a2\u0006\u0002\u0010\u000cR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;",
        "Lhms/webrtc/VideoEncoderFactory;",
        "hardwareVideoEncoderFactory",
        "<init>",
        "(Lhms/webrtc/VideoEncoderFactory;)V",
        "softwareVideoEncoderFactory",
        "createEncoder",
        "Lhms/webrtc/VideoEncoder;",
        "info",
        "Lhms/webrtc/VideoCodecInfo;",
        "getSupportedCodecs",
        "",
        "()[Lhms/webrtc/VideoCodecInfo;",
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
.field private final hardwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

.field private final softwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;


# direct methods
.method public constructor <init>(Lhms/webrtc/VideoEncoderFactory;)V
    .locals 1

    const-string v0, "hardwareVideoEncoderFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;->hardwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    new-instance p1, Lhms/webrtc/SoftwareVideoEncoderFactory;

    invoke-direct {p1}, Lhms/webrtc/SoftwareVideoEncoderFactory;-><init>()V

    iput-object p1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;->softwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    return-void
.end method


# virtual methods
.method public createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;
    .locals 2

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;->softwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v0, p1}, Lhms/webrtc/VideoEncoderFactory;->createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;->hardwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v1, p1}, Lhms/webrtc/VideoEncoderFactory;->createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;

    move-result-object p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    new-instance v1, Lhms/webrtc/VideoEncoderFallback;

    invoke-direct {v1, p1, v0}, Lhms/webrtc/VideoEncoderFallback;-><init>(Lhms/webrtc/VideoEncoder;Lhms/webrtc/VideoEncoder;)V

    return-object v1

    :cond_0
    if-nez v0, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;->softwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v1}, Lhms/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v1

    const-string v2, "getSupportedCodecs(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lm83/s;->o0(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    iget-object v1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;->hardwareVideoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v1}, Lhms/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lm83/s;->o0(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    const/4 v1, 0x0

    new-array v1, v1, [Lhms/webrtc/VideoCodecInfo;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/VideoCodecInfo;

    return-object v0
.end method
