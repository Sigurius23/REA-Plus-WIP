package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class MapIdleCallbackNative implements MapIdleCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MapIdleCallbackPeerCleaner implements Runnable {
        private long peer;

        public MapIdleCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapIdleCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MapIdleCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MapIdleCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.MapIdleCallback
    public native void run(MapIdle mapIdle);
}
