package cl;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: cl.b */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorServiceC4794b implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: x */
    public static final long f19717x = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: y */
    public static volatile int f19718y;

    /* JADX INFO: renamed from: w */
    public final ThreadPoolExecutor f19719w;

    public ExecutorServiceC4794b(ThreadPoolExecutor threadPoolExecutor) {
        this.f19719w = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f19719w.awaitTermination(j7, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ThreadPoolExecutor threadPoolExecutor;
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = (threadPoolExecutor = this.f19719w).isTerminated())) {
            return;
        }
        shutdown();
        boolean z4 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = threadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z4) {
                    shutdownNow();
                    z4 = true;
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f19719w.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f19719w.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f19719w.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f19719w.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f19719w.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f19719w.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f19719w.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f19719w.submit(runnable);
    }

    public final String toString() {
        return this.f19719w.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f19719w.invokeAll(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f19719w.invokeAny(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f19719w.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f19719w.submit(callable);
    }
}
