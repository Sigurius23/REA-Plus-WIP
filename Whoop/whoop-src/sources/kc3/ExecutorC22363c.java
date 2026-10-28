package kc3;

import bc3.AbstractC3006f0;
import hc3.AbstractC17176i;
import hc3.C17179l;
import hc3.C17181n;
import hc3.C17187t;
import hc3.C17191x;
import io.getstream.chat.android.client.ChatClient;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: kc3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC22363c implements Executor, Closeable {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ AtomicLongFieldUpdater f87305H = AtomicLongFieldUpdater.newUpdater(ExecutorC22363c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ AtomicLongFieldUpdater f87306I = AtomicLongFieldUpdater.newUpdater(ExecutorC22363c.class, "controlState$volatile");

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f87307J = AtomicIntegerFieldUpdater.newUpdater(ExecutorC22363c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: K */
    public static final C17191x f87308K = new C17191x("NOT_IN_STACK", 0);

    /* JADX INFO: renamed from: E */
    public final C22366f f87309E;

    /* JADX INFO: renamed from: F */
    public final C22366f f87310F;

    /* JADX INFO: renamed from: G */
    public final C17187t f87311G;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: w */
    public final int f87312w;

    /* JADX INFO: renamed from: x */
    public final int f87313x;

    /* JADX INFO: renamed from: y */
    public final long f87314y;

    /* JADX INFO: renamed from: z */
    public final String f87315z;

    public ExecutorC22363c(long j7, String str, int i13, int i14) {
        this.f87312w = i13;
        this.f87313x = i14;
        this.f87314y = j7;
        this.f87315z = str;
        if (i13 < 1) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Core pool size ", " should be at least 1").toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i14, i13, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i14 > 2097150) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i14, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 <= 0) {
            throw new IllegalArgumentException(AbstractC31061c.m95636l(j7, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f87309E = new C22366f();
        this.f87310F = new C22366f();
        this.f87311G = new C17187t((i13 + 1) * 2);
        this.controlState$volatile = ((long) i13) << 42;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m64285i(ExecutorC22363c executorC22363c, Runnable runnable, int i13) {
        executorC22363c.m64287h(runnable, false, (i13 & 4) == 0);
    }

    /* JADX INFO: renamed from: b */
    public final int m64286b() {
        synchronized (this.f87311G) {
            try {
                if (f87307J.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f87306I;
                long j7 = atomicLongFieldUpdater.get(this);
                int i13 = (int) (j7 & 2097151);
                int i14 = i13 - ((int) ((j7 & 4398044413952L) >> 21));
                if (i14 < 0) {
                    i14 = 0;
                }
                if (i14 >= this.f87312w) {
                    return 0;
                }
                if (i13 >= this.f87313x) {
                    return 0;
                }
                int i15 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i15 <= 0 || this.f87311G.m48540b(i15) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C22361a c22361a = new C22361a(this, i15);
                this.f87311G.m48541c(i15, c22361a);
                if (i15 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i16 = i14 + 1;
                c22361a.start();
                return i16;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i13;
        AbstractRunnableC22369i abstractRunnableC22369iM64276a;
        if (f87307J.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C22361a c22361a = threadCurrentThread instanceof C22361a ? (C22361a) threadCurrentThread : null;
            if (c22361a == null || !AbstractC22676k.m65745e(c22361a.f87294H, this)) {
                c22361a = null;
            }
            synchronized (this.f87311G) {
                i13 = (int) (f87306I.get(this) & 2097151);
            }
            if (1 <= i13) {
                int i14 = 1;
                while (true) {
                    Object objM48540b = this.f87311G.m48540b(i14);
                    AbstractC22676k.m65747g(objM48540b);
                    C22361a c22361a2 = (C22361a) objM48540b;
                    if (c22361a2 != c22361a) {
                        while (c22361a2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c22361a2);
                            c22361a2.join(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);
                        }
                        C22373m c22373m = c22361a2.f87295w;
                        C22366f c22366f = this.f87310F;
                        c22373m.getClass();
                        AbstractRunnableC22369i abstractRunnableC22369i = (AbstractRunnableC22369i) C22373m.f87331b.getAndSet(c22373m, null);
                        if (abstractRunnableC22369i != null) {
                            c22366f.m48529a(abstractRunnableC22369i);
                        }
                        while (true) {
                            AbstractRunnableC22369i abstractRunnableC22369iM64292b = c22373m.m64292b();
                            if (abstractRunnableC22369iM64292b == null) {
                                break;
                            } else {
                                c22366f.m48529a(abstractRunnableC22369iM64292b);
                            }
                        }
                    }
                    if (i14 == i13) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            C22366f c22366f2 = this.f87310F;
            c22366f2.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C17179l.f65990a;
            while (true) {
                C17181n c17181n = (C17181n) atomicReferenceFieldUpdater.get(c22366f2);
                if (c17181n.m48533b()) {
                    break;
                } else {
                    AbstractC17176i.m48514p(atomicReferenceFieldUpdater, c22366f2, c17181n, c17181n.m48534c());
                }
            }
            C22366f c22366f3 = this.f87309E;
            c22366f3.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C17179l.f65990a;
            while (true) {
                C17181n c17181n2 = (C17181n) atomicReferenceFieldUpdater2.get(c22366f3);
                if (c17181n2.m48533b()) {
                    break;
                } else {
                    AbstractC17176i.m48514p(atomicReferenceFieldUpdater2, c22366f3, c17181n2, c17181n2.m48534c());
                }
            }
            while (true) {
                if (c22361a != null) {
                    abstractRunnableC22369iM64276a = c22361a.m64276a(true);
                    if (abstractRunnableC22369iM64276a == null) {
                        abstractRunnableC22369iM64276a = (AbstractRunnableC22369i) this.f87309E.m48531c();
                        if (abstractRunnableC22369iM64276a == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC22369iM64276a = (AbstractRunnableC22369i) this.f87309E.m48531c();
                    if (abstractRunnableC22369iM64276a == null && (abstractRunnableC22369iM64276a = (AbstractRunnableC22369i) this.f87310F.m48531c()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC22369iM64276a.run();
                } catch (Throwable th3) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                }
            }
            if (c22361a != null) {
                c22361a.m64283h(EnumC22362b.f87299E);
            }
            f87305H.set(this, 0L);
            f87306I.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m64285i(this, runnable, 6);
    }

    /* JADX INFO: renamed from: h */
    public final void m64287h(Runnable runnable, boolean z4, boolean z13) {
        AbstractRunnableC22369i c22370j;
        EnumC22362b enumC22362b;
        AbstractC22371k.f87329f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC22369i) {
            c22370j = (AbstractRunnableC22369i) runnable;
            c22370j.f87321w = jNanoTime;
            c22370j.f87322x = z4;
        } else {
            c22370j = new C22370j(runnable, jNanoTime, z4);
        }
        boolean z14 = c22370j.f87322x;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f87306I;
        long jAddAndGet = z14 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C22361a c22361a = threadCurrentThread instanceof C22361a ? (C22361a) threadCurrentThread : null;
        if (c22361a == null || !AbstractC22676k.m65745e(c22361a.f87294H, this)) {
            c22361a = null;
        }
        if (c22361a != null && (enumC22362b = c22361a.f87297y) != EnumC22362b.f87299E && (c22370j.f87322x || enumC22362b != EnumC22362b.f87302x)) {
            c22361a.f87293G = true;
            C22373m c22373m = c22361a.f87295w;
            if (z13) {
                c22370j = c22373m.m64291a(c22370j);
            } else {
                c22373m.getClass();
                AbstractRunnableC22369i abstractRunnableC22369i = (AbstractRunnableC22369i) C22373m.f87331b.getAndSet(c22373m, c22370j);
                c22370j = abstractRunnableC22369i == null ? null : c22373m.m64291a(abstractRunnableC22369i);
            }
        }
        if (c22370j != null) {
            if (!(c22370j.f87322x ? this.f87310F.m48529a(c22370j) : this.f87309E.m48529a(c22370j))) {
                throw new RejectedExecutionException(AbstractC25012a.m73376i(this.f87315z, " was terminated", new StringBuilder()));
            }
        }
        if (z14) {
            if (m64290s() || m64289m(jAddAndGet)) {
                return;
            }
            m64290s();
            return;
        }
        if (m64290s() || m64289m(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m64290s();
    }

    /* JADX INFO: renamed from: k */
    public final void m64288k(C22361a c22361a, int i13, int i14) {
        while (true) {
            long j7 = f87305H.get(this);
            int i15 = (int) (2097151 & j7);
            long j13 = (2097152 + j7) & (-2097152);
            if (i15 == i13) {
                if (i14 == 0) {
                    Object objM64278c = c22361a.m64278c();
                    while (true) {
                        if (objM64278c == f87308K) {
                            i15 = -1;
                            break;
                        }
                        if (objM64278c == null) {
                            i15 = 0;
                            break;
                        }
                        C22361a c22361a2 = (C22361a) objM64278c;
                        int iM64277b = c22361a2.m64277b();
                        if (iM64277b != 0) {
                            i15 = iM64277b;
                            break;
                        }
                        objM64278c = c22361a2.m64278c();
                    }
                } else {
                    i15 = i14;
                }
            }
            if (i15 >= 0) {
                if (f87305H.compareAndSet(this, j7, ((long) i15) | j13)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m64289m(long j7) {
        int i13 = ((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21));
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = this.f87312w;
        if (i13 < i14) {
            int iM64286b = m64286b();
            if (iM64286b == 1 && i14 > 1) {
                m64286b();
            }
            if (iM64286b > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m64290s() {
        C17191x c17191x;
        int iM64277b;
        while (true) {
            long j7 = f87305H.get(this);
            C22361a c22361a = (C22361a) this.f87311G.m48540b((int) (2097151 & j7));
            if (c22361a == null) {
                c22361a = null;
            } else {
                long j13 = (2097152 + j7) & (-2097152);
                Object objM64278c = c22361a.m64278c();
                while (true) {
                    c17191x = f87308K;
                    if (objM64278c == c17191x) {
                        iM64277b = -1;
                        break;
                    }
                    if (objM64278c == null) {
                        iM64277b = 0;
                        break;
                    }
                    C22361a c22361a2 = (C22361a) objM64278c;
                    iM64277b = c22361a2.m64277b();
                    if (iM64277b != 0) {
                        break;
                    }
                    objM64278c = c22361a2.m64278c();
                }
                if (iM64277b >= 0) {
                    if (f87305H.compareAndSet(this, j7, ((long) iM64277b) | j13)) {
                        c22361a.m64282g(c17191x);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c22361a == null) {
                return false;
            }
            if (C22361a.f87290I.compareAndSet(c22361a, -1, 0)) {
                LockSupport.unpark(c22361a);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C17187t c17187t = this.f87311G;
        int iM48539a = c17187t.m48539a();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 1; i18 < iM48539a; i18++) {
            C22361a c22361a = (C22361a) c17187t.m48540b(i18);
            if (c22361a != null) {
                C22373m c22373m = c22361a.f87295w;
                c22373m.getClass();
                int i19 = C22373m.f87331b.get(c22373m) != null ? (C22373m.f87332c.get(c22373m) - C22373m.f87333d.get(c22373m)) + 1 : C22373m.f87332c.get(c22373m) - C22373m.f87333d.get(c22373m);
                int iOrdinal = c22361a.f87297y.ordinal();
                if (iOrdinal == 0) {
                    i13++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i19);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                } else if (iOrdinal == 1) {
                    i14++;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i19);
                    sb5.append('b');
                    arrayList.add(sb5.toString());
                } else if (iOrdinal == 2) {
                    i15++;
                } else if (iOrdinal == 3) {
                    i16++;
                    if (i19 > 0) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(i19);
                        sb6.append('d');
                        arrayList.add(sb6.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i17++;
                }
            }
        }
        long j7 = f87306I.get(this);
        StringBuilder sb7 = new StringBuilder();
        sb7.append(this.f87315z);
        sb7.append('@');
        sb7.append(AbstractC3006f0.m8724r(this));
        sb7.append("[Pool Size {core = ");
        int i24 = this.f87312w;
        sb7.append(i24);
        sb7.append(", max = ");
        AbstractC30802r.m94773v(sb7, this.f87313x, "}, Worker States {CPU = ", i13, ", blocking = ");
        AbstractC30802r.m94773v(sb7, i14, ", parked = ", i15, ", dormant = ");
        AbstractC30802r.m94773v(sb7, i16, ", terminated = ", i17, "}, running workers queues = ");
        sb7.append(arrayList);
        sb7.append(", global CPU queue size = ");
        sb7.append(this.f87309E.m48530b());
        sb7.append(", global blocking queue size = ");
        sb7.append(this.f87310F.m48530b());
        sb7.append(", Control State {created workers= ");
        sb7.append((int) (2097151 & j7));
        sb7.append(", blocking tasks = ");
        sb7.append((int) ((4398044413952L & j7) >> 21));
        sb7.append(", CPUs acquired = ");
        sb7.append(i24 - ((int) ((j7 & 9223367638808264704L) >> 42)));
        sb7.append("}]");
        return sb7.toString();
    }
}
