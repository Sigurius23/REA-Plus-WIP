package vb0;

import j02.InterfaceC21159o0;
import ma0.AbstractC25368b;
import p114eb.AbstractC12939a0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vb0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lvb0/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "<init>", "(Leb/a0;Lj02/o0;)V", "Lvb0/a;", "navigationEvent", "Ll83/a0;", "a", "(Lvb0/a;)V", "Leb/a0;", "b", "Lj02/o0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35867b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C35867b(AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navController = navController;
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m113852a(AbstractC35866a navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        if (navigationEvent instanceof AbstractC35866a.a) {
            this.navController.m36410z();
            return;
        }
        if (navigationEvent instanceof AbstractC35866a.b) {
            AbstractC12939a0 abstractC12939a0 = this.navController;
            int i13 = AbstractC25368b.f99428a;
            abstractC12939a0.m36401p(i13, null, new C12997x0(false, false, i13, false, false, -1, -1, -1, -1));
        } else {
            if (!(navigationEvent instanceof AbstractC35866a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
            this.navigator.mo59392a(((AbstractC35866a.c) navigationEvent).getDestination());
        }
    }
}
