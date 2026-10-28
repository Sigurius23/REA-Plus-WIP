package yf0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q31.C29944b;
import vf0.C35944a;
import zf0.InterfaceC40609a;

/* JADX INFO: renamed from: yf0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lyf0/a;", "", "Lvf0/a;", "analytics", "<init>", "(Lvf0/a;)V", "Lzf0/a$e;", NotificationCompat.CATEGORY_EVENT, "Lzf0/a;", "a", "(Lzf0/a$e;)Lzf0/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lzf0/a;", "actionEvent", "c", "(Lzf0/a;)Lzf0/a;", "Lvf0/a;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39509a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35944a analytics;

    public C39509a(C35944a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC40609a m126164a(InterfaceC40609a.e event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC40609a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m126165b((C9598e) obj);
        }
        if (obj instanceof C29944b) {
            return new InterfaceC40609a.i(((C29944b) obj).getSegmentId());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC40609a m126165b(C9598e navAction) {
        return new InterfaceC40609a.c(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC40609a m126166c(InterfaceC40609a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC40609a.a) {
            this.analytics.m114184a((InterfaceC40609a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC40609a.e ? m126164a((InterfaceC40609a.e) actionEvent) : actionEvent;
    }
}
