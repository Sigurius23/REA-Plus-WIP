package xn1;

import com.whoop.data.repositories.FeatureFlagChecker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wm0.C37378a;

/* JADX INFO: renamed from: xn1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lwm0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "a", "(Lwm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38478a {
    /* JADX INFO: renamed from: a */
    public static final String m123294a(C37378a c37378a, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(c37378a, "<this>");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        return featureFlagChecker.isFeatureEnabled("hormonal-insights-arch-v2") ? "hormonal-insights-overview" : "MciOverviewRefreshScope";
    }
}
