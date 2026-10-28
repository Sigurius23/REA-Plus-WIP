package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class MapClientNative implements MapClient {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MapClientPeerCleaner implements Runnable {
        private long peer;

        public MapClientPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapClientNative.cleanNativePeer(this.peer);
        }
    }

    public MapClientNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MapClientPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.MapClient
    public native void scheduleRepaint();
}
