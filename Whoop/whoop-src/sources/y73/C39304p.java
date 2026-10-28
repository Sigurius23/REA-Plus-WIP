package y73;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l73.AbstractC23415f;
import l73.AbstractC23416g;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.EnumC30025d;
import u73.RunnableC34579a;

/* JADX INFO: renamed from: y73.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C39304p extends AbstractC23416g {

    /* JADX INFO: renamed from: b */
    public static final ThreadFactoryC39299k f169102b;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f169103a;

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f169102b = new ThreadFactoryC39299k("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C39304p() {
        AtomicReference atomicReference = new AtomicReference();
        this.f169103a = atomicReference;
        boolean z4 = AbstractC39302n.f169095a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f169102b);
        if (AbstractC39302n.f169095a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            AbstractC39302n.f169098d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // l73.AbstractC23416g
    /* JADX INFO: renamed from: a */
    public final AbstractC23415f mo67908a() {
        return new C39303o((ScheduledExecutorService) this.f169103a.get());
    }

    @Override // l73.AbstractC23416g
    /* JADX INFO: renamed from: b */
    public final InterfaceC26443b mo67909b(RunnableC34579a runnableC34579a) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AtomicReference atomicReference = this.f169103a;
        CallableC39300l callableC39300l = new CallableC39300l(runnableC34579a);
        try {
            callableC39300l.m125269a(((ScheduledExecutorService) atomicReference.get()).schedule(callableC39300l, 5L, timeUnit));
            return callableC39300l;
        } catch (RejectedExecutionException e5) {
            AbstractC21598x.m60677d0(e5);
            return EnumC30025d.f122538w;
        }
    }
}
