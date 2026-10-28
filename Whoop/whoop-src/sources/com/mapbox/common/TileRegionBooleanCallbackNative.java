package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class TileRegionBooleanCallbackNative implements TileRegionBooleanCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileRegionBooleanCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionBooleanCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionBooleanCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionBooleanCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileRegionBooleanCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TileRegionBooleanCallback
    public native void run(Expected<TileRegionError, Boolean> expected);
}
