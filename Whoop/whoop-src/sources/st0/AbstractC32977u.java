package st0;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: st0.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "a", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32977u {
    /* JADX INFO: renamed from: a */
    public static final boolean m104087a(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        return featureFlagChecker.isFeatureEnabled("android-strap-lock-unlock-enabled") || featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING);
    }
}
