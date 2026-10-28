package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
class Log {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LogPeerCleaner implements Runnable {
        private long peer;

        public LogPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Log(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native void debug(String str, String str2);

    public static native void error(String str, String str2);

    public static native void info(String str, String str2);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new LogPeerCleaner(j7));
    }

    public static native void warning(String str, String str2);
}
