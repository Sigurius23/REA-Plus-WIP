.class final Lcom/mapbox/maps/MapController$removeRendererSetupErrorListener$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/MapController;->removeRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
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
.field final synthetic $rendererSetupErrorListener:Lcom/mapbox/maps/renderer/RendererSetupErrorListener;

.field final synthetic this$0:Lcom/mapbox/maps/MapController;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/MapController$removeRendererSetupErrorListener$1;->this$0:Lcom/mapbox/maps/MapController;

    iput-object p2, p0, Lcom/mapbox/maps/MapController$removeRendererSetupErrorListener$1;->$rendererSetupErrorListener:Lcom/mapbox/maps/renderer/RendererSetupErrorListener;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/maps/MapController$removeRendererSetupErrorListener$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/MapController$removeRendererSetupErrorListener$1;->this$0:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->getEglCore$maps_sdk_release()Lcom/mapbox/maps/renderer/egl/EGLCore;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/maps/MapController$removeRendererSetupErrorListener$1;->$rendererSetupErrorListener:Lcom/mapbox/maps/renderer/RendererSetupErrorListener;

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->removeRendererStateListener$maps_sdk_release(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V

    return-void
.end method
