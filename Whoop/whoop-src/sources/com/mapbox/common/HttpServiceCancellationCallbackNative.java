package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class HttpServiceCancellationCallbackNative implements HttpServiceCancellationCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class HttpServiceCancellationCallbackPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceCancellationCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceCancellationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private HttpServiceCancellationCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new HttpServiceCancellationCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.HttpServiceCancellationCallback
    public native void run(long j7, HttpRequest httpRequest);
}
