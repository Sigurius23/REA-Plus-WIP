package com.mapbox.common.module.cronet;

import com.mapbox.common.NetworkUsageMetricsMeter;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/mapbox/common/module/cronet/CronetRequestFinishedListener;", "Lorg/chromium/net/RequestFinishedInfo$Listener;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lorg/chromium/net/RequestFinishedInfo;", "requestInfo", "Ll83/a0;", "onRequestFinished", "(Lorg/chromium/net/RequestFinishedInfo;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class CronetRequestFinishedListener extends RequestFinishedInfo.Listener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetRequestFinishedListener(Executor executor) {
        super(executor);
        AbstractC22676k.m65750j(executor, "executor");
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public void onRequestFinished(RequestFinishedInfo requestInfo) {
        AbstractC22676k.m65747g(requestInfo);
        RequestFinishedInfo.Metrics metrics = requestInfo.getMetrics();
        String url = requestInfo.getUrl();
        AbstractC22676k.m65747g(url);
        Long sentByteCount = metrics.getSentByteCount();
        AbstractC22676k.m65747g(sentByteCount);
        int iLongValue = (int) sentByteCount.longValue();
        Long receivedByteCount = metrics.getReceivedByteCount();
        AbstractC22676k.m65747g(receivedByteCount);
        NetworkUsageMetricsMeter.onBytesTransferred(url, iLongValue, (int) receivedByteCount.longValue());
    }
}
