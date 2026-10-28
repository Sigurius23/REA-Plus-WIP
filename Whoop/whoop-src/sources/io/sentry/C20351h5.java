package io.sentry;

import androidx.lifecycle.RunnableC1645z0;
import io.sentry.util.C20579a;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p027b3.RunnableC2411n;

/* JADX INFO: renamed from: io.sentry.h5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20351h5 implements InterfaceC20347h1 {

    /* JADX INFO: renamed from: a */
    public final ScheduledThreadPoolExecutor f76377a;

    /* JADX INFO: renamed from: b */
    public final C20579a f76378b;

    /* JADX INFO: renamed from: c */
    public final RunnableC2411n f76379c;

    /* JADX INFO: renamed from: d */
    public final C20513q6 f76380d;

    public C20351h5(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, C20513q6 c20513q6) {
        this.f76378b = new C20579a();
        this.f76379c = new RunnableC2411n(1);
        this.f76377a = scheduledThreadPoolExecutor;
        this.f76380d = c20513q6;
    }

    @Override // io.sentry.InterfaceC20347h1
    /* JADX INFO: renamed from: a */
    public final void mo56216a(long j7) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f76377a;
        C20535s c20535sM56711a = this.f76378b.m56711a();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j7, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20347h1
    /* JADX INFO: renamed from: b */
    public final void mo56217b() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f76377a;
        try {
            scheduledThreadPoolExecutor.submit(new RunnableC1645z0(this, 8));
        } catch (RejectedExecutionException e5) {
            C20513q6 c20513q6 = this.f76380d;
            if (c20513q6 != null) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Prewarm task rejected from " + scheduledThreadPoolExecutor, e5);
            }
        }
    }

    @Override // io.sentry.InterfaceC20347h1
    /* JADX INFO: renamed from: c */
    public final Future mo56218c(Runnable runnable, long j7) {
        return this.f76377a.schedule(runnable, j7, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.InterfaceC20347h1
    public final boolean isClosed() {
        C20535s c20535sM56711a = this.f76378b.m56711a();
        try {
            boolean zIsShutdown = this.f76377a.isShutdown();
            c20535sM56711a.close();
            return zIsShutdown;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20347h1
    public final Future submit(Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f76377a;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        C20513q6 c20513q6 = this.f76380d;
        if (c20513q6 != null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new FutureC20330f5();
    }

    public C20351h5(C20513q6 c20513q6) {
        this(new ScheduledThreadPoolExecutor(1, new ThreadFactoryC20342g5(0)), c20513q6);
    }

    public C20351h5() {
        this(new ScheduledThreadPoolExecutor(1, new ThreadFactoryC20342g5(0)), null);
    }
}
