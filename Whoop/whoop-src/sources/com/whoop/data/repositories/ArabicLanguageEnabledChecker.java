package com.whoop.data.repositories;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;", "", "featureFlagChecker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "isArabicLanguageEnabled", "", "()Z", "isArabicBetaMember", "Companion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ArabicLanguageEnabledChecker {
    private static final String ARABIC_LANGUAGE_ENABLED_ANDROID = "arabic-language-enabled-android";
    private static final Companion Companion = new Companion(null);
    private final FeatureFlagChecker featureFlagChecker;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker$Companion;", "", "<init>", "()V", "ARABIC_LANGUAGE_ENABLED_ANDROID", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ArabicLanguageEnabledChecker(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    public final boolean isArabicBetaMember() {
        return this.featureFlagChecker.isFeatureEnabled(ARABIC_LANGUAGE_ENABLED_ANDROID);
    }

    public final boolean isArabicLanguageEnabled() {
        return this.featureFlagChecker.isFeatureEnabled(ARABIC_LANGUAGE_ENABLED_ANDROID) || this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ONBOARDING_ARABIC_LANGUAGE_ENABLED);
    }
}
