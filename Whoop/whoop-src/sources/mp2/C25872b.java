package mp2;

import androidx.core.app.NotificationCompat;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import ip2.C20814a;
import j02.InterfaceC21159o0;
import np2.InterfaceC27034a;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: mp2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lmp2/b;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lip2/a;", "analyticsHelper", "", "source", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Lip2/a;Ljava/lang/String;Ltr2/n;)V", "Lm91/u;", "Ll83/a0;", "a", "(Lm91/u;)V", "Lnp2/a$n;", NotificationCompat.CATEGORY_EVENT, "b", "(Lnp2/a$n;)V", "Lj02/o0;", "Leb/a0;", "c", "Lip2/a;", "d", "Ljava/lang/String;", "e", "Ltr2/n;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25872b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C20814a analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C25872b(InterfaceC21159o0 navigator, AbstractC12939a0 navController, C20814a analyticsHelper, String source, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.analyticsHelper = analyticsHelper;
        this.source = source;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final void m76471a(InterfaceC25312u interfaceC25312u) {
        this.logger.mo85228t("itemClicked " + interfaceC25312u, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m76472b(InterfaceC27034a.n event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC27034a.c) {
            this.navigator.mo59392a(((InterfaceC27034a.c) event).getNavAction());
            return;
        }
        if (event instanceof InterfaceC27034a.b) {
            m76471a(((InterfaceC27034a.b) event).getItemViewState());
        } else {
            if (!(event instanceof InterfaceC27034a.l)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC27034a.a aVarM27509e = UniversalCheckoutDestination.C10632d.f32385a.m27509e(this.navController, this.source);
            if (aVarM27509e != null) {
                this.analyticsHelper.m57402a(aVarM27509e);
            }
        }
    }

    public /* synthetic */ C25872b(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, C20814a c20814a, String str, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, c20814a, str, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ShippingAddressNavigationRouter") : interfaceC34116n);
    }
}
