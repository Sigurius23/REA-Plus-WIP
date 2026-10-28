package eh3;

import java.util.concurrent.Future;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: eh3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C13210n implements InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    public final Future f45787w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ RunnableC13212p f45788x;

    public C13210n(RunnableC13212p runnableC13212p, Future future) {
        this.f45788x = runnableC13212p;
        this.f45787w = future;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f45787w.isCancelled();
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        Object obj = this.f45788x.get();
        Thread threadCurrentThread = Thread.currentThread();
        Future future = this.f45787w;
        if (obj != threadCurrentThread) {
            future.cancel(true);
        } else {
            future.cancel(false);
        }
    }
}
