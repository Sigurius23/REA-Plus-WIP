package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class DurationStatistics implements Serializable {
    private final double maxMillis;
    private final double medianMillis;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public DurationStatistics(double d3, double d14) {
        this.maxMillis = d3;
        this.medianMillis = d14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DurationStatistics.class != obj.getClass()) {
            return false;
        }
        DurationStatistics durationStatistics = (DurationStatistics) obj;
        return PartialEq.compare(this.maxMillis, durationStatistics.maxMillis) && PartialEq.compare(this.medianMillis, durationStatistics.medianMillis);
    }

    public double getMaxMillis() {
        return this.maxMillis;
    }

    public double getMedianMillis() {
        return this.medianMillis;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.maxMillis), Double.valueOf(this.medianMillis));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[maxMillis: ");
        AbstractC3855a.m11835s(this.maxMillis, ", medianMillis: ", sb4);
        sb4.append(RecordUtils.fieldToString(Double.valueOf(this.medianMillis)));
        sb4.append("]");
        return sb4.toString();
    }
}
