package ix1;

import ax1.AbstractC2119a;
import ax1.C2120b;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import l83.C23465k;
import m83.AbstractC25247g0;
import nf1.AbstractC26660a;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ix1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lix1/b;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "Lax1/b;", "analyticsHelper", "<init>", "(Lj02/i0;Lax1/b;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "b", "Lax1/b;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21019b implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2120b analyticsHelper;

    public C21019b(C21147i0 navDeepLinkRequestHelper, C2120b analyticsHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.analyticsHelper = analyticsHelper;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) throws UnsupportedEncodingException {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (navigationScreen instanceof AbstractC21155m0.z2) {
            return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/membershipManagement?startDestination=MEMBERSHIP_AND_BILLING"), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105970o, -1, -1, AbstractC26660a.f105971p), AbstractC21161p0.d.f80690a);
        }
        if (navigationScreen instanceof AbstractC21155m0.x2) {
            AbstractC21155m0.x2 x2Var = (AbstractC21155m0.x2) navigationScreen;
            String trackingTier = x2Var.getTrackingTier();
            if (trackingTier != null) {
                this.analyticsHelper.m6690a(new AbstractC2119a.l(null, null, trackingTier, null, x2Var.getTrackingSource(), null, 43, null));
            }
            String strEncode = URLEncoder.encode(AbstractC21021d.m58593b(x2Var.m59340b().entrySet()), "UTF-8");
            return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/membershipManagement?startDestination=MEMBERSHIP_ADJUSTMENT_CHECKOUT&payload=" + strEncode), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105970o, -1, -1, AbstractC26660a.f105971p), AbstractC21161p0.d.f80690a);
        }
        if (navigationScreen instanceof AbstractC21155m0.a3) {
            return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/membershipManagement?startDestination=MEMBERSHIP_MANAGEMENT"), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105970o, -1, -1, AbstractC26660a.f105971p), AbstractC21161p0.d.f80690a);
        }
        if (!(navigationScreen instanceof AbstractC21155m0.k0)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.k0 k0Var = (AbstractC21155m0.k0) navigationScreen;
        String strEncode2 = URLEncoder.encode(AbstractC21021d.m58593b(AbstractC25247g0.m73990Y(new C23465k("path", k0Var.getPath()), new C23465k("payload", AbstractC21021d.m58593b(k0Var.m59170d().entrySet())), new C23465k("payment_method_id", k0Var.getPaymentMethodId()), new C23465k("skip_confirmation", k0Var.getSkipConfirmation()), new C23465k("category", k0Var.getCategory())).entrySet()), "UTF-8");
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/membershipManagement?startDestination=CHECKOUT&payload=" + strEncode2), new C12997x0(false, false, -1, false, false, AbstractC26660a.f105970o, -1, -1, AbstractC26660a.f105971p), AbstractC21161p0.d.f80690a);
    }

    public /* synthetic */ C21019b(C21147i0 c21147i0, C2120b c2120b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0, c2120b);
    }
}
