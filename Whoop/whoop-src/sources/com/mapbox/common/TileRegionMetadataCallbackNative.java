package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes.dex */
final class TileRegionMetadataCallbackNative implements TileRegionMetadataCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileRegionMetadataCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionMetadataCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionMetadataCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionMetadataCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileRegionMetadataCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TileRegionMetadataCallback
    public native void run(Expected<TileRegionError, Value> expected);
}
