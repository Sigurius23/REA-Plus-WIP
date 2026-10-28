package mp2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import ip2.C20814a;
import jp2.AbstractC21872c;
import jp2.AbstractC21878i;
import np2.InterfaceC27034a;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: mp2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lmp2/a;", "", "Lip2/a;", "analytics", "<init>", "(Lip2/a;)V", "Lnp2/a$m;", NotificationCompat.CATEGORY_EVENT, "Lnp2/a;", "a", "(Lnp2/a$m;)Lnp2/a;", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)Lnp2/a;", "actionEvent", "c", "(Lnp2/a;)Lnp2/a;", "Lip2/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25871a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C20814a analytics;

    public C25871a(C20814a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC27034a m76468a(InterfaceC27034a.m event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C27256h) {
            return InterfaceC27034a.r.f107860a;
        }
        if (obj instanceof InterfaceC25312u) {
            return new InterfaceC27034a.b((InterfaceC25312u) obj);
        }
        if (obj instanceof C9598e) {
            return m76469b((C9598e) obj);
        }
        if (obj instanceof AbstractC21872c.b) {
            AbstractC21872c.b bVar = (AbstractC21872c.b) obj;
            return new InterfaceC27034a.q(bVar.getFieldType(), bVar.getTitle(), bVar.m62009b());
        }
        if (obj instanceof AbstractC21878i.c) {
            AbstractC21878i.c cVar = (AbstractC21878i.c) obj;
            return new InterfaceC27034a.s(cVar.getFieldId(), cVar.getValue(), cVar.getMaxLength(), cVar.getMinLength(), cVar.getPattern(), cVar.getDisplayLabel());
        }
        if (obj instanceof AbstractC21878i.b) {
            AbstractC21878i.b bVar2 = (AbstractC21878i.b) obj;
            return new InterfaceC27034a.t(bVar2.getFieldId(), bVar2.getValue(), bVar2.getPattern(), bVar2.getDisplayLabel(), bVar2.getMinLength());
        }
        if (obj instanceof AbstractC21878i.a) {
            return new InterfaceC27034a.f(((AbstractC21878i.a) obj).getSource());
        }
        if (!(obj instanceof AbstractC21872c.a)) {
            return null;
        }
        AbstractC21872c.a aVar = (AbstractC21872c.a) obj;
        return new InterfaceC27034a.k(aVar.getFieldId(), aVar.getValue(), aVar.getPattern(), aVar.getDisplayLabel(), aVar.getMinLength());
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC27034a m76469b(C9598e navAction) {
        return new InterfaceC27034a.c(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC27034a m76470c(InterfaceC27034a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        if (actionEvent instanceof InterfaceC27034a.a) {
            this.analytics.m57402a((InterfaceC27034a.a) actionEvent);
        }
        return actionEvent instanceof InterfaceC27034a.m ? m76468a((InterfaceC27034a.m) actionEvent) : actionEvent;
    }
}
