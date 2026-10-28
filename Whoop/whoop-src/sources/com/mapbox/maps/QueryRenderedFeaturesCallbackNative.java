package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class QueryRenderedFeaturesCallbackNative implements QueryRenderedFeaturesCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class QueryRenderedFeaturesCallbackPeerCleaner implements Runnable {
        private long peer;

        public QueryRenderedFeaturesCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            QueryRenderedFeaturesCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QueryRenderedFeaturesCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new QueryRenderedFeaturesCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public native void run(Expected<String, List<QueriedRenderedFeature>> expected);
}
