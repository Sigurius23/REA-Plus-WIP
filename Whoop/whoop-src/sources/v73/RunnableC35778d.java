package v73;

import a83.AbstractC0573a;
import a83.EnumC0575c;
import bi.AbstractC3269g;
import eg3.InterfaceC13182a;
import eg3.InterfaceC13183b;
import hg3.AbstractC17269i;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import l73.AbstractC23415f;
import l73.InterfaceC23411b;
import p249jc.AbstractC21598x;
import s73.InterfaceC32245c;
import s73.InterfaceC32247e;
import x73.C38044a;

/* JADX INFO: renamed from: v73.d */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC35778d extends AbstractC0573a implements InterfaceC23411b, Runnable {

    /* JADX INFO: renamed from: E */
    public Object f152148E;

    /* JADX INFO: renamed from: F */
    public InterfaceC32247e f152149F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f152150G;

    /* JADX INFO: renamed from: H */
    public volatile boolean f152151H;

    /* JADX INFO: renamed from: I */
    public Throwable f152152I;

    /* JADX INFO: renamed from: J */
    public int f152153J;

    /* JADX INFO: renamed from: K */
    public long f152154K;

    /* JADX INFO: renamed from: L */
    public boolean f152155L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC23411b f152156M;

    /* JADX INFO: renamed from: w */
    public final AbstractC23415f f152157w;

    /* JADX INFO: renamed from: x */
    public final int f152158x;

    /* JADX INFO: renamed from: y */
    public final int f152159y;

    /* JADX INFO: renamed from: z */
    public final AtomicLong f152160z = new AtomicLong();

    public RunnableC35778d(InterfaceC23411b interfaceC23411b, AbstractC23415f abstractC23415f, int i13) {
        this.f152157w = abstractC23415f;
        this.f152158x = i13;
        this.f152159y = i13 - (i13 >> 2);
        this.f152156M = interfaceC23411b;
    }

    @Override // s73.InterfaceC32244b
    /* JADX INFO: renamed from: a */
    public final int mo1488a() {
        this.f152155L = true;
        return 2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg3.b, java.lang.Object] */
    @Override // eg3.InterfaceC13182a
    /* JADX INFO: renamed from: b */
    public final void mo36113b(InterfaceC13183b interfaceC13183b) {
        if (EnumC0575c.m1491c(this.f152148E, interfaceC13183b)) {
            this.f152148E = interfaceC13183b;
            if (interfaceC13183b instanceof InterfaceC32245c) {
                InterfaceC32245c interfaceC32245c = (InterfaceC32245c) interfaceC13183b;
                int iMo1488a = interfaceC32245c.mo1488a();
                if (iMo1488a == 1) {
                    this.f152153J = 1;
                    this.f152149F = interfaceC32245c;
                    this.f152151H = true;
                    this.f152156M.mo36113b(this);
                    return;
                }
                if (iMo1488a == 2) {
                    this.f152153J = 2;
                    this.f152149F = interfaceC32245c;
                    this.f152156M.mo36113b(this);
                    interfaceC13183b.request(this.f152158x);
                    return;
                }
            }
            this.f152149F = new C38044a(this.f152158x);
            this.f152156M.mo36113b(this);
            interfaceC13183b.request(this.f152158x);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m113372c(boolean z4, boolean z13, InterfaceC13182a interfaceC13182a) {
        if (this.f152150G) {
            clear();
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th3 = this.f152152I;
        if (th3 != null) {
            this.f152150G = true;
            clear();
            interfaceC13182a.onError(th3);
            this.f152157w.dispose();
            return true;
        }
        if (!z13) {
            return false;
        }
        this.f152150G = true;
        interfaceC13182a.onComplete();
        this.f152157w.dispose();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eg3.b, java.lang.Object] */
    @Override // eg3.InterfaceC13183b
    public final void cancel() {
        if (this.f152150G) {
            return;
        }
        this.f152150G = true;
        this.f152148E.cancel();
        this.f152157w.dispose();
        if (this.f152155L || getAndIncrement() != 0) {
            return;
        }
        this.f152149F.clear();
    }

    @Override // s73.InterfaceC32247e
    public final void clear() {
        this.f152149F.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m113373d() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f152157w.mo67907b(this);
    }

    @Override // s73.InterfaceC32247e
    public final boolean isEmpty() {
        return this.f152149F.isEmpty();
    }

    @Override // eg3.InterfaceC13182a
    public final void onComplete() {
        if (this.f152151H) {
            return;
        }
        this.f152151H = true;
        m113373d();
    }

    @Override // eg3.InterfaceC13182a
    public final void onError(Throwable th3) {
        if (this.f152151H) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        this.f152152I = th3;
        this.f152151H = true;
        m113373d();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [eg3.b, java.lang.Object] */
    @Override // eg3.InterfaceC13182a
    public final void onNext(Object obj) {
        if (this.f152151H) {
            return;
        }
        if (this.f152153J == 2) {
            m113373d();
            return;
        }
        if (!this.f152149F.offer(obj)) {
            this.f152148E.cancel();
            this.f152152I = new MissingBackpressureException("Queue is full?!");
            this.f152151H = true;
        }
        m113373d();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [eg3.b, java.lang.Object] */
    @Override // s73.InterfaceC32247e
    public final Object poll() {
        Object objPoll = this.f152149F.poll();
        if (objPoll != null && this.f152153J != 1) {
            long j7 = this.f152154K + 1;
            if (j7 == this.f152159y) {
                this.f152154K = 0L;
                this.f152148E.request(j7);
                return objPoll;
            }
            this.f152154K = j7;
        }
        return objPoll;
    }

    @Override // eg3.InterfaceC13183b
    public final void request(long j7) {
        if (EnumC0575c.m1490b(j7)) {
            AbstractC17269i.m48908p(this.f152160z, j7);
            m113373d();
        }
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [eg3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eg3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eg3.b, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f152155L) {
            int iAddAndGet = 1;
            while (!this.f152150G) {
                boolean z4 = this.f152151H;
                this.f152156M.onNext(null);
                if (z4) {
                    this.f152150G = true;
                    Throwable th3 = this.f152152I;
                    if (th3 != null) {
                        this.f152156M.onError(th3);
                    } else {
                        this.f152156M.onComplete();
                    }
                    this.f152157w.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            return;
        }
        if (this.f152153J == 1) {
            InterfaceC23411b interfaceC23411b = this.f152156M;
            InterfaceC32247e interfaceC32247e = this.f152149F;
            long j7 = this.f152154K;
            int iAddAndGet2 = 1;
            while (true) {
                long j13 = this.f152160z.get();
                while (j7 != j13) {
                    try {
                        Object objPoll = interfaceC32247e.poll();
                        if (this.f152150G) {
                            return;
                        }
                        if (objPoll == null) {
                            this.f152150G = true;
                            interfaceC23411b.onComplete();
                            this.f152157w.dispose();
                            return;
                        }
                        interfaceC23411b.onNext(objPoll);
                        j7++;
                    } catch (Throwable th4) {
                        AbstractC3269g.m9495a0(th4);
                        this.f152150G = true;
                        this.f152148E.cancel();
                        interfaceC23411b.onError(th4);
                        this.f152157w.dispose();
                        return;
                    }
                }
                if (this.f152150G) {
                    return;
                }
                if (interfaceC32247e.isEmpty()) {
                    this.f152150G = true;
                    interfaceC23411b.onComplete();
                    this.f152157w.dispose();
                    return;
                } else {
                    int i13 = get();
                    if (iAddAndGet2 == i13) {
                        this.f152154K = j7;
                        iAddAndGet2 = addAndGet(-iAddAndGet2);
                        if (iAddAndGet2 == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet2 = i13;
                    }
                }
            }
        } else {
            InterfaceC23411b interfaceC23411b2 = this.f152156M;
            InterfaceC32247e interfaceC32247e2 = this.f152149F;
            long j14 = this.f152154K;
            int iAddAndGet3 = 1;
            while (true) {
                long jAddAndGet = this.f152160z.get();
                while (j14 != jAddAndGet) {
                    boolean z13 = this.f152151H;
                    try {
                        Object objPoll2 = interfaceC32247e2.poll();
                        boolean z14 = objPoll2 == null;
                        if (m113372c(z13, z14, interfaceC23411b2)) {
                            return;
                        }
                        if (z14) {
                            break;
                        }
                        interfaceC23411b2.onNext(objPoll2);
                        j14++;
                        if (j14 == this.f152159y) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f152160z.addAndGet(-j14);
                            }
                            this.f152148E.request(j14);
                            j14 = 0;
                        }
                    } catch (Throwable th5) {
                        AbstractC3269g.m9495a0(th5);
                        this.f152150G = true;
                        this.f152148E.cancel();
                        interfaceC32247e2.clear();
                        interfaceC23411b2.onError(th5);
                        this.f152157w.dispose();
                        return;
                    }
                }
                if (j14 == jAddAndGet && m113372c(this.f152151H, interfaceC32247e2.isEmpty(), interfaceC23411b2)) {
                    return;
                }
                int i14 = get();
                if (iAddAndGet3 == i14) {
                    this.f152154K = j14;
                    iAddAndGet3 = addAndGet(-iAddAndGet3);
                    if (iAddAndGet3 == 0) {
                        return;
                    }
                } else {
                    iAddAndGet3 = i14;
                }
            }
        }
    }
}
