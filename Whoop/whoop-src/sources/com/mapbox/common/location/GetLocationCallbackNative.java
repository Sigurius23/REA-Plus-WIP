package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class GetLocationCallbackNative implements GetLocationCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class GetLocationCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetLocationCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetLocationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetLocationCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new GetLocationCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.location.GetLocationCallback
    public native void run(Location location);
}
