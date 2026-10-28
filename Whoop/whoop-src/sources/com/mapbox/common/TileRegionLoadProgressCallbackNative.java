package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class TileRegionLoadProgressCallbackNative implements TileRegionLoadProgressCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileRegionLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionLoadProgressCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionLoadProgressCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileRegionLoadProgressCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TileRegionLoadProgressCallback
    public native void run(TileRegionLoadProgress tileRegionLoadProgress);
}
