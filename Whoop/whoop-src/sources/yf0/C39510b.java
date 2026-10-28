package yf0;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.AbstractC21155m0;
import j02.AbstractC21157n0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: yf0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lyf0/b;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39510b implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: b */
    public static final int f169927b = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C39510b(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.r)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.r rVar = (AbstractC21155m0.r) navigationScreen;
        String source = rVar.getSource();
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
        String testCount = rVar.getTestCount();
        if (testCount == null) {
            testCount = "";
        } else {
            if (AbstractC39414r.m125890i0(testCount)) {
                testCount = null;
            }
            if (testCount == null) {
                testCount = "";
            }
        }
        String strM59387c = AbstractC21157n0.m59387c(rVar.getNavigationStyle());
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/advanced_labs_purchase_add_ons?source=", source, "&test_count=", testCount, "&navigationStyle=");
        sbM32001t.append(strM59387c);
        return new InterfaceC21149j0.c(c21147i0.m58994a(sbM32001t.toString()), AbstractC21157n0.m59390f(strM59387c, false, 1, null), null, 4, null);
    }

    public /* synthetic */ C39510b(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
