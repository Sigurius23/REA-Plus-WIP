package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class HttpServiceFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class HttpServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public HttpServiceFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpServiceFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native HttpServiceInterface getInstance();

    public static native void reset();

    public static native Cancelable setCancellationCallback(HttpServiceCancellationCallback httpServiceCancellationCallback);

    public static native void setHttpServiceInterceptor(HttpServiceInterceptorInterface httpServiceInterceptorInterface);

    public static native void setMaxRequestsPerHost(byte b);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new HttpServiceFactoryPeerCleaner(j7));
    }

    public static native void setUserDefined(HttpServiceInterface httpServiceInterface);
}
