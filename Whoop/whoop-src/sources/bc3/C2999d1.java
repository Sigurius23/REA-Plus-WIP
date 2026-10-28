package bc3;

import hc3.AbstractC17165a;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p088dc.AbstractC11894a;
import p097ds.RunnableC12316s;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: bc3.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2999d1 extends AbstractC2995c1 implements InterfaceC3026k0 {

    /* JADX INFO: renamed from: w */
    public final Executor f12008w;

    public C2999d1(Executor executor) {
        Method method;
        this.f12008w = executor;
        Method method2 = AbstractC17165a.f65954a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = AbstractC17165a.f65954a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f12008w;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        try {
            this.f12008w.execute(runnable);
        } catch (RejectedExecutionException e5) {
            AbstractC3006f0.m8715i(interfaceC30063j, AbstractC11894a.m31955d("The task was rejected", e5));
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d.f87316w.dispatch(interfaceC30063j, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2999d1) && ((C2999d1) obj).f12008w == this.f12008w;
    }

    @Override // bc3.AbstractC2995c1
    public final Executor getExecutor() {
        return this.f12008w;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f12008w);
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: i */
    public final InterfaceC3056s0 mo8690i(long j7, Runnable runnable, InterfaceC30063j interfaceC30063j) {
        Executor executor = this.f12008w;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j7, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e5) {
                AbstractC3006f0.m8715i(interfaceC30063j, AbstractC11894a.m31955d("The task was rejected", e5));
            }
        }
        return scheduledFutureSchedule != null ? new C3053r0(scheduledFutureSchedule) : RunnableC3010g0.f12027H.mo8690i(j7, runnable, interfaceC30063j);
    }

    @Override // bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: m */
    public final void mo8691m(long j7, C3033m c3033m) {
        Executor executor = this.f12008w;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            RunnableC12316s runnableC12316s = new RunnableC12316s(2, this, c3033m);
            InterfaceC30063j interfaceC30063j = c3033m.f12054E;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC12316s, j7, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e5) {
                AbstractC3006f0.m8715i(interfaceC30063j, AbstractC11894a.m31955d("The task was rejected", e5));
            }
        }
        if (scheduledFutureSchedule != null) {
            c3033m.m8777v(new C3013h(scheduledFutureSchedule));
        } else {
            RunnableC3010g0.f12027H.mo8691m(j7, c3033m);
        }
    }

    @Override // bc3.AbstractC3076z
    public final String toString() {
        return this.f12008w.toString();
    }
}
