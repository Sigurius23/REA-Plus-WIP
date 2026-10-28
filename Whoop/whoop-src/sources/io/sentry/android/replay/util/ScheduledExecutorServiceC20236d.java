package io.sentry.android.replay.util;

import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.RunnableC20151r0;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: io.sentry.android.replay.util.d */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledExecutorServiceC20236d implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: w */
    public final ScheduledExecutorService f76022w;

    /* JADX INFO: renamed from: x */
    public final C20513q6 f76023x;

    public ScheduledExecutorServiceC20236d(ScheduledExecutorService scheduledExecutorService, C20513q6 options) {
        AbstractC22676k.m65750j(options, "options");
        this.f76022w = scheduledExecutorService;
        this.f76023x = options;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j7, TimeUnit timeUnit) {
        return this.f76022w.awaitTermination(j7, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z4 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
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
        this.f76022w.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f76022w.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f76022w.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f76022w.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f76022w.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        return this.f76022w.schedule(runnable, j7, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j7, long j13, TimeUnit timeUnit) {
        return this.f76022w.scheduleAtFixedRate(runnable, j7, j13, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j7, long j13, TimeUnit timeUnit) {
        return this.f76022w.scheduleWithFixedDelay(runnable, j7, j13, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this) {
            if (!this.f76022w.isShutdown()) {
                this.f76022w.shutdown();
            }
            try {
                if (!this.f76022w.awaitTermination(this.f76023x.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    shutdownNow();
                }
            } catch (InterruptedException unused) {
                shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f76022w.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f76022w.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f76022w.invokeAll(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
        return this.f76022w.invokeAny(collection, j7, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j7, TimeUnit timeUnit) {
        return this.f76022w.schedule(callable, j7, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f76022w.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable task) {
        String str;
        AbstractC22676k.m65750j(task, "task");
        String name = Thread.currentThread().getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        if (AbstractC39421y.m125930O(name, "SentryReplayIntegration", false)) {
            task.run();
            return null;
        }
        try {
            return this.f76022w.submit(new RunnableC20151r0(task, this));
        } catch (Throwable th3) {
            InterfaceC20602v0 logger = this.f76023x.getLogger();
            EnumC20436n5 enumC20436n5 = EnumC20436n5.ERROR;
            StringBuilder sb4 = new StringBuilder("Failed to submit task ");
            if (task instanceof RunnableC20237e) {
                str = ((RunnableC20237e) task).f76024w;
            } else {
                str = "";
            }
            logger.mo16060j(enumC20436n5, AbstractC25012a.m73376i(str, " to executor", sb4), th3);
            return null;
        }
    }
}
