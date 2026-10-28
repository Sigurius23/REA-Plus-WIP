package fh1;

import androidx.core.app.NotificationCompat;
import ch1.C4666b;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import gh1.InterfaceC15852b;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: fh1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lfh1/a;", "", "Lch1/b;", "analytics", "<init>", "(Lch1/b;)V", "Lgh1/b$f;", NotificationCompat.CATEGORY_EVENT, "Lgh1/b;", "a", "(Lgh1/b$f;)Lgh1/b;", "Lm91/u;", "itemViewState", "b", "(Lm91/u;)Lgh1/b;", "Lcom/whoop/navigation/e;", "navAction", "c", "(Lcom/whoop/navigation/e;)Lgh1/b;", "actionEvent", "d", "(Lgh1/b;)Lgh1/b;", "Lch1/b;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14488a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4666b analytics;

    public C14488a(C4666b analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC15852b m41392a(InterfaceC15852b.f event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof Action) {
            return new InterfaceC15852b.h((Action) obj);
        }
        if (obj instanceof InterfaceC25312u) {
            return m41393b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m41394c((C9598e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC15852b m41393b(InterfaceC25312u itemViewState) {
        if (!(itemViewState instanceof C27256h)) {
            return null;
        }
        C27256h c27256h = (C27256h) itemViewState;
        Action action = c27256h.getAction();
        return action != null ? new InterfaceC15852b.h(action) : m41394c(c27256h.getDestination());
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC15852b m41394c(C9598e navAction) {
        return !AbstractC22676k.m65745e(navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? new InterfaceC15852b.b(navAction) : InterfaceC15852b.d.f59874a;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC15852b m41395d(InterfaceC15852b actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC15852b.a) {
            this.analytics.m14734c((InterfaceC15852b.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC15852b.f ? m41392a((InterfaceC15852b.f) actionEvent) : actionEvent;
    }
}
