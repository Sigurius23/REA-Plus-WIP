package io.sentry.transport;

import io.sentry.AbstractC20576u4;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.InterfaceC20606v4;
import io.sentry.ThreadFactoryC20342g5;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p014aj.C0928c;

/* JADX INFO: renamed from: io.sentry.transport.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C20564n extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: E */
    public final C0928c f77036E;

    /* JADX INFO: renamed from: w */
    public final int f77037w;

    /* JADX INFO: renamed from: x */
    public AbstractC20576u4 f77038x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC20602v0 f77039y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC20606v4 f77040z;

    public C20564n(int i13, ThreadFactoryC20342g5 threadFactoryC20342g5, RejectedExecutionHandlerC20551a rejectedExecutionHandlerC20551a, InterfaceC20602v0 interfaceC20602v0, InterfaceC20606v4 interfaceC20606v4) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactoryC20342g5, rejectedExecutionHandlerC20551a);
        this.f77038x = null;
        this.f77036E = new C0928c(17, (byte) 0);
        this.f77037w = i13;
        this.f77039y = interfaceC20602v0;
        this.f77040z = interfaceC20606v4;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th3) {
        C0928c c0928c = this.f77036E;
        try {
            super.afterExecute(runnable, th3);
        } finally {
            C20568r c20568r = (C20568r) c0928c.f3421x;
            int i13 = C20568r.f77048w;
            c20568r.releaseShared(1);
        }
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

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        C0928c c0928c = this.f77036E;
        C20568r c20568r = (C20568r) c0928c.f3421x;
        C20568r c20568r2 = (C20568r) c0928c.f3421x;
        int iM56689a = C20568r.m56689a(c20568r);
        int i13 = this.f77037w;
        InterfaceC20602v0 interfaceC20602v0 = this.f77039y;
        InterfaceC20606v4 interfaceC20606v4 = this.f77040z;
        if (iM56689a >= i13) {
            this.f77038x = interfaceC20606v4.now();
            interfaceC20602v0.mo16066m(EnumC20436n5.WARNING, "Submit cancelled", new Object[0]);
            return new FutureC20563m();
        }
        C20568r.m56690b(c20568r2);
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e5) {
            c20568r2.releaseShared(1);
            this.f77038x = interfaceC20606v4.now();
            interfaceC20602v0.mo16060j(EnumC20436n5.WARNING, "Submit rejected by thread pool executor", e5);
            return new FutureC20563m();
        }
    }
}
