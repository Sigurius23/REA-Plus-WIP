package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ResourceLoadProgress implements Serializable {
    private final long bytes;
    private final Long totalBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadProgress(long j7, Long l7) {
        this.bytes = j7;
        this.totalBytes = l7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadProgress resourceLoadProgress = (ResourceLoadProgress) obj;
        return this.bytes == resourceLoadProgress.bytes && Objects.equals(this.totalBytes, resourceLoadProgress.totalBytes);
    }

    public long getBytes() {
        return this.bytes;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.bytes), this.totalBytes);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[bytes: ");
        AbstractC3855a.m11836t(this.bytes, ", totalBytes: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.totalBytes));
        sb4.append("]");
        return sb4.toString();
    }
}
