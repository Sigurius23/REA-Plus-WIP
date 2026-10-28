package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class LogConfiguration {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LogConfigurationPeerCleaner implements Runnable {
        private long peer;

        public LogConfigurationPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogConfiguration.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public LogConfiguration(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native LoggingLevel getLoggingLevel();

    public static native LoggingLevel getLoggingLevel(String str);

    public static native void registerLogWriterBackend(LogWriterBackend logWriterBackend);

    public static native void resetLoggingLevel(String str);

    public static native void setLoggingLevel(LoggingLevel loggingLevel);

    public static native void setLoggingLevel(String str, LoggingLevel loggingLevel);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new LogConfigurationPeerCleaner(j7));
    }
}
