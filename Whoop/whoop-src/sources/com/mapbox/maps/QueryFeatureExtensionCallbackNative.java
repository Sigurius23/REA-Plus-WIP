package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class QueryFeatureExtensionCallbackNative implements QueryFeatureExtensionCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class QueryFeatureExtensionCallbackPeerCleaner implements Runnable {
        private long peer;

        public QueryFeatureExtensionCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            QueryFeatureExtensionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QueryFeatureExtensionCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new QueryFeatureExtensionCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.QueryFeatureExtensionCallback
    public native void run(Expected<String, FeatureExtensionValue> expected);
}
