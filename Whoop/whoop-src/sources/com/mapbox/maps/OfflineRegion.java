package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class OfflineRegion {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OfflineRegionPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegion.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegion(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new OfflineRegionPeerCleaner(j7));
    }

    public native OfflineRegionGeometryDefinition getGeometryDefinition();

    public native long getIdentifier();

    public native byte[] getMetadata();

    public native void getStatus(OfflineRegionStatusCallback offlineRegionStatusCallback);

    public native OfflineRegionTilePyramidDefinition getTilePyramidDefinition();

    public native void invalidate(AsyncOperationResultCallback asyncOperationResultCallback);

    public native void purge(AsyncOperationResultCallback asyncOperationResultCallback);

    public native void setMetadata(byte[] bArr, AsyncOperationResultCallback asyncOperationResultCallback);

    public native void setOfflineRegionDownloadState(OfflineRegionDownloadState offlineRegionDownloadState);

    public native void setOfflineRegionObserver(OfflineRegionObserver offlineRegionObserver);
}
