package bc3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: bc3.h2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3016h2 extends AbstractC3035m1 {

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12033G = AtomicIntegerFieldUpdater.newUpdater(C3016h2.class, "_state$volatile");

    /* JADX INFO: renamed from: E */
    public final Thread f12034E = Thread.currentThread();

    /* JADX INFO: renamed from: F */
    public InterfaceC3056s0 f12035F;
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: l */
    public static void m8739l(int i13) {
        throw new IllegalStateException(("Illegal state " + i13).toString());
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: i */
    public final boolean mo8685i() {
        return true;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: j */
    public final void mo8686j(Throwable th3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i13;
        do {
            atomicIntegerFieldUpdater = f12033G;
            i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 != 0) {
                if (i13 == 1 || i13 == 2 || i13 == 3) {
                    return;
                }
                m8739l(i13);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, 2));
        this.f12034E.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* JADX INFO: renamed from: k */
    public final void m8740k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12033G;
            int i13 = atomicIntegerFieldUpdater.get(this);
            if (i13 != 0) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m8739l(i13);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i13, 1)) {
                InterfaceC3056s0 interfaceC3056s0 = this.f12035F;
                if (interfaceC3056s0 != null) {
                    interfaceC3056s0.dispose();
                    return;
                }
                return;
            }
        }
    }
}
