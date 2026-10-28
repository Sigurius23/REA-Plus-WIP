package ch3;

import bh3.InterfaceC3261h;
import bh3.InterfaceC3262i;
import hh3.C17300d;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p088dc.AbstractC11895b;
import ro.C31624i;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: ch3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C4681f extends AtomicInteger implements InterfaceC38282i, InterfaceC38293t {

    /* JADX INFO: renamed from: M */
    public static final Object f19150M = new Object();

    /* JADX INFO: renamed from: E */
    public final Object[] f19151E;

    /* JADX INFO: renamed from: F */
    public final C17300d f19152F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f19153G;

    /* JADX INFO: renamed from: H */
    public volatile boolean f19154H;

    /* JADX INFO: renamed from: I */
    public final AtomicLong f19155I;

    /* JADX INFO: renamed from: J */
    public final AtomicReference f19156J;

    /* JADX INFO: renamed from: K */
    public int f19157K;

    /* JADX INFO: renamed from: L */
    public int f19158L;

    /* JADX INFO: renamed from: w */
    public final AbstractC38292s f19159w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC3262i f19160x;

    /* JADX INFO: renamed from: y */
    public final C4679e[] f19161y;

    /* JADX INFO: renamed from: z */
    public final int f19162z;

    public C4681f(AbstractC38292s abstractC38292s, InterfaceC3262i interfaceC3262i, int i13, int i14) {
        this.f19159w = abstractC38292s;
        this.f19160x = interfaceC3262i;
        this.f19162z = i14;
        Object[] objArr = new Object[i13];
        this.f19151E = objArr;
        Arrays.fill(objArr, f19150M);
        this.f19161y = new C4679e[i13];
        this.f19152F = new C17300d(i14);
        this.f19155I = new AtomicLong();
        this.f19156J = new AtomicReference();
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f19153G;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        if (this.f19153G) {
            return;
        }
        this.f19153G = true;
        if (getAndIncrement() == 0) {
            m14751c(this.f19152F);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14751c(Queue queue) {
        queue.clear();
        for (C4679e c4679e : this.f19161y) {
            c4679e.mo14750b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14752d(boolean z4, boolean z13, AbstractC38292s abstractC38292s, Queue queue) {
        if (this.f19153G) {
            m14751c(queue);
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th3 = (Throwable) this.f19156J.get();
        if (th3 != null) {
            m14751c(queue);
            abstractC38292s.onError(th3);
            return true;
        }
        if (!z13) {
            return false;
        }
        abstractC38292s.onCompleted();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m14753e(int i13, Object obj) {
        boolean z4;
        C4679e c4679e = this.f19161y[i13];
        synchronized (this) {
            try {
                Object[] objArr = this.f19151E;
                int length = objArr.length;
                Object obj2 = objArr[i13];
                int i14 = this.f19157K;
                Object obj3 = f19150M;
                if (obj2 == obj3) {
                    i14++;
                    this.f19157K = i14;
                }
                int i15 = this.f19158L;
                if (obj == null) {
                    i15++;
                    this.f19158L = i15;
                } else {
                    objArr[i13] = AbstractC4677d.m14746c(obj);
                }
                z4 = i14 == length;
                if (i15 == length || (obj == null && obj2 == obj3)) {
                    this.f19154H = true;
                } else if (obj != null && z4) {
                    this.f19152F.m48987a(c4679e, this.f19151E.clone());
                } else if (obj == null && this.f19156J.get() != null) {
                    this.f19154H = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z4 || obj == null) {
            m14754f();
        } else {
            c4679e.m122689e(1L);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14754f() {
        if (getAndIncrement() != 0) {
            return;
        }
        C17300d c17300d = this.f19152F;
        AbstractC38292s abstractC38292s = this.f19159w;
        AtomicLong atomicLong = this.f19155I;
        int iAddAndGet = 1;
        while (!m14752d(this.f19154H, c17300d.isEmpty(), abstractC38292s, c17300d)) {
            long j7 = atomicLong.get();
            long j13 = 0;
            while (j13 != j7) {
                boolean z4 = this.f19154H;
                C4679e c4679e = (C4679e) c17300d.peek();
                boolean z13 = c4679e == null;
                if (m14752d(z4, z13, abstractC38292s, c17300d)) {
                    return;
                }
                if (z13) {
                    break;
                }
                c17300d.poll();
                Object[] objArr = (Object[]) c17300d.poll();
                if (objArr == null) {
                    this.f19153G = true;
                    m14751c(c17300d);
                    abstractC38292s.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                    return;
                }
                try {
                    C31624i c31624i = (C31624i) this.f19160x;
                    c31624i.getClass();
                    if (objArr.length != 2) {
                        throw new IllegalArgumentException("Func2 expecting 2 arguments.");
                    }
                    abstractC38292s.onNext(((InterfaceC3261h) c31624i.f130665x).mo9474c(objArr[0], objArr[1]));
                    c4679e.m122689e(1L);
                    j13++;
                } catch (Throwable th3) {
                    this.f19153G = true;
                    m14751c(c17300d);
                    abstractC38292s.onError(th3);
                    return;
                }
            }
            if (j13 != 0 && j7 != Long.MAX_VALUE) {
                AbstractC4677d.m14747d(atomicLong, j13);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "n >= required but it was "));
        }
        if (j7 != 0) {
            AbstractC4677d.m14745b(this.f19155I, j7);
            m14754f();
        }
    }
}
