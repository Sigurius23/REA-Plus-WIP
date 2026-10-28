package p073cq;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import to.AbstractC33975h;
import to.InterfaceC33977i;

/* JADX INFO: renamed from: cq.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C11051t extends AbstractC33975h {

    /* JADX INFO: renamed from: x */
    public final ArrayList f34666x;

    public C11051t(InterfaceC33977i interfaceC33977i) {
        super(interfaceC33977i);
        this.f34666x = new ArrayList();
        interfaceC33977i.mo107446o("TaskOnStopCallback", this);
    }

    /* JADX INFO: renamed from: j */
    public static C11051t m29699j(Activity activity) {
        C11051t c11051t;
        InterfaceC33977i interfaceC33977iM107437b = AbstractC33975h.m107437b(activity);
        synchronized (interfaceC33977iM107437b) {
            try {
                c11051t = (C11051t) interfaceC33977iM107437b.mo107444d(C11051t.class, "TaskOnStopCallback");
                if (c11051t == null) {
                    c11051t = new C11051t(interfaceC33977iM107437b);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c11051t;
    }

    @Override // to.AbstractC33975h
    /* JADX INFO: renamed from: i */
    public final void mo29700i() {
        ArrayList arrayList = this.f34666x;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC11047p interfaceC11047p = (InterfaceC11047p) ((WeakReference) it.next()).get();
                    if (interfaceC11047p != null) {
                        interfaceC11047p.mo29696b();
                    }
                }
                arrayList.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m29701k(InterfaceC11047p interfaceC11047p) {
        ArrayList arrayList = this.f34666x;
        synchronized (arrayList) {
            arrayList.add(new WeakReference(interfaceC11047p));
        }
    }
}
