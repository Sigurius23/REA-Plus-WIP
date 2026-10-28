package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes.dex */
final class EventsServiceObserverNative implements EventsServiceObserver {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class EventsServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public EventsServiceObserverPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventsServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public EventsServiceObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new EventsServiceObserverPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.EventsServiceObserver
    public native void didEncounterError(EventsServiceError eventsServiceError, Value value);

    @Override // com.mapbox.common.EventsServiceObserver
    public native void didSendEvents(Value value);
}
