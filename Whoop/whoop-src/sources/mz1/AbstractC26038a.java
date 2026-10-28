package mz1;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: mz1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "source", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "a", "(Ljava/lang/String;Lcom/whoop/data/repositories/FeatureFlagChecker;)Z", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26038a {
    /* JADX INFO: renamed from: a */
    public static final boolean m77462a(String str, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        return str != null && AbstractC39421y.m125930O(str, featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID) ? "iajf" : "iajf-prepaids", false);
    }
}
