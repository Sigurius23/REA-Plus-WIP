package ro1;

import android.net.Uri;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.repositories.FeatureFlagChecker;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.AbstractC28152c1;
import or2.AbstractC28219z;
import p000.AbstractC11266d;
import p114eb.C12969k0;
import p114eb.C12995w0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ro1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lro1/h;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31636h implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C31636h(C21147i0 navDeepLinkRequestHelper, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.featureFlagChecker = featureFlagChecker;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (navigationScreen instanceof AbstractC21155m0.u2) {
            AbstractC21155m0.u2 u2Var = (AbstractC21155m0.u2) navigationScreen;
            String string = AbstractC28219z.m85447b("logCalendar", AbstractC25247g0.m73990Y(new C23465k(HttpHeaders.DATE, u2Var.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()), new C23465k("source", u2Var.getSource()))).toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            C12969k0 c12969k0M58994a = this.navDeepLinkRequestHelper.m58994a(string);
            C12995w0 c12995w0M95631g = AbstractC31061c.m95631g();
            c12995w0M95631g.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M58994a, c12995w0M95631g.m36508a(), null, 4, null);
        }
        if (!(navigationScreen instanceof AbstractC21155m0.v2)) {
            if (!(navigationScreen instanceof AbstractC21155m0.w2)) {
                return InterfaceC21149j0.d.f80241a;
            }
            AbstractC21155m0.w2 w2Var = (AbstractC21155m0.w2) navigationScreen;
            String phase = w2Var.getPhase();
            return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a((phase == null || phase.length() == 0) ? "android-app://com.whoop/phaseCoaching" : AbstractC11266d.m30461o("android-app://com.whoop/phaseCoaching?phase=", w2Var.getPhase())), AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-health-push-navigation")), null, 4, null);
        }
        Uri.Builder builderBuildUpon = Uri.parse("android-app://com.whoop/menstrual_cycle_insights").buildUpon();
        AbstractC21155m0.v2 v2Var = (AbstractC21155m0.v2) navigationScreen;
        String str = v2Var.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                builderBuildUpon.appendQueryParameter(HttpHeaders.DATE, str);
            }
        }
        builderBuildUpon.appendQueryParameter("doPollUponEntry", String.valueOf(v2Var.getDoPollUponEntry()));
        String preSelectedLogValue = v2Var.getPreSelectedLogValue();
        if (preSelectedLogValue != null) {
            builderBuildUpon.appendQueryParameter("preSelectedLogValue", preSelectedLogValue);
        }
        String analyticsSource = v2Var.getAnalyticsSource();
        if (analyticsSource != null) {
            builderBuildUpon.appendQueryParameter("analyticsSource", analyticsSource);
        }
        String string2 = builderBuildUpon.build().toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(string2), AbstractC28152c1.m85185c(this.featureFlagChecker.isFeatureEnabled("android-health-push-navigation")), null, 4, null);
    }

    public /* synthetic */ C31636h(C21147i0 c21147i0, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0, featureFlagChecker);
    }
}
