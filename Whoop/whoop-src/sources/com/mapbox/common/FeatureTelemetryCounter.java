package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureTelemetryCounter {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class FeatureTelemetryCounterPeerCleaner implements Runnable {
        private long peer;

        public FeatureTelemetryCounterPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeatureTelemetryCounter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public FeatureTelemetryCounter(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native FeatureTelemetryCounter create(String str);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new FeatureTelemetryCounterPeerCleaner(j7));
    }

    public native String getName();

    public native int getValue();

    public native void increment();

    public native void reset();
}
