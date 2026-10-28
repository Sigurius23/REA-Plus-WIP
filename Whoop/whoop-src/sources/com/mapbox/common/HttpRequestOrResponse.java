package com.mapbox.common;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequestOrResponse {
    private Type type;
    private Object value;

    /* JADX INFO: loaded from: classes6.dex */
    public enum Type {
        HTTP_REQUEST,
        HTTP_RESPONSE
    }

    public HttpRequestOrResponse(HttpRequest httpRequest) {
        this.type = Type.HTTP_REQUEST;
        this.value = httpRequest;
    }

    public static HttpRequestOrResponse valueOf(HttpRequest httpRequest) {
        return new HttpRequestOrResponse(httpRequest);
    }

    public HttpRequest getHttpRequest() {
        if (isHttpRequest()) {
            return (HttpRequest) this.value;
        }
        throw new IllegalStateException("The content of the variant does not have type (HttpRequest)");
    }

    public HttpResponse getHttpResponse() {
        if (isHttpResponse()) {
            return (HttpResponse) this.value;
        }
        throw new IllegalStateException("The content of the variant does not have type (HttpResponse)");
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isHttpRequest() {
        return this.type == Type.HTTP_REQUEST;
    }

    public boolean isHttpResponse() {
        return this.type == Type.HTTP_RESPONSE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static HttpRequestOrResponse valueOf(HttpResponse httpResponse) {
        return new HttpRequestOrResponse(httpResponse);
    }

    public HttpRequestOrResponse(HttpResponse httpResponse) {
        this.type = Type.HTTP_RESPONSE;
        this.value = httpResponse;
    }
}
