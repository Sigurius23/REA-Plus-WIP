package com.whoop.privacyconsent.api;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0004¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/PrivacyConsentApi;", "", "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;", "getPrivacyConsentSettingsV2", "(Lq83/d;)Ljava/lang/Object;", "", "userId", "Lcom/whoop/privacyconsent/api/SearchableSetting;", "userPrivacySettings", "toggleTeamInvitation", "(ILcom/whoop/privacyconsent/api/SearchableSetting;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/privacyconsent/api/AllowRecommendationRequest;", "request", "updateAllowRecommendationV2", "(Lcom/whoop/privacyconsent/api/AllowRecommendationRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/privacyconsent/api/DataSharingResponse;", "getDataSharing", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface PrivacyConsentApi {
    @InterfaceC37275f("enterprise-service/v1/data-sharing")
    Object getDataSharing(InterfaceC30057d<? super DataSharingResponse> interfaceC30057d);

    @InterfaceC37275f("privacy-service/v1/user_privacy_settings")
    Object getPrivacyConsentSettingsV2(InterfaceC30057d<? super PrivacyConsentSettingsResponse> interfaceC30057d);

    @InterfaceC37285p("users-service/v1/users/{userId}/privacy")
    Object toggleTeamInvitation(@InterfaceC37288s("userId") int i13, @InterfaceC37270a SearchableSetting searchableSetting, InterfaceC30057d<? super PrivacyConsentSettingsResponse> interfaceC30057d);

    @InterfaceC37285p("privacy-service/v1/user_privacy_settings/allow-recommendation")
    Object updateAllowRecommendationV2(@InterfaceC37270a AllowRecommendationRequest allowRecommendationRequest, InterfaceC30057d<? super PrivacyConsentSettingsResponse> interfaceC30057d);
}
