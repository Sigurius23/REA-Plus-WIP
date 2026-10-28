package com.whoop.profile.navigation;

import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import p114eb.C12969k0;
import p114eb.C12995w0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/profile/navigation/ProfileNavigationProvider;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "Lj02/i0;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileNavigationProvider implements InterfaceC21151k0 {
    public static final int $stable = C21147i0.f80230a;
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileNavigationProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.w3)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.w3 w3Var = (AbstractC21155m0.w3) navigationScreen;
        String source = w3Var.getSource();
        C21147i0 c21147i0 = this.navDeepLinkRequestHelper;
        Integer num = w3Var.getCom.whoop.profile.domain.ProfileApiKt.TARGET_USER_ID_PARAM java.lang.String();
        Integer num2 = w3Var.getCom.whoop.profile.domain.ProfileApiKt.COMMUNITY_ID_PARAM java.lang.String();
        String educationType = w3Var.getEducationType();
        String strConcat = educationType != null ? "&educationType=".concat(educationType) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        C12969k0 c12969k0M58994a = c21147i0.m58994a("android-app://com.whoop/profileFoundation?source=" + source + "&targetUserId=" + num + "&communityId=" + num2 + strConcat);
        C12995w0 c12995w0M95631g = AbstractC31061c.m95631g();
        c12995w0M95631g.f44891a = true;
        return new InterfaceC21149j0.c(c12969k0M58994a, c12995w0M95631g.m36508a(), null, 4, null);
    }

    public ProfileNavigationProvider(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    public /* synthetic */ ProfileNavigationProvider(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
