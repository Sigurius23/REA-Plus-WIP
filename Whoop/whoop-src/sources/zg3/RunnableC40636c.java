package zg3;

import android.os.Handler;
import bh3.InterfaceC3254a;
import jh3.C21705f;
import p471rx.exceptions.OnErrorNotImplementedException;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: zg3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC40636c implements Runnable, InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    public final InterfaceC3254a f175388w;

    /* JADX INFO: renamed from: x */
    public final Handler f175389x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f175390y;

    public RunnableC40636c(InterfaceC3254a interfaceC3254a, Handler handler) {
        this.f175388w = interfaceC3254a;
        this.f175389x = handler;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f175390y;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        this.f175390y = true;
        this.f175389x.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f175388w.call();
        } catch (Throwable th3) {
            IllegalStateException illegalStateException = th3 instanceof OnErrorNotImplementedException ? new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th3) : new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th3);
            C21705f.f83334f.m61158b().getClass();
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
        }
    }
}
