.class public final Lcom/mapbox/maps/MapSurface;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/f;
.implements Lcom/mapbox/maps/MapControllable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0018\u00002\u00020\u00012\u00020\u0002B#\u0008\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB1\u0008\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0018\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u0019H\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\"\u0010!J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008%\u0010\u0017J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008+\u0010/J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u00081\u00102J\u0017\u00104\u001a\u00020\u00102\u0006\u0010.\u001a\u000203H\u0016\u00a2\u0006\u0004\u00084\u00105J\u0017\u00108\u001a\u00020\u00102\u0006\u00107\u001a\u000206H\u0017\u00a2\u0006\u0004\u00088\u00109J\u000f\u0010:\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008:\u0010\u0012J\u000f\u0010;\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008;\u0010\u0012J\u000f\u0010<\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008<\u0010\u0012J\u000f\u0010=\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008=\u0010\u0012J\u0017\u0010@\u001a\u00020\u00102\u0006\u0010?\u001a\u00020>H\u0017\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010B\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020>H\u0017\u00a2\u0006\u0004\u0008B\u0010CJ\u0017\u0010F\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0016\u00a2\u0006\u0004\u0008F\u0010GJ\u0017\u0010H\u001a\u00020\u00102\u0006\u0010E\u001a\u00020DH\u0016\u00a2\u0006\u0004\u0008H\u0010GJ#\u0010M\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010J*\u00020I2\u0006\u0010L\u001a\u00020KH\u0016\u00a2\u0006\u0004\u0008M\u0010NR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010OR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010PR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010QR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010RR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010S\u001a\u0004\u0008T\u0010UR\u0014\u0010V\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001b\u00a8\u0006W"
    }
    d2 = {
        "Lcom/mapbox/maps/MapSurface;",
        "Lmv/f;",
        "Lcom/mapbox/maps/MapControllable;",
        "Landroid/content/Context;",
        "context",
        "Landroid/view/Surface;",
        "surface",
        "Lcom/mapbox/maps/MapInitOptions;",
        "mapInitOptions",
        "<init>",
        "(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;)V",
        "Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;",
        "renderer",
        "Lcom/mapbox/maps/MapController;",
        "mapController",
        "(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;Lcom/mapbox/maps/MapController;)V",
        "Ll83/a0;",
        "surfaceCreated",
        "()V",
        "",
        "width",
        "height",
        "surfaceChanged",
        "(II)V",
        "surfaceDestroyed",
        "Lcom/mapbox/maps/MapboxMap;",
        "getMapboxMapDeprecated",
        "()Lcom/mapbox/maps/MapboxMap;",
        "getMapboxMap",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "onGenericMotionEvent",
        "w",
        "h",
        "onSizeChanged",
        "Ljava/lang/Runnable;",
        "needRender",
        "queueEvent",
        "(Ljava/lang/Runnable;Z)V",
        "Landroid/graphics/Bitmap;",
        "snapshot",
        "()Landroid/graphics/Bitmap;",
        "Lcom/mapbox/maps/MapView$OnSnapshotReady;",
        "listener",
        "(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V",
        "fps",
        "setMaximumFps",
        "(I)V",
        "Lcom/mapbox/maps/renderer/OnFpsChangedListener;",
        "setOnFpsChangedListener",
        "(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V",
        "Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;",
        "renderThreadStatsRecorder",
        "setRenderThreadStatsRecorder",
        "(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V",
        "onStart",
        "onStop",
        "onDestroy",
        "onLowMemory",
        "Lcom/mapbox/maps/renderer/widget/Widget;",
        "widget",
        "addWidget",
        "(Lcom/mapbox/maps/renderer/widget/Widget;)V",
        "removeWidget",
        "(Lcom/mapbox/maps/renderer/widget/Widget;)Z",
        "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;",
        "rendererSetupErrorListener",
        "addRendererSetupErrorListener",
        "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V",
        "removeRendererSetupErrorListener",
        "Lev/j;",
        "T",
        "",
        "id",
        "getPlugin",
        "(Ljava/lang/String;)Lev/j;",
        "Landroid/content/Context;",
        "Lcom/mapbox/maps/MapController;",
        "Lcom/mapbox/maps/MapInitOptions;",
        "Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;",
        "Landroid/view/Surface;",
        "getSurface",
        "()Landroid/view/Surface;",
        "mapboxMap",
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
.field private final context:Landroid/content/Context;

.field private final mapController:Lcom/mapbox/maps/MapController;

.field private final mapInitOptions:Lcom/mapbox/maps/MapInitOptions;

.field private final renderer:Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;

.field private final surface:Landroid/view/Surface;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/Surface;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surface"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/mapbox/maps/MapSurface;-><init>(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surface"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapInitOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/mapbox/maps/MapSurface;->context:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Lcom/mapbox/maps/MapSurface;->surface:Landroid/view/Surface;

    .line 7
    iput-object p3, p0, Lcom/mapbox/maps/MapSurface;->mapInitOptions:Lcom/mapbox/maps/MapInitOptions;

    .line 8
    new-instance p1, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;

    .line 9
    invoke-virtual {p3}, Lcom/mapbox/maps/MapInitOptions;->getAntialiasingSampleCount()I

    move-result p2

    .line 10
    invoke-virtual {p3}, Lcom/mapbox/maps/MapInitOptions;->getMapOptions()Lcom/mapbox/maps/MapOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/MapOptions;->getContextMode()Lcom/mapbox/maps/ContextMode;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/mapbox/maps/ContextMode;->UNIQUE:Lcom/mapbox/maps/ContextMode;

    :cond_0
    const-string v1, "mapInitOptions.mapOption\u2026ode ?: ContextMode.UNIQUE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p3}, Lcom/mapbox/maps/MapInitOptions;->getMapName()Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-direct {p1, p2, v0, v1}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;-><init>(ILcom/mapbox/maps/ContextMode;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/MapSurface;->renderer:Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;

    .line 13
    new-instance p2, Lcom/mapbox/maps/MapController;

    invoke-direct {p2, p1, p3}, Lcom/mapbox/maps/MapController;-><init>(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/MapInitOptions;)V

    const/4 p1, 0x2

    const/4 v0, 0x0

    .line 14
    invoke-static {p2, p3, v0, p1, v0}, Lcom/mapbox/maps/MapController;->initializePlugins$default(Lcom/mapbox/maps/MapController;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/MapView;ILjava/lang/Object;)V

    .line 15
    iput-object p2, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/mapbox/maps/MapInitOptions;

    const/16 v11, 0x1fe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v12}, Lcom/mapbox/maps/MapInitOptions;-><init>(Landroid/content/Context;Lcom/mapbox/maps/MapOptions;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;ZLjava/lang/String;Landroid/util/AttributeSet;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p3

    .line 3
    :goto_0
    invoke-direct {p0, p1, p2, v1}, Lcom/mapbox/maps/MapSurface;-><init>(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Surface;Lcom/mapbox/maps/MapInitOptions;Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;Lcom/mapbox/maps/MapController;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surface"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapInitOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapController"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/mapbox/maps/MapSurface;->context:Landroid/content/Context;

    .line 18
    iput-object p2, p0, Lcom/mapbox/maps/MapSurface;->surface:Landroid/view/Surface;

    .line 19
    iput-object p3, p0, Lcom/mapbox/maps/MapSurface;->mapInitOptions:Lcom/mapbox/maps/MapInitOptions;

    .line 20
    iput-object p4, p0, Lcom/mapbox/maps/MapSurface;->renderer:Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;

    .line 21
    iput-object p5, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    return-void
.end method


# virtual methods
.method public addRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 1

    const-string v0, "rendererSetupErrorListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->addRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V

    return-void
.end method

.method public addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V

    return-void
.end method

.method public getMapboxMap()Lcom/mapbox/maps/MapboxMap;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getMapboxMapDeprecated()Lcom/mapbox/maps/MapboxMap;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    invoke-virtual {p0}, Lcom/mapbox/maps/MapSurface;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    return-object v0
.end method

.method public getPlugin(Ljava/lang/String;)Lev/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lev/j;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object p1

    return-object p1
.end method

.method public final getSurface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->surface:Landroid/view/Surface;

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->onDestroy()V

    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->onLowMemory()V

    return-void
.end method

.method public onSizeChanged(II)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1, p2}, Lcom/mapbox/maps/MapController;->onSizeChanged(II)V

    return-void
.end method

.method public onStart()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->onStart()V

    return-void
.end method

.method public onStop()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->onStop()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public queueEvent(Ljava/lang/Runnable;Z)V
    .locals 3

    const-string p2, "event"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, p1, v2, v0, v1}, Lcom/mapbox/maps/MapControllable$DefaultImpls;->queueEvent$default(Lcom/mapbox/maps/MapControllable;Ljava/lang/Runnable;ZILjava/lang/Object;)V

    return-void
