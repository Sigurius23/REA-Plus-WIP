package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class StyleManagerCallbackNative implements StyleManagerCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class StyleManagerCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleManagerCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleManagerCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleManagerCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new StyleManagerCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.StyleManagerCallback
    public native void run(StyleManager styleManager);
}
