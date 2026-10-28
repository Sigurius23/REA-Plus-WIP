package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ResponseInfo implements Serializable {
    private final ResourceRequestError error;
    private final String etag;
    private final Date expires;
    private final Date modified;
    private final boolean mustRevalidate;
    private final boolean noContent;
    private final boolean notModified;
    private final long size;
    private final ResponseSourceType source;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ResponseInfo(boolean z4, boolean z13, boolean z14, ResponseSourceType responseSourceType, long j7, Date date, Date date2, String str, ResourceRequestError resourceRequestError) {
        this.noContent = z4;
        this.notModified = z13;
        this.mustRevalidate = z14;
        this.source = responseSourceType;
        this.size = j7;
        this.modified = date;
        this.expires = date2;
        this.etag = str;
        this.error = resourceRequestError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResponseInfo.class != obj.getClass()) {
            return false;
        }
        ResponseInfo responseInfo = (ResponseInfo) obj;
        return this.noContent == responseInfo.noContent && this.notModified == responseInfo.notModified && this.mustRevalidate == responseInfo.mustRevalidate && Objects.equals(this.source, responseInfo.source) && this.size == responseInfo.size && Objects.equals(this.modified, responseInfo.modified) && Objects.equals(this.expires, responseInfo.expires) && Objects.equals(this.etag, responseInfo.etag) && Objects.equals(this.error, responseInfo.error);
    }

    public ResourceRequestError getError() {
        return this.error;
    }

    public String getEtag() {
        return this.etag;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Date getModified() {
        return this.modified;
    }

    public boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public boolean getNoContent() {
        return this.noContent;
    }

    public boolean getNotModified() {
        return this.notModified;
    }

    public long getSize() {
        return this.size;
    }

    public ResponseSourceType getSource() {
        return this.source;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.noContent), Boolean.valueOf(this.notModified), Boolean.valueOf(this.mustRevalidate), this.source, Long.valueOf(this.size), this.modified, this.expires, this.etag, this.error);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[noContent: ");
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.noContent)));
        sb4.append(", notModified: ");
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.notModified)));
        sb4.append(", mustRevalidate: ");
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.mustRevalidate)));
        sb4.append(", source: ");
        sb4.append(RecordUtils.fieldToString(this.source));
        sb4.append(", size: ");
        AbstractC3855a.m11836t(this.size, ", modified: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.modified));
        sb4.append(", expires: ");
        sb4.append(RecordUtils.fieldToString(this.expires));
        sb4.append(", etag: ");
        AbstractC3855a.m11838v(this.etag, ", error: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.error));
        sb4.append("]");
        return sb4.toString();
    }
}
