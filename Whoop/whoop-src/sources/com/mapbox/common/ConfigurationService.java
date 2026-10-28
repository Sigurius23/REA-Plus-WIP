package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurationService {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ConfigurationServicePeerCleaner implements Runnable {
        private long peer;

        public ConfigurationServicePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ConfigurationService(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native ConfigurationService getOrCreate(EventsServerOptions eventsServerOptions);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new ConfigurationServicePeerCleaner(j7));
    }

    public native void getConfig(ConfigurationServiceGetConfigCallback configurationServiceGetConfigCallback);

    public native void registerObserver(ConfigurationServiceObserver configurationServiceObserver);

    public native void unregisterObserver(ConfigurationServiceObserver configurationServiceObserver);
}
