package x63;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32131l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x63.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38032d implements InterfaceC38034f {

    /* JADX INFO: renamed from: E */
    public static final AtomicLongFieldUpdater f162935E;
    private volatile long top;

    /* JADX INFO: renamed from: w */
    public final int f162936w;

    /* JADX INFO: renamed from: x */
    public final int f162937x;

    /* JADX INFO: renamed from: y */
    public final AtomicReferenceArray f162938y;

    /* JADX INFO: renamed from: z */
    public final int[] f162939z;

    static {
        AtomicLongFieldUpdater atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(AbstractC38032d.class, C38031c.f162934w.getName());
        AbstractC22676k.m65749i(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        f162935E = atomicLongFieldUpdaterNewUpdater;
    }

    public AbstractC38032d(int i13) {
        if (i13 <= 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "capacity should be positive but it is ").toString());
        }
        if (i13 > 536870911) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i13 * 4) - 1) * 2;
        this.f162936w = iHighestOneBit;
        this.f162937x = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i14 = iHighestOneBit + 1;
        this.f162938y = new AtomicReferenceArray(i14);
        this.f162939z = new int[i14];
    }

    @Override // x63.InterfaceC38034f
    /* JADX INFO: renamed from: a1 */
    public final void mo55795a1(Object instance) {
        long j7;
        long j13;
        AbstractC22676k.m65750j(instance, "instance");
        mo113261x(instance);
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.f162937x) + 1;
        for (int i13 = 0; i13 < 8; i13++) {
            AtomicReferenceArray atomicReferenceArray = this.f162938y;
            do {
                if (atomicReferenceArray.compareAndSet(iIdentityHashCode, null, instance)) {
                    if (iIdentityHashCode <= 0) {
                        throw new IllegalArgumentException("index should be positive");
                    }
                    do {
                        j7 = this.top;
                        j13 = ((((j7 >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                        this.f162939z[iIdentityHashCode] = (int) (4294967295L & j7);
                    } while (!f162935E.compareAndSet(this, j7, j13));
                    return;
                }
            } while (atomicReferenceArray.get(iIdentityHashCode) == null);
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.f162936w;
            }
        }
        mo55797k(instance);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC32131l.m100074h(this);
    }

    @Override // x63.InterfaceC38034f
    public final void dispose() {
        while (true) {
            Object objM121770s = m121770s();
            if (objM121770s == null) {
                return;
            } else {
                mo55797k(objM121770s);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public Object mo113260i(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public void mo55797k(Object instance) {
        AbstractC22676k.m65750j(instance, "instance");
    }

    /* JADX INFO: renamed from: m */
    public abstract Object mo55798m();

    /* JADX INFO: renamed from: s */
    public final Object m121770s() {
        long j7;
        int i13;
        AbstractC38032d abstractC38032d;
        long j13;
        do {
            j7 = this.top;
            if (j7 != 0) {
                j13 = ((j7 >> 32) & 4294967295L) + 1;
                i13 = (int) (4294967295L & j7);
                if (i13 != 0) {
                    abstractC38032d = this;
                }
            }
            i13 = 0;
            abstractC38032d = this;
            break;
        } while (!f162935E.compareAndSet(abstractC38032d, j7, (j13 << 32) | ((long) this.f162939z[i13])));
        if (i13 == 0) {
            return null;
        }
        return abstractC38032d.f162938y.getAndSet(i13, null);
    }

    @Override // x63.InterfaceC38034f
    /* JADX INFO: renamed from: t0 */
    public final Object mo55796t0() {
        Object objM121770s = m121770s();
        return objM121770s != null ? mo113260i(objM121770s) : mo55798m();
    }

    /* JADX INFO: renamed from: x */
    public void mo113261x(Object instance) {
        AbstractC22676k.m65750j(instance, "instance");
    }
}
