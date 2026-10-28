package ch3;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xg3.AbstractC38292s;
import xg3.InterfaceC38281h;
import xg3.InterfaceC38282i;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: ch3.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4698n0 extends AtomicLong implements InterfaceC38282i, InterfaceC38293t, InterfaceC38281h {

    /* JADX INFO: renamed from: H */
    public static final Object f19237H = new Object();

    /* JADX INFO: renamed from: E */
    public volatile boolean f19238E;

    /* JADX INFO: renamed from: F */
    public boolean f19239F;

    /* JADX INFO: renamed from: G */
    public boolean f19240G;

    /* JADX INFO: renamed from: w */
    public final AbstractC38292s f19241w;

    /* JADX INFO: renamed from: x */
    public C4700o0 f19242x;

    /* JADX INFO: renamed from: y */
    public final AtomicReference f19243y = new AtomicReference(f19237H);

    /* JADX INFO: renamed from: z */
    public Throwable f19244z;

    public C4698n0(AbstractC38292s abstractC38292s) {
        this.f19241w = abstractC38292s;
        lazySet(-4611686018427387904L);
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return get() == Long.MIN_VALUE;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        if (get() >= 0) {
            getAndSet(Long.MIN_VALUE);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14772c() throws Throwable {
        boolean z4;
        Object obj;
        long j7;
        synchronized (this) {
            try {
                boolean z13 = true;
                if (this.f19239F) {
                    this.f19240G = true;
                    return;
                }
                this.f19239F = true;
                this.f19240G = false;
                while (true) {
                    try {
                        long j13 = get();
                        if (j13 == Long.MIN_VALUE) {
                            return;
                        }
                        Object obj2 = this.f19243y.get();
                        if (j13 > 0 && obj2 != (obj = f19237H)) {
                            this.f19241w.onNext(obj2);
                            AtomicReference atomicReference = this.f19243y;
                            while (!atomicReference.compareAndSet(obj2, obj) && atomicReference.get() == obj2) {
                            }
                            do {
                                j7 = get();
                                if (j7 < 0) {
                                    break;
                                }
                            } while (!compareAndSet(j7, j7 - 1));
                            obj2 = f19237H;
                        }
                        if (obj2 == f19237H && this.f19238E) {
                            Throwable th3 = this.f19244z;
                            if (th3 != null) {
                                this.f19241w.onError(th3);
                            } else {
                                this.f19241w.onCompleted();
                            }
                        }
                        try {
                            synchronized (this) {
                                try {
                                    if (!this.f19240G) {
                                        this.f19239F = false;
                                        return;
                                    }
                                    this.f19240G = false;
                                } catch (Throwable th4) {
                                    th = th4;
                                    z13 = false;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        try {
                            throw th;
                        } catch (Throwable th6) {
                            z4 = z13;
                            th = th6;
                            if (z4) {
                                throw th;
                            }
                            synchronized (this) {
                                this.f19239F = false;
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        z4 = false;
                    }
                }
            } catch (Throwable th8) {
                throw th8;
            }
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() throws Throwable {
        this.f19238E = true;
        m14772c();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) throws Throwable {
        this.f19244z = th3;
        this.f19238E = true;
        m14772c();
    }

    @Override // xg3.InterfaceC38281h
    public final void onNext(Object obj) throws Throwable {
        this.f19243y.lazySet(obj);
        m14772c();
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) throws Throwable {
        long j13;
        long j14;
        if (j7 >= 0) {
            do {
                j13 = get();
                if (j13 == Long.MIN_VALUE) {
                    return;
                }
                if (j13 == -4611686018427387904L) {
                    j14 = j7;
                } else {
                    j14 = j13 + j7;
                    if (j14 < 0) {
                        j14 = Long.MAX_VALUE;
                    }
                }
            } while (!compareAndSet(j13, j14));
            if (j13 == -4611686018427387904L) {
                this.f19242x.m122689e(Long.MAX_VALUE);
            }
            m14772c();
        }
    }
}
