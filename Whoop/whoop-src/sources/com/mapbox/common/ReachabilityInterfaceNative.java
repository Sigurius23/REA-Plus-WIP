package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class ReachabilityInterfaceNative implements ReachabilityInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ReachabilityInterfacePeerCleaner implements Runnable {
        private long peer;

        public ReachabilityInterfacePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public ReachabilityInterfaceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ReachabilityInterfacePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.ReachabilityInterface
    public native long addListener(ReachabilityChanged reachabilityChanged);

    @Override // com.mapbox.common.ReachabilityInterface
    public native NetworkStatus currentNetworkStatus();

    @Override // com.mapbox.common.ReachabilityInterface
    public native boolean isReachable();

    @Override // com.mapbox.common.ReachabilityInterface
    public native boolean removeListener(long j7);
}
