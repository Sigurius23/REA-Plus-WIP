package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes.dex */
final class AsyncOperationResultCallbackNative implements AsyncOperationResultCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class AsyncOperationResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public AsyncOperationResultCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncOperationResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private AsyncOperationResultCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new AsyncOperationResultCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.AsyncOperationResultCallback
    public native void run(Expected<String, None> expected);
}
