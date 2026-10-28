package pb2;

import androidx.core.app.NotificationCompat;
import j02.InterfaceC21159o0;
import lb2.AbstractC23754a;
import lb2.C23755b;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pb2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpb2/c;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Llb2/b;", "analyticsHelper", "<init>", "(Leb/a0;Lj02/o0;Llb2/b;)V", "Lpb2/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lpb2/a;)V", "Leb/a0;", "b", "Lj02/o0;", "c", "Llb2/b;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29060c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23755b analyticsHelper;

    public C29060c(AbstractC12939a0 navController, InterfaceC21159o0 navigator, C23755b analyticsHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.navController = navController;
        this.navigator = navigator;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    public final void m88339a(AbstractC29058a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC29058a.a) {
            this.navController.m36410z();
        } else {
            if (!(event instanceof AbstractC29058a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC29058a.b bVar = (AbstractC29058a.b) event;
            this.analyticsHelper.m69804a(new AbstractC23754a.a(null, bVar.getTrackId(), bVar.getPromotion(), null, 9, null));
            this.navigator.mo59392a(bVar.getAction());
        }
    }
}
