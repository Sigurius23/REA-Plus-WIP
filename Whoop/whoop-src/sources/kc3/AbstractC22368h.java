package kc3;

import bc3.AbstractC2995c1;
import java.util.concurrent.Executor;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: kc3.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22368h extends AbstractC2995c1 {

    /* JADX INFO: renamed from: w */
    public ExecutorC22363c f87320w;

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        ExecutorC22363c.m64285i(this.f87320w, runnable, 6);
    }

    @Override // bc3.AbstractC3076z
    public final void dispatchYield(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        ExecutorC22363c.m64285i(this.f87320w, runnable, 2);
    }

    @Override // bc3.AbstractC2995c1
    public final Executor getExecutor() {
        return this.f87320w;
    }
}
