package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class BatteryMonitorInterfaceNative implements BatteryMonitorInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class BatteryMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public BatteryMonitorInterfacePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public BatteryMonitorInterfaceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new BatteryMonitorInterfacePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void getBatteryChargingStatus(BatteryChargingStatusCallback batteryChargingStatusCallback);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void registerObserver(BatteryMonitorObserver batteryMonitorObserver);

    @Override // com.mapbox.common.BatteryMonitorInterface
    public native void unregisterObserver(BatteryMonitorObserver batteryMonitorObserver);
}
