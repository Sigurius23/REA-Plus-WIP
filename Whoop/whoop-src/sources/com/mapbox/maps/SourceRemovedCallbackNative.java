package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class SourceRemovedCallbackNative implements SourceRemovedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class SourceRemovedCallbackPeerCleaner implements Runnable {
        private long peer;

        public SourceRemovedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceRemovedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SourceRemovedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new SourceRemovedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.SourceRemovedCallback
    public native void run(SourceRemoved sourceRemoved);
}
