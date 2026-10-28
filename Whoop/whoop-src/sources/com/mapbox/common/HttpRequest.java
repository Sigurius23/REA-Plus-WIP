package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequest implements Serializable {
    private final byte[] body;
    private final int flags;
    private HashMap<String, String> headers;
    private HttpMethod method;
    private final NetworkRestriction networkRestriction;
    private final SdkInformation sdkInformation;
    private final long timeout;
    private final String url;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private byte[] body;
        private HashMap<String, String> headers;
        private SdkInformation sdkInformation;
        private String url;
        private HttpMethod method = HttpMethod.GET;
        private long timeout = 0;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Builder body(byte[] bArr) {
            this.body = bArr;
            return this;
        }

        public HttpRequest build() {
            if (this.method == null) {
                throw new NullPointerException("method shouldn't be null");
            }
            if (this.url == null) {
                throw new NullPointerException("url shouldn't be null");
            }
            if (this.headers == null) {
                throw new NullPointerException("headers shouldn't be null");
            }
            if (this.networkRestriction == null) {
                throw new NullPointerException("networkRestriction shouldn't be null");
            }
            if (this.sdkInformation != null) {
                return new HttpRequest(this.method, this.url, this.headers, this.timeout, this.networkRestriction, this.sdkInformation, this.body, this.flags);
            }
            throw new NullPointerException("sdkInformation shouldn't be null");
        }

        public Builder flags(int i13) {
            this.flags = i13;
            return this;
        }

        public Builder headers(HashMap<String, String> map) {
            this.headers = map;
            return this;
        }

        public Builder method(HttpMethod httpMethod) {
            this.method = httpMethod;
            return this;
        }

        public Builder networkRestriction(NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
            return this;
        }

        public Builder sdkInformation(SdkInformation sdkInformation) {
            this.sdkInformation = sdkInformation;
            return this;
        }

        public Builder timeout(long j7) {
            this.timeout = j7;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return Objects.equals(this.method, httpRequest.method) && Objects.equals(this.url, httpRequest.url) && Objects.equals(this.headers, httpRequest.headers) && this.timeout == httpRequest.timeout && Objects.equals(this.networkRestriction, httpRequest.networkRestriction) && Objects.equals(this.sdkInformation, httpRequest.sdkInformation) && Objects.equals(this.body, httpRequest.body) && this.flags == httpRequest.flags;
    }

    public byte[] getBody() {
        return this.body;
    }

    public int getFlags() {
        return this.flags;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public HttpMethod getMethod() {
        return this.method;
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
        return Objects.hash(this.method, this.url, this.headers, Long.valueOf(this.timeout), this.networkRestriction, this.sdkInformation, this.body, Integer.valueOf(this.flags));
    }

    public void setHeaders(HashMap<String, String> map) {
        this.headers = map;
    }

    public void setMethod(HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    public Builder toBuilder() {
        return new Builder().method(this.method).url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).sdkInformation(this.sdkInformation).body(this.body).flags(this.flags);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[method: ");
        sb4.append(RecordUtils.fieldToString(this.method));
        sb4.append(", url: ");
        AbstractC3855a.m11838v(this.url, ", headers: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.headers));
        sb4.append(", timeout: ");
        AbstractC3855a.m11836t(this.timeout, ", networkRestriction: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.networkRestriction));
        sb4.append(", sdkInformation: ");
        sb4.append(RecordUtils.fieldToString(this.sdkInformation));
        sb4.append(", body: ");
        sb4.append(RecordUtils.fieldToString(this.body));
        sb4.append(", flags: ");
        sb4.append(RecordUtils.fieldToString(Integer.valueOf(this.flags)));
        sb4.append("]");
        return sb4.toString();
    }

    private HttpRequest(HttpMethod httpMethod, String str, HashMap<String, String> map, long j7, NetworkRestriction networkRestriction, SdkInformation sdkInformation, byte[] bArr, int i13) {
        this.method = httpMethod;
        this.url = str;
        this.headers = map;
        this.timeout = j7;
        this.networkRestriction = networkRestriction;
        this.sdkInformation = sdkInformation;
        this.body = bArr;
        this.flags = i13;
    }

    private HttpRequest(String str, HashMap<String, String> map, SdkInformation sdkInformation, byte[] bArr) {
        this.url = str;
        this.headers = map;
        this.sdkInformation = sdkInformation;
        this.body = bArr;
        this.method = HttpMethod.GET;
        this.timeout = 0L;
        this.networkRestriction = NetworkRestriction.NONE;
        this.flags = 0;
    }
}
