.class public final synthetic Lorg/webrtc/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    iput p3, p0, Lorg/webrtc/h;->w:I

    iput-object p1, p0, Lorg/webrtc/h;->y:Ljava/lang/Object;

    iput p2, p0, Lorg/webrtc/h;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lorg/webrtc/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lorg/webrtc/h;->y:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SurfaceTextureHelper;

    iget v1, p0, Lorg/webrtc/h;->x:I

    invoke-static {v0, v1}, Lorg/webrtc/SurfaceTextureHelper;->f(Lorg/webrtc/SurfaceTextureHelper;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lorg/webrtc/h;->y:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/HardwareVideoEncoder;

    iget v1, p0, Lorg/webrtc/h;->x:I

    invoke-static {v0, v1}, Lorg/webrtc/HardwareVideoEncoder;->a(Lorg/webrtc/HardwareVideoEncoder;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
