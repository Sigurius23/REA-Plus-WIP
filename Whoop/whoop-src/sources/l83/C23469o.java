package l83;

import c93.InterfaceC4339a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l83.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C23469o implements InterfaceC23462h, Serializable {

    /* JADX INFO: renamed from: y */
    public static final AtomicReferenceFieldUpdater f92941y = AtomicReferenceFieldUpdater.newUpdater(C23469o.class, Object.class, "x");

    /* JADX INFO: renamed from: w */
    public volatile InterfaceC4339a f92942w;

    /* JADX INFO: renamed from: x */
    public volatile Object f92943x;

    @Override // l83.InterfaceC23462h
    /* JADX INFO: renamed from: b */
    public final boolean mo5046b() {
        return this.f92943x != C23478x.f92956a;
    }

    @Override // l83.InterfaceC23462h
    public final Object getValue() {
        Object obj = this.f92943x;
        C23478x c23478x = C23478x.f92956a;
        if (obj != c23478x) {
            return obj;
        }
        InterfaceC4339a interfaceC4339a = this.f92942w;
        if (interfaceC4339a != null) {
            Object objInvoke = interfaceC4339a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92941y;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c23478x, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c23478x) {
                }
            }
            this.f92942w = null;
            return objInvoke;
        }
        return this.f92943x;
    }

    public final String toString() {
        return mo5046b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
