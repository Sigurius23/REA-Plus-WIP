package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b\u0014\u0010\u0013J&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0097 ¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096 ¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010!\u001a\u00020 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010#J-\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010%\u001a\u00020$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010&R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0005¨\u0006-"}, m65681d2 = {"Lcom/mapbox/common/location/LocationServiceNative;", "Lcom/mapbox/common/location/LocationService;", "", "peer", "<init>", "(J)V", "", "isAvailable", "()Z", "Lcom/mapbox/common/location/PermissionStatus;", "getPermissionStatus", "()Lcom/mapbox/common/location/PermissionStatus;", "Lcom/mapbox/common/location/AccuracyAuthorization;", "getAccuracyAuthorization", "()Lcom/mapbox/common/location/AccuracyAuthorization;", "Lcom/mapbox/common/location/LocationServiceObserver;", "observer", "Ll83/a0;", "registerObserver", "(Lcom/mapbox/common/location/LocationServiceObserver;)V", "unregisterObserver", "Lcom/mapbox/common/location/LocationProviderRequest;", "request", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationError;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "getDeviceLocationProvider", "(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/DeviceLocationProviderFactory;", "factory", "setUserDefinedDeviceLocationProviderFactory", "(Lcom/mapbox/common/location/DeviceLocationProviderFactory;)V", "Lcom/mapbox/common/location/DeviceLocationProviderType;", "type", "allowUserDefined", "(Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;Z)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/ExtendedLocationProviderParameters;", "extendedParameters", "(Lcom/mapbox/common/location/ExtendedLocationProviderParameters;Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;", "J", "getPeer", "()J", "setPeer", "Companion", "LocationServicePeerCleaner", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class LocationServiceNative implements LocationService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/common/location/LocationServiceNative$Companion;", "", "<init>", "()V", "", "peer", "Ll83/a0;", "cleanNativePeer", "(J)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void cleanNativePeer(long peer) {
            LocationServiceNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/mapbox/common/location/LocationServiceNative$LocationServicePeerCleaner;", "Ljava/lang/Runnable;", "", "peer", "<init>", "(J)V", "Ll83/a0;", "run", "()V", "J", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class LocationServicePeerCleaner implements Runnable {
        private final long peer;

        public LocationServicePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceNative.INSTANCE.cleanNativePeer(this.peer);
        }
    }

    public LocationServiceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new LocationServicePeerCleaner(j7));
    }

    public static final native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.location.LocationService
    public native AccuracyAuthorization getAccuracyAuthorization();

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(DeviceLocationProviderType type, LocationProviderRequest request, boolean allowUserDefined) {
        AbstractC22676k.m65750j(type, "type");
        throw new RuntimeException("There should be no native LocationService");
    }

    @Override // com.mapbox.common.location.LocationService
    public native Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(LocationProviderRequest request);

    public final long getPeer() {
        return this.peer;
    }

    @Override // com.mapbox.common.location.LocationService
    public native PermissionStatus getPermissionStatus();

    @Override // com.mapbox.common.location.LocationService
    public native boolean isAvailable();

    @Override // com.mapbox.common.location.LocationService
    public native void registerObserver(LocationServiceObserver observer);

    public final void setPeer(long j7) {
        this.peer = j7;
    }

    @Override // com.mapbox.common.location.LocationService
    public native void setUserDefinedDeviceLocationProviderFactory(DeviceLocationProviderFactory factory);

    @Override // com.mapbox.common.location.LocationService
    public native void unregisterObserver(LocationServiceObserver observer);

    @Override // com.mapbox.common.location.LocationService
    public Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(ExtendedLocationProviderParameters extendedParameters, LocationProviderRequest request) {
        AbstractC22676k.m65750j(extendedParameters, "extendedParameters");
        throw new RuntimeException("There should be no native LocationService");
    }
}
