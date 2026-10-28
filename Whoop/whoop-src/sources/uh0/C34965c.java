package uh0;

import com.whoop.navigation.AiInsightsScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import o02.InterfaceC27353d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: uh0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Luh0/c;", "Lo02/d;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/m0;", "c", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34965c implements InterfaceC27353d, InterfaceC21151k0 {

    /* JADX INFO: renamed from: b */
    public static final int f147939b = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C34965c(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> list, Map<InterfaceC21461d, ? extends Function1> map) {
        return super.mo67682b(list, map);
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC21155m0 mo67681a(NavigationScreenModel navigationScreenModel) {
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        if (!(navigationScreenModel instanceof AiInsightsScreenModel)) {
            return AbstractC21155m0.j3.f80414b;
        }
        AiInsightsScreenModel aiInsightsScreenModel = (AiInsightsScreenModel) navigationScreenModel;
        String sourceType = aiInsightsScreenModel.getSourceType();
        String sourceId = aiInsightsScreenModel.getSourceId();
        String activityType = aiInsightsScreenModel.getActivityType();
        if (activityType == null) {
            activityType = "";
        }
        return new AbstractC21155m0.a0(sourceType, sourceId, activityType);
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.a0)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.a0 a0Var = (AbstractC21155m0.a0) navigationScreen;
        String sourceType = a0Var.getSourceType();
        String sourceId = a0Var.getSourceId();
        if (sourceId == null) {
            sourceId = "";
        }
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(AbstractC31061c.m95640p("android-app://com.whoop/aiInsights?sourceContextType=", sourceType, "&sourceId=", sourceId)), null, null, 6, null);
    }

    public /* synthetic */ C34965c(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
