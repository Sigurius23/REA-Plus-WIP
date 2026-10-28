package y73;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l73.AbstractC23415f;
import l73.AbstractC23416g;

/* JADX INFO: renamed from: y73.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C39296h extends AbstractC23416g {

    /* JADX INFO: renamed from: b */
    public static final ThreadFactoryC39299k f169071b;

    /* JADX INFO: renamed from: c */
    public static final ThreadFactoryC39299k f169072c;

    /* JADX INFO: renamed from: f */
    public static final C39295g f169075f;

    /* JADX INFO: renamed from: g */
    public static final boolean f169076g;

    /* JADX INFO: renamed from: h */
    public static final RunnableC39293e f169077h;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f169078a;

    /* JADX INFO: renamed from: e */
    public static final TimeUnit f169074e = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: d */
    public static final long f169073d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        C39295g c39295g = new C39295g(new ThreadFactoryC39299k("RxCachedThreadSchedulerShutdown"));
        f169075f = c39295g;
        c39295g.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        ThreadFactoryC39299k threadFactoryC39299k = new ThreadFactoryC39299k("RxCachedThreadScheduler", iMax, false);
        f169071b = threadFactoryC39299k;
        f169072c = new ThreadFactoryC39299k("RxCachedWorkerPoolEvictor", iMax, false);
        f169076g = Boolean.getBoolean("rx2.io-scheduled-release");
        RunnableC39293e runnableC39293e = new RunnableC39293e(0L, null, threadFactoryC39299k);
        f169077h = runnableC39293e;
        runnableC39293e.f169064y.dispose();
        ScheduledFuture scheduledFuture = runnableC39293e.f169060E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = runnableC39293e.f169065z;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C39296h() {
        RunnableC39293e runnableC39293e = f169077h;
        AtomicReference atomicReference = new AtomicReference(runnableC39293e);
        this.f169078a = atomicReference;
        RunnableC39293e runnableC39293e2 = new RunnableC39293e(f169073d, f169074e, f169071b);
        while (!atomicReference.compareAndSet(runnableC39293e, runnableC39293e2)) {
            if (atomicReference.get() != runnableC39293e) {
                runnableC39293e2.f169064y.dispose();
                ScheduledFuture scheduledFuture = runnableC39293e2.f169060E;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = runnableC39293e2.f169065z;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // l73.AbstractC23416g
    /* JADX INFO: renamed from: a */
    public final AbstractC23415f mo67908a() {
        return new RunnableC39294f((RunnableC39293e) this.f169078a.get());
    }
}
