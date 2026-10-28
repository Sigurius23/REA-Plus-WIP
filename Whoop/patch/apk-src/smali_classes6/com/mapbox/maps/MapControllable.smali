.class public interface abstract Lcom/mapbox/maps/MapControllable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/MapboxLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/MapControllable$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\'\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\'\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\'\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H&\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H&\u00a2\u0006\u0004\u0008,\u0010+R\u0014\u00100\u001a\u00020-8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010/\u00a8\u00061"
    }
    d2 = {
        "Lcom/mapbox/maps/MapControllable;",
        "Lcom/mapbox/maps/MapboxLifecycleObserver;",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "onGenericMotionEvent",
        "",
        "w",
        "h",
        "Ll83/a0;",
        "onSizeChanged",
        "(II)V",
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
        "Lcom/mapbox/maps/MapboxMap;",
        "getMapboxMap",
        "()Lcom/mapbox/maps/MapboxMap;",
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


# virtual methods
.method public abstract addRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
.end method

.method public abstract addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation
.end method

.method public abstract getMapboxMap()Lcom/mapbox/maps/MapboxMap;
.end method

.method public abstract onGenericMotionEvent(Landroid/view/MotionEvent;)Z
.end method

.method public abstract onSizeChanged(II)V
.end method

.method public abstract onTouchEvent(Landroid/view/MotionEvent;)Z
.end method

.method public abstract queueEvent(Ljava/lang/Runnable;Z)V
.end method

.method public abstract removeRendererSetupErrorListener(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
.end method

.method public abstract removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation
.end method

.method public abstract setMaximumFps(I)V
.end method

.method public abstract setOnFpsChangedListener(Lcom/mapbox/maps/renderer/OnFpsChangedListener;)V
.end method

.method public abstract setRenderThreadStatsRecorder(Lcom/mapbox/maps/renderer/RenderThreadStatsRecorder;)V
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation
.end method

.method public abstract snapshot()Landroid/graphics/Bitmap;
.end method

.method public abstract snapshot(Lcom/mapbox/maps/MapView$OnSnapshotReady;)V
.end method
