package com.mapbox.common.module;

import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import java.util.concurrent.ExecutorService;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JG\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u001a\u0010\f\u001a\u0016\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/mapbox/common/module/HttpClientDetail;", "", "Lcom/mapbox/common/http_backend/Request;", "request", "", "Lcom/mapbox/common/module/RequestId;", "id", "Lcom/mapbox/common/http_backend/RequestObserver;", "requestObserver", "Lkotlin/Function1;", "Ll83/a0;", "Lcom/mapbox/common/module/RequestFinishedCallback;", "onRequestFinished", "Lcom/mapbox/common/module/RequestDetail;", "buildRequest", "(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/RequestDetail;", "Ljava/util/concurrent/ExecutorService;", "executor", "()Ljava/util/concurrent/ExecutorService;", "", "max", "setMaxRequestsPerHost", "(B)V", "", "supportsKeepCompression", "()Z", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public interface HttpClientDetail {
    RequestDetail buildRequest(Request request, long id4, RequestObserver requestObserver, Function1 onRequestFinished);

    ExecutorService executor();

    void setMaxRequestsPerHost(byte max);

    boolean supportsKeepCompression();
}
