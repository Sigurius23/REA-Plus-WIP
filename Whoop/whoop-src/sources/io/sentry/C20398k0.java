package io.sentry;

import io.sentry.util.C20579a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20398k0 {

    /* JADX INFO: renamed from: i */
    public static volatile C20398k0 f76458i;

    /* JADX INFO: renamed from: a */
    public final long f76460a;

    /* JADX INFO: renamed from: b */
    public volatile String f76461b;

    /* JADX INFO: renamed from: c */
    public volatile long f76462c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f76463d;

    /* JADX INFO: renamed from: e */
    public final CallableC20346h0 f76464e;

    /* JADX INFO: renamed from: f */
    public final ExecutorService f76465f;

    /* JADX INFO: renamed from: g */
    public static final long f76456g = TimeUnit.HOURS.toMillis(5);

    /* JADX INFO: renamed from: h */
    public static final long f76457h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: j */
    public static final C20579a f76459j = new C20579a();

    public C20398k0() {
        CallableC20346h0 callableC20346h0 = new CallableC20346h0(0);
        this.f76463d = new AtomicBoolean(false);
        this.f76465f = Executors.newSingleThreadExecutor(new ThreadFactoryC20389j0(0));
        this.f76460a = f76456g;
        this.f76464e = callableC20346h0;
        m56613d();
    }

    /* JADX INFO: renamed from: c */
    public static C20398k0 m56610c() {
        if (f76458i == null) {
            C20535s c20535sM56711a = f76459j.m56711a();
            try {
                if (f76458i == null) {
                    f76458i = new C20398k0();
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
        return f76458i;
    }

    /* JADX INFO: renamed from: a */
    public final void m56611a() {
        this.f76465f.shutdown();
    }

    /* JADX INFO: renamed from: b */
    public final String m56612b() {
        if (this.f76462c < System.currentTimeMillis() && this.f76463d.compareAndSet(false, true)) {
            m56613d();
        }
        return this.f76461b;
    }

    /* JADX INFO: renamed from: d */
    public final void m56613d() {
        try {
            this.f76465f.submit(new CallableC20367i0(this, 0)).get(f76457h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f76462c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            this.f76462c = TimeUnit.SECONDS.toMillis(1L) + System.currentTimeMillis();
        }
    }
}
