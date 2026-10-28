package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class CameraChangedCoalescedCallbackNative implements CameraChangedCoalescedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class CameraChangedCoalescedCallbackPeerCleaner implements Runnable {
        private long peer;

        public CameraChangedCoalescedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraChangedCoalescedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CameraChangedCoalescedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new CameraChangedCoalescedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public native void run(CameraChangedCoalesced cameraChangedCoalesced);
}
