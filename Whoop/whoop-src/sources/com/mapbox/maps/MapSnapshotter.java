package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes.dex */
final class MapSnapshotter extends CameraManager {

    /* JADX INFO: loaded from: classes6.dex */
    public static class MapSnapshotterPeerCleaner implements Runnable {
        private long peer;

        public MapSnapshotterPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapSnapshotter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapSnapshotter(MapSnapshotOptions mapSnapshotOptions) {
        super(0L);
        initialize(mapSnapshotOptions);
    }

    public static native void cleanNativePeer(long j7);

    private native void initialize(MapSnapshotOptions mapSnapshotOptions);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new MapSnapshotterPeerCleaner(j7));
    }

    public native void cancel();

    public native Double getElevation(Point point);

    public native Size getSize();

    public native void reduceMemoryUse();

    public native void setSize(Size size);

    public native void start(SnapshotCompleteCallback snapshotCompleteCallback);

    public MapSnapshotter(long j7) {
        super(0L);
        setPeer(j7);
    }
}
