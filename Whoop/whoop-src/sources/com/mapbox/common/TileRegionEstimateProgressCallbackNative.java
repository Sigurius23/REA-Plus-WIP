package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class TileRegionEstimateProgressCallbackNative implements TileRegionEstimateProgressCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileRegionEstimateProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionEstimateProgressCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionEstimateProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionEstimateProgressCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileRegionEstimateProgressCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TileRegionEstimateProgressCallback
    public native void run(TileRegionEstimateProgress tileRegionEstimateProgress);
}
