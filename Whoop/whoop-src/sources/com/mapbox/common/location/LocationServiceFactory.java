package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class LocationServiceFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LocationServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public LocationServiceFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocationServiceFactory.cleanNativePeer(this.peer);
        }
    }

    public LocationServiceFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static LocationService getOrCreate() {
        return LocationServiceImpl.createPlatformLocationService();
    }

    public static native void reset();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new LocationServiceFactoryPeerCleaner(j7));
    }
}
