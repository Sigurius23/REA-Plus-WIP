package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class OfflineRegionStatus implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long completedTileCount;
    private final long completedTileSize;
    private final OfflineRegionDownloadState downloadState;
    private final long requiredResourceCount;
    private final boolean requiredResourceCountIsPrecise;
    private final long requiredTileCount;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegionStatus(OfflineRegionDownloadState offlineRegionDownloadState, long j7, long j13, long j14, long j15, long j16, long j17, boolean z4) {
        this.downloadState = offlineRegionDownloadState;
        this.completedResourceCount = j7;
        this.completedResourceSize = j13;
        this.completedTileCount = j14;
        this.requiredTileCount = j15;
        this.completedTileSize = j16;
        this.requiredResourceCount = j17;
        this.requiredResourceCountIsPrecise = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionStatus.class != obj.getClass()) {
            return false;
        }
        OfflineRegionStatus offlineRegionStatus = (OfflineRegionStatus) obj;
        return Objects.equals(this.downloadState, offlineRegionStatus.downloadState) && this.completedResourceCount == offlineRegionStatus.completedResourceCount && this.completedResourceSize == offlineRegionStatus.completedResourceSize && this.completedTileCount == offlineRegionStatus.completedTileCount && this.requiredTileCount == offlineRegionStatus.requiredTileCount && this.completedTileSize == offlineRegionStatus.completedTileSize && this.requiredResourceCount == offlineRegionStatus.requiredResourceCount && this.requiredResourceCountIsPrecise == offlineRegionStatus.requiredResourceCountIsPrecise;
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getCompletedTileCount() {
        return this.completedTileCount;
    }

    public long getCompletedTileSize() {
        return this.completedTileSize;
    }

    public OfflineRegionDownloadState getDownloadState() {
        return this.downloadState;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public boolean getRequiredResourceCountIsPrecise() {
        return this.requiredResourceCountIsPrecise;
    }

    public long getRequiredTileCount() {
        return this.requiredTileCount;
    }

    public int hashCode() {
        return Objects.hash(this.downloadState, Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), Long.valueOf(this.completedTileCount), Long.valueOf(this.requiredTileCount), Long.valueOf(this.completedTileSize), Long.valueOf(this.requiredResourceCount), Boolean.valueOf(this.requiredResourceCountIsPrecise));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[downloadState: ");
        sb4.append(RecordUtils.fieldToString(this.downloadState));
        sb4.append(", completedResourceCount: ");
        AbstractC3855a.m11836t(this.completedResourceCount, ", completedResourceSize: ", sb4);
        AbstractC3855a.m11836t(this.completedResourceSize, ", completedTileCount: ", sb4);
        AbstractC3855a.m11836t(this.completedTileCount, ", requiredTileCount: ", sb4);
        AbstractC3855a.m11836t(this.requiredTileCount, ", completedTileSize: ", sb4);
        AbstractC3855a.m11836t(this.completedTileSize, ", requiredResourceCount: ", sb4);
        AbstractC3855a.m11836t(this.requiredResourceCount, ", requiredResourceCountIsPrecise: ", sb4);
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.requiredResourceCountIsPrecise)));
        sb4.append("]");
        return sb4.toString();
    }
}
