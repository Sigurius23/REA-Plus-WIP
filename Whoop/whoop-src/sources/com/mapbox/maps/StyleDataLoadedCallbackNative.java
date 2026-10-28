package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class StyleDataLoadedCallbackNative implements StyleDataLoadedCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class StyleDataLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleDataLoadedCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleDataLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleDataLoadedCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new StyleDataLoadedCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public native void run(StyleDataLoaded styleDataLoaded);
}
