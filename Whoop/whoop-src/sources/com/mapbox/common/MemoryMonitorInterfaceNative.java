package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class MemoryMonitorInterfaceNative implements MemoryMonitorInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MemoryMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorInterfacePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public MemoryMonitorInterfaceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MemoryMonitorInterfacePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void getMemoryMonitorStatus(MemoryMonitorObserverConfig memoryMonitorObserverConfig, MemoryMonitorStatusCallback memoryMonitorStatusCallback);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void notifySystemMemoryWarningReceived();

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void registerObserver(MemoryMonitorObserver memoryMonitorObserver);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void registerObserverWithConfig(MemoryMonitorObserverConfig memoryMonitorObserverConfig, MemoryMonitorObserver memoryMonitorObserver);

    @Override // com.mapbox.common.MemoryMonitorInterface
    public native void unregisterObserver(MemoryMonitorObserver memoryMonitorObserver);
}
