package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SdkInfoRegistry implements SdkInfoRegistryInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class SdkInfoRegistryPeerCleaner implements Runnable {
        private long peer;

        public SdkInfoRegistryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SdkInfoRegistry.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInfoRegistry(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new SdkInfoRegistryPeerCleaner(j7));
    }

    @Override // com.mapbox.common.SdkInfoRegistryInterface
    public native List<SdkInformation> getSdkInformation();

    @Override // com.mapbox.common.SdkInfoRegistryInterface
    public native void registerSdkInformation(SdkInformation sdkInformation);
}
