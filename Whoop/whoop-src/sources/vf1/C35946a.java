package vf1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import rf1.C31357a;
import t11.C33302b;
import t11.C33303c;
import wf1.InterfaceC37243a;

/* JADX INFO: renamed from: vf1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvf1/a;", "", "Lrf1/a;", "analytics", "<init>", "(Lrf1/a;)V", "Lwf1/a$g;", NotificationCompat.CATEGORY_EVENT, "Lwf1/a;", "a", "(Lwf1/a$g;)Lwf1/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lwf1/a;", "actionEvent", "c", "(Lwf1/a;)Lwf1/a;", "Lrf1/a;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35946a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C31357a analytics;

    public C35946a(C31357a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC37243a m114188a(InterfaceC37243a.g event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C33303c) {
            return new InterfaceC37243a.k(((C33303c) obj).getTileId());
        }
        if (obj instanceof C33302b) {
            return new InterfaceC37243a.j(((C33302b) obj).getText());
        }
        if (obj instanceof C27256h) {
            return AbstractC22676k.m65745e(((C27256h) obj).getId(), "al_cancel_subscription_button") ? InterfaceC37243a.d.f159302a : new InterfaceC37243a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC37243a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m114189b((C9598e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC37243a m114189b(C9598e navAction) {
        return new InterfaceC37243a.c(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC37243a m114190c(InterfaceC37243a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC37243a.a) {
            this.analytics.m96430a((InterfaceC37243a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC37243a.g ? m114188a((InterfaceC37243a.g) actionEvent) : actionEvent;
    }
}
