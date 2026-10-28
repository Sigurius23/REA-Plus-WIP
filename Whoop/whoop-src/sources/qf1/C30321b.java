package qf1;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import ec3.InterfaceC13087t1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qf1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lqf1/b;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "<init>", "()V", "", "featureName", "", "isFeatureEnabled", "(Ljava/lang/String;)Z", "Lcom/whoop/data/repositories/OnboardingFeatureFlag;", "featureFlag", "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z", "feature-flag-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C30321b implements FeatureFlagChecker {

    /* JADX INFO: renamed from: a */
    public static final C30321b f124399a = new C30321b();

    private C30321b() {
    }

    @Override // com.whoop.data.repositories.FeatureFlagChecker
    public /* bridge */ InterfaceC13087t1 getFeatureFlagsFlow() {
        return super.getFeatureFlagsFlow();
    }

    @Override // com.whoop.data.repositories.FeatureFlagChecker
    public boolean isFeatureEnabled(OnboardingFeatureFlag featureFlag) {
        AbstractC22676k.m65750j(featureFlag, "featureFlag");
        return false;
    }

    @Override // com.whoop.data.repositories.FeatureFlagChecker
    public boolean isFeatureEnabled(String featureName) {
        AbstractC22676k.m65750j(featureName, "featureName");
        return false;
    }
}
