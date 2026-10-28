package bc3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bc3.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3019i1 extends AbstractC3035m1 {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12038F = AtomicIntegerFieldUpdater.newUpdater(C3019i1.class, "_invoked$volatile");

    /* JADX INFO: renamed from: E */
    public final Function1 f12039E;
    private volatile /* synthetic */ int _invoked$volatile;

    public C3019i1(Function1 function1) {
        this.f12039E = function1;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: i */
    public final boolean mo8685i() {
        return true;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: j */
    public final void mo8686j(Throwable th3) {
        if (f12038F.compareAndSet(this, 0, 1)) {
            this.f12039E.invoke(th3);
        }
    }
}
