.class public final Lcom/mapbox/maps/renderer/RenderHandlerThread;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\r\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R \u0010\u0018\u001a\u00020\u00178\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u0012\u0004\u0008\u001c\u0010\u0013\u001a\u0004\u0008\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u0011\"\u0004\u0008 \u0010!R\u001a\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0016\u0012\u0004\u0008#\u0010\u0013R\u0014\u0010\'\u001a\u00020$8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/RenderHandlerThread;",
        "",
        "",
        "mapName",
        "<init>",
        "(Ljava/lang/String;)V",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "task",
        "post",
        "(Lc93/a;)V",
        "",
        "delayMillis",
        "postDelayed",
        "(Lc93/a;J)V",
        "Landroid/os/Handler;",
        "start",
        "()Landroid/os/Handler;",
        "stop",
        "()V",
        "clearRenderEventQueue",
        "handlerThreadName",
        "Ljava/lang/String;",
        "Landroid/os/HandlerThread;",
        "handlerThread",
        "Landroid/os/HandlerThread;",
        "getHandlerThread$maps_sdk_release",
        "()Landroid/os/HandlerThread;",
        "getHandlerThread$maps_sdk_release$annotations",
        "handler",
        "Landroid/os/Handler;",
        "getHandler$maps_sdk_release",
        "setHandler$maps_sdk_release",
        "(Landroid/os/Handler;)V",
        "TAG",
        "getTAG$annotations",
        "",
        "isRunning$maps_sdk_release",
        "()Z",
        "isRunning",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private volatile handler:Landroid/os/Handler;

.field private final handlerThread:Landroid/os/HandlerThread;

.field private final handlerThreadName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const-string v0, "mapName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "MbxRender"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "MapboxRenderThread"

    :goto_0
    iput-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handlerThreadName:Ljava/lang/String;

    new-instance v1, Landroid/os/HandlerThread;

    const/4 v2, -0x4

    invoke-direct {v1, v0, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handlerThread:Landroid/os/HandlerThread;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mbgl-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "\\"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string p1, ""

    :goto_1
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->TAG:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lc93/a;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->postDelayed$lambda$1$lambda$0(Lc93/a;)V

    return-void
.end method

.method public static synthetic getHandlerThread$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getTAG$annotations()V
    .locals 0

    return-void
.end method

.method private static final postDelayed$lambda$1$lambda$0(Lc93/a;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final clearRenderEventQueue()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final getHandler$maps_sdk_release()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method public final getHandlerThread$maps_sdk_release()Landroid/os/HandlerThread;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handlerThread:Landroid/os/HandlerThread;

    return-object v0
.end method

.method public final isRunning$maps_sdk_release()Z
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final post(Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/mapbox/maps/renderer/RenderHandlerThread;->postDelayed(Lc93/a;J)V

    return-void
.end method

.method public final postDelayed(Lc93/a;J)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "J)V"
        }
    .end annotation

    const-string v0, "task"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lb4/a;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Lb4/a;-><init>(Lc93/a;I)V

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_0
    iget-object p1, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Thread "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handlerThreadName:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " was not started, ignoring event"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setHandler$maps_sdk_release(Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handler:Landroid/os/Handler;

    return-void
.end method

.method public final start()Landroid/os/Handler;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method public final stop()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mapbox/maps/renderer/RenderHandlerThread;->handler:Landroid/os/Handler;

    return-void
.end method
