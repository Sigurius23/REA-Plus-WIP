.class public final synthetic Lhms/webrtc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;FZI)V
    .locals 0

    iput p6, p0, Lhms/webrtc/e;->w:I

    iput-object p1, p0, Lhms/webrtc/e;->z:Ljava/lang/Object;

    iput-object p2, p0, Lhms/webrtc/e;->E:Ljava/lang/Object;

    iput-object p3, p0, Lhms/webrtc/e;->F:Ljava/lang/Object;

    iput p4, p0, Lhms/webrtc/e;->x:F

    iput-boolean p5, p0, Lhms/webrtc/e;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lhms/webrtc/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhms/webrtc/e;->z:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/EglRenderer;

    iget-object v1, p0, Lhms/webrtc/e;->E:Ljava/lang/Object;

    check-cast v1, Lorg/webrtc/RendererCommon$GlDrawer;

    iget-object v2, p0, Lhms/webrtc/e;->F:Ljava/lang/Object;

    check-cast v2, Lorg/webrtc/EglRenderer$FrameListener;

    iget v3, p0, Lhms/webrtc/e;->x:F

    iget-boolean v4, p0, Lhms/webrtc/e;->y:Z

    invoke-static {v0, v1, v2, v3, v4}, Lorg/webrtc/EglRenderer;->e(Lorg/webrtc/EglRenderer;Lorg/webrtc/RendererCommon$GlDrawer;Lorg/webrtc/EglRenderer$FrameListener;FZ)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhms/webrtc/e;->z:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/EglRenderer;

    iget-object v1, p0, Lhms/webrtc/e;->E:Ljava/lang/Object;

    check-cast v1, Lhms/webrtc/RendererCommon$GlDrawer;

    iget-object v2, p0, Lhms/webrtc/e;->F:Ljava/lang/Object;

    check-cast v2, Lhms/webrtc/EglRenderer$FrameListener;

    iget v3, p0, Lhms/webrtc/e;->x:F

    iget-boolean v4, p0, Lhms/webrtc/e;->y:Z

    invoke-static {v0, v1, v2, v3, v4}, Lhms/webrtc/EglRenderer;->c(Lhms/webrtc/EglRenderer;Lhms/webrtc/RendererCommon$GlDrawer;Lhms/webrtc/EglRenderer$FrameListener;FZ)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
