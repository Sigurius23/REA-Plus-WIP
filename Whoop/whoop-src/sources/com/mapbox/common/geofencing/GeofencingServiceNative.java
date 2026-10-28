package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Feature;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0097 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0097 ¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0012H\u0097 ¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0017H\u0097 ¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u001aH\u0097 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u001dH\u0097 ¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\"H\u0097 ¢\u0006\u0004\b#\u0010$J \u0010&\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020%H\u0097 ¢\u0006\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingServiceNative;", "Lcom/mapbox/common/geofencing/GeofencingService;", "", "nativePeer", "<init>", "(J)V", "Lcom/mapbox/common/geofencing/GeofencingOptions;", "options", "Lcom/mapbox/common/geofencing/ConfigureCallback;", "callback", "Ll83/a0;", "configure", "(Lcom/mapbox/common/geofencing/GeofencingOptions;Lcom/mapbox/common/geofencing/ConfigureCallback;)V", "Lcom/mapbox/common/geofencing/GetOptionsCallback;", "getOptions", "(Lcom/mapbox/common/geofencing/GetOptionsCallback;)V", "Lcom/mapbox/geojson/Feature;", "feature", "Lcom/mapbox/common/geofencing/AddFeatureCallback;", "addFeature", "(Lcom/mapbox/geojson/Feature;Lcom/mapbox/common/geofencing/AddFeatureCallback;)V", "", "identifier", "Lcom/mapbox/common/geofencing/GetFeatureCallback;", "getFeature", "(Ljava/lang/String;Lcom/mapbox/common/geofencing/GetFeatureCallback;)V", "Lcom/mapbox/common/geofencing/RemoveFeatureCallback;", "removeFeature", "(Ljava/lang/String;Lcom/mapbox/common/geofencing/RemoveFeatureCallback;)V", "Lcom/mapbox/common/geofencing/ClearFeaturesCallback;", "clearFeatures", "(Lcom/mapbox/common/geofencing/ClearFeaturesCallback;)V", "Lcom/mapbox/common/geofencing/GeofencingObserver;", "observer", "Lcom/mapbox/common/geofencing/AddObserverCallback;", "addObserver", "(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/AddObserverCallback;)V", "Lcom/mapbox/common/geofencing/RemoveObserverCallback;", "removeObserver", "(Lcom/mapbox/common/geofencing/GeofencingObserver;Lcom/mapbox/common/geofencing/RemoveObserverCallback;)V", "peer", "J", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class GeofencingServiceNative implements GeofencingService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingServiceNative$Companion;", "", "<init>", "()V", "", "peer", "Ll83/a0;", "cleanNativePeer", "(J)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long peer) {
            GeofencingServiceNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    private GeofencingServiceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new RunnableC5421a(j7, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(long j7) {
        INSTANCE.cleanNativePeer(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void addFeature(Feature feature, AddFeatureCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void addObserver(GeofencingObserver observer, AddObserverCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void clearFeatures(ClearFeaturesCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void configure(GeofencingOptions options, ConfigureCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void getFeature(String identifier, GetFeatureCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void getOptions(GetOptionsCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void removeFeature(String identifier, RemoveFeatureCallback callback);

    @Override // com.mapbox.common.geofencing.GeofencingService
    public native void removeObserver(GeofencingObserver observer, RemoveObserverCallback callback);
}
