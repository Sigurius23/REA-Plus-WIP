package com.mapbox.common.experimental.wss_backend;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.NetworkRestriction;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Request implements Serializable {
    private final int flags;
    private HashMap<String, String> headers;
    private final NetworkRestriction networkRestriction;
    private final long timeout;
    private final String url;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder {
        private HashMap<String, String> headers;
        private String url;
        private long timeout = 0;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Request build() {
            if (this.url == null) {
                throw new NullPointerException("url shouldn't be null");
            }
            if (this.headers == null) {
                throw new NullPointerException("headers shouldn't be null");
            }
            if (this.networkRestriction != null) {
                return new Request(this.url, this.headers, this.timeout, this.networkRestriction, this.flags);
            }
            throw new NullPointerException("networkRestriction shouldn't be null");
        }

        public Builder flags(int i13) {
            this.flags = i13;
            return this;
        }

        public Builder headers(HashMap<String, String> map) {
            this.headers = map;
            return this;
        }

        public Builder networkRestriction(NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
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
        Request request = (Request) obj;
        return Objects.equals(this.url, request.url) && Objects.equals(this.headers, request.headers) && this.timeout == request.timeout && Objects.equals(this.networkRestriction, request.networkRestriction) && this.flags == request.flags;
    }

    public int getFlags() {
        return this.flags;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.url, this.headers, Long.valueOf(this.timeout), this.networkRestriction, Integer.valueOf(this.flags));
    }

    public void setHeaders(HashMap<String, String> map) {
        this.headers = map;
    }

    public Builder toBuilder() {
        return new Builder().url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).flags(this.flags);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[url: ");
        AbstractC3855a.m11838v(this.url, ", headers: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.headers));
        sb4.append(", timeout: ");
        AbstractC3855a.m11836t(this.timeout, ", networkRestriction: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.networkRestriction));
        sb4.append(", flags: ");
        sb4.append(RecordUtils.fieldToString(Integer.valueOf(this.flags)));
        sb4.append("]");
        return sb4.toString();
    }

    private Request(String str, HashMap<String, String> map, long j7, NetworkRestriction networkRestriction, int i13) {
        this.url = str;
        this.headers = map;
        this.timeout = j7;
        this.networkRestriction = networkRestriction;
        this.flags = i13;
    }

    private Request(String str, HashMap<String, String> map) {
        this.url = str;
        this.headers = map;
        this.timeout = 0L;
        this.networkRestriction = NetworkRestriction.NONE;
        this.flags = 0;
    }
}
