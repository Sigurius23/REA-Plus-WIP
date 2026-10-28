package up2;

import androidx.core.app.NotificationCompat;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qp2.C30539a;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import vp2.InterfaceC36274a;

/* JADX INFO: renamed from: up2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lup2/b;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lqp2/a;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Lqp2/a;Ltr2/n;)V", "Lm91/u;", "Ll83/a0;", "a", "(Lm91/u;)V", "Lvp2/a$g;", NotificationCompat.CATEGORY_EVENT, "b", "(Lvp2/a$g;)V", "Lj02/o0;", "Leb/a0;", "c", "Lqp2/a;", "d", "Ltr2/n;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35155b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30539a analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C35155b(InterfaceC21159o0 navigator, AbstractC12939a0 navController, C30539a analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final void m111230a(InterfaceC25312u interfaceC25312u) {
        this.logger.mo85228t("itemClicked " + interfaceC25312u, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m111231b(InterfaceC36274a.g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC36274a.c) {
            this.navigator.mo59392a(((InterfaceC36274a.c) event).getNavAction());
            return;
        }
        if (event instanceof InterfaceC36274a.b) {
            m111230a(((InterfaceC36274a.b) event).getItemViewState());
        } else {
            if (!(event instanceof InterfaceC36274a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC36274a.a aVarM27516d = UniversalCheckoutDestination.C10633e.f32389a.m27516d(this.navController);
            if (aVarM27516d != null) {
                this.analyticsHelper.m93626a(aVarM27516d);
            }
        }
    }

    public /* synthetic */ C35155b(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, C30539a c30539a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, c30539a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ShippingMethodNavigationRouter") : interfaceC34116n);
    }
}
