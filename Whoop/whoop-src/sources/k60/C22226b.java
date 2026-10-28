package k60;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import u60.InterfaceC34549a;

/* JADX INFO: renamed from: k60.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lk60/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "source", "", "analyticsProperties", "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/util/Map;)V", "e", "()V", "Lu60/a$f;", NotificationCompat.CATEGORY_EVENT, "d", "(Lu60/a$f;)V", "Lu60/a$b;", "c", "(Lu60/a$b;)V", "Lfi0/a;", "Lec3/p1;", "Lk60/a;", "b", "Lec3/p1;", "_analyticsContext", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22226b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 _analyticsContext;

    public C22226b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
        this._analyticsContext = AbstractC13091v.m36593c(new C22225a(null, null, 3, null));
    }

    /* JADX INFO: renamed from: a */
    private final void m63721a(String source, Map<String, String> analyticsProperties) {
        C13045h2 c13045h2;
        Object value;
        C22225a c22225a;
        InterfaceC13075p1 interfaceC13075p1 = this._analyticsContext;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c22225a = (C22225a) value;
        } while (!c13045h2.m36569i(value, c22225a.m63718a(source == null ? c22225a.getSource() : source, analyticsProperties == null ? c22225a.m63719b() : analyticsProperties)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m63722b(C22226b c22226b, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            map = null;
        }
        c22226b.m63721a(str, map);
    }

    /* JADX INFO: renamed from: d */
    private final void m63723d(InterfaceC34549a.f event) {
        AnalyticEventModel analyticEvent;
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        DesignItemInteraction designItemInteraction = obj instanceof DesignItemInteraction ? (DesignItemInteraction) obj : null;
        if (designItemInteraction == null || (analyticEvent = designItemInteraction.getAnalyticEvent()) == null) {
            return;
        }
        AbstractC14516b.m41429a(this.analytics, analyticEvent);
    }

    /* JADX INFO: renamed from: e */
    private final void m63724e() {
        C22225a c22225a = (C22225a) ((C13045h2) this._analyticsContext).getValue();
        if (c22225a.getSource().length() > 0) {
            AbstractC22227c.m63726a(this.analytics, c22225a.getSource(), c22225a.m63719b());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m63725c(InterfaceC34549a.b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC34549a.e) {
            m63722b(this, ((InterfaceC34549a.e) event).getSource(), null, 2, null);
            return;
        }
        if (event instanceof InterfaceC34549a.a) {
            m63722b(this, null, ((InterfaceC34549a.a) event).m109193a(), 1, null);
            m63724e();
        } else {
            if (!(event instanceof InterfaceC34549a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            m63723d((InterfaceC34549a.f) event);
        }
    }
}
