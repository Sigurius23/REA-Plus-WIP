package o60;

import androidx.core.app.NotificationCompat;
import com.whoop.achievements.celebration.InterfaceC5737b;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import m60.C25107a;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o60.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lo60/a;", "", "Lm60/a;", "analyticsHelper", "<init>", "(Lm60/a;)V", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/achievements/celebration/b$c;", "a", "(Ljava/lang/Object;)Lcom/whoop/achievements/celebration/b$c;", "Lcom/whoop/achievements/celebration/b;", "actionEvent", "b", "(Lcom/whoop/achievements/celebration/b;)Lcom/whoop/achievements/celebration/b;", "Lm60/a;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27599a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25107a analyticsHelper;

    public C27599a(C25107a analyticsHelper) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC5737b.c m83344a(Object event) {
        if (event instanceof DesignItemInteraction) {
            Object actionArgument = ((DesignItemInteraction) event).getActionArgument();
            if (actionArgument != null) {
                return m83344a(actionArgument);
            }
            return null;
        }
        if (event instanceof C27256h) {
            C27256h c27256h = (C27256h) event;
            return !AbstractC22676k.m65745e(c27256h.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? new InterfaceC5737b.c.C41366c(c27256h.getDestination()) : InterfaceC5737b.c.a.f22690a;
        }
        if (!(event instanceof C9598e)) {
            return null;
        }
        C9598e c9598e = (C9598e) event;
        return !AbstractC22676k.m65745e(c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? new InterfaceC5737b.c.C41366c(c9598e) : InterfaceC5737b.c.a.f22690a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5737b m83345b(InterfaceC5737b actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC5737b.a) {
            this.analyticsHelper.m73613c((InterfaceC5737b.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC5737b.b ? m83344a(((InterfaceC5737b.b) actionEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()) : actionEvent;
    }
}
