package si2;

import com.whoop.navigation.C9598e;
import com.whoop.navigation.FeatureEducationModel;
import com.whoop.navigation.NavigationScreenModel;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: si2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lsi2/a;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "<init>", "(Lj02/o0;Leb/a0;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "b", "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;", "Lsi2/b;", "navigationEvent", "Ll83/a0;", "a", "(Lsi2/b;)V", "Lj02/o0;", "Leb/a0;", "c", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32547a {

    /* JADX INFO: renamed from: d */
    public static final int f134858d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    public C32547a(InterfaceC21159o0 navigator, AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        this.navigator = navigator;
        this.navController = navController;
    }

    /* JADX INFO: renamed from: b */
    private final NavigationScreenModel m101578b(NavigationScreenModel navigationScreenModel) {
        return navigationScreenModel instanceof FeatureEducationModel ? FeatureEducationModel.copy$default((FeatureEducationModel) navigationScreenModel, null, null, "Streaks", 3, null) : navigationScreenModel;
    }

    /* JADX INFO: renamed from: a */
    public final void m101579a(InterfaceC32548b navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        if (navigationEvent instanceof InterfaceC32548b.b) {
            this.navController.m36410z();
        } else {
            if (!(navigationEvent instanceof InterfaceC32548b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            C9598e navigationAction = ((InterfaceC32548b.a) navigationEvent).getNavigationAction();
            this.navigator.mo59392a(C9598e.m23127b(navigationAction, null, m101578b(navigationAction.getParameters()), null, 5, null));
        }
    }
}
