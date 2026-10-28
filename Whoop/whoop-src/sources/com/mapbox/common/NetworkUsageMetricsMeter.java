package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkUsageMetricsMeter {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class NetworkUsageMetricsMeterPeerCleaner implements Runnable {
        private long peer;

        public NetworkUsageMetricsMeterPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            NetworkUsageMetricsMeter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public NetworkUsageMetricsMeter(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native void onBytesTransferred(String str, int i13, int i14);

    public static native void onHttpCodeReceived(int i13);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new NetworkUsageMetricsMeterPeerCleaner(j7));
    }
}
