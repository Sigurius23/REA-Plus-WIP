package com.whoop.membership.familyPlan.navigation;

import androidx.core.app.NotificationCompat;
import de.C11978a;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import nw1.C27209a;
import ny0.C27256h;
import o02.InterfaceC27353d;
import p114eb.AbstractC12939a0;
import p114eb.C12970k1;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p114eb.C12999y0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import t71.C33572i;
import tr2.InterfaceC34116n;
import ww1.AbstractC37659e;
import ww1.C37656b;
import ww1.C37664j;
import ww1.C37665k;
import ww1.C37666l;
import ww1.C37667m;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.whoop.membership.familyPlan.navigation.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lcom/whoop/membership/familyPlan/navigation/b;", "", "Leb/a0;", "navController", "Leb/u0;", "composeNavController", "Lo02/d;", "navigationReducer", "Lj02/o0;", "navigator", "Ltr2/n;", "logger", "Lnw1/a;", "analyticsHelper", "<init>", "(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Ltr2/n;Lnw1/a;)V", "Lm91/u;", "Ll83/a0;", "c", "(Lm91/u;)V", "Lww1/e;", NotificationCompat.CATEGORY_EVENT, "d", "(Lww1/e;)V", "a", "Leb/a0;", "b", "Leb/u0;", "Lo02/d;", "Lj02/o0;", "e", "Ltr2/n;", "f", "Lnw1/a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9114b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12991u0 composeNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27209a analyticsHelper;

    public C9114b(AbstractC12939a0 navController, C12991u0 composeNavController, InterfaceC27353d navigationReducer, InterfaceC21159o0 navigator, InterfaceC34116n logger, C27209a analyticsHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.navController = navController;
        this.composeNavController = composeNavController;
        this.navigationReducer = navigationReducer;
        this.navigator = navigator;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: c */
    private final void m22748c(InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u instanceof C27256h) {
            this.navigator.mo59392a(((C27256h) interfaceC25312u).getDestination());
            return;
        }
        this.logger.mo85226q("Unhandled ItemViewState for app-driven navigation: " + interfaceC25312u, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m22749e(Integer num, C12999y0 navigate) {
        AbstractC22676k.m65750j(navigate, "$this$navigate");
        if (num != null) {
            navigate.m36509a(num.intValue(), new C33572i(18));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m22750f(C12970k1 popUpTo) {
        AbstractC22676k.m65750j(popUpTo, "$this$popUpTo");
        popUpTo.m36459a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final void m22751d(AbstractC37659e event) {
        C12977n0 c12977n0;
        C12977n0 c12977n1;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC37659e.d) {
            if (this.composeNavController.m36410z()) {
                return;
            }
            this.analyticsHelper.m81939a(C37667m.f161416a);
            this.navController.m36410z();
            return;
        }
        Integer numValueOf = null;
        if (event instanceof AbstractC37659e.b) {
            AbstractC37659e.b bVar = (AbstractC37659e.b) event;
            InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(bVar.getNavAction().getParameters());
            if (interfaceC21134cMo67681a instanceof AbstractC21155m0) {
                AbstractC21155m0 abstractC21155m0 = (AbstractC21155m0) interfaceC21134cMo67681a;
                if (abstractC21155m0 instanceof AbstractC21155m0.i1) {
                    AbstractC21155m0.i1 i1Var = (AbstractC21155m0.i1) interfaceC21134cMo67681a;
                    this.analyticsHelper.m81939a(new C37665k(i1Var.getIsNewMember(), bVar.getHubScreenContent()));
                    AbstractC12939a0.m36374y(this.composeNavController, FamilyPlanNavHostDestination.C9112b.f27235a.m22735a(i1Var.getIsNewMember()), null, 6);
                    return;
                } else if (abstractC21155m0 instanceof AbstractC21155m0.b4) {
                    this.analyticsHelper.m81939a(C37666l.f161415a);
                    this.navigator.mo59392a(bVar.getNavAction());
                    return;
                } else {
                    if (!(abstractC21155m0 instanceof AbstractC21155m0.d0)) {
                        this.navigator.mo59392a(bVar.getNavAction());
                        return;
                    }
                    String url = ((AbstractC21155m0.d0) interfaceC21134cMo67681a).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String();
                    if (url != null ? AbstractC39414r.m125876U(url, "gift", true) : false) {
                        this.analyticsHelper.m81939a(C37664j.f161412a);
                    }
                    this.navigator.mo59393b(abstractC21155m0);
                    return;
                }
            }
            return;
        }
        if (event instanceof AbstractC37659e.c) {
            this.analyticsHelper.m81939a(C37656b.f161391a);
            if (this.composeNavController.m36410z()) {
                return;
            }
            this.navController.m36410z();
            return;
        }
        if (!(event instanceof AbstractC37659e.e)) {
            if (!(event instanceof AbstractC37659e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m22748c(((AbstractC37659e.a) event).getItemViewState());
            return;
        }
        FamilyPlanNavHostDestination.C9112b c9112b = FamilyPlanNavHostDestination.C9112b.f27235a;
        String strM22735a = c9112b.m22735a(((AbstractC37659e.e) event).getIsNewMember());
        C12982q c12982qM36393h = this.composeNavController.m36393h();
        String str = (c12982qM36393h == null || (c12977n1 = c12982qM36393h.f44844x) == null) ? null : c12977n1.f44820I;
        if (!(str != null && AbstractC39421y.m125930O(str, c9112b.getBaseRoute(), false))) {
            AbstractC12939a0.m36374y(this.composeNavController, strM22735a, null, 6);
            return;
        }
        C12982q c12982qM36393h2 = this.composeNavController.m36393h();
        if (c12982qM36393h2 != null && (c12977n0 = c12982qM36393h2.f44844x) != null) {
            numValueOf = Integer.valueOf(c12977n0.f44819H);
        }
        this.composeNavController.m36408w(strM22735a, new C11978a(1, numValueOf));
    }

    public /* synthetic */ C9114b(AbstractC12939a0 abstractC12939a0, C12991u0 c12991u0, InterfaceC27353d interfaceC27353d, InterfaceC21159o0 interfaceC21159o0, InterfaceC34116n interfaceC34116n, C27209a c27209a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12939a0, c12991u0, interfaceC27353d, interfaceC21159o0, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("FamilyPlanRouter") : interfaceC34116n, c27209a);
    }
}
