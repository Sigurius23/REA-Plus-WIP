package hk1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.WeeklyPlanSetupScreenModel;
import dk1.AbstractC12112a;
import dk1.C12113b;
import j02.C21147i0;
import j02.InterfaceC21159o0;
import p000.AbstractC11266d;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hk1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lhk1/c;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lj02/i0;", "navDeepLinkRequestHelper", "Ldk1/b;", "analyticsHelper", "", "source", "<init>", "(Leb/a0;Lj02/o0;Lj02/i0;Ldk1/b;Ljava/lang/String;)V", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lhk1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lhk1/a;)V", "Leb/a0;", "Lj02/o0;", "c", "Lj02/i0;", "d", "Ldk1/b;", "e", "Ljava/lang/String;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17389c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C12113b analyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String source;

    public C17389c(AbstractC12939a0 navController, InterfaceC21159o0 navigator, C21147i0 navDeepLinkRequestHelper, C12113b analyticsHelper, String source) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(source, "source");
        this.navController = navController;
        this.navigator = navigator;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.analyticsHelper = analyticsHelper;
        this.source = source;
    }

    /* JADX INFO: renamed from: a */
    private final String m49212a(String source) {
        return AbstractC11266d.m30461o("android-app://com.whoop/onboardingStoriesFragmentRedesign/HEALTHSPAN_ONBOARDING?entryPoint=", source);
    }

    /* JADX INFO: renamed from: b */
    public final void m49213b(AbstractC17387a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17387a.a) {
            this.navController.m36410z();
            return;
        }
        boolean z4 = event instanceof AbstractC17387a.b;
        if (!z4) {
            if (!(event instanceof AbstractC17387a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsHelper.m33489l(new AbstractC12112a.h(this.source));
            this.navController.m36404s(this.navDeepLinkRequestHelper.m58994a(m49212a(this.source)));
            return;
        }
        AbstractC17387a.b bVar = z4 ? (AbstractC17387a.b) event : null;
        if (bVar != null) {
            NavigationScreenModel parameters = bVar.getNavigationAction().getParameters();
            WeeklyPlanSetupScreenModel weeklyPlanSetupScreenModel = parameters instanceof WeeklyPlanSetupScreenModel ? (WeeklyPlanSetupScreenModel) parameters : null;
            if (weeklyPlanSetupScreenModel != null) {
                if (weeklyPlanSetupScreenModel.getNoPlanShowMetricSelection()) {
                    this.analyticsHelper.m33489l(AbstractC12112a.b.f40317a);
                } else {
                    this.analyticsHelper.m33489l(AbstractC12112a.d.f40319a);
                }
            }
        }
        this.navigator.mo59392a(((AbstractC17387a.b) event).getNavigationAction());
    }

    public /* synthetic */ C17389c(AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0, C21147i0 c21147i0, C12113b c12113b, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12939a0, interfaceC21159o0, (i13 & 4) != 0 ? new C21147i0() : c21147i0, c12113b, (i13 & 16) != 0 ? "healthspan" : str);
    }
}
