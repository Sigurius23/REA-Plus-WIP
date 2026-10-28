package com.whoop.service.network;

import com.whoop.domain.model.RouteSummaryDto;
import p715kotlin.Metadata;
import pg3.C29218v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;
import xg3.C38280g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/GpsServiceApi;", "", "Lcom/whoop/domain/model/RouteSummaryDto;", "routeSummaryDto", "Lxg3/g;", "Lpg3/v0;", "", "postGpsData", "(Lcom/whoop/domain/model/RouteSummaryDto;)Lxg3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface GpsServiceApi {
    @InterfaceC37284o("gps-service/v1/gps")
    C38280g<C29218v0<Boolean>> postGpsData(@InterfaceC37270a RouteSummaryDto routeSummaryDto);
}
