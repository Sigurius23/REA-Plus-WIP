.class final Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/renderer/MapboxRenderThread;->postNonRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;J)V
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
.field final synthetic $renderEvent:Lcom/mapbox/maps/renderer/RenderEvent;

.field final synthetic this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/RenderEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    iput-object p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->$renderEvent:Lcom/mapbox/maps/renderer/RenderEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getRenderThreadPrepared(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->$renderEvent:Lcom/mapbox/maps/renderer/RenderEvent;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/RenderEvent;->getRunnable()Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getPaused$maps_sdk_release()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getNonRenderEventQueue$maps_sdk_release()Ljava/util/concurrent/ConcurrentLinkedQueue;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->$renderEvent:Lcom/mapbox/maps/renderer/RenderEvent;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    invoke-static {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$getTAG$p(Lcom/mapbox/maps/renderer/MapboxRenderThread;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Non-render event could not be run, retrying in 50 ms..."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->this$0:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderThread$postNonRenderEvent$1;->$renderEvent:Lcom/mapbox/maps/renderer/RenderEvent;

    const-wide/16 v2, 0x32

    invoke-static {v0, v1, v2, v3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->access$postNonRenderEvent(Lcom/mapbox/maps/renderer/MapboxRenderThread;Lcom/mapbox/maps/renderer/RenderEvent;J)V

    return-void
.end method
