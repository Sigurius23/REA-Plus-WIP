package x12;

import android.net.Uri;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: x12.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lx12/a;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "Lj02/i0;", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37830a implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: b */
    public static final int f161987b = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C37830a(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX INFO: renamed from: a */
    private final String m121372a(String str) {
        if (str == null) {
            str = "";
        }
        String strEncode = Uri.encode(str);
        AbstractC22676k.m65749i(strEncode, "encode(...)");
        return strEncode;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.w0)) {
            return InterfaceC21149j0.d.f80241a;
        }
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        AbstractC21155m0.w0 w0Var = (AbstractC21155m0.w0) navigationScreen;
        String strM121372a = m121372a(w0Var.getFingerprint());
        String strM121372a2 = m121372a(w0Var.getSourceId());
        String strM121372a3 = m121372a(w0Var.getSourceType());
        String strM121372a4 = m121372a(w0Var.getSource());
        String strM121372a5 = m121372a(w0Var.getConversationSeedId());
        boolean dismissible = w0Var.getDismissible();
        String strM121372a6 = m121372a(w0Var.getHeaderMetaData());
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/day-zero-personalization?fingerprint=", strM121372a, "&sourceId=", strM121372a2, "&sourceType=");
        AbstractC11266d.m30444B(sbM32001t, strM121372a3, "&source=", strM121372a4, "&conversationSeedId=");
        AbstractC38963t7.m124390t(sbM32001t, strM121372a5, "&dismissible=", dismissible, "&headerMetaData=");
        sbM32001t.append(strM121372a6);
        return new InterfaceC21149j0.c(c21147i0.m58994a(sbM32001t.toString()), new C12997x0(true, false, -1, false, false, -1, -1, -1, -1), null, 4, null);
    }

    public /* synthetic */ C37830a(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
