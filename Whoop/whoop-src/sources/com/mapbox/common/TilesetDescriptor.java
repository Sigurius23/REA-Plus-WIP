package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public class TilesetDescriptor {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TilesetDescriptorPeerCleaner implements Runnable {
        private long peer;

        public TilesetDescriptorPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TilesetDescriptor.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TilesetDescriptor(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new TilesetDescriptorPeerCleaner(j7));
    }
}
