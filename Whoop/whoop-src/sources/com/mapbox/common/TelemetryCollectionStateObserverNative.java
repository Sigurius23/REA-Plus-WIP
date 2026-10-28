package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class TelemetryCollectionStateObserverNative implements TelemetryCollectionStateObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TelemetryCollectionStateObserverPeerCleaner implements Runnable {
        private long peer;

        public TelemetryCollectionStateObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryCollectionStateObserverNative.cleanNativePeer(this.peer);
        }
    }

    public TelemetryCollectionStateObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TelemetryCollectionStateObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.TelemetryCollectionStateObserver
    public native void onStateChanged(TelemetryCollectionState telemetryCollectionState);
}
