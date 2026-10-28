package p080d4;

import hg3.AbstractC17269i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: d4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11646e extends AbstractC17269i {

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f37613c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f37614d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f37615e;

    /* JADX INFO: renamed from: f */
    public final AtomicReferenceFieldUpdater f37616f;

    /* JADX INFO: renamed from: g */
    public final AtomicReferenceFieldUpdater f37617g;

    public C11646e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f37613c = atomicReferenceFieldUpdater;
        this.f37614d = atomicReferenceFieldUpdater2;
        this.f37615e = atomicReferenceFieldUpdater3;
        this.f37616f = atomicReferenceFieldUpdater4;
        this.f37617g = atomicReferenceFieldUpdater5;
    }

    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: h0 */
    public final void mo31052h0(C11648g c11648g, C11648g c11648g2) {
        this.f37614d.lazySet(c11648g, c11648g2);
    }

    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: i0 */
    public final void mo31053i0(C11648g c11648g, Thread thread) {
        this.f37613c.lazySet(c11648g, thread);
    }

    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: w */
    public final boolean mo31054w(AbstractC11649h abstractC11649h, C11645d c11645d, C11645d c11645d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f37616f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC11649h, c11645d, c11645d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC11649h) == c11645d);
        return false;
    }

    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: x */
    public final boolean mo31055x(AbstractC11649h abstractC11649h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f37617g;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC11649h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC11649h) == obj);
        return false;
    }

    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: y */
    public final boolean mo31056y(AbstractC11649h abstractC11649h, C11648g c11648g, C11648g c11648g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f37615e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC11649h, c11648g, c11648g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC11649h) == c11648g);
        return false;
    }
}
