package at1;

import androidx.core.app.NotificationCompat;
import bt1.InterfaceC3621b;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: at1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lat1/a;", "", "Leb/a0;", "fragmentNavController", "Lj02/o0;", "navigator", "<init>", "(Leb/a0;Lj02/o0;)V", "Lbt1/b$c;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lbt1/b$c;)V", "Leb/a0;", "b", "Lj02/o0;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1985a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 fragmentNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C1985a(AbstractC12939a0 fragmentNavController, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(fragmentNavController, "fragmentNavController");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.fragmentNavController = fragmentNavController;
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m6047a(InterfaceC3621b.c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC3621b.a.f14717a)) {
            this.fragmentNavController.m36410z();
            return;
        }
        if (event instanceof InterfaceC3621b.e) {
            this.navigator.mo59393b(new AbstractC21155m0.w1("ECG_INAPP", "Labrador about", null, null, 12, null));
        } else if (event instanceof InterfaceC3621b.d) {
            this.navigator.mo59392a(((InterfaceC3621b.d) event).getNavAction());
        } else {
            if (!(event instanceof InterfaceC3621b.f)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59392a(((InterfaceC3621b.f) event).getNavAction());
        }
    }
}
