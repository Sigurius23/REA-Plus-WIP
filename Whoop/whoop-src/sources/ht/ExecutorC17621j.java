package ht;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p020ap.RunnableC1880c;
import p073cq.RunnableC11044m;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: ht.j */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC17621j implements Executor {

    /* JADX INFO: renamed from: F */
    public static final Logger f68338F = Logger.getLogger(ExecutorC17621j.class.getName());

    /* JADX INFO: renamed from: w */
    public final Executor f68340w;

    /* JADX INFO: renamed from: x */
    public final ArrayDeque f68341x = new ArrayDeque();

    /* JADX INFO: renamed from: y */
    public int f68342y = 1;

    /* JADX INFO: renamed from: z */
    public long f68343z = 0;

    /* JADX INFO: renamed from: E */
    public final RunnableC11044m f68339E = new RunnableC11044m(this);

    public ExecutorC17621j(Executor executor) {
        AbstractC35135w.m111094f(executor);
        this.f68340w = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC35135w.m111094f(runnable);
        synchronized (this.f68341x) {
            int i13 = this.f68342y;
            if (i13 != 4 && i13 != 3) {
                long j7 = this.f68343z;
                RunnableC1880c runnableC1880c = new RunnableC1880c(runnable, 1);
                this.f68341x.add(runnableC1880c);
                this.f68342y = 2;
                try {
                    this.f68340w.execute(this.f68339E);
                    if (this.f68342y != 2) {
                        return;
                    }
                    synchronized (this.f68341x) {
                        try {
                            if (this.f68343z == j7 && this.f68342y == 2) {
                                this.f68342y = 3;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e5) {
                    synchronized (this.f68341x) {
                        try {
                            int i14 = this.f68342y;
                            boolean z4 = true;
                            if ((i14 != 1 && i14 != 2) || !this.f68341x.removeLastOccurrence(runnableC1880c)) {
                                z4 = false;
                            }
                            if (!(e5 instanceof RejectedExecutionException) || z4) {
                                throw e5;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    return;
                }
            }
            this.f68341x.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f68340w + "}";
    }
}
