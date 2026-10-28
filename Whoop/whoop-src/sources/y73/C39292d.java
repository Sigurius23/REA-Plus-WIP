package y73;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l73.AbstractC23415f;
import l73.AbstractC23416g;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.EnumC30025d;
import u73.RunnableC34579a;

/* JADX INFO: renamed from: y73.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C39292d extends AbstractC23416g {

    /* JADX INFO: renamed from: b */
    public static final C39290b f169055b;

    /* JADX INFO: renamed from: c */
    public static final ThreadFactoryC39299k f169056c;

    /* JADX INFO: renamed from: d */
    public static final int f169057d;

    /* JADX INFO: renamed from: e */
    public static final C39291c f169058e;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f169059a;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f169057d = iAvailableProcessors;
        C39291c c39291c = new C39291c(new ThreadFactoryC39299k("RxComputationShutdown"));
        f169058e = c39291c;
        c39291c.dispose();
        ThreadFactoryC39299k threadFactoryC39299k = new ThreadFactoryC39299k("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f169056c = threadFactoryC39299k;
        C39290b c39290b = new C39290b(0, threadFactoryC39299k);
        f169055b = c39290b;
        for (C39291c c39291c2 : c39290b.f169053b) {
            c39291c2.dispose();
        }
    }

    public C39292d() {
        C39290b c39290b = f169055b;
        AtomicReference atomicReference = new AtomicReference(c39290b);
        this.f169059a = atomicReference;
        C39290b c39290b2 = new C39290b(f169057d, f169056c);
        while (!atomicReference.compareAndSet(c39290b, c39290b2)) {
            if (atomicReference.get() != c39290b) {
                C39291c[] c39291cArr = c39290b2.f169053b;
                for (C39291c c39291c : c39291cArr) {
                    c39291c.dispose();
                }
                return;
            }
        }
    }

    @Override // l73.AbstractC23416g
    /* JADX INFO: renamed from: a */
    public final AbstractC23415f mo67908a() {
        C39291c c39291c;
        C39290b c39290b = (C39290b) this.f169059a.get();
        int i13 = c39290b.f169052a;
        if (i13 == 0) {
            c39291c = f169058e;
        } else {
            C39291c[] c39291cArr = c39290b.f169053b;
            long j7 = c39290b.f169054c;
            c39290b.f169054c = 1 + j7;
            c39291c = c39291cArr[(int) (j7 % ((long) i13))];
        }
        return new C39289a(c39291c);
    }

    @Override // l73.AbstractC23416g
    /* JADX INFO: renamed from: b */
    public final InterfaceC26443b mo67909b(RunnableC34579a runnableC34579a) {
        C39291c c39291c;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C39290b c39290b = (C39290b) this.f169059a.get();
        int i13 = c39290b.f169052a;
        if (i13 == 0) {
            c39291c = f169058e;
        } else {
            C39291c[] c39291cArr = c39290b.f169053b;
            long j7 = c39290b.f169054c;
            c39290b.f169054c = 1 + j7;
            c39291c = c39291cArr[(int) (j7 % ((long) i13))];
        }
        ScheduledExecutorService scheduledExecutorService = c39291c.f169081w;
        CallableC39300l callableC39300l = new CallableC39300l(runnableC34579a);
        try {
            callableC39300l.m125269a(scheduledExecutorService.schedule(callableC39300l, 5L, timeUnit));
            return callableC39300l;
        } catch (RejectedExecutionException e5) {
            AbstractC21598x.m60677d0(e5);
            return EnumC30025d.f122538w;
        }
    }
}
