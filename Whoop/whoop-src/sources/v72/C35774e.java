package v72;

import androidx.core.app.NotificationCompat;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: v72.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lv72/e;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "<init>", "(Lj02/o0;Leb/a0;)V", "Lv72/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lv72/d;)V", "Lj02/o0;", "b", "Leb/a0;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35774e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    public C35774e(InterfaceC21159o0 navigator, AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        this.navigator = navigator;
        this.navController = navController;
    }

    /* JADX INFO: renamed from: a */
    public final void m113371a(AbstractC35773d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC35773d.c) {
            this.navigator.mo59392a(((AbstractC35773d.c) event).getNavAction());
            return;
        }
        if (event instanceof AbstractC35773d.b) {
            this.navController.m36410z();
            return;
        }
        if (!(event instanceof AbstractC35773d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC35773d.a aVar = (AbstractC35773d.a) event;
        String strM125926K = AbstractC39421y.m125926K(aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String().getId(), "&", "%26", false);
        InterfaceC21159o0 interfaceC21159o0 = this.navigator;
        String tag = aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String().getTag();
        if (tag == null) {
            tag = "";
        }
        interfaceC21159o0.mo59393b(new AbstractC21155m0.f3(strM125926K, tag, "SANGUINE_TILE", null, null, 24, null));
    }
}
