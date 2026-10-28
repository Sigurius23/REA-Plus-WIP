package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class CustomLayerMapProjectionNative implements CustomLayerMapProjection {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class CustomLayerMapProjectionPeerCleaner implements Runnable {
        private long peer;

        public CustomLayerMapProjectionPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomLayerMapProjectionNative.cleanNativePeer(this.peer);
        }
    }

    public CustomLayerMapProjectionNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new CustomLayerMapProjectionPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> convertMercatorModelMatrix(List<Double> list, boolean z4);

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> getModelMatrix();

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> getTransitionMatrix();

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native float getTransitionPhase();
}
