package bv1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import cv1.InterfaceC11144a;
import i01.C17839b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import xu1.AbstractC38654b;
import xu1.C38653a;

/* JADX INFO: renamed from: bv1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lbv1/a;", "", "Lxu1/a;", "analytics", "<init>", "(Lxu1/a;)V", "Lcv1/a$f;", NotificationCompat.CATEGORY_EVENT, "Lcv1/a;", "a", "(Lcv1/a$f;)Lcv1/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lcv1/a;", "", "source", "offerId", "Ll83/a0;", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcv1/a$i;", "selectedCardId", "d", "(Lcv1/a$i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "actionEvent", "c", "(Lcv1/a;)Lcv1/a;", "Lxu1/a;", "limited-time-offer_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3671a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C38653a analytics;

    public C3671a(C38653a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC11144a m11352a(InterfaceC11144a.f event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC11144a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m11353b((C9598e) obj);
        }
        if (obj instanceof C17839b) {
            return new InterfaceC11144a.d(((C17839b) obj).getId());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC11144a m11353b(C9598e navAction) {
        return new InterfaceC11144a.c(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC11144a m11354c(InterfaceC11144a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC11144a.a) {
            this.analytics.m123907b((InterfaceC11144a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC11144a.f ? m11352a((InterfaceC11144a.f) actionEvent) : actionEvent;
    }

    /* JADX INFO: renamed from: d */
    public final void m11355d(InterfaceC11144a.i event, String selectedCardId, String source, String offerId) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(offerId, "offerId");
        this.analytics.m123907b(new InterfaceC11144a.g(source, offerId, event instanceof InterfaceC11144a.e ? "close" : AbstractC38654b.m123912b(selectedCardId)));
    }

    /* JADX INFO: renamed from: e */
    public final void m11356e(String source, String offerId) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(offerId, "offerId");
        this.analytics.m123908d(source, offerId);
    }
}
