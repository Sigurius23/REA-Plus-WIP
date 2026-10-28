package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class MetricsServiceFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MetricsServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public MetricsServiceFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MetricsServiceFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native MetricsService getInstance();

    public static native MetricsService getInstanceForLogging();

    public static native void reset();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new MetricsServiceFactoryPeerCleaner(j7));
    }
}
