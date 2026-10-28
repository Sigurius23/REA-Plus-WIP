package com.whoop.data.onboarding;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/whoop/data/onboarding/FeatureEducationType;", "type", "", "shouldGoToFeatureEducation", "(Lcom/whoop/data/onboarding/FeatureEducationType;)Z", "Ll83/a0;", "retriggerOnboardingFetch", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface OnboardingStatusChecker extends DefaultLifecycleObserver {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onCreate(OnboardingStatusChecker onboardingStatusChecker, InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            OnboardingStatusChecker.super.onCreate(owner);
        }

        @Deprecated
        public static void onDestroy(OnboardingStatusChecker onboardingStatusChecker, InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            OnboardingStatusChecker.super.onDestroy(owner);
        }

        @Deprecated
        public static void onPause(OnboardingStatusChecker onboardingStatusChecker, InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            OnboardingStatusChecker.super.onPause(owner);
        }

        @Deprecated
        public static void onResume(OnboardingStatusChecker onboardingStatusChecker, InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            OnboardingStatusChecker.super.onResume(owner);
        }

        @Deprecated
        public static void onStart(OnboardingStatusChecker onboardingStatusChecker, InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            OnboardingStatusChecker.super.onStart(owner);
        }

        @Deprecated
        public static void onStop(OnboardingStatusChecker onboardingStatusChecker, InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            OnboardingStatusChecker.super.onStop(owner);
        }
    }

    void retriggerOnboardingFetch();

    boolean shouldGoToFeatureEducation(FeatureEducationType type);
}
