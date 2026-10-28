package kw0;

import androidx.core.app.NotificationCompat;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import s01.EnumC32045a;

/* JADX INFO: renamed from: kw0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lkw0/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "", "sleepId", "<init>", "(Leb/a0;Lj02/o0;Ljava/lang/String;)V", "Lkw0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lkw0/a;)V", "Leb/a0;", "b", "Lj02/o0;", "c", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22849b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String sleepId;

    public C22849b(AbstractC12939a0 navController, InterfaceC21159o0 navigator, String sleepId) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(sleepId, "sleepId");
        this.navController = navController;
        this.navigator = navigator;
        this.sleepId = sleepId;
    }

    /* JADX INFO: renamed from: a */
    public final void m66287a(AbstractC22848a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC22848a.a.f90080a)) {
            this.navController.m36410z();
            return;
        }
        if (event instanceof AbstractC22848a.b) {
            this.navigator.mo59393b(new AbstractC21155m0.z(null, null, ((AbstractC22848a.b) event).getMessage(), this.sleepId, "VoW_Sleep_Details", EnumC32045a.SLEEP_ACTIVITY.toString(), null, null, false, null, null, null, 4035, null));
            return;
        }
        if (!(event instanceof AbstractC22848a.c)) {
            if (!(event instanceof AbstractC22848a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59392a(((AbstractC22848a.d) event).getAction());
        } else {
            AbstractC22848a.c cVar = (AbstractC22848a.c) event;
            this.navigator.mo59393b(new AbstractC21155m0.c1(cVar.getLowerBound(), cVar.getUpperBound(), cVar.getIsNap() ? "Nap" : "Sleep", "Sleep", cVar.getSleepIdV2(), null, false, 96, null));
        }
    }
}
