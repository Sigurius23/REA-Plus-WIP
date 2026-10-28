package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class GetLifecycleStateCallbackNative implements GetLifecycleStateCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class GetLifecycleStateCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetLifecycleStateCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetLifecycleStateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetLifecycleStateCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new GetLifecycleStateCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.GetLifecycleStateCallback
    public native void run(Expected<String, LifecycleState> expected);
}
