package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class StyleImageRemoveUnusedCallbackNative implements StyleImageRemoveUnusedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class StyleImageRemoveUnusedCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleImageRemoveUnusedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleImageRemoveUnusedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleImageRemoveUnusedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new StyleImageRemoveUnusedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public native void run(StyleImageRemoveUnused styleImageRemoveUnused);
}
