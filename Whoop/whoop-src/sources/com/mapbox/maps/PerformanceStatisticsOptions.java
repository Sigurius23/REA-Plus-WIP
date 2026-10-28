package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class PerformanceStatisticsOptions implements Serializable {
    private final List<PerformanceSamplerOptions> samplerOptions;
    private final double samplingDurationMillis;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private List<PerformanceSamplerOptions> samplerOptions;
        private double samplingDurationMillis = 1000.0d;

        public PerformanceStatisticsOptions build() {
            if (this.samplerOptions != null) {
                return new PerformanceStatisticsOptions(this.samplerOptions, this.samplingDurationMillis);
            }
            throw new NullPointerException("samplerOptions shouldn't be null");
        }

        public Builder samplerOptions(List<PerformanceSamplerOptions> list) {
            this.samplerOptions = list;
            return this;
        }

        public Builder samplingDurationMillis(double d3) {
            this.samplingDurationMillis = d3;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PerformanceStatisticsOptions.class != obj.getClass()) {
            return false;
        }
        PerformanceStatisticsOptions performanceStatisticsOptions = (PerformanceStatisticsOptions) obj;
        return Objects.equals(this.samplerOptions, performanceStatisticsOptions.samplerOptions) && PartialEq.compare(this.samplingDurationMillis, performanceStatisticsOptions.samplingDurationMillis);
    }

    public List<PerformanceSamplerOptions> getSamplerOptions() {
        return this.samplerOptions;
    }

    public double getSamplingDurationMillis() {
        return this.samplingDurationMillis;
    }

    public int hashCode() {
        return Objects.hash(this.samplerOptions, Double.valueOf(this.samplingDurationMillis));
    }

    public Builder toBuilder() {
        return new Builder().samplerOptions(this.samplerOptions).samplingDurationMillis(this.samplingDurationMillis);
    }

    public String toString() {
        return "[samplerOptions: " + RecordUtils.fieldToString(this.samplerOptions) + ", samplingDurationMillis: " + RecordUtils.fieldToString(Double.valueOf(this.samplingDurationMillis)) + "]";
    }

    private PerformanceStatisticsOptions(List<PerformanceSamplerOptions> list, double d3) {
        this.samplerOptions = list;
        this.samplingDurationMillis = d3;
    }

    private PerformanceStatisticsOptions(List<PerformanceSamplerOptions> list) {
        this.samplerOptions = list;
        this.samplingDurationMillis = 1000.0d;
    }
}
