package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class TileRegion implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final Date expires;
    private final Value extraData;

    /* JADX INFO: renamed from: id */
    private final String f21896id;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegion(String str, long j7, long j13, long j14, Date date, Value value) {
        this.f21896id = str;
        this.requiredResourceCount = j7;
        this.completedResourceCount = j13;
        this.completedResourceSize = j14;
        this.expires = date;
        this.extraData = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegion tileRegion = (TileRegion) obj;
        return Objects.equals(this.f21896id, tileRegion.f21896id) && this.requiredResourceCount == tileRegion.requiredResourceCount && this.completedResourceCount == tileRegion.completedResourceCount && this.completedResourceSize == tileRegion.completedResourceSize && Objects.equals(this.expires, tileRegion.expires) && Objects.equals(this.extraData, tileRegion.extraData);
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public String getId() {
        return this.f21896id;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(this.f21896id, Long.valueOf(this.requiredResourceCount), Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), this.expires, this.extraData);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[id: ");
        AbstractC3855a.m11838v(this.f21896id, ", requiredResourceCount: ", sb4);
        AbstractC3855a.m11836t(this.requiredResourceCount, ", completedResourceCount: ", sb4);
        AbstractC3855a.m11836t(this.completedResourceCount, ", completedResourceSize: ", sb4);
        AbstractC3855a.m11836t(this.completedResourceSize, ", expires: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.expires));
        sb4.append(", extraData: ");
        sb4.append(RecordUtils.fieldToString(this.extraData));
        sb4.append("]");
        return sb4.toString();
    }
}
