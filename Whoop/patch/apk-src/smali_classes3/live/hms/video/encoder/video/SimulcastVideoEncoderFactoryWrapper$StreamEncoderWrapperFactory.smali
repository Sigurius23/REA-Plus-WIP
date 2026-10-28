.class final Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;
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
    name = "StreamEncoderWrapperFactory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0016J\u0013\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\nH\u0016\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;",
        "Lhms/webrtc/VideoEncoderFactory;",
        "factory",
        "<init>",
        "(Lhms/webrtc/VideoEncoderFactory;)V",
        "createEncoder",
        "Lhms/webrtc/VideoEncoder;",
        "videoCodecInfo",
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
.field private final factory:Lhms/webrtc/VideoEncoderFactory;


# direct methods
.method public constructor <init>(Lhms/webrtc/VideoEncoderFactory;)V
    .locals 1

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;->factory:Lhms/webrtc/VideoEncoderFactory;

    return-void
.end method


# virtual methods
.method public createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;
    .locals 1

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;->factory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v0, p1}, Lhms/webrtc/VideoEncoderFactory;->createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    instance-of v0, p1, Lhms/webrtc/WrappedNativeVideoEncoder;

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    new-instance v0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-direct {v0, p1}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;-><init>(Lhms/webrtc/VideoEncoder;)V

    return-object v0
.end method

.method public getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 2

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;->factory:Lhms/webrtc/VideoEncoderFactory;

    invoke-interface {v0}, Lhms/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v0

    const-string v1, "getSupportedCodecs(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
