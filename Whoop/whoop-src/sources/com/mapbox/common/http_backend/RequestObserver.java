package com.mapbox.common.http_backend;

import com.mapbox.common.HttpRequestError;

/* JADX INFO: loaded from: classes.dex */
public interface RequestObserver {
    void onData(long j7);

    void onFailed(long j7, HttpRequestError httpRequestError);

    void onResponse(long j7, ResponseData responseData);

    void onSucceeded(long j7);
}
