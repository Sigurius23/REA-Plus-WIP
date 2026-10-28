package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class SourceAddedCallbackNative implements SourceAddedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class SourceAddedCallbackPeerCleaner implements Runnable {
        private long peer;

        public SourceAddedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceAddedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SourceAddedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new SourceAddedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.SourceAddedCallback
    public native void run(SourceAdded sourceAdded);
}
