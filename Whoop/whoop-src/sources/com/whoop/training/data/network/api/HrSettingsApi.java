package com.whoop.training.data.network.api;

import com.whoop.training.data.network.request.hrsettings.CustomHrZonesRequest;
import com.whoop.training.data.network.request.maxhr.MaxHrRequest;
import com.whoop.training.data.network.response.hrsettings.HrSettingsResponse;
import com.whoop.training.data.network.response.hrsettings.HrSettingsZonesResponse;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/training/data/network/api/HrSettingsApi;", "", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;", "fetchHrSettings", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/training/data/network/request/maxhr/MaxHrRequest;", "body", "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;", "updateMaxHr", "(Lcom/whoop/training/data/network/request/maxhr/MaxHrRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;", "postCustomZones", "(Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;Lq83/d;)Ljava/lang/Object;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface HrSettingsApi {
    @InterfaceC37275f("hr-zones-service/v1/bff/settings")
    Object fetchHrSettings(InterfaceC30057d<? super HrSettingsResponse> interfaceC30057d);

    @InterfaceC37284o("hr-zones-service/v1/bff/custom")
    Object postCustomZones(@InterfaceC37270a CustomHrZonesRequest customHrZonesRequest, InterfaceC30057d<? super HrSettingsZonesResponse> interfaceC30057d);

    @InterfaceC37284o("hr-zones-service/v1/maxhr")
    Object updateMaxHr(@InterfaceC37270a MaxHrRequest maxHrRequest, InterfaceC30057d<? super HrSettingsZonesResponse> interfaceC30057d);
}
