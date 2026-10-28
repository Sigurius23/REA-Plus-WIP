package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes.dex */
final class FeatureStateOperationCallbackNative implements FeatureStateOperationCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class FeatureStateOperationCallbackPeerCleaner implements Runnable {
        private long peer;

        public FeatureStateOperationCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeatureStateOperationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private FeatureStateOperationCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new FeatureStateOperationCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.FeatureStateOperationCallback
    public native void run(Expected<String, None> expected);
}
