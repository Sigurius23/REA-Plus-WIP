package hc3;

import bc3.AbstractC3014h0;
import bc3.AbstractC3076z;
import bc3.C3033m;
import bc3.InterfaceC3026k0;
import bc3.InterfaceC3056s0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p073cq.RunnableC11044m;
import p088dc.AbstractC11895b;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: hc3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C17174g extends AbstractC3076z implements InterfaceC3026k0 {

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f65978G = AtomicIntegerFieldUpdater.newUpdater(C17174g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: E */
    public final C17179l f65979E;

    /* JADX INFO: renamed from: F */
    public final Object f65980F;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC3026k0 f65981w;

    /* JADX INFO: renamed from: x */
    public final AbstractC3076z f65982x;

    /* JADX INFO: renamed from: y */
    public final int f65983y;

    /* JADX INFO: renamed from: z */
    public final String f65984z;

    /* JADX WARN: Multi-variable type inference failed */
    public C17174g(AbstractC3076z abstractC3076z, int i13, String str) {
        InterfaceC3026k0 interfaceC3026k0 = abstractC3076z instanceof InterfaceC3026k0 ? (InterfaceC3026k0) abstractC3076z : null;
        this.f65981w = interfaceC3026k0 == null ? AbstractC3014h0.f12031a : interfaceC3026k0;
        this.f65982x = abstractC3076z;
        this.f65983y = i13;
        this.f65984z = str;
        this.f65979E = new C17179l();
        this.f65980F = new Object();
    }

    /* JADX INFO: renamed from: T */
    public final boolean m48496T() {
        synchronized (this.f65980F) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f65978G;
            if (atomicIntegerFieldUpdater.get(this) >= this.f65983y) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        Runnable runnableM48497s;
        this.f65979E.m48529a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f65978G;
        if (atomicIntegerFieldUpdater.get(this) >= this.f65983y || !m48496T() || (runnableM48497s = m48497s()) == null) {
            return;
        }
        try {
            AbstractC17167b.m48482h(this.f65982x, this, new RunnableC11044m(6, this, runnableM48497s));
        } catch (Throwable th3) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th3;
        }
    }

    @Override // bc3.AbstractC3076z
    public final void dispatchYield(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        Runnable runnableM48497s;
        this.f65979E.m48529a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f65978G;
        if (atomicIntegerFieldUpdater.get(this) >= this.f65983y || !m48496T() || (runnableM48497s = m48497s()) == null) {
            return;
        }
        try {
            this.f65982x.dispatchYield(this, new RunnableC11044m(6, this, runnableM48497s));
        } catch (Throwable th3) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th3;
        }
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: i */
    public final InterfaceC3056s0 mo8690i(long j7, Runnable runnable, InterfaceC30063j interfaceC30063j) {
        return this.f65981w.mo8690i(j7, runnable, interfaceC30063j);
    }

    @Override // bc3.AbstractC3076z
    public final AbstractC3076z limitedParallelism(int i13, String str) {
        AbstractC17167b.m48475a(i13);
        if (i13 >= this.f65983y) {
            return str != null ? new C17185r(this, str) : this;
        }
        return super.limitedParallelism(i13, str);
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: m */
    public final void mo8691m(long j7, C3033m c3033m) {
        this.f65981w.mo8691m(j7, c3033m);
    }

    /* JADX INFO: renamed from: s */
    public final Runnable m48497s() {
        while (true) {
            Runnable runnable = (Runnable) this.f65979E.m48531c();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f65980F) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f65978G;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f65979E.m48530b() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // bc3.AbstractC3076z
    public final String toString() {
        String str = this.f65984z;
        if (str != null) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f65982x);
        sb4.append(".limitedParallelism(");
        return AbstractC11895b.m31999r(sb4, this.f65983y, ')');
    }
}
