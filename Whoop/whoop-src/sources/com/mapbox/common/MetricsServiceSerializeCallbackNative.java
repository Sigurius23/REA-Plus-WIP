package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes.dex */
final class MetricsServiceSerializeCallbackNative implements MetricsServiceSerializeCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MetricsServiceSerializeCallbackPeerCleaner implements Runnable {
        private long peer;

        public MetricsServiceSerializeCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsServiceSerializeCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MetricsServiceSerializeCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MetricsServiceSerializeCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.MetricsServiceSerializeCallback
    public native void run(Value value);
}
