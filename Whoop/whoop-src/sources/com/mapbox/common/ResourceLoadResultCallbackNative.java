package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class ResourceLoadResultCallbackNative implements ResourceLoadResultCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ResourceLoadResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResourceLoadResultCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceLoadResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResourceLoadResultCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ResourceLoadResultCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.ResourceLoadResultCallback
    public native void run(Expected<ResourceLoadError, ResourceLoadResult> expected);
}
