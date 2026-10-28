package r20;

import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m83.AbstractC25265s;
import n53.C26318e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30617w;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: r20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C30866d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2994c0 f127264a;

    /* JADX INFO: renamed from: b */
    public final Object f127265b;

    /* JADX INFO: renamed from: c */
    public final boolean f127266c;

    /* JADX INFO: renamed from: d */
    public final Function1 f127267d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f127268e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final C13045h2 f127269f;

    /* JADX INFO: renamed from: g */
    public final C26318e f127270g;

    /* JADX INFO: renamed from: h */
    public final C26318e f127271h;

    public C30866d(InterfaceC2994c0 interfaceC2994c0, Object obj, boolean z4, Function1 function1) {
        this.f127264a = interfaceC2994c0;
        this.f127265b = obj;
        this.f127266c = z4;
        this.f127267d = function1;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(AbstractC37056f.m118958J(obj));
        this.f127269f = c13045h2M36593c;
        this.f127270g = AbstractC3269g.m9484M(c13045h2M36593c, new C30617w(13));
        this.f127271h = AbstractC3269g.m9484M(c13045h2M36593c, new C30617w(14));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m94918a() {
        return ((List) this.f127269f.getValue()).size() > 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m94919b() {
        if (this.f127268e.get()) {
            return;
        }
        m94920c();
    }

    /* JADX INFO: renamed from: c */
    public final void m94920c() {
        C13045h2 c13045h2;
        Object value;
        ArrayList arrayListM74097F1;
        do {
            c13045h2 = this.f127269f;
            value = c13045h2.getValue();
            arrayListM74097F1 = AbstractC25265s.m74097F1((List) value);
            Object objRemove = arrayListM74097F1.remove(AbstractC37056f.m118951C(arrayListM74097F1));
            if (objRemove instanceof Closeable) {
                ((Closeable) objRemove).close();
            }
            this.f127267d.invoke(objRemove);
        } while (!c13045h2.m36569i(value, AbstractC25265s.m74093D1(arrayListM74097F1)));
    }

    /* JADX INFO: renamed from: d */
    public final void m94921d(List screens) {
        AbstractC22676k.m65750j(screens, "screens");
        if (this.f127268e.get()) {
            return;
        }
        C13045h2 c13045h2 = this.f127269f;
        List list = (List) c13045h2.getValue();
        c13045h2.getClass();
        c13045h2.m36571k(null, screens);
        for (Object obj : list) {
            if (!screens.contains(obj) && (obj instanceof Closeable)) {
                ((Closeable) obj).close();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m94922e(InterfaceC30881s interfaceC30881s) {
        if (this.f127268e.get()) {
            return;
        }
        m94923f(interfaceC30881s);
    }

    /* JADX INFO: renamed from: f */
    public final void m94923f(Object obj) {
        C13045h2 c13045h2;
        Object value;
        List list;
        do {
            c13045h2 = this.f127269f;
            value = c13045h2.getValue();
            list = (List) value;
        } while (!c13045h2.m36569i(value, this.f127266c ? AbstractC25265s.m74128f1(obj, AbstractC25265s.m74124b1(list, this.f127265b)) : AbstractC25265s.m74128f1(obj, list)));
    }
}
