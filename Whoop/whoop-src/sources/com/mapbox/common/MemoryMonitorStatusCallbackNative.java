package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class MemoryMonitorStatusCallbackNative implements MemoryMonitorStatusCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MemoryMonitorStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorStatusCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MemoryMonitorStatusCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MemoryMonitorStatusCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.MemoryMonitorStatusCallback
    public native void run(Expected<String, MemoryMonitorStatus> expected);
}
