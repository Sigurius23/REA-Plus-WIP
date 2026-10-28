package oc3;

import bc3.AbstractC3014h0;
import bc3.AbstractC3069w1;
import bc3.AbstractC3076z;
import bc3.C3033m;
import bc3.InterfaceC3026k0;
import bc3.InterfaceC3056s0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l83.C23470p;
import p714k80.C22275d;
import q83.AbstractC30060g;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: oc3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C27821d extends AbstractC3069w1 implements InterfaceC3026k0 {

    /* JADX INFO: renamed from: w */
    public final C23470p f112077w;

    /* JADX INFO: renamed from: x */
    public final C27820c f112078x = new C27820c();

    public C27821d(C22275d c22275d) {
        this.f112077w = AbstractC30060g.m92088H(c22275d);
    }

    /* JADX INFO: renamed from: T */
    public final AbstractC3076z m83900T() {
        C27820c c27820c = this.f112078x;
        c27820c.getClass();
        C27820c.f112072a.set(c27820c, new Throwable("reader location"));
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C27820c.f112073b;
        atomicIntegerFieldUpdater.incrementAndGet(c27820c);
        Throwable th3 = (Throwable) C27820c.f112074c.get(c27820c);
        if (th3 != null) {
            C27820c.f112075d.set(c27820c, new IllegalStateException("Dispatchers.Main is used concurrently with setting it", th3));
        }
        Object obj = C27820c.f112076e.get(c27820c);
        atomicIntegerFieldUpdater.decrementAndGet(c27820c);
        AbstractC3076z abstractC3076z = (AbstractC3076z) obj;
        return abstractC3076z == null ? (AbstractC3076z) this.f112077w.getValue() : abstractC3076z;
    }

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        m83900T().dispatch(interfaceC30063j, runnable);
    }

    @Override // bc3.AbstractC3076z
    public final void dispatchYield(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        m83900T().dispatchYield(interfaceC30063j, runnable);
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: i */
    public final InterfaceC3056s0 mo8690i(long j7, Runnable runnable, InterfaceC30063j interfaceC30063j) {
        InterfaceC30061h interfaceC30061hM83900T = m83900T();
        InterfaceC3026k0 interfaceC3026k0 = interfaceC30061hM83900T instanceof InterfaceC3026k0 ? (InterfaceC3026k0) interfaceC30061hM83900T : null;
        if (interfaceC3026k0 == null) {
            interfaceC3026k0 = AbstractC3014h0.f12031a;
        }
        return interfaceC3026k0.mo8690i(j7, runnable, interfaceC30063j);
    }

    @Override // bc3.AbstractC3076z
    public final boolean isDispatchNeeded(InterfaceC30063j interfaceC30063j) {
        return m83900T().isDispatchNeeded(interfaceC30063j);
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: m */
    public final void mo8691m(long j7, C3033m c3033m) {
        InterfaceC30061h interfaceC30061hM83900T = m83900T();
        InterfaceC3026k0 interfaceC3026k0 = interfaceC30061hM83900T instanceof InterfaceC3026k0 ? (InterfaceC3026k0) interfaceC30061hM83900T : null;
        if (interfaceC3026k0 == null) {
            interfaceC3026k0 = AbstractC3014h0.f12031a;
        }
        interfaceC3026k0.mo8691m(j7, c3033m);
    }

    @Override // bc3.AbstractC3069w1
    /* JADX INFO: renamed from: s */
    public final AbstractC3069w1 mo8825s() {
        AbstractC3069w1 abstractC3069w1Mo8825s;
        AbstractC3076z abstractC3076zM83900T = m83900T();
        AbstractC3069w1 abstractC3069w1 = abstractC3076zM83900T instanceof AbstractC3069w1 ? (AbstractC3069w1) abstractC3076zM83900T : null;
        return (abstractC3069w1 == null || (abstractC3069w1Mo8825s = abstractC3069w1.mo8825s()) == null) ? this : abstractC3069w1Mo8825s;
    }
}
