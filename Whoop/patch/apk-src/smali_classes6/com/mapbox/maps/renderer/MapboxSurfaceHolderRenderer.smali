.class public final Lcom/mapbox/maps/renderer/MapboxSurfaceHolderRenderer;
.super Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002B)\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB\u0011\u0008\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000b\u0010\u000fJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/MapboxSurfaceHolderRenderer;",
        "Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;",
        "Landroid/view/SurfaceHolder$Callback;",
        "Landroid/view/SurfaceHolder;",
        "surfaceHolder",
        "",
        "antialiasingSampleCount",
        "Lcom/mapbox/maps/ContextMode;",
        "contextMode",
        "",
        "mapName",
        "<init>",
        "(Landroid/view/SurfaceHolder;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V",
        "Lcom/mapbox/maps/renderer/MapboxRenderThread;",
        "renderThread",
        "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V",
        "holder",
        "format",
        "width",
        "height",
        "Ll83/a0;",
        "surfaceChanged",
        "(Landroid/view/SurfaceHolder;III)V",
        "surfaceDestroyed",
        "(Landroid/view/SurfaceHolder;)V",
        "surfaceCreated",
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


# direct methods
.method public constructor <init>(Landroid/view/SurfaceHolder;ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V
    .locals 1

    const-string v0, "surfaceHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p2, p3, p4}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;-><init>(ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V
    .locals 1

    const-string v0, "renderThread"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    const-string p2, "holder.surface"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3, p4}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->surfaceChanged(Landroid/view/Surface;II)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->surfaceCreated()V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->surfaceDestroyed()V

    return-void
.end method
