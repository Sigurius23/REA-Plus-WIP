package com.whoop.data.repositories;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"OVERRIDE_FEATURE_FLAGS", "", "FEATURE_FLAG_PREFS_NAME", "TAG_FEATURES", "TAG_ONBOARDING_FEATURES", "FETCH_DELAY", "", "FETCH_INTERVAL_DEBUG", "FETCH_INTERVAL_RELEASE", "FETCH_INTERVAL_TEST", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FeatureFlagRepositoryImplKt {
    public static final String FEATURE_FLAG_PREFS_NAME = "FeaturePrefs";
    private static final long FETCH_DELAY = 100;
    private static final long FETCH_INTERVAL_DEBUG = 120000;
    private static final long FETCH_INTERVAL_RELEASE = 600000;
    public static final long FETCH_INTERVAL_TEST = 1000;
    public static final String OVERRIDE_FEATURE_FLAGS = "override-feature-flag";
    public static final String TAG_FEATURES = "FeatureSwitches";
    public static final String TAG_ONBOARDING_FEATURES = "OnboardingFeatureSwitches";
}
