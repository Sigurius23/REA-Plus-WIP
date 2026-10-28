package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class StylePackCallbackNative implements StylePackCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class StylePackCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePackCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePackCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePackCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new StylePackCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.StylePackCallback
    public native void run(Expected<StylePackError, StylePack> expected);
}
