package com.whoop.healthspan.domain;

import com.mapbox.common.HttpHeaders;
import com.whoop.healthspan.domain.models.HealthspanResponse;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/healthspan/domain/HealthspanApi;", "", "", HttpHeaders.DATE, "Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "getHealthspan", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface HealthspanApi {
    @InterfaceC37275f("healthspan-service/v1/healthspan/bff")
    Object getHealthspan(@InterfaceC37289t(HttpHeaders.DATE) String str, InterfaceC30057d<? super HealthspanResponse> interfaceC30057d);
}
