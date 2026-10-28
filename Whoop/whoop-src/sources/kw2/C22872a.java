package kw2;

import androidx.core.app.NotificationCompat;
import gw2.C16269a;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kw2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkw2/a;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lgw2/a;", "analytics", "<init>", "(Leb/a0;Lj02/o0;Lgw2/a;)V", "Lkw2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lkw2/b;)V", "Leb/a0;", "b", "Lj02/o0;", "c", "Lgw2/a;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22872a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C16269a analytics;

    public C22872a(AbstractC12939a0 navController, InterfaceC21159o0 navigator, C16269a analytics) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.navController = navController;
        this.navigator = navigator;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m66455a(InterfaceC22873b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC22873b.b) {
            this.navController.m36410z();
            return;
        }
        if (!(event instanceof InterfaceC22873b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC22873b.a aVar = (InterfaceC22873b.a) event;
        if (aVar.getIsMilestone()) {
            this.analytics.m46086a(true, aVar.getMilestoneId());
        } else {
            this.analytics.m46087b(aVar.getNavigationAction().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName());
        }
        this.navigator.mo59392a(aVar.getNavigationAction());
    }
}
