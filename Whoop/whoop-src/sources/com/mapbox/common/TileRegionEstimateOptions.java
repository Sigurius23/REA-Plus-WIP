package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class TileRegionEstimateOptions implements Serializable {
    private final float errorMargin;
    private final Value extraOptions;
    private final long preciseEstimationTimeout;
    private final long timeout;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateOptions(float f13, long j7, long j13, Value value) {
        this.errorMargin = f13;
        this.preciseEstimationTimeout = j7;
        this.timeout = j13;
        this.extraOptions = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateOptions tileRegionEstimateOptions = (TileRegionEstimateOptions) obj;
        return PartialEq.compare(this.errorMargin, tileRegionEstimateOptions.errorMargin) && this.preciseEstimationTimeout == tileRegionEstimateOptions.preciseEstimationTimeout && this.timeout == tileRegionEstimateOptions.timeout && Objects.equals(this.extraOptions, tileRegionEstimateOptions.extraOptions);
    }

    public float getErrorMargin() {
        return this.errorMargin;
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public long getPreciseEstimationTimeout() {
        return this.preciseEstimationTimeout;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.errorMargin), Long.valueOf(this.preciseEstimationTimeout), Long.valueOf(this.timeout), this.extraOptions);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[errorMargin: ");
        sb4.append(RecordUtils.fieldToString(Float.valueOf(this.errorMargin)));
        sb4.append(", preciseEstimationTimeout: ");
        AbstractC3855a.m11836t(this.preciseEstimationTimeout, ", timeout: ", sb4);
        AbstractC3855a.m11836t(this.timeout, ", extraOptions: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.extraOptions));
        sb4.append("]");
        return sb4.toString();
    }

    public TileRegionEstimateOptions(Value value) {
        this.extraOptions = value;
        this.errorMargin = 0.05f;
        this.preciseEstimationTimeout = 5000L;
        this.timeout = 0L;
    }
}
