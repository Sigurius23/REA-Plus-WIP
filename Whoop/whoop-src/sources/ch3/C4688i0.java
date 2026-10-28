package ch3;

import bh3.InterfaceC3254a;
import gh3.C15862g;
import hh3.C17298b;
import java.util.AbstractQueue;
import java.util.concurrent.atomic.AtomicLong;
import jh3.AbstractC21700a;
import p471rx.exceptions.MissingBackpressureException;
import p471rx.internal.util.unsafe.AbstractC31895j;
import p471rx.internal.util.unsafe.C31889d;
import xg3.AbstractC38283j;
import xg3.AbstractC38284k;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ch3.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4688i0 extends AbstractC38292s implements InterfaceC3254a {

    /* JADX INFO: renamed from: E */
    public final AbstractC38292s f19192E;

    /* JADX INFO: renamed from: F */
    public final AbstractC38283j f19193F;

    /* JADX INFO: renamed from: G */
    public final boolean f19194G;

    /* JADX INFO: renamed from: H */
    public final AbstractQueue f19195H;

    /* JADX INFO: renamed from: I */
    public final int f19196I;

    /* JADX INFO: renamed from: J */
    public volatile boolean f19197J;

    /* JADX INFO: renamed from: K */
    public final AtomicLong f19198K = new AtomicLong();

    /* JADX INFO: renamed from: L */
    public final AtomicLong f19199L = new AtomicLong();

    /* JADX INFO: renamed from: M */
    public Throwable f19200M;

    /* JADX INFO: renamed from: N */
    public long f19201N;

    public C4688i0(AbstractC38284k abstractC38284k, AbstractC38292s abstractC38292s, boolean z4, int i13) {
        this.f19192E = abstractC38292s;
        this.f19193F = abstractC38284k.mo37108a();
        this.f19194G = z4;
        i13 = i13 <= 0 ? C15862g.f59961x : i13;
        this.f19196I = i13 - (i13 >> 2);
        if (AbstractC31895j.f132402a == null || AbstractC31895j.f132403b) {
            this.f19195H = new C17298b(i13);
        } else {
            this.f19195H = new C31889d(i13);
        }
        m122689e(i13);
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        long j7 = this.f19201N;
        AbstractQueue abstractQueue = this.f19195H;
        AbstractC38292s abstractC38292s = this.f19192E;
        long jAddAndGet = 1;
        do {
            long j13 = this.f19198K.get();
            while (j13 != j7) {
                boolean z4 = this.f19197J;
                Object objPoll = abstractQueue.poll();
                boolean z13 = objPoll == null;
                if (m14766g(z4, z13, abstractC38292s, abstractQueue)) {
                    return;
                }
                if (z13) {
                    break;
                }
                abstractC38292s.onNext(AbstractC4677d.m14746c(objPoll));
                j7++;
                if (j7 == this.f19196I) {
                    long jM14747d = AbstractC4677d.m14747d(this.f19198K, j7);
                    m122689e(j7);
                    j13 = jM14747d;
                    j7 = 0;
                }
            }
            if (j13 == j7 && m14766g(this.f19197J, abstractQueue.isEmpty(), abstractC38292s, abstractQueue)) {
                return;
            }
            this.f19201N = j7;
            jAddAndGet = this.f19199L.addAndGet(-jAddAndGet);
        } while (jAddAndGet != 0);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14766g(boolean z4, boolean z13, AbstractC38292s abstractC38292s, AbstractQueue abstractQueue) {
        if (abstractC38292s.mo14749a()) {
            abstractQueue.clear();
            return true;
        }
        if (!z4) {
            return false;
        }
        boolean z14 = this.f19194G;
        AbstractC38283j abstractC38283j = this.f19193F;
        if (z14) {
            if (!z13) {
                return false;
            }
            Throwable th3 = this.f19200M;
            try {
                if (th3 != null) {
                    abstractC38292s.onError(th3);
                } else {
                    abstractC38292s.onCompleted();
                }
                abstractC38283j.mo14750b();
                return false;
            } catch (Throwable th4) {
                abstractC38283j.mo14750b();
                throw th4;
            }
        }
        Throwable th5 = this.f19200M;
        if (th5 != null) {
            abstractQueue.clear();
            try {
                abstractC38292s.onError(th5);
                return true;
            } finally {
                abstractC38283j.mo14750b();
            }
        }
        if (!z13) {
            return false;
        }
        try {
            abstractC38292s.onCompleted();
            return true;
        } finally {
            abstractC38283j.mo14750b();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14767h() {
        if (this.f19199L.getAndIncrement() == 0) {
            this.f19193F.mo37106c(this);
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (mo14749a() || this.f19197J) {
            return;
        }
        this.f19197J = true;
        m14767h();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        if (mo14749a() || this.f19197J) {
            AbstractC21700a.m61126a(th3);
            return;
        }
        this.f19200M = th3;
        this.f19197J = true;
        m14767h();
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        if (mo14749a() || this.f19197J) {
            return;
        }
        AbstractQueue abstractQueue = this.f19195H;
        if (obj == null) {
            obj = AbstractC4677d.f19136b;
        }
        if (abstractQueue.offer(obj)) {
            m14767h();
        } else {
            onError(new MissingBackpressureException());
        }
    }
}
