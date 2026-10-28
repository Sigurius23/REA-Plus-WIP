package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class PersistentLogConfiguration {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class PersistentLogConfigurationPeerCleaner implements Runnable {
        private long peer;

        public PersistentLogConfigurationPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            PersistentLogConfiguration.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentLogConfiguration(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native boolean getFileAllowHeader();

    public static native Long getFileFlushBufferSize();

    public static native LoggingLevel getFileFlushImmediateFromLogLevel();

    public static native Long getFileFlushLines();

    public static native Long getFileFlushSeconds();

    public static native LoggingLevel getFileLoggingLevel();

    public static native LoggingLevel getFileLoggingLevelForCategory(String str);

    public static native long getFileMaxSize();

    public static native String getFilePath();

    public static native boolean getFilePerCategory();

    public static native long getFileRotateCount();

    public static native void resetFileLoggingLevelForCategory(String str);

    public static native void setFileAllowHeader(boolean z4);

    public static native void setFileFlushConfig(Long l7, Long l12, Long l13, LoggingLevel loggingLevel);

    public static native void setFileLoggingLevel(LoggingLevel loggingLevel);

    public static native void setFileLoggingLevelForCategory(String str, LoggingLevel loggingLevel);

    public static native void setFileMaxSize(long j7);

    public static native void setFilePath(String str);

    public static native void setFilePerCategory(boolean z4);

    public static native void setFileRotateCount(long j7);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new PersistentLogConfigurationPeerCleaner(j7));
    }
}
