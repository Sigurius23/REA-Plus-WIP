.class public final synthetic Lhms/webrtc/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lhms/webrtc/o;->w:I

    iput-object p2, p0, Lhms/webrtc/o;->x:Ljava/lang/Object;

    iput-object p3, p0, Lhms/webrtc/o;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lhms/webrtc/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhms/webrtc/o;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/VideoSource;

    iget-object v1, p0, Lhms/webrtc/o;->y:Ljava/lang/Object;

    check-cast v1, Lhms/webrtc/VideoFrame;

    invoke-static {v0, v1}, Lhms/webrtc/VideoSource;->b(Lhms/webrtc/VideoSource;Lhms/webrtc/VideoFrame;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhms/webrtc/o;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/VideoFileRenderer;

    iget-object v1, p0, Lhms/webrtc/o;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lhms/webrtc/VideoFileRenderer;->d(Lhms/webrtc/VideoFileRenderer;Ljava/util/concurrent/CountDownLatch;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lhms/webrtc/o;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/VideoFileRenderer;

    iget-object v1, p0, Lhms/webrtc/o;->y:Ljava/lang/Object;

    check-cast v1, Lhms/webrtc/VideoFrame;

    invoke-static {v0, v1}, Lhms/webrtc/VideoFileRenderer;->b(Lhms/webrtc/VideoFileRenderer;Lhms/webrtc/VideoFrame;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lhms/webrtc/o;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/EglRenderer;

    iget-object v1, p0, Lhms/webrtc/o;->y:Ljava/lang/Object;

    check-cast v1, Landroid/os/Looper;

    invoke-static {v0, v1}, Lhms/webrtc/EglRenderer;->d(Lhms/webrtc/EglRenderer;Landroid/os/Looper;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lhms/webrtc/o;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/EglRenderer;

    iget-object v1, p0, Lhms/webrtc/o;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lhms/webrtc/EglRenderer;->b(Lhms/webrtc/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lhms/webrtc/o;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/EglRenderer;

    iget-object v1, p0, Lhms/webrtc/o;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lhms/webrtc/EglRenderer;->e(Lhms/webrtc/EglRenderer;Ljava/lang/Runnable;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Lhms/webrtc/o;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/TextureBufferImpl;

    iget-object v1, p0, Lhms/webrtc/o;->y:Ljava/lang/Object;

    check-cast v1, Lhms/webrtc/TextureBufferImpl$RefCountMonitor;

    invoke-static {v0, v1}, Lhms/webrtc/TextureBufferImpl;->b(Lhms/webrtc/TextureBufferImpl;Lhms/webrtc/TextureBufferImpl$RefCountMonitor;)V

    return-void

    nop

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
