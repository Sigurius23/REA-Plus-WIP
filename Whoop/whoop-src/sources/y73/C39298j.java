package y73;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import l73.AbstractC23415f;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.EnumC30025d;
import q73.InterfaceC30023b;

/* JADX INFO: renamed from: y73.j */
/* JADX INFO: loaded from: classes5.dex */
public class C39298j extends AbstractC23415f {

    /* JADX INFO: renamed from: w */
    public final ScheduledExecutorService f169081w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f169082x;

    public C39298j(ThreadFactory threadFactory) {
        boolean z4 = AbstractC39302n.f169095a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (AbstractC39302n.f169095a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            AbstractC39302n.f169098d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f169081w = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // l73.AbstractC23415f
    /* JADX INFO: renamed from: a */
    public final InterfaceC26443b mo67906a(Runnable runnable, long j7, TimeUnit timeUnit) {
        return this.f169082x ? EnumC30025d.f122538w : m125268c(runnable, j7, timeUnit, null);
    }

    @Override // l73.AbstractC23415f
    /* JADX INFO: renamed from: b */
    public final void mo67907b(Runnable runnable) {
        mo67906a(runnable, 0L, null);
    }

    /* JADX INFO: renamed from: c */
    public final RunnableC39301m m125268c(Runnable runnable, long j7, TimeUnit timeUnit, InterfaceC30023b interfaceC30023b) {
        RunnableC39301m runnableC39301m = new RunnableC39301m(runnable, interfaceC30023b);
        if (interfaceC30023b != null && !interfaceC30023b.mo78293a(runnableC39301m)) {
            return runnableC39301m;
        }
        ScheduledExecutorService scheduledExecutorService = this.f169081w;
        try {
            runnableC39301m.m125270a(j7 <= 0 ? scheduledExecutorService.submit((Callable) runnableC39301m) : scheduledExecutorService.schedule((Callable) runnableC39301m, j7, timeUnit));
            return runnableC39301m;
        } catch (RejectedExecutionException e5) {
            if (interfaceC30023b != null) {
                interfaceC30023b.mo78295c(runnableC39301m);
            }
            AbstractC21598x.m60677d0(e5);
            return runnableC39301m;
        }
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f169082x) {
            return;
        }
        this.f169082x = true;
        this.f169081w.shutdownNow();
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f169082x;
    }
}