.end method

.method public removeRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 1

    const-string v0, "rendererSetupErrorListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->removeRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V

    return-void
.end method

.method public removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z

    move-result p1

    return p1
.end method

.method public setMaximumFps(I)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->renderer:Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setMaximumFps(I)V

    return-void
.end method

.method public setOnFpsChangedListener(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->renderer:Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->setOnFpsChangedListener(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V

    return-void
.end method

.method public setRenderThreadStatsRecorder(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V
    .locals 1
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "renderThreadStatsRecorder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->setRenderThreadStatsRecorder(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V

    return-void
.end method

.method public snapshot()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapController;->snapshot()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public snapshot(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapController;->snapshot(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V

    return-void
.end method

.method public final surfaceChanged(II)V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->renderer:Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;

    iget-object v1, p0, Lcom/mapbox/maps/MapSurface;->surface:Landroid/view/Surface;

    invoke-virtual {v0, v1, p1, p2}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->surfaceChanged(Landroid/view/Surface;II)V

    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/MapSurface;->onSizeChanged(II)V

    return-void
.end method

.method public final surfaceCreated()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->renderer:Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->surfaceCreated()V

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->context:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Display;->getRefreshRate()F

    move-result v0

    float-to-int v0, v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x3c

    :goto_0
    iget-object v1, p0, Lcom/mapbox/maps/MapSurface;->mapController:Lcom/mapbox/maps/MapController;

    invoke-virtual {v1, v0}, Lcom/mapbox/maps/MapController;->setScreenRefreshRate$maps_sdk_release(I)V

    return-void
.end method

.method public final surfaceDestroyed()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapSurface;->renderer:Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxSurfaceRenderer;->surfaceDestroyed()V

    return-void
.end method
