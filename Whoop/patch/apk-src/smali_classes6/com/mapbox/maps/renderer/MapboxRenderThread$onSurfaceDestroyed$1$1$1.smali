.class final Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/renderer/MapboxRenderThread;->onSurfaceDestroyed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setAwaitingNextVsync$maps_sdk_release(Z)V

    .line 3
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-virtual {v0, v2}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 4
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$onSurfaceDestroyed$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 5
    :try_start_0
    invoke-static {v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getNativeRenderCreated$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getMapboxRenderer$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Lcom/mapbox/maps/renderer/MapboxRenderer;

    move-result-object v3

    instance-of v3, v3, Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 6
    invoke-static {v2, v1, v3, v4}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->releaseAll$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;ZILjava/lang/Object;)V

    .line 7
    invoke-virtual {v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderHandlerThread$maps_sdk_release()Lcom/mapbox/maps/renderer/RenderHandlerThread;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->clearRenderEventQueue()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 8
    :cond_0
    invoke-static {v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$releaseEglSurface(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    .line 9
    :goto_0
    invoke-static {v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getFpsManager$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Lcom/mapbox/maps/renderer/FpsManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/FpsManager;->onSurfaceDestroyed()V

    .line 10
    invoke-static {v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getDestroyCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method
