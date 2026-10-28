package eh3;

import bh3.InterfaceC3254a;
import com.google.android.gms.common.api.RunnableC4983n;
import d13.AbstractC11478a;
import gh3.AbstractC15861f;
import gh3.ThreadFactoryC15864i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import jh3.AbstractC21700a;
import jh3.C21705f;
import mh3.AbstractC25568e;
import xg3.AbstractC38283j;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: eh3.k */
/* JADX INFO: loaded from: classes5.dex */
public class C13207k extends AbstractC38283j {

    /* JADX INFO: renamed from: G */
    public static volatile Object f45773G;

    /* JADX INFO: renamed from: y */
    public static final boolean f45775y;

    /* JADX INFO: renamed from: w */
    public final ScheduledExecutorService f45777w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f45778x;

    /* JADX INFO: renamed from: H */
    public static final Object f45774H = new Object();

    /* JADX INFO: renamed from: E */
    public static final ConcurrentHashMap f45771E = new ConcurrentHashMap();

    /* JADX INFO: renamed from: F */
    public static final AtomicReference f45772F = new AtomicReference();

    /* JADX INFO: renamed from: z */
    public static final int f45776z = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    static {
        boolean z4 = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int i13 = AbstractC15861f.f59959a;
        f45775y = !z4 && (i13 == 0 || i13 >= 21);
    }

    public C13207k(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m37110g(scheduledExecutorServiceNewScheduledThreadPool) && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool;
            while (true) {
                AtomicReference atomicReference = f45772F;
                if (((ScheduledExecutorService) atomicReference.get()) != null) {
                    break;
                }
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool2 = Executors.newScheduledThreadPool(1, new ThreadFactoryC15864i("RxSchedulerPurge-"));
                if (AbstractC11478a.m30873y(atomicReference, scheduledExecutorServiceNewScheduledThreadPool2)) {
                    RunnableC4983n runnableC4983n = new RunnableC4983n(1);
                    long j7 = f45776z;
                    scheduledExecutorServiceNewScheduledThreadPool2.scheduleAtFixedRate(runnableC4983n, j7, j7, TimeUnit.MILLISECONDS);
                    break;
                }
                scheduledExecutorServiceNewScheduledThreadPool2.shutdownNow();
            }
            f45771E.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
        }
        this.f45777w = scheduledExecutorServiceNewScheduledThreadPool;
    }

    /* JADX INFO: renamed from: e */
    public static Method m37109e(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m37110g(ScheduledExecutorService scheduledExecutorService) {
        Method methodM37109e;
        if (f45775y) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f45773G;
                Object obj2 = f45774H;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    methodM37109e = m37109e(scheduledExecutorService);
                    if (methodM37109e != null) {
                        obj2 = methodM37109e;
                    }
                    f45773G = obj2;
                } else {
                    methodM37109e = (Method) obj;
                }
            } else {
                methodM37109e = m37109e(scheduledExecutorService);
            }
            if (methodM37109e != null) {
                try {
                    methodM37109e.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e5) {
                    AbstractC21700a.m61126a(e5);
                } catch (IllegalArgumentException e13) {
                    AbstractC21700a.m61126a(e13);
                } catch (InvocationTargetException e14) {
                    AbstractC21700a.m61126a(e14);
                }
            }
        }
        return false;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f45778x;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        this.f45778x = true;
        this.f45777w.shutdownNow();
        f45771E.remove(this.f45777w);
    }

    @Override // xg3.AbstractC38283j
    /* JADX INFO: renamed from: c */
    public final InterfaceC38293t mo37106c(InterfaceC3254a interfaceC3254a) {
        return mo37107d(interfaceC3254a, 0L, null);
    }

    @Override // xg3.AbstractC38283j
    /* JADX INFO: renamed from: d */
    public final InterfaceC38293t mo37107d(InterfaceC3254a interfaceC3254a, long j7, TimeUnit timeUnit) {
        return this.f45778x ? AbstractC25568e.f100262a : m37111f(interfaceC3254a, j7, timeUnit);
    }

    /* JADX INFO: renamed from: f */
    public final RunnableC13212p m37111f(InterfaceC3254a interfaceC3254a, long j7, TimeUnit timeUnit) {
        C21705f.f83334f.m61160e().getClass();
        RunnableC13212p runnableC13212p = new RunnableC13212p(interfaceC3254a);
        ScheduledExecutorService scheduledExecutorService = this.f45777w;
        runnableC13212p.m37113c(j7 <= 0 ? scheduledExecutorService.submit(runnableC13212p) : scheduledExecutorService.schedule(runnableC13212p, j7, timeUnit));
        return runnableC13212p;
    }
}
