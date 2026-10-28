package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class DownloadOptions implements Serializable {
    private final String localPath;
    private final int memoryThreshold;
    private HttpRequest request;
    private boolean resume;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public DownloadOptions(HttpRequest httpRequest, String str, boolean z4, int i13) {
        this.request = httpRequest;
        this.localPath = str;
        this.resume = z4;
        this.memoryThreshold = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadOptions downloadOptions = (DownloadOptions) obj;
        return Objects.equals(this.request, downloadOptions.request) && Objects.equals(this.localPath, downloadOptions.localPath) && this.resume == downloadOptions.resume && this.memoryThreshold == downloadOptions.memoryThreshold;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public int getMemoryThreshold() {
        return this.memoryThreshold;
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public boolean getResume() {
        return this.resume;
    }

    public int hashCode() {
        return Objects.hash(this.request, this.localPath, Boolean.valueOf(this.resume), Integer.valueOf(this.memoryThreshold));
    }

    public void setRequest(HttpRequest httpRequest) {
        this.request = httpRequest;
    }

    public void setResume(boolean z4) {
        this.resume = z4;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[request: ");
        sb4.append(RecordUtils.fieldToString(this.request));
        sb4.append(", localPath: ");
        AbstractC3855a.m11838v(this.localPath, ", resume: ", sb4);
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.resume)));
        sb4.append(", memoryThreshold: ");
        sb4.append(RecordUtils.fieldToString(Integer.valueOf(this.memoryThreshold)));
        sb4.append("]");
        return sb4.toString();
    }

    public DownloadOptions(HttpRequest httpRequest, String str) {
        this.request = httpRequest;
        this.localPath = str;
        this.resume = false;
        this.memoryThreshold = 0;
    }
}
