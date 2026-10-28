package ng0;

import androidx.core.app.NotificationCompat;
import j02.InterfaceC21159o0;
import ny0.C27256h;
import og0.InterfaceC27915a;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ng0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lng0/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Ltr2/n;)V", "Lm91/u;", "Ll83/a0;", "a", "(Lm91/u;)V", "Log0/a$g;", NotificationCompat.CATEGORY_EVENT, "b", "(Log0/a$g;)V", "Lj02/o0;", "Leb/a0;", "c", "Ltr2/n;", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26681c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C26681c(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final void m79362a(InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u instanceof C27256h) {
            this.navigator.mo59392a(((C27256h) interfaceC25312u).getDestination());
            return;
        }
        this.logger.mo85226q("Unhandled ItemViewState for app-driven navigation: " + interfaceC25312u, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m79363b(InterfaceC27915a.g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC27915a.d) {
            this.navigator.mo59392a(((InterfaceC27915a.d) event).getNavAction());
        } else if (event instanceof InterfaceC27915a.c) {
            m79362a(((InterfaceC27915a.c) event).getItemViewState());
        } else {
            if (!(event instanceof InterfaceC27915a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
        }
    }

    public /* synthetic */ C26681c(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AdvancedLabsManagementNavigationRouter") : interfaceC34116n);
    }
}
