package com.whoop.strapauth.client;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/strapauth/client/StrapUnlockApi;", "", "", "strapId", "Lcom/whoop/strapauth/client/StrapUnlockRequest;", "body", "Lcom/whoop/strapauth/client/StrapUnlockResponse;", "getUnlockToken", "(Ljava/lang/String;Lcom/whoop/strapauth/client/StrapUnlockRequest;Lq83/d;)Ljava/lang/Object;", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StrapUnlockApi {
    @InterfaceC37284o("firmware-service/v4/strap/unlock-token")
    Object getUnlockToken(@InterfaceC37278i("X-WHOOP-Strap-Id") String str, @InterfaceC37270a StrapUnlockRequest strapUnlockRequest, InterfaceC30057d<? super StrapUnlockResponse> interfaceC30057d);
}
