package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class StyleImageMissingCallbackNative implements StyleImageMissingCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class StyleImageMissingCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleImageMissingCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleImageMissingCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleImageMissingCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new StyleImageMissingCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public native void run(StyleImageMissing styleImageMissing);
}
