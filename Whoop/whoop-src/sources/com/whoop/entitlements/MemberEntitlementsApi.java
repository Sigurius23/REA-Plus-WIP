package com.whoop.entitlements;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/entitlements/MemberEntitlementsApi;", "", "Lcom/whoop/entitlements/EntitlementsResponse;", "getEntitlements", "(Lq83/d;)Ljava/lang/Object;", "putOnboardingEntitlements", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface MemberEntitlementsApi {
    @InterfaceC37275f("entitlement-service/v1/entitlements")
    Object getEntitlements(InterfaceC30057d<? super EntitlementsResponse> interfaceC30057d);

    @InterfaceC37285p("entitlement-service/v1/entitlements/onboarding")
    Object putOnboardingEntitlements(InterfaceC30057d<? super EntitlementsResponse> interfaceC30057d);
}
