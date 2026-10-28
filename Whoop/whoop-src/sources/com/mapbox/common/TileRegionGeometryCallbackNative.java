package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes.dex */
final class TileRegionGeometryCallbackNative implements TileRegionGeometryCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileRegionGeometryCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileRegionGeometryCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileRegionGeometryCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileRegionGeometryCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileRegionGeometryCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TileRegionGeometryCallback
    public native void run(Expected<TileRegionError, Geometry> expected);
}
