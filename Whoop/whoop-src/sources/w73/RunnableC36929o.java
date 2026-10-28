package w73;

import bi.AbstractC3269g;
import java.util.concurrent.atomic.AtomicInteger;
import l73.AbstractC23415f;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.EnumC30024c;
import s73.InterfaceC32243a;
import s73.InterfaceC32247e;
import x73.C38045b;

/* JADX INFO: renamed from: w73.o */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC36929o extends AtomicInteger implements InterfaceC23413d, Runnable, InterfaceC32243a {

    /* JADX INFO: renamed from: E */
    public InterfaceC26443b f157997E;

    /* JADX INFO: renamed from: F */
    public Throwable f157998F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f157999G;

    /* JADX INFO: renamed from: H */
    public volatile boolean f158000H;

    /* JADX INFO: renamed from: I */
    public int f158001I;

    /* JADX INFO: renamed from: J */
    public boolean f158002J;

    /* JADX INFO: renamed from: w */
    public final InterfaceC23413d f158003w;

    /* JADX INFO: renamed from: x */
    public final AbstractC23415f f158004x;

    /* JADX INFO: renamed from: y */
    public final int f158005y;

    /* JADX INFO: renamed from: z */
    public InterfaceC32247e f158006z;

    public RunnableC36929o(InterfaceC23413d interfaceC23413d, AbstractC23415f abstractC23415f, int i13) {
        this.f158003w = interfaceC23413d;
        this.f158004x = abstractC23415f;
        this.f158005y = i13;
    }

    @Override // s73.InterfaceC32244b
    /* JADX INFO: renamed from: a */
    public final int mo1488a() {
        this.f158002J = true;
        return 2;
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        if (EnumC30024c.m91917c(this.f157997E, interfaceC26443b)) {
            this.f157997E = interfaceC26443b;
            if (interfaceC26443b instanceof InterfaceC32243a) {
                InterfaceC32243a interfaceC32243a = (InterfaceC32243a) interfaceC26443b;
                int iMo1488a = interfaceC32243a.mo1488a();
                if (iMo1488a == 1) {
                    this.f158001I = iMo1488a;
                    this.f158006z = interfaceC32243a;
                    this.f157999G = true;
                    this.f158003w.mo13591b(this);
                    if (getAndIncrement() == 0) {
                        this.f158004x.mo67907b(this);
                        return;
                    }
                    return;
                }
                if (iMo1488a == 2) {
                    this.f158001I = iMo1488a;
                    this.f158006z = interfaceC32243a;
                    this.f158003w.mo13591b(this);
                    return;
                }
            }
            this.f158006z = new C38045b(this.f158005y);
            this.f158003w.mo13591b(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m118549c(boolean z4, boolean z13, InterfaceC23413d interfaceC23413d) {
        if (this.f158000H) {
            this.f158006z.clear();
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th3 = this.f157998F;
        if (th3 != null) {
            this.f158000H = true;
            this.f158006z.clear();
            interfaceC23413d.onError(th3);
            this.f158004x.dispose();
            return true;
        }
        if (!z13) {
            return false;
        }
        this.f158000H = true;
        interfaceC23413d.onComplete();
        this.f158004x.dispose();
        return true;
    }

    @Override // s73.InterfaceC32247e
    public final void clear() {
        this.f158006z.clear();
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f158000H) {
            return;
        }
        this.f158000H = true;
        this.f157997E.dispose();
        this.f158004x.dispose();
        if (this.f158002J || getAndIncrement() != 0) {
            return;
        }
        this.f158006z.clear();
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f158000H;
    }

    @Override // s73.InterfaceC32247e
    public final boolean isEmpty() {
        return this.f158006z.isEmpty();
    }

    @Override // s73.InterfaceC32247e
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        if (this.f157999G) {
            return;
        }
        this.f157999G = true;
        if (getAndIncrement() == 0) {
            this.f158004x.mo67907b(this);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        if (this.f157999G) {
            AbstractC21598x.m60677d0(th3);
            return;
        }
        this.f157998F = th3;
        this.f157999G = true;
        if (getAndIncrement() == 0) {
            this.f158004x.mo67907b(this);
        }
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        if (this.f157999G) {
            return;
        }
        if (this.f158001I != 2) {
            this.f158006z.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.f158004x.mo67907b(this);
        }
    }

    @Override // s73.InterfaceC32247e
    public final Object poll() {
        return this.f158006z.poll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f158002J) {
            int iAddAndGet = 1;
            while (!this.f158000H) {
                boolean z4 = this.f157999G;
                Throwable th3 = this.f157998F;
                if (z4 && th3 != null) {
                    this.f158000H = true;
                    this.f158003w.onError(this.f157998F);
                    this.f158004x.dispose();
                    return;
                }
                this.f158003w.onNext(null);
                if (z4) {
                    this.f158000H = true;
                    Throwable th4 = this.f157998F;
                    if (th4 != null) {
                        this.f158003w.onError(th4);
                    } else {
                        this.f158003w.onComplete();
                    }
                    this.f158004x.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            return;
        }
        InterfaceC32247e interfaceC32247e = this.f158006z;
        InterfaceC23413d interfaceC23413d = this.f158003w;
        int iAddAndGet2 = 1;
        while (!m118549c(this.f157999G, interfaceC32247e.isEmpty(), interfaceC23413d)) {
            while (true) {
                boolean z13 = this.f157999G;
                try {
                    Object objPoll = interfaceC32247e.poll();
                    boolean z14 = objPoll == null;
                    if (m118549c(z13, z14, interfaceC23413d)) {
                        return;
                    }
                    if (z14) {
                        break;
                    } else {
                        interfaceC23413d.onNext(objPoll);
                    }
                } catch (Throwable th5) {
                    AbstractC3269g.m9495a0(th5);
                    this.f158000H = true;
                    this.f157997E.dispose();
                    interfaceC32247e.clear();
                    interfaceC23413d.onError(th5);
                    this.f158004x.dispose();
                    return;
                }
            }
            iAddAndGet2 = addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
        }
    }
}
