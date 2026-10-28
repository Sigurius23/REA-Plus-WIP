package m92;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.entitlements.Entitlement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import we1.InterfaceC37217a;

/* JADX INFO: renamed from: m92.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lm92/d;", "", "<init>", "()V", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwe1/a;", "entitlementChecker", "", "a", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;)Z", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25321d {

    /* JADX INFO: renamed from: a */
    public static final C25321d f99318a = new C25321d();

    private C25321d() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74366a(FeatureFlagChecker featureFlagChecker, InterfaceC37217a entitlementChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        return featureFlagChecker.isFeatureEnabled("community-followers-android") && entitlementChecker.mo119272b(Entitlement.FOLLOWERS);
    }
}
