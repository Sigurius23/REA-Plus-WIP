.class public final Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;
.super Lcom/mapbox/maps/renderer/MapboxRenderer;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB\u0011\u0008\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000b\u0010\u000fJ\'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\'\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u001e8\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;",
        "Lcom/mapbox/maps/renderer/MapboxRenderer;",
        "Landroid/view/TextureView$SurfaceTextureListener;",
        "Landroid/view/TextureView;",
        "textureView",
        "",
        "antialiasingSampleCount",
        "Lcom/mapbox/maps/ContextMode;",
        "contextMode",
        "",
        "mapName",
        "<init>",
        "(Landroid/view/TextureView;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V",
        "Lcom/mapbox/maps/renderer/MapboxRenderThread;",
        "renderThread",
        "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V",
        "Landroid/graphics/SurfaceTexture;",
        "surface",
        "width",
        "height",
        "Ll83/a0;",
        "onSurfaceTextureSizeChanged",
        "(Landroid/graphics/SurfaceTexture;II)V",
        "onSurfaceTextureUpdated",
        "(Landroid/graphics/SurfaceTexture;)V",
        "",
        "onSurfaceTextureDestroyed",
        "(Landroid/graphics/SurfaceTexture;)Z",
        "surfaceTexture",
        "onSurfaceTextureAvailable",
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
.field private final widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;


# direct methods
.method public constructor <init>(Landroid/view/TextureView;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V
    .locals 8

    const-string v0, "textureView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p4}, Lcom/mapbox/maps/renderer/MapboxRenderer;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v3, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    invoke-direct {v3, p2, p4}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;-><init>(ILjava/lang/String;)V

    .line 3
    iput-object v3, p0, Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    .line 4
    new-instance v1, Lcom/mapbox/maps/renderer/MapboxRenderThread;

    const/4 v4, 0x1

    move-object v2, p0

    move v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/mapbox/maps/renderer/MapboxRenderThread;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;ZILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setRenderThread$maps_sdk_release(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    const/4 p2, 0x0

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 6
    invoke-virtual {p1, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V
    .locals 3

    const-string v0, "renderThread"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/mapbox/maps/renderer/MapboxRenderer;-><init>(Ljava/lang/String;)V

    .line 8
    new-instance v1, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;-><init>(ILjava/lang/String;)V

    .line 9
    iput-object v1, p0, Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    .line 10
    invoke-virtual {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setRenderThread$maps_sdk_release(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    return-void
.end method


# virtual methods
.method public getWidgetRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxTextureViewRenderer;->widgetRenderer:Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    return-object v0
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    const-string v0, "surfaceTexture"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {v0, v1, p2, p3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->onSurfaceCreated(Landroid/view/Surface;II)V

    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->onSurfaceDestroyed()V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->onSurfaceSizeChanged(II)V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
