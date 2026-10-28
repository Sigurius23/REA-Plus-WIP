package t22;

import androidx.core.app.NotificationCompat;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import fi0.InterfaceC14515a;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import x22.InterfaceC37862a;

/* JADX INFO: renamed from: t22.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lt22/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "source", "", "analyticsProperties", "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/util/Map;)V", "Lx22/a$m;", NotificationCompat.CATEGORY_EVENT, "d", "(Lx22/a$m;)V", "Lx22/a$a;", "c", "(Lx22/a$a;)V", "Lfi0/a;", "Lec3/p1;", "Lt22/a;", "b", "Lec3/p1;", "_analyticsContext", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33352b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 _analyticsContext;

    public C33352b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
        this._analyticsContext = AbstractC13091v.m36593c(new C33351a(null, null, 3, null));
    }

    /* JADX INFO: renamed from: a */
    private final void m105774a(String source, Map<String, String> analyticsProperties) {
        C13045h2 c13045h2;
        Object value;
        C33351a c33351a;
        InterfaceC13075p1 interfaceC13075p1 = this._analyticsContext;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c33351a = (C33351a) value;
        } while (!c13045h2.m36569i(value, c33351a.m105771a(source == null ? c33351a.getSource() : source, analyticsProperties == null ? c33351a.m105772b() : analyticsProperties)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m105775b(C33352b c33352b, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            map = null;
        }
        c33352b.m105774a(str, map);
    }

    /* JADX INFO: renamed from: d */
    private final void m105776d(InterfaceC37862a.m event) {
    }

    /* JADX INFO: renamed from: c */
    public final void m105777c(InterfaceC37862a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC37862a.q) {
            AbstractC33353c.m105782e(this.analytics, ((InterfaceC37862a.q) event).m121413a());
            return;
        }
        if (event instanceof InterfaceC37862a.l) {
            m105775b(this, ((InterfaceC37862a.l) event).getSource(), null, 2, null);
            return;
        }
        if (event instanceof InterfaceC37862a.p) {
            m105775b(this, null, ((InterfaceC37862a.p) event).m121412a(), 1, null);
            AbstractC33353c.m105784g(this.analytics, ((C33351a) ((C13045h2) this._analyticsContext).getValue()).m105772b());
            return;
        }
        if (event.equals(InterfaceC37862a.c.f162087a)) {
            AbstractC33353c.m105783f(this.analytics, ((C33351a) ((C13045h2) this._analyticsContext).getValue()).m105772b());
            return;
        }
        if (event.equals(InterfaceC37862a.k.f162095a)) {
            AbstractC33353c.m105778a(this.analytics, ((C33351a) ((C13045h2) this._analyticsContext).getValue()).m105772b());
            return;
        }
        if (event.equals(InterfaceC37862a.i.f162093a)) {
            AbstractC33353c.m105781d(this.analytics);
            return;
        }
        if (event.equals(InterfaceC37862a.h.f162092a)) {
            AbstractC33353c.m105780c(this.analytics);
        } else if (event.equals(InterfaceC37862a.f.f162090a)) {
            AbstractC33353c.m105779b(this.analytics);
        } else {
            if (!(event instanceof InterfaceC37862a.m)) {
                throw new NoWhenBranchMatchedException();
            }
            m105776d((InterfaceC37862a.m) event);
        }
    }
}
