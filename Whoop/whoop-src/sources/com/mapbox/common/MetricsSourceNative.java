package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class MetricsSourceNative implements MetricsSource {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MetricsSourcePeerCleaner implements Runnable {
        private long peer;

        public MetricsSourcePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsSourceNative.cleanNativePeer(this.peer);
        }
    }

    public MetricsSourceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MetricsSourcePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.MetricsSource
    public native List<Metrics> getMetrics();
}
