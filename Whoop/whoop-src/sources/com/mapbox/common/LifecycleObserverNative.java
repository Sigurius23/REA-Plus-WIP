package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleObserverNative implements LifecycleObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LifecycleObserverPeerCleaner implements Runnable {
        private long peer;

        public LifecycleObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifecycleObserverNative.cleanNativePeer(this.peer);
        }
    }

    public LifecycleObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new LifecycleObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.LifecycleObserver
    public native void onLifecycleStateChanged(LifecycleState lifecycleState);

    @Override // com.mapbox.common.LifecycleObserver
    public native void onMonitoringStateChanged(LifecycleMonitoringState lifecycleMonitoringState, String str);
}
