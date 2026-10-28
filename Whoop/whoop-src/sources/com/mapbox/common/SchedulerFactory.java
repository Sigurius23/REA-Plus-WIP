package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public class SchedulerFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class SchedulerFactoryPeerCleaner implements Runnable {
        private long peer;

        public SchedulerFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SchedulerFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SchedulerFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native Scheduler createSequenced();

    public static native Scheduler createSequenced(ThreadServiceType threadServiceType);

    public static native Scheduler createSingleThreaded();

    public static native Scheduler createSingleThreaded(ThreadServiceType threadServiceType);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new SchedulerFactoryPeerCleaner(j7));
    }

    public static native Scheduler threadPool();

    public static native Scheduler threadPool(ThreadServiceType threadServiceType);
}
