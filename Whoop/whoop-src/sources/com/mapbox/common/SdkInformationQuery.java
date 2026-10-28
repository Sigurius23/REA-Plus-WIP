package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SdkInformationQuery implements SdkInformationQueryInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class SdkInformationQueryPeerCleaner implements Runnable {
        private long peer;

        public SdkInformationQueryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            SdkInformationQuery.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInformationQuery(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native List<SdkInformation> getSdkInformation();

    public static native SdkInformation getSdkInformationByName(String str);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new SdkInformationQueryPeerCleaner(j7));
    }
}
