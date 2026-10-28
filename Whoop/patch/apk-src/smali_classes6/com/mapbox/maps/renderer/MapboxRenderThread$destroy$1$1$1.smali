.class final Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/renderer/MapboxRenderThread;->destroy$maps_sdk_release()V
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

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    const/4 v0, 0x1

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getEglContextMadeCurrent$maps_sdk_release()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getDestroyCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 5
    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v2

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_2

    :cond_0
    move v1, v0

    .line 6
    :goto_0
    :try_start_1
    iget-object v3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getNativeRenderCreated$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 7
    iget-object v3, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v3, v2, v0, v4}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->releaseAll$default(Lcom/mapbox/maps/renderer/MapboxRenderThread;ZILjava/lang/Object;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    move v5, v1

    move-object v1, v0

    move v0, v5

    goto :goto_2

    .line 8
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderHandlerThread$maps_sdk_release()Lcom/mapbox/maps/renderer/RenderHandlerThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->clearRenderEventQueue()V

    .line 9
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getFpsManager$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Lcom/mapbox/maps/renderer/FpsManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/FpsManager;->destroy()V

    .line 10
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getEglCore$maps_sdk_release()Lcom/mapbox/maps/renderer/egl/EGLCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->clearRendererStateListeners$maps_sdk_release()V

    .line 11
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getMapboxRenderer$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Lcom/mapbox/maps/renderer/MapboxRenderer;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setMap$maps_sdk_release(Lcom/mapbox/maps/NativeMapImpl;)V

    .line 12
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getRenderHandlerThread$maps_sdk_release()Lcom/mapbox/maps/renderer/RenderHandlerThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->stop()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_2

    .line 13
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getDestroyCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 14
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    .line 15
    :cond_2
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 16
    :try_start_2
    invoke-static {v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getCreateCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 17
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 18
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 19
    :try_start_3
    invoke-static {v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getDestroyCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 20
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_2
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1

    :catchall_3
    move-exception v1

    .line 21
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1

    :goto_2
    if-eqz v0, :cond_3

    .line 22
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getDestroyCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 23
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_3

    .line 24
    :cond_3
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 25
    :try_start_4
    invoke-static {v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getCreateCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 26
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 27
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getSurfaceProcessingLock$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$destroy$1$1$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 28
    :try_start_5
    invoke-static {v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getDestroyCondition$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/util/concurrent/locks/Condition;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 29
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_3
    throw v1

    :catchall_4
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1

    :catchall_5
    move-exception v1

    .line 30
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method
