package kc3;

import hc3.C17191x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: kc3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C22361a extends Thread {

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f87290I = AtomicIntegerFieldUpdater.newUpdater(C22361a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: E */
    public long f87291E;

    /* JADX INFO: renamed from: F */
    public int f87292F;

    /* JADX INFO: renamed from: G */
    public boolean f87293G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ ExecutorC22363c f87294H;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: w */
    public final C22373m f87295w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: x */
    public final C22669g0 f87296x;

    /* JADX INFO: renamed from: y */
    public EnumC22362b f87297y;

    /* JADX INFO: renamed from: z */
    public long f87298z;

    public C22361a(ExecutorC22363c executorC22363c, int i13) {
        this.f87294H = executorC22363c;
        setDaemon(true);
        setContextClassLoader(ExecutorC22363c.class.getClassLoader());
        this.f87295w = new C22373m();
        this.f87296x = new C22669g0();
        this.f87297y = EnumC22362b.f87304z;
        this.nextParkedWorker = ExecutorC22363c.f87308K;
        int iNanoTime = (int) System.nanoTime();
        this.f87292F = iNanoTime == 0 ? 42 : iNanoTime;
        m64281f(i13);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC22369i m64276a(boolean z4) {
        AbstractRunnableC22369i abstractRunnableC22369iM64280e;
        AbstractRunnableC22369i abstractRunnableC22369iM64280e2;
        long j7;
        EnumC22362b enumC22362b = this.f87297y;
        EnumC22362b enumC22362b2 = EnumC22362b.f87301w;
        ExecutorC22363c executorC22363c = this.f87294H;
        AbstractRunnableC22369i abstractRunnableC22369i = null;
        C22373m c22373m = this.f87295w;
        if (enumC22362b != enumC22362b2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC22363c.f87306I;
            do {
                j7 = atomicLongFieldUpdater.get(executorC22363c);
                if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                    c22373m.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C22373m.f87331b;
                        AbstractRunnableC22369i abstractRunnableC22369i2 = (AbstractRunnableC22369i) atomicReferenceFieldUpdater.get(c22373m);
                        if (abstractRunnableC22369i2 == null || !abstractRunnableC22369i2.f87322x) {
                            int i13 = C22373m.f87333d.get(c22373m);
                            int i14 = C22373m.f87332c.get(c22373m);
                            while (i13 != i14 && C22373m.f87334e.get(c22373m) != 0) {
                                i14--;
                                AbstractRunnableC22369i abstractRunnableC22369iM64293c = c22373m.m64293c(i14, true);
                                if (abstractRunnableC22369iM64293c != null) {
                                    abstractRunnableC22369i = abstractRunnableC22369iM64293c;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c22373m, abstractRunnableC22369i2, null)) {
                                abstractRunnableC22369i = abstractRunnableC22369i2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(c22373m) == abstractRunnableC22369i2);
                    }
                    if (abstractRunnableC22369i != null) {
                        return abstractRunnableC22369i;
                    }
                    AbstractRunnableC22369i abstractRunnableC22369i3 = (AbstractRunnableC22369i) executorC22363c.f87310F.m48531c();
                    return abstractRunnableC22369i3 == null ? m64284i(1) : abstractRunnableC22369i3;
                }
            } while (!ExecutorC22363c.f87306I.compareAndSet(executorC22363c, j7, j7 - 4398046511104L));
            this.f87297y = EnumC22362b.f87301w;
        }
        if (z4) {
            boolean z13 = m64279d(executorC22363c.f87312w * 2) == 0;
            if (z13 && (abstractRunnableC22369iM64280e2 = m64280e()) != null) {
                return abstractRunnableC22369iM64280e2;
            }
            c22373m.getClass();
            AbstractRunnableC22369i abstractRunnableC22369iM64292b = (AbstractRunnableC22369i) C22373m.f87331b.getAndSet(c22373m, null);
            if (abstractRunnableC22369iM64292b == null) {
                abstractRunnableC22369iM64292b = c22373m.m64292b();
            }
            if (abstractRunnableC22369iM64292b != null) {
                return abstractRunnableC22369iM64292b;
            }
            if (!z13 && (abstractRunnableC22369iM64280e = m64280e()) != null) {
                return abstractRunnableC22369iM64280e;
            }
        } else {
            AbstractRunnableC22369i abstractRunnableC22369iM64280e3 = m64280e();
            if (abstractRunnableC22369iM64280e3 != null) {
                return abstractRunnableC22369iM64280e3;
            }
        }
        return m64284i(3);
    }

    /* JADX INFO: renamed from: b */
    public final int m64277b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m64278c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m64279d(int i13) {
        int i14 = this.f87292F;
        int i15 = i14 ^ (i14 << 13);
        int i16 = i15 ^ (i15 >> 17);
        int i17 = i16 ^ (i16 << 5);
        this.f87292F = i17;
        int i18 = i13 - 1;
        return (i18 & i13) == 0 ? i17 & i18 : (i17 & Integer.MAX_VALUE) % i13;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractRunnableC22369i m64280e() {
        int iM64279d = m64279d(2);
        ExecutorC22363c executorC22363c = this.f87294H;
        if (iM64279d == 0) {
            AbstractRunnableC22369i abstractRunnableC22369i = (AbstractRunnableC22369i) executorC22363c.f87309E.m48531c();
            return abstractRunnableC22369i != null ? abstractRunnableC22369i : (AbstractRunnableC22369i) executorC22363c.f87310F.m48531c();
        }
        AbstractRunnableC22369i abstractRunnableC22369i2 = (AbstractRunnableC22369i) executorC22363c.f87310F.m48531c();
        return abstractRunnableC22369i2 != null ? abstractRunnableC22369i2 : (AbstractRunnableC22369i) executorC22363c.f87309E.m48531c();
    }

    /* JADX INFO: renamed from: f */
    public final void m64281f(int i13) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f87294H.f87315z);
        sb4.append("-worker-");
        sb4.append(i13 == 0 ? "TERMINATED" : String.valueOf(i13));
        setName(sb4.toString());
        this.indexInArray = i13;
    }

    /* JADX INFO: renamed from: g */
    public final void m64282g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m64283h(EnumC22362b enumC22362b) {
        EnumC22362b enumC22362b2 = this.f87297y;
        boolean z4 = enumC22362b2 == EnumC22362b.f87301w;
        if (z4) {
            ExecutorC22363c.f87306I.addAndGet(this.f87294H, 4398046511104L);
        }
        if (enumC22362b2 != enumC22362b) {
            this.f87297y = enumC22362b;
        }
        return z4;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractRunnableC22369i m64284i(int i13) {
        long j7;
        AbstractRunnableC22369i abstractRunnableC22369iM64293c;
        long j13;
        long j14;
        AbstractRunnableC22369i abstractRunnableC22369i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC22363c.f87306I;
        ExecutorC22363c executorC22363c = this.f87294H;
        int i14 = (int) (atomicLongFieldUpdater.get(executorC22363c) & 2097151);
        AbstractRunnableC22369i abstractRunnableC22369i2 = null;
        if (i14 < 2) {
            return null;
        }
        int iM64279d = m64279d(i14);
        int i15 = 0;
        long jMin = Long.MAX_VALUE;
        while (i15 < i14) {
            iM64279d++;
            if (iM64279d > i14) {
                iM64279d = 1;
            }
            C22361a c22361a = (C22361a) executorC22363c.f87311G.m48540b(iM64279d);
            if (c22361a != null && c22361a != this) {
                C22373m c22373m = c22361a.f87295w;
                if (i13 != 3) {
                    c22373m.getClass();
                    int i16 = C22373m.f87333d.get(c22373m);
                    int i17 = C22373m.f87332c.get(c22373m);
                    boolean z4 = i13 == 1;
                    while (true) {
                        if (i16 != i17) {
                            j7 = 0;
                            if (!z4 || C22373m.f87334e.get(c22373m) != 0) {
                                int i18 = i16 + 1;
                                abstractRunnableC22369iM64293c = c22373m.m64293c(i16, z4);
                                if (abstractRunnableC22369iM64293c != null) {
                                    break;
                                }
                                i16 = i18;
                            }
                        } else {
                            j7 = 0;
                        }
                        abstractRunnableC22369iM64293c = abstractRunnableC22369i2;
                        break;
                    }
                } else {
                    abstractRunnableC22369iM64293c = c22373m.m64292b();
                    j7 = 0;
                }
                C22669g0 c22669g0 = this.f87296x;
                if (abstractRunnableC22369iM64293c == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C22373m.f87331b;
                        AbstractRunnableC22369i abstractRunnableC22369i3 = (AbstractRunnableC22369i) atomicReferenceFieldUpdater.get(c22373m);
                        if (abstractRunnableC22369i3 == null) {
                            j13 = -1;
                        } else {
                            j13 = -1;
                            if (((abstractRunnableC22369i3.f87322x ? 1 : 2) & i13) != 0) {
                                AbstractC22371k.f87329f.getClass();
                                C22373m c22373m2 = c22373m;
                                long jNanoTime = System.nanoTime() - abstractRunnableC22369i3.f87321w;
                                long j15 = AbstractC22371k.f87325b;
                                if (jNanoTime < j15) {
                                    j14 = j15 - jNanoTime;
                                    abstractRunnableC22369i = null;
                                    break;
                                }
                                do {
                                    abstractRunnableC22369i = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(c22373m2, abstractRunnableC22369i3, null)) {
                                        c22669g0.f89336w = abstractRunnableC22369i3;
                                        j14 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(c22373m2) == abstractRunnableC22369i3);
                                c22373m = c22373m2;
                                abstractRunnableC22369i2 = null;
                            }
                        }
                        j14 = -2;
                        abstractRunnableC22369i = abstractRunnableC22369i2;
                        break;
                    }
                } else {
                    c22669g0.f89336w = abstractRunnableC22369iM64293c;
                    abstractRunnableC22369i = abstractRunnableC22369i2;
                    j14 = -1;
                    j13 = -1;
                }
                if (j14 == j13) {
                    AbstractRunnableC22369i abstractRunnableC22369i4 = (AbstractRunnableC22369i) c22669g0.f89336w;
                    c22669g0.f89336w = abstractRunnableC22369i;
                    return abstractRunnableC22369i4;
                }
                if (j14 > j7) {
                    jMin = Math.min(jMin, j14);
                }
            }
            i15++;
            abstractRunnableC22369i2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f87291E = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j7;
        loop0: while (true) {
            boolean z4 = false;
            while (true) {
                if (ExecutorC22363c.f87307J.get(this.f87294H) != 1) {
                    EnumC22362b enumC22362b = this.f87297y;
                    EnumC22362b enumC22362b2 = EnumC22362b.f87299E;
                    if (enumC22362b == enumC22362b2) {
                        break loop0;
                    }
                    AbstractRunnableC22369i abstractRunnableC22369iM64276a = m64276a(this.f87293G);
                    if (abstractRunnableC22369iM64276a != null) {
                        this.f87291E = 0L;
                        ExecutorC22363c executorC22363c = this.f87294H;
                        this.f87298z = 0L;
                        if (this.f87297y == EnumC22362b.f87303y) {
                            this.f87297y = EnumC22362b.f87302x;
                        }
                        if (!abstractRunnableC22369iM64276a.f87322x) {
                            try {
                                abstractRunnableC22369iM64276a.run();
                                break;
                            } catch (Throwable th3) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th3);
                                break;
                            }
                        }
                        if (m64283h(EnumC22362b.f87302x) && !executorC22363c.m64290s() && !executorC22363c.m64289m(ExecutorC22363c.f87306I.get(executorC22363c))) {
                            executorC22363c.m64290s();
                        }
                        try {
                            abstractRunnableC22369iM64276a.run();
                        } catch (Throwable th4) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th4);
                        }
                        ExecutorC22363c.f87306I.addAndGet(executorC22363c, -2097152L);
                        if (this.f87297y == enumC22362b2) {
                            break;
                        }
                        this.f87297y = EnumC22362b.f87304z;
                        break;
                    }
                    this.f87293G = false;
                    if (this.f87291E == 0) {
                        Object obj = this.nextParkedWorker;
                        C17191x c17191x = ExecutorC22363c.f87308K;
                        if (obj != c17191x) {
                            f87290I.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC22363c.f87308K) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f87290I;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                ExecutorC22363c executorC22363c2 = this.f87294H;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC22363c.f87307J;
                                if (atomicIntegerFieldUpdater2.get(executorC22363c2) == 1) {
                                    break;
                                }
                                EnumC22362b enumC22362b3 = this.f87297y;
                                EnumC22362b enumC22362b4 = EnumC22362b.f87299E;
                                if (enumC22362b3 == enumC22362b4) {
                                    break;
                                }
                                m64283h(EnumC22362b.f87303y);
                                Thread.interrupted();
                                if (this.f87298z == 0) {
                                    j7 = 2097151;
                                    this.f87298z = System.nanoTime() + this.f87294H.f87314y;
                                } else {
                                    j7 = 2097151;
                                }
                                LockSupport.parkNanos(this.f87294H.f87314y);
                                if (System.nanoTime() - this.f87298z >= 0) {
                                    this.f87298z = 0L;
                                    ExecutorC22363c executorC22363c3 = this.f87294H;
                                    synchronized (executorC22363c3.f87311G) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(executorC22363c3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC22363c.f87306I;
                                                if (((int) (atomicLongFieldUpdater.get(executorC22363c3) & j7)) > executorC22363c3.f87312w) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i13 = this.indexInArray;
                                                        m64281f(0);
                                                        executorC22363c3.m64288k(this, i13, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC22363c3) & j7);
                                                        if (andDecrement != i13) {
                                                            Object objM48540b = executorC22363c3.f87311G.m48540b(andDecrement);
                                                            AbstractC22676k.m65747g(objM48540b);
                                                            C22361a c22361a = (C22361a) objM48540b;
                                                            executorC22363c3.f87311G.m48541c(i13, c22361a);
                                                            c22361a.m64281f(i13);
                                                            executorC22363c3.m64288k(c22361a, andDecrement, i13);
                                                        }
                                                        executorC22363c3.f87311G.m48541c(andDecrement, null);
                                                        this.f87297y = enumC22362b4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            throw th5;
                                        }
                                    }
                                }
                            }
                        } else {
                            ExecutorC22363c executorC22363c4 = this.f87294H;
                            if (this.nextParkedWorker == c17191x) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC22363c.f87305H;
                                while (true) {
                                    long j13 = atomicLongFieldUpdater2.get(executorC22363c4);
                                    int i14 = this.indexInArray;
                                    this.nextParkedWorker = executorC22363c4.f87311G.m48540b((int) (j13 & 2097151));
                                    ExecutorC22363c executorC22363c5 = executorC22363c4;
                                    if (ExecutorC22363c.f87305H.compareAndSet(executorC22363c5, j13, ((j13 + 2097152) & (-2097152)) | ((long) i14))) {
                                        break;
                                    } else {
                                        executorC22363c4 = executorC22363c5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z4) {
                            m64283h(EnumC22362b.f87303y);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f87291E);
                            this.f87291E = 0L;
                            break;
                        }
                        z4 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        m64283h(EnumC22362b.f87299E);
    }
}
