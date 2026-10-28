package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class SourceDataLoadedCallbackNative implements SourceDataLoadedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class SourceDataLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public SourceDataLoadedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceDataLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SourceDataLoadedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new SourceDataLoadedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public native void run(SourceDataLoaded sourceDataLoaded);
}
