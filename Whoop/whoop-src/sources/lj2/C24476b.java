package lj2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.entitlements.Entitlement;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import or2.AbstractC28152c1;
import p000.AbstractC11266d;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import we1.InterfaceC37217a;

/* JADX INFO: renamed from: lj2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Llj2/b;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "Lwe1/a;", "entitlementChecker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lj02/i0;Lwe1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Leb/x0;", "navOptions", "Lj02/j0$c;", "a", "(Leb/x0;)Lj02/j0$c;", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "Lj02/i0;", "b", "Lwe1/a;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24476b implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C24476b(C21147i0 navDeepLinkRequestHelper, InterfaceC37217a entitlementChecker, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.entitlementChecker = entitlementChecker;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC21149j0.c m71240a(C12997x0 navOptions) {
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/notfound?id=" + Entitlement.STRESS_MONITOR.getValue()), navOptions, null, 4, null);
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        String strConcat;
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        C12997x0 c12997x0M85185c = AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-health-push-navigation"));
        if (!(navigationScreen instanceof AbstractC21155m0.a5)) {
            if (navigationScreen instanceof AbstractC21155m0.z4) {
                return this.entitlementChecker.mo119272b(Entitlement.STRESS_MONITOR) ? new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(AbstractC11266d.m30461o("android-app://com.whoop/stress-session?sessionType=", ((AbstractC21155m0.z4) navigationScreen).getInterventionType())), c12997x0M85185c, null, 4, null) : m71240a(c12997x0M85185c);
            }
            return InterfaceC21149j0.d.f80241a;
        }
        if (!this.entitlementChecker.mo119272b(Entitlement.STRESS_MONITOR)) {
            return m71240a(c12997x0M85185c);
        }
        AbstractC21155m0.a5 a5Var = (AbstractC21155m0.a5) navigationScreen;
        String source = a5Var.getSource();
        if (source == null) {
            source = "Unknown";
        }
        String str = a5Var.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        if (str == null || (strConcat = AbstractC31061c.m95640p("android-app://com.whoop/stress-monitor/", source, "?date=", str)) == null) {
            strConcat = "android-app://com.whoop/stress-monitor/".concat(source);
        }
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(strConcat), c12997x0M85185c, null, 4, null);
    }

    public /* synthetic */ C24476b(C21147i0 c21147i0, InterfaceC37217a interfaceC37217a, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0, interfaceC37217a, featureFlagChecker);
    }
}
