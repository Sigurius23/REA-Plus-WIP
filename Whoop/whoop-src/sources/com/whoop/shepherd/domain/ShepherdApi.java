package com.whoop.shepherd.domain;

import com.whoop.shepherd.feature.about.domain.models.ShepherdAboutResponse;
import com.whoop.shepherd.feature.detail.domain.models.ShepherdHistoryDetailResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdNotificationHistoryResponse;
import com.whoop.shepherd.feature.notificationhistory.domain.models.ShepherdPaginatedHistoryResponse;
import com.whoop.shepherd.feature.registration.domain.models.ShepherdRegistrationResponse;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseRequest;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseResponse;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdSettingsUpdateRequest;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsResponse;
import com.whoop.shepherd.feature.togglesettings.domain.models.ShepherdToggleSettingsUpdateRequest;
import com.whoop.shepherd.feature.welcome.domain.models.ShepherdWelcomeScreenResponse;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u0004J\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0004J\u001a\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u0004J \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0001\u0010\u0006\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0011\u001a\u00020\u000bH§@¢\u0006\u0004\b!\u0010\u000fJ\u0010\u0010#\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010\u0004J\u0010\u0010%\u001a\u00020$H§@¢\u0006\u0004\b%\u0010\u0004¨\u0006&À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/shepherd/domain/ShepherdApi;", "", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;", "getShepherdToggleSettings", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;", "body", "updateShepherdToggleSettings", "(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;", "getShepherdNotificationHistory", "", "nextToken", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;", "getShepherdHistory", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "clearAllHistory", "historyDate", "clearHistoryByDate", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;", "getTermsOfUseScreen", "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;", "updateShepherdSettings", "(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;", "updateShepherdSettingsLegacy", "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;", "getWelcomeScreen", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;", "Lpg3/v0;", "Ll83/a0;", "saveTermsOfUse", "(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;", "getShepherdHistoryDetail", "Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;", "getShepherdRegistrationScreen", "Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;", "getShepherdAboutScreen", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ShepherdApi {
    @InterfaceC37271b("arrhythmia-service/v2/afibhistory/all")
    Object clearAllHistory(InterfaceC30057d<? super ShepherdNotificationHistoryResponse> interfaceC30057d);

    @InterfaceC37271b("arrhythmia-service/v2/afibhistory/date")
    Object clearHistoryByDate(@InterfaceC37289t("historyDate") String str, InterfaceC30057d<? super ShepherdNotificationHistoryResponse> interfaceC30057d);

    @InterfaceC37275f("arrhythmia-service/v1/about")
    Object getShepherdAboutScreen(InterfaceC30057d<? super ShepherdAboutResponse> interfaceC30057d);

    @InterfaceC37275f("arrhythmia-service/v2/afibhistory/paginated")
    Object getShepherdHistory(@InterfaceC37289t("next_token") String str, InterfaceC30057d<? super ShepherdPaginatedHistoryResponse> interfaceC30057d);

    @InterfaceC37275f("arrhythmia-service/v1/history/bff")
    Object getShepherdHistoryDetail(@InterfaceC37289t("historyDate") String str, InterfaceC30057d<? super ShepherdHistoryDetailResponse> interfaceC30057d);

    @InterfaceC37275f("arrhythmia-service/v2/afibhistory/screen")
    Object getShepherdNotificationHistory(InterfaceC30057d<? super ShepherdNotificationHistoryResponse> interfaceC30057d);

    @InterfaceC37275f("arrhythmia-service/v1/regulatory")
    Object getShepherdRegistrationScreen(InterfaceC30057d<? super ShepherdRegistrationResponse> interfaceC30057d);

    @InterfaceC37275f("arrhythmia-service/v2/settings")
    Object getShepherdToggleSettings(InterfaceC30057d<? super ShepherdToggleSettingsResponse> interfaceC30057d);

    @InterfaceC37275f("arrhythmia-service/v2/termsofuse")
    Object getTermsOfUseScreen(InterfaceC30057d<? super ShepherdTermsOfUseResponse> interfaceC30057d);

    @InterfaceC37275f("arrhythmia-service/v1/welcome/bff")
    Object getWelcomeScreen(InterfaceC30057d<? super ShepherdWelcomeScreenResponse> interfaceC30057d);

    @InterfaceC37285p("arrhythmia-service/v1/termsofuse")
    Object saveTermsOfUse(@InterfaceC37270a ShepherdTermsOfUseRequest shepherdTermsOfUseRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("arrhythmia-service/v2/settings")
    Object updateShepherdSettings(@InterfaceC37270a ShepherdSettingsUpdateRequest shepherdSettingsUpdateRequest, InterfaceC30057d<? super ShepherdToggleSettingsResponse> interfaceC30057d);

    @InterfaceC37285p("arrhythmia-service/v2/settings")
    Object updateShepherdSettingsLegacy(@InterfaceC37270a ShepherdSettingsUpdateRequest shepherdSettingsUpdateRequest, InterfaceC30057d<? super ShepherdNotificationHistoryResponse> interfaceC30057d);

    @InterfaceC37285p("arrhythmia-service/v2/settings")
    Object updateShepherdToggleSettings(@InterfaceC37270a ShepherdToggleSettingsUpdateRequest shepherdToggleSettingsUpdateRequest, InterfaceC30057d<? super ShepherdToggleSettingsResponse> interfaceC30057d);
}
