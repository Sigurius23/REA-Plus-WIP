package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class SchedulerNative implements Scheduler {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class SchedulerPeerCleaner implements Runnable {
        private long peer;

        public SchedulerPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SchedulerNative.cleanNativePeer(this.peer);
        }
    }

    public SchedulerNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new SchedulerPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.Scheduler
    public native SchedulerType getType();

    @Override // com.mapbox.common.Scheduler
    public native void schedule(Task task, TaskOptions taskOptions);
}
