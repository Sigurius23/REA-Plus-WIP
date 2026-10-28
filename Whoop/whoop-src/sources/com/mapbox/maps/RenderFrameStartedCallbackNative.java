package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class RenderFrameStartedCallbackNative implements RenderFrameStartedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class RenderFrameStartedCallbackPeerCleaner implements Runnable {
        private long peer;

        public RenderFrameStartedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            RenderFrameStartedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RenderFrameStartedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new RenderFrameStartedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public native void run(RenderFrameStarted renderFrameStarted);
}
