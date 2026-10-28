.class public abstract Lcom/mapbox/maps/renderer/MapboxRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/DelegatingMapClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/renderer/MapboxRenderer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008 \u0018\u0000 ]2\u00020\u0001:\u0001]B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0013\u0010\u0008J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0019\u0010\u0008J\r\u0010\u001a\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001a\u0010\u0008J\u000f\u0010\u001b\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u0008J\u000f\u0010\u001c\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u0008J\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0014H\u0007\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010\'\u001a\u00020\u00062\u0006\u0010!\u001a\u00020&H\u0007\u00a2\u0006\u0004\u0008\'\u0010(J\u0019\u0010+\u001a\u0004\u0018\u00010\u001d2\u0006\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008+\u0010,R\"\u0010.\u001a\u00020-8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u0010\u000cR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u00108R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u00108R*\u0010:\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008:\u0010;\u0012\u0004\u0008@\u0010\u0008\u001a\u0004\u0008<\u0010=\"\u0004\u0008>\u0010?R(\u0010B\u001a\u00020A8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008B\u0010C\u0012\u0004\u0008H\u0010\u0008\u001a\u0004\u0008D\u0010E\"\u0004\u0008F\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u001a\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008O\u0010P\u0012\u0004\u0008Q\u0010\u0008R*\u0010S\u001a\u00020)2\u0006\u0010R\u001a\u00020)8A@AX\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010XR\u0014\u0010\\\u001a\u00020Y8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010[\u00a8\u0006^"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/MapboxRenderer;",
        "Lcom/mapbox/maps/DelegatingMapClient;",
        "",
        "mapName",
        "<init>",
        "(Ljava/lang/String;)V",
        "Ll83/a0;",
        "onDestroy",
        "()V",
        "Lcom/mapbox/maps/NativeMapImpl;",
        "map",
        "setMap",
        "(Lcom/mapbox/maps/NativeMapImpl;)V",
        "scheduleRepaint",
        "Ljava/lang/Runnable;",
        "runnable",
        "queueRenderEvent",
        "(Ljava/lang/Runnable;)V",
        "queueNonRenderEvent",
        "createRenderer",
        "",
        "width",
        "height",
        "onSurfaceChanged",
        "(II)V",
        "destroyRenderer",
        "render",
        "onStop",
        "onStart",
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
        "",
        "legacyMode",
        "performSnapshot",
        "(Z)Landroid/graphics/Bitmap;",
        "Lcom/mapbox/maps/renderer/MapboxRenderThread;",
        "renderThread",
        "Lcom/mapbox/maps/renderer/MapboxRenderThread;",
        "getRenderThread$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/MapboxRenderThread;",
        "setRenderThread$maps_sdk_release",
        "(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V",
        "Lcom/mapbox/maps/NativeMapImpl;",
        "getMap$maps_sdk_release",
        "()Lcom/mapbox/maps/NativeMapImpl;",
        "setMap$maps_sdk_release",
        "I",
        "Lcom/mapbox/maps/renderer/gl/PixelReader;",
        "pixelReader",
        "Lcom/mapbox/maps/renderer/gl/PixelReader;",
        "getPixelReader$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/gl/PixelReader;",
        "setPixelReader$maps_sdk_release",
        "(Lcom/mapbox/maps/renderer/gl/PixelReader;)V",
        "getPixelReader$maps_sdk_release$annotations",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "readyForSnapshot",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "getReadyForSnapshot$maps_sdk_release",
        "()Ljava/util/concurrent/atomic/AtomicBoolean;",
        "setReadyForSnapshot$maps_sdk_release",
        "(Ljava/util/concurrent/atomic/AtomicBoolean;)V",
        "getReadyForSnapshot$maps_sdk_release$annotations",
        "Lcom/mapbox/common/Cancelable;",
        "renderFrameCancelable",
        "Lcom/mapbox/common/Cancelable;",
        "Lcom/mapbox/maps/RenderFrameFinishedCallback;",
        "renderFrameFinishedCallback",
        "Lcom/mapbox/maps/RenderFrameFinishedCallback;",
        "TAG",
        "Ljava/lang/String;",
        "getTAG$annotations",
        "<set-?>",
        "snapshotLegacyModeEnabled",
        "Z",
        "getSnapshotLegacyModeEnabled$maps_sdk_release",
        "()Z",
        "setSnapshotLegacyModeEnabled$maps_sdk_release",
        "(Z)V",
        "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;",
        "getWidgetRenderer$maps_sdk_release",
        "()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;",
        "widgetRenderer",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/mapbox/maps/renderer/MapboxRenderer$Companion;

.field private static final repaintRenderEvent:Lcom/mapbox/maps/renderer/RenderEvent;


