package com.whoop.data.repositories;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/data/repositories/CastlePairingChecker;", "", "featureFlagChecker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "isPairingFeatureEnabled", "", "()Z", "feature-flag_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CastlePairingChecker {
    private final FeatureFlagChecker featureFlagChecker;

    public CastlePairingChecker(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    public final boolean isPairingFeatureEnabled() {
        return this.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.DROID_CASTLE_DISCOVERY) || this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ONBOARDING_CASTLE_DISCOVERY);
    }
}
