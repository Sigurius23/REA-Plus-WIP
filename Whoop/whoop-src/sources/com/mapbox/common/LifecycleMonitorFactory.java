package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleMonitorFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class LifecycleMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        public LifecycleMonitorFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifecycleMonitorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public LifecycleMonitorFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native LifecycleMonitorInterface getOrCreate();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new LifecycleMonitorFactoryPeerCleaner(j7));
    }
}
