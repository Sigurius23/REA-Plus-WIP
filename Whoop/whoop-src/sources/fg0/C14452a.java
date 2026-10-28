package fg0;

import androidx.core.app.NotificationCompat;
import cg0.C4571a;
import com.whoop.navigation.C9598e;
import gg0.InterfaceC15822a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q31.C29944b;

/* JADX INFO: renamed from: fg0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lfg0/a;", "", "Lcg0/a;", "analytics", "<init>", "(Lcg0/a;)V", "Lgg0/a$g;", NotificationCompat.CATEGORY_EVENT, "Lgg0/a;", "a", "(Lgg0/a$g;)Lgg0/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lgg0/a;", "actionEvent", "c", "(Lgg0/a;)Lgg0/a;", "Lcg0/a;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14452a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4571a analytics;

    public C14452a(C4571a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC15822a m41174a(InterfaceC15822a.g event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC15822a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m41175b((C9598e) obj);
        }
        if (obj instanceof C29944b) {
            return new InterfaceC15822a.j(((C29944b) obj).getSegmentId());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC15822a m41175b(C9598e navAction) {
        return new InterfaceC15822a.c(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC15822a m41176c(InterfaceC15822a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC15822a.a) {
            this.analytics.m14245a((InterfaceC15822a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC15822a.g ? m41174a((InterfaceC15822a.g) actionEvent) : actionEvent;
    }
}
