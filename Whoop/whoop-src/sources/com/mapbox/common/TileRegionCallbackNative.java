package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class TileRegionCallbackNative implements TileRegionCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileRegionCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileRegionCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TileRegionCallback
    public native void run(Expected<TileRegionError, TileRegion> expected);
}
