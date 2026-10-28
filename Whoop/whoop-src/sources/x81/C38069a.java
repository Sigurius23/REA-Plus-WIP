package x81;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import ec3.InterfaceC13087t1;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lx81/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "", "enabledFeatures", "<init>", "(Ljava/util/Set;)V", "featureName", "", "isFeatureEnabled", "(Ljava/lang/String;)Z", "Lcom/whoop/data/repositories/OnboardingFeatureFlag;", "featureFlag", "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z", "a", "Ljava/util/Set;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38069a implements FeatureFlagChecker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<String> enabledFeatures;

    public C38069a(Set<String> enabledFeatures) {
        AbstractC22676k.m65750j(enabledFeatures, "enabledFeatures");
        this.enabledFeatures = enabledFeatures;
    }

    @Override // com.whoop.data.repositories.FeatureFlagChecker
    public /* bridge */ InterfaceC13087t1 getFeatureFlagsFlow() {
        return super.getFeatureFlagsFlow();
    }

    @Override // com.whoop.data.repositories.FeatureFlagChecker
    public boolean isFeatureEnabled(String featureName) {
        AbstractC22676k.m65750j(featureName, "featureName");
        return this.enabledFeatures.contains(featureName);
    }

    @Override // com.whoop.data.repositories.FeatureFlagChecker
    public boolean isFeatureEnabled(OnboardingFeatureFlag featureFlag) {
        AbstractC22676k.m65750j(featureFlag, "featureFlag");
        return this.enabledFeatures.contains(featureFlag.getFlagName());
    }
}
