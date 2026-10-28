package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TileStore {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class TileStorePeerCleaner implements Runnable {
        private long peer;

        public TileStorePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileStore.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileStore(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native TileStore create();

    public static native TileStore create(String str);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new TileStorePeerCleaner(j7));
    }

    public native void addObserver(TileStoreObserver tileStoreObserver);

    public native void clearAmbientCache(AmbientCacheClearingCallback ambientCacheClearingCallback);

    public native void clearAmbientCache(AmbientCacheClearingCallback ambientCacheClearingCallback, TileStoreAmbientCacheFilterOptions tileStoreAmbientCacheFilterOptions);

    public native void computeCoveredArea(List<TilesetDescriptor> list, TileRegionGeometryCallback tileRegionGeometryCallback);

    public native Cancelable estimateTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions, TileRegionEstimateOptions tileRegionEstimateOptions, TileRegionEstimateProgressCallback tileRegionEstimateProgressCallback, TileRegionEstimateResultCallback tileRegionEstimateResultCallback);

    public native Cancelable estimateTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions, TileRegionEstimateProgressCallback tileRegionEstimateProgressCallback, TileRegionEstimateResultCallback tileRegionEstimateResultCallback);

    public native void getAllTileRegions(TileRegionsCallback tileRegionsCallback);

    public native void getTileRegion(String str, TileRegionCallback tileRegionCallback);

    public native void getTileRegionGeometry(String str, TileRegionGeometryCallback tileRegionGeometryCallback);

    public native void getTileRegionMetadata(String str, TileRegionMetadataCallback tileRegionMetadataCallback);

    public native Cancelable loadResource(ResourceDescription resourceDescription, ResourceLoadOptions resourceLoadOptions, ResourceLoadProgressCallback resourceLoadProgressCallback, ResourceLoadResultCallback resourceLoadResultCallback);

    public native Cancelable loadTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions);

    public native Cancelable loadTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions, TileRegionCallback tileRegionCallback);

    public native Cancelable loadTileRegion(String str, TileRegionLoadOptions tileRegionLoadOptions, TileRegionLoadProgressCallback tileRegionLoadProgressCallback, TileRegionCallback tileRegionCallback);

    public native void removeObserver(TileStoreObserver tileStoreObserver);

    public native void removeTileRegion(String str);

    public native void removeTileRegion(String str, TileRegionCallback tileRegionCallback);

    public native void setOption(String str, Value value);

    public native void setOption(String str, TileDataDomain tileDataDomain, Value value);

    public native void tileRegionContainsDescriptors(String str, List<TilesetDescriptor> list, TileRegionBooleanCallback tileRegionBooleanCallback);
}
