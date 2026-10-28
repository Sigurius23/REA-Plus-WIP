package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes.dex */
final class TelemetryUtilsResponseCallbackNative implements TelemetryUtilsResponseCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TelemetryUtilsResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        public TelemetryUtilsResponseCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryUtilsResponseCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TelemetryUtilsResponseCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TelemetryUtilsResponseCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TelemetryUtilsResponseCallback
    public native void run(Expected<EventsServiceError, None> expected);
}
