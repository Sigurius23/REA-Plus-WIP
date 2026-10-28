package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class TileRegionEstimateProgress implements Serializable {
    private final long completedResourceCount;
    private final long erroredResourceCount;
    private final TileRegionEstimateResult partialResult;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateProgress(long j7, long j13, long j14, TileRegionEstimateResult tileRegionEstimateResult) {
        this.requiredResourceCount = j7;
        this.erroredResourceCount = j13;
        this.completedResourceCount = j14;
        this.partialResult = tileRegionEstimateResult;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateProgress tileRegionEstimateProgress = (TileRegionEstimateProgress) obj;
        return this.requiredResourceCount == tileRegionEstimateProgress.requiredResourceCount && this.erroredResourceCount == tileRegionEstimateProgress.erroredResourceCount && this.completedResourceCount == tileRegionEstimateProgress.completedResourceCount && Objects.equals(this.partialResult, tileRegionEstimateProgress.partialResult);
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public TileRegionEstimateResult getPartialResult() {
        return this.partialResult;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.requiredResourceCount), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.completedResourceCount), this.partialResult);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[requiredResourceCount: ");
        AbstractC3855a.m11836t(this.requiredResourceCount, ", erroredResourceCount: ", sb4);
        AbstractC3855a.m11836t(this.erroredResourceCount, ", completedResourceCount: ", sb4);
        AbstractC3855a.m11836t(this.completedResourceCount, ", partialResult: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.partialResult));
        sb4.append("]");
        return sb4.toString();
    }
}
