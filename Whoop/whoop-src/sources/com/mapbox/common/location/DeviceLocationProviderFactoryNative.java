package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class DeviceLocationProviderFactoryNative implements DeviceLocationProviderFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class DeviceLocationProviderFactoryPeerCleaner implements Runnable {
        private long peer;

        public DeviceLocationProviderFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceLocationProviderFactoryNative.cleanNativePeer(this.peer);
        }
    }

    public DeviceLocationProviderFactoryNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new DeviceLocationProviderFactoryPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.location.DeviceLocationProviderFactory
    public native Expected<LocationError, DeviceLocationProvider> build(LocationProviderRequest locationProviderRequest);
}
