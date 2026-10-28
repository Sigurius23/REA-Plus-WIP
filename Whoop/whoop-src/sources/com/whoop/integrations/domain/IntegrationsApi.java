package com.whoop.integrations.domain;

import com.whoop.integrations.domain.models.IntegrationsDetailsComponentsModel;
import com.whoop.integrations.domain.models.IntegrationsDisclaimerModel;
import com.whoop.integrations.domain.models.IntegrationsDiscoveryComponentsModel;
import com.whoop.integrations.domain.models.IntegrationsPrivacyControlsRequest;
import com.whoop.integrations.domain.models.p061v2.IntegrationsDetailsV2ComponentsModel;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\r\u0010\tJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0010\u0010\tJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0011\u0010\tJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0004J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/integrations/domain/IntegrationsApi;", "", "Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;", "fetchIntegrationsDiscoveryScreenComponents", "(Lq83/d;)Ljava/lang/Object;", "", "integrationId", "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;", "fetchIntegrationDetailScreenComponents", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;", "fetchIntegrationDetailScreenV2Components", "Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;", "fetchIntegrationDisclaimerScreenComponents", "Lpg3/v0;", "Ll83/a0;", "disconnectIntegration", "disconnect3P", "triggerHealthexSync", "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;", "body", "updatePrivacyControls", "(Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;Lq83/d;)Ljava/lang/Object;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface IntegrationsApi {
    @InterfaceC37271b("integrations-bff/v1/integrations/3p/{integrationId}")
    Object disconnect3P(@InterfaceC37288s("integrationId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("integrations-bff/v1/integrations/{integrationId}")
    Object disconnectIntegration(@InterfaceC37288s("integrationId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("integrations-bff/v1/integrations/{integrationId}/details")
    Object fetchIntegrationDetailScreenComponents(@InterfaceC37288s("integrationId") String str, InterfaceC30057d<? super IntegrationsDetailsComponentsModel> interfaceC30057d);

    @InterfaceC37275f("integrations-bff/v2/integrations/{integrationId}/details")
    Object fetchIntegrationDetailScreenV2Components(@InterfaceC37288s("integrationId") String str, InterfaceC30057d<? super IntegrationsDetailsV2ComponentsModel> interfaceC30057d);

    @InterfaceC37275f("integrations-bff/v1/integrations/{integrationId}/medical-disclaimer")
    Object fetchIntegrationDisclaimerScreenComponents(@InterfaceC37288s("integrationId") String str, InterfaceC30057d<? super IntegrationsDisclaimerModel> interfaceC30057d);

    @InterfaceC37275f("integrations-bff/v1/integrations/discovery")
    Object fetchIntegrationsDiscoveryScreenComponents(InterfaceC30057d<? super IntegrationsDiscoveryComponentsModel> interfaceC30057d);

    @InterfaceC37284o("integrations-bff/v1/integrations/healthex/sync/trigger")
    Object triggerHealthexSync(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("integrations-bff/v1/integrations/{integrationId}/user/settings")
    Object updatePrivacyControls(@InterfaceC37288s("integrationId") String str, @InterfaceC37270a IntegrationsPrivacyControlsRequest integrationsPrivacyControlsRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
