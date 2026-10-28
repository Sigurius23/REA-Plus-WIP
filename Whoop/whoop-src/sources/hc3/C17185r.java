package hc3;

import bc3.AbstractC3014h0;
import bc3.AbstractC3076z;
import bc3.C3033m;
import bc3.InterfaceC3026k0;
import bc3.InterfaceC3056s0;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: hc3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C17185r extends AbstractC3076z implements InterfaceC3026k0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC3026k0 f66001w;

    /* JADX INFO: renamed from: x */
    public final AbstractC3076z f66002x;

    /* JADX INFO: renamed from: y */
    public final String f66003y;

    /* JADX WARN: Multi-variable type inference failed */
    public C17185r(AbstractC3076z abstractC3076z, String str) {
        InterfaceC3026k0 interfaceC3026k0 = abstractC3076z instanceof InterfaceC3026k0 ? (InterfaceC3026k0) abstractC3076z : null;
        this.f66001w = interfaceC3026k0 == null ? AbstractC3014h0.f12031a : interfaceC3026k0;
        this.f66002x = abstractC3076z;
        this.f66003y = str;
    }

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        this.f66002x.dispatch(interfaceC30063j, runnable);
    }

    @Override // bc3.AbstractC3076z
    public final void dispatchYield(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        this.f66002x.dispatchYield(interfaceC30063j, runnable);
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: i */
    public final InterfaceC3056s0 mo8690i(long j7, Runnable runnable, InterfaceC30063j interfaceC30063j) {
        return this.f66001w.mo8690i(j7, runnable, interfaceC30063j);
    }

    @Override // bc3.AbstractC3076z
    public final boolean isDispatchNeeded(InterfaceC30063j interfaceC30063j) {
        return this.f66002x.isDispatchNeeded(interfaceC30063j);
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: m */
    public final void mo8691m(long j7, C3033m c3033m) {
        this.f66001w.mo8691m(j7, c3033m);
    }

    @Override // bc3.AbstractC3076z
    public final String toString() {
        return this.f66003y;
    }
}
