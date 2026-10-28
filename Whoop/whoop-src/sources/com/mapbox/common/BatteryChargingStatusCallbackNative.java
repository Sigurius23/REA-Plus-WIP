package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class BatteryChargingStatusCallbackNative implements BatteryChargingStatusCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class BatteryChargingStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public BatteryChargingStatusCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            BatteryChargingStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private BatteryChargingStatusCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new BatteryChargingStatusCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.BatteryChargingStatusCallback
    public native void run(Expected<String, Boolean> expected);
}
