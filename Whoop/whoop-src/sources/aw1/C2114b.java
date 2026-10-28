package aw1;

import androidx.core.app.NotificationCompat;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vv1.C36530a;
import wv1.AbstractC37650a;
import wv1.C37651b;

/* JADX INFO: renamed from: aw1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Law1/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lwv1/b;", "analyticsHelper", "Lvv1/a;", "coordinator", "<init>", "(Leb/a0;Lj02/o0;Lwv1/b;Lvv1/a;)V", "Law1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Law1/a;)V", "Leb/a0;", "b", "Lj02/o0;", "c", "Lwv1/b;", "d", "Lvv1/a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2114b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C37651b analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C36530a coordinator;

    public C2114b(AbstractC12939a0 navController, InterfaceC21159o0 navigator, C37651b analyticsHelper, C36530a coordinator) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(coordinator, "coordinator");
        this.navController = navController;
        this.navigator = navigator;
        this.analyticsHelper = analyticsHelper;
        this.coordinator = coordinator;
    }

    /* JADX INFO: renamed from: a */
    public final void m6678a(AbstractC2113a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC2113a.a.f8359a)) {
            this.analyticsHelper.m121036a(new AbstractC37650a.b(null, null, 3, null));
            this.coordinator.m117078q();
            this.navController.m36410z();
        } else {
            if (!(event instanceof AbstractC2113a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsHelper.m121036a(new AbstractC37650a.a(null, null, 3, null));
            this.navigator.mo59392a(((AbstractC2113a.b) event).getAction());
        }
    }
}
