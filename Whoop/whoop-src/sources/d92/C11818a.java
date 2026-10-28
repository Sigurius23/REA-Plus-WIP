package d92;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.entitlements.Entitlement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import we1.InterfaceC37217a;
import yp0.InterfaceC39700a;

/* JADX INFO: renamed from: d92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ld92/a;", "Lyp0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwe1/a;", "entitlementChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;)V", "", "a", "()Z", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Lwe1/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11818a implements InterfaceC39700a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    public C11818a(FeatureFlagChecker featureFlagChecker, InterfaceC37217a entitlementChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        this.featureFlagChecker = featureFlagChecker;
        this.entitlementChecker = entitlementChecker;
    }

    @Override // yp0.InterfaceC39700a
    /* JADX INFO: renamed from: a */
    public boolean mo31687a() {
        return this.featureFlagChecker.isFeatureEnabled("community-access-gating-mobile") && !this.entitlementChecker.mo119272b(Entitlement.COMMUNITY);
    }
}
