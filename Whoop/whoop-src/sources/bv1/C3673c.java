package bv1;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import bs1.C3595n;
import cv1.InterfaceC11144a;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import ny0.C27256h;
import o02.AbstractC27355f;
import o02.C27354e;
import o02.InterfaceC27353d;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: bv1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 ¨\u0006\""}, m65681d2 = {"Lbv1/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lo02/d;", "baseNavReducer", "Ltr2/n;", "logger", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/o0;Leb/a0;Lo02/d;Ltr2/n;Lj02/i0;)V", "Lm91/u;", "Ll83/a0;", "c", "(Lm91/u;)V", "Lj02/m0;", "navigationScreen", "b", "(Lj02/m0;)V", "Lcv1/a$i;", NotificationCompat.CATEGORY_EVENT, "e", "(Lcv1/a$i;)V", "a", "Lj02/o0;", "Leb/a0;", "Ltr2/n;", "d", "Lj02/i0;", "Lo02/d;", "navigationReducer", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3673c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    public C3673c(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC27353d baseNavReducer, InterfaceC34116n logger, C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(baseNavReducer, "baseNavReducer");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navigator = navigator;
        this.navController = navController;
        this.logger = logger;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.navigationReducer = AbstractC27355f.m82533a(baseNavReducer, new C3595n(14));
    }

    /* JADX INFO: renamed from: b */
    private final void m11358b(AbstractC21155m0 navigationScreen) {
        if (!(navigationScreen instanceof AbstractC21155m0.k0)) {
            this.navigator.mo59393b(navigationScreen);
            return;
        }
        AbstractC21155m0.k0 k0Var = (AbstractC21155m0.k0) navigationScreen;
        String strEncode = Uri.encode(k0Var.getPath());
        String str = k0Var.m59170d().get("sku");
        if (str == null) {
            str = "";
        }
        String strEncode2 = Uri.encode(str);
        String str2 = k0Var.m59170d().get("promo_code");
        if (str2 == null) {
            str2 = "";
        }
        String strEncode3 = Uri.encode(str2);
        String str3 = k0Var.m59170d().get("new_tier");
        String strEncode4 = Uri.encode(str3 != null ? str3 : "");
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/extensions?isFromLto=true&path=", strEncode, "&sku=", strEncode2, "&promoCode=");
        sbM32001t.append(strEncode3);
        sbM32001t.append("&newTier=");
        sbM32001t.append(strEncode4);
        this.navController.m36404s(c21147i0.m58994a(sbM32001t.toString()));
    }

    /* JADX INFO: renamed from: c */
    private final void m11359c(InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u instanceof C27256h) {
            InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(((C27256h) interfaceC25312u).getDestination().getParameters());
            AbstractC22676k.m65748h(interfaceC21134cMo67681a, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
            m11358b((AbstractC21155m0) interfaceC21134cMo67681a);
        } else {
            this.logger.mo85226q("Unhandled ItemViewState for app-driven navigation: " + interfaceC25312u, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m11360d(C27354e buildNavigationReducer) {
        AbstractC22676k.m65750j(buildNavigationReducer, "$this$buildNavigationReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public final void m11361e(InterfaceC11144a.i event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC11144a.c) {
            this.navigator.mo59392a(((InterfaceC11144a.c) event).getNavAction());
        } else if (event instanceof InterfaceC11144a.b) {
            m11359c(((InterfaceC11144a.b) event).getItemViewState());
        } else {
            if (!(event instanceof InterfaceC11144a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
        }
    }

    public /* synthetic */ C3673c(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, InterfaceC27353d interfaceC27353d, InterfaceC34116n interfaceC34116n, C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, interfaceC27353d, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LimitedTimeOfferNavigationRouter") : interfaceC34116n, (i13 & 16) != 0 ? new C21147i0() : c21147i0);
    }
}
