package com.mapbox.common.geofencing;

import com.mapbox.geojson.Feature;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001eH'¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020!H'¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingService;", "", "Lcom/mapbox/common/geofencing/GeofencingOptions;", "options", "Lcom/mapbox/common/geofencing/ConfigureCallback;", "callback", "Ll83/a0;", "configure", "(Lcom/mapbox/common/geofencing/GeofencingOptions;Lcom/mapbox/common/geofencing/ConfigureCallback;)V", "Lcom/mapbox/common/geofencing/GetOptionsCallback;", "getOptions", "(Lcom/mapbox/common/geofencing/GetOptionsCallback;)V", "Lcom/mapbox/geojson/Feature;", "feature", "Lcom/mapbox/common/geofencing/AddFeatureCallback;", "addFeature", "(Lcom/mapbox/geojson/Feature;Lcom/mapbox/common/geofencing/AddFeatureCallback;)V", "", "identifier", "Lcom/mapbox/common/geofencing/GetFeatureCallback;", "getFeature", "(Ljava/lang/String;Lcom/mapbox/common/geofencing/GetFeatureCallback;)V", "Lcom/mapbox/common/geofencing/RemoveFeatureCallback;", "removeFeature", "(Ljava/lang/String;Lcom/mapbox/common/geofencing/RemoveFeatureCallback;)V", "Lcom/mapbox/common/geofencing/ClearFeaturesCallback;", "clearFeatures", "(Lcom/mapbox/common/geofencing/ClearFeaturesCallback;)V", "Lcom/mapbox/common/geofencing/GeofencingObserver;", "observer", "Lcom/mapbox/common/geofencing/AddObserverCallback;", "addObserver", "(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/AddObserverCallback;)V", "Lcom/mapbox/common/geofencing/RemoveObserverCallback;", "removeObserver", "(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/RemoveObserverCallback;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface GeofencingService {
    void addFeature(Feature feature, AddFeatureCallback callback);

    void addObserver(GeofencingObserver observer, AddObserverCallback callback);

    void clearFeatures(ClearFeaturesCallback callback);

    void configure(GeofencingOptions options, ConfigureCallback callback);

    void getFeature(String identifier, GetFeatureCallback callback);

    void getOptions(GetOptionsCallback callback);

    void removeFeature(String identifier, RemoveFeatureCallback callback);

    void removeObserver(GeofencingObserver observer, RemoveObserverCallback callback);
}
