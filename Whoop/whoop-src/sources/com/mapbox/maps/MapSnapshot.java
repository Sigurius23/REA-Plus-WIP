package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class MapSnapshot {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MapSnapshotPeerCleaner implements Runnable {
        private long peer;

        public MapSnapshotPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapSnapshot.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapSnapshot(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new MapSnapshotPeerCleaner(j7));
    }

    public native List<String> attributions();

    public native Point coordinate(ScreenCoordinate screenCoordinate);

    public native Image moveImage();

    public native ScreenCoordinate screenCoordinate(Point point);
}
