package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;

/* JADX INFO: loaded from: classes.dex */
public class ResourceData {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ResourceDataPeerCleaner implements Runnable {
        private long peer;

        public ResourceDataPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceData.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceData(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new ResourceDataPeerCleaner(j7));
    }

    public native DataRef getData();
}
