package a42;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import com.whoop.pregnancy.view.AbstractC9684a;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12991u0;
import p114eb.C12992v;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p114eb.C12999y0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a42.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"La42/a;", "", "Landroid/app/Activity;", "activity", "Leb/a0;", "globalNavController", "Leb/u0;", "composeNavController", "Lj02/o0;", "navigator", "Lor2/y;", "externalLinkNavigator", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Landroid/app/Activity;Leb/a0;Leb/u0;Lj02/o0;Lor2/y;Lj02/i0;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Ljava/lang/Object;)V", "Landroid/app/Activity;", "b", "Leb/a0;", "c", "Leb/u0;", "d", "Lj02/o0;", "e", "Lor2/y;", "f", "Lj02/i0;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0378a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 globalNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12991u0 composeNavController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C0378a(Activity activity, AbstractC12939a0 globalNavController, C12991u0 composeNavController, InterfaceC21159o0 navigator, C28216y externalLinkNavigator, C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.activity = activity;
        this.globalNavController = globalNavController;
        this.composeNavController = composeNavController;
        this.navigator = navigator;
        this.externalLinkNavigator = externalLinkNavigator;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    /* JADX INFO: renamed from: b */
    private static final C23454a0 m1046b(C12999y0 navOptions) {
        AbstractC22676k.m65750j(navOptions, "$this$navOptions");
        navOptions.m36510b("SETTINGS_HOME", C12992v.f44877G);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    private static final C23454a0 m1047c(C12999y0 navOptions) {
        AbstractC22676k.m65750j(navOptions, "$this$navOptions");
        navOptions.f44915b = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a */
    public final void m1048a(Object event) {
        if (event instanceof C9598e) {
            this.navigator.mo59392a((C9598e) event);
            return;
        }
        if (AbstractC22676k.m65745e(event, AbstractC9684a.a.f28310a)) {
            this.composeNavController.m36410z();
            return;
        }
        if (event instanceof AbstractC9684a.b) {
            this.navigator.mo59393b(new AbstractC21155m0.w1("PREGNANCY_INSIGHTS_DATA_PRIVACY", "Pregnancy Settings", ((AbstractC9684a.b) event).getUrl(), null, 8, null));
            return;
        }
        C12997x0 c12997x0M36508a = null;
        if (event instanceof AbstractC9684a.c) {
            AbstractC9684a.c cVar = (AbstractC9684a.c) event;
            if (cVar.getShouldPopUpHome()) {
                C12999y0 c12999y0 = new C12999y0();
                m1046b(c12999y0);
                boolean z4 = c12999y0.f44915b;
                C12995w0 c12995w0 = c12999y0.f44914a;
                c12995w0.f44891a = z4;
                c12995w0.f44892b = c12999y0.f44916c;
                String str = c12999y0.f44918e;
                if (str != null) {
                    boolean z13 = c12999y0.f44919f;
                    boolean z14 = c12999y0.f44920g;
                    c12995w0.f44894d = str;
                    c12995w0.f44893c = -1;
                    c12995w0.f44895e = z13;
                    c12995w0.f44896f = z14;
                } else {
                    int i13 = c12999y0.f44917d;
                    boolean z15 = c12999y0.f44919f;
                    boolean z16 = c12999y0.f44920g;
                    c12995w0.f44893c = i13;
                    c12995w0.f44894d = null;
                    c12995w0.f44895e = z15;
                    c12995w0.f44896f = z16;
                }
                c12997x0M36508a = c12995w0.m36508a();
            }
            AbstractC12939a0.m36374y(this.composeNavController, cVar.getDestination(), c12997x0M36508a, 4);
            return;
        }
        if (AbstractC22676k.m65745e(event, AbstractC9684a.d.f28314a)) {
            this.globalNavController.m36410z();
            this.navigator.mo59393b(new AbstractC21155m0.q3("", null, null, 4, null));
            return;
        }
        if (event instanceof AbstractC9684a.e) {
            C12969k0 c12969k0M58994a = this.navDeepLinkRequestHelper.m58994a(((AbstractC9684a.e) event).getDeeplink());
            this.globalNavController.m36410z();
            this.globalNavController.m36404s(c12969k0M58994a);
            return;
        }
        if (event instanceof AbstractC9684a.f) {
            this.globalNavController.m36410z();
            AbstractC9684a.f fVar = (AbstractC9684a.f) event;
            if (!AbstractC22676k.m65745e(fVar.getSource(), "pregInsights") || fVar.getIsPregInsightsEnabled()) {
                return;
            }
            this.globalNavController.m36410z();
            return;
        }
        if (!AbstractC22676k.m65745e(event, AbstractC9684a.g.f28318a)) {
            if (event instanceof AbstractC9684a.h) {
                this.composeNavController.m36410z();
                C28216y.m85414y(this.externalLinkNavigator, this.activity, ((AbstractC9684a.h) event).getCtaUrl(), false, 4, null);
                return;
            }
            return;
        }
        C12991u0 c12991u0 = this.composeNavController;
        C12999y0 c12999y1 = new C12999y0();
        m1047c(c12999y1);
        boolean z17 = c12999y1.f44915b;
        C12995w0 c12995w1 = c12999y1.f44914a;
        c12995w1.f44891a = z17;
        c12995w1.f44892b = c12999y1.f44916c;
        String str2 = c12999y1.f44918e;
        if (str2 != null) {
            boolean z18 = c12999y1.f44919f;
            boolean z19 = c12999y1.f44920g;
            c12995w1.f44894d = str2;
            c12995w1.f44893c = -1;
            c12995w1.f44895e = z18;
            c12995w1.f44896f = z19;
        } else {
            int i14 = c12999y1.f44917d;
            boolean z24 = c12999y1.f44919f;
            boolean z25 = c12999y1.f44920g;
            c12995w1.f44893c = i14;
            c12995w1.f44894d = null;
            c12995w1.f44895e = z24;
            c12995w1.f44896f = z25;
        }
        AbstractC12939a0.m36374y(c12991u0, "SETTINGS_HOME", c12995w1.m36508a(), 4);
    }

    public /* synthetic */ C0378a(Activity activity, AbstractC12939a0 abstractC12939a0, C12991u0 c12991u0, InterfaceC21159o0 interfaceC21159o0, C28216y c28216y, C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, abstractC12939a0, c12991u0, interfaceC21159o0, c28216y, (i13 & 32) != 0 ? new C21147i0() : c21147i0);
    }
}
