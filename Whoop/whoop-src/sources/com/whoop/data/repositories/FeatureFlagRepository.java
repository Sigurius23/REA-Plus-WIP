package com.whoop.data.repositories;

import ec3.InterfaceC13087t1;
import java.util.Set;
import od1.InterfaceC27837a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\u0004J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\r\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH'¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/repositories/FeatureFlagRepository;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "resetFeatureFlagsToNormalFromDebugSettings", "(Lq83/d;)Ljava/lang/Object;", "", "", "flags", "Ll83/a0;", "addValueToStreams", "(Ljava/util/Set;)V", "loadFeatureFlags", "featureFlagName", "isOnboardingFeatureFlagTurnedOn", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/repositories/OnboardingFeatureFlag;", "featureFlag", "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;", "isOnboardingFeatureFlagTurnedOnV2", "Lod1/a0;", "userSessionManager", "subscribeToUserChangeEvents", "(Lod1/a0;)V", "cancelFeatureFlagPeriodicFetch", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface FeatureFlagRepository extends FeatureFlagChecker {

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static InterfaceC13087t1 getFeatureFlagsFlow(FeatureFlagRepository featureFlagRepository) {
            return FeatureFlagRepository.super.getFeatureFlagsFlow();
        }
    }

    void addValueToStreams(Set<String> flags);

    void cancelFeatureFlagPeriodicFetch();

    Object isOnboardingFeatureFlagTurnedOn(OnboardingFeatureFlag onboardingFeatureFlag, InterfaceC30057d<? super Boolean> interfaceC30057d);

    Object isOnboardingFeatureFlagTurnedOn(String str, InterfaceC30057d<? super Boolean> interfaceC30057d);

    Object isOnboardingFeatureFlagTurnedOnV2(OnboardingFeatureFlag onboardingFeatureFlag, InterfaceC30057d<? super Boolean> interfaceC30057d);

    Object isOnboardingFeatureFlagTurnedOnV2(String str, InterfaceC30057d<? super Boolean> interfaceC30057d);

    Object loadFeatureFlags(InterfaceC30057d<? super Boolean> interfaceC30057d);

    Object resetFeatureFlagsToNormalFromDebugSettings(InterfaceC30057d<? super Boolean> interfaceC30057d);

    void subscribeToUserChangeEvents(InterfaceC27837a0 userSessionManager);
}
