package eh3;

import bh3.InterfaceC3254a;
import gh3.C15868m;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import jh3.AbstractC21700a;
import mh3.C25566c;
import p471rx.exceptions.OnErrorNotImplementedException;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: eh3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC13212p extends AtomicReference implements Runnable, InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    public final C15868m f45792w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC3254a f45793x;

    public RunnableC13212p(InterfaceC3254a interfaceC3254a) {
        this.f45793x = interfaceC3254a;
        this.f45792w = new C15868m();
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f45792w.f59975x;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        if (this.f45792w.f59975x) {
            return;
        }
        this.f45792w.mo14750b();
    }

    /* JADX INFO: renamed from: c */
    public final void m37113c(Future future) {
        this.f45792w.m44779c(new C13210n(this, future));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.f45793x.call();
                mo14750b();
            } catch (Throwable th3) {
                mo14750b();
                throw th3;
            }
        } catch (OnErrorNotImplementedException e5) {
            IllegalStateException illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e5);
            AbstractC21700a.m61126a(illegalStateException);
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
            mo14750b();
        } catch (Throwable th4) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th4);
            AbstractC21700a.m61126a(illegalStateException2);
            Thread threadCurrentThread2 = Thread.currentThread();
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, illegalStateException2);
            mo14750b();
        }
    }

    public RunnableC13212p(InterfaceC3254a interfaceC3254a, C25566c c25566c) {
        this.f45793x = interfaceC3254a;
        this.f45792w = new C15868m(new C13211o(this, c25566c, 1));
    }

    public RunnableC13212p(InterfaceC3254a interfaceC3254a, C15868m c15868m) {
        this.f45793x = interfaceC3254a;
        this.f45792w = new C15868m(new C13211o(this, c15868m, 0));
    }
}
