package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class LocationServiceObserverNative implements LocationServiceObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LocationServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public LocationServiceObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public LocationServiceObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new LocationServiceObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onAccuracyAuthorizationChanged(AccuracyAuthorization accuracyAuthorization);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onAvailabilityChanged(boolean z4);

    @Override // com.mapbox.common.location.LocationServiceObserver
    public native void onPermissionStatusChanged(PermissionStatus permissionStatus);
}
