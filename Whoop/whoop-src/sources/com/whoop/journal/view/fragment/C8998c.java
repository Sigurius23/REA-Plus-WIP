package com.whoop.journal.view.fragment;

import android.net.Uri;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.navigation.C9598e;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.journal.view.fragment.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/journal/view/fragment/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lj02/o0;Leb/a0;Lcom/whoop/data/onboarding/OnboardingStatusChecker;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/navigation/e;", "action", "Ll83/a0;", "b", "(Lcom/whoop/navigation/e;)V", "Lcom/whoop/journal/view/fragment/a;", "destination", "a", "(Lcom/whoop/journal/view/fragment/a;)V", "Lj02/o0;", "Leb/a0;", "c", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C8998c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final OnboardingStatusChecker onboardingStatusChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C8998c(InterfaceC21159o0 navigator, AbstractC12939a0 navController, OnboardingStatusChecker onboardingStatusChecker, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(onboardingStatusChecker, "onboardingStatusChecker");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.navigator = navigator;
        this.navController = navController;
        this.onboardingStatusChecker = onboardingStatusChecker;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final void m22396a(AbstractC8996a destination) {
        AbstractC22676k.m65750j(destination, "destination");
        if (!destination.equals(AbstractC8996a.a.f26942a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) || this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA) || this.onboardingStatusChecker.shouldGoToFeatureEducation(FeatureEducationType.CUSTOMIZE_JOURNAL)) {
            this.navController.m36410z();
            this.navController.m36402q(Uri.parse("android-app://com.whoop/onboardingStoriesFragmentRedesign/CUSTOMIZE_JOURNAL"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22397b(C9598e action) {
        AbstractC22676k.m65750j(action, "action");
        this.navigator.mo59392a(action);
    }
}
