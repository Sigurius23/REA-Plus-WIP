package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class LocationObserverNative implements LocationObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LocationObserverPeerCleaner implements Runnable {
        private long peer;

        public LocationObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationObserverNative.cleanNativePeer(this.peer);
        }
    }

    public LocationObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new LocationObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.location.LocationObserver
    public native void onLocationUpdateReceived(List<Location> list);
}
