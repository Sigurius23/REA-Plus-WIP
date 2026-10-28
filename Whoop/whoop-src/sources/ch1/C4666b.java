package ch1;

import androidx.core.app.NotificationCompat;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import fi0.InterfaceC14515a;
import gh1.InterfaceC15852b;
import java.util.Map;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ch1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lch1/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "source", "", "analyticsProperties", "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/util/Map;)V", "e", "()V", "Lgh1/b$f;", NotificationCompat.CATEGORY_EVENT, "d", "(Lgh1/b$f;)V", "Lgh1/b$a;", "c", "(Lgh1/b$a;)V", "Lfi0/a;", "Lec3/p1;", "Lch1/a;", "b", "Lec3/p1;", "_analyticsContext", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4666b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 _analyticsContext;

    public C4666b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
        this._analyticsContext = AbstractC13091v.m36593c(new C4665a(null, null, 3, null));
    }

    /* JADX INFO: renamed from: a */
    private final void m14730a(String source, Map<String, String> analyticsProperties) {
        C13045h2 c13045h2;
        Object value;
        C4665a c4665a;
        InterfaceC13075p1 interfaceC13075p1 = this._analyticsContext;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c4665a = (C4665a) value;
        } while (!c13045h2.m36569i(value, c4665a.m14727a(source == null ? c4665a.getSource() : source, analyticsProperties == null ? c4665a.m14728b() : analyticsProperties)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14731b(C4666b c4666b, String str, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            map = null;
        }
        c4666b.m14730a(str, map);
    }

    /* JADX INFO: renamed from: d */
    private final void m14732d(InterfaceC15852b.f event) {
        if (event.getElement() instanceof C27256h) {
            C4665a c4665a = (C4665a) ((C13045h2) this._analyticsContext).getValue();
            String id4 = ((C27256h) event.getElement()).getId();
            if (c4665a.getSource().length() <= 0 || id4 == null || id4.length() == 0) {
                return;
            }
            AbstractC4667c.m14736b(this.analytics, c4665a.getSource(), id4, c4665a.m14728b());
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m14733e() {
        C4665a c4665a = (C4665a) ((C13045h2) this._analyticsContext).getValue();
        if (c4665a.getSource().length() > 0) {
            AbstractC4667c.m14737c(this.analytics, c4665a.getSource(), c4665a.m14728b());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14734c(InterfaceC15852b.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC15852b.e) {
            m14731b(this, ((InterfaceC15852b.e) event).getSource(), null, 2, null);
            return;
        }
        if (event instanceof InterfaceC15852b.c) {
            m14731b(this, null, ((InterfaceC15852b.c) event).m44742a(), 1, null);
            m14733e();
        } else {
            if (!(event instanceof InterfaceC15852b.f)) {
                throw new NoWhenBranchMatchedException();
            }
            m14732d((InterfaceC15852b.f) event);
        }
    }
}
