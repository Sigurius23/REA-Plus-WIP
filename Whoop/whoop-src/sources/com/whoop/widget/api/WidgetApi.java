package com.whoop.widget.api;

import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import com.whoop.data.remote.domain.dto.community.share.TeamResponseDto;
import com.whoop.data.remote.domain.dto.community.share.WidgetResponseDto;
import com.whoop.service.network.model.UserState;
import com.whoop.widget.model.HealthspanWidgetModel;
import com.whoop.widget.model.WidgetModel;
import com.whoop.widget.model.WidgetSingle;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u0016¨\u0006\u001aÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/widget/api/WidgetApi;", "", "", "collectionName", HttpHeaders.DATE, "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;", "getUserWidgetsForCollection", "(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;", "getSelectTeams", "(IILq83/d;)Ljava/lang/Object;", UserState.States.SLEEP, "strain", "recovery", "Lcom/whoop/widget/model/WidgetModel;", "getAppWidgetsInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/widget/model/WidgetSingle;", "getRecoveryPercent", "(Lq83/d;)Ljava/lang/Object;", "getStepsCount", "Lcom/whoop/widget/model/HealthspanWidgetModel;", "getHealthspanWidgetInfo", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface WidgetApi {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m28919a(WidgetApi widgetApi, String str, String str2, String str3, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppWidgetsInfo");
        }
        if ((i13 & 1) != 0) {
            str = "SLEEP";
        }
        if ((i13 & 2) != 0) {
            str2 = "STRAIN";
        }
        if ((i13 & 4) != 0) {
            str3 = "RECOVERY";
        }
        return widgetApi.getAppWidgetsInfo(str, str2, str3, interfaceC30057d);
    }

    @InterfaceC37275f("widget-service/v1/statistics/composite")
    Object getAppWidgetsInfo(@InterfaceC37289t("statistics") String str, @InterfaceC37289t("statistics") String str2, @InterfaceC37289t("statistics") String str3, InterfaceC30057d<? super WidgetModel> interfaceC30057d);

    @InterfaceC37275f("healthspan-service/v1/widget")
    Object getHealthspanWidgetInfo(InterfaceC30057d<? super HealthspanWidgetModel> interfaceC30057d);

    @InterfaceC37275f("widget-service/v1/statistics/RECOVERY")
    Object getRecoveryPercent(InterfaceC30057d<? super WidgetSingle> interfaceC30057d);

    @InterfaceC37275f("community-service/v1/chat/memberships")
    Object getSelectTeams(@InterfaceC37289t(MapboxMap.QFE_OFFSET) int i13, @InterfaceC37289t(MapboxMap.QFE_LIMIT) int i14, InterfaceC30057d<? super TeamResponseDto> interfaceC30057d);

    @InterfaceC37275f("widget-service/v1/statistics/rocky")
    Object getStepsCount(InterfaceC30057d<? super WidgetSingle> interfaceC30057d);

    @InterfaceC37275f("social-service/v1/share/widgets")
    Object getUserWidgetsForCollection(@InterfaceC37289t("collection") String str, @InterfaceC37289t(HttpHeaders.DATE) String str2, @InterfaceC37289t(MapboxMap.QFE_OFFSET) int i13, @InterfaceC37289t(MapboxMap.QFE_LIMIT) int i14, InterfaceC30057d<? super WidgetResponseDto> interfaceC30057d);
}
