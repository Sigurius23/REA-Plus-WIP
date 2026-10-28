package com.whoop.data.repositories;

import ec3.AbstractC13091v;
import ec3.InterfaceC13087t1;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "", "featureName", "", "isFeatureEnabled", "(Ljava/lang/String;)Z", "Lcom/whoop/data/repositories/OnboardingFeatureFlag;", "featureFlag", "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z", "Lec3/t1;", "", "getFeatureFlagsFlow", "()Lec3/t1;", "featureFlagsFlow", "feature-flag_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface FeatureFlagChecker {

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static InterfaceC13087t1 getFeatureFlagsFlow(FeatureFlagChecker featureFlagChecker) {
            return FeatureFlagChecker.super.getFeatureFlagsFlow();
        }
    }

    default InterfaceC13087t1 getFeatureFlagsFlow() {
        return AbstractC13091v.m36592b(0, 0, null, 7);
    }

    boolean isFeatureEnabled(OnboardingFeatureFlag featureFlag);

    boolean isFeatureEnabled(String featureName);
}
