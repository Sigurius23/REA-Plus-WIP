package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class OfflineRegionCreateCallbackNative implements OfflineRegionCreateCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OfflineRegionCreateCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionCreateCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionCreateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineRegionCreateCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new OfflineRegionCreateCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.OfflineRegionCreateCallback
    public native void run(Expected<String, OfflineRegion> expected);
}
