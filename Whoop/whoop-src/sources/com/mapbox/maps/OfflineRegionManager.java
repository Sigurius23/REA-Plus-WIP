package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class OfflineRegionManager {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OfflineRegionManagerPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionManagerPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionManager.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegionManager() {
        initialize();
    }

    public static native void cleanNativePeer(long j7);

    private native void initialize();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new OfflineRegionManagerPeerCleaner(j7));
    }

    public native void createOfflineRegion(OfflineRegionGeometryDefinition offlineRegionGeometryDefinition, OfflineRegionCreateCallback offlineRegionCreateCallback);

    public native void createOfflineRegion(OfflineRegionTilePyramidDefinition offlineRegionTilePyramidDefinition, OfflineRegionCreateCallback offlineRegionCreateCallback);

    public native void getOfflineRegions(OfflineRegionCallback offlineRegionCallback);

    public native void mergeOfflineDatabase(String str, OfflineDatabaseMergeCallback offlineDatabaseMergeCallback);

    public native void setOfflineMapboxTileCountLimit(long j7);

    public OfflineRegionManager(long j7) {
        setPeer(j7);
    }
}
