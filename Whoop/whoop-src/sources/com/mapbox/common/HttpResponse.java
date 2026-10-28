package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class HttpResponse implements Serializable {
    private final HttpRequest request;
    private final long requestId;
    private final Expected<HttpRequestError, HttpResponseData> result;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpResponse(long j7, HttpRequest httpRequest, Expected<HttpRequestError, HttpResponseData> expected) {
        this.requestId = j7;
        this.request = httpRequest;
        this.result = expected;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return this.requestId == httpResponse.requestId && Objects.equals(this.request, httpResponse.request) && Objects.equals(this.result, httpResponse.result);
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public Expected<HttpRequestError, HttpResponseData> getResult() {
        return this.result;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.requestId), this.request, this.result);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[requestId: ");
        AbstractC3855a.m11836t(this.requestId, ", request: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.request));
        sb4.append(", result: ");
        sb4.append(RecordUtils.fieldToString(this.result));
        sb4.append("]");
        return sb4.toString();
    }
}
