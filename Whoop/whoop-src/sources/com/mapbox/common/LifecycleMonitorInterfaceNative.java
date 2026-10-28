package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleMonitorInterfaceNative implements LifecycleMonitorInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LifecycleMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public LifecycleMonitorInterfacePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifecycleMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public LifecycleMonitorInterfaceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new LifecycleMonitorInterfacePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void getLifecycleState(GetLifecycleStateCallback getLifecycleStateCallback);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void getMonitoringState(GetLifecycleMonitoringStateCallback getLifecycleMonitoringStateCallback);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void registerObserver(LifecycleObserver lifecycleObserver);

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public native void unregisterObserver(LifecycleObserver lifecycleObserver);
}
