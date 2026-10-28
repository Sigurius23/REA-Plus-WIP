package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public class MetricsService {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MetricsServicePeerCleaner implements Runnable {
        private long peer;

        public MetricsServicePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MetricsService(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new MetricsServicePeerCleaner(j7));
    }

    public native void addMetricsSource(MetricsSource metricsSource);

    public native void flush(FlushOperationResultCallback flushOperationResultCallback);

    public native void removeMetricsSource(MetricsSource metricsSource);

    public native void serialize(MetricsServiceSerializeCallback metricsServiceSerializeCallback);

    public native void serializePretty(MetricsServiceSerializeCallback metricsServiceSerializeCallback);

    public native void setTag(String str);

    public native void start(Long l7);

    public native void stop();

    public native void subscribeToConfigUpdates();
}
