package t60;

import androidx.core.app.NotificationCompat;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import k60.C22226b;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import u60.InterfaceC34549a;

/* JADX INFO: renamed from: t60.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lt60/a;", "", "Lk60/b;", "analytics", "<init>", "(Lk60/b;)V", "Lu60/a$f;", NotificationCompat.CATEGORY_EVENT, "Lu60/a;", "a", "(Lu60/a$f;)Lu60/a;", "Lm91/u;", "itemViewState", "b", "(Lm91/u;)Lu60/a;", "Lcom/whoop/navigation/e;", "navAction", "c", "(Lcom/whoop/navigation/e;)Lu60/a;", "actionEvent", "d", "(Lu60/a;)Lu60/a;", "Lk60/b;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33548a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22226b analytics;

    public C33548a(C22226b analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC34549a m105941a(InterfaceC34549a.f event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof DesignItemInteraction) {
            Object actionArgument = ((DesignItemInteraction) obj).getActionArgument();
            if (actionArgument != null) {
                return m105941a(InterfaceC34549a.f.m109196b(event, actionArgument, null, 2, null));
            }
            return null;
        }
        if (obj instanceof InterfaceC25312u) {
            return m105942b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m105943c((C9598e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC34549a m105942b(InterfaceC25312u itemViewState) {
        if (itemViewState instanceof C27256h) {
            return m105943c(((C27256h) itemViewState).getDestination());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC34549a m105943c(C9598e navAction) {
        return !AbstractC22676k.m65745e(navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? new InterfaceC34549a.c(navAction) : InterfaceC34549a.d.f145342a;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC34549a m105944d(InterfaceC34549a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC34549a.b) {
            this.analytics.m63725c((InterfaceC34549a.b) actionEvent);
        }
        return actionEvent instanceof InterfaceC34549a.f ? m105941a((InterfaceC34549a.f) actionEvent) : actionEvent;
    }
}
