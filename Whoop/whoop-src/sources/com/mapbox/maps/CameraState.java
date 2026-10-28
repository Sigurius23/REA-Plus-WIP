package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CameraState implements Serializable {
    private final double bearing;
    private final Point center;
    private final EdgeInsets padding;
    private final double pitch;
    private final double zoom;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CameraState(Point point, EdgeInsets edgeInsets, double d3, double d14, double d15) {
        this.center = point;
        this.padding = edgeInsets;
        this.zoom = d3;
        this.bearing = d14;
        this.pitch = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraState.class != obj.getClass()) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        return Objects.equals(this.center, cameraState.center) && Objects.equals(this.padding, cameraState.padding) && PartialEq.compare(this.zoom, cameraState.zoom) && PartialEq.compare(this.bearing, cameraState.bearing) && PartialEq.compare(this.pitch, cameraState.pitch);
    }

    public double getBearing() {
        return this.bearing;
    }

    public Point getCenter() {
        return this.center;
    }

    public EdgeInsets getPadding() {
        return this.padding;
    }

    public double getPitch() {
        return this.pitch;
    }

    public double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(this.center, this.padding, Double.valueOf(this.zoom), Double.valueOf(this.bearing), Double.valueOf(this.pitch));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[center: ");
        sb4.append(RecordUtils.fieldToString(this.center));
        sb4.append(", padding: ");
        sb4.append(RecordUtils.fieldToString(this.padding));
        sb4.append(", zoom: ");
        AbstractC3855a.m11835s(this.zoom, ", bearing: ", sb4);
        AbstractC3855a.m11835s(this.bearing, ", pitch: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.pitch)));
        sb4.append("]");
        return sb4.toString();
    }
}
