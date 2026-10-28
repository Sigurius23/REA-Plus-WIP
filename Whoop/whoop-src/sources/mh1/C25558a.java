package mh1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import jh1.C21697b;
import nh1.InterfaceC26720a;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q31.C29944b;
import qh1.C30367b;
import r51.C30934b;
import r51.C30935c;

/* JADX INFO: renamed from: mh1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lmh1/a;", "", "Ljh1/b;", "analytics", "<init>", "(Ljh1/b;)V", "Lnh1/a$l;", NotificationCompat.CATEGORY_EVENT, "Lnh1/a;", "a", "(Lnh1/a$l;)Lnh1/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lnh1/a;", "actionEvent", "c", "(Lnh1/a;)Lnh1/a;", "Ljh1/b;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25558a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21697b analytics;

    public C25558a(C21697b analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC26720a m75158a(InterfaceC26720a.l event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof Action) {
            return new InterfaceC26720a.o((Action) obj);
        }
        if (obj instanceof C27256h) {
            C27256h c27256h = (C27256h) obj;
            Action action = c27256h.getAction();
            C9598e destination = c27256h.getDestination();
            if (action != null) {
                return new InterfaceC26720a.o(action);
            }
            if (AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                return InterfaceC26720a.j.f106236a;
            }
            return AbstractC22676k.m65745e(c27256h.getId(), "membership-gifting-checkout-button") ? new InterfaceC26720a.m(destination) : new InterfaceC26720a.c(destination);
        }
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC26720a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m75159b((C9598e) obj);
        }
        if (obj instanceof C29944b) {
            return new InterfaceC26720a.r(((C29944b) obj).getSegmentId());
        }
        if (obj instanceof C30367b) {
            return new InterfaceC26720a.p(((C30367b) obj).getQuantity());
        }
        if (obj instanceof C30934b) {
            return InterfaceC26720a.g.f106232a;
        }
        if (obj instanceof C30935c) {
            return new InterfaceC26720a.h(((C30935c) obj).getCountry().getAlpha2());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC26720a m75159b(C9598e navAction) {
        return new InterfaceC26720a.c(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC26720a m75160c(InterfaceC26720a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC26720a.a) {
            this.analytics.m61113c((InterfaceC26720a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC26720a.l ? m75158a((InterfaceC26720a.l) actionEvent) : actionEvent;
    }
}
