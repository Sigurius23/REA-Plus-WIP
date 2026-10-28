package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class ConfigurationServiceGetConfigCallbackNative implements ConfigurationServiceGetConfigCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ConfigurationServiceGetConfigCallbackPeerCleaner implements Runnable {
        private long peer;

        public ConfigurationServiceGetConfigCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationServiceGetConfigCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ConfigurationServiceGetConfigCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ConfigurationServiceGetConfigCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.ConfigurationServiceGetConfigCallback
    public native void run(Expected<ConfigurationServiceError, ConfigurationOptions> expected);
}
