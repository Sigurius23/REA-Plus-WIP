.class public final synthetic Llive/hms/video/encoder/video/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/encoder/video/a;->w:I

    iput-object p1, p0, Llive/hms/video/encoder/video/a;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/video/encoder/video/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/encoder/video/a;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->i(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)[Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/encoder/video/a;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->e(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Llive/hms/video/encoder/video/a;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->g(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Llive/hms/video/encoder/video/a;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->f(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoEncoder$ScalingSettings;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Llive/hms/video/encoder/video/a;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->d(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Llive/hms/video/encoder/video/a;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->c(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoEncoder$EncoderInfo;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Llive/hms/video/encoder/video/a;->x:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v0}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->b(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;)Lhms/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
