package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class PerformanceStatistics implements Serializable {
    private final double collectionDurationMillis;
    private final CumulativeRenderingStatistics cumulativeStatistics;
    private final DurationStatistics mapRenderDurationStatistics;
    private final PerFrameRenderingStatistics perFrameStatistics;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public PerformanceStatistics(double d3, DurationStatistics durationStatistics, CumulativeRenderingStatistics cumulativeRenderingStatistics, PerFrameRenderingStatistics perFrameRenderingStatistics) {
        this.collectionDurationMillis = d3;
        this.mapRenderDurationStatistics = durationStatistics;
        this.cumulativeStatistics = cumulativeRenderingStatistics;
        this.perFrameStatistics = perFrameRenderingStatistics;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PerformanceStatistics.class != obj.getClass()) {
            return false;
        }
        PerformanceStatistics performanceStatistics = (PerformanceStatistics) obj;
        return PartialEq.compare(this.collectionDurationMillis, performanceStatistics.collectionDurationMillis) && Objects.equals(this.mapRenderDurationStatistics, performanceStatistics.mapRenderDurationStatistics) && Objects.equals(this.cumulativeStatistics, performanceStatistics.cumulativeStatistics) && Objects.equals(this.perFrameStatistics, performanceStatistics.perFrameStatistics);
    }

    public double getCollectionDurationMillis() {
        return this.collectionDurationMillis;
    }

    public CumulativeRenderingStatistics getCumulativeStatistics() {
        return this.cumulativeStatistics;
    }

    public DurationStatistics getMapRenderDurationStatistics() {
        return this.mapRenderDurationStatistics;
    }

    public PerFrameRenderingStatistics getPerFrameStatistics() {
        return this.perFrameStatistics;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.collectionDurationMillis), this.mapRenderDurationStatistics, this.cumulativeStatistics, this.perFrameStatistics);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[collectionDurationMillis: ");
        AbstractC3855a.m11835s(this.collectionDurationMillis, ", mapRenderDurationStatistics: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.mapRenderDurationStatistics));
        sb4.append(", cumulativeStatistics: ");
        sb4.append(RecordUtils.fieldToString(this.cumulativeStatistics));
        sb4.append(", perFrameStatistics: ");
        sb4.append(RecordUtils.fieldToString(this.perFrameStatistics));
        sb4.append("]");
        return sb4.toString();
    }
}
