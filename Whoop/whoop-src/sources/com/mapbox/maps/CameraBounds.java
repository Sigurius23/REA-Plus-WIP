package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class CameraBounds implements Serializable {
    private final CoordinateBounds bounds;
    private final double maxPitch;
    private final double maxZoom;
    private final double minPitch;
    private final double minZoom;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CameraBounds(CoordinateBounds coordinateBounds, double d3, double d14, double d15, double d16) {
        this.bounds = coordinateBounds;
        this.maxZoom = d3;
        this.minZoom = d14;
        this.maxPitch = d15;
        this.minPitch = d16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraBounds.class != obj.getClass()) {
            return false;
        }
        CameraBounds cameraBounds = (CameraBounds) obj;
        return Objects.equals(this.bounds, cameraBounds.bounds) && PartialEq.compare(this.maxZoom, cameraBounds.maxZoom) && PartialEq.compare(this.minZoom, cameraBounds.minZoom) && PartialEq.compare(this.maxPitch, cameraBounds.maxPitch) && PartialEq.compare(this.minPitch, cameraBounds.minPitch);
    }

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public double getMaxPitch() {
        return this.maxPitch;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinPitch() {
        return this.minPitch;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public int hashCode() {
        return Objects.hash(this.bounds, Double.valueOf(this.maxZoom), Double.valueOf(this.minZoom), Double.valueOf(this.maxPitch), Double.valueOf(this.minPitch));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[bounds: ");
        sb4.append(RecordUtils.fieldToString(this.bounds));
        sb4.append(", maxZoom: ");
        AbstractC3855a.m11835s(this.maxZoom, ", minZoom: ", sb4);
        AbstractC3855a.m11835s(this.minZoom, ", maxPitch: ", sb4);
        AbstractC3855a.m11835s(this.maxPitch, ", minPitch: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.minPitch)));
        sb4.append("]");
        return sb4.toString();
    }
}
