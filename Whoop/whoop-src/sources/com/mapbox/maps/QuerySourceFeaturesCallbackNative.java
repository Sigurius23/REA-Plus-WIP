package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class QuerySourceFeaturesCallbackNative implements QuerySourceFeaturesCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class QuerySourceFeaturesCallbackPeerCleaner implements Runnable {
        private long peer;

        public QuerySourceFeaturesCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            QuerySourceFeaturesCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QuerySourceFeaturesCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new QuerySourceFeaturesCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.QuerySourceFeaturesCallback
    public native void run(Expected<String, List<QueriedSourceFeature>> expected);
}
