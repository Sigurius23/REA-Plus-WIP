package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class TileRegionsCallbackNative implements TileRegionsCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileRegionsCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionsCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionsCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionsCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileRegionsCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TileRegionsCallback
    public native void run(Expected<TileRegionError, List<TileRegion>> expected);
}
