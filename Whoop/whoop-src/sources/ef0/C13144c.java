package ef0;

import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ef0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lef0/c;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "<init>", "(Leb/a0;Lj02/o0;)V", "Lef0/a;", "navigationEvent", "Ll83/a0;", "a", "(Lef0/a;)V", "Leb/a0;", "b", "Lj02/o0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13144c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C13144c(AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navController = navController;
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m36774a(AbstractC13142a navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        if (navigationEvent instanceof AbstractC13142a.a) {
            this.navController.m36410z();
            return;
        }
        if (navigationEvent instanceof AbstractC13142a.d) {
            this.navController.m36410z();
            this.navigator.mo59393b(new AbstractC21155m0.t("OVERVIEW", ((AbstractC13142a.d) navigationEvent).getTestType()));
        } else if (navigationEvent instanceof AbstractC13142a.b) {
            this.navController.m36410z();
            this.navController.m36410z();
            this.navigator.mo59393b(new AbstractC21155m0.p("typeform_do_this_later_btn", null, 2, null));
        } else {
            if (!(navigationEvent instanceof AbstractC13142a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC13142a.c cVar = (AbstractC13142a.c) navigationEvent;
            this.navigator.mo59393b(new AbstractC21155m0.d3(cVar.getConsentAction().name(), cVar.getTestType()));
        }
    }
}
