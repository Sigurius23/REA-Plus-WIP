package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
final class InteractionHandlerNative implements InteractionHandler {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class InteractionHandlerPeerCleaner implements Runnable {
        private long peer;

        public InteractionHandlerPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            InteractionHandlerNative.cleanNativePeer(this.peer);
        }
    }

    public InteractionHandlerNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new InteractionHandlerPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.maps.InteractionHandler
    public native boolean handleBegin(QueriedFeature queriedFeature, InteractionContext interactionContext);

    @Override // com.mapbox.maps.InteractionHandler
    public native void handleChange(InteractionContext interactionContext);

    @Override // com.mapbox.maps.InteractionHandler
    public native void handleEnd(InteractionContext interactionContext);
}
