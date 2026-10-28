package hc3;

import bc3.AbstractC3069w1;
import bc3.AbstractC3076z;
import bc3.C3033m;
import bc3.InterfaceC3026k0;
import bc3.InterfaceC3056s0;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: hc3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C17183p extends AbstractC3069w1 implements InterfaceC3026k0 {
    /* JADX INFO: renamed from: T */
    public final void m48536T() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        m48536T();
        throw null;
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: i */
    public final InterfaceC3056s0 mo8690i(long j7, Runnable runnable, InterfaceC30063j interfaceC30063j) {
        m48536T();
        throw null;
    }

    @Override // bc3.AbstractC3076z
    public final boolean isDispatchNeeded(InterfaceC30063j interfaceC30063j) {
        m48536T();
        throw null;
    }

    @Override // bc3.AbstractC3069w1, bc3.AbstractC3076z
    public final AbstractC3076z limitedParallelism(int i13, String str) {
        m48536T();
        throw null;
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: m */
    public final void mo8691m(long j7, C3033m c3033m) {
        m48536T();
        throw null;
    }

    @Override // bc3.AbstractC3069w1
    /* JADX INFO: renamed from: s */
    public final AbstractC3069w1 mo8825s() {
        return this;
    }

    @Override // bc3.AbstractC3069w1, bc3.AbstractC3076z
    public final String toString() {
        return AbstractC31061c.m95633i(']', "Dispatchers.Main[missing", "");
    }
}
