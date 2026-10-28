.class public final Lcom/mapbox/maps/coroutine/MapboxMapExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ee\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\n\u001aC\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a3\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0016\u001a?\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u001b0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00082\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u001a\u001a\u00020\u0008H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001aK\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00082\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u001a\u001a\u00020\u00082\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0008H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!\u001a7\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00082\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0008H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010#\u001aG\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00082\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u001a\u001a\u00020\u00082\u0006\u0010$\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008%\u0010&\u001a!\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0(*\u00020\u00002\u0006\u0010\'\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008*\u0010+\u001aQ\u00106\u001a\u00020/*\u00020\u00002\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0,2\u0006\u00100\u001a\u00020/2\n\u0008\u0002\u00102\u001a\u0004\u0018\u0001012\n\u0008\u0002\u00104\u001a\u0004\u0018\u0001032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u000105H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0004\u00086\u00107\"\u001b\u0010;\u001a\u0008\u0012\u0004\u0012\u0002080(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:\"\u001b\u0010>\u001a\u0008\u0012\u0004\u0012\u00020<0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010:\"\u001b\u0010A\u001a\u0008\u0012\u0004\u0012\u00020?0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010:\"\u001b\u0010D\u001a\u0008\u0012\u0004\u0012\u00020B0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010:\"\u001b\u0010G\u001a\u0008\u0012\u0004\u0012\u00020E0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010:\"$\u0010L\u001a\u0008\u0012\u0004\u0012\u00020H0(*\u00020\u00008FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008J\u0010K\u001a\u0004\u0008I\u0010:\"\u001b\u0010O\u001a\u0008\u0012\u0004\u0012\u00020M0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010:\"\u001b\u0010R\u001a\u0008\u0012\u0004\u0012\u00020P0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010:\"\u001b\u0010U\u001a\u0008\u0012\u0004\u0012\u00020S0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010:\"\u001b\u0010X\u001a\u0008\u0012\u0004\u0012\u00020V0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010:\"\u001b\u0010[\u001a\u0008\u0012\u0004\u0012\u00020Y0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008Z\u0010:\"\u001b\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\\0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008]\u0010:\"\u001b\u0010a\u001a\u0008\u0012\u0004\u0012\u00020_0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008`\u0010:\"\u001b\u0010d\u001a\u0008\u0012\u0004\u0012\u00020b0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008c\u0010:\"\u001b\u0010g\u001a\u0008\u0012\u0004\u0012\u00020e0(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008f\u0010:\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006h"
    }
    d2 = {
        "Lcom/mapbox/maps/MapboxMap;",
        "Lcom/mapbox/maps/Style;",
        "awaitStyle",
        "(Lcom/mapbox/maps/MapboxMap;Lq83/d;)Ljava/lang/Object;",
        "Luu/a;",
        "styleExtension",
        "awaitLoadStyle",
        "(Lcom/mapbox/maps/MapboxMap;Luu/a;Lq83/d;)Ljava/lang/Object;",
        "",
        "style",
        "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "sourceIdentifier",
        "Lcom/mapbox/geojson/Feature;",
        "cluster",
        "",
        "limit",
        "offset",
        "Lcom/mapbox/bindgen/Expected;",
        "Lcom/mapbox/maps/FeatureExtensionValue;",
        "getGeoJsonClusterLeaves",
        "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;JJLq83/d;)Ljava/lang/Object;",
        "getGeoJsonClusterChildren",
        "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lq83/d;)Ljava/lang/Object;",
        "getGeoJsonClusterExpansionZoom",
        "sourceId",
        "sourceLayerId",
        "featureId",
        "Lcom/mapbox/bindgen/Value;",
        "getFeatureState",
        "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "stateKey",
        "Lcom/mapbox/bindgen/None;",
        "removeFeatureState",
        "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "resetFeatureStates",
        "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "state",
        "setFeatureState",
        "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lq83/d;)Ljava/lang/Object;",
        "eventName",
        "Lec3/l;",
        "Lcom/mapbox/maps/GenericEvent;",
        "genericEvents",
        "(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;)Lec3/l;",
        "",
        "Lcom/mapbox/geojson/Point;",
        "coordinates",
        "Lcom/mapbox/maps/CameraOptions;",
        "camera",
        "Lcom/mapbox/maps/EdgeInsets;",
        "coordinatesPadding",
        "",
        "maxZoom",
        "Lcom/mapbox/maps/ScreenCoordinate;",
        "cameraForCoordinates",
        "(Lcom/mapbox/maps/MapboxMap;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;)Ljava/lang/Object;",
        "Lcom/mapbox/maps/MapLoaded;",
        "getMapLoadedEvents",
        "(Lcom/mapbox/maps/MapboxMap;)Lec3/l;",
        "mapLoadedEvents",
        "Lcom/mapbox/maps/MapLoadingError;",
        "getMapLoadingErrorEvents",
        "mapLoadingErrorEvents",
        "Lcom/mapbox/maps/StyleLoaded;",
        "getStyleLoadedEvents",
        "styleLoadedEvents",
        "Lcom/mapbox/maps/StyleDataLoaded;",
        "getStyleDataLoadedEvents",
        "styleDataLoadedEvents",
        "Lcom/mapbox/maps/CameraChanged;",
        "getCameraChangedEvents",
        "cameraChangedEvents",
        "Lcom/mapbox/maps/CameraChangedCoalesced;",
        "getCameraChangedCoalescedEvents",
        "getCameraChangedCoalescedEvents$annotations",
        "(Lcom/mapbox/maps/MapboxMap;)V",
        "cameraChangedCoalescedEvents",
        "Lcom/mapbox/maps/MapIdle;",
        "getMapIdleEvents",
        "mapIdleEvents",
        "Lcom/mapbox/maps/SourceAdded;",
        "getSourceAddedEvents",
        "sourceAddedEvents",
        "Lcom/mapbox/maps/SourceRemoved;",
        "getSourceRemovedEvents",
        "sourceRemovedEvents",
        "Lcom/mapbox/maps/SourceDataLoaded;",
        "getSourceDataLoadedEvents",
        "sourceDataLoadedEvents",
        "Lcom/mapbox/maps/StyleImageMissing;",
        "getStyleImageMissingEvents",
        "styleImageMissingEvents",
        "Lcom/mapbox/maps/StyleImageRemoveUnused;",
        "getStyleImageRemoveUnusedEvents",
        "styleImageRemoveUnusedEvents",
        "Lcom/mapbox/maps/RenderFrameStarted;",
        "getRenderFrameStartedEvents",
        "renderFrameStartedEvents",
        "Lcom/mapbox/maps/RenderFrameFinished;",
        "getRenderFrameFinishedEvents",
        "renderFrameFinishedEvents",
        "Lcom/mapbox/maps/ResourceRequest;",
        "getResourceRequestEvents",
        "resourceRequestEvents",
        "maps-sdk_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final awaitLoadStyle(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1

    .line 5
    new-instance v0, Lq83/l;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    invoke-direct {v0, p2}, Lq83/l;-><init>(Lq83/d;)V

    .line 6
    new-instance p2, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$4$1;

    invoke-direct {p2, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$4$1;-><init>(Lq83/d;)V

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/MapboxMap;->loadStyle(Ljava/lang/String;Lcom/mapbox/maps/Style$OnStyleLoaded;)V

    .line 8
    invoke-virtual {v0}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final awaitLoadStyle(Lcom/mapbox/maps/MapboxMap;Luu/a;Lq83/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lq83/l;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    invoke-direct {v0, p2}, Lq83/l;-><init>(Lq83/d;)V

    .line 2
    new-instance p2, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$2$1;

    invoke-direct {p2, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$2$1;-><init>(Lq83/d;)V

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/MapboxMap;->loadStyle(Luu/a;Lcom/mapbox/maps/Style$OnStyleLoaded;)V

    .line 4
    invoke-virtual {v0}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final awaitStyle(Lcom/mapbox/maps/MapboxMap;Lq83/d;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lq83/l;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-direct {v0, p1}, Lq83/l;-><init>(Lq83/d;)V

    new-instance p1, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitStyle$2$1;

    invoke-direct {p1, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitStyle$2$1;-><init>(Lq83/d;)V

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/MapboxMap;->getStyle(Lcom/mapbox/maps/Style$OnStyleLoaded;)V

    invoke-virtual {v0}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final cameraForCoordinates(Lcom/mapbox/maps/MapboxMap;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation runtime Ll83/c;
    .end annotation

    new-instance v0, Lq83/l;

    invoke-static {p6}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p6

    invoke-direct {v0, p6}, Lq83/l;-><init>(Lq83/d;)V

    new-instance v7, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$cameraForCoordinates$2$1;

    invoke-direct {v7, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$cameraForCoordinates$2$1;-><init>(Ljava/lang/Object;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v7}, Lcom/mapbox/maps/MapboxMap;->cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static synthetic cameraForCoordinates$default(Lcom/mapbox/maps/MapboxMap;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_2

    move-object p5, v0

    :cond_2
    invoke-static/range {p0 .. p6}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt;->cameraForCoordinates(Lcom/mapbox/maps/MapboxMap;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final genericEvents(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation build Lcom/mapbox/maps/MapboxExperimental;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$genericEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$genericEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {p1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p1

    invoke-static {p0, p1}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 p1, -0x1

    const/4 v0, 0x2

    invoke-static {p0, p1, v0}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getCameraChangedCoalescedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$cameraChangedCoalescedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$cameraChangedCoalescedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCameraChangedCoalescedEvents$annotations(Lcom/mapbox/maps/MapboxMap;)V
    .locals 0

    return-void
.end method

.method public static final getCameraChangedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$cameraChangedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$cameraChangedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getFeatureState(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p4}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p4

    const/4 v1, 0x1

    invoke-direct {v0, v1, p4}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p4, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getFeatureState$2$1;

    invoke-direct {p4, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getFeatureState$2$1;-><init>(Lq83/d;)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/MapboxMap;->getFeatureState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static synthetic getFeatureState$default(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt;->getFeatureState(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final getGeoJsonClusterChildren(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    const/4 v1, 0x1

    invoke-direct {v0, v1, p3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p3, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getGeoJsonClusterChildren$2$1;

    invoke-direct {p3, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getGeoJsonClusterChildren$2$1;-><init>(Lq83/d;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxMap;->getGeoJsonClusterChildren(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final getGeoJsonClusterExpansionZoom(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    const/4 v1, 0x1

    invoke-direct {v0, v1, p3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p3, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getGeoJsonClusterExpansionZoom$2$1;

    invoke-direct {p3, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getGeoJsonClusterExpansionZoom$2$1;-><init>(Lq83/d;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxMap;->getGeoJsonClusterExpansionZoom(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final getGeoJsonClusterLeaves(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/geojson/Feature;JJLq83/d;)Ljava/lang/Object;
    .locals 11

    new-instance v0, Lbc3/m;

    invoke-static/range {p7 .. p7}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance v10, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getGeoJsonClusterLeaves$2$1;

    invoke-direct {v10, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$getGeoJsonClusterLeaves$2$1;-><init>(Lq83/d;)V

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-wide v6, p3

    move-wide/from16 v8, p5

    invoke-virtual/range {v3 .. v10}, Lcom/mapbox/maps/MapboxMap;->getGeoJsonClusterLeaves(Ljava/lang/String;Lcom/mapbox/geojson/Feature;JJLcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final getMapIdleEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$mapIdleEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$mapIdleEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getMapLoadedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$mapLoadedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$mapLoadedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getMapLoadingErrorEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$mapLoadingErrorEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$mapLoadingErrorEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getRenderFrameFinishedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$renderFrameFinishedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$renderFrameFinishedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getRenderFrameStartedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$renderFrameStartedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$renderFrameStartedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getResourceRequestEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$resourceRequestEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$resourceRequestEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getSourceAddedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$sourceAddedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$sourceAddedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getSourceDataLoadedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$sourceDataLoadedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$sourceDataLoadedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getSourceRemovedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$sourceRemovedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$sourceRemovedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getStyleDataLoadedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleDataLoadedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleDataLoadedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getStyleImageMissingEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageMissingEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageMissingEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getStyleImageRemoveUnusedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageRemoveUnusedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageRemoveUnusedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final getStyleLoadedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    invoke-static {p0, v0}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final removeFeatureState(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 8

    new-instance v0, Lbc3/m;

    invoke-static {p5}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p5

    const/4 v1, 0x1

    invoke-direct {v0, v1, p5}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance v7, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$removeFeatureState$2$1;

    invoke-direct {v7, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$removeFeatureState$2$1;-><init>(Lq83/d;)V

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lcom/mapbox/maps/MapboxMap;->removeFeatureState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static synthetic removeFeatureState$default(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_1

    move-object p4, v0

    :cond_1
    invoke-static/range {p0 .. p5}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt;->removeFeatureState(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final resetFeatureStates(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    const/4 v1, 0x1

    invoke-direct {v0, v1, p3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance p3, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$resetFeatureStates$2$1;

    invoke-direct {p3, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$resetFeatureStates$2$1;-><init>(Lq83/d;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxMap;->resetFeatureStates(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static synthetic resetFeatureStates$default(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt;->resetFeatureStates(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final setFeatureState(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lq83/d;)Ljava/lang/Object;
    .locals 8

    new-instance v0, Lbc3/m;

    invoke-static {p5}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p5

    const/4 v1, 0x1

    invoke-direct {v0, v1, p5}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance v7, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$setFeatureState$2$1;

    invoke-direct {v7, v0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$setFeatureState$2$1;-><init>(Lq83/d;)V

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lcom/mapbox/maps/MapboxMap;->setFeatureState(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object p0

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static synthetic setFeatureState$default(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt;->setFeatureState(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
