package yd1;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import d13.AbstractC11478a;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yd1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lyd1/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "<init>", "(Leb/a0;Lj02/o0;)V", "Lyd1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lyd1/a;)V", "Leb/a0;", "b", "Lj02/o0;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39458b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    public C39458b(AbstractC12939a0 navController, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        this.navController = navController;
        this.navigator = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m126006a(AbstractC39457a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC39457a.a.f169779a)) {
            this.navController.m36410z();
            return;
        }
        if (!(event instanceof AbstractC39457a.c)) {
            if (event instanceof AbstractC39457a.b) {
                this.navigator.mo59393b(new AbstractC21155m0.z1(null, 1, null));
                return;
            } else {
                if (!event.equals(AbstractC39457a.d.f169782a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        this.navController.m36410z();
        this.navController.m36410z();
        String strM31996o = AbstractC11895b.m31996o("whoop://strength.builder?screen=linkWorkoutScreen&activityId=", ((AbstractC39457a.c) event).getActivityId(), "&source=Add Activity");
        AbstractC12939a0 abstractC12939a0 = this.navController;
        Uri uri = Uri.parse(strM31996o);
        abstractC12939a0.m36404s(AbstractC11478a.m30854f(uri, "uri", uri, null, null));
    }
}
