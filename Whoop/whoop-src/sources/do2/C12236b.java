package do2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.NavigationScreenModel;
import eo2.InterfaceC13383c;
import j02.AbstractC21161p0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import zn2.C40907a;

/* JADX INFO: renamed from: do2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ldo2/b;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lzn2/a;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Lzn2/a;Ltr2/n;)V", "Leo2/c$d;", NotificationCompat.CATEGORY_EVENT, "", "subtotal", "Ll83/a0;", "a", "(Leo2/c$d;Ljava/lang/String;)V", "Lj02/o0;", "b", "Leb/a0;", "c", "Lzn2/a;", "d", "Ltr2/n;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12236b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C40907a analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C12236b(InterfaceC21159o0 navigator, AbstractC12939a0 navController, C40907a analyticsHelper, InterfaceC34116n logger) {
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
    public final void m34027a(InterfaceC13383c.d event, String subtotal) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof InterfaceC13383c.c)) {
            throw new NoWhenBranchMatchedException();
        }
        this.navController.m36410z();
        InterfaceC13383c.c cVar = (InterfaceC13383c.c) event;
        NavigationScreenModel parameters = cVar.getNavAction().getParameters();
        if (parameters instanceof NavigationScreenModel.None) {
            this.analyticsHelper.m132597c(subtotal);
            return;
        }
        this.analyticsHelper.m132596b(subtotal);
        if (this.navigator.mo59392a(cVar.getNavAction()) instanceof AbstractC21161p0.h) {
            this.logger.mo85222m("Unresolved destination for cart navigation: " + parameters, new AbstractC30556a.a[0]);
        }
    }

    public /* synthetic */ C12236b(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, C40907a c40907a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, c40907a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UniversalCartNavigationRouter") : interfaceC34116n);
    }
}
