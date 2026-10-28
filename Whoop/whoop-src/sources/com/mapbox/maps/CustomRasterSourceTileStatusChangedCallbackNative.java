package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class CustomRasterSourceTileStatusChangedCallbackNative implements CustomRasterSourceTileStatusChangedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class CustomRasterSourceTileStatusChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        public CustomRasterSourceTileStatusChangedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomRasterSourceTileStatusChangedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CustomRasterSourceTileStatusChangedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new CustomRasterSourceTileStatusChangedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.CustomRasterSourceTileStatusChangedCallback
    public native void run(CanonicalTileID canonicalTileID, CustomRasterSourceTileStatus customRasterSourceTileStatus);
}
