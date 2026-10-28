package x70;

import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.C9598e;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import o02.AbstractC27355f;
import o02.C27354e;
import o02.InterfaceC27353d;
import p114eb.AbstractC12939a0;
import p114eb.C12985r0;
import p599wz.C37722h1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import y70.InterfaceC39265a;

/* JADX INFO: renamed from: x70.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0010*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&¨\u0006("}, m65681d2 = {"Lx70/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lo02/d;", "baseNavReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Lo02/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lcom/whoop/navigation/e;", "navigationAction", "Ll83/a0;", "b", "(Lcom/whoop/navigation/e;)V", "", "startScreen", "source", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "e", "()V", "Lm91/u;", "c", "(Lm91/u;)V", "Ly70/a$j;", NotificationCompat.CATEGORY_EVENT, "g", "(Ly70/a$j;)V", "a", "Lj02/o0;", "Leb/a0;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "Lo02/d;", "navigationReducer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38038c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    public C38038c(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC27353d baseNavReducer, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(baseNavReducer, "baseNavReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        this.navigationReducer = AbstractC27355f.m82533a(baseNavReducer, new C37722h1(26));
    }

    /* JADX INFO: renamed from: b */
    private final void m121776b(C9598e navigationAction) {
        InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(navigationAction.getParameters());
        AbstractC22676k.m65748h(interfaceC21134cMo67681a, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
        AbstractC21155m0 abstractC21155m0 = (AbstractC21155m0) interfaceC21134cMo67681a;
        if (!abstractC21155m0.equals(AbstractC21155m0.j3.f80414b)) {
            this.navigator.mo59393b(abstractC21155m0);
            return;
        }
        this.navigator.mo59393b(new AbstractC21155m0.d(null, "DEVICE_EDUCATION", null, 5, null));
    }

    /* JADX INFO: renamed from: c */
    private final void m121777c(InterfaceC25312u interfaceC25312u) {
        this.logger.mo85228t("itemClicked " + interfaceC25312u, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: d */
    private final void m121778d(String startScreen, String source) {
        this.navigator.mo59393b(new AbstractC21155m0.d(null, startScreen, source, 1, null));
    }

    /* JADX INFO: renamed from: e */
    private final void m121779e() {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("pop-to-home-graph");
        C12985r0 c12985r0M36396k = this.navController.m36396k();
        int i13 = zIsFeatureEnabled ? c12985r0M36396k.f44819H : c12985r0M36396k.f44856M;
        this.logger.mo85228t("POP_TO_HOME_GRAPH enabled=" + zIsFeatureEnabled + ", popUpToId=" + i13, new AbstractC30556a.a[0]);
        this.navigator.mo59393b(new AbstractC21155m0.d(Integer.valueOf(i13), "START_SCREEN", null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m121780f(C27354e buildNavigationReducer) {
        AbstractC22676k.m65750j(buildNavigationReducer, "$this$buildNavigationReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public final void m121781g(InterfaceC39265a.j event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC39265a.c) {
            m121776b(((InterfaceC39265a.c) event).getNavAction());
            return;
        }
        if (event instanceof InterfaceC39265a.g) {
            InterfaceC39265a.g gVar = (InterfaceC39265a.g) event;
            m121778d(gVar.getStartScreen(), gVar.getSource());
            return;
        }
        if (event instanceof InterfaceC39265a.b) {
            m121777c(((InterfaceC39265a.b) event).getItemViewState());
            return;
        }
        if (event instanceof InterfaceC39265a.d) {
            this.navigator.mo59393b(((InterfaceC39265a.d) event).getNavigationScreen());
        } else if (event instanceof InterfaceC39265a.f) {
            this.navController.m36410z();
        } else {
            if (!(event instanceof InterfaceC39265a.h)) {
                throw new NoWhenBranchMatchedException();
            }
            m121779e();
        }
    }

    public /* synthetic */ C38038c(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, InterfaceC27353d interfaceC27353d, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, interfaceC27353d, featureFlagChecker, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("OrderConfirmationNavigationRouter") : interfaceC34116n);
    }
}
