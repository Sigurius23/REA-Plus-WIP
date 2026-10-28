package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class HttpResponseCallbackNative implements HttpResponseCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class HttpResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        public HttpResponseCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpResponseCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private HttpResponseCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new HttpResponseCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.HttpResponseCallback
    public native void run(HttpResponse httpResponse);
}
