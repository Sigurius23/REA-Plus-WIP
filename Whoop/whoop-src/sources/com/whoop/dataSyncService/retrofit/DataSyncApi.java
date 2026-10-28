package com.whoop.dataSyncService.retrofit;

import com.whoop.domain.model.MetricsProcessedTime;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37279j;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/dataSyncService/retrofit/DataSyncApi;", "", "Lpg3/v0;", "Lcom/whoop/domain/model/MetricsProcessedTime;", "getMinHighWaterMark", "(Lq83/d;)Ljava/lang/Object;", "Lud3/v0;", "body", "", "", "headers", "Ll83/a0;", "uploadRawData", "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface DataSyncApi {
    @InterfaceC37275f("metrics-service/v1/consumerstats/mobile/highwatermark/min")
    Object getMinHighWaterMark(InterfaceC30057d<? super C29218v0<MetricsProcessedTime>> interfaceC30057d);

    @InterfaceC37284o("metrics-service/v1/metrics/sensor")
    Object uploadRawData(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37279j Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
