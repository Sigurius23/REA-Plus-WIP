package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes.dex */
final class StylePackMetadataCallbackNative implements StylePackMetadataCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class StylePackMetadataCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePackMetadataCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePackMetadataCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePackMetadataCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new StylePackMetadataCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.StylePackMetadataCallback
    public native void run(Expected<StylePackError, Value> expected);
}
