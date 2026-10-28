package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public class ReachabilityFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ReachabilityFactoryPeerCleaner implements Runnable {
        private long peer;

        public ReachabilityFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ReachabilityFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native ReachabilityInterface reachability(String str);

    public static native void reset();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new ReachabilityFactoryPeerCleaner(j7));
    }
}
