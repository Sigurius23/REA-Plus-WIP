package y73;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import n73.C26442a;

/* JADX INFO: renamed from: y73.e */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC39293e implements Runnable {

    /* JADX INFO: renamed from: E */
    public final ScheduledFuture f169060E;

    /* JADX INFO: renamed from: F */
    public final ThreadFactory f169061F;

    /* JADX INFO: renamed from: w */
    public final long f169062w;

    /* JADX INFO: renamed from: x */
    public final ConcurrentLinkedQueue f169063x;

    /* JADX INFO: renamed from: y */
    public final C26442a f169064y;

    /* JADX INFO: renamed from: z */
    public final ScheduledExecutorService f169065z;

    public RunnableC39293e(long j7, TimeUnit timeUnit, ThreadFactory threadFactory) {
        RunnableC39293e runnableC39293e;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j7) : 0L;
        this.f169062w = nanos;
        this.f169063x = new ConcurrentLinkedQueue();
        this.f169064y = new C26442a();
        this.f169061F = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, C39296h.f169072c);
            runnableC39293e = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(runnableC39293e, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            runnableC39293e = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        runnableC39293e.f169065z = scheduledExecutorServiceNewScheduledThreadPool;
        runnableC39293e.f169060E = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<C39295g> concurrentLinkedQueue = this.f169063x;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (C39295g c39295g : concurrentLinkedQueue) {
            if (c39295g.f169070y > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(c39295g)) {
                this.f169064y.mo78295c(c39295g);
            }
        }
    }
}
