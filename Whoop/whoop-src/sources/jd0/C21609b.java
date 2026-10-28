package jd0;

import com.whoop.data.repositories.FeatureFlagChecker;
import io.getstream.chat.android.client.api.QueryParams;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import l83.C23465k;
import m83.AbstractC25247g0;
import nf1.AbstractC26660a;
import or2.AbstractC28219z;
import p114eb.C12969k0;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: jd0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Ljd0/b;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21609b implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C21609b(C21147i0 navDeepLinkRequestHelper, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.featureFlagChecker = featureFlagChecker;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        String str = null;
        if (navigationScreen instanceof AbstractC21155m0.p) {
            String source = ((AbstractC21155m0.p) navigationScreen).getSource();
            if (source != null && !AbstractC39414r.m125890i0(source)) {
                str = source;
            }
            C12969k0 c12969k0M58994a = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/AdvancedLabsFragment?source=" + str);
            C12995w0 c12995w0M95631g = AbstractC31061c.m95631g();
            c12995w0M95631g.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M58994a, c12995w0M95631g.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.x3) {
            C12969k0 c12969k0M58994a2 = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/rafReceiverFragment?code=" + ((AbstractC21155m0.x3) navigationScreen).getCode());
            C12995w0 c12995w0M95631g2 = AbstractC31061c.m95631g();
            c12995w0M95631g2.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M58994a2, c12995w0M95631g2.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.s) {
            AbstractC21155m0.s sVar = (AbstractC21155m0.s) navigationScreen;
            String episodeId = sVar.getEpisodeId();
            String biomarkerTestId = sVar.getBiomarkerTestId();
            String testType = sVar.getTestType();
            if (testType != null && !AbstractC39414r.m125890i0(testType)) {
                str = testType;
            }
            C12969k0 c12969k0M95630f = AbstractC31061c.m95630f(AbstractC28219z.m85447b("schedulingFormFragment", AbstractC25247g0.m73990Y(new C23465k("episode_id", episodeId), new C23465k("biomarker_test_id", biomarkerTestId), new C23465k("test_type", str))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g3 = AbstractC31061c.m95631g();
            c12995w0M95631g3.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f, c12995w0M95631g3.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.t) {
            AbstractC21155m0.t tVar = (AbstractC21155m0.t) navigationScreen;
            C12969k0 c12969k0M95630f2 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("schedulingStepFragment", AbstractC25247g0.m73990Y(new C23465k("step", tVar.getStep()), new C23465k("testType", tVar.getTestType()))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g4 = AbstractC31061c.m95631g();
            c12995w0M95631g4.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f2, c12995w0M95631g4.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.o) {
            C12969k0 c12969k0M95630f3 = AbstractC31061c.m95630f(AbstractC28219z.m85448c("schedulingFormFragment", null, 2, null), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g5 = AbstractC31061c.m95631g();
            c12995w0M95631g5.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f3, c12995w0M95631g5.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.w) {
            AbstractC21155m0.w wVar = (AbstractC21155m0.w) navigationScreen;
            String testType2 = wVar.getTestType();
            if (testType2 != null && !AbstractC39414r.m125890i0(testType2)) {
                str = testType2;
            }
            C12969k0 c12969k0M95630f4 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("advancedLabsTypeformWebviewFragment", AbstractC25247g0.m73990Y(new C23465k(QueryParams.URL, wVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String()), new C23465k("testTokenId", wVar.getTestTokenId()), new C23465k("testType", str))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g6 = AbstractC31061c.m95631g();
            c12995w0M95631g6.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f4, c12995w0M95631g6.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.g0) {
            AbstractC21155m0.g0 g0Var = (AbstractC21155m0.g0) navigationScreen;
            String biomarkerId = g0Var.getBiomarkerId();
            String source2 = g0Var.getSource();
            if (source2 != null && !AbstractC39414r.m125890i0(source2)) {
                str = source2;
            }
            C12969k0 c12969k0M95630f5 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("biomarkerDetailsFragment", AbstractC25247g0.m73990Y(new C23465k("biomarkerId", biomarkerId), new C23465k("source", str))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g7 = AbstractC31061c.m95631g();
            c12995w0M95631g7.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f5, c12995w0M95631g7.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.h0) {
            String statusType = ((AbstractC21155m0.h0) navigationScreen).getStatusType();
            if (statusType != null && !AbstractC39414r.m125890i0(statusType)) {
                str = statusType;
            }
            C12969k0 c12969k0M95630f6 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("biomarkerSummaryFragment", AbstractC25247g0.m73989X(new C23465k("statusType", str))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g8 = AbstractC31061c.m95631g();
            c12995w0M95631g8.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f6, c12995w0M95631g8.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.q) {
            String source3 = ((AbstractC21155m0.q) navigationScreen).getSource();
            if (source3 != null && !AbstractC39414r.m125890i0(source3)) {
                str = source3;
            }
            C12969k0 c12969k0M95630f7 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("schedulePrimerFragment", AbstractC25247g0.m73989X(new C23465k("source", str))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g9 = AbstractC31061c.m95631g();
            c12995w0M95631g9.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f7, c12995w0M95631g9.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.h) {
            AbstractC21155m0.h hVar = (AbstractC21155m0.h) navigationScreen;
            C12969k0 c12969k0M95630f8 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("editBiomarkersFragment", AbstractC25247g0.m73990Y(new C23465k("test_id", hVar.getTestId()), new C23465k("is_ai_confirmation", String.valueOf(hVar.getIsAiConfirmation())))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g10 = AbstractC31061c.m95631g();
            c12995w0M95631g10.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f8, c12995w0M95631g10.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.i) {
            C12969k0 c12969k0M95630f9 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("editTestDetailsFragment", AbstractC25247g0.m73989X(new C23465k("testId", ((AbstractC21155m0.i) navigationScreen).getTestId()))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g11 = AbstractC31061c.m95631g();
            c12995w0M95631g11.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f9, c12995w0M95631g11.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.d3) {
            AbstractC21155m0.d3 d3Var = (AbstractC21155m0.d3) navigationScreen;
            return new InterfaceC21149j0.c(AbstractC31061c.m95630f(AbstractC28219z.m85447b("multiConsentFragment", AbstractC25247g0.m73990Y(new C23465k("consentAction", d3Var.getConsentAction()), new C23465k("testType", d3Var.getTestType()))), "toString(...)", this.navDeepLinkRequestHelper), new C12997x0(true, false, -1, false, false, AbstractC26660a.f105970o, -1, -1, AbstractC26660a.f105971p), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.v) {
            C12969k0 c12969k0M95630f10 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("testResultsFragment", AbstractC25247g0.m73989X(new C23465k("testId", ((AbstractC21155m0.v) navigationScreen).getTestId()))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g12 = AbstractC31061c.m95631g();
            c12995w0M95631g12.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f10, c12995w0M95631g12.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.u) {
            C12969k0 c12969k0M95630f11 = AbstractC31061c.m95630f(AbstractC28219z.m85448c("testHistoryFragment", null, 2, null), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g13 = AbstractC31061c.m95631g();
            c12995w0M95631g13.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f11, c12995w0M95631g13.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.b0) {
            C12969k0 c12969k0M95630f12 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("allRecordingsFragment", AbstractC25247g0.m73989X(new C23465k("biomarkerName", ((AbstractC21155m0.b0) navigationScreen).getBiomarkerName()))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g14 = AbstractC31061c.m95631g();
            c12995w0M95631g14.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f12, c12995w0M95631g14.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.l) {
            AbstractC21155m0.l lVar = (AbstractC21155m0.l) navigationScreen;
            String source4 = lVar.getSource();
            if (source4 != null && !AbstractC39414r.m125890i0(source4)) {
                str = source4;
            }
            C12969k0 c12969k0M95630f13 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("clinicalInsightsFragment", AbstractC25247g0.m73990Y(new C23465k("testId", lVar.getTestId()), new C23465k("source", str))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g15 = AbstractC31061c.m95631g();
            c12995w0M95631g15.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f13, c12995w0M95631g15.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.g) {
            C12969k0 c12969k0M95630f14 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("actionPlanFragment", AbstractC25247g0.m73989X(new C23465k("testId", ((AbstractC21155m0.g) navigationScreen).getTestId()))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g16 = AbstractC31061c.m95631g();
            c12995w0M95631g16.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f14, c12995w0M95631g16.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.k) {
            AbstractC21155m0.k kVar = (AbstractC21155m0.k) navigationScreen;
            String source5 = kVar.getSource();
            if (source5 != null && !AbstractC39414r.m125890i0(source5)) {
                str = source5;
            }
            C12969k0 c12969k0M95630f15 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("insightsDeepDiveFragment", AbstractC25247g0.m73990Y(new C23465k("insightsId", kVar.getInsightId()), new C23465k("source", str))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g17 = AbstractC31061c.m95631g();
            c12995w0M95631g17.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f15, c12995w0M95631g17.m36508a(), null, 4, null);
        }
        if (navigationScreen instanceof AbstractC21155m0.y) {
            C12969k0 c12969k0M95630f16 = AbstractC31061c.m95630f(AbstractC28219z.m85448c("testUploadFragment", null, 2, null), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g18 = AbstractC31061c.m95631g();
            c12995w0M95631g18.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f16, c12995w0M95631g18.m36508a(), null, 4, null);
        }
        if ((navigationScreen instanceof AbstractC21155m0.j) && this.featureFlagChecker.isFeatureEnabled("mci-alabs-integration")) {
            String testId = ((AbstractC21155m0.j) navigationScreen).getTestId();
            if (testId != null && !AbstractC39414r.m125890i0(testId)) {
                str = testId;
            }
            C12969k0 c12969k0M95630f17 = AbstractC31061c.m95630f(AbstractC28219z.m85447b("hormonalContext", AbstractC25247g0.m73989X(new C23465k("testId", str))), "toString(...)", this.navDeepLinkRequestHelper);
            C12995w0 c12995w0M95631g19 = AbstractC31061c.m95631g();
            c12995w0M95631g19.f44891a = true;
            return new InterfaceC21149j0.c(c12969k0M95630f17, c12995w0M95631g19.m36508a(), null, 4, null);
        }
        return InterfaceC21149j0.d.f80241a;
    }

    public /* synthetic */ C21609b(C21147i0 c21147i0, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0, featureFlagChecker);
    }
}
