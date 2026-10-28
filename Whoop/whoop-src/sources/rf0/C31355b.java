package rf0;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import p088dc.AbstractC11895b;
import p114eb.C12969k0;
import p114eb.C12995w0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rf0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lrf0/b;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31355b implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: b */
    public static final int f129002b = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C31355b(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.m)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.m mVar = (AbstractC21155m0.m) navigationScreen;
        String source = mVar.getSource();
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
        String testCount = mVar.getTestCount();
        String str = "";
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
        String initiallySelectedSegmentId = mVar.getInitiallySelectedSegmentId();
        if (initiallySelectedSegmentId != null) {
            String str2 = AbstractC39414r.m125890i0(initiallySelectedSegmentId) ? null : initiallySelectedSegmentId;
            if (str2 != null) {
                str = str2;
            }
        }
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/advanced_labs_join?source=", source, "&test_count=", testCount, "&initially_selected_segment_id=");
        sbM32001t.append(str);
        C12969k0 c12969k0M58994a = c21147i0.m58994a(sbM32001t.toString());
        C12995w0 c12995w0M95631g = AbstractC31061c.m95631g();
        c12995w0M95631g.f44891a = true;
        return new InterfaceC21149j0.c(c12969k0M58994a, c12995w0M95631g.m36508a(), null, 4, null);
    }

    public /* synthetic */ C31355b(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
