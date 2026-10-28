package se0;

import androidx.core.app.NotificationCompat;
import j02.C21147i0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: se0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lse0/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Leb/a0;Lj02/o0;Lj02/i0;)V", "", "a", "()Ljava/lang/String;", "Lse0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lse0/a;)V", "Leb/a0;", "Lj02/o0;", "c", "Lj02/i0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32420b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C32420b(AbstractC12939a0 navController, InterfaceC21159o0 navigator, C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navController = navController;
        this.navigator = navigator;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX INFO: renamed from: a */
    private final String m101219a() {
        return "android-app://com.whoop/onboardingStoriesFragmentRedesign/GALLERI_ONBOARDING";
    }

    /* JADX INFO: renamed from: b */
    public final void m101220b(AbstractC32419a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC32419a.a) {
            this.navController.m36410z();
            return;
        }
        if (event instanceof AbstractC32419a.b) {
            this.navController.m36404s(this.navDeepLinkRequestHelper.m58994a(m101219a()));
        } else {
            if (!(event instanceof AbstractC32419a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59392a(((AbstractC32419a.c) event).getNavigationAction());
        }
    }

    public /* synthetic */ C32420b(AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0, C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12939a0, interfaceC21159o0, (i13 & 4) != 0 ? new C21147i0() : c21147i0);
    }
}
