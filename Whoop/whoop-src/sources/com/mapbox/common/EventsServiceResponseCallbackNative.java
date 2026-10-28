package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes.dex */
final class EventsServiceResponseCallbackNative implements EventsServiceResponseCallback {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class EventsServiceResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        public EventsServiceResponseCallbackPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventsServiceResponseCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private EventsServiceResponseCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new EventsServiceResponseCallbackPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.EventsServiceResponseCallback
    public native void run(Expected<EventsServiceError, None> expected);
}
