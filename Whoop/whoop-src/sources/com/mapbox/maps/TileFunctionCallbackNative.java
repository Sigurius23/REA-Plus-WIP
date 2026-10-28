package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class TileFunctionCallbackNative implements TileFunctionCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileFunctionCallbackPeerCleaner implements Runnable {
        private long peer;

        public TileFunctionCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileFunctionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TileFunctionCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TileFunctionCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.TileFunctionCallback
    public native void run(CanonicalTileID canonicalTileID);
}
