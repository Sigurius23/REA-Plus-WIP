package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ViewAnnotationPositionsUpdateListenerNative implements ViewAnnotationPositionsUpdateListener {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ViewAnnotationPositionsUpdateListenerPeerCleaner implements Runnable {
        private long peer;

        public ViewAnnotationPositionsUpdateListenerPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewAnnotationPositionsUpdateListenerNative.cleanNativePeer(this.peer);
        }
    }

    public ViewAnnotationPositionsUpdateListenerNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ViewAnnotationPositionsUpdateListenerPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.ViewAnnotationPositionsUpdateListener
    public native void onViewAnnotationPositionsUpdate(List<ViewAnnotationPositionDescriptor> list);
}
