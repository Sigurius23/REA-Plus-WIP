package com.whoop.gps.foreground.network;

import com.whoop.gps.foreground.network.dto.ForegroundGpsRouteSummaryDto;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/gps/foreground/network/ForegroundGpsApi;", "", "Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;", "routeSummary", "Lpg3/v0;", "", "postRouteSummary", "(Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;Lq83/d;)Ljava/lang/Object;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ForegroundGpsApi {
    @InterfaceC37284o("gps-service/v1/gps")
    Object postRouteSummary(@InterfaceC37270a ForegroundGpsRouteSummaryDto foregroundGpsRouteSummaryDto, InterfaceC30057d<? super C29218v0<Boolean>> interfaceC30057d);
}
