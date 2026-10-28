.class public final synthetic Lorg/webrtc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lorg/webrtc/VideoSink;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/VideoSink;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lorg/webrtc/e;->w:I

    iput-object p1, p0, Lorg/webrtc/e;->x:Lorg/webrtc/VideoSink;

    iput-object p2, p0, Lorg/webrtc/e;->y:Ljava/lang/Object;

    iput-object p3, p0, Lorg/webrtc/e;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lorg/webrtc/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lorg/webrtc/e;->x:Lorg/webrtc/VideoSink;

    check-cast v0, Lorg/webrtc/VideoFileRenderer;

    iget-object v1, p0, Lorg/webrtc/e;->y:Ljava/lang/Object;

    check-cast v1, Lorg/webrtc/VideoFrame$I420Buffer;

    iget-object v2, p0, Lorg/webrtc/e;->z:Ljava/lang/Object;

    check-cast v2, Lorg/webrtc/VideoFrame;

    invoke-static {v0, v1, v2}, Lorg/webrtc/VideoFileRenderer;->d(Lorg/webrtc/VideoFileRenderer;Lorg/webrtc/VideoFrame$I420Buffer;Lorg/webrtc/VideoFrame;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lorg/webrtc/e;->x:Lorg/webrtc/VideoSink;

    check-cast v0, Lorg/webrtc/EglRenderer;

    iget-object v1, p0, Lorg/webrtc/e;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    iget-object v2, p0, Lorg/webrtc/e;->z:Ljava/lang/Object;

    check-cast v2, Lorg/webrtc/EglRenderer$RenderListener;

    invoke-static {v0, v1, v2}, Lorg/webrtc/EglRenderer;->b(Lorg/webrtc/EglRenderer;Ljava/util/concurrent/CountDownLatch;Lorg/webrtc/EglRenderer$RenderListener;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lorg/webrtc/e;->x:Lorg/webrtc/VideoSink;

    check-cast v0, Lorg/webrtc/EglRenderer;

    iget-object v1, p0, Lorg/webrtc/e;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    iget-object v2, p0, Lorg/webrtc/e;->z:Ljava/lang/Object;

    check-cast v2, Lorg/webrtc/EglRenderer$FrameListener;

    invoke-static {v0, v1, v2}, Lorg/webrtc/EglRenderer;->f(Lorg/webrtc/EglRenderer;Ljava/util/concurrent/CountDownLatch;Lorg/webrtc/EglRenderer$FrameListener;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
