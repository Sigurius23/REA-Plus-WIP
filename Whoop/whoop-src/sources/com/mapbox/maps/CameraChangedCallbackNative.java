package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class CameraChangedCallbackNative implements CameraChangedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class CameraChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        public CameraChangedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraChangedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CameraChangedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new CameraChangedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.CameraChangedCallback
    public native void run(CameraChanged cameraChanged);
}
