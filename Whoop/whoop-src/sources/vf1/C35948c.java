package vf1;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import j02.InterfaceC21159o0;
import ny0.C27256h;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import rf1.AbstractC31358b;
import tr2.InterfaceC34116n;
import wf1.InterfaceC37243a;

/* JADX INFO: renamed from: vf1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lvf1/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lfi0/a;", "analytics", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Lfi0/a;Ltr2/n;)V", "Lm91/u;", "Ll83/a0;", "a", "(Lm91/u;)V", "Lwf1/a$h;", NotificationCompat.CATEGORY_EVENT, "b", "(Lwf1/a$h;)V", "Lj02/o0;", "Leb/a0;", "c", "Lfi0/a;", "d", "Ltr2/n;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35948c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C35948c(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC14515a analytics, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.analytics = analytics;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final void m114191a(InterfaceC25312u interfaceC25312u) {
        if (!(interfaceC25312u instanceof C27256h)) {
            this.logger.mo85226q("Unhandled ItemViewState for app-driven navigation: " + interfaceC25312u, new AbstractC30556a.a[0]);
            return;
        }
        C27256h c27256h = (C27256h) interfaceC25312u;
        if (!AbstractC22676k.m65745e(c27256h.getId(), "al_keep_subscription_button")) {
            this.navigator.mo59392a(c27256h.getDestination());
        } else {
            AbstractC31358b.m96431a(this.analytics);
            this.navController.m36410z();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m114192b(InterfaceC37243a.h event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC37243a.c) {
            this.navigator.mo59392a(((InterfaceC37243a.c) event).getNavAction());
        } else if (event instanceof InterfaceC37243a.b) {
            m114191a(((InterfaceC37243a.b) event).getItemViewState());
        } else {
            if (!(event instanceof InterfaceC37243a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
        }
    }

    public /* synthetic */ C35948c(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, InterfaceC14515a interfaceC14515a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, interfaceC14515a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("FeedbackSurveyNavigationRouter") : interfaceC34116n);
    }
}
