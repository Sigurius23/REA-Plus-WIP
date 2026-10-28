package oo2;

import androidx.core.app.NotificationCompat;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import ho2.C17538a;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import o02.AbstractC27355f;
import o02.C27354e;
import o02.InterfaceC27353d;
import o72.C27644e;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import po2.InterfaceC29402a;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: oo2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Loo2/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "navHostController", "Lho2/a;", "analyticsHelper", "Lo02/d;", "baseNavReducer", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Leb/a0;Lho2/a;Lo02/d;Ltr2/n;)V", "Lm91/u;", "Ll83/a0;", "b", "(Lm91/u;)V", "Lpo2/a$s;", NotificationCompat.CATEGORY_EVENT, "d", "(Lpo2/a$s;)V", "a", "Lj02/o0;", "Leb/a0;", "c", "Lho2/a;", "e", "Ltr2/n;", "f", "Lo02/d;", "navigationReducer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28068c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC12939a0 navHostController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17538a analyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    public C28068c(InterfaceC21159o0 navigator, AbstractC12939a0 navController, AbstractC12939a0 navHostController, C17538a analyticsHelper, InterfaceC27353d baseNavReducer, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navHostController, "navHostController");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(baseNavReducer, "baseNavReducer");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.navHostController = navHostController;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
        this.navigationReducer = AbstractC27355f.m82533a(baseNavReducer, new C27644e(16));
    }

    /* JADX INFO: renamed from: b */
    private final void m84845b(InterfaceC25312u interfaceC25312u) {
        this.logger.mo85228t("itemClicked " + interfaceC25312u, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m84846c(C27354e buildNavigationReducer) {
        AbstractC22676k.m65750j(buildNavigationReducer, "$this$buildNavigationReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final void m84847d(InterfaceC29402a.s event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC29402a.d) {
            InterfaceC29402a.d dVar = (InterfaceC29402a.d) event;
            InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(dVar.getNavAction().getParameters());
            AbstractC22676k.m65748h(interfaceC21134cMo67681a, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
            AbstractC21155m0 abstractC21155m0 = (AbstractC21155m0) interfaceC21134cMo67681a;
            if (abstractC21155m0 instanceof AbstractC21155m0.m5) {
                UniversalCheckoutDestination.C10632d.m27508g(UniversalCheckoutDestination.C10632d.f32385a, this.navHostController, ((AbstractC21155m0.m5) abstractC21155m0).getCartId(), null, 2, null);
                return;
            } else if (abstractC21155m0 instanceof AbstractC21155m0.n5) {
                UniversalCheckoutDestination.C10633e.f32389a.m27517e(this.navHostController, ((AbstractC21155m0.n5) abstractC21155m0).getCartId());
                return;
            } else {
                this.navigator.mo59392a(dVar.getNavAction());
                return;
            }
        }
        if (event instanceof InterfaceC29402a.x) {
            this.navigator.mo59394d(((InterfaceC29402a.x) event).getNavAction());
            return;
        }
        if (event instanceof InterfaceC29402a.b) {
            m84845b(((InterfaceC29402a.b) event).getItemViewState());
            return;
        }
        if (event instanceof InterfaceC29402a.m) {
            InterfaceC29402a.a aVarM27488a = UniversalCheckoutDestination.C10629a.f32377a.m27488a(this.navController);
            if (aVarM27488a != null) {
                this.analyticsHelper.m49843a(aVarM27488a);
                return;
            }
            return;
        }
        if (event instanceof InterfaceC29402a.q) {
            UniversalCheckoutDestination.C10631c.f32382a.m27502g(this.navHostController, ((InterfaceC29402a.q) event).getCartId());
            return;
        }
        if (event instanceof InterfaceC29402a.p) {
            InterfaceC29402a.p pVar = (InterfaceC29402a.p) event;
            this.analyticsHelper.m49843a(new InterfaceC29402a.z(pVar.getSource(), pVar.m89630a()));
            UniversalCheckoutDestination.C10630b.f32379a.m27492d(this.navHostController, pVar.getCartId());
        } else {
            if (!(event instanceof InterfaceC29402a.r)) {
                throw new NoWhenBranchMatchedException();
            }
            UniversalCheckoutDestination.C10632d.m27508g(UniversalCheckoutDestination.C10632d.f32385a, this.navHostController, ((InterfaceC29402a.r) event).getCartId(), null, 2, null);
        }
    }

    public /* synthetic */ C28068c(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, AbstractC12939a0 abstractC12939a1, C17538a c17538a, InterfaceC27353d interfaceC27353d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, abstractC12939a1, c17538a, interfaceC27353d, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UniversalCheckoutNavigationRouter") : interfaceC34116n);
    }
}
