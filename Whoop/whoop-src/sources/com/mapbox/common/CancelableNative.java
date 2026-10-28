package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class CancelableNative implements Cancelable {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class CancelablePeerCleaner implements Runnable {
        private long peer;

        public CancelablePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            CancelableNative.cleanNativePeer(this.peer);
        }
    }

    public CancelableNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new CancelablePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.Cancelable
    public native void cancel();
}
