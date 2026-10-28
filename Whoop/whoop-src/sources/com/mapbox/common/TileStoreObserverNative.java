package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes.dex */
final class TileStoreObserverNative implements TileStoreObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileStoreObserverPeerCleaner implements Runnable {
        private long peer;

        public TileStoreObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileStoreObserverNative.cleanNativePeer(this.peer);
        }
    }

    public TileStoreObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileStoreObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionGeometryChanged(String str, Geometry geometry);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionLoadFinished(String str, Expected<TileRegionError, TileRegion> expected);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionLoadProgress(String str, TileRegionLoadProgress tileRegionLoadProgress);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionMetadataChanged(String str, Value value);

    @Override // com.mapbox.common.TileStoreObserver
    public native void onRegionRemoved(String str);
}
