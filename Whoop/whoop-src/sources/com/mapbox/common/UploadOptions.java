package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class UploadOptions implements Serializable {
    private final String filePath;
    private HashMap<String, String> headers;
    private final String mediaType;
    private final String metadata;
    private final NetworkRestriction networkRestriction;
    private final SdkInformation sdkInformation;
    private final long timeout;
    private final String url;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public UploadOptions(String str, String str2, HashMap<String, String> map, String str3, String str4, NetworkRestriction networkRestriction, SdkInformation sdkInformation, long j7) {
        this.filePath = str;
        this.url = str2;
        this.headers = map;
        this.metadata = str3;
        this.mediaType = str4;
        this.networkRestriction = networkRestriction;
        this.sdkInformation = sdkInformation;
        this.timeout = j7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadOptions uploadOptions = (UploadOptions) obj;
        return Objects.equals(this.filePath, uploadOptions.filePath) && Objects.equals(this.url, uploadOptions.url) && Objects.equals(this.headers, uploadOptions.headers) && Objects.equals(this.metadata, uploadOptions.metadata) && Objects.equals(this.mediaType, uploadOptions.mediaType) && Objects.equals(this.networkRestriction, uploadOptions.networkRestriction) && Objects.equals(this.sdkInformation, uploadOptions.sdkInformation) && this.timeout == uploadOptions.timeout;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public SdkInformation getSdkInformation() {
        return this.sdkInformation;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.filePath, this.url, this.headers, this.metadata, this.mediaType, this.networkRestriction, this.sdkInformation, Long.valueOf(this.timeout));
    }

    public void setHeaders(HashMap<String, String> map) {
        this.headers = map;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[filePath: ");
        AbstractC3855a.m11838v(this.filePath, ", url: ", sb4);
        AbstractC3855a.m11838v(this.url, ", headers: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.headers));
        sb4.append(", metadata: ");
        AbstractC3855a.m11838v(this.metadata, ", mediaType: ", sb4);
        AbstractC3855a.m11838v(this.mediaType, ", networkRestriction: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.networkRestriction));
        sb4.append(", sdkInformation: ");
        sb4.append(RecordUtils.fieldToString(this.sdkInformation));
        sb4.append(", timeout: ");
        sb4.append(RecordUtils.fieldToString(Long.valueOf(this.timeout)));
        sb4.append("]");
        return sb4.toString();
    }

    public UploadOptions(String str, String str2, HashMap<String, String> map, String str3, String str4, SdkInformation sdkInformation) {
        this.filePath = str;
        this.url = str2;
        this.headers = map;
        this.metadata = str3;
        this.mediaType = str4;
        this.sdkInformation = sdkInformation;
        this.networkRestriction = NetworkRestriction.NONE;
        this.timeout = 0L;
    }
}
