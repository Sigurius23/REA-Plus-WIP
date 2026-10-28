.class public final synthetic Lorg/webrtc/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

.field public final synthetic x:Lorg/webrtc/VideoEncoder$BitrateAllocation;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Lorg/webrtc/VideoEncoder$BitrateAllocation;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/s;->w:Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

    iput-object p2, p0, Lorg/webrtc/s;->x:Lorg/webrtc/VideoEncoder$BitrateAllocation;

    iput p3, p0, Lorg/webrtc/s;->y:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lorg/webrtc/s;->x:Lorg/webrtc/VideoEncoder$BitrateAllocation;

    iget v1, p0, Lorg/webrtc/s;->y:I

    iget-object v2, p0, Lorg/webrtc/s;->w:Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

    invoke-static {v2, v0, v1}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->e(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0
.end method
