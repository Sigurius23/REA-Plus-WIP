package com.whoop.data.onboarding;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/data/onboarding/OnboardingStatus;", "", "type", "Lcom/whoop/data/onboarding/FeatureEducationType;", "isCompleted", "", "<init>", "(Lcom/whoop/data/onboarding/FeatureEducationType;Z)V", "getType", "()Lcom/whoop/data/onboarding/FeatureEducationType;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class OnboardingStatus {
    private final boolean isCompleted;
    private final FeatureEducationType type;

    public OnboardingStatus(FeatureEducationType type, boolean z4) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.isCompleted = z4;
    }

    public static /* synthetic */ OnboardingStatus copy$default(OnboardingStatus onboardingStatus, FeatureEducationType featureEducationType, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            featureEducationType = onboardingStatus.type;
        }
        if ((i13 & 2) != 0) {
            z4 = onboardingStatus.isCompleted;
        }
        return onboardingStatus.copy(featureEducationType, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FeatureEducationType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    public final OnboardingStatus copy(FeatureEducationType type, boolean isCompleted) {
        AbstractC22676k.m65750j(type, "type");
        return new OnboardingStatus(type, isCompleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingStatus)) {
            return false;
        }
        OnboardingStatus onboardingStatus = (OnboardingStatus) other;
        return this.type == onboardingStatus.type && this.isCompleted == onboardingStatus.isCompleted;
    }

    public final FeatureEducationType getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCompleted) + (this.type.hashCode() * 31);
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        return "OnboardingStatus(type=" + this.type + ", isCompleted=" + this.isCompleted + ")";
    }
}
