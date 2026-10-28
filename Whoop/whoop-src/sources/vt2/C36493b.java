package vt2;

import androidx.core.app.NotificationCompat;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import ls2.AbstractC24716a;
import ls2.C24717b;
import o02.InterfaceC27353d;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vt2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lvt2/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lo02/d;", "navigationReducer", "Lls2/b;", "analyticsHelper", "<init>", "(Leb/a0;Lj02/o0;Lo02/d;Lls2/b;)V", "Ll83/a0;", "a", "()V", "Lvt2/a$b;", NotificationCompat.CATEGORY_EVENT, "b", "(Lvt2/a$b;)V", "Lvt2/a;", "c", "(Lvt2/a;)V", "Lj02/m0;", "navigationScreen", "d", "(Lj02/m0;)V", "Leb/a0;", "Lj02/o0;", "Lo02/d;", "Lls2/b;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36493b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C24717b analyticsHelper;

    public C36493b(AbstractC12939a0 navController, InterfaceC21159o0 navigator, InterfaceC27353d navigationReducer, C24717b analyticsHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.navController = navController;
        this.navigator = navigator;
        this.navigationReducer = navigationReducer;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    private final void m116950a() {
        this.analyticsHelper.m72377q(new AbstractC24716a.j("Dismiss"));
        this.navController.m36410z();
    }

    /* JADX INFO: renamed from: b */
    private final void m116951b(AbstractC36492a.b event) {
        InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(event.getNavigationAction().getParameters());
        AbstractC21155m0 abstractC21155m0 = interfaceC21134cMo67681a instanceof AbstractC21155m0 ? (AbstractC21155m0) interfaceC21134cMo67681a : null;
        m116953d(abstractC21155m0);
        if (abstractC21155m0 != null) {
            this.navController.m36410z();
            AbstractC21155m0.s5 s5Var = abstractC21155m0 instanceof AbstractC21155m0.s5 ? (AbstractC21155m0.s5) abstractC21155m0 : null;
            if (s5Var == null) {
                this.navigator.mo59392a(event.getNavigationAction());
            } else if (s5Var.getShowPresets()) {
                this.navController.m36410z();
                this.navigator.mo59392a(event.getNavigationAction());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m116952c(AbstractC36492a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC36492a.a.f155906a)) {
            m116950a();
        } else {
            if (!(event instanceof AbstractC36492a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m116951b((AbstractC36492a.b) event);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m116953d(AbstractC21155m0 navigationScreen) {
        AbstractC21155m0.s5 s5Var = navigationScreen instanceof AbstractC21155m0.s5 ? (AbstractC21155m0.s5) navigationScreen : null;
        if (s5Var != null) {
            if (s5Var.getShowPresets()) {
                this.analyticsHelper.m72377q(new AbstractC24716a.j("Change My Plan"));
            } else {
                this.analyticsHelper.m72377q(new AbstractC24716a.j("Continue Plan"));
            }
        }
    }
}
