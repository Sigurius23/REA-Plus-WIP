package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class HttpServiceInterceptorRequestContinuationNative implements HttpServiceInterceptorRequestContinuation {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class HttpServiceInterceptorRequestContinuationPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterceptorRequestContinuationPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorRequestContinuationNative.cleanNativePeer(this.peer);
        }
    }

    private HttpServiceInterceptorRequestContinuationNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new HttpServiceInterceptorRequestContinuationPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.HttpServiceInterceptorRequestContinuation
    public native void run(HttpRequestOrResponse httpRequestOrResponse);
}
