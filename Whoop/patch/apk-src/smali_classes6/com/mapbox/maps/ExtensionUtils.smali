.class public final Lcom/mapbox/maps/ExtensionUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "toCameraOptions",
        "Lcom/mapbox/maps/CameraOptions;",
        "Lcom/mapbox/maps/CameraState;",
        "anchor",
        "Lcom/mapbox/maps/ScreenCoordinate;",
        "toMapboxImage",
        "Lcom/mapbox/maps/Image;",
        "Landroid/graphics/Bitmap;",
        "sdk-base_release"
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
.method public static final toCameraOptions(Lcom/mapbox/maps/CameraState;)Lcom/mapbox/maps/CameraOptions;
    .locals 2

    .line 1
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/mapbox/maps/ExtensionUtils;->toCameraOptions$default(Lcom/mapbox/maps/CameraState;Lcom/mapbox/maps/ScreenCoordinate;ILjava/lang/Object;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p0

    return-object p0
.end method

.method public static final toCameraOptions(Lcom/mapbox/maps/CameraState;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {v0}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/mapbox/maps/CameraOptions$Builder;->anchor(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p1

    .line 4
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraState;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/CameraOptions$Builder;->padding(Lcom/mapbox/maps/EdgeInsets;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/CameraOptions$Builder;->zoom(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p1

    .line 6
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraState;->getPitch()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/CameraOptions$Builder;->pitch(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p1

    .line 7
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/mapbox/maps/CameraOptions$Builder;->bearing(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object p0

    .line 9
    const-string p1, "{\n    CameraOptions.Buil\u2026aring)\n      .build()\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 10
    :cond_0
    new-instance p1, Lcom/mapbox/maps/CameraOptions$Builder;

    invoke-direct {p1}, Lcom/mapbox/maps/CameraOptions$Builder;-><init>()V

    .line 11
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraState;->getCenter()Lcom/mapbox/geojson/Point;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/CameraOptions$Builder;->center(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p1

    .line 12
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraState;->getPadding()Lcom/mapbox/maps/EdgeInsets;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/CameraOptions$Builder;->padding(Lcom/mapbox/maps/EdgeInsets;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p1

    .line 13
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraState;->getZoom()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/CameraOptions$Builder;->zoom(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p1

    .line 14
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraState;->getPitch()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/CameraOptions$Builder;->pitch(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p1

    .line 15
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraState;->getBearing()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/mapbox/maps/CameraOptions$Builder;->bearing(Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions$Builder;

    move-result-object p0

    .line 16
    invoke-virtual {p0}, Lcom/mapbox/maps/CameraOptions$Builder;->build()Lcom/mapbox/maps/CameraOptions;

    move-result-object p0

    .line 17
    const-string p1, "toCameraOptions"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic toCameraOptions$default(Lcom/mapbox/maps/CameraState;Lcom/mapbox/maps/ScreenCoordinate;ILjava/lang/Object;)Lcom/mapbox/maps/CameraOptions;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/mapbox/maps/ExtensionUtils;->toCameraOptions(Lcom/mapbox/maps/CameraState;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;

    move-result-object p0

    return-object p0
.end method

.method public static final toMapboxImage(Landroid/graphics/Bitmap;)Lcom/mapbox/maps/Image;
    .locals 3
    .annotation build Lcom/mapbox/maps/MapboxDelicateApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v0

    invoke-static {v0}, Lcom/mapbox/bindgen/DataRef;->allocateNative(I)Lcom/mapbox/bindgen/DataRef;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/DataRef;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    new-instance v1, Lcom/mapbox/maps/Image;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p0

    invoke-direct {v1, v2, p0, v0}, Lcom/mapbox/maps/Image;-><init>(IILcom/mapbox/bindgen/DataRef;)V

    return-object v1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only ARGB_8888 bitmap config is supported!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
