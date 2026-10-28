package sz1;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import mz1.AbstractC26041d;
import or2.AbstractC28152c1;
import p000.AbstractC11266d;
import p114eb.C12969k0;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sz1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lsz1/b;", "Lj02/k0;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Lj02/i0;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33237b implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C33237b(FeatureFlagChecker featureFlagChecker, C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.featureFlagChecker = featureFlagChecker;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) throws UnsupportedEncodingException {
        String strM30461o;
        String strM30461o2;
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (navigationScreen instanceof AbstractC21155m0.i3) {
            AbstractC21155m0.i3 i3Var = (AbstractC21155m0.i3) navigationScreen;
            String source = i3Var.getSource();
            if (source == null) {
                source = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
            } else {
                if (AbstractC39414r.m125890i0(source)) {
                    source = null;
                }
                if (source == null) {
                    source = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                }
            }
            C12969k0 c12969k0M58994a = this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/nativeStore?source=".concat(source));
            C12997x0 navOptions = i3Var.getNavOptions();
            if (navOptions == null) {
                navOptions = AbstractC26041d.m77465c(i3Var.getSource(), this.featureFlagChecker) ? AbstractC28152c1.m85187e(new C12995w0()).m36508a() : AbstractC28152c1.m85186d(new C12995w0()).m36508a();
            }
            return new InterfaceC21149j0.c(c12969k0M58994a, navOptions, AbstractC21161p0.d.f80690a);
        }
        if (!(navigationScreen instanceof AbstractC21155m0.u3)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.u3 u3Var = (AbstractC21155m0.u3) navigationScreen;
        String slug = u3Var.getSlug();
        Charset charset = AbstractC39397a.f169546a;
        String strEncode = URLEncoder.encode(slug, charset.name());
        String sku = u3Var.getSku();
        String str = "";
        if (sku == null || (strM30461o = AbstractC11266d.m30461o("&sku=", URLEncoder.encode(sku, charset.name()))) == null) {
            strM30461o = "";
        }
        String source2 = u3Var.getSource();
        if (source2 != null && (strM30461o2 = AbstractC11266d.m30461o("&source=", URLEncoder.encode(source2, charset.name()))) != null) {
            str = strM30461o2;
        }
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/nativeShopPdp?slug=" + strEncode + strM30461o + str), AbstractC28152c1.m85188f(new C12995w0()).m36508a(), AbstractC21161p0.d.f80690a);
    }

    public /* synthetic */ C33237b(FeatureFlagChecker featureFlagChecker, C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, (i13 & 2) != 0 ? new C21147i0() : c21147i0);
    }
}
