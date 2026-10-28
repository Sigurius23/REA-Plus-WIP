package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class MapLoadingErrorCallbackNative implements MapLoadingErrorCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MapLoadingErrorCallbackPeerCleaner implements Runnable {
        private long peer;

        public MapLoadingErrorCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapLoadingErrorCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MapLoadingErrorCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MapLoadingErrorCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.MapLoadingErrorCallback
    public native void run(MapLoadingError mapLoadingError);
}
