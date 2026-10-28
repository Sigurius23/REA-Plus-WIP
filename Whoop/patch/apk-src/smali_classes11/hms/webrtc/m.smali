.class public final synthetic Lhms/webrtc/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhms/webrtc/SurfaceTextureHelper;


# direct methods
.method public synthetic constructor <init>(Lhms/webrtc/SurfaceTextureHelper;I)V
    .locals 0

    iput p2, p0, Lhms/webrtc/m;->w:I

    iput-object p1, p0, Lhms/webrtc/m;->x:Lhms/webrtc/SurfaceTextureHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lhms/webrtc/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhms/webrtc/m;->x:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->f(Lhms/webrtc/SurfaceTextureHelper;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhms/webrtc/m;->x:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->a(Lhms/webrtc/SurfaceTextureHelper;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lhms/webrtc/m;->x:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->c(Lhms/webrtc/SurfaceTextureHelper;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lhms/webrtc/m;->x:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->g(Lhms/webrtc/SurfaceTextureHelper;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
