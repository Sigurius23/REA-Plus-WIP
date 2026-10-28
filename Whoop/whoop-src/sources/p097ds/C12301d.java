package p097ds;

import bi.AbstractC3269g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ds.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C12301d extends AbstractC3269g {

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f41215b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f41216c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f41217d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f41218e;

    /* JADX INFO: renamed from: f */
    public final AtomicReferenceFieldUpdater f41219f;

    public C12301d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f41215b = atomicReferenceFieldUpdater;
        this.f41216c = atomicReferenceFieldUpdater2;
        this.f41217d = atomicReferenceFieldUpdater3;
        this.f41218e = atomicReferenceFieldUpdater4;
        this.f41219f = atomicReferenceFieldUpdater5;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: A */
    public final C12300c mo9520A(AbstractC12311n abstractC12311n) {
        return (C12300c) this.f41218e.getAndSet(abstractC12311n, C12300c.f41211d);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: B */
    public final C12310m mo9521B(AbstractC12311n abstractC12311n) {
        return (C12310m) this.f41217d.getAndSet(abstractC12311n, C12310m.f41228c);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: Q */
    public final void mo9523Q(C12310m c12310m, C12310m c12310m2) {
        this.f41216c.lazySet(c12310m, c12310m2);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: R */
    public final void mo9524R(C12310m c12310m, Thread thread) {
        this.f41215b.lazySet(c12310m, thread);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: j */
    public final boolean mo9533j(AbstractC12311n abstractC12311n, C12300c c12300c, C12300c c12300c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f41218e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC12311n, c12300c, c12300c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC12311n) == c12300c);
        return false;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: k */
    public final boolean mo9534k(AbstractC12311n abstractC12311n, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f41219f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC12311n, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC12311n) == obj);
        return false;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: l */
    public final boolean mo9535l(AbstractC12311n abstractC12311n, C12310m c12310m, C12310m c12310m2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f41217d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC12311n, c12310m, c12310m2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC12311n) == c12310m);
        return false;
    }
}
