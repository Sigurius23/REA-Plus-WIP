package y73;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import live.hms.video.factories.MediaConstraintsFactory;
import p185h6.RunnableC16959n;

/* JADX INFO: renamed from: y73.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39302n {

    /* JADX INFO: renamed from: a */
    public static final boolean f169095a;

    /* JADX INFO: renamed from: b */
    public static final int f169096b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f169097c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f169098d = new ConcurrentHashMap();

    static {
        boolean zEquals;
        int i13;
        try {
            String property = System.getProperty("rx2.purge-enabled");
            zEquals = property == null ? true : MediaConstraintsFactory.kValueTrue.equals(property);
        } catch (Throwable unused) {
        }
        f169095a = zEquals;
        if (zEquals) {
            try {
                String property2 = System.getProperty("rx2.purge-period-seconds");
                i13 = property2 == null ? 1 : Integer.parseInt(property2);
            } catch (Throwable unused2) {
            }
        }
        f169096b = i13;
        if (!f169095a) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f169097c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC39299k("RxSchedulerPurge"));
            do {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    RunnableC16959n runnableC16959n = new RunnableC16959n(2);
                    long j7 = f169096b;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnableC16959n, j7, j7, TimeUnit.SECONDS);
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorService);
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
