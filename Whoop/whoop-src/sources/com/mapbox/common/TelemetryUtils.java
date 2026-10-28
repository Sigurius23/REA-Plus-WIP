package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class TelemetryUtils {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TelemetryUtilsPeerCleaner implements Runnable {
        private long peer;

        public TelemetryUtilsPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryUtils.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TelemetryUtils() {
        initialize();
    }

    public static native void cleanNativePeer(long j7);

    public static native TelemetryCollectionState getClientServerEventsCollectionState();

    public static native boolean getEventsCollectionState();

    public static native String getUserID();

    private native void initialize();

    public static native void setEventsCollectionState(boolean z4, TelemetryUtilsResponseCallback telemetryUtilsResponseCallback);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryUtilsPeerCleaner(j7));
    }

    public native void registerTelemetryCollectionStateObserver(TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    public native void unregisterTelemetryCollectionStateObserver(TelemetryCollectionStateObserver telemetryCollectionStateObserver);

    public TelemetryUtils(long j7) {
        setPeer(j7);
    }
}
