.class public final Lcom/mapbox/maps/MapView$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/maps/MapView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0081\u0002\u00a2\u0006\u0002\u0008\u000eJ\u0008\u0010\u000f\u001a\u00020\u0010H\u0007J\u0008\u0010\u0011\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/mapbox/maps/MapView$Companion;",
        "",
        "()V",
        "DEFAULT_ANTIALIASING_SAMPLE_COUNT",
        "",
        "DEFAULT_FPS",
        "invoke",
        "Lcom/mapbox/maps/MapView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "mapController",
        "Lcom/mapbox/maps/MapController;",
        "invoke$maps_sdk_release",
        "isRenderingSupported",
        "",
        "isTerrainRenderingSupported",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mapbox/maps/MapView$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic invoke$maps_sdk_release(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapController;)Lcom/mapbox/maps/MapView;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/MapView;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/mapbox/maps/MapView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/mapbox/maps/MapController;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final isRenderingSupported()Z
    .locals 7

    new-instance v0, Lcom/mapbox/maps/renderer/egl/EGLCore;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, Lcom/mapbox/maps/renderer/egl/EGLCore;-><init>(ZILandroid/opengl/EGLContext;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->prepareEgl()Z

    move-result v1

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->release()V

    return v1
.end method

.method public final isTerrainRenderingSupported()Z
    .locals 7

    new-instance v0, Lcom/mapbox/maps/renderer/egl/EGLCore;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, ""

    invoke-direct/range {v0 .. v6}, Lcom/mapbox/maps/renderer/egl/EGLCore;-><init>(ZILandroid/opengl/EGLContext;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->prepareEgl()Z

    move-result v1

    invoke-virtual {v0, v2, v2}, Lcom/mapbox/maps/renderer/egl/EGLCore;->createOffscreenSurface(II)Landroid/opengl/EGLSurface;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/mapbox/maps/renderer/egl/EGLCore;->makeCurrent(Landroid/opengl/EGLSurface;)Z

    invoke-static {v2}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    move-result-object v4

    const v5, 0x8b4c

    invoke-static {v5, v4}, Landroid/opengl/GLES20;->glGetIntegerv(ILjava/nio/IntBuffer;)V

    invoke-virtual {v4}, Ljava/nio/IntBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v4}, Ljava/nio/IntBuffer;->get()I

    move-result v4

    const/4 v5, 0x0

    if-lez v4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    invoke-virtual {v0, v3}, Lcom/mapbox/maps/renderer/egl/EGLCore;->releaseSurface(Landroid/opengl/EGLSurface;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->release()V

    if-eqz v1, :cond_1

    if-eqz v4, :cond_1

    return v2

    :cond_1
    return v5
.end method
