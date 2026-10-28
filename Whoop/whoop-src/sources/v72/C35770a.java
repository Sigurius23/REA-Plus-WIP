package v72;

import android.net.Uri;
import com.whoop.data.repositories.FeatureFlagChecker;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import live.hms.video.factories.MediaConstraintsFactory;
import nf1.AbstractC26660a;
import or2.AbstractC28152c1;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: v72.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lv72/a;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35770a implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C35770a(C21147i0 navDeepLinkRequestHelper, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.featureFlagChecker = featureFlagChecker;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.h4)) {
            if ((navigationScreen instanceof AbstractC21155m0.g4) && this.featureFlagChecker.isFeatureEnabled("sanguine-waitlist")) {
                return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/sanguineWaitlistBiomarkerListFragment"), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105960e, -1, -1, AbstractC26660a.f105971p), null, 4, null);
            }
            return InterfaceC21149j0.d.f80241a;
        }
        if (!this.featureFlagChecker.isFeatureEnabled("sanguine-waitlist")) {
            return InterfaceC21149j0.d.f80241a;
        }
        Uri.Builder builderPath = new Uri.Builder().scheme("android-app").authority("com.whoop").path("SanguineFragment");
        AbstractC21155m0.h4 h4Var = (AbstractC21155m0.h4) navigationScreen;
        String source = h4Var.getSource();
        if (source != null) {
            builderPath.appendQueryParameter("source", source);
        }
        if (h4Var.getSignUpOnEntry()) {
            builderPath.appendQueryParameter("signUpOnEntry", MediaConstraintsFactory.kValueTrue);
        }
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        String string = builderPath.build().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return new InterfaceC21149j0.c(c21147i0.m58994a(string), AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-health-push-navigation")), null, 4, null);
    }

    public /* synthetic */ C35770a(C21147i0 c21147i0, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0, featureFlagChecker);
    }
}
