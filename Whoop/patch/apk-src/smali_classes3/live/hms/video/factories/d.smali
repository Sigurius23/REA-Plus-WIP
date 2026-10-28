.class public final synthetic Llive/hms/video/factories/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhms/webrtc/EglBase$Context;


# direct methods
.method public synthetic constructor <init>(Lhms/webrtc/EglBase$Context;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/factories/d;->w:I

    iput-object p1, p0, Llive/hms/video/factories/d;->x:Lhms/webrtc/EglBase$Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/video/factories/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/factories/d;->x:Lhms/webrtc/EglBase$Context;

    invoke-static {v0}, Llive/hms/video/factories/HMSVideoDecoderFactory;->b(Lhms/webrtc/EglBase$Context;)Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/factories/d;->x:Lhms/webrtc/EglBase$Context;

    invoke-static {v0}, Llive/hms/video/factories/HMSVideoDecoderFactory;->c(Lhms/webrtc/EglBase$Context;)Lhms/webrtc/HardwareVideoDecoderFactory;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
