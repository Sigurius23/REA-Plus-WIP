package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public class OfflineSwitch {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OfflineSwitchPeerCleaner implements Runnable {
        private long peer;

        public OfflineSwitchPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineSwitch.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public OfflineSwitch(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native OfflineSwitch getInstance();

    public static native void reset();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new OfflineSwitchPeerCleaner(j7));
    }

    public native boolean isMapboxStackConnected();

    public native void registerObserver(OfflineSwitchObserver offlineSwitchObserver);

    public native void setMapboxStackConnected(boolean z4);

    public native void unregisterObserver(OfflineSwitchObserver offlineSwitchObserver);
}
