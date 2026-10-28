package bc3;

import hc3.C17168b0;
import hc3.C17181n;
import hc3.C17191x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m83.C25258m;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: bc3.z0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3077z0 extends AbstractC2987a1 implements InterfaceC3026k0 {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12110E = AtomicReferenceFieldUpdater.newUpdater(AbstractC3077z0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12111F = AtomicReferenceFieldUpdater.newUpdater(AbstractC3077z0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12112G = AtomicIntegerFieldUpdater.newUpdater(AbstractC3077z0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: F0 */
    public void mo8736F0(Runnable runnable) {
        m8830M0();
        if (!m8831R0(runnable)) {
            RunnableC3010g0.f12027H.mo8736F0(runnable);
            return;
        }
        Thread threadMo8679a0 = mo8679a0();
        if (Thread.currentThread() != threadMo8679a0) {
            LockSupport.unpark(threadMo8679a0);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m8830M0() {
        AbstractRunnableC3071x0 abstractRunnableC3071x0M48489b;
        C3074y0 c3074y0 = (C3074y0) f12111F.get(this);
        if (c3074y0 == null || C17168b0.f65963b.get(c3074y0) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c3074y0) {
                try {
                    AbstractRunnableC3071x0[] abstractRunnableC3071x0Arr = c3074y0.f65964a;
                    abstractRunnableC3071x0M48489b = null;
                    AbstractRunnableC3071x0 abstractRunnableC3071x0 = abstractRunnableC3071x0Arr != null ? abstractRunnableC3071x0Arr[0] : null;
                    if (abstractRunnableC3071x0 != null) {
                        abstractRunnableC3071x0M48489b = ((jNanoTime - abstractRunnableC3071x0.f12106w) > 0L ? 1 : ((jNanoTime - abstractRunnableC3071x0.f12106w) == 0L ? 0 : -1)) >= 0 ? m8831R0(abstractRunnableC3071x0) : false ? c3074y0.m48489b(0) : null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (abstractRunnableC3071x0M48489b != null);
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m8831R0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12110E;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f12112G.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C17181n)) {
                if (obj == AbstractC3006f0.f12017c) {
                    return false;
                }
                C17181n c17181n = new C17181n(8, true);
                c17181n.m48532a((Runnable) obj);
                c17181n.m48532a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c17181n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C17181n c17181n2 = (C17181n) obj;
            int iM48532a = c17181n2.m48532a(runnable);
            if (iM48532a == 0) {
                return true;
            }
            if (iM48532a == 1) {
                C17181n c17181nM48534c = c17181n2.m48534c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c17181nM48534c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iM48532a == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX INFO: renamed from: S0 */
    public final boolean m8832S0() {
        Object obj;
        long j7;
        C25258m c25258m = this.f11994y;
        if (c25258m != null ? c25258m.isEmpty() : true) {
            C3074y0 c3074y0 = (C3074y0) f12111F.get(this);
            if (c3074y0 == null) {
                obj = f12110E.get(this);
                if (obj != null) {
                    if (obj instanceof C17181n) {
                        j7 = C17181n.f65993f.get((C17181n) obj);
                        if (((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC3006f0.f12017c) {
                    }
                }
                return true;
            }
            if (C17168b0.f65963b.get(c3074y0) == 0) {
                obj = f12110E.get(this);
                if (obj != null) {
                    if (obj instanceof C17181n) {
                        j7 = C17181n.f65993f.get((C17181n) obj);
                        if (((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC3006f0.f12017c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m8833T0(long j7, AbstractRunnableC3071x0 abstractRunnableC3071x0) {
        int iM8827b;
        Thread threadMo8679a0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12111F;
        AbstractRunnableC3071x0 abstractRunnableC3071x1 = null;
        if (f12112G.get(this) == 1) {
            iM8827b = 1;
        } else {
            C3074y0 c3074y0 = (C3074y0) atomicReferenceFieldUpdater.get(this);
            if (c3074y0 == null) {
                C3074y0 c3074y1 = new C3074y0();
                c3074y1.f12108c = j7;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c3074y1) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC22676k.m65747g(obj);
                c3074y0 = (C3074y0) obj;
            }
            iM8827b = abstractRunnableC3071x0.m8827b(j7, c3074y0, this);
        }
        if (iM8827b != 0) {
            if (iM8827b == 1) {
                mo8684x0(j7, abstractRunnableC3071x0);
                return;
            } else {
                if (iM8827b != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C3074y0 c3074y2 = (C3074y0) atomicReferenceFieldUpdater.get(this);
        if (c3074y2 != null) {
            synchronized (c3074y2) {
                AbstractRunnableC3071x0[] abstractRunnableC3071x0Arr = c3074y2.f65964a;
                abstractRunnableC3071x1 = abstractRunnableC3071x0Arr != null ? abstractRunnableC3071x0Arr[0] : null;
            }
        }
        if (abstractRunnableC3071x1 != abstractRunnableC3071x0 || Thread.currentThread() == (threadMo8679a0 = mo8679a0())) {
            return;
        }
        LockSupport.unpark(threadMo8679a0);
    }

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        mo8736F0(runnable);
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC3056s0 mo8690i(long j7, Runnable runnable, InterfaceC30063j interfaceC30063j) {
        return AbstractC3014h0.f12031a.mo8690i(j7, runnable, interfaceC30063j);
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: m */
    public final void mo8691m(long j7, C3033m c3033m) {
        long j13 = 0;
        if (j7 > 0) {
            j13 = j7 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j7;
        }
        if (j13 < DurationKt.MAX_MILLIS) {
            long jNanoTime = System.nanoTime();
            C3065v0 c3065v0 = new C3065v0(this, j13 + jNanoTime, c3033m);
            m8833T0(jNanoTime, c3065v0);
            c3033m.m8777v(new C3017i(c3065v0, 1));
        }
    }

    @Override // bc3.AbstractC2987a1
    /* JADX INFO: renamed from: o0 */
    public final long mo8681o0() {
        Runnable runnable;
        AbstractRunnableC3071x0 abstractRunnableC3071x0;
        C17191x c17191x = AbstractC3006f0.f12017c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12110E;
        if (!m8682p0()) {
            m8830M0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof C17181n) {
                        C17181n c17181n = (C17181n) obj;
                        Object objM48535d = c17181n.m48535d();
                        if (objM48535d != C17181n.f65994g) {
                            runnable = (Runnable) objM48535d;
                            break;
                        }
                        C17181n c17181nM48534c = c17181n.m48534c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c17181nM48534c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != c17191x) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C25258m c25258m = this.f11994y;
            if (((c25258m == null || c25258m.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C17181n) {
                        long j7 = C17181n.f65993f.get((C17181n) obj2);
                        if (((int) (1073741823 & j7)) != ((int) ((j7 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c17191x) {
                        return Long.MAX_VALUE;
                    }
                }
                C3074y0 c3074y0 = (C3074y0) f12111F.get(this);
                if (c3074y0 != null) {
                    synchronized (c3074y0) {
                        AbstractRunnableC3071x0[] abstractRunnableC3071x0Arr = c3074y0.f65964a;
                        abstractRunnableC3071x0 = abstractRunnableC3071x0Arr != null ? abstractRunnableC3071x0Arr[0] : null;
                    }
                    if (abstractRunnableC3071x0 != null) {
                        long jNanoTime = abstractRunnableC3071x0.f12106w - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // bc3.AbstractC2987a1
    public void shutdown() {
        AbstractRunnableC3071x0 abstractRunnableC3071x0M48489b;
        AbstractC3012g2.f12029a.set(null);
        f12112G.set(this, 1);
        C17191x c17191x = AbstractC3006f0.f12017c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12110E;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c17191x)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C17181n) {
                ((C17181n) obj).m48533b();
                break;
            } else {
                if (obj == c17191x) {
                    break;
                }
                C17181n c17181n = new C17181n(8, true);
                c17181n.m48532a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c17181n)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (mo8681o0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C3074y0 c3074y0 = (C3074y0) f12111F.get(this);
            if (c3074y0 == null) {
                return;
            }
            synchronized (c3074y0) {
                abstractRunnableC3071x0M48489b = C17168b0.f65963b.get(c3074y0) > 0 ? c3074y0.m48489b(0) : null;
            }
            if (abstractRunnableC3071x0M48489b == null) {
                return;
            } else {
                mo8684x0(jNanoTime, abstractRunnableC3071x0M48489b);
            }
        }
    }
}
