package rf0;

import a41.C0366b;
import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import i01.C17839b;
import of0.C27893a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q31.C29944b;
import sf0.InterfaceC32443a;

/* JADX INFO: renamed from: rf0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lrf0/a;", "", "Lof0/a;", "analytics", "<init>", "(Lof0/a;)V", "Lsf0/a$f;", NotificationCompat.CATEGORY_EVENT, "Lsf0/a;", "a", "(Lsf0/a$f;)Lsf0/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lsf0/a;", "actionEvent", "c", "(Lsf0/a;)Lsf0/a;", "Lof0/a;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31354a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27893a analytics;

    public C31354a(C27893a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC32443a m96424a(InterfaceC32443a.f event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC32443a.c((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m96425b((C9598e) obj);
        }
        if (obj instanceof C29944b) {
            return new InterfaceC32443a.i(((C29944b) obj).getSegmentId());
        }
        if (obj instanceof C17839b) {
            return new InterfaceC32443a.i(((C17839b) obj).getId());
        }
        if (obj instanceof C0366b) {
            this.analytics.m84165a(new InterfaceC32443a.k(((C0366b) obj).getId(), "al_join_page"));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC32443a m96425b(C9598e navAction) {
        return new InterfaceC32443a.d(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC32443a m96426c(InterfaceC32443a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC32443a.b) {
            this.analytics.m84165a((InterfaceC32443a.b) actionEvent);
        }
        return actionEvent instanceof InterfaceC32443a.f ? m96424a((InterfaceC32443a.f) actionEvent) : actionEvent;
    }
}
