package bp1;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.squareup.wire.AbstractC5583n;
import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.GenericScreenModel;
import com.whoop.navigation.IntegrationsScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.navigation.models.GenericInteraction;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import or2.AbstractC28163g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bp1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lbp1/c;", "", "Landroidx/fragment/app/m0;", "fragment", "Lj02/o0;", "navigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Landroidx/fragment/app/m0;Lj02/o0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "b", "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;", "Lbp1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lbp1/b;)V", "Landroidx/fragment/app/m0;", "Lj02/o0;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3536c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C3536c(AbstractComponentCallbacksC1320m0 fragment, InterfaceC21159o0 navigator, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.fragment = fragment;
        this.navigator = navigator;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: b */
    private final NavigationScreenModel m10548b(NavigationScreenModel navigationScreenModel) {
        return navigationScreenModel instanceof IntegrationsScreenModel ? IntegrationsScreenModel.copy$default((IntegrationsScreenModel) navigationScreenModel, null, "MCI_ONBOARDING", null, 5, null) : navigationScreenModel;
    }

    /* JADX INFO: renamed from: a */
    public final void m10549a(AbstractC3535b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC3535b.a.f14171a)) {
            AbstractC28163g0.m85259o(this.fragment).m85343i();
            return;
        }
        if (event instanceof AbstractC3535b.b) {
            AbstractC5583n.m16799z(this.fragment).m36410z();
            if (((AbstractC3535b.b) event).getShowOnboardingStory()) {
                this.navigator.mo59393b(new AbstractC21155m0.l3("PREGNANCY_STORY_V2", "MCI_ONBOARDING", 0L, 4, null));
                return;
            } else {
                this.navigator.mo59393b(new AbstractC21155m0.q3("", null, null, 4, null));
                return;
            }
        }
        if (!event.equals(AbstractC3535b.c.f14173a)) {
            if (!(event instanceof AbstractC3535b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            C9598e navigationAction = ((AbstractC3535b.d) event).getNavigationAction();
            this.navigator.mo59392a(C9598e.m23127b(navigationAction, null, m10548b(navigationAction.getParameters()), null, 5, null));
            return;
        }
        AbstractC5583n.m16799z(this.fragment).m36410z();
        if (!this.featureFlagChecker.isFeatureEnabled("hormonal-insights-arch-v2")) {
            this.navigator.mo59393b(new AbstractC21155m0.v2(null, true, null, null, null, 24, null));
            return;
        }
        ApiRequest apiRequest = new ApiRequest("womens-health-service/v1/hormonal-insights/overview", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null);
        CachePolicyModel cachePolicyModel = null;
        this.navigator.mo59392a(new C9598e(AppScreen.C9346k2.f27718w, new GenericScreenModel(apiRequest, cachePolicyModel, (String) null, (ScreenAnalyticEventModel) null, (MetricEventModel) null, (AiAction) null, (GenericInteraction) null, (List) null, (List) null, 510, (DefaultConstructorMarker) null), null, 4, null));
    }
}
