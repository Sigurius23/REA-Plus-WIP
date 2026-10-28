package com.whoop.service.network;

import java.util.List;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/FeatureFlagsApi;", "", "", "flagName", "", "isOnboardingFeatureFlagTurnedOn", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "getFeatureFlags", "(Lq83/d;)Ljava/lang/Object;", "feature-flag_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface FeatureFlagsApi {
    @InterfaceC37275f("feature-flags/flags/user")
    Object getFeatureFlags(InterfaceC30057d<? super List<String>> interfaceC30057d);

    @InterfaceC37275f("feature-flags/flags/onboarding/{flagName}")
    Object isOnboardingFeatureFlagTurnedOn(@InterfaceC37288s("flagName") String str, InterfaceC30057d<? super Boolean> interfaceC30057d);
}
