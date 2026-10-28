package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class TelemetryService {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TelemetryServicePeerCleaner implements Runnable {
        private long peer;

        public TelemetryServicePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TelemetryService(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native TelemetryService getOrCreate();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryServicePeerCleaner(j7));
    }

    public native void flush(FlushOperationResultCallback flushOperationResultCallback);
}
