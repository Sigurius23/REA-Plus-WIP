package bc3;

import ge3.AbstractC15751g;
import hc3.AbstractC17167b;
import hc3.C17188u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: renamed from: bc3.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3038n0 extends C17188u {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12059E = AtomicIntegerFieldUpdater.newUpdater(C3038n0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // hc3.C17188u, bc3.C3060t1
    /* JADX INFO: renamed from: j */
    public final void mo8694j(Object obj) throws DispatchException {
        mo8791l(obj);
    }

    @Override // hc3.C17188u, bc3.C3060t1
    /* JADX INFO: renamed from: l */
    public final void mo8791l(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f12059E;
            int i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC17167b.m48481g(AbstractC3006f0.m8697C(obj), AbstractC15751g.m44424D(this.f66005z));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
