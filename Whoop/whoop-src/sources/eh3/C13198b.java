package eh3;

import androidx.databinding.RunnableC1189s;
import gh3.ThreadFactoryC15864i;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import mh3.C25566c;

/* JADX INFO: renamed from: eh3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C13198b {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f45742a;

    /* JADX INFO: renamed from: b */
    public final long f45743b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentLinkedQueue f45744c;

    /* JADX INFO: renamed from: d */
    public final C25566c f45745d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f45746e;

    /* JADX INFO: renamed from: f */
    public final ScheduledFuture f45747f;

    public C13198b(ThreadFactoryC15864i threadFactoryC15864i, long j7, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        this.f45742a = threadFactoryC15864i;
        long nanos = timeUnit != null ? timeUnit.toNanos(j7) : 0L;
        this.f45743b = nanos;
        this.f45744c = new ConcurrentLinkedQueue();
        this.f45745d = new C25566c();
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC13197a(threadFactoryC15864i));
            C13207k.m37110g(scheduledExecutorServiceNewScheduledThreadPool);
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC1189s(this, 3), nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        this.f45746e = scheduledExecutorServiceNewScheduledThreadPool;
        this.f45747f = scheduledFutureScheduleWithFixedDelay;
    }

    /* JADX INFO: renamed from: a */
    public final void m37105a() {
        C25566c c25566c = this.f45745d;
        try {
            ScheduledFuture scheduledFuture = this.f45747f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f45746e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        } finally {
            c25566c.mo14750b();
        }
    }
}
