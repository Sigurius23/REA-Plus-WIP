.class public final synthetic Lorg/webrtc/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lorg/webrtc/q;->w:I

    iput-object p1, p0, Lorg/webrtc/q;->x:Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

    iput-object p2, p0, Lorg/webrtc/q;->y:Ljava/lang/Object;

    iput-object p3, p0, Lorg/webrtc/q;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lorg/webrtc/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lorg/webrtc/q;->y:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/VideoFrame;

    iget-object v1, p0, Lorg/webrtc/q;->z:Ljava/lang/Object;

    check-cast v1, Lorg/webrtc/VideoEncoder$EncodeInfo;

    iget-object v2, p0, Lorg/webrtc/q;->x:Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

    invoke-static {v2, v0, v1}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->f(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lorg/webrtc/q;->y:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/VideoEncoder$Settings;

    iget-object v1, p0, Lorg/webrtc/q;->z:Ljava/lang/Object;

    check-cast v1, Lorg/webrtc/VideoEncoder$Callback;

    iget-object v2, p0, Lorg/webrtc/q;->x:Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;

    invoke-static {v2, v0, v1}, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;->a(Lorg/webrtc/SimulcastAlignedVideoEncoderFactory$StreamEncoderWrapper;Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
