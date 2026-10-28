package com.mapbox.common.http_backend;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.HttpRequestError;

/* JADX INFO: loaded from: classes.dex */
final class RequestObserverNative implements RequestObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class RequestObserverPeerCleaner implements Runnable {
        private long peer;

        public RequestObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestObserverNative.cleanNativePeer(this.peer);
        }
    }

    public RequestObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new RequestObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.http_backend.RequestObserver
    public native void onData(long j7);

    @Override // com.mapbox.common.http_backend.RequestObserver
    public native void onFailed(long j7, HttpRequestError httpRequestError);

    @Override // com.mapbox.common.http_backend.RequestObserver
    public native void onResponse(long j7, ResponseData responseData);

    @Override // com.mapbox.common.http_backend.RequestObserver
    public native void onSucceeded(long j7);
}
