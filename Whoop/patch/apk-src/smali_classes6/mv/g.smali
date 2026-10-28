.class public interface abstract Lmv/g;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getMetersPerPixelAtLatitude(DD)D
.end method

.method public abstract project(Lcom/mapbox/geojson/Point;D)Lcom/mapbox/maps/MercatorCoordinate;
.end method

.method public abstract unproject(Lcom/mapbox/maps/MercatorCoordinate;D)Lcom/mapbox/geojson/Point;
.end method
