package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class ResourceRequestCallbackNative implements ResourceRequestCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ResourceRequestCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResourceRequestCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceRequestCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResourceRequestCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ResourceRequestCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.ResourceRequestCallback
    public native void run(ResourceRequest resourceRequest);
}
