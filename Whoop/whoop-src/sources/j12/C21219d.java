package j12;

import com.whoop.onboarding.overlay.model.FeatureOnboardingOverlayModel;
import com.whoop.onboarding.overlay.model.OnboardingStep;
import com.whoop.onboarding.overlay.p065ui.OnboardingOverlayStyle;
import k12.C22126b;
import m12.C24937e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: j12.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lj12/d;", "", "<init>", "()V", "Lk12/b;", "domainResult", "Lm12/e;", "a", "(Lk12/b;)Lm12/e;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21219d {
    /* JADX INFO: renamed from: a */
    public final C24937e m59539a(C22126b domainResult) {
        OnboardingOverlayStyle onboardingOverlayStyle;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        FeatureOnboardingOverlayModel overlay = domainResult.getOverlay();
        if (overlay == null) {
            return new C24937e(false, null, null, null, null, null, null, null, false, 510, null);
        }
        int lastStepCompleted = domainResult.getLastStepCompleted() + 1;
        OnboardingStep onboardingStep = overlay.getSteps().get(lastStepCompleted);
        String overlayStyle = onboardingStep.getOverlayStyle();
        OnboardingOverlayStyle onboardingOverlayStyle2 = OnboardingOverlayStyle.TOP;
        OnboardingOverlayStyle[] onboardingOverlayStyleArrValues = OnboardingOverlayStyle.values();
        int length = onboardingOverlayStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                onboardingOverlayStyle = null;
                break;
            }
            onboardingOverlayStyle = onboardingOverlayStyleArrValues[i13];
            if (AbstractC22676k.m65745e(onboardingOverlayStyle.name(), overlayStyle)) {
                break;
            }
            i13++;
        }
        return new C24937e(true, null, onboardingStep.getHeader(), onboardingStep.getBody(), onboardingStep.getButtonText(), onboardingStep.getSecondaryButtonText(), onboardingStep.getImageUrl(), onboardingOverlayStyle == null ? onboardingOverlayStyle2 : onboardingOverlayStyle, lastStepCompleted == AbstractC37056f.m118951C(overlay.getSteps()), 2, null);
    }
}
