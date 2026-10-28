package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class DownloadStatusCallbackNative implements DownloadStatusCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class DownloadStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public DownloadStatusCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private DownloadStatusCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new DownloadStatusCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.DownloadStatusCallback
    public native void run(DownloadStatus downloadStatus);
}
