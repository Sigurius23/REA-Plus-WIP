package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class HttpServiceInterceptorInterfaceNative implements HttpServiceInterceptorInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class HttpServiceInterceptorInterfacePeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterceptorInterfacePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterceptorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public HttpServiceInterceptorInterfaceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new HttpServiceInterceptorInterfacePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.HttpServiceInterceptorInterface
    public native void onRequest(HttpRequest httpRequest, HttpServiceInterceptorRequestContinuation httpServiceInterceptorRequestContinuation);

    @Override // com.mapbox.common.HttpServiceInterceptorInterface
    public native void onResponse(HttpResponse httpResponse, HttpServiceInterceptorResponseContinuation httpServiceInterceptorResponseContinuation);
}
