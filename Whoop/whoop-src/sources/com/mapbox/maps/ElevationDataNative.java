package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes.dex */
final class ElevationDataNative implements ElevationData {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ElevationDataPeerCleaner implements Runnable {
        private long peer;

        public ElevationDataPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ElevationDataNative.cleanNativePeer(this.peer);
        }
    }

    public ElevationDataNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ElevationDataPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.ElevationData
    public native Double getElevation(Point point);

    @Override // com.mapbox.maps.ElevationData
    public native double getTerrainExaggeration();
}
