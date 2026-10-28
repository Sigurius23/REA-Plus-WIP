.class public final synthetic Lorg/webrtc/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lorg/webrtc/p;->w:I

    iput-object p1, p0, Lorg/webrtc/p;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lorg/webrtc/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lorg/webrtc/p;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/TextureBufferImpl;

    invoke-static {v0}, Lorg/webrtc/TextureBufferImpl;->a(Lorg/webrtc/TextureBufferImpl;)Lorg/webrtc/VideoFrame$I420Buffer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lorg/webrtc/p;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

    invoke-static {v0}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->b(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;)Lorg/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lorg/webrtc/p;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

    invoke-static {v0}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->c(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lorg/webrtc/p;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

    invoke-static {v0}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->d(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;)Lorg/webrtc/VideoEncoder$ScalingSettings;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
