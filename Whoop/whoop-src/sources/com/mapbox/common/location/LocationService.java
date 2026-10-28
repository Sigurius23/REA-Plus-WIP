package com.mapbox.common.location;

import com.mapbox.bindgen.Expected;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u001fJ/\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010!\u001a\u00020 2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0016\u0010\"¨\u0006#"}, m65681d2 = {"Lcom/mapbox/common/location/LocationService;", "", "", "isAvailable", "()Z", "Lcom/mapbox/common/location/PermissionStatus;", "getPermissionStatus", "()Lcom/mapbox/common/location/PermissionStatus;", "Lcom/mapbox/common/location/AccuracyAuthorization;", "getAccuracyAuthorization", "()Lcom/mapbox/common/location/AccuracyAuthorization;", "Lcom/mapbox/common/location/LocationServiceObserver;", "observer", "Ll83/a0;", "registerObserver", "(Lcom/mapbox/common/location/LocationServiceObserver;)V", "unregisterObserver", "Lcom/mapbox/common/location/LocationProviderRequest;", "request", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/LocationError;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "getDeviceLocationProvider", "(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/DeviceLocationProviderFactory;", "factory", "setUserDefinedDeviceLocationProviderFactory", "(Lcom/mapbox/common/location/DeviceLocationProviderFactory;)V", "Lcom/mapbox/common/location/DeviceLocationProviderType;", "type", "allowUserDefined", "(Lcom/mapbox/common/location/DeviceLocationProviderType;Lcom/mapbox/common/location/LocationProviderRequest;Z)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/location/ExtendedLocationProviderParameters;", "extendedParameters", "(Lcom/mapbox/common/location/ExtendedLocationProviderParameters;Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface LocationService {

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Expected getDeviceLocationProvider$default(LocationService locationService, LocationProviderRequest locationProviderRequest, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDeviceLocationProvider");
            }
            if ((i13 & 1) != 0) {
                locationProviderRequest = null;
            }
            return locationService.getDeviceLocationProvider(locationProviderRequest);
        }

        public static /* synthetic */ Expected getDeviceLocationProvider$default(LocationService locationService, DeviceLocationProviderType deviceLocationProviderType, LocationProviderRequest locationProviderRequest, boolean z4, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDeviceLocationProvider");
            }
            if ((i13 & 2) != 0) {
                locationProviderRequest = null;
            }
            if ((i13 & 4) != 0) {
                z4 = true;
            }
            return locationService.getDeviceLocationProvider(deviceLocationProviderType, locationProviderRequest, z4);
        }

        public static /* synthetic */ Expected getDeviceLocationProvider$default(LocationService locationService, ExtendedLocationProviderParameters extendedLocationProviderParameters, LocationProviderRequest locationProviderRequest, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDeviceLocationProvider");
            }
            if ((i13 & 2) != 0) {
                locationProviderRequest = null;
            }
            return locationService.getDeviceLocationProvider(extendedLocationProviderParameters, locationProviderRequest);
        }
    }

    AccuracyAuthorization getAccuracyAuthorization();

    Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(DeviceLocationProviderType type, LocationProviderRequest request, boolean allowUserDefined);

    Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(ExtendedLocationProviderParameters extendedParameters, LocationProviderRequest request);

    Expected<LocationError, DeviceLocationProvider> getDeviceLocationProvider(LocationProviderRequest request);

    PermissionStatus getPermissionStatus();

    boolean isAvailable();

    void registerObserver(LocationServiceObserver observer);

    void setUserDefinedDeviceLocationProviderFactory(DeviceLocationProviderFactory factory);

    void unregisterObserver(LocationServiceObserver observer);
}
