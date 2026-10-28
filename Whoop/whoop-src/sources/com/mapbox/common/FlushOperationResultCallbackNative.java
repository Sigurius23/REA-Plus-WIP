package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes.dex */
final class FlushOperationResultCallbackNative implements FlushOperationResultCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class FlushOperationResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public FlushOperationResultCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            FlushOperationResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private FlushOperationResultCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new FlushOperationResultCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.FlushOperationResultCallback, com.mapbox.maps.FeatureStateOperationCallback
    public native void run(Expected<String, None> expected);
}
