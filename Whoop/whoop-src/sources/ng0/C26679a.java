package ng0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import jg0.C21666a;
import og0.InterfaceC27915a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ng0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lng0/a;", "", "Ljg0/a;", "analytics", "<init>", "(Ljg0/a;)V", "Log0/a$f;", NotificationCompat.CATEGORY_EVENT, "Log0/a;", "a", "(Log0/a$f;)Log0/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Log0/a;", "actionEvent", "c", "(Log0/a;)Log0/a;", "Ljg0/a;", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26679a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21666a analytics;

    public C26679a(C21666a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC27915a m79359a(InterfaceC27915a.f event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC27915a.c((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m79360b((C9598e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC27915a m79360b(C9598e navAction) {
        return new InterfaceC27915a.d(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC27915a m79361c(InterfaceC27915a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC27915a.b) {
            this.analytics.m60926a((InterfaceC27915a.b) actionEvent);
        }
        return actionEvent instanceof InterfaceC27915a.f ? m79359a((InterfaceC27915a.f) actionEvent) : actionEvent;
    }
}
