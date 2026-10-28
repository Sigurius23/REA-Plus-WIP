package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class OfflineRegionObserverNative implements OfflineRegionObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OfflineRegionObserverPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionObserverNative.cleanNativePeer(this.peer);
        }
    }

    public OfflineRegionObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new OfflineRegionObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.OfflineRegionObserver
    public native void errorOccurred(OfflineRegionError offlineRegionError);

    @Override // com.mapbox.maps.OfflineRegionObserver
    public native void statusChanged(OfflineRegionStatus offlineRegionStatus);
}
