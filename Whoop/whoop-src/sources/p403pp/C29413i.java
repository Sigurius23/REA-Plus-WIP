package p403pp;

import bi.AbstractC3269g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: pp.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C29413i extends AbstractC3269g {

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f119439b = AtomicReferenceFieldUpdater.newUpdater(C29419o.class, Thread.class, "a");

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f119440c = AtomicReferenceFieldUpdater.newUpdater(C29419o.class, C29419o.class, "b");

    /* JADX INFO: renamed from: d */
    public static final AtomicReferenceFieldUpdater f119441d = AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC29420p.class, C29419o.class, "H");

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceFieldUpdater f119442e = AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC29420p.class, C29412h.class, "G");

    /* JADX INFO: renamed from: f */
    public static final AtomicReferenceFieldUpdater f119443f = AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC29420p.class, Object.class, "F");

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: d0 */
    public final void mo9527d0(C29419o c29419o, Thread thread) {
        f119439b.lazySet(c29419o, thread);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: e0 */
    public final void mo9528e0(C29419o c29419o, C29419o c29419o2) {
        f119440c.lazySet(c29419o, c29419o2);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: f0 */
    public final boolean mo9529f0(AbstractFutureC29420p abstractFutureC29420p, C29419o c29419o, C29419o c29419o2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f119441d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC29420p, c29419o, c29419o2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC29420p) == c29419o);
        return false;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: g0 */
    public final C29419o mo9530g0(C29406b c29406b) {
        return (C29419o) f119441d.getAndSet(c29406b, C29419o.f119450c);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: h0 */
    public final C29412h mo9531h0(C29406b c29406b) {
        return (C29412h) f119442e.getAndSet(c29406b, C29412h.f119437b);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: i0 */
    public final boolean mo9532i0(AbstractFutureC29420p abstractFutureC29420p, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f119443f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC29420p, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC29420p) == obj);
        return false;
    }
}
