.class public final synthetic Lhms/webrtc/g;
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

    iput p3, p0, Lhms/webrtc/g;->w:I

    iput-object p1, p0, Lhms/webrtc/g;->y:Ljava/lang/Object;

    iput p2, p0, Lhms/webrtc/g;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lhms/webrtc/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhms/webrtc/g;->y:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/SurfaceTextureHelper;

    iget v1, p0, Lhms/webrtc/g;->x:I

    invoke-static {v0, v1}, Lhms/webrtc/SurfaceTextureHelper;->d(Lhms/webrtc/SurfaceTextureHelper;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhms/webrtc/g;->y:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/HardwareVideoEncoder;

    iget v1, p0, Lhms/webrtc/g;->x:I

    invoke-static {v0, v1}, Lhms/webrtc/HardwareVideoEncoder;->a(Lhms/webrtc/HardwareVideoEncoder;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
