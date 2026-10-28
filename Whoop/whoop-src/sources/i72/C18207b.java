package i72;

import androidx.core.app.NotificationCompat;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import z62.AbstractC40127a;

/* JADX INFO: renamed from: i72.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Li72/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "", "hasComeFromSageScreen", "<init>", "(Leb/a0;Lj02/o0;Z)V", "Li72/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Li72/a;)V", "Leb/a0;", "b", "Lj02/o0;", "c", "Z", "d", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18207b {

    /* JADX INFO: renamed from: e */
    public static final int f70722e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean hasComeFromSageScreen;

    public C18207b(AbstractC12939a0 navController, InterfaceC21159o0 navigator, boolean z4) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navController = navController;
        this.navigator = navigator;
        this.hasComeFromSageScreen = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m52275a(AbstractC18206a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC18206a.a) {
            this.navController.m36410z();
            return;
        }
        if (event instanceof AbstractC18206a.d) {
            this.navController.m36410z();
            if (((AbstractC18206a.d) event).getOpenedFromSageScreen()) {
                return;
            }
            this.navController.m36410z();
            this.navController.m36410z();
            return;
        }
        if (event instanceof AbstractC18206a.c) {
            this.navController.m36410z();
            if (((AbstractC18206a.c) event).getOpenedFromSageScreen()) {
                return;
            }
            this.navController.m36410z();
            return;
        }
        if (event instanceof AbstractC18206a.e) {
            AbstractC18206a.e eVar = (AbstractC18206a.e) event;
            if (eVar.getPopBackStack()) {
                this.navController.m36410z();
            }
            this.navigator.mo59392a(eVar.getNavigationAction());
            return;
        }
        if (!event.equals(AbstractC18206a.b.f70715a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.hasComeFromSageScreen) {
            this.navController.m36410z();
        } else {
            if (this.navController.m36375A(AbstractC40127a.f173180a, true)) {
                return;
            }
            this.navController.m36410z();
        }
    }
}
