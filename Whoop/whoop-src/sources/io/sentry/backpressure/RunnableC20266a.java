package io.sentry.backpressure;

import io.sentry.C20371i4;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20347h1;
import io.sentry.util.C20579a;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import p497t7.InterfaceC33561b;

/* JADX INFO: renamed from: io.sentry.backpressure.a */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC20266a implements InterfaceC20267b, Runnable {

    /* JADX INFO: renamed from: E */
    public final C20579a f76106E;

    /* JADX INFO: renamed from: w */
    public final C20513q6 f76107w;

    /* JADX INFO: renamed from: x */
    public final C20371i4 f76108x;

    /* JADX INFO: renamed from: y */
    public int f76109y;

    /* JADX INFO: renamed from: z */
    public volatile Future f76110z;

    public RunnableC20266a(C20513q6 c20513q6) {
        C20371i4 c20371i4 = C20371i4.f76402a;
        this.f76109y = 0;
        this.f76110z = null;
        this.f76106E = new C20579a();
        this.f76107w = c20513q6;
        this.f76108x = c20371i4;
    }

    @Override // io.sentry.backpressure.InterfaceC20267b
    /* JADX INFO: renamed from: a */
    public final int mo56223a() {
        return this.f76109y;
    }

    /* JADX INFO: renamed from: b */
    public final void m56224b(int i13) {
        InterfaceC20347h1 executorService = this.f76107w.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        C20535s c20535sM56711a = this.f76106E.m56711a();
        try {
            try {
                this.f76110z = executorService.mo56218c(this, i13);
            } catch (RejectedExecutionException e5) {
                this.f76107w.getLogger().mo16060j(EnumC20436n5.WARNING, "Backpressure monitor reschedule task rejected", e5);
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

    @Override // io.sentry.backpressure.InterfaceC20267b
    public final void close() {
        Future future = this.f76110z;
        if (future != null) {
            C20535s c20535sM56711a = this.f76106E.m56711a();
            try {
                future.cancel(true);
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
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zMo56427g = this.f76108x.mo56427g();
        C20513q6 c20513q6 = this.f76107w;
        if (zMo56427g) {
            if (this.f76109y > 0) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f76109y = 0;
        } else {
            int i13 = this.f76109y;
            if (i13 < 10) {
                this.f76109y = i13 + 1;
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f76109y));
            }
        }
        m56224b(InterfaceC33561b.INVALID_OWNERSHIP);
    }

    @Override // io.sentry.backpressure.InterfaceC20267b
    public final void start() {
        m56224b(500);
    }
}
