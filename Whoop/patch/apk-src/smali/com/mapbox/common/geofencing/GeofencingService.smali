.class public interface abstract Lcom/mapbox/common/geofencing/GeofencingService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\'\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u000eH\'\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0013H\'\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0016H\'\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0019H\'\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001eH\'\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020!H\'\u00a2\u0006\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/mapbox/common/geofencing/GeofencingService;",
        "",
        "Lcom/mapbox/common/geofencing/GeofencingOptions;",
        "options",
        "Lcom/mapbox/common/geofencing/ConfigureCallback;",
        "callback",
        "Ll83/a0;",
        "configure",
        "(Lcom/mapbox/common/geofencing/GeofencingOptions;Lcom/mapbox/common/geofencing/ConfigureCallback;)V",
        "Lcom/mapbox/common/geofencing/GetOptionsCallback;",
        "getOptions",
        "(Lcom/mapbox/common/geofencing/GetOptionsCallback;)V",
        "Lcom/mapbox/geojson/Feature;",
        "feature",
        "Lcom/mapbox/common/geofencing/AddFeatureCallback;",
        "addFeature",
        "(Lcom/mapbox/geojson/Feature;Lcom/mapbox/common/geofencing/AddFeatureCallback;)V",
        "",
        "identifier",
        "Lcom/mapbox/common/geofencing/GetFeatureCallback;",
        "getFeature",
        "(Ljava/lang/String;Lcom/mapbox/common/geofencing/GetFeatureCallback;)V",
        "Lcom/mapbox/common/geofencing/RemoveFeatureCallback;",
        "removeFeature",
        "(Ljava/lang/String;Lcom/mapbox/common/geofencing/RemoveFeatureCallback;)V",
        "Lcom/mapbox/common/geofencing/ClearFeaturesCallback;",
        "clearFeatures",
        "(Lcom/mapbox/common/geofencing/ClearFeaturesCallback;)V",
        "Lcom/mapbox/common/geofencing/GeofencingObserver;",
        "observer",
        "Lcom/mapbox/common/geofencing/AddObserverCallback;",
        "addObserver",
        "(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/AddObserverCallback;)V",
        "Lcom/mapbox/common/geofencing/RemoveObserverCallback;",
        "removeObserver",
        "(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/RemoveObserverCallback;)V",
        "common_release"
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
.method public abstract addFeature(Lcom/mapbox/geojson/Feature;Lcom/mapbox/common/geofencing/AddFeatureCallback;)V
.end method

.method public abstract addObserver(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/AddObserverCallback;)V
.end method

.method public abstract clearFeatures(Lcom/mapbox/common/geofencing/ClearFeaturesCallback;)V
.end method

.method public abstract configure(Lcom/mapbox/common/geofencing/GeofencingOptions;Lcom/mapbox/common/geofencing/ConfigureCallback;)V
.end method

.method public abstract getFeature(Ljava/lang/String;Lcom/mapbox/common/geofencing/GetFeatureCallback;)V
.end method

.method public abstract getOptions(Lcom/mapbox/common/geofencing/GetOptionsCallback;)V
.end method

.method public abstract removeFeature(Ljava/lang/String;Lcom/mapbox/common/geofencing/RemoveFeatureCallback;)V
.end method

.method public abstract removeObserver(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/RemoveObserverCallback;)V
.end method
