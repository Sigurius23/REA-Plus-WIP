package f72;

import androidx.core.app.NotificationCompat;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: f72.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lf72/d;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Leb/a0;Lj02/o0;Lj02/i0;)V", "", "a", "()Ljava/lang/String;", "Lf72/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lf72/b;)V", "Leb/a0;", "Lj02/o0;", "c", "Lj02/i0;", "d", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14229d {

    /* JADX INFO: renamed from: e */
    public static final int f51980e = 8;

    /* JADX INFO: renamed from: f */
    private static final String f51981f = "Education Tile";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C14229d(AbstractC12939a0 navController, InterfaceC21159o0 navigator, C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navController = navController;
        this.navigator = navigator;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX INFO: renamed from: a */
    private final String m40697a() {
        return "android-app://com.whoop/onboardingStoriesFragmentRedesign/SAGE_ONBOARDING";
    }

    /* JADX INFO: renamed from: b */
    public final void m40698b(AbstractC14227b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC14227b.b.f51971a)) {
            this.navController.m36410z();
            return;
        }
        if (event.equals(AbstractC14227b.d.f51974a)) {
            this.navController.m36404s(this.navDeepLinkRequestHelper.m58994a(m40697a()));
            return;
        }
        if (event instanceof AbstractC14227b.c) {
            this.navigator.mo59392a(((AbstractC14227b.c) event).getNavigationAction());
            return;
        }
        if (!(event instanceof AbstractC14227b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14227b.a aVar = (AbstractC14227b.a) event;
        String strM125926K = AbstractC39421y.m125926K(aVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getId(), "&", "%26", false);
        InterfaceC21159o0 interfaceC21159o0 = this.navigator;
        String tag = aVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getTag();
        if (tag == null) {
            tag = "";
        }
        interfaceC21159o0.mo59393b(new AbstractC21155m0.f3(strM125926K, tag, f51981f, null, null, 24, null));
    }

    public /* synthetic */ C14229d(AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0, C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12939a0, interfaceC21159o0, (i13 & 4) != 0 ? new C21147i0() : c21147i0);
    }
}
