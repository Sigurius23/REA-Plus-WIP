package com.whoop.onboarding.overlay.model;

import com.whoop.data.onboarding.FeatureEducationType;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n*$\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u000b"}, m65681d2 = {"FeatureOnboardingResponse", "", "", "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "modelForKey", "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingResponse;", "educationKey", "featureEducationType", "Lcom/whoop/data/onboarding/FeatureEducationType;", "getFeatureEducationType", "(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)Lcom/whoop/data/onboarding/FeatureEducationType;", "onboarding-story_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FeatureOnboardingOverlayModelKt {
    public static final FeatureEducationType getFeatureEducationType(FeatureOnboardingOverlayModel featureOnboardingOverlayModel) {
        AbstractC22676k.m65750j(featureOnboardingOverlayModel, "<this>");
        String featureEducationName = featureOnboardingOverlayModel.getFeatureEducationName();
        for (FeatureEducationType featureEducationType : FeatureEducationType.values()) {
            if (AbstractC22676k.m65745e(featureEducationType.name(), featureEducationName)) {
                return featureEducationType;
            }
        }
        return null;
    }

    public static final FeatureOnboardingOverlayModel modelForKey(Map<String, FeatureOnboardingOverlayModel> map, String educationKey) {
        AbstractC22676k.m65750j(map, "<this>");
        AbstractC22676k.m65750j(educationKey, "educationKey");
        return map.get(educationKey);
    }
}
