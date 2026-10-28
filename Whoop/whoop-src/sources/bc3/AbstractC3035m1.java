package bc3;

import hc3.C17178k;
import hc3.C17186s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bc3.m1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3035m1 extends C17178k implements InterfaceC3056s0, InterfaceC3011g1 {

    /* JADX INFO: renamed from: z */
    public C3060t1 f12056z;

    @Override // bc3.InterfaceC3011g1
    /* JADX INFO: renamed from: b */
    public final C3072x1 mo8733b() {
        return null;
    }

    @Override // bc3.InterfaceC3056s0
    public final void dispose() {
        C3060t1 c3060t1M8786h = m8786h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3060t1.f12091w;
            Object obj = atomicReferenceFieldUpdater.get(c3060t1M8786h);
            if (obj instanceof AbstractC3035m1) {
                if (obj != this) {
                    return;
                }
                C3062u0 c3062u0 = AbstractC3006f0.f12024j;
                while (!atomicReferenceFieldUpdater.compareAndSet(c3060t1M8786h, obj, c3062u0)) {
                    if (atomicReferenceFieldUpdater.get(c3060t1M8786h) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC3011g1) || ((InterfaceC3011g1) obj).mo8733b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C17178k.f65987w;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C17186s) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C17178k c17178k = (C17178k) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C17178k.f65989y;
                C17186s c17186s = (C17186s) atomicReferenceFieldUpdater3.get(c17178k);
                if (c17186s == null) {
                    c17186s = new C17186s(c17178k);
                    atomicReferenceFieldUpdater3.set(c17178k, c17186s);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c17186s)) {
                        c17178k.m48526d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public InterfaceC3027k1 getParent() {
        return m8786h();
    }

    /* JADX INFO: renamed from: h */
    public final C3060t1 m8786h() {
        C3060t1 c3060t1 = this.f12056z;
        if (c3060t1 != null) {
            return c3060t1;
        }
        AbstractC22676k.m65757q("job");
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo8685i();

    @Override // bc3.InterfaceC3011g1
    public final boolean isActive() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo8686j(Throwable th3);

    @Override // hc3.C17178k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC3006f0.m8724r(this) + "[job@" + AbstractC3006f0.m8724r(m8786h()) + ']';
    }
}
