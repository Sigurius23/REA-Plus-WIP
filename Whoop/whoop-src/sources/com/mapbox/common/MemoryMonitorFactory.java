package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class MemoryMonitorFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MemoryMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MemoryMonitorFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native MemoryMonitorInterface getOrCreate();

    public static native void reset();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new MemoryMonitorFactoryPeerCleaner(j7));
    }

    public static native void setUserDefined(MemoryMonitorInterface memoryMonitorInterface);
}
