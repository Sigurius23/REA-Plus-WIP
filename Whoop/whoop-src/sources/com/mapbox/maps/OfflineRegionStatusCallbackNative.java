package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class OfflineRegionStatusCallbackNative implements OfflineRegionStatusCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OfflineRegionStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionStatusCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineRegionStatusCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new OfflineRegionStatusCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.OfflineRegionStatusCallback
    public native void run(Expected<String, OfflineRegionStatus> expected);
}
