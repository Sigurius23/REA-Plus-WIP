package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class BatteryMonitorObserverNative implements BatteryMonitorObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class BatteryMonitorObserverPeerCleaner implements Runnable {
        private long peer;

        public BatteryMonitorObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorObserverNative.cleanNativePeer(this.peer);
        }
    }

    public BatteryMonitorObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new BatteryMonitorObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.BatteryMonitorObserver
    public native void onBatteryChargingStatusChanged(boolean z4);

    @Override // com.mapbox.common.BatteryMonitorObserver
    public native void onBatteryStatusError(String str);
}
