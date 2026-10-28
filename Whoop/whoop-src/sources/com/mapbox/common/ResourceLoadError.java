package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ResourceLoadError implements Serializable {
    private final String message;
    private final long transferredBytes;
    private final ResourceLoadErrorType type;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadError(ResourceLoadErrorType resourceLoadErrorType, String str, long j7) {
        this.type = resourceLoadErrorType;
        this.message = str;
        this.transferredBytes = j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadError resourceLoadError = (ResourceLoadError) obj;
        return Objects.equals(this.type, resourceLoadError.type) && Objects.equals(this.message, resourceLoadError.message) && this.transferredBytes == resourceLoadError.transferredBytes;
    }

    public String getMessage() {
        return this.message;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public ResourceLoadErrorType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message, Long.valueOf(this.transferredBytes));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[type: ");
        sb4.append(RecordUtils.fieldToString(this.type));
        sb4.append(", message: ");
        AbstractC3855a.m11838v(this.message, ", transferredBytes: ", sb4);
        sb4.append(RecordUtils.fieldToString(Long.valueOf(this.transferredBytes)));
        sb4.append("]");
        return sb4.toString();
    }
}
