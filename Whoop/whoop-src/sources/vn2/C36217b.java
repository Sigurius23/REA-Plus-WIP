package vn2;

import ad3.AbstractC0757c;
import ad3.C0755b;
import androidx.core.app.NotificationCompat;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CheckoutWithCartPayload;
import com.whoop.navigation.CheckoutWithCartScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.universalcheckout.features.buynow.navigation.UnusableCheckoutDestinationException;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.EnumC21177x0;
import j02.InterfaceC21159o0;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import wn2.EnumC37425c;
import wn2.InterfaceC37427e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vn2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0018\u0010\u0014\u001a\u00020\u0013*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010#¨\u0006%"}, m65681d2 = {"Lvn2/b;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lrr2/c;", "crashReporter", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Lrr2/c;Ltr2/n;)V", "Lcom/whoop/navigation/e;", "navAction", "", "description", "Ll83/a0;", "b", "(Lcom/whoop/navigation/e;Ljava/lang/String;)V", "Lj02/x0;", "autoTrigger", "Lj02/m0$k5;", "d", "(Lcom/whoop/navigation/e;Lj02/x0;)Lj02/m0$k5;", "Lwn2/e$d;", NotificationCompat.CATEGORY_EVENT, "", "c", "(Lwn2/e$d;)Z", "a", "Lj02/o0;", "Leb/a0;", "Lrr2/c;", "Ltr2/n;", "Lwn2/c;", "(Lwn2/c;)Lj02/x0;", "e", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36217b {

    /* JADX INFO: renamed from: e */
    private static final a f155054e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f155055f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vn2.b$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lvn2/b$a;", "", "<init>", "()V", "", "GET_METHOD", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vn2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155060a;

        static {
            int[] iArr = new int[EnumC37425c.values().length];
            try {
                iArr[EnumC37425c.SHIPPING_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37425c.PAYMENT_METHOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f155060a = iArr;
        }
    }

    public C36217b(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC31766c interfaceC31766c, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.crashReporter = interfaceC31766c;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final EnumC21177x0 m115282a(EnumC37425c enumC37425c) {
        int i13 = b.f155060a[enumC37425c.ordinal()];
        if (i13 == 1) {
            return EnumC21177x0.SHIPPING_ADDRESS;
        }
        if (i13 == 2) {
            return EnumC21177x0.PAYMENT_METHOD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    private final void m115283b(C9598e navAction, String description) {
        this.navController.m36410z();
        if (this.navigator.mo59392a(navAction) instanceof AbstractC21161p0.h) {
            this.logger.mo85222m("Unresolved destination for Buy Now " + description + ": " + navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), new AbstractC30556a.a[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX INFO: renamed from: d */
    private final AbstractC21155m0.k5 m115284d(C9598e c9598e, EnumC21177x0 enumC21177x0) {
        CheckoutWithCartPayload payload;
        String str;
        if (!AbstractC22676k.m65745e(c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9321h1.f27641w)) {
            return null;
        }
        NavigationScreenModel parameters = c9598e.getParameters();
        CheckoutWithCartScreenModel checkoutWithCartScreenModel = parameters instanceof CheckoutWithCartScreenModel ? (CheckoutWithCartScreenModel) parameters : null;
        if (checkoutWithCartScreenModel != null && (payload = checkoutWithCartScreenModel.getPayload()) != null) {
            if (AbstractC39414r.m125890i0(payload.getCartId())) {
                payload = null;
            }
            if (payload != null) {
                String path = checkoutWithCartScreenModel.getPath();
                C0755b c0755b = AbstractC0757c.f2762d;
                c0755b.getClass();
                String strM1833d = c0755b.m1833d(CheckoutWithCartPayload.INSTANCE.serializer(), payload);
                String source = checkoutWithCartScreenModel.getSource();
                String method = checkoutWithCartScreenModel.getMethod();
                if (method == null) {
                    str = "GET";
                } else {
                    str = AbstractC39414r.m125890i0(method) ? null : method;
                    if (str == null) {
                        str = "GET";
                    }
                }
                return new AbstractC21155m0.k5(path, strM1833d, source, str, enumC21177x0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m115285c(InterfaceC37427e.d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC37427e.a.f160177a)) {
            this.navController.m36410z();
            return true;
        }
        if (event instanceof InterfaceC37427e.j) {
            m115283b(((InterfaceC37427e.j) event).getNavAction(), "view full checkout");
            return true;
        }
        if (event instanceof InterfaceC37427e.e) {
            m115283b(((InterfaceC37427e.e) event).getCheckoutDestination(), "direct checkout");
            return true;
        }
        if (event instanceof InterfaceC37427e.h) {
            this.navController.m36410z();
            InterfaceC37427e.h hVar = (InterfaceC37427e.h) event;
            if (this.navigator.mo59393b(new AbstractC21155m0.l5(hVar.getCartId(), "buy_now")) instanceof AbstractC21161p0.h) {
                this.logger.mo85222m(AbstractC11895b.m31996o("Unresolved receipt for Buy Now order (cartId=", hVar.getCartId(), ")"), new AbstractC30556a.a[0]);
                return true;
            }
        } else {
            if (!(event instanceof InterfaceC37427e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC37427e.c cVar = (InterfaceC37427e.c) event;
            AbstractC21155m0.k5 k5VarM115284d = m115284d(cVar.getCheckoutDestination(), m115282a(cVar.getRow()));
            if (k5VarM115284d == null) {
                UnusableCheckoutDestinationException unusableCheckoutDestinationException = new UnusableCheckoutDestinationException(cVar.getCheckoutDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
                this.logger.mo85230v("Buy Now " + cVar.getRow() + " row has an unusable checkout_destination", unusableCheckoutDestinationException, new AbstractC30556a.a[0]);
                InterfaceC31766c interfaceC31766c = this.crashReporter;
                if (interfaceC31766c != null) {
                    interfaceC31766c.mo98631p(unusableCheckoutDestinationException);
                }
                return false;
            }
            this.navController.m36410z();
            if (this.navigator.mo59393b(k5VarM115284d) instanceof AbstractC21161p0.h) {
                this.logger.mo85222m("Unresolved checkout for Buy Now " + cVar.getRow() + " row", new AbstractC30556a.a[0]);
            }
        }
        return true;
    }

    public /* synthetic */ C36217b(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, InterfaceC31766c interfaceC31766c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, (i13 & 4) != 0 ? null : interfaceC31766c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BuyNowNavigationRouter") : interfaceC34116n);
    }
}