# instance fields
.field private final TAG:Ljava/lang/String;

.field private height:I

.field private map:Lcom/mapbox/maps/NativeMapImpl;

.field private pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

.field private readyForSnapshot:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private renderFrameCancelable:Lcom/mapbox/common/Cancelable;

.field private final renderFrameFinishedCallback:Lcom/mapbox/maps/RenderFrameFinishedCallback;

.field public renderThread:Lcom/mapbox/maps/renderer/MapboxRenderThread;

.field private snapshotLegacyModeEnabled:Z

.field private width:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/mapbox/maps/renderer/MapboxRenderer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/renderer/MapboxRenderer;->Companion:Lcom/mapbox/maps/renderer/MapboxRenderer$Companion;

    new-instance v0, Lcom/mapbox/maps/renderer/RenderEvent;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/mapbox/maps/renderer/RenderEvent;-><init>(Ljava/lang/Runnable;Z)V

    sput-object v0, Lcom/mapbox/maps/renderer/MapboxRenderer;->repaintRenderEvent:Lcom/mapbox/maps/renderer/RenderEvent;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const-string v0, "mapName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->readyForSnapshot:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lab/g0;

    const/16 v1, 0x15

    invoke-direct {v0, p0, v1}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->renderFrameFinishedCallback:Lcom/mapbox/maps/RenderFrameFinishedCallback;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Mbgl-Renderer"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "\\"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->TAG:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/g0;Lcom/mapbox/maps/renderer/MapboxRenderer;ZLjava/util/concurrent/locks/Condition;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/renderer/MapboxRenderer;->snapshot$lambda$3$lambda$2(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/g0;Lcom/mapbox/maps/renderer/MapboxRenderer;ZLjava/util/concurrent/locks/Condition;)V

    return-void
.end method

.method public static final synthetic access$getRepaintRenderEvent$cp()Lcom/mapbox/maps/renderer/RenderEvent;
    .locals 1

    sget-object v0, Lcom/mapbox/maps/renderer/MapboxRenderer;->repaintRenderEvent:Lcom/mapbox/maps/renderer/RenderEvent;

    return-object v0
.end method

