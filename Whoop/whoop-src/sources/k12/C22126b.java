package k12;

import com.whoop.onboarding.overlay.model.FeatureOnboardingOverlayModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k12.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lk12/b;", "", "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "overlay", "", "lastStepCompleted", "<init>", "(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;I)V", "a", "(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;I)Lk12/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "d", "()Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "b", "I", "c", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22126b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureOnboardingOverlayModel overlay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int lastStepCompleted;

    public C22126b(FeatureOnboardingOverlayModel featureOnboardingOverlayModel, int i13) {
        this.overlay = featureOnboardingOverlayModel;
        this.lastStepCompleted = i13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22126b m63364b(C22126b c22126b, FeatureOnboardingOverlayModel featureOnboardingOverlayModel, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            featureOnboardingOverlayModel = c22126b.overlay;
        }
        if ((i14 & 2) != 0) {
            i13 = c22126b.lastStepCompleted;
        }
        return c22126b.m63365a(featureOnboardingOverlayModel, i13);
    }

    /* JADX INFO: renamed from: a */
    public final C22126b m63365a(FeatureOnboardingOverlayModel overlay, int lastStepCompleted) {
        return new C22126b(overlay, lastStepCompleted);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLastStepCompleted() {
        return this.lastStepCompleted;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FeatureOnboardingOverlayModel getOverlay() {
        return this.overlay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22126b)) {
            return false;
        }
        C22126b c22126b = (C22126b) other;
        return AbstractC22676k.m65745e(this.overlay, c22126b.overlay) && this.lastStepCompleted == c22126b.lastStepCompleted;
    }

    public int hashCode() {
        FeatureOnboardingOverlayModel featureOnboardingOverlayModel = this.overlay;
        return Integer.hashCode(this.lastStepCompleted) + ((featureOnboardingOverlayModel == null ? 0 : featureOnboardingOverlayModel.hashCode()) * 31);
    }

    public String toString() {
        return "OnboardingOverlayDomainResult(overlay=" + this.overlay + ", lastStepCompleted=" + this.lastStepCompleted + ")";
    }

    public /* synthetic */ C22126b(FeatureOnboardingOverlayModel featureOnboardingOverlayModel, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : featureOnboardingOverlayModel, (i14 & 2) != 0 ? -1 : i13);
    }
}
