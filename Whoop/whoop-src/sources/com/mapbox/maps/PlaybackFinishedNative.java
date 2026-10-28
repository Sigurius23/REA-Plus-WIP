package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class PlaybackFinishedNative implements PlaybackFinished {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class PlaybackFinishedPeerCleaner implements Runnable {
        private long peer;

        public PlaybackFinishedPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlaybackFinishedNative.cleanNativePeer(this.peer);
        }
    }

    private PlaybackFinishedNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new PlaybackFinishedPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.PlaybackFinished
    public native void run();
}
