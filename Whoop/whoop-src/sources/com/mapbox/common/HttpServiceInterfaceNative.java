package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class HttpServiceInterfaceNative implements HttpServiceInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class HttpServiceInterfacePeerCleaner implements Runnable {
        private long peer;

        public HttpServiceInterfacePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public HttpServiceInterfaceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new HttpServiceInterfacePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void cancelRequest(long j7, ResultCallback resultCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void cancelUpload(long j7, ResultCallback resultCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native long download(DownloadOptions downloadOptions, DownloadStatusCallback downloadStatusCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native long request(HttpRequest httpRequest, HttpResponseCallback httpResponseCallback);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void setInterceptor(HttpServiceInterceptorInterface httpServiceInterceptorInterface);

    @Override // com.mapbox.common.HttpServiceInterface
    public native void setMaxRequestsPerHost(byte b);

    @Override // com.mapbox.common.HttpServiceInterface
    @Deprecated
    public native boolean supportsKeepCompression();

    @Override // com.mapbox.common.HttpServiceInterface
    public native long upload(UploadOptions uploadOptions, UploadStatusCallback uploadStatusCallback);
}
