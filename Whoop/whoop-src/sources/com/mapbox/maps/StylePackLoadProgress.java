package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class StylePackLoadProgress implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long erroredResourceCount;
    private final long loadedResourceCount;
    private final long loadedResourceSize;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StylePackLoadProgress(long j7, long j13, long j14, long j15, long j16, long j17) {
        this.completedResourceCount = j7;
        this.completedResourceSize = j13;
        this.erroredResourceCount = j14;
        this.requiredResourceCount = j15;
        this.loadedResourceCount = j16;
        this.loadedResourceSize = j17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StylePackLoadProgress.class != obj.getClass()) {
            return false;
        }
        StylePackLoadProgress stylePackLoadProgress = (StylePackLoadProgress) obj;
        return this.completedResourceCount == stylePackLoadProgress.completedResourceCount && this.completedResourceSize == stylePackLoadProgress.completedResourceSize && this.erroredResourceCount == stylePackLoadProgress.erroredResourceCount && this.requiredResourceCount == stylePackLoadProgress.requiredResourceCount && this.loadedResourceCount == stylePackLoadProgress.loadedResourceCount && this.loadedResourceSize == stylePackLoadProgress.loadedResourceSize;
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public long getLoadedResourceCount() {
        return this.loadedResourceCount;
    }

    public long getLoadedResourceSize() {
        return this.loadedResourceSize;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.requiredResourceCount), Long.valueOf(this.loadedResourceCount), Long.valueOf(this.loadedResourceSize));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[completedResourceCount: ");
        AbstractC3855a.m11836t(this.completedResourceCount, ", completedResourceSize: ", sb4);
        AbstractC3855a.m11836t(this.completedResourceSize, ", erroredResourceCount: ", sb4);
        AbstractC3855a.m11836t(this.erroredResourceCount, ", requiredResourceCount: ", sb4);
        AbstractC3855a.m11836t(this.requiredResourceCount, ", loadedResourceCount: ", sb4);
        AbstractC3855a.m11836t(this.loadedResourceCount, ", loadedResourceSize: ", sb4);
        sb4.append(RecordUtils.fieldToString(Long.valueOf(this.loadedResourceSize)));
        sb4.append("]");
        return sb4.toString();
    }
}
