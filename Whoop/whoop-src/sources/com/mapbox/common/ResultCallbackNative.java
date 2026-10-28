package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class ResultCallbackNative implements ResultCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResultCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResultCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ResultCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.ResultCallback
    public native void run(boolean z4);
}
