package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class OfflineRegionCallbackNative implements OfflineRegionCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OfflineRegionCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineRegionCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new OfflineRegionCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.OfflineRegionCallback
    public native void run(Expected<String, List<OfflineRegion>> expected);
}
