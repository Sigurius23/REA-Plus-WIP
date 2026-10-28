package y73;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import n73.InterfaceC26443b;
import p185h6.RunnableC16959n;
import r73.AbstractC31056a;
import u73.RunnableC34579a;

/* JADX INFO: renamed from: y73.l */
/* JADX INFO: loaded from: classes5.dex */
public final class CallableC39300l extends AtomicReference implements Callable, InterfaceC26443b {

    /* JADX INFO: renamed from: y */
    public static final FutureTask f169086y;

    /* JADX INFO: renamed from: z */
    public static final FutureTask f169087z;

    /* JADX INFO: renamed from: w */
    public final RunnableC34579a f169088w;

    /* JADX INFO: renamed from: x */
    public Thread f169089x;

    static {
        RunnableC16959n runnableC16959n = AbstractC31056a.f128062a;
        f169086y = new FutureTask(runnableC16959n, null);
        f169087z = new FutureTask(runnableC16959n, null);
    }

    public CallableC39300l(RunnableC34579a runnableC34579a) {
        this.f169088w = runnableC34579a;
    }

    /* JADX INFO: renamed from: a */
    public final void m125269a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f169086y) {
                return;
            }
            if (future2 == f169087z) {
                future.cancel(this.f169089x != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = f169086y;
        this.f169089x = Thread.currentThread();
        try {
            this.f169088w.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f169089x = null;
        }
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f169086y || future == (futureTask = f169087z) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f169089x != Thread.currentThread());
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f169086y || future == f169087z;
    }
}
