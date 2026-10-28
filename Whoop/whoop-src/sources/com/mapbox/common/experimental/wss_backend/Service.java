package com.mapbox.common.experimental.wss_backend;

import com.mapbox.common.ResultCallback;

/* JADX INFO: loaded from: classes.dex */
public interface Service {
    void cancelConnection(long j7, ResultCallback resultCallback);

    long connect(Request request, RequestObserver requestObserver);

    void setPingTimeout(long j7);

    void write(long j7, Data data);
}
