package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class GetLifecycleMonitoringStateCallbackNative implements GetLifecycleMonitoringStateCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class GetLifecycleMonitoringStateCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetLifecycleMonitoringStateCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetLifecycleMonitoringStateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetLifecycleMonitoringStateCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new GetLifecycleMonitoringStateCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.GetLifecycleMonitoringStateCallback
    public native void run(Expected<String, LifecycleMonitoringState> expected);
}
