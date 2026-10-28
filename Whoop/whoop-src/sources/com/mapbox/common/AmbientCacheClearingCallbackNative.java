package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class AmbientCacheClearingCallbackNative implements AmbientCacheClearingCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class AmbientCacheClearingCallbackPeerCleaner implements Runnable {
        private long peer;

        public AmbientCacheClearingCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            AmbientCacheClearingCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private AmbientCacheClearingCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new AmbientCacheClearingCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.AmbientCacheClearingCallback
    public native void run(Expected<CacheClearingError, Long> expected);
}
