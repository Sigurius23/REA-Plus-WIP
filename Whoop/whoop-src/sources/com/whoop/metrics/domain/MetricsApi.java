package com.whoop.metrics.domain;

import com.whoop.metrics.domain.models.MetricsBody;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/metrics/domain/MetricsApi;", "", "", "sharedSecret", "metricPostType", "Lcom/whoop/metrics/domain/models/MetricsBody;", "metricsBody", "Lpg3/v0;", "Ll83/a0;", "postMetrics", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/metrics/domain/models/MetricsBody;Lq83/d;)Ljava/lang/Object;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface MetricsApi {
    @InterfaceC37284o("mobile-metric-service/v1/statsd/{metricPostType}")
    Object postMetrics(@InterfaceC37278i("Metric-Header-Key") String str, @InterfaceC37288s("metricPostType") String str2, @InterfaceC37270a MetricsBody metricsBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
