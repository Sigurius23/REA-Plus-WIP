package a02;

import androidx.core.app.NotificationCompat;
import ao2.C1876a;
import ao2.C1877b;
import b02.InterfaceC2199c;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wz1.C37781a;

/* JADX INFO: renamed from: a02.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"La02/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lao2/a;", "cartIndicatorRepository", "Lwz1/a;", "analyticsHelper", "<init>", "(Leb/a0;Lj02/o0;Lao2/a;Lwz1/a;)V", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "", "storeDomain", "Lj02/m0$i5;", "c", "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;)Lj02/m0$i5;", "Lb02/c$i;", NotificationCompat.CATEGORY_EVENT, "productName", "price", "Ll83/a0;", "a", "(Lb02/c$i;Ljava/lang/String;Ljava/lang/String;)V", "b", "Leb/a0;", "Lj02/o0;", "Lao2/a;", "d", "Lwz1/a;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0097b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C1876a cartIndicatorRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37781a analyticsHelper;

    public C0097b(AbstractC12939a0 navController, InterfaceC21159o0 navigator, C1876a cartIndicatorRepository, C37781a analyticsHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(cartIndicatorRepository, "cartIndicatorRepository");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.navController = navController;
        this.navigator = navigator;
        this.cartIndicatorRepository = cartIndicatorRepository;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    private final void m263a(InterfaceC2199c.i event, String productName, String price) {
        if (productName == null) {
            return;
        }
        if (AbstractC22676k.m65745e(event, InterfaceC2199c.b.f8745a)) {
            this.analyticsHelper.m121242g(productName, price);
            return;
        }
        if (event instanceof InterfaceC2199c.a) {
            this.analyticsHelper.m121239a(productName, price);
            return;
        }
        if (event instanceof InterfaceC2199c.d) {
            this.analyticsHelper.m121240b(productName, price);
        } else if (event instanceof InterfaceC2199c.e) {
            this.analyticsHelper.m121241e(productName, price);
        } else if (!(event instanceof InterfaceC2199c.c)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC21155m0.i5 m264c(CartAddIntent cartAddIntent, String str) {
        if (cartAddIntent instanceof CartAddIntent.Standalone) {
            return new AbstractC21155m0.i5(((CartAddIntent.Standalone) cartAddIntent).getSku(), null, null, null, null, null, null, null, str, 254, null);
        }
        if (cartAddIntent instanceof CartAddIntent.Pack) {
            CartAddIntent.Pack pack = (CartAddIntent.Pack) cartAddIntent;
            return new AbstractC21155m0.i5(null, pack.getPackSku(), pack.getChildItemSkus(), null, null, null, null, null, str, 249, null);
        }
        if (!(cartAddIntent instanceof CartAddIntent.Wyw)) {
            throw new NoWhenBranchMatchedException();
        }
        CartAddIntent.Wyw wyw = (CartAddIntent.Wyw) cartAddIntent;
        return new AbstractC21155m0.i5(null, null, null, wyw.getWywSku(), wyw.getBandSku(), wyw.getClaspSku(), wyw.getHookSku(), wyw.getFastLinkSku(), str, 7, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m265b(InterfaceC2199c.i event, String productName, String price) {
        AbstractC22676k.m65750j(event, "event");
        m263a(event, productName, price);
        if (event.equals(InterfaceC2199c.b.f8745a)) {
            this.navController.m36410z();
            return;
        }
        if (event instanceof InterfaceC2199c.a) {
            this.navigator.mo59393b(new AbstractC21155m0.j5(((C1877b) this.cartIndicatorRepository.getState().getValue()).getCartId(), null, null, CartAddIntent.INSTANCE.m27608d(((InterfaceC2199c.a) event).getIntent()), 6, null));
        } else if (event instanceof InterfaceC2199c.d) {
            InterfaceC2199c.d dVar = (InterfaceC2199c.d) event;
            this.navigator.mo59393b(m264c(dVar.getIntent(), dVar.getStoreDomain()));
        } else if (event instanceof InterfaceC2199c.e) {
            this.navigator.mo59392a(((InterfaceC2199c.e) event).getNavAction());
        } else {
            if (!(event instanceof InterfaceC2199c.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59392a(((InterfaceC2199c.c) event).getNavAction());
        }
    }
}
