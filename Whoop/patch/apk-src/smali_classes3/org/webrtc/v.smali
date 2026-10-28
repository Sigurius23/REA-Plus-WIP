.class public final synthetic Lorg/webrtc/v;
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

    iput p1, p0, Lorg/webrtc/v;->w:I

    iput-object p2, p0, Lorg/webrtc/v;->x:Ljava/lang/Object;

    iput-object p3, p0, Lorg/webrtc/v;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lorg/webrtc/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lorg/webrtc/v;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/VideoSource;

    iget-object v1, p0, Lorg/webrtc/v;->y:Ljava/lang/Object;

    check-cast v1, Lorg/webrtc/VideoFrame;

    invoke-static {v0, v1}, Lorg/webrtc/VideoSource;->c(Lorg/webrtc/VideoSource;Lorg/webrtc/VideoFrame;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lorg/webrtc/v;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/VideoFileRenderer;

    iget-object v1, p0, Lorg/webrtc/v;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lorg/webrtc/VideoFileRenderer;->c(Lorg/webrtc/VideoFileRenderer;Ljava/util/concurrent/CountDownLatch;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lorg/webrtc/v;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/VideoFileRenderer;

    iget-object v1, p0, Lorg/webrtc/v;->y:Ljava/lang/Object;

    check-cast v1, Lorg/webrtc/VideoFrame;

    invoke-static {v0, v1}, Lorg/webrtc/VideoFileRenderer;->a(Lorg/webrtc/VideoFileRenderer;Lorg/webrtc/VideoFrame;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lorg/webrtc/v;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/EglRenderer;

    iget-object v1, p0, Lorg/webrtc/v;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lorg/webrtc/EglRenderer;->d(Lorg/webrtc/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lorg/webrtc/v;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/EglRenderer;

    iget-object v1, p0, Lorg/webrtc/v;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lorg/webrtc/EglRenderer;->a(Lorg/webrtc/EglRenderer;Ljava/lang/Runnable;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lorg/webrtc/v;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/TextureBufferImpl;

    iget-object v1, p0, Lorg/webrtc/v;->y:Ljava/lang/Object;

    check-cast v1, Lorg/webrtc/TextureBufferImpl$RefCountMonitor;

    invoke-static {v0, v1}, Lorg/webrtc/TextureBufferImpl;->b(Lorg/webrtc/TextureBufferImpl;Lorg/webrtc/TextureBufferImpl$RefCountMonitor;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
