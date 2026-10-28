package oo2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import ho2.C17538a;
import hy0.C17757j0;
import io2.C20754d;
import io2.C20761g0;
import io2.C20763h0;
import io2.C20765i0;
import io2.C20767j0;
import io2.C20776o;
import io2.C20788y;
import io2.C20789z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import po2.InterfaceC29402a;

/* JADX INFO: renamed from: oo2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Loo2/a;", "", "Lho2/a;", "analytics", "<init>", "(Lho2/a;)V", "Lpo2/a$o;", NotificationCompat.CATEGORY_EVENT, "Lpo2/a;", "a", "(Lpo2/a$o;)Lpo2/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lpo2/a;", "actionEvent", "c", "(Lpo2/a;)Lpo2/a;", "Lho2/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28066a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17538a analytics;

    public C28066a(C17538a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC29402a m84841a(InterfaceC29402a.o event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC29402a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m84842b((C9598e) obj);
        }
        if (obj instanceof C20754d) {
            C20754d c20754d = (C20754d) obj;
            return new InterfaceC29402a.g(c20754d.getPath(), c20754d.getCartId(), c20754d.getSkipStripeCheckout());
        }
        if (obj instanceof C20776o) {
            return InterfaceC29402a.j0.f119322a;
        }
        if (obj instanceof C20767j0) {
            return InterfaceC29402a.k0.f119326a;
        }
        if (obj instanceof C20763h0) {
            return InterfaceC29402a.h.f119317a;
        }
        if (obj instanceof C20761g0) {
            C20761g0 c20761g0 = (C20761g0) obj;
            return new InterfaceC29402a.c(c20761g0.getCartId(), c20761g0.getPromoCode());
        }
        if (obj instanceof C20765i0) {
            C20765i0 c20765i0 = (C20765i0) obj;
            return new InterfaceC29402a.c0(c20765i0.getCartId(), c20765i0.getCodeId());
        }
        if (obj instanceof C20788y) {
            return InterfaceC29402a.u.f119349a;
        }
        if (obj instanceof C20789z) {
            C20789z c20789z = (C20789z) obj;
            return new InterfaceC29402a.p(c20789z.getCartId(), c20789z.getSource(), c20789z.m57316a());
        }
        if (obj instanceof C17757j0) {
            return new InterfaceC29402a.i0(((C17757j0) obj).getIsToggled());
        }
        if (obj instanceof InterfaceC29402a.s) {
            return (InterfaceC29402a) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC29402a m84842b(C9598e navAction) {
        return new InterfaceC29402a.d(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC29402a m84843c(InterfaceC29402a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC29402a.a) {
            this.analytics.m49843a((InterfaceC29402a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC29402a.o ? m84841a((InterfaceC29402a.o) actionEvent) : actionEvent;
    }
}
