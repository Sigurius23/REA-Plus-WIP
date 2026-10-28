package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class StylePacksCallbackNative implements StylePacksCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class StylePacksCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePacksCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePacksCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePacksCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new StylePacksCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.StylePacksCallback
    public native void run(Expected<StylePackError, List<StylePack>> expected);
}
