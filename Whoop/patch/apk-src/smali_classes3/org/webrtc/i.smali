.class public final synthetic Lorg/webrtc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lorg/webrtc/HardwareVideoEncoderWrapper;

.field public final synthetic y:Lorg/webrtc/VideoFrame;

.field public final synthetic z:Lorg/webrtc/VideoEncoder$EncodeInfo;


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;I)V
    .locals 0

    iput p4, p0, Lorg/webrtc/i;->w:I

    iput-object p1, p0, Lorg/webrtc/i;->x:Lorg/webrtc/HardwareVideoEncoderWrapper;

    iput-object p2, p0, Lorg/webrtc/i;->y:Lorg/webrtc/VideoFrame;

    iput-object p3, p0, Lorg/webrtc/i;->z:Lorg/webrtc/VideoEncoder$EncodeInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lorg/webrtc/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lorg/webrtc/i;->y:Lorg/webrtc/VideoFrame;

    iget-object v1, p0, Lorg/webrtc/i;->z:Lorg/webrtc/VideoEncoder$EncodeInfo;

    iget-object v2, p0, Lorg/webrtc/i;->x:Lorg/webrtc/HardwareVideoEncoderWrapper;

    invoke-static {v2, v0, v1}, Lorg/webrtc/HardwareVideoEncoderWrapper;->b(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lorg/webrtc/i;->y:Lorg/webrtc/VideoFrame;

    iget-object v1, p0, Lorg/webrtc/i;->z:Lorg/webrtc/VideoEncoder$EncodeInfo;

    iget-object v2, p0, Lorg/webrtc/i;->x:Lorg/webrtc/HardwareVideoEncoderWrapper;

    invoke-static {v2, v0, v1}, Lorg/webrtc/HardwareVideoEncoderWrapper;->a(Lorg/webrtc/HardwareVideoEncoderWrapper;Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
