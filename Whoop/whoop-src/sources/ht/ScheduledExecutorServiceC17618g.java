package ht;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ht.g */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledExecutorServiceC17618g implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: w */
    public final ExecutorService f68335w;

    /* JADX INFO: renamed from: x */
    public final ScheduledExecutorService f68336x;

    public ScheduledExecutorServiceC17618g(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f68335w = executorService;
        this.f68336x = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f68335w.awaitTermination(j7, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f68335w.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f68335w.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f68335w.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f68335w.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f68335w.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        return new ScheduledFutureC17620i(new C17613b(this, runnable, j7, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j7, long j13, TimeUnit timeUnit) {
        return new ScheduledFutureC17620i(new C17615d(this, runnable, j7, j13, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j7, long j13, TimeUnit timeUnit) {
        return new ScheduledFutureC17620i(new C17615d(this, runnable, j7, j13, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f68335w.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f68335w.invokeAll(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f68335w.invokeAny(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j7, TimeUnit timeUnit) {
        return new ScheduledFutureC17620i(new C17613b(this, callable, j7, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f68335w.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f68335w.submit(runnable);
    }
}
