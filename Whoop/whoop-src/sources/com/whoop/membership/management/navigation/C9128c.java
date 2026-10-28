package com.whoop.membership.management.navigation;

import androidx.core.app.NotificationCompat;
import ax1.AbstractC2119a;
import ax1.C2120b;
import ix1.AbstractC21021d;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import java.net.URLEncoder;
import o02.InterfaceC27353d;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.membership.management.navigation.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/membership/management/navigation/c;", "", "Leb/a0;", "navController", "Leb/u0;", "composeNavController", "Lo02/d;", "navigationReducer", "Lj02/o0;", "navigator", "Lax1/b;", "analyticsHelper", "<init>", "(Leb/a0;Leb/u0;Lo02/d;Lj02/o0;Lax1/b;)V", "Lcom/whoop/membership/management/navigation/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lcom/whoop/membership/management/navigation/b;)V", "Leb/a0;", "b", "Leb/u0;", "c", "Lo02/d;", "d", "Lj02/o0;", "e", "Lax1/b;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9128c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12991u0 composeNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C2120b analyticsHelper;

    public C9128c(AbstractC12939a0 navController, C12991u0 composeNavController, InterfaceC27353d navigationReducer, InterfaceC21159o0 navigator, C2120b analyticsHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.navController = navController;
        this.composeNavController = composeNavController;
        this.navigationReducer = navigationReducer;
        this.navigator = navigator;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    public final void m22823a(AbstractC9127b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC9127b.e) {
            AbstractC12939a0.m36374y(this.composeNavController, MembershipManagementNavHostDestination.C9124c.f27277a.getBaseRoute(), new C12997x0(false, false, this.composeNavController.m36396k().f44856M, true, false, -1, -1, -1, -1), 4);
            return;
        }
        if (event instanceof AbstractC9127b.c) {
            if (this.composeNavController.m36410z()) {
                return;
            }
            this.navController.m36410z();
            return;
        }
        if (event instanceof AbstractC9127b.b) {
            this.navController.m36410z();
            return;
        }
        if (event instanceof AbstractC9127b.a) {
            AbstractC9127b.a aVar = (AbstractC9127b.a) event;
            String strEncode = URLEncoder.encode(aVar.getPath(), "UTF-8");
            String strM58593b = AbstractC21021d.m58593b(aVar.m22820c().entrySet());
            C12991u0 c12991u0 = this.composeNavController;
            MembershipManagementNavHostDestination.C9122a c9122a = MembershipManagementNavHostDestination.C9122a.f27273a;
            AbstractC22676k.m65747g(strEncode);
            AbstractC12939a0.m36374y(c12991u0, c9122a.m22791a(strEncode, strM58593b, aVar.getCard(), aVar.getIsIndependentCheckout()), null, 6);
            return;
        }
        if (!(event instanceof AbstractC9127b.d)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC9127b.d dVar = (AbstractC9127b.d) event;
        InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(dVar.getAction().getParameters());
        if (interfaceC21134cMo67681a instanceof AbstractC21155m0) {
            AbstractC21155m0 abstractC21155m0 = (AbstractC21155m0) interfaceC21134cMo67681a;
            if (abstractC21155m0 instanceof AbstractC21155m0.x2) {
                AbstractC21155m0.x2 x2Var = (AbstractC21155m0.x2) interfaceC21134cMo67681a;
                String trackingTier = x2Var.getTrackingTier();
                if (trackingTier != null) {
                    this.analyticsHelper.m6690a(new AbstractC2119a.l(null, null, trackingTier, null, x2Var.getTrackingSource(), null, 43, null));
                }
                AbstractC12939a0.m36374y(this.composeNavController, MembershipManagementNavHostDestination.C9123b.f27275a.m22792a(AbstractC21021d.m58593b(x2Var.m59340b().entrySet())), null, 6);
                return;
            }
            if (abstractC21155m0 instanceof AbstractC21155m0.a3) {
                AbstractC12939a0.m36374y(this.composeNavController, MembershipManagementNavHostDestination.C9125d.f27279a.getBaseRoute(), null, 6);
                return;
            }
            if (!(abstractC21155m0 instanceof AbstractC21155m0.k0)) {
                this.navigator.mo59392a(dVar.getAction());
                return;
            }
            AbstractC21155m0.k0 k0Var = (AbstractC21155m0.k0) interfaceC21134cMo67681a;
            String strEncode2 = URLEncoder.encode(k0Var.getPath(), "UTF-8");
            String strM58593b2 = AbstractC21021d.m58593b(k0Var.m59170d().entrySet());
            C12991u0 c12991u1 = this.composeNavController;
            MembershipManagementNavHostDestination.C9122a c9122a2 = MembershipManagementNavHostDestination.C9122a.f27273a;
            AbstractC22676k.m65747g(strEncode2);
            AbstractC12939a0.m36374y(c12991u1, MembershipManagementNavHostDestination.C9122a.m22790b(c9122a2, strEncode2, strM58593b2, null, false, 8, null), null, 6);
        }
    }
}
