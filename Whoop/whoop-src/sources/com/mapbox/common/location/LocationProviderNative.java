package com.mapbox.common.location;

import android.os.Looper;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.Cancelable;

/* JADX INFO: loaded from: classes.dex */
final class LocationProviderNative implements LocationProvider {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LocationProviderPeerCleaner implements Runnable {
        private long peer;

        public LocationProviderPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationProviderNative.cleanNativePeer(this.peer);
        }
    }

    public LocationProviderNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new LocationProviderPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.location.LocationProvider
    public native void addLocationObserver(LocationObserver locationObserver);

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver locationObserver, Looper looper) {
    }

    @Override // com.mapbox.common.location.LocationProvider
    public Cancelable getLastLocation(GetLocationCallback getLocationCallback) {
        return null;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public native void removeLocationObserver(LocationObserver locationObserver);
}
