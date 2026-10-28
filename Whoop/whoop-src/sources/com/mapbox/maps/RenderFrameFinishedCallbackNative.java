package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class RenderFrameFinishedCallbackNative implements RenderFrameFinishedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class RenderFrameFinishedCallbackPeerCleaner implements Runnable {
        private long peer;

        public RenderFrameFinishedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            RenderFrameFinishedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RenderFrameFinishedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new RenderFrameFinishedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public native void run(RenderFrameFinished renderFrameFinished);
}
