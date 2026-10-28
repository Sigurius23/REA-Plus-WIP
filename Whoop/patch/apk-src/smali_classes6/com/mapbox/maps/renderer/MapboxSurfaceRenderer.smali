.class public Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;
.super Lcom/mapbox/maps/renderer/MapboxRenderer;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0010\u0018\u00002\u00020\u0001B!\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB\u0011\u0008\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0008\u0010\u000cJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;",
        "Lcom/mapbox/maps/renderer/MapboxRenderer;",
        "",
        "antialiasingSampleCount",
        "Lcom/mapbox/maps/ContextMode;",
        "contextMode",
        "",
        "mapName",
        "<init>",
        "(ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V",
        "Lcom/mapbox/maps/renderer/MapboxRenderThread;",
        "renderThread",
        "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V",
        "Landroid/view/Surface;",
        "surface",
        "width",
        "height",
        "Ll83/a0;",
        "surfaceChanged",
        "(Landroid/view/Surface;II)V",
        "surfaceDestroyed",
        "()V",
        "surfaceCreated",
        "",
        "createSurface",
        "Z",
        "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;",
        "widgetRenderer",
        "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;",
        "getWidgetRenderer$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;",
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
.field private createSurface:Z

.field private final widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;


# direct methods
.method public constructor <init>(ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V
    .locals 8

    const-string v0, "contextMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lcom/mapbox/maps/renderer/MapboxRenderer;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-direct {v0, p1, p3}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;-><init>(ILjava/lang/String;)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    .line 3
    new-instance v1, Lcom/mapbox/maps/renderer/MapboxRenderThread;

    .line 4
    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->getWidgetRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    move-result-object v3

    const/4 v4, 0x0

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    move-object v7, p3

    .line 5
    invoke-direct/range {v1 .. v7}, Lcom/mapbox/maps/renderer/MapboxRenderThread;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;ZILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setRenderThread$maps_sdk_release(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V
    .locals 3

    const-string v0, "renderThread"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;-><init>(Ljava/lang/String;)V

    .line 7
    new-instance v1, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;-><init>(ILjava/lang/String;)V

    iput-object v1, p0, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    .line 8
    invoke-virtual {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setRenderThread$maps_sdk_release(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    return-void
.end method


# virtual methods
.method public getWidgetRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    return-object v0
.end method

.method public final surfaceChanged(Landroid/view/Surface;II)V
    .locals 1

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->createSurface:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->onSurfaceCreated(Landroid/view/Surface;II)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->createSurface:Z

    :cond_0
    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->onSurfaceSizeChanged(II)V

    return-void
.end method

.method public final surfaceCreated()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->createSurface:Z

    return-void
.end method

.method public final surfaceDestroyed()V
    .locals 1

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->onSurfaceDestroyed()V

    return-void
.end method
