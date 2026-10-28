package com.mapbox.common.experimental.wss_backend;

import com.mapbox.common.HttpRequestError;

/* JADX INFO: loaded from: classes.dex */
public interface RequestObserver {
    void onData(long j7, WsOpCode wsOpCode, boolean z4);

    void onFailed(long j7, HttpRequestError httpRequestError, Integer num);

    void onResponse(long j7, ResponseData responseData);

    void onSucceeded(long j7);

    void onSwitchingProtocols(long j7);
}
