package jd0;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.items.ArticleTileCarouselModelKt;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.navigation.C9598e;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.C21166s;
import j02.InterfaceC21159o0;
import java.net.URLEncoder;
import kd0.InterfaceC22381a;
import lf0.C23908d1;
import ny0.C27256h;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import tr2.InterfaceC34116n;
import ya0.C39355a;

/* JADX INFO: renamed from: jd0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u001dB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"¨\u0006$"}, m65681d2 = {"Ljd0/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lj02/i0;", "navDeepLinkRequestHelper", "Ltr2/n;", "logger", "Lya0/a;", "analyticsHelper", "<init>", "(Lj02/o0;Leb/a0;Lj02/i0;Ltr2/n;Lya0/a;)V", "Lj02/s;", "dismissalType", "Ll83/a0;", "c", "(Lj02/s;)V", "Lm91/u;", "b", "(Lm91/u;)V", "", "d", "()Ljava/lang/String;", "Lkd0/a$a0;", NotificationCompat.CATEGORY_EVENT, "e", "(Lkd0/a$a0;)V", "a", "Lj02/o0;", "Leb/a0;", "Lj02/i0;", "Ltr2/n;", "Lya0/a;", "f", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21610c {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final int f82943g = 8;

    /* JADX INFO: renamed from: h */
    private static final String f82944h = "Advanced Labs";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C39355a analyticsHelper;

    /* JADX INFO: renamed from: jd0.c$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ljd0/c$a;", "", "<init>", "()V", "", "ADVANCED_LABS", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m60775a() {
            return C21610c.f82944h;
        }

        private Companion() {
        }
    }

    public C21610c(InterfaceC21159o0 navigator, AbstractC12939a0 navController, C21147i0 navDeepLinkRequestHelper, InterfaceC34116n logger, C39355a analyticsHelper) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.navigator = navigator;
        this.navController = navController;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: b */
    private final void m60771b(InterfaceC25312u interfaceC25312u) {
        C9598e destination;
        if (interfaceC25312u instanceof C27256h) {
            this.navigator.mo59392a(((C27256h) interfaceC25312u).getDestination());
        } else {
            if (!(interfaceC25312u instanceof C23908d1) || (destination = ((C23908d1) interfaceC25312u).getDestination()) == null) {
                return;
            }
            this.navigator.mo59392a(destination);
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m60772c(C21166s dismissalType) {
        AbstractC9597d.m23112d(this.navController, dismissalType.getPopUpTo(), dismissalType.getPopBackCount(), this.logger);
    }

    /* JADX INFO: renamed from: d */
    private final String m60773d() {
        return "android-app://com.whoop/onboardingStoriesFragmentRedesign/ADVANCED_LABS_EARLY_ACCESS_ONBOARDING";
    }

    /* JADX INFO: renamed from: e */
    public final void m60774e(InterfaceC22381a.a0 event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC22381a.j) {
            this.navigator.mo59392a(((InterfaceC22381a.j) event).getNavAction());
            return;
        }
        if (event instanceof InterfaceC22381a.d) {
            m60771b(((InterfaceC22381a.d) event).getItemViewState());
            return;
        }
        if (event instanceof InterfaceC22381a.h) {
            InterfaceC22381a.h hVar = (InterfaceC22381a.h) event;
            if (ArticleTileCarouselModelKt.isVideo(hVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getType())) {
                this.navigator.mo59393b(new AbstractC21155m0.g3(hVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getUrl()));
                return;
            }
            String strEncode = URLEncoder.encode(hVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getId(), "UTF-8");
            InterfaceC21159o0 interfaceC21159o0 = this.navigator;
            AbstractC22676k.m65747g(strEncode);
            String tag = hVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getTag();
            if (tag == null) {
                tag = "";
            }
            interfaceC21159o0.mo59393b(new AbstractC21155m0.f3(strEncode, tag, f82944h, null, null, 24, null));
            return;
        }
        if (event instanceof InterfaceC22381a.y) {
            this.navController.m36404s(this.navDeepLinkRequestHelper.m58994a(m60773d()));
            return;
        }
        if (event instanceof InterfaceC22381a.t) {
            this.analyticsHelper.m125496e(InterfaceC22381a.z0.f87460a);
            this.navController.m36410z();
        } else if (event instanceof InterfaceC22381a.i0) {
            m60772c(((InterfaceC22381a.i0) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        } else if (event instanceof InterfaceC22381a.z) {
            this.navigator.mo59393b(new AbstractC21155m0.f5(((InterfaceC22381a.z) event).getTrendId(), null, null, null, 0, false, null, 126, null));
        } else {
            if (!(event instanceof InterfaceC22381a.h1)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59393b(new AbstractC21155m0.z(null, null, ((InterfaceC22381a.h1) event).getMessage(), null, null, null, null, null, false, null, null, null, 4091, null));
        }
    }

    public /* synthetic */ C21610c(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, C21147i0 c21147i0, InterfaceC34116n interfaceC34116n, C39355a c39355a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, (i13 & 4) != 0 ? new C21147i0() : c21147i0, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AdvancedLabsNavigationRouter") : interfaceC34116n, c39355a);
    }
}
