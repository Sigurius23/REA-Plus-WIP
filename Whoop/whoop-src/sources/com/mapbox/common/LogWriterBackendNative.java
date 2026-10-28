package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class LogWriterBackendNative implements LogWriterBackend {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LogWriterBackendPeerCleaner implements Runnable {
        private long peer;

        public LogWriterBackendPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogWriterBackendNative.cleanNativePeer(this.peer);
        }
    }

    public LogWriterBackendNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new LogWriterBackendPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.LogWriterBackend
    public native void writeLog(LoggingLevel loggingLevel, String str);
}
