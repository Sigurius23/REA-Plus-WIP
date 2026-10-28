package w22;

import androidx.core.app.NotificationCompat;
import b32.C2675a;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import e32.InterfaceC12617d;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import t22.C33352b;
import x22.InterfaceC37862a;

/* JADX INFO: renamed from: w22.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lw22/a;", "", "Lt22/b;", "analytics", "<init>", "(Lt22/b;)V", "Lx22/a$m;", NotificationCompat.CATEGORY_EVENT, "Lx22/a;", "a", "(Lx22/a$m;)Lx22/a;", "Lm91/u;", "itemViewState", "b", "(Lm91/u;)Lx22/a;", "Lcom/whoop/navigation/e;", "navAction", "c", "(Lcom/whoop/navigation/e;)Lx22/a;", "actionEvent", "d", "(Lx22/a;)Lx22/a;", "Lt22/b;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36740a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33352b analytics;

    public C36740a(C33352b analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC37862a m117866a(InterfaceC37862a.m event) {
        String paymentMethodId;
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof Action) {
            return new InterfaceC37862a.s((Action) obj);
        }
        if (obj instanceof InterfaceC25312u) {
            return m117867b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m117868c((C9598e) obj);
        }
        if (!(obj instanceof InterfaceC12617d)) {
            return null;
        }
        InterfaceC12617d interfaceC12617d = (InterfaceC12617d) obj;
        if (!(interfaceC12617d instanceof InterfaceC12617d.c)) {
            if (interfaceC12617d instanceof InterfaceC12617d.f) {
                return new InterfaceC37862a.d(((InterfaceC12617d.f) obj).getPaymentMethodId());
            }
            return null;
        }
        InterfaceC12617d.c cVar = (InterfaceC12617d.c) obj;
        C2675a paymentMethodInfo = cVar.getPaymentMethodInfo();
        if (paymentMethodInfo == null || (paymentMethodId = paymentMethodInfo.getPaymentMethodId()) == null) {
            throw new IllegalArgumentException("Payment method id is null");
        }
        return new InterfaceC37862a.r(paymentMethodId, paymentMethodInfo.getPostalCode(), cVar.getScreenName());
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC37862a m117867b(InterfaceC25312u itemViewState) {
        if (!(itemViewState instanceof C27256h)) {
            return null;
        }
        C27256h c27256h = (C27256h) itemViewState;
        Action action = c27256h.getAction();
        return action != null ? new InterfaceC37862a.s(action) : m117868c(c27256h.getDestination());
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC37862a m117868c(C9598e navAction) {
        return !AbstractC22676k.m65745e(navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? new InterfaceC37862a.b(navAction) : InterfaceC37862a.j.f162094a;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC37862a m117869d(InterfaceC37862a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC37862a.a) {
            this.analytics.m105777c((InterfaceC37862a.a) actionEvent);
        }
        if (actionEvent instanceof InterfaceC37862a.g) {
            this.analytics.m105777c(InterfaceC37862a.h.f162092a);
        } else if (actionEvent instanceof InterfaceC37862a.e) {
            this.analytics.m105777c(InterfaceC37862a.f.f162090a);
        } else if ((actionEvent instanceof InterfaceC37862a.m) && (((InterfaceC37862a.m) actionEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() instanceof InterfaceC12617d.a)) {
            this.analytics.m105777c(InterfaceC37862a.c.f162087a);
        }
        return actionEvent instanceof InterfaceC37862a.m ? m117866a((InterfaceC37862a.m) actionEvent) : actionEvent;
    }
}
