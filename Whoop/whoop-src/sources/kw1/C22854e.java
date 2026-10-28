package kw1;

import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kw1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lkw1/e;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "", "promoCode", "", "isOnTrial", "isReactivationUpsell", "Lj02/j0;", "a", "(Ljava/lang/String;ZZ)Lj02/j0;", "Lj02/m0;", "navigationScreen", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "Lj02/i0;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22854e implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: b */
    public static final int f90104b = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C22854e(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC21149j0 m66335a(String promoCode, boolean isOnTrial, boolean isReactivationUpsell) {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("android-app://com.whoop/extensions?promoCode=", promoCode, "&isOnTrial=", "&isReactivationUpsell=", isOnTrial);
        sbM73379l.append(isReactivationUpsell);
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(sbM73379l.toString()), null, null, 6, null);
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (navigationScreen instanceof AbstractC21155m0.z3) {
            return m66335a(null, false, true);
        }
        if (!(navigationScreen instanceof AbstractC21155m0.f1)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.f1 f1Var = (AbstractC21155m0.f1) navigationScreen;
        return m66335a(f1Var.getPromoCode(), f1Var.getIsOnTrial(), false);
    }

    public /* synthetic */ C22854e(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
