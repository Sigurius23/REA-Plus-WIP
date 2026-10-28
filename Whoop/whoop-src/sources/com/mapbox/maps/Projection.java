package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes.dex */
public final class Projection {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ProjectionPeerCleaner implements Runnable {
        private long peer;

        public ProjectionPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            Projection.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Projection(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native Point coordinateForProjectedMeters(ProjectedMeters projectedMeters);

    public static native double getLatitudeScale(double d3);

    public static native double getMetersPerPixelAtLatitude(double d3, double d14);

    public static native Vec2 latLngToMercatorXY(Point point);

    public static native MercatorCoordinate project(Point point, double d3);

    public static native ProjectedMeters projectedMetersForCoordinate(Point point);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new ProjectionPeerCleaner(j7));
    }

    public static native Point unproject(MercatorCoordinate mercatorCoordinate, double d3);

    public static native double worldSize(double d3);
}
