package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class SdkInfoRegistryFactory implements SdkInfoRegistryFactoryInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class SdkInfoRegistryFactoryPeerCleaner implements Runnable {
        private long peer;

        public SdkInfoRegistryFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SdkInfoRegistryFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInfoRegistryFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native SdkInfoRegistry getInstance();

    public static native void reset();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new SdkInfoRegistryFactoryPeerCleaner(j7));
    }
}
