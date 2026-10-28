package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class StyleManagerErrorCallbackNative implements StyleManagerErrorCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class StyleManagerErrorCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleManagerErrorCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleManagerErrorCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleManagerErrorCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new StyleManagerErrorCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.StyleManagerErrorCallback
    public native void run(StyleManager styleManager, MapLoadingError mapLoadingError);
}
