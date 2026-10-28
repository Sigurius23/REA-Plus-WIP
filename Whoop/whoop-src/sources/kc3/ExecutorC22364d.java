package kc3;

import bc3.AbstractC2995c1;
import bc3.AbstractC3076z;
import hc3.AbstractC17167b;
import hc3.AbstractC17192y;
import java.util.concurrent.Executor;
import q83.C30064k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: kc3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC22364d extends AbstractC2995c1 implements Executor {

    /* JADX INFO: renamed from: w */
    public static final ExecutorC22364d f87316w = new ExecutorC22364d();

    /* JADX INFO: renamed from: x */
    public static final AbstractC3076z f87317x;

    static {
        C22372l c22372l = C22372l.f87330w;
        int i13 = AbstractC17192y.f66011a;
        if (64 >= i13) {
            i13 = 64;
        }
        f87317x = AbstractC3076z.limitedParallelism$default(c22372l, AbstractC17167b.m48485k(i13, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        f87317x.dispatch(interfaceC30063j, runnable);
    }

    @Override // bc3.AbstractC3076z
    public final void dispatchYield(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        f87317x.dispatchYield(interfaceC30063j, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(C30064k.f122676w, runnable);
    }

    @Override // bc3.AbstractC2995c1
    public final Executor getExecutor() {
        return this;
    }

    @Override // bc3.AbstractC3076z
    public final AbstractC3076z limitedParallelism(int i13, String str) {
        return C22372l.f87330w.limitedParallelism(i13, str);
    }

    @Override // bc3.AbstractC3076z
    public final String toString() {
        return "Dispatchers.IO";
    }
}
