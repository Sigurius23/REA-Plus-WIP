package com.whoop.service.network;

import com.whoop.data.remote.domain.dto.SportDto;
import java.util.List;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/ActivityServiceApi;", "", "", "countryCode", "", "Lcom/whoop/data/remote/domain/dto/SportDto;", "getSports", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "getRestingHeartRate", "(Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ActivityServiceApi {
    @InterfaceC37275f("sleep-service/v1/heart-rate/baseline")
    Object getRestingHeartRate(InterfaceC30057d<? super Float> interfaceC30057d);

    @InterfaceC37275f("activities-service/v1/sports/history")
    Object getSports(@InterfaceC37289t("countryCode") String str, InterfaceC30057d<? super List<SportDto>> interfaceC30057d);
}
