package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes.dex */
public final class MapboxOptionsImpl {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MapboxOptionsImplPeerCleaner implements Runnable {
        private long peer;

        public MapboxOptionsImplPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapboxOptionsImpl.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MapboxOptionsImpl(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native String getAccessToken();

    public static native String getTokenForService(String str);

    public static native boolean getUseStaging(String str);

    public static native void setAccessToken(String str);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new MapboxOptionsImplPeerCleaner(j7));
    }

    public static native void setStagingAccessToken(String str);

    public static native void setTokenForService(String str, String str2);

    public static native void setUseStaging(String str, boolean z4);
}
