package wo2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.C1601k1;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr2.InterfaceC34116n;
import uo2.C35143a;
import xo2.InterfaceC38495a;

/* JADX INFO: renamed from: wo2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lwo2/b;", "", "Lj02/o0;", "navigator", "Leb/a0;", "globalNavController", "navHostController", "Luo2/a;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Leb/a0;Luo2/a;Ltr2/n;)V", "Lxo2/a$g;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lxo2/a$g;)V", "Lj02/o0;", "b", "Leb/a0;", "c", "d", "Luo2/a;", "e", "Ltr2/n;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37479b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 globalNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC12939a0 navHostController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C35143a analyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C37479b(InterfaceC21159o0 navigator, AbstractC12939a0 globalNavController, AbstractC12939a0 navHostController, C35143a analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        AbstractC22676k.m65750j(navHostController, "navHostController");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.globalNavController = globalNavController;
        this.navHostController = navHostController;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final void m120168a(InterfaceC38495a.g event) {
        C1601k1 c1601k1M36480b;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC38495a.b) {
            this.navigator.mo59392a(((InterfaceC38495a.b) event).m123383a());
            return;
        }
        if (event instanceof InterfaceC38495a.f) {
            this.analyticsHelper.m111143a(InterfaceC38495a.c.f164959a);
            this.navHostController.m36410z();
        } else {
            if (!(event instanceof InterfaceC38495a.h)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsHelper.m111143a(InterfaceC38495a.i.f164964a);
            C12982q c12982qM36393h = this.globalNavController.m36393h();
            if (c12982qM36393h != null && (c1601k1M36480b = c12982qM36393h.m36480b()) != null) {
                c1601k1M36480b.m5004e(((InterfaceC38495a.h) event).getCartId(), "externalCheckoutCartId");
            }
            this.navHostController.m36410z();
        }
    }

    public /* synthetic */ C37479b(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, AbstractC12939a0 abstractC12939a1, C35143a c35143a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, abstractC12939a1, c35143a, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ExternalWebCheckoutNavigationRouter") : interfaceC34116n);
    }
}
