.class public final Lcom/mapbox/maps/coroutine/MapCameraManagerDelegateExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aQ\u0010\u000c\u001a\u00020\u0004*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "Lmv/a;",
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
        "offset",
        "awaitCameraForCoordinates",
        "(Lmv/a;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;)Ljava/lang/Object;",
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
.method public static final awaitCameraForCoordinates(Lmv/a;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;)Ljava/lang/Object;
    .locals 8

    new-instance v0, Lq83/l;

    invoke-static {p6}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p6

    invoke-direct {v0, p6}, Lq83/l;-><init>(Lq83/d;)V

    new-instance v7, Lcom/mapbox/maps/coroutine/MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1;

    invoke-direct {v7, v0}, Lcom/mapbox/maps/coroutine/MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1;-><init>(Ljava/lang/Object;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v7}, Lmv/a;->cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static synthetic awaitCameraForCoordinates$default(Lmv/a;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
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
    invoke-static/range {p0 .. p6}, Lcom/mapbox/maps/coroutine/MapCameraManagerDelegateExtKt;->awaitCameraForCoordinates(Lmv/a;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
