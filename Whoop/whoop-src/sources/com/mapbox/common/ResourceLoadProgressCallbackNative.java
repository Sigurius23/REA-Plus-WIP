package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class ResourceLoadProgressCallbackNative implements ResourceLoadProgressCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ResourceLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResourceLoadProgressCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResourceLoadProgressCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ResourceLoadProgressCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.ResourceLoadProgressCallback
    public native void run(ResourceLoadProgress resourceLoadProgress);
}
