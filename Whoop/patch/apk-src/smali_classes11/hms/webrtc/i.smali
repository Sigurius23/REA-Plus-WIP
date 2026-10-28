.class public final synthetic Lhms/webrtc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lhms/webrtc/i;->w:I

    iput-object p1, p0, Lhms/webrtc/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lhms/webrtc/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhms/webrtc/i;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/VideoFileRenderer;

    invoke-static {v0}, Lhms/webrtc/VideoFileRenderer;->a(Lhms/webrtc/VideoFileRenderer;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhms/webrtc/i;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :pswitch_1
    iget-object v0, p0, Lhms/webrtc/i;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/VideoFrame$I420Buffer;

    invoke-interface {v0}, Lhms/webrtc/VideoFrame$Buffer;->release()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
