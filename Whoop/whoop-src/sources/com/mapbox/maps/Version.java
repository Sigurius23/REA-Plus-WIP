package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes.dex */
public final class Version {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class VersionPeerCleaner implements Runnable {
        private long peer;

        public VersionPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            Version.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Version(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native int getMajorVersion();

    public static native int getMinorVersion();

    public static native int getPatchVersion();

    public static native String getRevisionString();

    public static native String getVersionString();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new VersionPeerCleaner(j7));
    }
}
