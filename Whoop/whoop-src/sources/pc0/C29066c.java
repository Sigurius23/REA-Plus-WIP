package pc0;

import androidx.core.app.NotificationCompat;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qc0.InterfaceC30214a;

/* JADX INFO: renamed from: pc0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lpc0/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "<init>", "(Lj02/o0;Leb/a0;)V", "Lqc0/a$f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lqc0/a$f;)V", "Lj02/o0;", "b", "Leb/a0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29066c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    public C29066c(InterfaceC21159o0 navigator, AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        this.navigator = navigator;
        this.navController = navController;
    }

    /* JADX INFO: renamed from: a */
    public final void m88349a(InterfaceC30214a.f event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC30214a.a) {
            this.navigator.mo59392a(((InterfaceC30214a.a) event).getNavAction());
        } else {
            if (!(event instanceof InterfaceC30214a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
        }
    }
}
