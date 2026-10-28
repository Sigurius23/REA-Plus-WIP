package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes.dex */
final class QueryFeatureStateCallbackNative implements QueryFeatureStateCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class QueryFeatureStateCallbackPeerCleaner implements Runnable {
        private long peer;

        public QueryFeatureStateCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            QueryFeatureStateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QueryFeatureStateCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new QueryFeatureStateCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public native void run(Expected<String, Value> expected);
}
