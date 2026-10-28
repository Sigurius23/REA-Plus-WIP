.class public final Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoEncoderFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;,
        Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;,
        Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B-\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0013\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;",
        "Lhms/webrtc/VideoEncoderFactory;",
        "sharedContext",
        "Lhms/webrtc/EglBase$Context;",
        "enableIntelVp8Encoder",
        "",
        "enableH264HighProfile",
        "forceSoftwareEncoder",
        "<init>",
        "(Lhms/webrtc/EglBase$Context;ZZZ)V",
        "primary",
        "fallback",
        "native",
        "Lhms/webrtc/SimulcastVideoEncoderFactory;",
        "createEncoder",
        "Lhms/webrtc/VideoEncoder;",
        "info",
        "Lhms/webrtc/VideoCodecInfo;",
        "getSupportedCodecs",
        "",
        "()[Lhms/webrtc/VideoCodecInfo;",
        "FallbackFactory",
        "StreamEncoderWrapper",
        "StreamEncoderWrapperFactory",
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
.field private final fallback:Lhms/webrtc/VideoEncoderFactory;

.field private final native:Lhms/webrtc/SimulcastVideoEncoderFactory;

.field private final primary:Lhms/webrtc/VideoEncoderFactory;


# direct methods
.method public constructor <init>(Lhms/webrtc/EglBase$Context;ZZZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lhms/webrtc/HardwareVideoEncoderFactory;

    invoke-direct {v0, p1, p2, p3}, Lhms/webrtc/HardwareVideoEncoderFactory;-><init>(Lhms/webrtc/EglBase$Context;ZZ)V

    .line 3
    new-instance p1, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;

    invoke-direct {p1, v0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;-><init>(Lhms/webrtc/VideoEncoderFactory;)V

    iput-object p1, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;->primary:Lhms/webrtc/VideoEncoderFactory;

    .line 4
    new-instance p2, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;

    new-instance p3, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;

    invoke-direct {p3, p1}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$FallbackFactory;-><init>(Lhms/webrtc/VideoEncoderFactory;)V

    invoke-direct {p2, p3}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapperFactory;-><init>(Lhms/webrtc/VideoEncoderFactory;)V

    iput-object p2, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;->fallback:Lhms/webrtc/VideoEncoderFactory;

    if-nez p4, :cond_1

    .line 5
    sget-object p3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string p4, "MODEL"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "Pixel 3"

    const/4 v0, 0x0

    .line 6
    invoke-static {p3, p4, v0}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance p3, Lhms/webrtc/SimulcastVideoEncoderFactory;

    invoke-direct {p3, p1, p2}, Lhms/webrtc/SimulcastVideoEncoderFactory;-><init>(Lhms/webrtc/VideoEncoderFactory;Lhms/webrtc/VideoEncoderFactory;)V

    goto :goto_1

    .line 8
    :cond_1
    :goto_0
    new-instance p3, Lhms/webrtc/SimulcastVideoEncoderFactory;

    invoke-direct {p3, p2, p1}, Lhms/webrtc/SimulcastVideoEncoderFactory;-><init>(Lhms/webrtc/VideoEncoderFactory;Lhms/webrtc/VideoEncoderFactory;)V

    .line 9
    :goto_1
    iput-object p3, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;->native:Lhms/webrtc/SimulcastVideoEncoderFactory;

    return-void
.end method

.method public synthetic constructor <init>(Lhms/webrtc/EglBase$Context;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x1

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    move p3, v0

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;-><init>(Lhms/webrtc/EglBase$Context;ZZZ)V

    return-void
.end method


# virtual methods
.method public createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;
    .locals 1

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;->native:Lhms/webrtc/SimulcastVideoEncoderFactory;

    invoke-virtual {v0, p1}, Lhms/webrtc/SimulcastVideoEncoderFactory;->createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;

    move-result-object p1

    return-object p1
.end method

.method public getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 2

    iget-object v0, p0, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper;->native:Lhms/webrtc/SimulcastVideoEncoderFactory;

    invoke-virtual {v0}, Lhms/webrtc/SimulcastVideoEncoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v0

    const-string v1, "getSupportedCodecs(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
