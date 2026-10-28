package com.whoop.oauthintegration.api;

import com.whoop.oauthintegration.domain.models.OAuthIntegrationRequest;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/oauthintegration/api/OAuthIntegrationApi;", "", "", "provider", "Lcom/whoop/oauthintegration/domain/models/OAuthIntegrationRequest;", "body", "Lpg3/v0;", "Ll83/a0;", "setConnection", "(Ljava/lang/String;Lcom/whoop/oauthintegration/domain/models/OAuthIntegrationRequest;Lq83/d;)Ljava/lang/Object;", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface OAuthIntegrationApi {
    @InterfaceC37285p("auth-service/v2/oauth/code/{provider}")
    Object setConnection(@InterfaceC37288s("provider") String str, @InterfaceC37270a OAuthIntegrationRequest oAuthIntegrationRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
