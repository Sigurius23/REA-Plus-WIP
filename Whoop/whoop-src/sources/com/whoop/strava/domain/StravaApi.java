package com.whoop.strava.domain;

import com.whoop.strava.domain.models.StravaAuthorizeRequest;
import com.whoop.strava.domain.models.StravaBffSettingsResponse;
import com.whoop.strava.domain.models.StravaDefaultResponse;
import com.whoop.strava.domain.models.StravaUserSettingsInformationRequest;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0004¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/strava/domain/StravaApi;", "", "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;", "getBffSettings", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;", "userSettingsInformationRequest", "Lcom/whoop/strava/domain/models/StravaDefaultResponse;", "upsertSettings", "(Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;", "authorizeRequest", "authorize", "(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "Ll83/a0;", "deauthorize", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StravaApi {
    @InterfaceC37284o("social-service/v1/strava/bff/authorize")
    Object authorize(@InterfaceC37270a StravaAuthorizeRequest stravaAuthorizeRequest, InterfaceC30057d<? super StravaDefaultResponse> interfaceC30057d);

    @InterfaceC37271b("social-service/v1/strava/bff/deauthorize")
    Object deauthorize(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("social-service/v1/strava/bff/settings")
    Object getBffSettings(InterfaceC30057d<? super StravaBffSettingsResponse> interfaceC30057d);

    @InterfaceC37285p("social-service/v1/strava/bff/settings")
    Object upsertSettings(@InterfaceC37270a StravaUserSettingsInformationRequest stravaUserSettingsInformationRequest, InterfaceC30057d<? super StravaDefaultResponse> interfaceC30057d);
}
