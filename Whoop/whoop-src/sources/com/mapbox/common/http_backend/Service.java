package com.mapbox.common.http_backend;

import com.mapbox.common.ResultCallback;

/* JADX INFO: loaded from: classes.dex */
public interface Service {
    void cancelRequest(long j7, ResultCallback resultCallback);

    long request(Request request, RequestObserver requestObserver);

    void setMaxRequestsPerHost(byte b);

    boolean supportsKeepCompression();
}
