package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes.dex */
final class Tracing {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TracingPeerCleaner implements Runnable {
        private long peer;

        public TracingPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            Tracing.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Tracing(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native TracingBackendType getTracingBackendType();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new TracingPeerCleaner(j7));
    }

    public static native void setTracingBackendType(TracingBackendType tracingBackendType);
}
