package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class TaskNative implements Task {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TaskPeerCleaner implements Runnable {
        private long peer;

        public TaskPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TaskNative.cleanNativePeer(this.peer);
        }
    }

    private TaskNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new TaskPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.Task
    public native void run();
}
