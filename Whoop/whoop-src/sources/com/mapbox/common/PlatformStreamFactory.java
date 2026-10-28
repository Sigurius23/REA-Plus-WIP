package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public class PlatformStreamFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class PlatformStreamFactoryPeerCleaner implements Runnable {
        private long peer;

        public PlatformStreamFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformStreamFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PlatformStreamFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native ReadStream fileReadStream(String str);

    public static native ReadStream memoryReadStream(String str);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new PlatformStreamFactoryPeerCleaner(j7));
    }
}
