package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class SettingsServiceFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class SettingsServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public SettingsServiceFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SettingsServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SettingsServiceFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native SettingsService getInstance(SettingsServiceStorageType settingsServiceStorageType);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new SettingsServiceFactoryPeerCleaner(j7));
    }
}
