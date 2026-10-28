package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ResourceLoadResult implements Serializable {
    private final boolean belongsToGroup;
    private final String contentType;
    private final ResourceData data;
    private final String etag;
    private final Date expires;
    private final boolean immutable;
    private final boolean mustRevalidate;
    private final ResourceLoadStatus status;
    private final long totalBytes;
    private final long transferredBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadResult(ResourceData resourceData, ResourceLoadStatus resourceLoadStatus, boolean z4, boolean z13, Date date, long j7, long j13, String str, String str2, boolean z14) {
        this.data = resourceData;
        this.status = resourceLoadStatus;
        this.immutable = z4;
        this.mustRevalidate = z13;
        this.expires = date;
        this.totalBytes = j7;
        this.transferredBytes = j13;
        this.contentType = str;
        this.etag = str2;
        this.belongsToGroup = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadResult resourceLoadResult = (ResourceLoadResult) obj;
        return Objects.equals(this.data, resourceLoadResult.data) && Objects.equals(this.status, resourceLoadResult.status) && this.immutable == resourceLoadResult.immutable && this.mustRevalidate == resourceLoadResult.mustRevalidate && Objects.equals(this.expires, resourceLoadResult.expires) && this.totalBytes == resourceLoadResult.totalBytes && this.transferredBytes == resourceLoadResult.transferredBytes && Objects.equals(this.contentType, resourceLoadResult.contentType) && Objects.equals(this.etag, resourceLoadResult.etag) && this.belongsToGroup == resourceLoadResult.belongsToGroup;
    }

    public boolean getBelongsToGroup() {
        return this.belongsToGroup;
    }

    public String getContentType() {
        return this.contentType;
    }

    public ResourceData getData() {
        return this.data;
    }

    public String getEtag() {
        return this.etag;
    }

    public Date getExpires() {
        return this.expires;
    }

    public boolean getImmutable() {
        return this.immutable;
    }

    public boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public ResourceLoadStatus getStatus() {
        return this.status;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public int hashCode() {
        return Objects.hash(this.data, this.status, Boolean.valueOf(this.immutable), Boolean.valueOf(this.mustRevalidate), this.expires, Long.valueOf(this.totalBytes), Long.valueOf(this.transferredBytes), this.contentType, this.etag, Boolean.valueOf(this.belongsToGroup));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[data: ");
        sb4.append(RecordUtils.fieldToString(this.data));
        sb4.append(", status: ");
        sb4.append(RecordUtils.fieldToString(this.status));
        sb4.append(", immutable: ");
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.immutable)));
        sb4.append(", mustRevalidate: ");
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.mustRevalidate)));
        sb4.append(", expires: ");
        sb4.append(RecordUtils.fieldToString(this.expires));
        sb4.append(", totalBytes: ");
        AbstractC3855a.m11836t(this.totalBytes, ", transferredBytes: ", sb4);
        AbstractC3855a.m11836t(this.transferredBytes, ", contentType: ", sb4);
        AbstractC3855a.m11838v(this.contentType, ", etag: ", sb4);
        AbstractC3855a.m11838v(this.etag, ", belongsToGroup: ", sb4);
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.belongsToGroup)));
        sb4.append("]");
        return sb4.toString();
    }
}
