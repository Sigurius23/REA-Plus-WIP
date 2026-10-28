package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class TileRegionEstimateResult implements Serializable {
    private final double errorMargin;
    private final Value extraData;
    private final long storageSize;
    private final long transferSize;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateResult(double d3, long j7, long j13, Value value) {
        this.errorMargin = d3;
        this.transferSize = j7;
        this.storageSize = j13;
        this.extraData = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateResult tileRegionEstimateResult = (TileRegionEstimateResult) obj;
        return PartialEq.compare(this.errorMargin, tileRegionEstimateResult.errorMargin) && this.transferSize == tileRegionEstimateResult.transferSize && this.storageSize == tileRegionEstimateResult.storageSize && Objects.equals(this.extraData, tileRegionEstimateResult.extraData);
    }

    public double getErrorMargin() {
        return this.errorMargin;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public long getStorageSize() {
        return this.storageSize;
    }

    public long getTransferSize() {
        return this.transferSize;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.errorMargin), Long.valueOf(this.transferSize), Long.valueOf(this.storageSize), this.extraData);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[errorMargin: ");
        AbstractC3855a.m11835s(this.errorMargin, ", transferSize: ", sb4);
        AbstractC3855a.m11836t(this.transferSize, ", storageSize: ", sb4);
        AbstractC3855a.m11836t(this.storageSize, ", extraData: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.extraData));
        sb4.append("]");
        return sb4.toString();
    }
}
