package com.whoop.home.domain;

import com.mapbox.common.HttpHeaders;
import com.whoop.home.domain.dayOneTransition.TransitionOverlayCompleteBody;
import com.whoop.home.domain.models.CalendarResponse;
import com.whoop.home.domain.models.DismissAlertTileRequestBody;
import com.whoop.home.domain.models.DismissTileRequest;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/home/domain/HomeApi;", "", "", "pillarType", "requestDate", "Lcom/whoop/home/domain/models/CalendarResponse;", "getHomeCalendar", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/home/domain/models/DismissTileRequest;", "dismiss", "Lpg3/v0;", "Ll83/a0;", "dismissTile", "(Lcom/whoop/home/domain/models/DismissTileRequest;Lq83/d;)Ljava/lang/Object;", "dismissBehaviorImpactTile", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;", "completeFeatureEducationBody", "completeFeatureEducation", "(Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;Lq83/d;)Ljava/lang/Object;", "id", "markAppNotificationAsExpired", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/home/domain/models/DismissAlertTileRequestBody;", "body", "dismissAlert", "(Lcom/whoop/home/domain/models/DismissAlertTileRequestBody;Lq83/d;)Ljava/lang/Object;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface HomeApi {
    @InterfaceC37285p("onboarding-service/v1/feature-education-state")
    Object completeFeatureEducation(@InterfaceC37270a TransitionOverlayCompleteBody transitionOverlayCompleteBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("user-preferences-service/v1/components/dismissals")
    Object dismissAlert(@InterfaceC37270a DismissAlertTileRequestBody dismissAlertTileRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("impact-service/v1/impact-tags")
    Object dismissBehaviorImpactTile(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("coaching-service/v1/tile-dismissal")
    Object dismissTile(@InterfaceC37270a DismissTileRequest dismissTileRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("home-service/v1/calendar/{pillarType}")
    Object getHomeCalendar(@InterfaceC37288s("pillarType") String str, @InterfaceC37289t(HttpHeaders.DATE) String str2, InterfaceC30057d<? super CalendarResponse> interfaceC30057d);

    @InterfaceC37285p("app-notifications-service/v1/app/notifications/{id}/expire")
    Object markAppNotificationAsExpired(@InterfaceC37288s("id") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
