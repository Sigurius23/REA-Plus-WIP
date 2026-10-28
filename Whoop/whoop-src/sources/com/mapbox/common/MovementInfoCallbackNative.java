package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class MovementInfoCallbackNative implements MovementInfoCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MovementInfoCallbackPeerCleaner implements Runnable {
        private long peer;

        public MovementInfoCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementInfoCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MovementInfoCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MovementInfoCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.MovementInfoCallback
    public native void run(Expected<String, MovementInfo> expected);
}
