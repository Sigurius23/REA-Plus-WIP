package dj1;

import a11.C0140r;
import cj1.C4753i;
import cj1.InterfaceC4751g;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.health.domain.models.AnalyticsData;
import com.whoop.health.domain.models.HealthTabResponse;
import com.whoop.health.domain.models.HealthTabScrollBackgroundStyle;
import com.whoop.health.domain.models.HealthTabSectionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import m83.AbstractC25265s;
import m83.C25271y;
import n71.C26436q;
import n83.C26460c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25292c0;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import ri1.C31459h;
import ri1.InterfaceC31458g;
import sl1.C32704c;
import wb3.AbstractC37056f;
import yg2.C39528c;

/* JADX INFO: renamed from: dj1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f*\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010&\u001a\u00020$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010%¨\u0006'"}, m65681d2 = {"Ldj1/a;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lsl1/c;", "connectivityTileViewStateReducer", "Lyg2/c;", "liveHrMonitorReducer", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lsl1/c;Lyg2/c;)V", "Lri1/g$b;", "currentDialogType", "Lcj1/i;", "d", "(Lri1/g$b;)Lcj1/i;", "Lri1/h;", "Lcj1/i$b;", "dialog", "e", "(Lri1/h;Lcj1/i$b;)Lcj1/i;", "La11/r;", "connectivityTileItem", "Ln71/q;", "liveHrMonitorItem", "", "Lm91/u;", "itemsFromResponse", "a", "(Lcom/whoop/data/repositories/FeatureFlagChecker;La11/r;Ln71/q;Ljava/util/List;)Ljava/util/List;", "domainResult", "c", "(Lri1/h;)Lcj1/i;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Lsl1/c;", "Lyg2/c;", "Ljb1/a;", "()Ljb1/a;", "reducer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12088a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32704c connectivityTileViewStateReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39528c liveHrMonitorReducer;

    public C12088a(FeatureFlagChecker featureFlagChecker, C32704c connectivityTileViewStateReducer, C39528c liveHrMonitorReducer) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(connectivityTileViewStateReducer, "connectivityTileViewStateReducer");
        AbstractC22676k.m65750j(liveHrMonitorReducer, "liveHrMonitorReducer");
        this.featureFlagChecker = featureFlagChecker;
        this.connectivityTileViewStateReducer = connectivityTileViewStateReducer;
        this.liveHrMonitorReducer = liveHrMonitorReducer;
    }

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC25312u> m33350a(FeatureFlagChecker featureFlagChecker, C0140r connectivityTileItem, C26436q liveHrMonitorItem, List<? extends InterfaceC25312u> itemsFromResponse) {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        boolean zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled("health-tab-no-hr");
        boolean isVisible = connectivityTileItem.getIsVisible();
        if (zIsFeatureEnabled) {
            if (isVisible) {
                c26460cM119000x.add(connectivityTileItem);
            }
        } else if (isVisible) {
            c26460cM119000x.add(connectivityTileItem);
            if (liveHrMonitorItem != null) {
                c26460cM119000x.add(liveHrMonitorItem);
            } else {
                c26460cM119000x.add(new C25292c0(0.0f, 0.0f, 3, null));
            }
        } else if (liveHrMonitorItem != null) {
            c26460cM119000x.add(liveHrMonitorItem);
        } else {
            c26460cM119000x.add(new C25292c0(0.0f, 0.0f, 3, null));
        }
        c26460cM119000x.addAll(itemsFromResponse);
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    /* JADX INFO: renamed from: d */
    private final C4753i m33351d(InterfaceC31458g.b currentDialogType) {
        if (AbstractC22676k.m65745e(currentDialogType, InterfaceC31458g.c.f129510a)) {
            return new C4753i(new C4753i.c(C33211q0.m105332d(C33205o0.f138451a.m105288b(), null, null, null, null, null, false, false, null, true, false, 767, null), null, null, 6, null), null, null, null, 14, null);
        }
        if (AbstractC22676k.m65745e(currentDialogType, InterfaceC31458g.d.f129511a)) {
            return new C4753i(new C4753i.c(C33205o0.f138451a.m105289c(), new InterfaceC4751g.m(false, 1, null), null, 4, null), null, null, null, 14, null);
        }
        if (AbstractC22676k.m65745e(currentDialogType, InterfaceC31458g.f.f129512a)) {
            return new C4753i(new C4753i.c(C33205o0.f138451a.m105291e(), new InterfaceC4751g.m(false, 1, null), null, 4, null), null, null, null, 14, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    private final C4753i m33352e(C31459h c31459h, C4753i.b bVar) {
        List<? extends DesignSystemModel> arrayList;
        String scrollBackgroundStyle;
        AnalyticsData analytics;
        List<HealthTabSectionModel> sections;
        C21535a c21535aM33353b = m33353b();
        HealthTabResponse healthTabResponse = c31459h.getHealthTabResponse();
        if (healthTabResponse == null || (sections = healthTabResponse.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            arrayList = new ArrayList<>();
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((HealthTabSectionModel) it.next()).getItems());
            }
        }
        List<InterfaceC25312u> listM60540g = c21535aM33353b.m60540g(arrayList);
        C0140r c0140rM102648a = this.connectivityTileViewStateReducer.m102648a(c31459h.getConnectivityTileState());
        HealthTabResponse healthTabResponse2 = c31459h.getHealthTabResponse();
        HealthTabScrollBackgroundStyle healthTabScrollBackgroundStyle = null;
        C4753i.d dVar = new C4753i.d(m33350a(this.featureFlagChecker, c0140rM102648a, !(healthTabResponse2 != null ? AbstractC22676k.m65745e(healthTabResponse2.getShowLiveHr(), Boolean.FALSE) : false) ? this.liveHrMonitorReducer.m126256b(c31459h.getLiveHrState()) : null, listM60540g), c31459h.getManualRefresh(), !c31459h.getManualRefresh() && c31459h.getDisplayRefreshingSpinner(), bVar);
        HealthTabResponse healthTabResponse3 = c31459h.getHealthTabResponse();
        C4753i.a aVar = (healthTabResponse3 == null || (analytics = healthTabResponse3.getAnalytics()) == null) ? null : new C4753i.a(analytics.getLabel(), analytics.getValue());
        HealthTabResponse healthTabResponse4 = c31459h.getHealthTabResponse();
        if (healthTabResponse4 != null && (scrollBackgroundStyle = healthTabResponse4.getScrollBackgroundStyle()) != null) {
            HealthTabScrollBackgroundStyle healthTabScrollBackgroundStyle2 = HealthTabScrollBackgroundStyle.NONE;
            for (HealthTabScrollBackgroundStyle healthTabScrollBackgroundStyle3 : HealthTabScrollBackgroundStyle.values()) {
                if (AbstractC22676k.m65745e(healthTabScrollBackgroundStyle3.name(), scrollBackgroundStyle)) {
                    healthTabScrollBackgroundStyle = healthTabScrollBackgroundStyle3;
                    break;
                }
            }
            if (healthTabScrollBackgroundStyle == null) {
                healthTabScrollBackgroundStyle = healthTabScrollBackgroundStyle2;
            }
        }
        return new C4753i(null, dVar, aVar, healthTabScrollBackgroundStyle, 1, null);
    }

    /* JADX INFO: renamed from: b */
    public final C21535a m33353b() {
        return AbstractC12090c.m33356B(this.featureFlagChecker.isFeatureEnabled("hormonal-insights-updates"));
    }

    /* JADX INFO: renamed from: c */
    public final C4753i m33354c(C31459h domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC31458g currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC31458g.b) {
            return m33351d((InterfaceC31458g.b) domainResult.getCurrentDialogType());
        }
        return currentDialogType instanceof InterfaceC31458g.e ? m33352e(domainResult, AbstractC12090c.m33372R((InterfaceC31458g.e) domainResult.getCurrentDialogType())) : m33352e(domainResult, null);
    }

    public /* synthetic */ C12088a(FeatureFlagChecker featureFlagChecker, C32704c c32704c, C39528c c39528c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, (i13 & 2) != 0 ? new C32704c() : c32704c, (i13 & 4) != 0 ? new C39528c() : c39528c);
    }
}
