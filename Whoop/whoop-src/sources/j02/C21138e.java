package j02;

import androidx.core.app.NotificationCompat;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j02.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lj02/e;", "", "<init>", "()V", "Lj02/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "c", "(Lj02/d;)V", "Lec3/p1;", "Lj02/f;", "a", "Lec3/p1;", "_navInput", "Lec3/f2;", "b", "Lec3/f2;", "()Lec3/f2;", "navInput", "Lec3/o1;", "", "Lec3/o1;", "_unknownTabRequests", "Lec3/t1;", "d", "Lec3/t1;", "()Lec3/t1;", "unknownTabRequests", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21138e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13075p1 _navInput;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13037f2 navInput;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13072o1 _unknownTabRequests;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13087t1 unknownTabRequests;

    public C21138e() {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C21140f(null, false, false, 7, null));
        this._navInput = c13045h2M36593c;
        this.navInput = AbstractC13091v.m36598h(c13045h2M36593c);
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, EnumC11916a.f38983x, 1);
        this._unknownTabRequests = c13096w1M36592b;
        this.unknownTabRequests = AbstractC13091v.m36597g(c13096w1M36592b);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC13037f2 getNavInput() {
        return this.navInput;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC13087t1 getUnknownTabRequests() {
        return this.unknownTabRequests;
    }

    /* JADX INFO: renamed from: c */
    public final void m58980c(InterfaceC21136d event) {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        C13045h2 c13045h4;
        Object value3;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC21136d.d) {
            InterfaceC13075p1 interfaceC13075p1 = this._navInput;
            do {
                c13045h4 = (C13045h2) interfaceC13075p1;
                value3 = c13045h4.getValue();
            } while (!c13045h4.m36569i(value3, C21140f.m58981b((C21140f) value3, ((InterfaceC21136d.d) event).getTabId(), false, false, 6, null)));
            return;
        }
        if (event instanceof InterfaceC21136d.c) {
            InterfaceC13075p1 interfaceC13075p2 = this._navInput;
            do {
                c13045h3 = (C13045h2) interfaceC13075p2;
                value2 = c13045h3.getValue();
            } while (!c13045h3.m36569i(value2, C21140f.m58981b((C21140f) value2, null, ((InterfaceC21136d.c) event).getOnTabRoot(), false, 1, null)));
            return;
        }
        if (event instanceof InterfaceC21136d.a) {
            InterfaceC13075p1 interfaceC13075p3 = this._navInput;
            do {
                c13045h2 = (C13045h2) interfaceC13075p3;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, C21140f.m58981b((C21140f) value, null, false, ((InterfaceC21136d.a) event).getIsVisible(), 3, null)));
            return;
        }
        if (event instanceof InterfaceC21136d.e) {
            this._unknownTabRequests.mo36564a(((InterfaceC21136d.e) event).getTabId());
            return;
        }
        if (!(event instanceof InterfaceC21136d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC13075p1 interfaceC13075p4 = this._navInput;
        C21140f c21140f = new C21140f(null, false, false, 7, null);
        C13045h2 c13045h5 = (C13045h2) interfaceC13075p4;
        c13045h5.getClass();
        c13045h5.m36571k(null, c21140f);
    }
}
