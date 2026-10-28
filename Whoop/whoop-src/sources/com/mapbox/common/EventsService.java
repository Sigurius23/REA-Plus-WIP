package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class EventsService implements EventsServiceInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class EventsServicePeerCleaner implements Runnable {
        private long peer;

        public EventsServicePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            EventsService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public EventsService(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native EventsService getOrCreate(EventsServerOptions eventsServerOptions);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new EventsServicePeerCleaner(j7));
    }

    @Override // com.mapbox.common.EventsServiceInterface
    public native void flush(FlushOperationResultCallback flushOperationResultCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void registerObserver(EventsServiceObserver eventsServiceObserver);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void sendCrashEvent(CrashEvent crashEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void sendEvent(Event event, EventsServiceResponseCallback eventsServiceResponseCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void sendTurnstileEvent(TurnstileEvent turnstileEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void unregisterObserver(EventsServiceObserver eventsServiceObserver);
}
