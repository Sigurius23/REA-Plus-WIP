package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class ConfigurationServiceObserverNative implements ConfigurationServiceObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ConfigurationServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public ConfigurationServiceObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public ConfigurationServiceObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ConfigurationServiceObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didEncounterError(ConfigurationServiceError configurationServiceError);

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didStartUpdate();

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didUpdate(ConfigurationOptions configurationOptions);
}
