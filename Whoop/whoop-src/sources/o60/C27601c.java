package o60;

import androidx.core.app.NotificationCompat;
import com.whoop.achievements.celebration.InterfaceC5737b;
import com.whoop.navigation.AppScreen;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o60.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lo60/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "<init>", "(Lj02/o0;Leb/a0;)V", "Lcom/whoop/achievements/celebration/b$c;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lcom/whoop/achievements/celebration/b$c;)V", "Lj02/o0;", "b", "Leb/a0;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27601c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    public C27601c(InterfaceC21159o0 navigator, AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        this.navigator = navigator;
        this.navController = navController;
    }

    /* JADX INFO: renamed from: a */
    public final void m83346a(InterfaceC5737b.c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC5737b.c.a.f22690a) || event.equals(InterfaceC5737b.c.b.f22691a)) {
            this.navController.m36410z();
        } else {
            if (!(event instanceof InterfaceC5737b.c.C41366c)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC5737b.c.C41366c c41366c = (InterfaceC5737b.c.C41366c) event;
            if (!AbstractC22676k.m65745e(c41366c.getAction().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9438v6.f28000w)) {
                this.navController.m36410z();
            }
            this.navigator.mo59392a(c41366c.getAction());
        }
    }
}
