package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class MovementModeObserverNative implements MovementModeObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MovementModeObserverPeerCleaner implements Runnable {
        private long peer;

        public MovementModeObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementModeObserverNative.cleanNativePeer(this.peer);
        }
    }

    public MovementModeObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MovementModeObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.MovementModeObserver
    public native void onMovementModeChanged(MovementInfo movementInfo);

    @Override // com.mapbox.common.MovementModeObserver
    public native void onMovementModeError(String str);
}
