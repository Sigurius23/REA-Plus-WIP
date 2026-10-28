package ts2;

import androidx.core.app.NotificationCompat;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ts2.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lts2/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "<init>", "(Leb/a0;Lj02/o0;)V", "Ll83/a0;", "a", "()V", "Lts2/a$b;", NotificationCompat.CATEGORY_EVENT, "b", "(Lts2/a$b;)V", "Lts2/a;", "c", "(Lts2/a;)V", "Leb/a0;", "Lj02/o0;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34146b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C34146b(AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navController = navController;
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    private final void m107917a() {
        this.navController.m36410z();
    }

    /* JADX INFO: renamed from: b */
    private final void m107918b(AbstractC34145a.b event) {
        this.navigator.mo59392a(event.getNavigationAction());
    }

    /* JADX INFO: renamed from: c */
    public final void m107919c(AbstractC34145a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC34145a.a.f143127a)) {
            m107917a();
        } else {
            if (!(event instanceof AbstractC34145a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m107918b((AbstractC34145a.b) event);
        }
    }
}
