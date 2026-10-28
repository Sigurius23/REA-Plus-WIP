.class public final synthetic Llive/hms/video/encoder/video/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Llive/hms/video/encoder/video/c;->w:I

    iput-object p1, p0, Llive/hms/video/encoder/video/c;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    iput-object p2, p0, Llive/hms/video/encoder/video/c;->y:Ljava/lang/Object;

    iput-object p3, p0, Llive/hms/video/encoder/video/c;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Llive/hms/video/encoder/video/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/encoder/video/c;->y:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/VideoFrame;

    iget-object v1, p0, Llive/hms/video/encoder/video/c;->z:Ljava/lang/Object;

    check-cast v1, Lhms/webrtc/VideoEncoder$EncodeInfo;

    iget-object v2, p0, Llive/hms/video/encoder/video/c;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v2, v0, v1}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->j(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoEncoder$EncodeInfo;)Lhms/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/encoder/video/c;->y:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/VideoEncoder$Settings;

    iget-object v1, p0, Llive/hms/video/encoder/video/c;->z:Ljava/lang/Object;

    check-cast v1, Lhms/webrtc/VideoEncoder$Callback;

    iget-object v2, p0, Llive/hms/video/encoder/video/c;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v2, v0, v1}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->k(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$Settings;Lhms/webrtc/VideoEncoder$Callback;)Lhms/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
