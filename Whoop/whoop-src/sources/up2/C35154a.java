package up2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import qp2.C30539a;
import rp2.C31642b;
import vp2.InterfaceC36274a;

/* JADX INFO: renamed from: up2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lup2/a;", "", "Lqp2/a;", "analytics", "<init>", "(Lqp2/a;)V", "Lvp2/a$f;", NotificationCompat.CATEGORY_EVENT, "Lvp2/a;", "a", "(Lvp2/a$f;)Lvp2/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lvp2/a;", "actionEvent", "c", "(Lvp2/a;)Lvp2/a;", "Lqp2/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35154a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C30539a analytics;

    public C35154a(C30539a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC36274a m111227a(InterfaceC36274a.f event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C31642b) {
            return new InterfaceC36274a.i(((C31642b) obj).getId());
        }
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC36274a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m111228b((C9598e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC36274a m111228b(C9598e navAction) {
        return new InterfaceC36274a.c(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC36274a m111229c(InterfaceC36274a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC36274a.a) {
            this.analytics.m93626a((InterfaceC36274a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC36274a.f ? m111227a((InterfaceC36274a.f) actionEvent) : actionEvent;
    }
}
