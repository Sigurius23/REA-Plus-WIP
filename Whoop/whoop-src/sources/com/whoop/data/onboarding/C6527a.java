package com.whoop.data.onboarding;

import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.data.onboarding.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C6527a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25418w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ OnboardingStatusDao_Impl f25419x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ FeatureEducationType f25420y;

    public /* synthetic */ C6527a(OnboardingStatusDao_Impl onboardingStatusDao_Impl, FeatureEducationType featureEducationType, int i13) {
        this.f25418w = i13;
        this.f25419x = onboardingStatusDao_Impl;
        this.f25420y = featureEducationType;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25418w) {
            case 0:
                return this.f25419x.lambda$isCompletedFlow$3(this.f25420y, (InterfaceC33687a) obj);
            default:
                return this.f25419x.lambda$isCompleted$2(this.f25420y, (InterfaceC33687a) obj);
        }
    }
}