.method public static synthetic b(Lcom/mapbox/maps/MapView$OnSnapshotReady;Lcom/mapbox/maps/renderer/MapboxRenderer;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mapbox/maps/renderer/MapboxRenderer;->snapshot$lambda$4(Lcom/mapbox/maps/MapView$OnSnapshotReady;Lcom/mapbox/maps/renderer/MapboxRenderer;Z)V

    return-void
.end method

.method public static synthetic c(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/RenderFrameFinished;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderer;->renderFrameFinishedCallback$lambda$0(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/RenderFrameFinished;)V

    return-void
.end method

.method public static synthetic getPixelReader$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getReadyForSnapshot$maps_sdk_release$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getTAG$annotations()V
    .locals 0

    return-void
.end method

.method private final performSnapshot(Z)Landroid/graphics/Bitmap;
    .locals 12

    iget v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->width:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->height:I

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->TAG:Ljava/lang/String;

    const-string v0, "Could not take map snapshot because map is not ready yet."

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/gl/PixelReader;->getWidth()I

    move-result v0

    iget v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->width:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/gl/PixelReader;->getHeight()I

    move-result v0

    iget v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->height:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/gl/PixelReader;->getLegacyMode()Z

    move-result v0

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/gl/PixelReader;->release()V

    :cond_2
    new-instance v0, Lcom/mapbox/maps/renderer/gl/PixelReader;

    iget v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->width:I

    iget v3, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->height:I

    invoke-direct {v0, v2, v3, p1}, Lcom/mapbox/maps/renderer/gl/PixelReader;-><init>(IIZ)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    :goto_0
    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/gl/PixelReader;->readPixels()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    iget v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->width:I

    iget v3, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->height:I

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    iget v8, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->width:I

    int-to-float v0, v8

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    iget v9, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->height:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-float v3, v9

    div-float/2addr v3, v2

    :try_start_1
    new-instance v10, Landroid/graphics/Matrix;

    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v10, v2, v4, v0, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    const/4 v11, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v11}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Exception "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " happened when reading pixels"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/gl/PixelReader;->getLegacyMode()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->TAG:Ljava/lang/String;

    const-string v1, "Re-creating PixelReader with no PBO support and making snapshot again"

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/gl/PixelReader;->release()V

    new-instance v0, Lcom/mapbox/maps/renderer/gl/PixelReader;

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/gl/PixelReader;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/gl/PixelReader;->getHeight()I

    move-result p1

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Lcom/mapbox/maps/renderer/gl/PixelReader;-><init>(IIZ)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    invoke-direct {p0, v2}, Lcom/mapbox/maps/renderer/MapboxRenderer;->performSnapshot(Z)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v1
.end method

.method private static final renderFrameFinishedCallback$lambda$0(Lcom/mapbox/maps/renderer/MapboxRenderer;Lcom/mapbox/maps/RenderFrameFinished;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/RenderFrameFinished;->getRenderMode()Lcom/mapbox/maps/RenderModeType;

    move-result-object p1

    sget-object v0, Lcom/mapbox/maps/RenderModeType;->FULL:Lcom/mapbox/maps/RenderModeType;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->readyForSnapshot:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->renderFrameCancelable:Lcom/mapbox/common/Cancelable;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/mapbox/common/Cancelable;->cancel()V

    :cond_0
    return-void
.end method

.method private static final snapshot$lambda$3$lambda$2(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/g0;Lcom/mapbox/maps/renderer/MapboxRenderer;ZLjava/util/concurrent/locks/Condition;)V
    .locals 1

    const-string v0, "$lock"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$snapshot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-direct {p2, p3}, Lcom/mapbox/maps/renderer/MapboxRenderer;->performSnapshot(Z)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-interface {p4}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method private static final snapshot$lambda$4(Lcom/mapbox/maps/MapView$OnSnapshotReady;Lcom/mapbox/maps/renderer/MapboxRenderer;Z)V
    .locals 1

    const-string v0, "$listener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/mapbox/maps/renderer/MapboxRenderer;->performSnapshot(Z)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/mapbox/maps/MapView$OnSnapshotReady;->onSnapshotReady(Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public final createRenderer()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->map:Lcom/mapbox/maps/NativeMapImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/maps/NativeMapImpl;->createRenderer()V

    :cond_0
    return-void
.end method

.method public final destroyRenderer()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->map:Lcom/mapbox/maps/NativeMapImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/maps/NativeMapImpl;->destroyRenderer()V

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/gl/PixelReader;->release()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    return-void
.end method

.method public final getMap$maps_sdk_release()Lcom/mapbox/maps/NativeMapImpl;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->map:Lcom/mapbox/maps/NativeMapImpl;

    return-object v0
.end method

.method public final getPixelReader$maps_sdk_release()Lcom/mapbox/maps/renderer/gl/PixelReader;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    return-object v0
.end method

.method public final getReadyForSnapshot$maps_sdk_release()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->readyForSnapshot:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method public final getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->renderThread:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "renderThread"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getSnapshotLegacyModeEnabled$maps_sdk_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->snapshotLegacyModeEnabled:Z

    return v0
.end method

.method public abstract getWidgetRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;
.end method

.method public final onDestroy()V
    .locals 2

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getWidgetRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->cleanUpAllWidgets()V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->destroy$maps_sdk_release()V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setFpsChangedListener$maps_sdk_release(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V

    return-void
.end method

.method public final onStart()V
    .locals 2

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->resume()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->map:Lcom/mapbox/maps/NativeMapImpl;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->renderFrameFinishedCallback:Lcom/mapbox/maps/RenderFrameFinishedCallback;

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/NativeMapImpl;->subscribe(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->renderFrameCancelable:Lcom/mapbox/common/Cancelable;

    return-void
.end method

.method public final onStop()V
    .locals 2

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->pause()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->renderFrameCancelable:Lcom/mapbox/common/Cancelable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/mapbox/common/Cancelable;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->readyForSnapshot:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final onSurfaceChanged(II)V
    .locals 2

    iget v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->width:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->height:I

    if-eq p2, v0, :cond_1

    :cond_0
    iput p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->width:I

    iput p2, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->height:I

    const/4 v0, 0x0

    invoke-static {v0, v0, p1, p2}, Landroid/opengl/GLES20;->glViewport(IIII)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->map:Lcom/mapbox/maps/NativeMapImpl;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/mapbox/maps/Size;

    int-to-float p1, p1

    int-to-float p2, p2

    invoke-direct {v1, p1, p2}, Lcom/mapbox/maps/Size;-><init>(FF)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/NativeMapImpl;->setSize(Lcom/mapbox/maps/Size;)V

    :cond_1
    return-void
.end method

.method public final queueNonRenderEvent(Ljava/lang/Runnable;)V
    .locals 3

    const-string v0, "runnable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    new-instance v1, Lcom/mapbox/maps/renderer/RenderEvent;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/mapbox/maps/renderer/RenderEvent;-><init>(Ljava/lang/Runnable;Z)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->queueRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;)V

    return-void
.end method

.method public final queueRenderEvent(Ljava/lang/Runnable;)V
    .locals 3

    const-string v0, "runnable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    new-instance v1, Lcom/mapbox/maps/renderer/RenderEvent;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/mapbox/maps/renderer/RenderEvent;-><init>(Ljava/lang/Runnable;Z)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->queueRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;)V

    return-void
.end method

.method public final render()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->map:Lcom/mapbox/maps/NativeMapImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/maps/NativeMapImpl;->render()V

    :cond_0
    return-void
.end method

.method public scheduleRepaint()V
    .locals 2

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    sget-object v1, Lcom/mapbox/maps/renderer/MapboxRenderer;->repaintRenderEvent:Lcom/mapbox/maps/renderer/RenderEvent;

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->queueRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;)V

    return-void
.end method

.method public final declared-synchronized setMap(Lcom/mapbox/maps/NativeMapImpl;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->map:Lcom/mapbox/maps/NativeMapImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setMap$maps_sdk_release(Lcom/mapbox/maps/NativeMapImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->map:Lcom/mapbox/maps/NativeMapImpl;

    return-void
.end method

.method public final setMaximumFps(I)V
    .locals 3

    if-gtz p1, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Maximum FPS could not be <= 0, ignoring "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " value."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setUserRefreshRate(I)V

    return-void
.end method

.method public final declared-synchronized setOnFpsChangedListener(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->setFpsChangedListener$maps_sdk_release(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setPixelReader$maps_sdk_release(Lcom/mapbox/maps/renderer/gl/PixelReader;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->pixelReader:Lcom/mapbox/maps/renderer/gl/PixelReader;

    return-void
.end method

.method public final setReadyForSnapshot$maps_sdk_release(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->readyForSnapshot:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public final setRenderThread$maps_sdk_release(Lcom/mapbox/maps/renderer/MapboxRenderThread;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->renderThread:Lcom/mapbox/maps/renderer/MapboxRenderThread;

    return-void
.end method

.method public final setSnapshotLegacyModeEnabled$maps_sdk_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->snapshotLegacyModeEnabled:Z

    return-void
.end method

.method public final snapshot()Landroid/graphics/Bitmap;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->readyForSnapshot:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->TAG:Ljava/lang/String;

    const-string v1, "Could not take map snapshot because map is not ready yet."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 4
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v6

    .line 5
    iget-boolean v5, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->snapshotLegacyModeEnabled:Z

    .line 6
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 7
    :try_start_0
    new-instance v3, Lkotlin/jvm/internal/g0;

    .line 8
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 9
    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v0

    .line 10
    new-instance v7, Lcom/mapbox/maps/renderer/RenderEvent;

    .line 11
    new-instance v1, Lcom/mapbox/maps/renderer/b;

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lcom/mapbox/maps/renderer/b;-><init>(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/internal/g0;Lcom/mapbox/maps/renderer/MapboxRenderer;ZLjava/util/concurrent/locks/Condition;)V

    const/4 v4, 0x1

    .line 12
    invoke-direct {v7, v1, v4}, Lcom/mapbox/maps/renderer/RenderEvent;-><init>(Ljava/lang/Runnable;Z)V

    .line 13
    invoke-virtual {v0, v7}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->queueRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;)V

    .line 14
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1

    invoke-interface {v6, v4, v5, v0}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 15
    iget-object v0, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final snapshot(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V
    .locals 4

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->readyForSnapshot:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->TAG:Ljava/lang/String;

    const-string v1, "Could not take map snapshot because map is not ready yet."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 18
    invoke-interface {p1, v0}, Lcom/mapbox/maps/MapView$OnSnapshotReady;->onSnapshotReady(Landroid/graphics/Bitmap;)V

    .line 19
    :cond_0
    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxRenderer;->snapshotLegacyModeEnabled:Z

    .line 20
    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxRenderer;->getRenderThread$maps_sdk_release()Lcom/mapbox/maps/renderer/MapboxRenderThread;

    move-result-object v1

    .line 21
    new-instance v2, Lcom/mapbox/maps/renderer/RenderEvent;

    .line 22
    new-instance v3, Lcom/mapbox/maps/renderer/c;

    invoke-direct {v3, p1, p0, v0}, Lcom/mapbox/maps/renderer/c;-><init>(Lcom/mapbox/maps/MapView$OnSnapshotReady;Lcom/mapbox/maps/renderer/MapboxRenderer;Z)V

    const/4 p1, 0x1

    .line 23
    invoke-direct {v2, v3, p1}, Lcom/mapbox/maps/renderer/RenderEvent;-><init>(Ljava/lang/Runnable;Z)V

    .line 24
    invoke-virtual {v1, v2}, Lcom/mapbox/maps/renderer/MapboxRenderThread;->queueRenderEvent(Lcom/mapbox/maps/renderer/RenderEvent;)V

    return-void
.end method
