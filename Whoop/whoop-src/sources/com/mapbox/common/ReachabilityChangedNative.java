package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class ReachabilityChangedNative implements ReachabilityChanged {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ReachabilityChangedPeerCleaner implements Runnable {
        private long peer;

        public ReachabilityChangedPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityChangedNative.cleanNativePeer(this.peer);
        }
    }

    private ReachabilityChangedNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ReachabilityChangedPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.ReachabilityChanged
    public native void run(NetworkStatus networkStatus);
}
