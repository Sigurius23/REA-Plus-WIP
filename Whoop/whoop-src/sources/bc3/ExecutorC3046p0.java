package bc3;

import hc3.AbstractC17167b;
import java.util.concurrent.Executor;
import kotlinx.coroutines.DispatchException;
import q83.C30064k;

/* JADX INFO: renamed from: bc3.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC3046p0 implements Executor {

    /* JADX INFO: renamed from: w */
    public final AbstractC3076z f12069w;

    public ExecutorC3046p0(AbstractC3076z abstractC3076z) {
        this.f12069w = abstractC3076z;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws DispatchException {
        AbstractC3076z abstractC3076z = this.f12069w;
        C30064k c30064k = C30064k.f122676w;
        if (AbstractC17167b.m48483i(abstractC3076z, c30064k)) {
            AbstractC17167b.m48482h(abstractC3076z, c30064k, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f12069w.toString();
    }
}
