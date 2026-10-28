package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class OfflineDatabaseMergeCallbackNative implements OfflineDatabaseMergeCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OfflineDatabaseMergeCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineDatabaseMergeCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineDatabaseMergeCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineDatabaseMergeCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new OfflineDatabaseMergeCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.OfflineDatabaseMergeCallback
    public native void run(Expected<String, List<OfflineRegion>> expected);
}
