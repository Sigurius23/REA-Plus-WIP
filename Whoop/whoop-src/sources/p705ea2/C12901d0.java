package p705ea2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.entitlements.Entitlement;
import gc2.EnumC15710a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import we1.InterfaceC37217a;

/* JADX INFO: renamed from: ea2.d0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lea2/d0;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwe1/a;", "entitlementChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;)V", "Lgc2/a;", "tile", "", "a", "(Lgc2/a;)Z", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Lwe1/a;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12901d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    public C12901d0(FeatureFlagChecker featureFlagChecker, InterfaceC37217a entitlementChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        this.featureFlagChecker = featureFlagChecker;
        this.entitlementChecker = entitlementChecker;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36305a(EnumC15710a tile) {
        Entitlement entitlementKey;
        AbstractC22676k.m65750j(tile, "tile");
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE) && (entitlementKey = tile.getEntitlementKey()) != null) {
            return this.entitlementChecker.mo119272b(entitlementKey);
        }
        return true;
    }
}
