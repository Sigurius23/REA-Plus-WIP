package com.mapbox.common.module.cronet;

import androidx.fragment.app.RunnableC1319m;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.module.RequestDetail;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/mapbox/common/module/cronet/CronetRequestDetail;", "Lcom/mapbox/common/module/RequestDetail;", "Lorg/chromium/net/UrlRequest;", "request", "Lcom/mapbox/common/module/cronet/UrlCallback;", "callback", "", "timeoutSeconds", "<init>", "(Lorg/chromium/net/UrlRequest;Lcom/mapbox/common/module/cronet/UrlCallback;J)V", "Ll83/a0;", "start", "()V", "Lcom/mapbox/common/HttpRequestError;", "error", "cancel", "(Lcom/mapbox/common/HttpRequestError;)V", "Lorg/chromium/net/UrlRequest;", "Lcom/mapbox/common/module/cronet/UrlCallback;", "J", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CronetRequestDetail implements RequestDetail {
    private final UrlCallback callback;
    private final UrlRequest request;
    private final long timeoutSeconds;

    public CronetRequestDetail(UrlRequest request, UrlCallback callback, long j7) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(callback, "callback");
        this.request = request;
        this.callback = callback;
        this.timeoutSeconds = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(CronetRequestDetail this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        if (this$0.request.isDone()) {
            return;
        }
        this$0.cancel(new HttpRequestError(HttpRequestErrorType.REQUEST_TIMED_OUT, "Request timed out"));
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void cancel(HttpRequestError error) {
        if (error != null) {
            this.callback.setCancelReason(error);
        }
        this.request.cancel();
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void start() {
        if (this.timeoutSeconds > 0) {
            CronetRequestDetailKt.executor.schedule(new RunnableC1319m(this, 15), this.timeoutSeconds, TimeUnit.SECONDS);
        }
        this.request.start();
    }
}
