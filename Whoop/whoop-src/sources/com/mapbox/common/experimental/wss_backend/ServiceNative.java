package com.mapbox.common.experimental.wss_backend;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.ResultCallback;

/* JADX INFO: loaded from: classes.dex */
final class ServiceNative implements Service {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ServicePeerCleaner implements Runnable {
        private long peer;

        public ServicePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ServiceNative.cleanNativePeer(this.peer);
        }
    }

    public ServiceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ServicePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native void cancelConnection(long j7, ResultCallback resultCallback);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native long connect(Request request, RequestObserver requestObserver);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native void setPingTimeout(long j7);

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public native void write(long j7, Data data);
}
