package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ProjectedMeters implements Serializable {
    private final double easting;
    private final double northing;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ProjectedMeters(double d3, double d14) {
        this.northing = d3;
        this.easting = d14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProjectedMeters.class != obj.getClass()) {
            return false;
        }
        ProjectedMeters projectedMeters = (ProjectedMeters) obj;
        return PartialEq.compare(this.northing, projectedMeters.northing) && PartialEq.compare(this.easting, projectedMeters.easting);
    }

    public double getEasting() {
        return this.easting;
    }

    public double getNorthing() {
        return this.northing;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.northing), Double.valueOf(this.easting));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[northing: ");
        AbstractC3855a.m11835s(this.northing, ", easting: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.easting)));
        sb4.append("]");
        return sb4.toString();
    }
}
