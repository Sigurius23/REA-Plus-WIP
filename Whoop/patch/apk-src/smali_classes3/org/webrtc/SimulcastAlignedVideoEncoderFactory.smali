.class public Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoEncoderFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapperFactory;,
        Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;
    }
.end annotation


# instance fields
.field private final delegate:Lorg/webrtc/SimulcastVideoEncoderFactory;

.field private final fallback:Lorg/webrtc/VideoEncoderFactory;

.field private final primary:Lorg/webrtc/VideoEncoderFactory;


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
    new-instance p1, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapperFactory;

    invoke-direct {p1, v0}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapperFactory;-><init>(Lorg/webrtc/VideoEncoderFactory;)V

    iput-object p1, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;->primary:Lorg/webrtc/VideoEncoderFactory;

    new-instance p2, Lorg/webrtc/SoftwareVideoEncoderFactory;

    invoke-direct {p2}, Lorg/webrtc/SoftwareVideoEncoderFactory;-><init>()V

    iput-object p2, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;->fallback:Lorg/webrtc/VideoEncoderFactory;

    new-instance p3, Lorg/webrtc/SimulcastVideoEncoderFactory;

    invoke-direct {p3, p1, p2}, Lorg/webrtc/SimulcastVideoEncoderFactory;-><init>(Lorg/webrtc/VideoEncoderFactory;Lorg/webrtc/VideoEncoderFactory;)V

    iput-object p3, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;->delegate:Lorg/webrtc/SimulcastVideoEncoderFactory;

    return-void
.end method


# virtual methods
.method public createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;->delegate:Lorg/webrtc/SimulcastVideoEncoderFactory;

    invoke-virtual {v0, p1}, Lorg/webrtc/SimulcastVideoEncoderFactory;->createEncoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;

    move-result-object p1

    return-object p1
.end method

.method public getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
    .locals 1

    iget-object v0, p0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;->delegate:Lorg/webrtc/SimulcastVideoEncoderFactory;

    invoke-virtual {v0}, Lorg/webrtc/SimulcastVideoEncoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v0

    return-object v0
.end method
