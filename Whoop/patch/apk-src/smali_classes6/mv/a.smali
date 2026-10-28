.class public interface abstract Lmv/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract cameraForCoordinates(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lkotlin/jvm/functions/Function1;)V
.end method

.method public abstract cameraForDrag(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;
.end method

.method public abstract coordinateForPixel(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;
.end method

.method public abstract getBounds()Lcom/mapbox/maps/CameraBounds;
.end method

.method public abstract getCameraState()Lcom/mapbox/maps/CameraState;
.end method

.method public abstract getCenterAltitudeMode()Lcom/mapbox/maps/MapCenterAltitudeMode;
.end method

.method public abstract pixelForCoordinate(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;
.end method

.method public abstract setCamera(Lcom/mapbox/maps/CameraOptions;)V
.end method

.method public abstract setCenterAltitudeMode(Lcom/mapbox/maps/MapCenterAltitudeMode;)V
.end method
