package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class TileRegionEstimateResultCallbackNative implements TileRegionEstimateResultCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileRegionEstimateResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionEstimateResultCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionEstimateResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionEstimateResultCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileRegionEstimateResultCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TileRegionEstimateResultCallback
    public native void run(Expected<TileRegionError, TileRegionEstimateResult> expected);
}
