package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class MapLoadedCallbackNative implements MapLoadedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MapLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public MapLoadedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MapLoadedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MapLoadedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.MapLoadedCallback
    public native void run(MapLoaded mapLoaded);
}
