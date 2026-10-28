package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class MovementMonitorInterfaceNative implements MovementMonitorInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MovementMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public MovementMonitorInterfacePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public MovementMonitorInterfaceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new MovementMonitorInterfacePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void getMovementInfo(MovementInfoCallback movementInfoCallback);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void registerObserver(MovementModeObserver movementModeObserver);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void setMovementInfo(MovementInfo movementInfo);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void unregisterObserver(MovementModeObserver movementModeObserver);
}
